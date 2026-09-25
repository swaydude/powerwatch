.class final Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl$config$1;
.super Lkotlin/jvm/internal/Lambda;
.source "AppBridgeImpl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->config(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lio/reactivex/Completable;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "Lio/reactivex/Completable;",
        "message1",
        ""
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $sendingPath:Ljava/lang/String;

.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl$config$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl$config$1;->$sendingPath:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method private static final invoke$lambda-0(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;Ljava/lang/String;Ljava/lang/String;Lio/reactivex/CompletableEmitter;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$message1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->access$getAppWebView$p(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;)Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "(\'"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\')"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 97
    invoke-interface {p3}, Lio/reactivex/CompletableEmitter;->onComplete()V

    return-void
.end method

.method public static synthetic lambda$LIZuwc5gP4Skk338x43vCtM1xvc(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;Ljava/lang/String;Ljava/lang/String;Lio/reactivex/CompletableEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl$config$1;->invoke$lambda-0(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;Ljava/lang/String;Ljava/lang/String;Lio/reactivex/CompletableEmitter;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/String;)Lio/reactivex/Completable;
    .locals 3

    const-string v0, "message1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl$config$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl$config$1;->$sendingPath:Ljava/lang/String;

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$AppBridgeImpl$config$1$LIZuwc5gP4Skk338x43vCtM1xvc;

    invoke-direct {v2, v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$AppBridgeImpl$config$1$LIZuwc5gP4Skk338x43vCtM1xvc;-><init>(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Lio/reactivex/Completable;->create(Lio/reactivex/CompletableOnSubscribe;)Lio/reactivex/Completable;

    move-result-object p1

    .line 99
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Completable;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "create { emitter ->\n                    appWebView.evaluateJavascript(\"$sendingPath(\'$message1\')\", null)\n                    emitter.onComplete()\n                }\n                        .subscribeOn(AndroidSchedulers.mainThread())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 94
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl$config$1;->invoke(Ljava/lang/String;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method
