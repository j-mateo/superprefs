package com.mateoj.superprefs;

import android.content.SharedPreferences;

/**
 * Boolean Preference
 */
public class BooleanPreference extends AbstractPreference<Boolean> {

    public BooleanPreference(SharedPreferences preferences, String key) {
        this(preferences, key, false);
    }
    public BooleanPreference(SharedPreferences preferences, String key, boolean defaultValue) {
        super(preferences, key, defaultValue);
    }

    @Override
    public Boolean get() {
        return preferences.getBoolean(key, defaultValue);
    }

    @Override
    public void set(Boolean value) {
        preferences.edit().putBoolean(key, value).apply();

    }
}
