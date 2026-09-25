package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Gen2Executor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013¨\u0006!"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;", "", "dataInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;", "successReceived", "", "validCRC", "error", "", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;ZZLjava/lang/Throwable;)V", "getDataInfo", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;", "getError", "()Ljava/lang/Throwable;", "setError", "(Ljava/lang/Throwable;)V", "getSuccessReceived", "()Z", "setSuccessReceived", "(Z)V", "getValidCRC", "setValidCRC", "component1", "component2", "component3", "component4", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Gen2AckData {
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo;
    private java.lang.Throwable error;
    private boolean successReceived;
    private boolean validCRC;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData gen2AckData, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo, boolean z, boolean z2, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            gen2DataInfo = gen2AckData.dataInfo;
        }
        if ((i & 2) != 0) {
            z = gen2AckData.successReceived;
        }
        if ((i & 4) != 0) {
            z2 = gen2AckData.validCRC;
        }
        if ((i & 8) != 0) {
            th = gen2AckData.error;
        }
        return gen2AckData.copy(gen2DataInfo, z, z2, th);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo getDataInfo() {
        return this.dataInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSuccessReceived() {
        return this.successReceived;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getValidCRC() {
        return this.validCRC;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.Throwable getError() {
        return this.error;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData copy(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo, boolean successReceived, boolean validCRC, java.lang.Throwable error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData(dataInfo, successReceived, validCRC, error);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData gen2AckData = (powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.dataInfo, gen2AckData.dataInfo) && this.successReceived == gen2AckData.successReceived && this.validCRC == gen2AckData.validCRC && kotlin.jvm.internal.Intrinsics.areEqual(this.error, gen2AckData.error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.dataInfo.hashCode() * 31;
        boolean z = this.successReceived;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.validCRC;
        int i2 = (i + (z2 ? 1 : z2)) * 31;
        java.lang.Throwable th = this.error;
        return i2 + (th == null ? 0 : th.hashCode());
    }

    public java.lang.String toString() {
        return "Gen2AckData(dataInfo=" + this.dataInfo + ", successReceived=" + this.successReceived + ", validCRC=" + this.validCRC + ", error=" + this.error + ')';
    }

    public Gen2AckData(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo, boolean z, boolean z2, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        this.dataInfo = dataInfo;
        this.successReceived = z;
        this.validCRC = z2;
        this.error = th;
    }

    public /* synthetic */ Gen2AckData(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo, boolean z, boolean z2, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(gen2DataInfo, z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? null : th);
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo getDataInfo() {
        return this.dataInfo;
    }

    public final java.lang.Throwable getError() {
        return this.error;
    }

    public final boolean getSuccessReceived() {
        return this.successReceived;
    }

    public final boolean getValidCRC() {
        return this.validCRC;
    }

    public final void setError(java.lang.Throwable th) {
        this.error = th;
    }

    public final void setSuccessReceived(boolean z) {
        this.successReceived = z;
    }

    public final void setValidCRC(boolean z) {
        this.validCRC = z;
    }
}
