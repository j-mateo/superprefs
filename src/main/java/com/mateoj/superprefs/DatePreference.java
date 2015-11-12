package com.mateoj.superprefs;

import android.content.SharedPreferences;

import java.util.Date;

/**
 * Created by jose on 5/29/15.
 */
public class DatePreference {
    private final SharedPreferences preferences;
    private final String key;
    private final Date defaultValue;

    public DatePreference(SharedPreferences preferences, String key) {
        this(preferences, key, new Date());
    }

    public DatePreference(SharedPreferences preferences, String key, Date defaultValue) {
        this.preferences = preferences;
        this.key = key;
        this.defaultValue = defaultValue;
    }

    public Date get() {
        return new Date(preferences.getLong(key, defaultValue.getTime()));
    }

    public boolean isSet() {
        return preferences.contains(key);
    }

    public void set(Date value) {
        preferences.edit().putLong(key, value.getTime()).apply();
    }

    public void delete() {
        preferences.edit().remove(key).apply();
    }
}
