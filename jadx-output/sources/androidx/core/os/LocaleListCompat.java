package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class LocaleListCompat {
    private static final androidx.core.os.LocaleListCompat sEmptyLocaleList = create(new java.util.Locale[0]);
    private androidx.core.os.LocaleListInterface mImpl;

    private LocaleListCompat(androidx.core.os.LocaleListInterface localeListInterface) {
        this.mImpl = localeListInterface;
    }

    @java.lang.Deprecated
    public static androidx.core.os.LocaleListCompat wrap(java.lang.Object obj) {
        return wrap((android.os.LocaleList) obj);
    }

    public static androidx.core.os.LocaleListCompat wrap(android.os.LocaleList localeList) {
        return new androidx.core.os.LocaleListCompat(new androidx.core.os.LocaleListPlatformWrapper(localeList));
    }

    public java.lang.Object unwrap() {
        return this.mImpl.getLocaleList();
    }

    public static androidx.core.os.LocaleListCompat create(java.util.Locale... localeArr) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return wrap(new android.os.LocaleList(localeArr));
        }
        return new androidx.core.os.LocaleListCompat(new androidx.core.os.LocaleListCompatWrapper(localeArr));
    }

    public java.util.Locale get(int i) {
        return this.mImpl.get(i);
    }

    public boolean isEmpty() {
        return this.mImpl.isEmpty();
    }

    public int size() {
        return this.mImpl.size();
    }

    public int indexOf(java.util.Locale locale) {
        return this.mImpl.indexOf(locale);
    }

    public java.lang.String toLanguageTags() {
        return this.mImpl.toLanguageTags();
    }

    public java.util.Locale getFirstMatch(java.lang.String[] strArr) {
        return this.mImpl.getFirstMatch(strArr);
    }

    public static androidx.core.os.LocaleListCompat getEmptyLocaleList() {
        return sEmptyLocaleList;
    }

    public static androidx.core.os.LocaleListCompat forLanguageTags(java.lang.String str) {
        java.util.Locale localeForLanguageTagCompat;
        if (str == null || str.isEmpty()) {
            return getEmptyLocaleList();
        }
        java.lang.String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        java.util.Locale[] localeArr = new java.util.Locale[length];
        for (int i = 0; i < length; i++) {
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                localeForLanguageTagCompat = java.util.Locale.forLanguageTag(strArrSplit[i]);
            } else {
                localeForLanguageTagCompat = forLanguageTagCompat(strArrSplit[i]);
            }
            localeArr[i] = localeForLanguageTagCompat;
        }
        return create(localeArr);
    }

    static java.util.Locale forLanguageTagCompat(java.lang.String str) {
        if (str.contains("-")) {
            java.lang.String[] strArrSplit = str.split("-", -1);
            if (strArrSplit.length > 2) {
                return new java.util.Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new java.util.Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new java.util.Locale(strArrSplit[0]);
            }
        } else if (str.contains(io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR)) {
            java.lang.String[] strArrSplit2 = str.split(io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR, -1);
            if (strArrSplit2.length > 2) {
                return new java.util.Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new java.util.Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new java.util.Locale(strArrSplit2[0]);
            }
        } else {
            return new java.util.Locale(str);
        }
        throw new java.lang.IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static androidx.core.os.LocaleListCompat getAdjustedDefault() {
        return android.os.Build.VERSION.SDK_INT >= 24 ? wrap(android.os.LocaleList.getAdjustedDefault()) : create(java.util.Locale.getDefault());
    }

    public static androidx.core.os.LocaleListCompat getDefault() {
        return android.os.Build.VERSION.SDK_INT >= 24 ? wrap(android.os.LocaleList.getDefault()) : create(java.util.Locale.getDefault());
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof androidx.core.os.LocaleListCompat) && this.mImpl.equals(((androidx.core.os.LocaleListCompat) obj).mImpl);
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    public java.lang.String toString() {
        return this.mImpl.toString();
    }
}
