/*
 * Copyright (C) 2023-24 Paranoid Android
 * Copyright (C) 2024 AfterlifeOS Project
 * Copyright (C) 2024 Arata-Stuffs Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package com.xiaomi.dolby.atmos

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

private const val TAG = "AfterEcho-Boot"

class BootCompletedReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Log.d(TAG, "Received intent: ${intent.action}")
        if (intent.action != Intent.ACTION_BOOT_COMPLETED) {
            return
        }

        Log.i(TAG, "Boot completed, starting dolby")
        DolbyController.getInstance(context).onBootCompleted()
    }
}
