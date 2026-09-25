package io.fabric.sdk.android.services.common;

/* JADX INFO: loaded from: classes2.dex */
public class TimingMetric {
    private final boolean disabled;
    private long duration;
    private final java.lang.String eventName;
    private long start;
    private final java.lang.String tag;

    public TimingMetric(java.lang.String str, java.lang.String str2) {
        this.eventName = str;
        this.tag = str2;
        this.disabled = !android.util.Log.isLoggable(str2, 2);
    }

    public synchronized void startMeasuring() {
        if (this.disabled) {
            return;
        }
        this.start = android.os.SystemClock.elapsedRealtime();
        this.duration = 0L;
    }

    public synchronized void stopMeasuring() {
        if (this.disabled) {
            return;
        }
        if (this.duration != 0) {
            return;
        }
        this.duration = android.os.SystemClock.elapsedRealtime() - this.start;
        reportToLog();
    }

    public long getDuration() {
        return this.duration;
    }

    private void reportToLog() {
        android.util.Log.v(this.tag, this.eventName + ": " + this.duration + "ms");
    }
}
