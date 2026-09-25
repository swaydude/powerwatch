package powerwatch.matrix.com.pwgen2android.sdk;

/* JADX INFO: compiled from: DeviceCommunicationQueuer.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;", "RESUlT", "", "operationObs", "Lio/reactivex/Observable;", "operationType", "Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;", "operationID", "", "(Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;)V", "getOperationID", "()Ljava/lang/String;", "getOperationObs", "()Lio/reactivex/Observable;", "getOperationType", "()Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class DeviceCommunicationOperation<RESUlT> {
    private final java.lang.String operationID;
    private final io.reactivex.Observable<RESUlT> operationObs;
    private final powerwatch.matrix.com.pwgen2android.sdk.OperationType operationType;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation copy$default(powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation deviceCommunicationOperation, io.reactivex.Observable observable, powerwatch.matrix.com.pwgen2android.sdk.OperationType operationType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            observable = deviceCommunicationOperation.operationObs;
        }
        if ((i & 2) != 0) {
            operationType = deviceCommunicationOperation.operationType;
        }
        if ((i & 4) != 0) {
            str = deviceCommunicationOperation.operationID;
        }
        return deviceCommunicationOperation.copy(observable, operationType, str);
    }

    public final io.reactivex.Observable<RESUlT> component1() {
        return this.operationObs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.OperationType getOperationType() {
        return this.operationType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getOperationID() {
        return this.operationID;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation<RESUlT> copy(io.reactivex.Observable<RESUlT> operationObs, powerwatch.matrix.com.pwgen2android.sdk.OperationType operationType, java.lang.String operationID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationObs, "operationObs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationType, "operationType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationID, "operationID");
        return new powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation<>(operationObs, operationType, operationID);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation deviceCommunicationOperation = (powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.operationObs, deviceCommunicationOperation.operationObs) && kotlin.jvm.internal.Intrinsics.areEqual(this.operationType, deviceCommunicationOperation.operationType) && kotlin.jvm.internal.Intrinsics.areEqual(this.operationID, deviceCommunicationOperation.operationID);
    }

    public int hashCode() {
        return (((this.operationObs.hashCode() * 31) + this.operationType.hashCode()) * 31) + this.operationID.hashCode();
    }

    public java.lang.String toString() {
        return "DeviceCommunicationOperation(operationObs=" + this.operationObs + ", operationType=" + this.operationType + ", operationID=" + this.operationID + ')';
    }

    public DeviceCommunicationOperation(io.reactivex.Observable<RESUlT> operationObs, powerwatch.matrix.com.pwgen2android.sdk.OperationType operationType, java.lang.String operationID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationObs, "operationObs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationType, "operationType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationID, "operationID");
        this.operationObs = operationObs;
        this.operationType = operationType;
        this.operationID = operationID;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DeviceCommunicationOperation(io.reactivex.Observable observable, powerwatch.matrix.com.pwgen2android.sdk.OperationType operationType, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        operationType = (i & 2) != 0 ? powerwatch.matrix.com.pwgen2android.sdk.OperationType.Delayer.INSTANCE : operationType;
        if ((i & 4) != 0) {
            str = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        this(observable, operationType, str);
    }

    public final java.lang.String getOperationID() {
        return this.operationID;
    }

    public final io.reactivex.Observable<RESUlT> getOperationObs() {
        return this.operationObs;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.OperationType getOperationType() {
        return this.operationType;
    }
}
