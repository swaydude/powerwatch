.class public final Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;
.super Ljava/lang/Object;
.source "AppBridgeImpl.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge;
.implements Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewLifecycleListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*BU\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012$\u0008\u0002\u0010\u000c\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b`\u000f\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000bH\u0007J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002J\u0008\u0010\u001d\u001a\u00020\u001aH\u0016J\u000e\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u001fH\u0016J\u0012\u0010 \u001a\u00020\u001a2\u0008\u0010!\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\"\u001a\u00020\u001a2\u0008\u0010#\u001a\u0004\u0018\u00010$2\u0008\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010\'\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u000bH\u0007J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R)\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\u0008(\u0017\u0012\u0004\u0012\u00020\u00180\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u000c\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b`\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge;",
        "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewLifecycleListener;",
        "appWebView",
        "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;",
        "appWebViewClient",
        "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;",
        "context",
        "Landroid/content/Context;",
        "receivingSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "",
        "waitingMessageQueue",
        "Ljava/util/HashMap;",
        "Lio/reactivex/CompletableEmitter;",
        "Lkotlin/collections/HashMap;",
        "(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;Landroid/content/Context;Lio/reactivex/subjects/PublishSubject;Ljava/util/HashMap;)V",
        "isAppLoaded",
        "",
        "messageSender",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "message",
        "Lio/reactivex/Completable;",
        "config",
        "",
        "configMessage",
        "configureBridge",
        "destroy",
        "messageOutput",
        "Lio/reactivex/Observable;",
        "onPageFinished",
        "url",
        "onReceivedError",
        "request",
        "Landroid/webkit/WebResourceRequest;",
        "error",
        "Landroid/webkit/WebResourceError;",
        "postMessage",
        "sendMessage",
        "data",
        "Companion",
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


# static fields
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl$Companion;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final appWebView:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;

.field private final appWebViewClient:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;

.field private isAppLoaded:Z

.field private messageSender:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "+",
            "Lio/reactivex/Completable;",
            ">;"
        }
    .end annotation
.end field

.field private final receivingSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final waitingMessageQueue:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lio/reactivex/CompletableEmitter;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl$Companion;

    .line 148
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;Landroid/content/Context;Lio/reactivex/subjects/PublishSubject;Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;",
            "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;",
            "Landroid/content/Context;",
            "Lio/reactivex/subjects/PublishSubject<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/HashMap<",
            "Lio/reactivex/CompletableEmitter;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "appWebView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appWebViewClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "receivingSubject"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "waitingMessageQueue"

    invoke-static {p5, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->appWebView:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;

    .line 23
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->appWebViewClient:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;

    .line 25
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->receivingSubject:Lio/reactivex/subjects/PublishSubject;

    .line 26
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->waitingMessageQueue:Ljava/util/HashMap;

    .line 31
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl$messageSender$1;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl$messageSender$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;)V

    check-cast p3, Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->messageSender:Lkotlin/jvm/functions/Function1;

    const/4 p3, 0x1

    .line 38
    invoke-interface {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;->setJavaScriptEnabled(Z)V

    const-string p3, "android"

    .line 39
    invoke-interface {p1, p0, p3}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    move-object p3, p0

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewLifecycleListener;

    invoke-virtual {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;->setWebViewLifecycleListener(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewLifecycleListener;)V

    .line 41
    check-cast p2, Landroid/webkit/WebViewClient;

    invoke-interface {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    # OFFLINE PATCH: never load the powerwatch.com web report backend
    const-string p2, "about:blank"

    .line 42
    invoke-interface {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;Landroid/content/Context;Lio/reactivex/subjects/PublishSubject;Ljava/util/HashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    .line 25
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p4

    const-string p7, "create<String>()"

    invoke-static {p4, p7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    .line 26
    new-instance p5, Ljava/util/HashMap;

    invoke-direct {p5}, Ljava/util/HashMap;-><init>()V

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 21
    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;Landroid/content/Context;Lio/reactivex/subjects/PublishSubject;Ljava/util/HashMap;)V

    return-void
.end method

.method public static final synthetic access$getAppWebView$p(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;)Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;
    .locals 0

    .line 20
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->appWebView:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;

    return-object p0
.end method

.method public static final synthetic access$getWaitingMessageQueue$p(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;)Ljava/util/HashMap;
    .locals 0

    .line 20
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->waitingMessageQueue:Ljava/util/HashMap;

    return-object p0
.end method

.method private static final config$lambda-0(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;Ljava/lang/String;)V
    .locals 6

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->waitingMessageQueue:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/reactivex/CompletableEmitter;

    .line 105
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->waitingMessageQueue:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 106
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->appWebView:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "(\'"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\')"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-interface {v3, v2, v4}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 109
    invoke-interface {v1}, Lio/reactivex/CompletableEmitter;->onComplete()V

    goto :goto_0

    .line 111
    :cond_0
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->waitingMessageQueue:Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method private final configureBridge(Ljava/lang/String;)V
    .locals 3

    .line 62
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->appWebView:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;

    const-string v1, "var androidWrapper = {\npostMessage(message) {\n\nandroid.postMessage(message)},\nconfig(message) {\nandroid.config(message)}\n}"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 75
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->appWebView:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;

    invoke-interface {v0, p1, v2}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void
.end method

.method public static synthetic lambda$4I4xQcxokltrG-Wf0CEMEnD6uTs(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->config$lambda-0(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final config(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "configMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 86
    iput-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->isAppLoaded:Z

    .line 88
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "acceptPath"

    .line 89
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 94
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl$config$1;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl$config$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;Ljava/lang/String;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->messageSender:Lkotlin/jvm/functions/Function1;

    .line 102
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$AppBridgeImpl$4I4xQcxokltrG-Wf0CEMEnD6uTs;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$AppBridgeImpl$4I4xQcxokltrG-Wf0CEMEnD6uTs;-><init>(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 116
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public destroy()V
    .locals 2

    .line 55
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->appWebViewClient:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;->setWebViewLifecycleListener(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient$WebViewLifecycleListener;)V

    .line 56
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->appWebView:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;->destroy()V

    return-void
.end method

.method public messageOutput()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->receivingSubject:Lio/reactivex/subjects/PublishSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public onPageFinished(Ljava/lang/String;)V
    .locals 0

    const-string p1, "bridge.configure(androidWrapper)"

    .line 132
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->configureBridge(Ljava/lang/String;)V

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 0

    return-void
.end method

.method public final postMessage(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->receivingSubject:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public sendMessage(Ljava/lang/String;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->messageSender:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/reactivex/Completable;

    return-object p1
.end method
