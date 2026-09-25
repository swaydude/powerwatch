package com.google.android.datatransport;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-api@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public interface Transport<T> {
    void schedule(com.google.android.datatransport.Event<T> event, com.google.android.datatransport.TransportScheduleCallback transportScheduleCallback);

    void send(com.google.android.datatransport.Event<T> event);
}
