package powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps;

/* JADX INFO: compiled from: AGPSRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;", "", com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT, "", "fileName", "", "([BLjava/lang/String;)V", "getContent", "()[B", "getFileName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class GPSFile {
    private final byte[] content;
    private final java.lang.String fileName;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile copy$default(powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile gPSFile, byte[] bArr, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bArr = gPSFile.content;
        }
        if ((i & 2) != 0) {
            str = gPSFile.fileName;
        }
        return gPSFile.copy(bArr, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte[] getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getFileName() {
        return this.fileName;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile copy(byte[] content, java.lang.String fileName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile(content, fileName);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile gPSFile = (powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.content, gPSFile.content) && kotlin.jvm.internal.Intrinsics.areEqual(this.fileName, gPSFile.fileName);
    }

    public int hashCode() {
        return (java.util.Arrays.hashCode(this.content) * 31) + this.fileName.hashCode();
    }

    public java.lang.String toString() {
        return "GPSFile(content=" + java.util.Arrays.toString(this.content) + ", fileName=" + this.fileName + ')';
    }

    public GPSFile(byte[] content, java.lang.String fileName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.content = content;
        this.fileName = fileName;
    }

    public final byte[] getContent() {
        return this.content;
    }

    public final java.lang.String getFileName() {
        return this.fileName;
    }
}
