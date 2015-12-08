package com.mateoj.superprefs;

import android.content.SharedPreferences;

/**
 * Integer preference
 */
public class IntPreference extends AbstractPreference<Integer> {

    public IntPreference(SharedPreferences preferences, String key) {
        this(preferences, key, 0);
    }

    public IntPreference(SharedPreferences preferences, String key, int defaultValue) {
        super(preferences, key, defaultValue);
    }

    @Override
    public Integer get() {
        return preferences.getInt(key, defaultValue);
    }

    @Override
    public void set(Integer value) {
        preferences.edit().putInt(key, value).apply();
    }

}
