package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class bh {
    private final android.content.Context a;

    public bh(android.content.Context context) {
        this.a = context;
    }

    private static java.lang.String a(java.util.Locale locale) {
        java.lang.String strConcat;
        java.lang.String strValueOf = java.lang.String.valueOf(locale.getLanguage());
        if (locale.getCountry().isEmpty()) {
            strConcat = "";
        } else {
            java.lang.String strValueOf2 = java.lang.String.valueOf(locale.getCountry());
            strConcat = strValueOf2.length() != 0 ? io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR.concat(strValueOf2) : new java.lang.String(io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR);
        }
        java.lang.String strValueOf3 = java.lang.String.valueOf(strConcat);
        return strValueOf3.length() != 0 ? strValueOf.concat(strValueOf3) : new java.lang.String(strValueOf);
    }

    public final java.util.List<java.lang.String> a() {
        android.content.res.Configuration configuration = this.a.getResources().getConfiguration();
        if (android.os.Build.VERSION.SDK_INT < 24) {
            return java.util.Collections.singletonList(a(configuration.locale));
        }
        android.os.LocaleList locales = configuration.getLocales();
        java.util.ArrayList arrayList = new java.util.ArrayList(locales.size());
        for (int i = 0; i < locales.size(); i++) {
            arrayList.add(a(locales.get(i)));
        }
        return arrayList;
    }
}
