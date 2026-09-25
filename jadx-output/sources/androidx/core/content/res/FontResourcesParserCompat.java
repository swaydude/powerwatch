package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public class FontResourcesParserCompat {
    private static final int DEFAULT_TIMEOUT_MILLIS = 500;
    public static final int FETCH_STRATEGY_ASYNC = 1;
    public static final int FETCH_STRATEGY_BLOCKING = 0;
    public static final int INFINITE_TIMEOUT_VALUE = -1;
    private static final int ITALIC = 1;
    private static final int NORMAL_WEIGHT = 400;

    public interface FamilyResourceEntry {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    public static final class ProviderResourceEntry implements androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry {
        private final androidx.core.provider.FontRequest mRequest;
        private final int mStrategy;
        private final int mTimeoutMs;

        public ProviderResourceEntry(androidx.core.provider.FontRequest fontRequest, int i, int i2) {
            this.mRequest = fontRequest;
            this.mStrategy = i;
            this.mTimeoutMs = i2;
        }

        public androidx.core.provider.FontRequest getRequest() {
            return this.mRequest;
        }

        public int getFetchStrategy() {
            return this.mStrategy;
        }

        public int getTimeout() {
            return this.mTimeoutMs;
        }
    }

    public static final class FontFileResourceEntry {
        private final java.lang.String mFileName;
        private boolean mItalic;
        private int mResourceId;
        private int mTtcIndex;
        private java.lang.String mVariationSettings;
        private int mWeight;

        public FontFileResourceEntry(java.lang.String str, int i, boolean z, java.lang.String str2, int i2, int i3) {
            this.mFileName = str;
            this.mWeight = i;
            this.mItalic = z;
            this.mVariationSettings = str2;
            this.mTtcIndex = i2;
            this.mResourceId = i3;
        }

        public java.lang.String getFileName() {
            return this.mFileName;
        }

        public int getWeight() {
            return this.mWeight;
        }

        public boolean isItalic() {
            return this.mItalic;
        }

        public java.lang.String getVariationSettings() {
            return this.mVariationSettings;
        }

        public int getTtcIndex() {
            return this.mTtcIndex;
        }

        public int getResourceId() {
            return this.mResourceId;
        }
    }

    public static final class FontFamilyFilesResourceEntry implements androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry {
        private final androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[] mEntries;

        public FontFamilyFilesResourceEntry(androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[] fontFileResourceEntryArr) {
            this.mEntries = fontFileResourceEntryArr;
        }

        public androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[] getEntries() {
            return this.mEntries;
        }
    }

    public static androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry parse(org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources resources) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        }
        return readFamilies(xmlPullParser, resources);
    }

    private static androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry readFamilies(org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources resources) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return readFamily(xmlPullParser, resources);
        }
        skip(xmlPullParser);
        return null;
    }

    private static androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry readFamily(org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources resources) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.content.res.TypedArray typedArrayObtainAttributes = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.core.R.styleable.FontFamily);
        java.lang.String string = typedArrayObtainAttributes.getString(androidx.core.R.styleable.FontFamily_fontProviderAuthority);
        java.lang.String string2 = typedArrayObtainAttributes.getString(androidx.core.R.styleable.FontFamily_fontProviderPackage);
        java.lang.String string3 = typedArrayObtainAttributes.getString(androidx.core.R.styleable.FontFamily_fontProviderQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(androidx.core.R.styleable.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(androidx.core.R.styleable.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(androidx.core.R.styleable.FontFamily_fontProviderFetchTimeout, 500);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                skip(xmlPullParser);
            }
            return new androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry(new androidx.core.provider.FontRequest(string, string2, string3, readCerts(resources, resourceId)), integer, integer2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(readFont(xmlPullParser, resources));
                } else {
                    skip(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry((androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[]) arrayList.toArray(new androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[arrayList.size()]));
    }

    private static int getType(android.content.res.TypedArray typedArray, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    public static java.util.List<java.util.List<byte[]>> readCerts(android.content.res.Resources resources, int i) {
        if (i == 0) {
            return java.util.Collections.emptyList();
        }
        android.content.res.TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return java.util.Collections.emptyList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (getType(typedArrayObtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(toByteArrayList(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(toByteArrayList(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static java.util.List<byte[]> toByteArrayList(java.lang.String[] strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            arrayList.add(android.util.Base64.decode(str, 0));
        }
        return arrayList;
    }

    private static androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry readFont(org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources resources) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.content.res.TypedArray typedArrayObtainAttributes = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.core.R.styleable.FontFamilyFont);
        int i = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(androidx.core.R.styleable.FontFamilyFont_fontWeight) ? androidx.core.R.styleable.FontFamilyFont_fontWeight : androidx.core.R.styleable.FontFamilyFont_android_fontWeight, NORMAL_WEIGHT);
        boolean z = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(androidx.core.R.styleable.FontFamilyFont_fontStyle) ? androidx.core.R.styleable.FontFamilyFont_fontStyle : androidx.core.R.styleable.FontFamilyFont_android_fontStyle, 0);
        int i2 = typedArrayObtainAttributes.hasValue(androidx.core.R.styleable.FontFamilyFont_ttcIndex) ? androidx.core.R.styleable.FontFamilyFont_ttcIndex : androidx.core.R.styleable.FontFamilyFont_android_ttcIndex;
        java.lang.String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(androidx.core.R.styleable.FontFamilyFont_fontVariationSettings) ? androidx.core.R.styleable.FontFamilyFont_fontVariationSettings : androidx.core.R.styleable.FontFamilyFont_android_fontVariationSettings);
        int i3 = typedArrayObtainAttributes.getInt(i2, 0);
        int i4 = typedArrayObtainAttributes.hasValue(androidx.core.R.styleable.FontFamilyFont_font) ? androidx.core.R.styleable.FontFamilyFont_font : androidx.core.R.styleable.FontFamilyFont_android_font;
        int resourceId = typedArrayObtainAttributes.getResourceId(i4, 0);
        java.lang.String string2 = typedArrayObtainAttributes.getString(i4);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            skip(xmlPullParser);
        }
        return new androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry(string2, i, z, string, i3, resourceId);
    }

    private static void skip(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    private FontResourcesParserCompat() {
    }
}
