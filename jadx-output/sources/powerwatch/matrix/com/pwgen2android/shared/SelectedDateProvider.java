package powerwatch.matrix.com.pwgen2android.shared;

/* JADX INFO: compiled from: SelectedDateProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;", "", "selectedDate", "Ljava/util/Calendar;", "getSelectedDate", "()Ljava/util/Calendar;", "selectedDateObservable", "Lio/reactivex/Observable;", "getSelectedDateObservable", "()Lio/reactivex/Observable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface SelectedDateProvider {
    java.util.Calendar getSelectedDate();

    io.reactivex.Observable<java.util.Calendar> getSelectedDateObservable();
}
