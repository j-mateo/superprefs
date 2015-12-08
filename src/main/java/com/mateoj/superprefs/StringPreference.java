package com.mateoj.superprefs;

import android.content.SharedPreferences;

/**
 * A string preference
 */
public class StringPreference extends AbstractPreference<String> {

    public StringPreference(SharedPreferences preferences, String key)
    {
        this(preferences, key, "");
    }

    public StringPreference(SharedPreferences preferences, String key, String defaultValue) {
        super(preferences, key, defaultValue);
    }

    @Override
    public String get() {
        return preferences.getString(key, defaultValue);
    }

    @Override
    public void set(String value) {
        preferences.edit().putString(key, value).apply();
    }

}
