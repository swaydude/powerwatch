package powerwatch.matrix.com.pwgen2android.shared.data.repositories;

/* JADX INFO: compiled from: SleepTimeRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;", "", "sleepTimeStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;)V", "getSleepTime", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SleepTimeCloudStorage {
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage sleepTimeStorage;

    public SleepTimeCloudStorage(powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage sleepTimeStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepTimeStorage, "sleepTimeStorage");
        this.sleepTimeStorage = sleepTimeStorage;
    }

    public final int getSleepTime() {
        int sleepTime = this.sleepTimeStorage.getSleepTime() - 9;
        return sleepTime < 0 ? java.lang.Math.abs(sleepTime) : 24 - sleepTime;
    }
}
