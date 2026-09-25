package powerwatch.matrix.com.pwgen2android.shared;

/* JADX INFO: compiled from: Products.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;", "Ljava/io/Serializable;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "", "image", "", "(Ljava/lang/String;I)V", "getImage", "()I", "getName", "()Ljava/lang/String;", "PowerWatch2", "PowerWatchBlackOps", "PowerWatchSilver", "PowerWatchX", "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatchSilver;", "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatchBlackOps;", "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatchX;", "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatch2;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class WatchProduct implements java.io.Serializable {
    private final int image;
    private final java.lang.String name;

    public /* synthetic */ WatchProduct(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    private WatchProduct(java.lang.String str, int i) {
        this.name = str;
        this.image = i;
    }

    public final int getImage() {
        return this.image;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    /* JADX INFO: compiled from: Products.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatchSilver;", "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class PowerWatchSilver extends powerwatch.matrix.com.pwgen2android.shared.WatchProduct {
        public static final powerwatch.matrix.com.pwgen2android.shared.WatchProduct.PowerWatchSilver INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.WatchProduct.PowerWatchSilver();

        private PowerWatchSilver() {
            super("PowerWatch Silver", powerwatch.matrix.com.pwgen2android.R.mipmap.powerwatch_silver, null);
        }
    }

    /* JADX INFO: compiled from: Products.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatchBlackOps;", "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class PowerWatchBlackOps extends powerwatch.matrix.com.pwgen2android.shared.WatchProduct {
        public static final powerwatch.matrix.com.pwgen2android.shared.WatchProduct.PowerWatchBlackOps INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.WatchProduct.PowerWatchBlackOps();

        private PowerWatchBlackOps() {
            super("PowerWatch Black Ops", powerwatch.matrix.com.pwgen2android.R.mipmap.powerwatch_ops, null);
        }
    }

    /* JADX INFO: compiled from: Products.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatchX;", "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class PowerWatchX extends powerwatch.matrix.com.pwgen2android.shared.WatchProduct {
        public static final powerwatch.matrix.com.pwgen2android.shared.WatchProduct.PowerWatchX INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.WatchProduct.PowerWatchX();

        private PowerWatchX() {
            super("PowerWatch X", powerwatch.matrix.com.pwgen2android.R.mipmap.powerwatch_x, null);
        }
    }

    /* JADX INFO: compiled from: Products.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatch2;", "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class PowerWatch2 extends powerwatch.matrix.com.pwgen2android.shared.WatchProduct {
        public static final powerwatch.matrix.com.pwgen2android.shared.WatchProduct.PowerWatch2 INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.WatchProduct.PowerWatch2();

        private PowerWatch2() {
            super("PowerWatch 2", powerwatch.matrix.com.pwgen2android.R.mipmap.watch2_welcome, null);
        }
    }
}
