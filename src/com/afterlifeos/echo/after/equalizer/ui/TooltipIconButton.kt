/*
 * Copyright (C) 2024 Paranoid Android
 * Copyright (C) 2024 The AfterlifeOS Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.afterlifeos.echo.after.equalizer.ui

import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.PlainTooltipBox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TooltipIconButton(
    icon: ImageVector,
    text: String,
    onClick: () -> Unit
) {
    PlainTooltipBox(
        tooltip = { Text(text) }
    ) {
        IconButton(
            onClick = onClick
        ) {
            Icon(
                imageVector = icon,
                contentDescription = text,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}