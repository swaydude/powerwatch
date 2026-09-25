package powerwatch.matrix.com.pwgen2android.report.ui.bridge;

/* JADX INFO: compiled from: AppWebViewImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;", "Landroid/webkit/WebView;", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "pageProgress", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "Lio/reactivex/Observable;", "setJavaScriptEnabled", "", "enabled", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AppWebViewImpl extends android.webkit.WebView implements powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebView {
    private final io.reactivex.subjects.PublishSubject<java.lang.Integer> pageProgress;

    public void _$_clearFindViewByIdCache() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWebViewImpl(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        io.reactivex.subjects.PublishSubject<java.lang.Integer> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<Int>()");
        this.pageProgress = publishSubjectCreate;
        getSettings().setAllowUniversalAccessFromFileURLs(true);
        setWebChromeClient(new android.webkit.WebChromeClient() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewImpl.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(android.webkit.WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewImpl.this.pageProgress.onNext(java.lang.Integer.valueOf(newProgress));
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWebViewImpl(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "attrs");
        io.reactivex.subjects.PublishSubject<java.lang.Integer> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<Int>()");
        this.pageProgress = publishSubjectCreate;
        getSettings().setAllowUniversalAccessFromFileURLs(true);
        setWebChromeClient(new android.webkit.WebChromeClient() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewImpl.2
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(android.webkit.WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewImpl.this.pageProgress.onNext(java.lang.Integer.valueOf(newProgress));
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebView
    public void setJavaScriptEnabled(boolean enabled) {
        getSettings().setJavaScriptEnabled(enabled);
    }

    @Override // powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebView
    public io.reactivex.Observable<java.lang.Integer> pageProgress() {
        return this.pageProgress;
    }
}
