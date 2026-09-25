package powerwatch.matrix.com.pwgen2android.shared.ui.maps;

/* JADX INFO: compiled from: MapsModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;", "", "position", "Lcom/google/android/gms/maps/model/LatLng;", "heartRate", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;", "(Lcom/google/android/gms/maps/model/LatLng;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;)V", "getHeartRate", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;", "setHeartRate", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;)V", "getPosition", "()Lcom/google/android/gms/maps/model/LatLng;", "setPosition", "(Lcom/google/android/gms/maps/model/LatLng;)V", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class MapPosition {
    private powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate;
    private com.google.android.gms.maps.model.LatLng position;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition copy$default(powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition mapPosition, com.google.android.gms.maps.model.LatLng latLng, powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            latLng = mapPosition.position;
        }
        if ((i & 2) != 0) {
            heartRate = mapPosition.heartRate;
        }
        return mapPosition.copy(latLng, heartRate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.google.android.gms.maps.model.LatLng getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate getHeartRate() {
        return this.heartRate;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition copy(com.google.android.gms.maps.model.LatLng position, powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "position");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRate, "heartRate");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition(position, heartRate);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition mapPosition = (powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.position, mapPosition.position) && kotlin.jvm.internal.Intrinsics.areEqual(this.heartRate, mapPosition.heartRate);
    }

    public int hashCode() {
        return (this.position.hashCode() * 31) + this.heartRate.hashCode();
    }

    public java.lang.String toString() {
        return "MapPosition(position=" + this.position + ", heartRate=" + this.heartRate + ')';
    }

    public MapPosition(com.google.android.gms.maps.model.LatLng position, powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "position");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRate, "heartRate");
        this.position = position;
        this.heartRate = heartRate;
    }

    public /* synthetic */ MapPosition(com.google.android.gms.maps.model.LatLng latLng, powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(latLng, (i & 2) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate(0, 0L, 0L, 7, null) : heartRate);
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate getHeartRate() {
        return this.heartRate;
    }

    public final com.google.android.gms.maps.model.LatLng getPosition() {
        return this.position;
    }

    public final void setHeartRate(powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRate, "<set-?>");
        this.heartRate = heartRate;
    }

    public final void setPosition(com.google.android.gms.maps.model.LatLng latLng) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latLng, "<set-?>");
        this.position = latLng;
    }
}
