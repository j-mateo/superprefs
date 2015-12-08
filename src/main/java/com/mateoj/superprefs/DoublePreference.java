package com.mateoj.superprefs;

import android.content.SharedPreferences;

/**
 * Double preference
 */
public class DoublePreference extends AbstractPreference<Double>{

    public DoublePreference(SharedPreferences preferences, String key) {
        this(preferences, key, 0);
    }

    public DoublePreference(SharedPreferences preferences, String key, double defaultValue) {
        super(preferences, key, defaultValue);
    }

    @Override
    public Double get() {
        return Double.longBitsToDouble(
                preferences.getLong(key, Double.doubleToLongBits(defaultValue)));
    }

    @Override
    public void set(Double value) {
        preferences.edit().putLong(key, Double.doubleToLongBits(value)).apply();

    }
}
