/*
 * Copyright (C) 2023-24 Paranoid Android
 * Copyright (C) 2024 The AfterlifeOS Project
 * Copyright (C) 2024 Arata-Stuffs Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package com.xiaomi.dolby.atmos

import android.os.Bundle
import com.xiaomi.dolby.atmos.preference.DolbySettingsFragment
import com.android.settingslib.collapsingtoolbar.CollapsingToolbarBaseActivity

private const val TAG = "DolbyActivity"

class DolbyActivity : CollapsingToolbarBaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fragmentManager.beginTransaction()
            .replace(com.android.settingslib.collapsingtoolbar.R.id.content_frame, DolbySettingsFragment(), TAG)
            .commit()
    }
}
