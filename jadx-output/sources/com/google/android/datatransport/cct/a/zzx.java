package com.google.android.datatransport.cct.a;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzx {
    public static com.google.android.datatransport.cct.a.zzx zza(java.io.Reader reader) throws java.io.IOException {
        android.util.JsonReader jsonReader = new android.util.JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == android.util.JsonToken.STRING) {
                        com.google.android.datatransport.cct.a.zzl zzlVar = new com.google.android.datatransport.cct.a.zzl(java.lang.Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return zzlVar;
                    }
                    com.google.android.datatransport.cct.a.zzl zzlVar2 = new com.google.android.datatransport.cct.a.zzl(jsonReader.nextLong());
                    jsonReader.close();
                    return zzlVar2;
                }
                jsonReader.skipValue();
            }
            throw new java.io.IOException("Response is missing nextRequestWaitMillis field.");
        } catch (java.lang.Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public abstract long zza();
}
