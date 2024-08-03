/*
 * Copyright (C) 2024 Paranoid Android
 * Copyright (C) 2024 The AfterlifeOS Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.afterlifeos.echo.after.equalizer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.rememberNavController
import com.afterlifeos.echo.after.R
import com.afterlifeos.echo.after.equalizer.ui.EqualizerScreen
import com.afterlifeos.echo.after.equalizer.ui.EqualizerViewModel
import com.android.settingslib.afterlife.framework.compose.localNavController
import com.android.settingslib.afterlife.framework.theme.SettingsTheme
import com.android.settingslib.afterlife.widget.scaffold.SettingsScaffold

class EqualizerActivity : ComponentActivity() {

    private val viewModel: EqualizerViewModel by viewModels { EqualizerViewModel.Factory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SettingsTheme {
                MainContent()
            }
        }
    }

    @Composable
    private fun MainContent() {
        val navController = rememberNavController()
        CompositionLocalProvider(navController.localNavController()) {
            SettingsScaffold(
                title = stringResource(id = R.string.dolby_preset)
            ) { paddingValues ->
                EqualizerScreen(
                    viewModel = viewModel,
                    modifier = Modifier.padding(paddingValues)
                )
            }
        }
    }
}
