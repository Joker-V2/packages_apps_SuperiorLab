/*
 * SPDX-FileCopyrightText: The SuperiorOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.superior.lab.fragments;

import android.os.Bundle;
import com.android.settings.SettingsPreferenceFragment;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import com.android.settings.R;

import com.android.internal.logging.nano.MetricsProto.MetricsEvent;

public class SuperiorTeam extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.superior_lab_team);
    }

    @Override
    public int getMetricsCategory() {
        return MetricsEvent.SUPERIOR;
    }
}
