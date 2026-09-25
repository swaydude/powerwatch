package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzby {
    public static void zza(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        android.os.Parcelable parcelableZza = zza(bundle, "MapOptions");
        if (parcelableZza != null) {
            zza(bundle2, "MapOptions", parcelableZza);
        }
        android.os.Parcelable parcelableZza2 = zza(bundle, "StreetViewPanoramaOptions");
        if (parcelableZza2 != null) {
            zza(bundle2, "StreetViewPanoramaOptions", parcelableZza2);
        }
        android.os.Parcelable parcelableZza3 = zza(bundle, "camera");
        if (parcelableZza3 != null) {
            zza(bundle2, "camera", parcelableZza3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    private static <T extends android.os.Parcelable> T zza(android.os.Bundle bundle, java.lang.String str) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(com.google.android.gms.maps.internal.zzby.class.getClassLoader());
        android.os.Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(com.google.android.gms.maps.internal.zzby.class.getClassLoader());
        return (T) bundle2.getParcelable(str);
    }

    public static void zza(android.os.Bundle bundle, java.lang.String str, android.os.Parcelable parcelable) {
        bundle.setClassLoader(com.google.android.gms.maps.internal.zzby.class.getClassLoader());
        android.os.Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new android.os.Bundle();
        }
        bundle2.setClassLoader(com.google.android.gms.maps.internal.zzby.class.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    private zzby() {
    }
}
