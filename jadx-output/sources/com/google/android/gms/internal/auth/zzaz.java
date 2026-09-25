package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzaz extends com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse {
    private static java.lang.String zzem = "AUTH";

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public byte[] toByteArray() {
        try {
            return toString().getBytes(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
        } catch (java.io.UnsupportedEncodingException e) {
            android.util.Log.e(zzem, "Error serializing object.", e);
            return null;
        }
    }
}
