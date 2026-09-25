package powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters;

/* JADX INFO: compiled from: WatchLogModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingBaseLog;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchBaseLog;", "distance", "", "getDistance", "()D", "setDistance", "(D)V", "steps", "", "getSteps", "()I", "setSteps", "(I)V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface WalkingBaseLog extends powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WatchBaseLog {
    double getDistance();

    int getSteps();

    void setDistance(double d);

    void setSteps(int i);
}
