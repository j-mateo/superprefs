package com.mateoj.superprefs;

import android.content.SharedPreferences;

/**
 * Abstract class from which all preference types are derived
 */
public abstract class AbstractPreference<T> {
    protected final SharedPreferences preferences;
    protected final String key;
    protected final T defaultValue;

    public AbstractPreference(SharedPreferences preferences, String key, T defaultValue) {
        this.preferences = preferences;
        this.key = key;
        this.defaultValue = defaultValue;
    }

    public abstract T get();

    public abstract void set(T value);

    public boolean isSet() {
        return preferences.contains(key);
    }

    public void delete() {
        preferences.edit().remove(key).apply();
    }
}
