.class public final Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;
.super Landroid/webkit/WebView;
.source "AppWebViewImpl.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0017\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u000e\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001c\u0010\t\u001a\u0010\u0012\u000c\u0012\n \u000c*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;",
        "Landroid/webkit/WebView;",
        "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "pageProgress",
        "Lio/reactivex/subjects/PublishSubject;",
        "",
        "kotlin.jvm.PlatformType",
        "Lio/reactivex/Observable;",
        "setJavaScriptEnabled",
        "",
        "enabled",
        "",
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
.field private final pageProgress:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 19
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    const-string v0, "create<Int>()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;->pageProgress:Lio/reactivex/subjects/PublishSubject;

    .line 22
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setAllowUniversalAccessFromFileURLs(Z)V

    .line 24
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl$1;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;)V

    check-cast p1, Landroid/webkit/WebChromeClient;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-direct {p0, p1, p2}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    const-string p2, "create<Int>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;->pageProgress:Lio/reactivex/subjects/PublishSubject;

    .line 33
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setAllowUniversalAccessFromFileURLs(Z)V

    .line 35
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl$2;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;)V

    check-cast p1, Landroid/webkit/WebChromeClient;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    return-void
.end method

.method public static final synthetic access$getPageProgress$p(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;)Lio/reactivex/subjects/PublishSubject;
    .locals 0

    .line 16
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;->pageProgress:Lio/reactivex/subjects/PublishSubject;

    return-object p0
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method public pageProgress()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 48
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;->pageProgress:Lio/reactivex/subjects/PublishSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public setJavaScriptEnabled(Z)V
    .locals 1

    .line 44
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    return-void
.end method
