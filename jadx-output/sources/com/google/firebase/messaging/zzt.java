package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzt {
    private final android.os.Bundle zza;

    public zzt(android.os.Bundle bundle) {
        java.util.Objects.requireNonNull(bundle, "data");
        this.zza = new android.os.Bundle(bundle);
    }

    public final java.lang.String zza(java.lang.String str) {
        android.os.Bundle bundle = this.zza;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            java.lang.String strZzi = zzi(str);
            if (this.zza.containsKey(strZzi)) {
                str = strZzi;
            }
        }
        return bundle.getString(str);
    }

    public final boolean zzb(java.lang.String str) {
        java.lang.String strZza = zza(str);
        return "1".equals(strZza) || java.lang.Boolean.parseBoolean(strZza);
    }

    public final java.lang.Integer zzc(java.lang.String str) {
        java.lang.String strZza = zza(str);
        if (android.text.TextUtils.isEmpty(strZza)) {
            return null;
        }
        try {
            return java.lang.Integer.valueOf(java.lang.Integer.parseInt(strZza));
        } catch (java.lang.NumberFormatException unused) {
            java.lang.String strZzh = zzh(str);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strZzh).length() + 38 + java.lang.String.valueOf(strZza).length());
            sb.append("Couldn't parse value of ");
            sb.append(strZzh);
            sb.append("(");
            sb.append(strZza);
            sb.append(") into an int");
            android.util.Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public final java.lang.Long zzd(java.lang.String str) {
        java.lang.String strZza = zza(str);
        if (android.text.TextUtils.isEmpty(strZza)) {
            return null;
        }
        try {
            return java.lang.Long.valueOf(java.lang.Long.parseLong(strZza));
        } catch (java.lang.NumberFormatException unused) {
            java.lang.String strZzh = zzh(str);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strZzh).length() + 38 + java.lang.String.valueOf(strZza).length());
            sb.append("Couldn't parse value of ");
            sb.append(strZzh);
            sb.append("(");
            sb.append(strZza);
            sb.append(") into a long");
            android.util.Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public final java.lang.String zze(java.lang.String str) {
        java.lang.String strValueOf = java.lang.String.valueOf(str);
        return zza("_loc_key".length() != 0 ? strValueOf.concat("_loc_key") : new java.lang.String(strValueOf));
    }

    public final java.lang.Object[] zzf(java.lang.String str) {
        java.lang.String strValueOf = java.lang.String.valueOf(str);
        org.json.JSONArray jSONArrayZzg = zzg("_loc_args".length() != 0 ? strValueOf.concat("_loc_args") : new java.lang.String(strValueOf));
        if (jSONArrayZzg == null) {
            return null;
        }
        int length = jSONArrayZzg.length();
        java.lang.String[] strArr = new java.lang.String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayZzg.optString(i);
        }
        return strArr;
    }

    private final org.json.JSONArray zzg(java.lang.String str) {
        java.lang.String strZza = zza(str);
        if (android.text.TextUtils.isEmpty(strZza)) {
            return null;
        }
        try {
            return new org.json.JSONArray(strZza);
        } catch (org.json.JSONException unused) {
            java.lang.String strZzh = zzh(str);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strZzh).length() + 50 + java.lang.String.valueOf(strZza).length());
            sb.append("Malformed JSON for key ");
            sb.append(strZzh);
            sb.append(": ");
            sb.append(strZza);
            sb.append(", falling back to default");
            android.util.Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    private static java.lang.String zzh(java.lang.String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public final android.net.Uri zza() {
        java.lang.String strZza = zza("gcm.n.link_android");
        if (android.text.TextUtils.isEmpty(strZza)) {
            strZza = zza("gcm.n.link");
        }
        if (android.text.TextUtils.isEmpty(strZza)) {
            return null;
        }
        return android.net.Uri.parse(strZza);
    }

    public final java.lang.String zzb() {
        java.lang.String strZza = zza("gcm.n.sound2");
        return android.text.TextUtils.isEmpty(strZza) ? zza("gcm.n.sound") : strZza;
    }

    public final long[] zzc() {
        org.json.JSONArray jSONArrayZzg = zzg("gcm.n.vibrate_timings");
        if (jSONArrayZzg == null) {
            return null;
        }
        try {
            if (jSONArrayZzg.length() <= 1) {
                throw new org.json.JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayZzg.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayZzg.optLong(i);
            }
            return jArr;
        } catch (java.lang.NumberFormatException | org.json.JSONException unused) {
            java.lang.String strValueOf = java.lang.String.valueOf(jSONArrayZzg);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 74);
            sb.append("User defined vibrateTimings is invalid: ");
            sb.append(strValueOf);
            sb.append(". Skipping setting vibrateTimings.");
            android.util.Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    final int[] zzd() {
        org.json.JSONArray jSONArrayZzg = zzg("gcm.n.light_settings");
        if (jSONArrayZzg == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayZzg.length() != 3) {
                throw new org.json.JSONException("lightSettings don't have all three fields");
            }
            int color = android.graphics.Color.parseColor(jSONArrayZzg.optString(0));
            if (color == -16777216) {
                throw new java.lang.IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayZzg.optInt(1);
            iArr[2] = jSONArrayZzg.optInt(2);
            return iArr;
        } catch (java.lang.IllegalArgumentException e) {
            java.lang.String strValueOf = java.lang.String.valueOf(jSONArrayZzg);
            java.lang.String message = e.getMessage();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 60 + java.lang.String.valueOf(message).length());
            sb.append("LightSettings is invalid: ");
            sb.append(strValueOf);
            sb.append(". ");
            sb.append(message);
            sb.append(". Skipping setting LightSettings");
            android.util.Log.w("NotificationParams", sb.toString());
            return null;
        } catch (org.json.JSONException unused) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(jSONArrayZzg);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf2).length() + 58);
            sb2.append("LightSettings is invalid: ");
            sb2.append(strValueOf2);
            sb2.append(". Skipping setting LightSettings");
            android.util.Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    public final android.os.Bundle zze() {
        android.os.Bundle bundle = new android.os.Bundle(this.zza);
        for (java.lang.String str : this.zza.keySet()) {
            if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final android.os.Bundle zzf() {
        android.os.Bundle bundle = new android.os.Bundle(this.zza);
        for (java.lang.String str : this.zza.keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    private final java.lang.String zzb(android.content.res.Resources resources, java.lang.String str, java.lang.String str2) {
        java.lang.String strZze = zze(str2);
        if (android.text.TextUtils.isEmpty(strZze)) {
            return null;
        }
        int identifier = resources.getIdentifier(strZze, "string", str);
        if (identifier == 0) {
            java.lang.String strValueOf = java.lang.String.valueOf(str2);
            java.lang.String strZzh = zzh("_loc_key".length() != 0 ? strValueOf.concat("_loc_key") : new java.lang.String(strValueOf));
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strZzh).length() + 49 + java.lang.String.valueOf(str2).length());
            sb.append(strZzh);
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(" Default value will be used.");
            android.util.Log.w("NotificationParams", sb.toString());
            return null;
        }
        java.lang.Object[] objArrZzf = zzf(str2);
        if (objArrZzf == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrZzf);
        } catch (java.util.MissingFormatArgumentException e) {
            java.lang.String strZzh2 = zzh(str2);
            java.lang.String string = java.util.Arrays.toString(objArrZzf);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strZzh2).length() + 58 + java.lang.String.valueOf(string).length());
            sb2.append("Missing format argument for ");
            sb2.append(strZzh2);
            sb2.append(": ");
            sb2.append(string);
            sb2.append(" Default value will be used.");
            android.util.Log.w("NotificationParams", sb2.toString(), e);
            return null;
        }
    }

    public final java.lang.String zza(android.content.res.Resources resources, java.lang.String str, java.lang.String str2) {
        java.lang.String strZza = zza(str2);
        return !android.text.TextUtils.isEmpty(strZza) ? strZza : zzb(resources, str, str2);
    }

    public static boolean zza(android.os.Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(zzi("gcm.n.e")));
    }

    private static java.lang.String zzi(java.lang.String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }
}
