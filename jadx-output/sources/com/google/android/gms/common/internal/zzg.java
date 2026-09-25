package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzg {
    private static final android.net.Uri zzed;
    private static final android.net.Uri zzee;

    public static android.content.Intent zzg(java.lang.String str) {
        android.net.Uri uriFromParts = android.net.Uri.fromParts("package", str, null);
        android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(uriFromParts);
        return intent;
    }

    public static android.content.Intent zza(java.lang.String str, java.lang.String str2) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        android.net.Uri.Builder builderAppendQueryParameter = android.net.Uri.parse("market://details").buildUpon().appendQueryParameter("id", str);
        if (!android.text.TextUtils.isEmpty(str2)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(builderAppendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    public static android.content.Intent zzs() {
        android.content.Intent intent = new android.content.Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    static {
        android.net.Uri uri = android.net.Uri.parse("https://plus.google.com/");
        zzed = uri;
        zzee = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
