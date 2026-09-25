package powerwatch.matrix.com.pwgen2android.shared.sync;

/* JADX INFO: compiled from: WatchSynchronizer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;", "", "putInOperationQueue", "", "scheduleTime", "Ljava/util/concurrent/TimeUnit;", "deviceInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "isFromOTA", "isGPSUpdateNeeded", "(ZLjava/util/concurrent/TimeUnit;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;ZZ)V", "getDeviceInfo", "()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "setDeviceInfo", "(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V", "()Z", "setGPSUpdateNeeded", "(Z)V", "getPutInOperationQueue", "getScheduleTime", "()Ljava/util/concurrent/TimeUnit;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class SyncConfig {
    private powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo;
    private final boolean isFromOTA;
    private boolean isGPSUpdateNeeded;
    private final boolean putInOperationQueue;
    private final java.util.concurrent.TimeUnit scheduleTime;

    public SyncConfig() {
        this(false, null, null, false, false, 31, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig copy$default(powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig syncConfig, boolean z, java.util.concurrent.TimeUnit timeUnit, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = syncConfig.putInOperationQueue;
        }
        if ((i & 2) != 0) {
            timeUnit = syncConfig.scheduleTime;
        }
        java.util.concurrent.TimeUnit timeUnit2 = timeUnit;
        if ((i & 4) != 0) {
            deviceInfo = syncConfig.deviceInfo;
        }
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo2 = deviceInfo;
        if ((i & 8) != 0) {
            z2 = syncConfig.isFromOTA;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            z3 = syncConfig.isGPSUpdateNeeded;
        }
        return syncConfig.copy(z, timeUnit2, deviceInfo2, z4, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getPutInOperationQueue() {
        return this.putInOperationQueue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.util.concurrent.TimeUnit getScheduleTime() {
        return this.scheduleTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsFromOTA() {
        return this.isFromOTA;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsGPSUpdateNeeded() {
        return this.isGPSUpdateNeeded;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig copy(boolean putInOperationQueue, java.util.concurrent.TimeUnit scheduleTime, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, boolean isFromOTA, boolean isGPSUpdateNeeded) {
        return new powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig(putInOperationQueue, scheduleTime, deviceInfo, isFromOTA, isGPSUpdateNeeded);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig syncConfig = (powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig) other;
        return this.putInOperationQueue == syncConfig.putInOperationQueue && this.scheduleTime == syncConfig.scheduleTime && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceInfo, syncConfig.deviceInfo) && this.isFromOTA == syncConfig.isFromOTA && this.isGPSUpdateNeeded == syncConfig.isGPSUpdateNeeded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z = this.putInOperationQueue;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        java.util.concurrent.TimeUnit timeUnit = this.scheduleTime;
        int iHashCode = (i + (timeUnit == null ? 0 : timeUnit.hashCode())) * 31;
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo = this.deviceInfo;
        int iHashCode2 = (iHashCode + (deviceInfo != null ? deviceInfo.hashCode() : 0)) * 31;
        boolean z2 = this.isFromOTA;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (iHashCode2 + r2) * 31;
        boolean z3 = this.isGPSUpdateNeeded;
        return i2 + (z3 ? 1 : z3);
    }

    public java.lang.String toString() {
        return "SyncConfig(putInOperationQueue=" + this.putInOperationQueue + ", scheduleTime=" + this.scheduleTime + ", deviceInfo=" + this.deviceInfo + ", isFromOTA=" + this.isFromOTA + ", isGPSUpdateNeeded=" + this.isGPSUpdateNeeded + ')';
    }

    public SyncConfig(boolean z, java.util.concurrent.TimeUnit timeUnit, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, boolean z2, boolean z3) {
        this.putInOperationQueue = z;
        this.scheduleTime = timeUnit;
        this.deviceInfo = deviceInfo;
        this.isFromOTA = z2;
        this.isGPSUpdateNeeded = z3;
    }

    public /* synthetic */ SyncConfig(boolean z, java.util.concurrent.TimeUnit timeUnit, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : timeUnit, (i & 4) == 0 ? deviceInfo : null, (i & 8) == 0 ? z2 : true, (i & 16) != 0 ? false : z3);
    }

    public final boolean getPutInOperationQueue() {
        return this.putInOperationQueue;
    }

    public final java.util.concurrent.TimeUnit getScheduleTime() {
        return this.scheduleTime;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final void setDeviceInfo(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public final boolean isFromOTA() {
        return this.isFromOTA;
    }

    public final boolean isGPSUpdateNeeded() {
        return this.isGPSUpdateNeeded;
    }

    public final void setGPSUpdateNeeded(boolean z) {
        this.isGPSUpdateNeeded = z;
    }
}
