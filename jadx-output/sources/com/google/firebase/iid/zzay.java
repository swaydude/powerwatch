package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzay {
    private static final long zzb = java.util.concurrent.TimeUnit.DAYS.toMillis(7);
    final java.lang.String zza;
    private final java.lang.String zzc;
    private final long zzd;

    private zzay(java.lang.String str, java.lang.String str2, long j) {
        this.zza = str;
        this.zzc = str2;
        this.zzd = j;
    }

    static com.google.firebase.iid.zzay zza(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                return new com.google.firebase.iid.zzay(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (org.json.JSONException e) {
                java.lang.String strValueOf = java.lang.String.valueOf(e);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 23);
                sb.append("Failed to parse token: ");
                sb.append(strValueOf);
                android.util.Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }
        return new com.google.firebase.iid.zzay(str, null, 0L);
    }

    static java.lang.String zza(java.lang.String str, java.lang.String str2, long j) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (org.json.JSONException e) {
            java.lang.String strValueOf = java.lang.String.valueOf(e);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(strValueOf);
            android.util.Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    static java.lang.String zza(com.google.firebase.iid.zzay zzayVar) {
        if (zzayVar == null) {
            return null;
        }
        return zzayVar.zza;
    }

    final boolean zzb(java.lang.String str) {
        return java.lang.System.currentTimeMillis() > this.zzd + zzb || !str.equals(this.zzc);
    }
}
