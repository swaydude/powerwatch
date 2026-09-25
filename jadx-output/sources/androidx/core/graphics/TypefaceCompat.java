package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public class TypefaceCompat {
    private static final androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> sTypefaceCache;
    private static final androidx.core.graphics.TypefaceCompatBaseImpl sTypefaceCompatImpl;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            sTypefaceCompatImpl = new androidx.core.graphics.TypefaceCompatApi28Impl();
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            sTypefaceCompatImpl = new androidx.core.graphics.TypefaceCompatApi26Impl();
        } else if (android.os.Build.VERSION.SDK_INT >= 24 && androidx.core.graphics.TypefaceCompatApi24Impl.isUsable()) {
            sTypefaceCompatImpl = new androidx.core.graphics.TypefaceCompatApi24Impl();
        } else if (android.os.Build.VERSION.SDK_INT >= 21) {
            sTypefaceCompatImpl = new androidx.core.graphics.TypefaceCompatApi21Impl();
        } else {
            sTypefaceCompatImpl = new androidx.core.graphics.TypefaceCompatBaseImpl();
        }
        sTypefaceCache = new androidx.collection.LruCache<>(16);
    }

    private TypefaceCompat() {
    }

    public static android.graphics.Typeface findFromCache(android.content.res.Resources resources, int i, int i2) {
        return sTypefaceCache.get(createResourceUid(resources, i, i2));
    }

    private static java.lang.String createResourceUid(android.content.res.Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    public static android.graphics.Typeface createFromResourcesFamilyXml(android.content.Context context, androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry, android.content.res.Resources resources, int i, int i2, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback, android.os.Handler handler, boolean z) {
        android.graphics.Typeface typefaceCreateFromFontFamilyFilesResourceEntry;
        if (familyResourceEntry instanceof androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry) {
            androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry providerResourceEntry = (androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry) familyResourceEntry;
            boolean z2 = false;
            if (!z ? fontCallback == null : providerResourceEntry.getFetchStrategy() == 0) {
                z2 = true;
            }
            typefaceCreateFromFontFamilyFilesResourceEntry = androidx.core.provider.FontsContractCompat.getFontSync(context, providerResourceEntry.getRequest(), fontCallback, handler, z2, z ? providerResourceEntry.getTimeout() : -1, i2);
        } else {
            typefaceCreateFromFontFamilyFilesResourceEntry = sTypefaceCompatImpl.createFromFontFamilyFilesResourceEntry(context, (androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry) familyResourceEntry, resources, i2);
            if (fontCallback != null) {
                if (typefaceCreateFromFontFamilyFilesResourceEntry != null) {
                    fontCallback.callbackSuccessAsync(typefaceCreateFromFontFamilyFilesResourceEntry, handler);
                } else {
                    fontCallback.callbackFailAsync(-3, handler);
                }
            }
        }
        if (typefaceCreateFromFontFamilyFilesResourceEntry != null) {
            sTypefaceCache.put(createResourceUid(resources, i, i2), typefaceCreateFromFontFamilyFilesResourceEntry);
        }
        return typefaceCreateFromFontFamilyFilesResourceEntry;
    }

    public static android.graphics.Typeface createFromResourcesFontFile(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2) {
        android.graphics.Typeface typefaceCreateFromResourcesFontFile = sTypefaceCompatImpl.createFromResourcesFontFile(context, resources, i, str, i2);
        if (typefaceCreateFromResourcesFontFile != null) {
            sTypefaceCache.put(createResourceUid(resources, i, i2), typefaceCreateFromResourcesFontFile);
        }
        return typefaceCreateFromResourcesFontFile;
    }

    public static android.graphics.Typeface createFromFontInfo(android.content.Context context, android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        return sTypefaceCompatImpl.createFromFontInfo(context, cancellationSignal, fontInfoArr, i);
    }

    private static android.graphics.Typeface getBestFontFromFamily(android.content.Context context, android.graphics.Typeface typeface, int i) {
        androidx.core.graphics.TypefaceCompatBaseImpl typefaceCompatBaseImpl = sTypefaceCompatImpl;
        androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamily = typefaceCompatBaseImpl.getFontFamily(typeface);
        if (fontFamily == null) {
            return null;
        }
        return typefaceCompatBaseImpl.createFromFontFamilyFilesResourceEntry(context, fontFamily, context.getResources(), i);
    }

    public static android.graphics.Typeface create(android.content.Context context, android.graphics.Typeface typeface, int i) {
        android.graphics.Typeface bestFontFromFamily;
        if (context != null) {
            return (android.os.Build.VERSION.SDK_INT >= 21 || (bestFontFromFamily = getBestFontFromFamily(context, typeface, i)) == null) ? android.graphics.Typeface.create(typeface, i) : bestFontFromFamily;
        }
        throw new java.lang.IllegalArgumentException("Context cannot be null");
    }
}
