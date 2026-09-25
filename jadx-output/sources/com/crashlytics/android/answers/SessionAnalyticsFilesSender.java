package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
class SessionAnalyticsFilesSender extends io.fabric.sdk.android.services.common.AbstractSpiCall implements io.fabric.sdk.android.services.events.FilesSender {
    static final java.lang.String FILE_CONTENT_TYPE = "application/vnd.crashlytics.android.events";
    static final java.lang.String FILE_PARAM_NAME = "session_analytics_file_";
    private final java.lang.String apiKey;

    public SessionAnalyticsFilesSender(io.fabric.sdk.android.Kit kit, java.lang.String str, java.lang.String str2, io.fabric.sdk.android.services.network.HttpRequestFactory httpRequestFactory, java.lang.String str3) {
        super(kit, str, str2, httpRequestFactory, io.fabric.sdk.android.services.network.HttpMethod.POST);
        this.apiKey = str3;
    }

    @Override // io.fabric.sdk.android.services.events.FilesSender
    public boolean send(java.util.List<java.io.File> list) throws java.lang.Throwable {
        io.fabric.sdk.android.services.network.HttpRequest httpRequestHeader = getHttpRequest().header(io.fabric.sdk.android.services.common.AbstractSpiCall.HEADER_CLIENT_TYPE, "android").header(io.fabric.sdk.android.services.common.AbstractSpiCall.HEADER_CLIENT_VERSION, this.kit.getVersion()).header(io.fabric.sdk.android.services.common.AbstractSpiCall.HEADER_API_KEY, this.apiKey);
        int i = 0;
        for (java.io.File file : list) {
            httpRequestHeader.part(FILE_PARAM_NAME + i, file.getName(), FILE_CONTENT_TYPE, file);
            i++;
        }
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.answers.Answers.TAG, "Sending " + list.size() + " analytics files to " + getUrl());
        int iCode = httpRequestHeader.code();
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.answers.Answers.TAG, "Response code for analytics file send is " + iCode);
        return io.fabric.sdk.android.services.common.ResponseParser.parse(iCode) == 0;
    }
}
