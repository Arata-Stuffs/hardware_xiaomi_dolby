/*
 * Copyright (C) 2024 Paranoid Android
 * Copyright (C) 2024 The AfterlifeOS Project
 * Copyright (C) 2024 Arata-Stuffs Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.xiaomi.dolby.atmos.equalizer.ui

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.stringResource

@Composable
fun ConfirmationDialog(
    text: String,
    onConfirm: () -> Unit,
    onDismiss: () -> Unit
) {
    var showDialog by remember { mutableStateOf(true) }
    if (!showDialog) {
        onDismiss()
        return
    }

    AlertDialog(
        onDismissRequest = { showDialog = false },
        confirmButton = {
            TextButton(
                onClick = {
                    showDialog = false
                    onConfirm()
                }
            ) {
                Text(
                    stringResource(id = android.R.string.ok)
                )
            }
        },
        dismissButton = {
            TextButton(
                onClick = { showDialog = false }
            ) {
                Text(
                    stringResource(id = android.R.string.cancel)
                )
            }
        },
        text = {
            Text(text)
        }
    )
}
