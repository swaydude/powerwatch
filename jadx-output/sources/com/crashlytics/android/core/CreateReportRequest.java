package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class CreateReportRequest {
    public final java.lang.String apiKey;
    public final com.crashlytics.android.core.Report report;

    public CreateReportRequest(java.lang.String str, com.crashlytics.android.core.Report report) {
        this.apiKey = str;
        this.report = report;
    }
}
