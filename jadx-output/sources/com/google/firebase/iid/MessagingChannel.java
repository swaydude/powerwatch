package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface MessagingChannel {
    com.google.android.gms.tasks.Task<java.lang.Void> ackMessage(java.lang.String str);

    com.google.android.gms.tasks.Task<java.lang.Void> buildChannel(java.lang.String str, @javax.annotation.Nullable java.lang.String str2);

    com.google.android.gms.tasks.Task<java.lang.Void> deleteInstanceId(java.lang.String str);

    com.google.android.gms.tasks.Task<java.lang.Void> deleteToken(java.lang.String str, @javax.annotation.Nullable java.lang.String str2, java.lang.String str3, java.lang.String str4);

    com.google.android.gms.tasks.Task<java.lang.String> getToken(java.lang.String str, @javax.annotation.Nullable java.lang.String str2, java.lang.String str3, java.lang.String str4);

    boolean isAvailable();

    boolean isChannelBuilt();

    boolean needsRefresh();

    com.google.android.gms.tasks.Task<java.lang.Void> subscribeToTopic(java.lang.String str, java.lang.String str2, java.lang.String str3);

    com.google.android.gms.tasks.Task<java.lang.Void> unsubscribeFromTopic(java.lang.String str, java.lang.String str2, java.lang.String str3);
}
