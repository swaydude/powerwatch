package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class AvailabilityException extends java.lang.Exception {
    private final androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> zaba;

    public AvailabilityException(androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> arrayMap) {
        this.zaba = arrayMap;
    }

    public com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.GoogleApi<? extends com.google.android.gms.common.api.Api.ApiOptions> googleApi) {
        java.lang.Object apiKey = googleApi.getApiKey();
        com.google.android.gms.common.internal.Preconditions.checkArgument(this.zaba.get(apiKey) != null, "The given API was not part of the availability request.");
        return this.zaba.get(apiKey);
    }

    public com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.HasApiKey<? extends com.google.android.gms.common.api.Api.ApiOptions> hasApiKey) {
        java.lang.Object apiKey = hasApiKey.getApiKey();
        com.google.android.gms.common.internal.Preconditions.checkArgument(this.zaba.get(apiKey) != null, "The given API was not part of the availability request.");
        return this.zaba.get(apiKey);
    }

    public final androidx.collection.ArrayMap<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.ConnectionResult> zaj() {
        return this.zaba;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z = true;
        for (com.google.android.gms.common.api.internal.ApiKey<?> apiKey : this.zaba.keySet()) {
            com.google.android.gms.common.ConnectionResult connectionResult = this.zaba.get(apiKey);
            if (connectionResult.isSuccess()) {
                z = false;
            }
            java.lang.String apiName = apiKey.getApiName();
            java.lang.String strValueOf = java.lang.String.valueOf(connectionResult);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(apiName).length() + 2 + java.lang.String.valueOf(strValueOf).length());
            sb.append(apiName);
            sb.append(": ");
            sb.append(strValueOf);
            arrayList.add(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(android.text.TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
