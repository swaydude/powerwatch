package com.google.firebase.encoders;

/* JADX INFO: compiled from: com.google.firebase:firebase-encoders-json@@16.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface DataEncoder {
    java.lang.String encode(java.lang.Object obj) throws com.google.firebase.encoders.EncodingException;

    void encode(java.lang.Object obj, java.io.Writer writer) throws com.google.firebase.encoders.EncodingException, java.io.IOException;
}
