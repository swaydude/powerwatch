package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class CompositeCreateReportSpiCall implements com.crashlytics.android.core.CreateReportSpiCall {
    private final com.crashlytics.android.core.DefaultCreateReportSpiCall javaReportSpiCall;
    private final com.crashlytics.android.core.NativeCreateReportSpiCall nativeReportSpiCall;

    public CompositeCreateReportSpiCall(com.crashlytics.android.core.DefaultCreateReportSpiCall defaultCreateReportSpiCall, com.crashlytics.android.core.NativeCreateReportSpiCall nativeCreateReportSpiCall) {
        this.javaReportSpiCall = defaultCreateReportSpiCall;
        this.nativeReportSpiCall = nativeCreateReportSpiCall;
    }

    /* JADX INFO: renamed from: com.crashlytics.android.core.CompositeCreateReportSpiCall$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$crashlytics$android$core$Report$Type;

        static {
            int[] iArr = new int[com.crashlytics.android.core.Report.Type.values().length];
            $SwitchMap$com$crashlytics$android$core$Report$Type = iArr;
            try {
                iArr[com.crashlytics.android.core.Report.Type.JAVA.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crashlytics$android$core$Report$Type[com.crashlytics.android.core.Report.Type.NATIVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.crashlytics.android.core.CreateReportSpiCall
    public boolean invoke(com.crashlytics.android.core.CreateReportRequest createReportRequest) throws java.lang.Throwable {
        int i = com.crashlytics.android.core.CompositeCreateReportSpiCall.AnonymousClass1.$SwitchMap$com$crashlytics$android$core$Report$Type[createReportRequest.report.getType().ordinal()];
        if (i == 1) {
            this.javaReportSpiCall.invoke(createReportRequest);
            return true;
        }
        if (i != 2) {
            return false;
        }
        this.nativeReportSpiCall.invoke(createReportRequest);
        return true;
    }
}
