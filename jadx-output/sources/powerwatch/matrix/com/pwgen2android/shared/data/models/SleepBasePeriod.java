package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: ActivityPeriodsModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u0018\u0010\u0003\u001a\u00020\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/BaseActivityPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;", "restlessMinutes", "", "getRestlessMinutes", "()I", "setRestlessMinutes", "(I)V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface SleepBasePeriod extends powerwatch.matrix.com.pwgen2android.shared.data.models.BaseActivityPeriod, powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepBaseLog {
    int getRestlessMinutes();

    void setRestlessMinutes(int i);
}
