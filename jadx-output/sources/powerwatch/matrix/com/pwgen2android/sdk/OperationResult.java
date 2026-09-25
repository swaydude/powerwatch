package powerwatch.matrix.com.pwgen2android.sdk;

/* JADX INFO: compiled from: DeviceCommunicationQueuer.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;", "", "operationID", "", "result", "completed", "", "error", "", "(Ljava/lang/String;Ljava/lang/Object;ZLjava/lang/Throwable;)V", "getCompleted", "()Z", "getError", "()Ljava/lang/Throwable;", "getOperationID", "()Ljava/lang/String;", "getResult", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
final /* data */ class OperationResult {
    private final boolean completed;
    private final java.lang.Throwable error;
    private final java.lang.String operationID;
    private final java.lang.Object result;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.OperationResult copy$default(powerwatch.matrix.com.pwgen2android.sdk.OperationResult operationResult, java.lang.String str, java.lang.Object obj, boolean z, java.lang.Throwable th, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = operationResult.operationID;
        }
        if ((i & 2) != 0) {
            obj = operationResult.result;
        }
        if ((i & 4) != 0) {
            z = operationResult.completed;
        }
        if ((i & 8) != 0) {
            th = operationResult.error;
        }
        return operationResult.copy(str, obj, z, th);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getOperationID() {
        return this.operationID;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.Object getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getCompleted() {
        return this.completed;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.Throwable getError() {
        return this.error;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.OperationResult copy(java.lang.String operationID, java.lang.Object result, boolean completed, java.lang.Throwable error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationID, "operationID");
        return new powerwatch.matrix.com.pwgen2android.sdk.OperationResult(operationID, result, completed, error);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.OperationResult)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.OperationResult operationResult = (powerwatch.matrix.com.pwgen2android.sdk.OperationResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.operationID, operationResult.operationID) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, operationResult.result) && this.completed == operationResult.completed && kotlin.jvm.internal.Intrinsics.areEqual(this.error, operationResult.error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        int iHashCode = this.operationID.hashCode() * 31;
        java.lang.Object obj = this.result;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        boolean z = this.completed;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode2 + r1) * 31;
        java.lang.Throwable th = this.error;
        return i + (th != null ? th.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "OperationResult(operationID=" + this.operationID + ", result=" + this.result + ", completed=" + this.completed + ", error=" + this.error + ')';
    }

    public OperationResult(java.lang.String operationID, java.lang.Object obj, boolean z, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationID, "operationID");
        this.operationID = operationID;
        this.result = obj;
        this.completed = z;
        this.error = th;
    }

    public /* synthetic */ OperationResult(java.lang.String str, java.lang.Object obj, boolean z, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : th);
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public final java.lang.Throwable getError() {
        return this.error;
    }

    public final java.lang.String getOperationID() {
        return this.operationID;
    }

    public final java.lang.Object getResult() {
        return this.result;
    }
}
