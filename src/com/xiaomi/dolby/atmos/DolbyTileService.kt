/*
 * Copyright (C) 2023-24 Paranoid Android
 * Copyright (C) 2024 The AfterlifeOS Project
 * Copyright (C) 2024 Arata-Stuffs Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.xiaomi.dolby.atmos

import android.service.quicksettings.Tile
import android.service.quicksettings.TileService

private const val TAG = "DolbyTileService"

class DolbyTileService : TileService() {

    private val dolbyController by lazy { DolbyController.getInstance(applicationContext) }

    override fun onStartListening() {
        qsTile.apply {
            state = if (dolbyController.dsOn) Tile.STATE_ACTIVE else Tile.STATE_INACTIVE
            subtitle = dolbyController.getProfileName() ?: getString(R.string.dolby_unknown)
            updateTile()
        }
        super.onStartListening()
    }

    override fun onClick() {
        val isDsOn = dolbyController.dsOn
        dolbyController.dsOn = !isDsOn
        qsTile.apply {
            state = if (isDsOn) Tile.STATE_INACTIVE else Tile.STATE_ACTIVE
            updateTile()
        }
        super.onClick()
    }
}