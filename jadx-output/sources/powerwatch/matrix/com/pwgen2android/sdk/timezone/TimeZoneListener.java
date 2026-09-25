package powerwatch.matrix.com.pwgen2android.sdk.timezone;

/* JADX INFO: compiled from: TimezoneListener.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListener;", "", "timeZoneChanged", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface TimeZoneListener {
    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.timezone.ChangeReason> timeZoneChanged();
}
