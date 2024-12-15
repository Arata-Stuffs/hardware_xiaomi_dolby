/*
 * Copyright (C) 2024 Paranoid Android
 * Copyright (C) 2024 The AfterlifeOS Project
 * Copyright (C) 2024 Arata-Stuffs Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.xiaomi.dolby.atmos.equalizer.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun EqualizerBands(viewModel: EqualizerViewModel) {
    val preset by viewModel.preset.collectAsState()
    val bandGains = preset.bandGains

    LazyRow(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        item {
            BandGainSliderLabels()
        }
        items(bandGains.size) { index ->
            BandGainSlider(
                bandGains[index],
                onValueChangeFinished = {
                    viewModel.setGain(index, it)
                }
            )
        }
    }
}