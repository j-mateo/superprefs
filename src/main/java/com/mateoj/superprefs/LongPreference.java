package com.mateoj.superprefs;

import android.content.SharedPreferences;

/**
 * Long Preference
 */
public class LongPreference extends AbstractPreference<Long>{

    public LongPreference(SharedPreferences preferences, String key) {
        this(preferences, key, 0);
    }

    public LongPreference(SharedPreferences preferences, String key, long defaultValue) {
        super(preferences, key, defaultValue);
    }

    @Override
    public Long get() {
        return preferences.getLong(key, defaultValue);
    }

    @Override
    public void set(Long value) {
        preferences.edit().putLong(key, value).apply();
    }
}
