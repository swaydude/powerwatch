package powerwatch.matrix.com.pwgen2android.sdk.technologies;

/* JADX INFO: compiled from: Technology.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0019\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleTechnology;", "T", "", "accessoryStatus", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;", "addAccessory", "", "accessoryID", "", "removeAccessory", "startMonitoring", "filter", "(Ljava/lang/Object;)V", "stopMonitoring", "destroyAll", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface BleTechnology<T> {
    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.Accessory> accessoryStatus();

    void addAccessory(java.lang.String accessoryID);

    void removeAccessory(java.lang.String accessoryID);

    void startMonitoring(T filter);

    void stopMonitoring(boolean destroyAll);

    /* JADX INFO: compiled from: Technology.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startMonitoring$default(powerwatch.matrix.com.pwgen2android.sdk.technologies.BleTechnology bleTechnology, java.lang.Object obj, int i, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startMonitoring");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            bleTechnology.startMonitoring(obj);
        }

        public static /* synthetic */ void stopMonitoring$default(powerwatch.matrix.com.pwgen2android.sdk.technologies.BleTechnology bleTechnology, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopMonitoring");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            bleTechnology.stopMonitoring(z);
        }
    }
}
