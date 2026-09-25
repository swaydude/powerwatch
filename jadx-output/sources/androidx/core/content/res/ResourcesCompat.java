package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public final class ResourcesCompat {
    private static final java.lang.String TAG = "ResourcesCompat";

    public static android.graphics.drawable.Drawable getDrawable(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) throws android.content.res.Resources.NotFoundException {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    public static android.graphics.drawable.Drawable getDrawableForDensity(android.content.res.Resources resources, int i, int i2, android.content.res.Resources.Theme theme) throws android.content.res.Resources.NotFoundException {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
        if (android.os.Build.VERSION.SDK_INT >= 15) {
            return resources.getDrawableForDensity(i, i2);
        }
        return resources.getDrawable(i);
    }

    public static int getColor(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) throws android.content.res.Resources.NotFoundException {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i, theme);
        }
        return resources.getColor(i);
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) throws android.content.res.Resources.NotFoundException {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i, theme);
        }
        return resources.getColorStateList(i);
    }

    public static float getFloat(android.content.res.Resources resources, int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        resources.getValue(i, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new android.content.res.Resources.NotFoundException("Resource ID #0x" + java.lang.Integer.toHexString(i) + " type #0x" + java.lang.Integer.toHexString(typedValue.type) + " is not valid");
    }

    public static android.graphics.Typeface getFont(android.content.Context context, int i) throws android.content.res.Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, new android.util.TypedValue(), 0, null, null, false);
    }

    public static abstract class FontCallback {
        public abstract void onFontRetrievalFailed(int i);

        public abstract void onFontRetrieved(android.graphics.Typeface typeface);

        public final void callbackSuccessAsync(final android.graphics.Typeface typeface, android.os.Handler handler) {
            if (handler == null) {
                handler = new android.os.Handler(android.os.Looper.getMainLooper());
            }
            handler.post(new java.lang.Runnable() { // from class: androidx.core.content.res.ResourcesCompat.FontCallback.1
                @Override // java.lang.Runnable
                public void run() {
                    androidx.core.content.res.ResourcesCompat.FontCallback.this.onFontRetrieved(typeface);
                }
            });
        }

        public final void callbackFailAsync(final int i, android.os.Handler handler) {
            if (handler == null) {
                handler = new android.os.Handler(android.os.Looper.getMainLooper());
            }
            handler.post(new java.lang.Runnable() { // from class: androidx.core.content.res.ResourcesCompat.FontCallback.2
                @Override // java.lang.Runnable
                public void run() {
                    androidx.core.content.res.ResourcesCompat.FontCallback.this.onFontRetrievalFailed(i);
                }
            });
        }
    }

    public static void getFont(android.content.Context context, int i, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback, android.os.Handler handler) throws android.content.res.Resources.NotFoundException {
        androidx.core.util.Preconditions.checkNotNull(fontCallback);
        if (context.isRestricted()) {
            fontCallback.callbackFailAsync(-4, handler);
        } else {
            loadFont(context, i, new android.util.TypedValue(), 0, fontCallback, handler, false);
        }
    }

    public static android.graphics.Typeface getFont(android.content.Context context, int i, android.util.TypedValue typedValue, int i2, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback) throws android.content.res.Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, typedValue, i2, fontCallback, null, true);
    }

    private static android.graphics.Typeface loadFont(android.content.Context context, int i, android.util.TypedValue typedValue, int i2, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback, android.os.Handler handler, boolean z) {
        android.content.res.Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        android.graphics.Typeface typefaceLoadFont = loadFont(context, resources, typedValue, i, i2, fontCallback, handler, z);
        if (typefaceLoadFont != null || fontCallback != null) {
            return typefaceLoadFont;
        }
        throw new android.content.res.Resources.NotFoundException("Font resource ID #0x" + java.lang.Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    private static android.graphics.Typeface loadFont(android.content.Context context, android.content.res.Resources resources, android.util.TypedValue typedValue, int i, int i2, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback, android.os.Handler handler, boolean z) {
        if (typedValue.string == null) {
            throw new android.content.res.Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + java.lang.Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        java.lang.String string = typedValue.string.toString();
        if (!string.startsWith("res/")) {
            if (fontCallback != null) {
                fontCallback.callbackFailAsync(-3, handler);
            }
            return null;
        }
        android.graphics.Typeface typefaceFindFromCache = androidx.core.graphics.TypefaceCompat.findFromCache(resources, i, i2);
        if (typefaceFindFromCache != null) {
            if (fontCallback != null) {
                fontCallback.callbackSuccessAsync(typefaceFindFromCache, handler);
            }
            return typefaceFindFromCache;
        }
        try {
            if (string.toLowerCase().endsWith(".xml")) {
                androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry = androidx.core.content.res.FontResourcesParserCompat.parse(resources.getXml(i), resources);
                if (familyResourceEntry == null) {
                    android.util.Log.e(TAG, "Failed to find font-family tag");
                    if (fontCallback != null) {
                        fontCallback.callbackFailAsync(-3, handler);
                    }
                    return null;
                }
                return androidx.core.graphics.TypefaceCompat.createFromResourcesFamilyXml(context, familyResourceEntry, resources, i, i2, fontCallback, handler, z);
            }
            android.graphics.Typeface typefaceCreateFromResourcesFontFile = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(context, resources, i, string, i2);
            if (fontCallback != null) {
                if (typefaceCreateFromResourcesFontFile != null) {
                    fontCallback.callbackSuccessAsync(typefaceCreateFromResourcesFontFile, handler);
                } else {
                    fontCallback.callbackFailAsync(-3, handler);
                }
            }
            return typefaceCreateFromResourcesFontFile;
        } catch (java.io.IOException e) {
            android.util.Log.e(TAG, "Failed to read xml resource " + string, e);
            if (fontCallback != null) {
                fontCallback.callbackFailAsync(-3, handler);
            }
            return null;
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            android.util.Log.e(TAG, "Failed to parse xml resource " + string, e2);
            if (fontCallback != null) {
                fontCallback.callbackFailAsync(-3, handler);
            }
            return null;
        }
    }

    private ResourcesCompat() {
    }
}
