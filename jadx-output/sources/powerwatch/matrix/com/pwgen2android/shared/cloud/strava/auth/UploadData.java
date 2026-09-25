package powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth;

/* JADX INFO: compiled from: StravaApiService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;", "", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "", "descrpiton", "data", "filename", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "getDescrpiton", "getFilename", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class UploadData {
    private final java.lang.String data;
    private final java.lang.String descrpiton;
    private final java.lang.String filename;
    private final java.lang.String name;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData copy$default(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData uploadData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = uploadData.name;
        }
        if ((i & 2) != 0) {
            str2 = uploadData.descrpiton;
        }
        if ((i & 4) != 0) {
            str3 = uploadData.data;
        }
        if ((i & 8) != 0) {
            str4 = uploadData.filename;
        }
        return uploadData.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getDescrpiton() {
        return this.descrpiton;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getFilename() {
        return this.filename;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData copy(java.lang.String name, java.lang.String descrpiton, java.lang.String data, java.lang.String filename) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descrpiton, "descrpiton");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filename, "filename");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData(name, descrpiton, data, filename);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData uploadData = (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, uploadData.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.descrpiton, uploadData.descrpiton) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, uploadData.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.filename, uploadData.filename);
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.descrpiton.hashCode()) * 31) + this.data.hashCode()) * 31) + this.filename.hashCode();
    }

    public java.lang.String toString() {
        return "UploadData(name=" + this.name + ", descrpiton=" + this.descrpiton + ", data=" + this.data + ", filename=" + this.filename + ')';
    }

    public UploadData(java.lang.String name, java.lang.String descrpiton, java.lang.String data, java.lang.String filename) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descrpiton, "descrpiton");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filename, "filename");
        this.name = name;
        this.descrpiton = descrpiton;
        this.data = data;
        this.filename = filename;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getDescrpiton() {
        return this.descrpiton;
    }

    public final java.lang.String getData() {
        return this.data;
    }

    public final java.lang.String getFilename() {
        return this.filename;
    }
}
