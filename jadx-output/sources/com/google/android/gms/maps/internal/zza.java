package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zza {
    public static java.lang.Boolean zza(byte b) {
        if (b == 0) {
            return java.lang.Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return java.lang.Boolean.TRUE;
    }

    public static byte zza(java.lang.Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? (byte) 1 : (byte) 0;
        }
        return (byte) -1;
    }
}
