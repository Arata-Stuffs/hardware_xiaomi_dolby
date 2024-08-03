/*
 * Copyright (C) 2024 Paranoid Android
 * Copyright (C) 2024 The AfterlifeOS Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.afterlifeos.echo.after.equalizer.data

data class BandGain(
    val band: Int,
    var gain: Int = 0
)
