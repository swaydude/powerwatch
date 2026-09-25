.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;
.super Ljava/lang/Object;
.source "BLECommunicationChannel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\tJ\u0008\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0016H\u0016J\u0008\u0010\u0017\u001a\u00020\u0014H\u0016J\u0016\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00192\u0006\u0010\u001a\u001a\u00020\u0006H\u0016J\u000e\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0016H\u0016J\u0008\u0010\u001c\u001a\u00020\u0010H\u0017J\u0016\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u00192\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0008\u0010 \u001a\u00020\u0014H\u0016J\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00192\u0006\u0010\"\u001a\u00020\u000cH\u0016J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00192\u0006\u0010\"\u001a\u00020\u000cH\u0016R\u001c\u0010\n\u001a\u0010\u0012\u000c\u0012\n \r*\u0004\u0018\u00010\u000c0\u000c0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u000c\u0012\n \r*\u0004\u0018\u00010\u000c0\u000c0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\u000c\u0012\n \r*\u0004\u0018\u00010\u00100\u00100\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "rxBleConnection",
        "Lcom/polidea/rxandroidble2/RxBleConnection;",
        "writeCharacteristic",
        "",
        "readCharacteristic",
        "writeEventCharacteristic",
        "(Lcom/polidea/rxandroidble2/RxBleConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "dataOutput",
        "Lio/reactivex/subjects/PublishSubject;",
        "",
        "kotlin.jvm.PlatformType",
        "eventDataOutput",
        "refreshSubject",
        "",
        "subscription",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "close",
        "Lio/reactivex/Completable;",
        "eventData",
        "Lio/reactivex/Observable;",
        "open",
        "read",
        "Lio/reactivex/Single;",
        "characteristic",
        "receivedData",
        "refresh",
        "requestMTU",
        "",
        "mtu",
        "resubscribeCharacteristics",
        "send",
        "data",
        "sendEvent",
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
.field private final dataOutput:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "[B>;"
        }
    .end annotation
.end field

.field private final eventDataOutput:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "[B>;"
        }
    .end annotation
.end field

.field private final readCharacteristic:Ljava/lang/String;

.field private final refreshSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final rxBleConnection:Lcom/polidea/rxandroidble2/RxBleConnection;

.field private subscription:Lio/reactivex/disposables/CompositeDisposable;

.field private final writeCharacteristic:Ljava/lang/String;

