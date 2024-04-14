/*
 * Copyright (C) 2024 AfterlifeOS Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.afterlifeos.dolby.afterlife;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootCompletedReceiver extends BroadcastReceiver {

    private static final String TAG = "XiaomiParts-BCR";

    @Override
    public void onReceive(final Context context, Intent intent) {
        Log.d(TAG, "Received intent: " + intent.getAction());
        if (!intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            return;
        }

        Log.i(TAG, "Boot completed, starting dolby");
        DolbyUtils.getInstance(context).onBootCompleted();
    }

}
