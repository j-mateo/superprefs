package com.mateoj.superprefs;

import android.content.SharedPreferences;

/**
 * Created by jose on 5/29/15.
 */
public class DoublePreference {
    private final SharedPreferences preferences;
    private final String key;
    private final double defaultValue;

    public DoublePreference(SharedPreferences preferences, String key) {
        this(preferences, key, 0);
    }
    public DoublePreference(SharedPreferences preferences, String key, double defaultValue) {
        this.preferences = preferences;
        this.key = key;
        this.defaultValue = defaultValue;
    }

    public double get() {
        return Double.longBitsToDouble(
                preferences.getLong(key, Double.doubleToLongBits(defaultValue)));
    }

    public boolean isSet() {
        return preferences.contains(key);
    }

    public void set(double value) {
        preferences.edit().putLong(key, Double.doubleToLongBits(value)).apply();
    }

    public void delete() {
        preferences.edit().remove(key).apply();
    }
}
