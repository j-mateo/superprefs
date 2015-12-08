package com.mateoj.superprefs;

import android.content.SharedPreferences;

import java.util.Date;

/**
 * Date preference
 */
public class DatePreference extends AbstractPreference<Date> {

    public DatePreference(SharedPreferences preferences, String key) {
        this(preferences, key, new Date());
    }

    public DatePreference(SharedPreferences preferences, String key, Date defaultValue) {
        super(preferences, key, defaultValue);
    }

    @Override
    public Date get() {
        return new Date(preferences.getLong(key, defaultValue.getTime()));
    }

    public void set(Date value) {
        preferences.edit().putLong(key, value.getTime()).apply();
    }
}
