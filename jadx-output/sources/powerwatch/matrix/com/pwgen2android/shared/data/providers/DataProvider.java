package powerwatch.matrix.com.pwgen2android.shared.data.providers;

/* JADX INFO: compiled from: DataProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u001c\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/DataProvider;", "DATA", "ID", "", "loadData", "Lio/reactivex/Observable;", "", "page", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface DataProvider<DATA, ID> {
    io.reactivex.Observable<java.util.List<DATA>> loadData(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page);
}
