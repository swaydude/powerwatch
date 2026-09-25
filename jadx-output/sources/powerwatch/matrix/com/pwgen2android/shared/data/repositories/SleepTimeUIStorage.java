package powerwatch.matrix.com.pwgen2android.shared.data.repositories;

/* JADX INFO: compiled from: SleepTimeRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\u0007J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;", "", "sleepTimeStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;)V", "possibleValues", "", "", "getDisplayValue", "getPossibleValues", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SleepTimeUIStorage {
    private final java.util.List<java.lang.String> possibleValues;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage sleepTimeStorage;

    public SleepTimeUIStorage(powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage sleepTimeStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepTimeStorage, "sleepTimeStorage");
        this.sleepTimeStorage = sleepTimeStorage;
        java.util.ArrayList arrayList = new java.util.ArrayList(24);
        for (int i = 0; i < 24; i++) {
            arrayList.add(i + ":00");
        }
        this.possibleValues = arrayList;
    }

    public final java.util.List<java.lang.String> getPossibleValues() {
        return this.possibleValues;
    }

    public final java.lang.String getDisplayValue() {
        return this.sleepTimeStorage.getSleepTime() + ":00";
    }
}
