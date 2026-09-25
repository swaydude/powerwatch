package com.google.android.gms.fitness.result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class DataReadResponse extends com.google.android.gms.common.api.Response<com.google.android.gms.fitness.result.DataReadResult> {
    public com.google.android.gms.fitness.data.DataSet getDataSet(com.google.android.gms.fitness.data.DataType dataType) {
        return getResult().getDataSet(dataType);
    }

    public com.google.android.gms.fitness.data.DataSet getDataSet(com.google.android.gms.fitness.data.DataSource dataSource) {
        return getResult().getDataSet(dataSource);
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSet> getDataSets() {
        return getResult().getDataSets();
    }

    public java.util.List<com.google.android.gms.fitness.data.Bucket> getBuckets() {
        return getResult().getBuckets();
    }

    public com.google.android.gms.common.api.Status getStatus() {
        return getResult().getStatus();
    }
}