.field private final writeEventCharacteristic:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/polidea/rxandroidble2/RxBleConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "rxBleConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "writeCharacteristic"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "readCharacteristic"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->rxBleConnection:Lcom/polidea/rxandroidble2/RxBleConnection;

    .line 26
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->writeCharacteristic:Ljava/lang/String;

    .line 27
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->readCharacteristic:Ljava/lang/String;

    .line 28
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->writeEventCharacteristic:Ljava/lang/String;

    .line 38
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    const-string p2, "create<Unit>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->refreshSubject:Lio/reactivex/subjects/PublishSubject;

    .line 48
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->subscription:Lio/reactivex/disposables/CompositeDisposable;

    .line 49
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    const-string p2, "create<ByteArray>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->dataOutput:Lio/reactivex/subjects/PublishSubject;

    .line 50
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->eventDataOutput:Lio/reactivex/subjects/PublishSubject;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/polidea/rxandroidble2/RxBleConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const-string p2, "00002760-08C2-11E1-9073-0E8AC72E0011"

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const-string p3, "00002760-08C2-11E1-9073-0E8AC72E0012"

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const-string p4, "00002760-08C2-11E1-9073-0E8AC72E0013"

    .line 25
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;-><init>(Lcom/polidea/rxandroidble2/RxBleConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final close$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Lio/reactivex/CompletableObserver;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->subscription:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {p0}, Lio/reactivex/disposables/CompositeDisposable;->dispose()V

    return-void
.end method

.method public static synthetic lambda$3UC7J_93KR4EBUCjXnVUTYnuZx8(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;[B)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->open$lambda-14$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;[B)V

    return-void
.end method

.method public static synthetic lambda$7TMpNKNHoJLn7ypPD8I3eGHn4sA(Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->open$lambda-14$lambda-6(Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$7hRzCVMA6NruLZU2yH5QbxtcQxc(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Lkotlin/Unit;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->open$lambda-14$lambda-9(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Lkotlin/Unit;)V

    return-void
.end method

.method public static synthetic lambda$B5xRGUnCHV13UW9BtAoS74vsge0(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Lkotlin/Unit;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->open$lambda-14$lambda-11(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Lkotlin/Unit;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$DafTcf_kjaF_2TWwP5_8eCEVVvg(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->open$lambda-14$lambda-12(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;)V

    return-void
.end method

.method public static synthetic lambda$KVImMvsKtwpvbBJGdDp1wT-fQrk(Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->open$lambda-14$lambda-3(Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$MYVK6A22e7I2MJvxOmzkYoZnYRU(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->open$lambda-14$lambda-13(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$ZPF_ZqxeG0yA7nMI02308kFU2xs(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Lio/reactivex/Observable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->open$lambda-14$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Lio/reactivex/Observable;)V

    return-void
.end method

.method public static synthetic lambda$ZQNQYZwxWx-w_M5MUzS4l0J6hMA(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Lkotlin/Unit;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->open$lambda-14$lambda-10(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Lkotlin/Unit;)V

    return-void
.end method

.method public static synthetic lambda$lthWS7WxtzXm-OUI4exHcrZgKxk(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->open$lambda-14$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$mDn7AyVDHdWbDPDU8J3Vr8X0vyE(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->open$lambda-14$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$pbMQ6eiabEb9nbPY1wIvYc4mLAU(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;[B)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->open$lambda-14$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;[B)V

    return-void
.end method

.method public static synthetic lambda$r7RlIVEVgLLMyizpP32xq4wxNgg(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->resubscribeCharacteristics$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;)V

    return-void
.end method

.method public static synthetic lambda$toTtcYar7Z7wSpEwoAEi44TZ-Ao(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Lio/reactivex/CompletableEmitter;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->open$lambda-14(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Lio/reactivex/CompletableEmitter;)V

    return-void
.end method

.method public static synthetic lambda$x4e4Qgte-Yn5_G2ZkqD-gMj3HDE(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Lio/reactivex/CompletableObserver;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->close$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Lio/reactivex/CompletableObserver;)V

    return-void
.end method

.method private static final open$lambda-14(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Lio/reactivex/CompletableEmitter;)V
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->subscription:Lio/reactivex/disposables/CompositeDisposable;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->rxBleConnection:Lcom/polidea/rxandroidble2/RxBleConnection;

    .line 86
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->readCharacteristic:Ljava/lang/String;

    invoke-static {v2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/polidea/rxandroidble2/RxBleConnection;->setupNotification(Ljava/util/UUID;)Lio/reactivex/Observable;

    move-result-object v1

    .line 87
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$ZPF_ZqxeG0yA7nMI02308kFU2xs;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$ZPF_ZqxeG0yA7nMI02308kFU2xs;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$KVImMvsKtwpvbBJGdDp1wT-fQrk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$KVImMvsKtwpvbBJGdDp1wT-fQrk;

    .line 88
    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    .line 91
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$3UC7J_93KR4EBUCjXnVUTYnuZx8;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$3UC7J_93KR4EBUCjXnVUTYnuZx8;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;)V

    .line 93
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$lthWS7WxtzXm-OUI4exHcrZgKxk;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$lthWS7WxtzXm-OUI4exHcrZgKxk;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;)V

    .line 91
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 85
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 97
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->writeEventCharacteristic:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 99
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->subscription:Lio/reactivex/disposables/CompositeDisposable;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->rxBleConnection:Lcom/polidea/rxandroidble2/RxBleConnection;

    .line 100
    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/polidea/rxandroidble2/RxBleConnection;->setupNotification(Ljava/util/UUID;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$7TMpNKNHoJLn7ypPD8I3eGHn4sA;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$7TMpNKNHoJLn7ypPD8I3eGHn4sA;

    .line 102
    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 105
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$pbMQ6eiabEb9nbPY1wIvYc4mLAU;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$pbMQ6eiabEb9nbPY1wIvYc4mLAU;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;)V

    .line 107
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$mDn7AyVDHdWbDPDU8J3Vr8X0vyE;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$mDn7AyVDHdWbDPDU8J3Vr8X0vyE;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;)V

    .line 105
    invoke-virtual {v0, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 99
    invoke-virtual {v1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 112
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->subscription:Lio/reactivex/disposables/CompositeDisposable;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->refreshSubject:Lio/reactivex/subjects/PublishSubject;

    .line 113
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$7hRzCVMA6NruLZU2yH5QbxtcQxc;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$7hRzCVMA6NruLZU2yH5QbxtcQxc;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/subjects/PublishSubject;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v1

    const-wide/16 v2, 0x7530

    .line 114
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v4}, Lio/reactivex/Observable;->throttleFirst(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v1

    .line 115
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$ZQNQYZwxWx-w_M5MUzS4l0J6hMA;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$ZQNQYZwxWx-w_M5MUzS4l0J6hMA;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v1

    .line 118
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$B5xRGUnCHV13UW9BtAoS74vsge0;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$B5xRGUnCHV13UW9BtAoS74vsge0;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v1

    .line 120
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$DafTcf_kjaF_2TWwP5_8eCEVVvg;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$DafTcf_kjaF_2TWwP5_8eCEVVvg;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;)V

    .line 122
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$MYVK6A22e7I2MJvxOmzkYoZnYRU;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$MYVK6A22e7I2MJvxOmzkYoZnYRU;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;)V

    .line 120
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p0

    .line 112
    invoke-virtual {v0, p0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 126
    invoke-interface {p1}, Lio/reactivex/CompletableEmitter;->onComplete()V

    return-void
.end method

.method private static final open$lambda-14$lambda-10(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Lkotlin/Unit;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Requested connection priority will be executed now..."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final open$lambda-14$lambda-11(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Lkotlin/Unit;)Lio/reactivex/CompletableSource;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->rxBleConnection:Lcom/polidea/rxandroidble2/RxBleConnection;

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v0, 0x1

    const-wide/16 v1, 0x3e8

    invoke-interface {p0, v0, v1, v2, p1}, Lcom/polidea/rxandroidble2/RxBleConnection;->requestConnectionPriority(IJLjava/util/concurrent/TimeUnit;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final open$lambda-14$lambda-12(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Connection updated successfully."

    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private static final open$lambda-14$lambda-13(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Connection updating failed."

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private static final open$lambda-14$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Lio/reactivex/Observable;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Characteristic set!"

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final open$lambda-14$lambda-3(Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "observable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final open$lambda-14$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;[B)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->dataOutput:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final open$lambda-14$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->dataOutput:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/PublishSubject;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final open$lambda-14$lambda-6(Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "observable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final open$lambda-14$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;[B)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->eventDataOutput:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final open$lambda-14$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->eventDataOutput:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/PublishSubject;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final open$lambda-14$lambda-9(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;Lkotlin/Unit;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Request for connection priority received, will debounce request..."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final resubscribeCharacteristics$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->subscription:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {p0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method


# virtual methods
.method public close()Lio/reactivex/Completable;
    .locals 2

    .line 53
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object v0

    .line 54
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$x4e4Qgte-Yn5_G2ZkqD-gMj3HDE;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$x4e4Qgte-Yn5_G2ZkqD-gMj3HDE;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "complete()\n                .andThen {\n                    subscription.dispose()\n                }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public eventData()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "[B>;"
        }
    .end annotation

    .line 78
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->eventDataOutput:Lio/reactivex/subjects/PublishSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
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

.method public open()Lio/reactivex/Completable;
    .locals 2

    .line 83
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$toTtcYar7Z7wSpEwoAEi44TZ-Ao;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$toTtcYar7Z7wSpEwoAEi44TZ-Ao;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;)V

    invoke-static {v0}, Lio/reactivex/Completable;->create(Lio/reactivex/CompletableOnSubscribe;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "create { emitter ->\n//            debug(\"Started open on channel\")\n            subscription.add(rxBleConnection\n                    .setupNotification(UUID.fromString(this.readCharacteristic))\n                    .doOnNext { debug(\"Characteristic set!\") }\n                    .flatMap { observable ->\n                        observable\n                    }\n                    .subscribe({\n                        dataOutput.onNext(it)\n                    }, {\n                        dataOutput.onError(it)\n                    }))\n\n            val writeChar = writeEventCharacteristic\n            if (writeChar != null) {\n                subscription.add(rxBleConnection\n                        .setupNotification(UUID.fromString(this.writeEventCharacteristic))\n//                        .doOnNext { debug(\"Characteristic set!\") }\n                        .flatMap { observable ->\n                            observable\n                        }\n                        .subscribe({\n                            eventDataOutput.onNext(it)\n                        }, {\n                            eventDataOutput.onError(it)\n                        }))\n            }\n\n            this.subscription.add(refreshSubject\n                    .doOnNext { debug(\"Request for connection priority received, will debounce request...\") }\n                    .throttleFirst(30000, TimeUnit.MILLISECONDS)\n                    .doOnNext {\n                        debug(\"Requested connection priority will be executed now...\")\n                    }\n                    .flatMapCompletable {\n                        rxBleConnection.requestConnectionPriority(CONNECTION_PRIORITY_HIGH, 1000, TimeUnit.MILLISECONDS)\n                    }.subscribe({\n                        Log.d(javaClass.simpleName, \"Connection updated successfully.\")\n                    }, {\n                        Log.e(javaClass.simpleName, \"Connection updating failed.\")\n                    }))\n\n            emitter.onComplete()\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public open(Ljava/util/UUID;)Lio/reactivex/Completable;
    .locals 0

    .line 25
    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel$DefaultImpls;->open(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;Ljava/util/UUID;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public read(Ljava/lang/String;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Single<",
            "[B>;"
        }
    .end annotation

    const-string v0, "characteristic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->rxBleConnection:Lcom/polidea/rxandroidble2/RxBleConnection;

    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/polidea/rxandroidble2/RxBleConnection;->readCharacteristic(Ljava/util/UUID;)Lio/reactivex/Single;

    move-result-object p1

    const-string v0, "rxBleConnection.readCharacteristic(UUID.fromString(characteristic))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public receivedData()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "[B>;"
        }
    .end annotation

    .line 73
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->dataOutput:Lio/reactivex/subjects/PublishSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public refresh()V
    .locals 2

    .line 132
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->refreshSubject:Lio/reactivex/subjects/PublishSubject;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public requestMTU(I)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lio/reactivex/Single<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->rxBleConnection:Lcom/polidea/rxandroidble2/RxBleConnection;

    invoke-interface {v0, p1}, Lcom/polidea/rxandroidble2/RxBleConnection;->requestMtu(I)Lio/reactivex/Single;

    move-result-object p1

    const-string v0, "rxBleConnection.requestMtu(mtu)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public resubscribeCharacteristics()Lio/reactivex/Completable;
    .locals 2

    .line 32
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$r7RlIVEVgLLMyizpP32xq4wxNgg;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BLECommunicationChannel$r7RlIVEVgLLMyizpP32xq4wxNgg;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v0

    .line 35
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->open()Lio/reactivex/Completable;

    move-result-object v1

    check-cast v1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "fromAction {\n                    subscription.clear()\n                }\n                .andThen(this.open())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public send([B)Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Lio/reactivex/Single<",
            "[B>;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->rxBleConnection:Lcom/polidea/rxandroidble2/RxBleConnection;

    .line 61
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->writeCharacteristic:Ljava/lang/String;

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/polidea/rxandroidble2/RxBleConnection;->writeCharacteristic(Ljava/util/UUID;[B)Lio/reactivex/Single;

    move-result-object p1

    const-string v0, "rxBleConnection\n                .writeCharacteristic(UUID.fromString(writeCharacteristic), data)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public sendEvent([B)Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Lio/reactivex/Single<",
            "[B>;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->rxBleConnection:Lcom/polidea/rxandroidble2/RxBleConnection;

    .line 68
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;->writeEventCharacteristic:Ljava/lang/String;

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/polidea/rxandroidble2/RxBleConnection;->writeCharacteristic(Ljava/util/UUID;[B)Lio/reactivex/Single;

    move-result-object p1

    const-string v0, "rxBleConnection\n                .writeCharacteristic(UUID.fromString(writeEventCharacteristic), data)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
