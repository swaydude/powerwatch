package powerwatch.matrix.com.pwgen2android.shared.cloud;

/* JADX INFO: compiled from: CloudErrorResolver.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/RetrofitErrorResponse;", "", "code", "", "error", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/ErrorBody;", "cloudErrorType", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;", "(ILpowerwatch/matrix/com/pwgen2android/shared/cloud/ErrorBody;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;)V", "getCloudErrorType", "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;", "getCode", "()I", "getError", "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/ErrorBody;", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class RetrofitErrorResponse {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType cloudErrorType;
    private final int code;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.ErrorBody error;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.RetrofitErrorResponse copy$default(powerwatch.matrix.com.pwgen2android.shared.cloud.RetrofitErrorResponse retrofitErrorResponse, int i, powerwatch.matrix.com.pwgen2android.shared.cloud.ErrorBody errorBody, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType cloudErrorType, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = retrofitErrorResponse.code;
        }
        if ((i2 & 2) != 0) {
            errorBody = retrofitErrorResponse.error;
        }
        if ((i2 & 4) != 0) {
            cloudErrorType = retrofitErrorResponse.cloudErrorType;
        }
        return retrofitErrorResponse.copy(i, errorBody, cloudErrorType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.ErrorBody getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType getCloudErrorType() {
        return this.cloudErrorType;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.RetrofitErrorResponse copy(int code, powerwatch.matrix.com.pwgen2android.shared.cloud.ErrorBody error, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType cloudErrorType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudErrorType, "cloudErrorType");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.RetrofitErrorResponse(code, error, cloudErrorType);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.RetrofitErrorResponse)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.cloud.RetrofitErrorResponse retrofitErrorResponse = (powerwatch.matrix.com.pwgen2android.shared.cloud.RetrofitErrorResponse) other;
        return this.code == retrofitErrorResponse.code && kotlin.jvm.internal.Intrinsics.areEqual(this.error, retrofitErrorResponse.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.cloudErrorType, retrofitErrorResponse.cloudErrorType);
    }

    public int hashCode() {
        return (((this.code * 31) + this.error.hashCode()) * 31) + this.cloudErrorType.hashCode();
    }

    public java.lang.String toString() {
        return "RetrofitErrorResponse(code=" + this.code + ", error=" + this.error + ", cloudErrorType=" + this.cloudErrorType + ')';
    }

    public RetrofitErrorResponse(int i, powerwatch.matrix.com.pwgen2android.shared.cloud.ErrorBody error, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType cloudErrorType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudErrorType, "cloudErrorType");
        this.code = i;
        this.error = error;
        this.cloudErrorType = cloudErrorType;
    }

    public /* synthetic */ RetrofitErrorResponse(int i, powerwatch.matrix.com.pwgen2android.shared.cloud.ErrorBody errorBody, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.Unknown unknown, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, errorBody, (i2 & 4) != 0 ? powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.Unknown.INSTANCE : unknown);
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType getCloudErrorType() {
        return this.cloudErrorType;
    }

    public final int getCode() {
        return this.code;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.ErrorBody getError() {
        return this.error;
    }
}
