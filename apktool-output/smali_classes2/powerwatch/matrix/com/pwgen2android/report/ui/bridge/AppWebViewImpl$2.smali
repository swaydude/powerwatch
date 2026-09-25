.class public final Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl$2;
.super Landroid/webkit/WebChromeClient;
.source "AppWebViewImpl.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "powerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl$2",
        "Landroid/webkit/WebChromeClient;",
        "onProgressChanged",
        "",
        "view",
        "Landroid/webkit/WebView;",
        "newProgress",
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
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;

    .line 35
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 0

    .line 37
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 38
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;->access$getPageProgress$p(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewImpl;)Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method
