package com.google.android.gms.ads.identifier;

/* JADX INFO: loaded from: classes.dex */
final class zza extends java.lang.Thread {
    private final /* synthetic */ java.util.Map zzl;

    zza(com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient, java.util.Map map) {
        this.zzl = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        java.lang.String message;
        java.lang.StringBuilder sb;
        java.lang.String str;
        java.lang.Exception exc;
        new com.google.android.gms.ads.identifier.zzc();
        java.util.Map map = this.zzl;
        android.net.Uri.Builder builderBuildUpon = android.net.Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (java.lang.String str2 : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str2, (java.lang.String) map.get(str2));
        }
        java.lang.String string = builderBuildUpon.build().toString();
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(string).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(string).length() + 65);
                    sb2.append("Received non-success response code ");
                    sb2.append(responseCode);
                    sb2.append(" from pinging URL: ");
                    sb2.append(string);
                    android.util.Log.w("HttpUrlPinger", sb2.toString());
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (java.io.IOException e) {
            e = e;
            message = e.getMessage();
            sb = new java.lang.StringBuilder(java.lang.String.valueOf(string).length() + 27 + java.lang.String.valueOf(message).length());
            str = "Error while pinging URL: ";
            exc = e;
            sb.append(str);
            sb.append(string);
            sb.append(". ");
            sb.append(message);
            android.util.Log.w("HttpUrlPinger", sb.toString(), exc);
        } catch (java.lang.IndexOutOfBoundsException e2) {
            message = e2.getMessage();
            sb = new java.lang.StringBuilder(java.lang.String.valueOf(string).length() + 32 + java.lang.String.valueOf(message).length());
            str = "Error while parsing ping URL: ";
            exc = e2;
            sb.append(str);
            sb.append(string);
            sb.append(". ");
            sb.append(message);
            android.util.Log.w("HttpUrlPinger", sb.toString(), exc);
        } catch (java.lang.RuntimeException e3) {
            e = e3;
            message = e.getMessage();
            sb = new java.lang.StringBuilder(java.lang.String.valueOf(string).length() + 27 + java.lang.String.valueOf(message).length());
            str = "Error while pinging URL: ";
            exc = e;
            sb.append(str);
            sb.append(string);
            sb.append(". ");
            sb.append(message);
            android.util.Log.w("HttpUrlPinger", sb.toString(), exc);
        }
    }
}
