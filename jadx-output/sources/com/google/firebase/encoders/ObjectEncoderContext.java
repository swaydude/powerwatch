package com.google.firebase.encoders;

/* JADX INFO: compiled from: com.google.firebase:firebase-encoders-json@@16.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface ObjectEncoderContext {
    com.google.firebase.encoders.ObjectEncoderContext add(java.lang.String str, double d) throws com.google.firebase.encoders.EncodingException, java.io.IOException;

    com.google.firebase.encoders.ObjectEncoderContext add(java.lang.String str, int i) throws com.google.firebase.encoders.EncodingException, java.io.IOException;

    com.google.firebase.encoders.ObjectEncoderContext add(java.lang.String str, long j) throws com.google.firebase.encoders.EncodingException, java.io.IOException;

    com.google.firebase.encoders.ObjectEncoderContext add(java.lang.String str, java.lang.Object obj) throws com.google.firebase.encoders.EncodingException, java.io.IOException;

    com.google.firebase.encoders.ObjectEncoderContext add(java.lang.String str, boolean z) throws com.google.firebase.encoders.EncodingException, java.io.IOException;

    com.google.firebase.encoders.ObjectEncoderContext nested(java.lang.String str) throws java.io.IOException;
}
