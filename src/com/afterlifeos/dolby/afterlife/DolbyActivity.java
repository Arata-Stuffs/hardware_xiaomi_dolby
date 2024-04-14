/*
 * Copyright (C) 2024 AfterlifeOS Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.afterlifeos.dolby.afterlife;

import android.os.Bundle;

import com.android.settingslib.collapsingtoolbar.CollapsingToolbarBaseActivity;
import com.android.settingslib.widget.R;

public class DolbyActivity extends CollapsingToolbarBaseActivity {

    private static final String TAG_DOLBY = "DolbyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction().replace(R.id.content_frame,
                new DolbySettingsFragment(), TAG_DOLBY).commit();
    }
}
