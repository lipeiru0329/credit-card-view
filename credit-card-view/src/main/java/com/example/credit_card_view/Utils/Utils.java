package com.example.credit_card_view.Utils;

import android.graphics.drawable.Drawable;

import androidx.core.graphics.drawable.DrawableCompat;

public class Utils {
    public static final char SPACE = 32;

    /**
     * Tints a drawable resource with the given color
     * @param resource
     * @param color
     */
    public static void tintDrawable(Drawable resource, int color) {
        DrawableCompat.setTint(resource,color);
    }
}
