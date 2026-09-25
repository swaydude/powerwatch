.class final Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl$messageSender$1;
.super Lkotlin/jvm/internal/Lambda;
.source "AppBridgeImpl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;Landroid/content/Context;Lio/reactivex/subjects/PublishSubject;Ljava/util/HashMap;)V
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
        "message",
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
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl$messageSender$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method private static final invoke$lambda-0(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;Ljava/lang/String;Lio/reactivex/CompletableEmitter;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;->access$getWaitingMessageQueue$p(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;)Ljava/util/HashMap;

    move-result-object p0

    check-cast p0, Ljava/util/Map;

    invoke-interface {p0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic lambda$n-RZ2gQjzAHgu_u6FqTlc2HE6JU(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;Ljava/lang/String;Lio/reactivex/CompletableEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl$messageSender$1;->invoke$lambda-0(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;Ljava/lang/String;Lio/reactivex/CompletableEmitter;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/String;)Lio/reactivex/Completable;
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl$messageSender$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$AppBridgeImpl$messageSender$1$n-RZ2gQjzAHgu_u6FqTlc2HE6JU;

    invoke-direct {v1, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$AppBridgeImpl$messageSender$1$n-RZ2gQjzAHgu_u6FqTlc2HE6JU;-><init>(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl;Ljava/lang/String;)V

    invoke-static {v1}, Lio/reactivex/Completable;->create(Lio/reactivex/CompletableOnSubscribe;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "create { emitter -> waitingMessageQueue[emitter] = message }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 31
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridgeImpl$messageSender$1;->invoke(Ljava/lang/String;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method
