package com.google.android.gms.fitness.result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class SessionReadResponse extends com.google.android.gms.common.api.Response<com.google.android.gms.fitness.result.SessionReadResult> {
    public java.util.List<com.google.android.gms.fitness.data.Session> getSessions() {
        return getResult().getSessions();
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSet> getDataSet(com.google.android.gms.fitness.data.Session session, com.google.android.gms.fitness.data.DataType dataType) {
        return getResult().getDataSet(session, dataType);
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSet> getDataSet(com.google.android.gms.fitness.data.Session session) {
        return getResult().getDataSet(session);
    }

    public com.google.android.gms.common.api.Status getStatus() {
        return getResult().getStatus();
    }
}
