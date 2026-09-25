.class public final Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;
.super Landroid/webkit/WebViewClient;
.source "AppWebViewClient.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewNavigationListener;,
        Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewLifecycleListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0016J&\u0010\r\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00082\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0013\u001a\u00020\u00082\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\u0014\u001a\u00020\u00152\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;",
        "Landroid/webkit/WebViewClient;",
        "()V",
        "webViewLifecycleListener",
        "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewLifecycleListener;",
        "webViewNavigationListener",
        "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewNavigationListener;",
        "onPageFinished",
        "",
        "view",
        "Landroid/webkit/WebView;",
        "url",
        "",
        "onReceivedError",
        "request",
        "Landroid/webkit/WebResourceRequest;",
        "error",
        "Landroid/webkit/WebResourceError;",
        "setWebViewLifecycleListener",
        "setWebViewNavigationListener",
        "shouldOverrideUrlLoading",
        "",
        "WebViewLifecycleListener",
        "WebViewNavigationListener",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private webViewLifecycleListener:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewLifecycleListener;

.field private webViewNavigationListener:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewNavigationListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 26
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 27
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;->webViewLifecycleListener:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewLifecycleListener;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewLifecycleListener;->onPageFinished(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 0

    .line 31
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    .line 32
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;->webViewLifecycleListener:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewLifecycleListener;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewLifecycleListener;->onReceivedError(Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    :goto_0
    return-void
.end method

.method public final setWebViewLifecycleListener(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewLifecycleListener;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;->webViewLifecycleListener:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewLifecycleListener;

    return-void
.end method

.method public final setWebViewNavigationListener(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewNavigationListener;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;->webViewNavigationListener:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewNavigationListener;

    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 1

    .line 36
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;->webViewNavigationListener:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewNavigationListener;

    if-nez v0, :cond_0

    .line 37
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z

    move-result p1

    goto :goto_1

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    .line 36
    :cond_1
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewNavigationListener;->shouldOverrideUrlLoading(Ljava/lang/String;)Z

    move-result p1

    :goto_1
    return p1
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 1

    .line 41
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;->webViewNavigationListener:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewNavigationListener;

    if-nez v0, :cond_0

    .line 42
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result p1

    goto :goto_0

    .line 41
    :cond_0
    invoke-interface {v0, p2}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewNavigationListener;->shouldOverrideUrlLoading(Ljava/lang/String;)Z

    move-result p1

    :goto_0
    return p1
.end method
