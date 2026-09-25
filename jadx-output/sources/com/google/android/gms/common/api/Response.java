package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public class Response<T extends com.google.android.gms.common.api.Result> {
    private T zzap;

    public Response() {
    }

    protected Response(T t) {
        this.zzap = t;
    }

    protected T getResult() {
        return this.zzap;
    }

    public void setResult(T t) {
        this.zzap = t;
    }
}
