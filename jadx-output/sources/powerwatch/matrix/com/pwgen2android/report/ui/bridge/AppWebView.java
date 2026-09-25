package powerwatch.matrix.com.pwgen2android.report.ui.bridge;

/* JADX INFO: compiled from: AppWebView.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0006H&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\bH&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;", "", "addJavascriptInterface", "", "jsInterface", "injectedVariable", "", "canGoBack", "", "destroy", "evaluateJavascript", "script", "resultCallback", "Landroid/webkit/ValueCallback;", "goBack", "loadUrl", "url", "pageProgress", "Lio/reactivex/Observable;", "", "setJavaScriptEnabled", "enabled", "setWebViewClient", "webViewClient", "Landroid/webkit/WebViewClient;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface AppWebView {
    void addJavascriptInterface(java.lang.Object jsInterface, java.lang.String injectedVariable);

    boolean canGoBack();

    void destroy();

    void evaluateJavascript(java.lang.String script, android.webkit.ValueCallback<java.lang.String> resultCallback);

    void goBack();

    void loadUrl(java.lang.String url);

    io.reactivex.Observable<java.lang.Integer> pageProgress();

    void setJavaScriptEnabled(boolean enabled);

    void setWebViewClient(android.webkit.WebViewClient webViewClient);
}
