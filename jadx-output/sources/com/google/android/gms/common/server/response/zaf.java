package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaf implements com.google.android.gms.common.server.response.FastParser.zaa<java.lang.Boolean> {
    zaf() {
    }

    @Override // com.google.android.gms.common.server.response.FastParser.zaa
    public final /* synthetic */ java.lang.Boolean zah(com.google.android.gms.common.server.response.FastParser fastParser, java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        return java.lang.Boolean.valueOf(fastParser.zaa(bufferedReader, false));
    }
}
