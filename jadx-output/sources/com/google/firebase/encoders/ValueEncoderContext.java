package com.google.firebase.encoders;

/* JADX INFO: compiled from: com.google.firebase:firebase-encoders-json@@16.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface ValueEncoderContext {
    com.google.firebase.encoders.ValueEncoderContext add(double d) throws com.google.firebase.encoders.EncodingException, java.io.IOException;

    com.google.firebase.encoders.ValueEncoderContext add(int i) throws com.google.firebase.encoders.EncodingException, java.io.IOException;

    com.google.firebase.encoders.ValueEncoderContext add(long j) throws com.google.firebase.encoders.EncodingException, java.io.IOException;

    com.google.firebase.encoders.ValueEncoderContext add(java.lang.String str) throws com.google.firebase.encoders.EncodingException, java.io.IOException;

    com.google.firebase.encoders.ValueEncoderContext add(boolean z) throws com.google.firebase.encoders.EncodingException, java.io.IOException;

    com.google.firebase.encoders.ValueEncoderContext add(byte[] bArr) throws com.google.firebase.encoders.EncodingException, java.io.IOException;
}
