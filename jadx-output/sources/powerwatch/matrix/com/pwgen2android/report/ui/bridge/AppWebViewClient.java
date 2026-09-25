package powerwatch.matrix.com.pwgen2android.report.ui.bridge;

/* JADX INFO: compiled from: AppWebViewClient.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\r\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0013\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\u0014\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;", "Landroid/webkit/WebViewClient;", "()V", "webViewLifecycleListener", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewLifecycleListener;", "webViewNavigationListener", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewNavigationListener;", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "setWebViewLifecycleListener", "setWebViewNavigationListener", "shouldOverrideUrlLoading", "", "WebViewLifecycleListener", "WebViewNavigationListener", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AppWebViewClient extends android.webkit.WebViewClient {
    private powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewClient.WebViewLifecycleListener webViewLifecycleListener;
    private powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewClient.WebViewNavigationListener webViewNavigationListener;

    /* JADX INFO: compiled from: AppWebViewClient.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001c\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewLifecycleListener;", "", "onPageFinished", "", "url", "", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface WebViewLifecycleListener {
        void onPageFinished(java.lang.String url);

        void onReceivedError(android.webkit.WebResourceRequest request, android.webkit.WebResourceError error);
    }

    /* JADX INFO: compiled from: AppWebViewClient.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewNavigationListener;", "", "shouldOverrideUrlLoading", "", "url", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface WebViewNavigationListener {
        boolean shouldOverrideUrlLoading(java.lang.String url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
        super.onPageFinished(view, url);
        powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewClient.WebViewLifecycleListener webViewLifecycleListener = this.webViewLifecycleListener;
        if (webViewLifecycleListener == null) {
            return;
        }
        webViewLifecycleListener.onPageFinished(url);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceError error) {
        super.onReceivedError(view, request, error);
        powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewClient.WebViewLifecycleListener webViewLifecycleListener = this.webViewLifecycleListener;
        if (webViewLifecycleListener == null) {
            return;
        }
        webViewLifecycleListener.onReceivedError(request, error);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView view, android.webkit.WebResourceRequest request) {
        powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewClient.WebViewNavigationListener webViewNavigationListener = this.webViewNavigationListener;
        if (webViewNavigationListener == null) {
            return super.shouldOverrideUrlLoading(view, request);
        }
        return webViewNavigationListener.shouldOverrideUrlLoading(java.lang.String.valueOf(request == null ? null : request.getUrl()));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
        powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewClient.WebViewNavigationListener webViewNavigationListener = this.webViewNavigationListener;
        if (webViewNavigationListener != null) {
            return webViewNavigationListener.shouldOverrideUrlLoading(url);
        }
        return super.shouldOverrideUrlLoading(view, url);
    }

    public final void setWebViewLifecycleListener(powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewClient.WebViewLifecycleListener webViewLifecycleListener) {
        this.webViewLifecycleListener = webViewLifecycleListener;
    }

    public final void setWebViewNavigationListener(powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewClient.WebViewNavigationListener webViewNavigationListener) {
        this.webViewNavigationListener = webViewNavigationListener;
    }
}
