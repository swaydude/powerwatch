package powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent;

/* JADX INFO: compiled from: UserActivityViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;", "", "hasLocations", "", "hasHeartRate", "(ZZ)V", "getHasHeartRate", "()Z", "setHasHeartRate", "(Z)V", "getHasLocations", "setHasLocations", "Baidu", "Google", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType$Google;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType$Baidu;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class MapType {
    private boolean hasHeartRate;
    private boolean hasLocations;

    public /* synthetic */ MapType(boolean z, boolean z2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2);
    }

    /* JADX INFO: compiled from: UserActivityViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType$Google;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;", "hasLocations", "", "hasHeartRate", "(ZZ)V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Google extends powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MapType {
        public Google(boolean z, boolean z2) {
            super(z, z2, null);
        }
    }

    private MapType(boolean z, boolean z2) {
        this.hasLocations = z;
        this.hasHeartRate = z2;
    }

    public final boolean getHasHeartRate() {
        return this.hasHeartRate;
    }

    public final boolean getHasLocations() {
        return this.hasLocations;
    }

    public final void setHasHeartRate(boolean z) {
        this.hasHeartRate = z;
    }

    public final void setHasLocations(boolean z) {
        this.hasLocations = z;
    }

    /* JADX INFO: compiled from: UserActivityViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType$Baidu;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;", "hasLocations", "", "hasHeartRate", "(ZZ)V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Baidu extends powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MapType {
        public Baidu(boolean z, boolean z2) {
            super(z, z2, null);
        }
    }
}
