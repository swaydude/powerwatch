package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class DefaultCreateReportSpiCall extends io.fabric.sdk.android.services.common.AbstractSpiCall implements com.crashlytics.android.core.CreateReportSpiCall {
    static final java.lang.String FILE_CONTENT_TYPE = "application/octet-stream";
    static final java.lang.String FILE_PARAM = "report[file]";
    static final java.lang.String IDENTIFIER_PARAM = "report[identifier]";
    static final java.lang.String MULTI_FILE_PARAM = "report[file";

    public DefaultCreateReportSpiCall(io.fabric.sdk.android.Kit kit, java.lang.String str, java.lang.String str2, io.fabric.sdk.android.services.network.HttpRequestFactory httpRequestFactory) {
        super(kit, str, str2, httpRequestFactory, io.fabric.sdk.android.services.network.HttpMethod.POST);
    }

    DefaultCreateReportSpiCall(io.fabric.sdk.android.Kit kit, java.lang.String str, java.lang.String str2, io.fabric.sdk.android.services.network.HttpRequestFactory httpRequestFactory, io.fabric.sdk.android.services.network.HttpMethod httpMethod) {
        super(kit, str, str2, httpRequestFactory, httpMethod);
    }

    @Override // com.crashlytics.android.core.CreateReportSpiCall
    public boolean invoke(com.crashlytics.android.core.CreateReportRequest createReportRequest) throws java.lang.Throwable {
        io.fabric.sdk.android.services.network.HttpRequest httpRequestApplyMultipartDataTo = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createReportRequest), createReportRequest.report);
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Sending report to: " + getUrl());
        int iCode = httpRequestApplyMultipartDataTo.code();
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Create report request ID: " + httpRequestApplyMultipartDataTo.header(io.fabric.sdk.android.services.common.AbstractSpiCall.HEADER_REQUEST_ID));
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Result was: " + iCode);
        return io.fabric.sdk.android.services.common.ResponseParser.parse(iCode) == 0;
    }

    private io.fabric.sdk.android.services.network.HttpRequest applyHeadersTo(io.fabric.sdk.android.services.network.HttpRequest httpRequest, com.crashlytics.android.core.CreateReportRequest createReportRequest) {
        io.fabric.sdk.android.services.network.HttpRequest httpRequestHeader = httpRequest.header(io.fabric.sdk.android.services.common.AbstractSpiCall.HEADER_API_KEY, createReportRequest.apiKey).header(io.fabric.sdk.android.services.common.AbstractSpiCall.HEADER_CLIENT_TYPE, "android").header(io.fabric.sdk.android.services.common.AbstractSpiCall.HEADER_CLIENT_VERSION, this.kit.getVersion());
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = createReportRequest.report.getCustomHeaders().entrySet().iterator();
        while (it.hasNext()) {
            httpRequestHeader = httpRequestHeader.header(it.next());
        }
        return httpRequestHeader;
    }

    private io.fabric.sdk.android.services.network.HttpRequest applyMultipartDataTo(io.fabric.sdk.android.services.network.HttpRequest httpRequest, com.crashlytics.android.core.Report report) throws java.lang.Throwable {
        httpRequest.part(IDENTIFIER_PARAM, report.getIdentifier());
        if (report.getFiles().length == 1) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Adding single file " + report.getFileName() + " to report " + report.getIdentifier());
            return httpRequest.part(FILE_PARAM, report.getFileName(), FILE_CONTENT_TYPE, report.getFile());
        }
        int i = 0;
        for (java.io.File file : report.getFiles()) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Adding file " + file.getName() + " to report " + report.getIdentifier());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(MULTI_FILE_PARAM);
            sb.append(i);
            sb.append("]");
            httpRequest.part(sb.toString(), file.getName(), FILE_CONTENT_TYPE, file);
            i++;
        }
        return httpRequest;
    }
}
