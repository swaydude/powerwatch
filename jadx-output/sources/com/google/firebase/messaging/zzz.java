package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzz {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;

    private zzz(java.lang.String str, java.lang.String str2) {
        java.lang.String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            android.util.Log.w("FirebaseMessaging", java.lang.String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !zza.matcher(strSubstring).matches()) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Invalid topic name: %s does not match the allowed format %s.", strSubstring, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        this.zzb = strSubstring;
        this.zzc = str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 1 + java.lang.String.valueOf(str2).length());
        sb.append(str);
        sb.append("!");
        sb.append(str2);
        this.zzd = sb.toString();
    }

    public static com.google.firebase.messaging.zzz zza(java.lang.String str) {
        return new com.google.firebase.messaging.zzz("S", str);
    }

    public static com.google.firebase.messaging.zzz zzb(java.lang.String str) {
        return new com.google.firebase.messaging.zzz("U", str);
    }

    static com.google.firebase.messaging.zzz zzc(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.lang.String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new com.google.firebase.messaging.zzz(strArrSplit[0], strArrSplit[1]);
    }

    public final java.lang.String zza() {
        return this.zzb;
    }

    public final java.lang.String zzb() {
        return this.zzc;
    }

    public final java.lang.String zzc() {
        return this.zzd;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.firebase.messaging.zzz)) {
            return false;
        }
        com.google.firebase.messaging.zzz zzzVar = (com.google.firebase.messaging.zzz) obj;
        return this.zzb.equals(zzzVar.zzb) && this.zzc.equals(zzzVar.zzc);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzc, this.zzb);
    }
}
