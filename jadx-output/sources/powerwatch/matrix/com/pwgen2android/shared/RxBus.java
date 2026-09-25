package powerwatch.matrix.com.pwgen2android.shared;

/* JADX INFO: compiled from: RxBus.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0001R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00010\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "", "()V", "bus", "Lio/reactivex/subjects/Subject;", "kotlin.jvm.PlatformType", "events", "Lio/reactivex/Observable;", "getEvents", "()Lio/reactivex/Observable;", "send", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RxBus {
    private final io.reactivex.subjects.Subject<java.lang.Object> bus;

    public RxBus() {
        io.reactivex.subjects.Subject<T> serialized = io.reactivex.subjects.PublishSubject.create().toSerialized();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serialized, "create<Any>().toSerialized()");
        this.bus = serialized;
    }

    public final io.reactivex.Observable<java.lang.Object> getEvents() {
        return this.bus;
    }

    public final void send(java.lang.Object event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        this.bus.onNext(event);
    }
}
