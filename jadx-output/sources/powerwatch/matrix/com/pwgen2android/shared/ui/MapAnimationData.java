package powerwatch.matrix.com.pwgen2android.shared.ui;

/* JADX INFO: compiled from: RunningAnimator.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/MapAnimationData;", "", "currentAnimationItem", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;", "totalDistance", "", androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, "", "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;FI)V", "getCurrentAnimationItem", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;", "getProgress", "()I", "getTotalDistance", "()F", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class MapAnimationData {
    private final powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation currentAnimationItem;
    private final int progress;
    private final float totalDistance;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.MapAnimationData copy$default(powerwatch.matrix.com.pwgen2android.shared.ui.MapAnimationData mapAnimationData, powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation runningAnimation, float f, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            runningAnimation = mapAnimationData.currentAnimationItem;
        }
        if ((i2 & 2) != 0) {
            f = mapAnimationData.totalDistance;
        }
        if ((i2 & 4) != 0) {
            i = mapAnimationData.progress;
        }
        return mapAnimationData.copy(runningAnimation, f, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation getCurrentAnimationItem() {
        return this.currentAnimationItem;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getTotalDistance() {
        return this.totalDistance;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.MapAnimationData copy(powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation currentAnimationItem, float totalDistance, int progress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAnimationItem, "currentAnimationItem");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.MapAnimationData(currentAnimationItem, totalDistance, progress);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.ui.MapAnimationData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.MapAnimationData mapAnimationData = (powerwatch.matrix.com.pwgen2android.shared.ui.MapAnimationData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.currentAnimationItem, mapAnimationData.currentAnimationItem) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.totalDistance), (java.lang.Object) java.lang.Float.valueOf(mapAnimationData.totalDistance)) && this.progress == mapAnimationData.progress;
    }

    public int hashCode() {
        return (((this.currentAnimationItem.hashCode() * 31) + java.lang.Float.floatToIntBits(this.totalDistance)) * 31) + this.progress;
    }

    public java.lang.String toString() {
        return "MapAnimationData(currentAnimationItem=" + this.currentAnimationItem + ", totalDistance=" + this.totalDistance + ", progress=" + this.progress + ')';
    }

    public MapAnimationData(powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation currentAnimationItem, float f, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAnimationItem, "currentAnimationItem");
        this.currentAnimationItem = currentAnimationItem;
        this.totalDistance = f;
        this.progress = i;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation getCurrentAnimationItem() {
        return this.currentAnimationItem;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final float getTotalDistance() {
        return this.totalDistance;
    }
}
