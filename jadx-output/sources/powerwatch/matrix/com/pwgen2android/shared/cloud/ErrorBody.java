package powerwatch.matrix.com.pwgen2android.shared.cloud;

/* JADX INFO: compiled from: CloudErrorResolver.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/ErrorBody;", "", "errorType", "", "errorMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "getErrorType", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class ErrorBody {

    @com.google.gson.annotations.SerializedName("error_description")
    private final java.lang.String errorMessage;

    @com.google.gson.annotations.SerializedName("error")
    private final java.lang.String errorType;

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorBody() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.ErrorBody copy$default(powerwatch.matrix.com.pwgen2android.shared.cloud.ErrorBody errorBody, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = errorBody.errorType;
        }
        if ((i & 2) != 0) {
            str2 = errorBody.errorMessage;
        }
        return errorBody.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getErrorType() {
        return this.errorType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.ErrorBody copy(java.lang.String errorType, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "errorType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.ErrorBody(errorType, errorMessage);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.ErrorBody)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.cloud.ErrorBody errorBody = (powerwatch.matrix.com.pwgen2android.shared.cloud.ErrorBody) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.errorType, errorBody.errorType) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, errorBody.errorMessage);
    }

    public int hashCode() {
        return (this.errorType.hashCode() * 31) + this.errorMessage.hashCode();
    }

    public java.lang.String toString() {
        return "ErrorBody(errorType=" + this.errorType + ", errorMessage=" + this.errorMessage + ')';
    }

    public ErrorBody(java.lang.String errorType, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "errorType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.errorType = errorType;
        this.errorMessage = errorMessage;
    }

    public /* synthetic */ ErrorBody(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "Unknown" : str, (i & 2) != 0 ? "Unknown" : str2);
    }

    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final java.lang.String getErrorType() {
        return this.errorType;
    }
}
