package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class ReportUploader {
    static final java.util.Map<java.lang.String, java.lang.String> HEADER_INVALID_CLS_FILE = java.util.Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    private static final short[] RETRY_INTERVALS = {10, 20, 30, 60, 120, 300};
    private final java.lang.String apiKey;
    private final com.crashlytics.android.core.CreateReportSpiCall createReportCall;
    private final java.lang.Object fileAccessLock = new java.lang.Object();
    private final com.crashlytics.android.core.ReportUploader.HandlingExceptionCheck handlingExceptionCheck;
    private final com.crashlytics.android.core.ReportUploader.ReportFilesProvider reportFilesProvider;
    private java.lang.Thread uploadThread;

    interface HandlingExceptionCheck {
        boolean isHandlingException();
    }

    interface ReportFilesProvider {
        java.io.File[] getCompleteSessionFiles();

        java.io.File[] getInvalidSessionFiles();

        java.io.File[] getNativeReportFiles();
    }

    interface SendCheck {
        boolean canSendReports();
    }

    static final class AlwaysSendCheck implements com.crashlytics.android.core.ReportUploader.SendCheck {
        @Override // com.crashlytics.android.core.ReportUploader.SendCheck
        public boolean canSendReports() {
            return true;
        }

        AlwaysSendCheck() {
        }
    }

    public ReportUploader(java.lang.String str, com.crashlytics.android.core.CreateReportSpiCall createReportSpiCall, com.crashlytics.android.core.ReportUploader.ReportFilesProvider reportFilesProvider, com.crashlytics.android.core.ReportUploader.HandlingExceptionCheck handlingExceptionCheck) {
        if (createReportSpiCall == null) {
            throw new java.lang.IllegalArgumentException("createReportCall must not be null.");
        }
        this.createReportCall = createReportSpiCall;
        this.apiKey = str;
        this.reportFilesProvider = reportFilesProvider;
        this.handlingExceptionCheck = handlingExceptionCheck;
    }

    public synchronized void uploadReports(float f, com.crashlytics.android.core.ReportUploader.SendCheck sendCheck) {
        if (this.uploadThread != null) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Report upload has already been started.");
            return;
        }
        java.lang.Thread thread = new java.lang.Thread(new com.crashlytics.android.core.ReportUploader.Worker(f, sendCheck), "Crashlytics Report Uploader");
        this.uploadThread = thread;
        thread.start();
    }

    boolean isUploading() {
        return this.uploadThread != null;
    }

    boolean forceUpload(com.crashlytics.android.core.Report report) {
        boolean z;
        synchronized (this.fileAccessLock) {
            z = false;
            try {
                boolean zInvoke = this.createReportCall.invoke(new com.crashlytics.android.core.CreateReportRequest(this.apiKey, report));
                io.fabric.sdk.android.Logger logger = io.fabric.sdk.android.Fabric.getLogger();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("Crashlytics report upload ");
                sb.append(zInvoke ? "complete: " : "FAILED: ");
                sb.append(report.getIdentifier());
                logger.i(com.crashlytics.android.core.CrashlyticsCore.TAG, sb.toString());
                if (zInvoke) {
                    report.remove();
                    z = true;
                }
            } catch (java.lang.Exception e) {
                io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "Error occurred sending report " + report, e);
            }
        }
        return z;
    }

    java.util.List<com.crashlytics.android.core.Report> findReports() {
        java.io.File[] completeSessionFiles;
        java.io.File[] invalidSessionFiles;
        java.io.File[] nativeReportFiles;
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Checking for crash reports...");
        synchronized (this.fileAccessLock) {
            completeSessionFiles = this.reportFilesProvider.getCompleteSessionFiles();
            invalidSessionFiles = this.reportFilesProvider.getInvalidSessionFiles();
            nativeReportFiles = this.reportFilesProvider.getNativeReportFiles();
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (completeSessionFiles != null) {
            for (java.io.File file : completeSessionFiles) {
                io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Found crash report " + file.getPath());
                linkedList.add(new com.crashlytics.android.core.SessionReport(file));
            }
        }
        java.util.HashMap map = new java.util.HashMap();
        if (invalidSessionFiles != null) {
            for (java.io.File file2 : invalidSessionFiles) {
                java.lang.String sessionIdFromSessionFile = com.crashlytics.android.core.CrashlyticsController.getSessionIdFromSessionFile(file2);
                if (!map.containsKey(sessionIdFromSessionFile)) {
                    map.put(sessionIdFromSessionFile, new java.util.LinkedList());
                }
                ((java.util.List) map.get(sessionIdFromSessionFile)).add(file2);
            }
        }
        for (java.lang.String str : map.keySet()) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Found invalid session: " + str);
            java.util.List list = (java.util.List) map.get(str);
            linkedList.add(new com.crashlytics.android.core.InvalidSessionReport(str, (java.io.File[]) list.toArray(new java.io.File[list.size()])));
        }
        if (nativeReportFiles != null) {
            for (java.io.File file3 : nativeReportFiles) {
                linkedList.add(new com.crashlytics.android.core.NativeSessionReport(file3));
            }
        }
        if (linkedList.isEmpty()) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "No reports found.");
        }
        return linkedList;
    }

    private class Worker extends io.fabric.sdk.android.services.common.BackgroundPriorityRunnable {
        private final float delay;
        private final com.crashlytics.android.core.ReportUploader.SendCheck sendCheck;

        Worker(float f, com.crashlytics.android.core.ReportUploader.SendCheck sendCheck) {
            this.delay = f;
            this.sendCheck = sendCheck;
        }

        @Override // io.fabric.sdk.android.services.common.BackgroundPriorityRunnable
        public void onRun() {
            try {
                attemptUploadWithRetry();
            } catch (java.lang.Exception e) {
                io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "An unexpected error occurred while attempting to upload crash reports.", e);
            }
            com.crashlytics.android.core.ReportUploader.this.uploadThread = null;
        }

        private void attemptUploadWithRetry() {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Starting report processing in " + this.delay + " second(s)...");
            float f = this.delay;
            if (f > 0.0f) {
                try {
                    java.lang.Thread.sleep((long) (f * 1000.0f));
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                    return;
                }
            }
            java.util.List<com.crashlytics.android.core.Report> listFindReports = com.crashlytics.android.core.ReportUploader.this.findReports();
            if (com.crashlytics.android.core.ReportUploader.this.handlingExceptionCheck.isHandlingException()) {
                return;
            }
            if (!listFindReports.isEmpty() && !this.sendCheck.canSendReports()) {
                io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "User declined to send. Removing " + listFindReports.size() + " Report(s).");
                java.util.Iterator<com.crashlytics.android.core.Report> it = listFindReports.iterator();
                while (it.hasNext()) {
                    it.next().remove();
                }
                return;
            }
            int i = 0;
            while (!listFindReports.isEmpty() && !com.crashlytics.android.core.ReportUploader.this.handlingExceptionCheck.isHandlingException()) {
                io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Attempting to send " + listFindReports.size() + " report(s)");
                java.util.Iterator<com.crashlytics.android.core.Report> it2 = listFindReports.iterator();
                while (it2.hasNext()) {
                    com.crashlytics.android.core.ReportUploader.this.forceUpload(it2.next());
                }
                listFindReports = com.crashlytics.android.core.ReportUploader.this.findReports();
                if (!listFindReports.isEmpty()) {
                    int i2 = i + 1;
                    long j = com.crashlytics.android.core.ReportUploader.RETRY_INTERVALS[java.lang.Math.min(i, com.crashlytics.android.core.ReportUploader.RETRY_INTERVALS.length - 1)];
                    io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Report submisson: scheduling delayed retry in " + j + " seconds");
                    try {
                        java.lang.Thread.sleep(j * 1000);
                        i = i2;
                    } catch (java.lang.InterruptedException unused2) {
                        java.lang.Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
        }
    }
}
