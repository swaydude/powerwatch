package powerwatch.matrix.com.pwgen2android.shared;

/* JADX INFO: compiled from: BaseViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "setCompositeDisposable", "(Lio/reactivex/disposables/CompositeDisposable;)V", "onCleared", "", "onCreateView", "onDataReload", "onDestroy", "onDestroyView", "onPause", "onResume", "onStart", "onStop", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    private io.reactivex.disposables.CompositeDisposable compositeDisposable;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-3$lambda-2, reason: not valid java name */
    public static final void m2966lambda3$lambda2(java.lang.Throwable th) {
    }

    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public void onDataReload(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public void onDestroy(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public void onDestroyView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public void onPause(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public void onResume(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public void onStart(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public void onStop(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public BaseViewModel(final android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus) {
        this.compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        if (rxBus == null) {
            return;
        }
        getCompositeDisposable().add(rxBus.getEvents().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.-$$Lambda$BaseViewModel$B9Tlj-foB6P30O35d8AQkexmpeg
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.BaseViewModel.m2964lambda3$lambda0(obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.-$$Lambda$BaseViewModel$UHupsAak2vWw8m1s4ZQiChPE7WM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.BaseViewModel.m2965lambda3$lambda1(context, this, obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.-$$Lambda$BaseViewModel$yltwQNoz2Oa2pA6OsB0lE58tN5w
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.BaseViewModel.m2966lambda3$lambda2((java.lang.Throwable) obj);
            }
        }));
    }

    public /* synthetic */ BaseViewModel(android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : context, (i & 2) != 0 ? null : rxBus);
    }

    protected final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return this.compositeDisposable;
    }

    protected final void setCompositeDisposable(io.reactivex.disposables.CompositeDisposable compositeDisposable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compositeDisposable, "<set-?>");
        this.compositeDisposable = compositeDisposable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-3$lambda-0, reason: not valid java name */
    public static final boolean m2964lambda3$lambda0(java.lang.Object it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof powerwatch.matrix.com.pwgen2android.shared.DataReloadEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-3$lambda-1, reason: not valid java name */
    public static final void m2965lambda3$lambda1(android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.BaseViewModel this$0, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (context != null) {
            this$0.onDataReload(context);
        }
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
        super.onCleared();
        this.compositeDisposable.clear();
    }
}
