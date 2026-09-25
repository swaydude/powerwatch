package com.google.firebase.encoders.json;

/* JADX INFO: compiled from: com.google.firebase:firebase-encoders-json@@16.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class JsonDataEncoderBuilder$$Lambda$1 implements com.google.firebase.encoders.ValueEncoder {
    private static final com.google.firebase.encoders.json.JsonDataEncoderBuilder$$Lambda$1 instance = new com.google.firebase.encoders.json.JsonDataEncoderBuilder$$Lambda$1();

    private JsonDataEncoderBuilder$$Lambda$1() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public void encode(java.lang.Object obj, com.google.firebase.encoders.ValueEncoderContext valueEncoderContext) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        valueEncoderContext.add((java.lang.String) obj);
    }
}
