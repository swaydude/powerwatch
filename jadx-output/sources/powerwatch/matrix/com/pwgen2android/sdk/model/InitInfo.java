package powerwatch.matrix.com.pwgen2android.sdk.model;

/* JADX INFO: compiled from: Entities.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/model/InitInfo;", "", "isInitCompleted", "", "(Z)V", "()Z", "component1", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class InitInfo {
    private final boolean isInitCompleted;

    public InitInfo() {
        this(false, 1, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.model.InitInfo copy$default(powerwatch.matrix.com.pwgen2android.sdk.model.InitInfo initInfo, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = initInfo.isInitCompleted;
        }
        return initInfo.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsInitCompleted() {
        return this.isInitCompleted;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.model.InitInfo copy(boolean isInitCompleted) {
        return new powerwatch.matrix.com.pwgen2android.sdk.model.InitInfo(isInitCompleted);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof powerwatch.matrix.com.pwgen2android.sdk.model.InitInfo) && this.isInitCompleted == ((powerwatch.matrix.com.pwgen2android.sdk.model.InitInfo) other).isInitCompleted;
    }

    public int hashCode() {
        boolean z = this.isInitCompleted;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public java.lang.String toString() {
        return "InitInfo(isInitCompleted=" + this.isInitCompleted + ')';
    }

    public InitInfo(boolean z) {
        this.isInitCompleted = z;
    }

    public /* synthetic */ InitInfo(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean isInitCompleted() {
        return this.isInitCompleted;
    }
}
