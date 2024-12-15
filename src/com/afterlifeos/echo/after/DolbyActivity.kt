/*
 * Copyright (C) 2023-24 Paranoid Android
 * Copyright (C) 2024 The AfterlifeOS Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package com.afterlifeos.echo.after

import android.os.Bundle
import com.android.settingslib.collapsingtoolbar.CollapsingToolbarBaseActivity
import com.android.settingslib.widget.R

private const val TAG = "DolbyActivity"

class DolbyActivity : CollapsingToolbarBaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fragmentManager.beginTransaction()
                .replace(R.id.content_frame, DolbySettingsFragment(), TAG)
                .commit()
    }
}
