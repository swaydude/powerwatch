.class public final Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;
.super Ljava/lang/Object;
.source "WebBridgeLoggerExtension.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtension;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u0008\u0010\u000c\u001a\u00020\rH\u0016J\u0008\u0010\u000e\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtension;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "gson",
        "Lcom/google/gson/Gson;",
        "bridge",
        "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge;",
        "logger",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogger;",
        "(Lcom/google/gson/Gson;Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogger;)V",
        "compositeDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "destroy",
        "",
        "init",
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
.field private final bridge:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge;

.field private final compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final gson:Lcom/google/gson/Gson;

.field private final logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogger;


# direct methods
.method public constructor <init>(Lcom/google/gson/Gson;Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogger;)V
    .locals 1

    const-string v0, "gson"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bridge"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;->gson:Lcom/google/gson/Gson;

    .line 26
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;->bridge:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge;

    .line 27
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;->logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogger;

    .line 28
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    return-void
.end method

.method private static final init$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;->gson:Lcom/google/gson/Gson;

    const-class v0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;

    invoke-virtual {p0, p1, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;

    return-object p0
.end method

.method private static final init$lambda-1(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;->getEnvelopeType()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes$WebLogRequest;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes$WebLogRequest;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes$WebLogRequest;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final init$lambda-2(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;)Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;
    .locals 7

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;->extractPayload()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/WebLog;

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 37
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/WebLog;->getEnv()Ljava/lang/String;

    move-result-object v0

    const-string v1, "prod"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env$PROD;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env$PROD;

    goto :goto_0

    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env$DEV;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env$DEV;

    :goto_0
    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;

    move-object v6, v0

    .line 38
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/WebLog;->getLevel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v1, "warning"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 42
    :cond_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WARN;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WARN;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    goto :goto_2

    :sswitch_1
    const-string v1, "error"

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 41
    :cond_2
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$ERROR;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$ERROR;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    goto :goto_2

    :sswitch_2
    const-string v1, "debug"

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    .line 40
    :cond_3
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$DEBUG;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$DEBUG;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    goto :goto_2

    :sswitch_3
    const-string v1, "info"

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    .line 39
    :cond_4
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$INFO;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$INFO;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    goto :goto_2

    .line 43
    :goto_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WTF;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WTF;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    :goto_2
    move-object v4, v0

    .line 46
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/WebLog;->getMessage()Ljava/lang/String;

    move-result-object v2

    .line 47
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/WebLog;->getTimestamp()Ljava/lang/String;

    move-result-object v5

    .line 50
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/WebLog;->getTag()Ljava/lang/String;

    move-result-object v3

    .line 45
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;)V

    return-object p0

    :sswitch_data_0
    .sparse-switch
        0x3164ae -> :sswitch_3
        0x5b09653 -> :sswitch_2
        0x5c4d208 -> :sswitch_1
        0x4305af9c -> :sswitch_0
    .end sparse-switch
.end method

.method private static final init$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;->logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogger;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogger;->addLog(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V

    return-void
.end method

.method public static synthetic lambda$SA2SGwIze9cBOE01xxvwBMlwbkM(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;->init$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$izQWFFr_0dn0POhDgHrlv4bccb8(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;->init$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V

    return-void
.end method

.method public static synthetic lambda$uHswvL7qnVhe8hhf2a-hW4U1bf0(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;->init$lambda-1(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$zul95q7l6T80BMkgGgm5_cSSLSk(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;)Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;->init$lambda-2(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;)Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 59
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->dispose()V

    return-void
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 25
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public init()V
    .locals 3

    .line 31
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 32
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;->bridge:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge;->messageOutput()Lio/reactivex/Observable;

    move-result-object v1

    .line 33
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$SA2SGwIze9cBOE01xxvwBMlwbkM;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$SA2SGwIze9cBOE01xxvwBMlwbkM;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$uHswvL7qnVhe8hhf2a-hW4U1bf0;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$uHswvL7qnVhe8hhf2a-hW4U1bf0;

    .line 34
    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$zul95q7l6T80BMkgGgm5_cSSLSk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$zul95q7l6T80BMkgGgm5_cSSLSk;

    .line 35
    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    .line 53
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$izQWFFr_0dn0POhDgHrlv4bccb8;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$izQWFFr_0dn0POhDgHrlv4bccb8;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method
