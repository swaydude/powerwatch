package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public class ApiException extends java.lang.Exception {
    protected final com.google.android.gms.common.api.Status mStatus;

    public ApiException(com.google.android.gms.common.api.Status status) {
        int statusCode = status.getStatusCode();
        java.lang.String statusMessage = status.getStatusMessage() != null ? status.getStatusMessage() : "";
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(statusMessage).length() + 13);
        sb.append(statusCode);
        sb.append(": ");
        sb.append(statusMessage);
        super(sb.toString());
        this.mStatus = status;
    }

    public int getStatusCode() {
        return this.mStatus.getStatusCode();
    }

    @java.lang.Deprecated
    public java.lang.String getStatusMessage() {
        return this.mStatus.getStatusMessage();
    }
}
