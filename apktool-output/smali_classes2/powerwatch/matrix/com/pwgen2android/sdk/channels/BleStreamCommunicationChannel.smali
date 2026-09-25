.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;
.super Ljava/lang/Object;
.source "BleStreamCommunicationChannel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleStreamCommunicationChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleStreamCommunicationChannel.kt\npowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,58:1\n1547#2:59\n1618#2,3:60\n*S KotlinDebug\n*F\n+ 1 BleStreamCommunicationChannel.kt\npowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel\n*L\n45#1:59\n45#1:60,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\n \u0008*\u0004\u0018\u00010\u00070\u0007H\u0016J\u000f\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0096\u0001J\t\u0010\u000c\u001a\u00020\u0007H\u0096\u0001J\u0011\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0001J\u0017\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\r\u001a\u00020\u0011H\u0096\u0001J\u000e\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0001J\u0017\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0001J\t\u0010\u0018\u001a\u00020\u0007H\u0096\u0001J\u0016\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u0017\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\u001a\u001a\u00020\u000bH\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;",
        "communicationChannel",
        "initialStream",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;)V",
        "close",
        "Lio/reactivex/Completable;",
        "kotlin.jvm.PlatformType",
        "eventData",
        "Lio/reactivex/Observable;",
        "",
        "open",
        "characteristic",
        "Ljava/util/UUID;",
        "read",
        "Lio/reactivex/Single;",
        "",
        "receivedData",
        "refresh",
        "",
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
.field private final communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

.field private final initialStream:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;)V
    .locals 1

    const-string v0, "communicationChannel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialStream"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    .line 10
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->initialStream:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 10
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;

    const/4 p3, 0x0

    const/4 p4, 0x1

    const/4 v0, 0x0

    invoke-direct {p2, p3, p4, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStreamImpl;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;)V

    return-void
.end method

.method private static final close$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->initialStream:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;->destroy()V

    return-void
.end method

.method public static synthetic lambda$DiSX2I4tDljnsvDhj8IRGpIdhmE(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->receivedData$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$H6uSNUFUMhC2OiOqN4HAZnpBk8o(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->close$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;)V

    return-void
.end method

.method public static synthetic lambda$Qe0rYjX7ZKEjbX1lOblqI8SHkS8(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->receivedData$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$WL3jlI0WZ_07TdSQLJO8azO78Lk(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;[B)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->send$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;[B)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$fl1LeQhqQpuxJAT6m3G3wGqQbtU(Ljava/util/List;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->receivedData$lambda-2(Ljava/util/List;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$hZOiK2YhOSa0oKTMAzRrnShxNvs(Ljava/util/List;)[B
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->send$lambda-6(Ljava/util/List;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$qIHc3vlNMGFNvDbSXDTPGKkfguM(Ljava/util/List;)[B
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->send$lambda-3(Ljava/util/List;)[B

    move-result-object p0

    return-object p0
.end method

.method private static final receivedData$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;
    .locals 1

    const-string v0, "accumulator"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;->clearMessages()V

    .line 19
    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;->appendData([B)V

    .line 20
    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;->extractMessages()V

    return-object p0
.end method

.method private static final receivedData$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;)Ljava/util/List;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;->getMessageList()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final receivedData$lambda-2(Ljava/util/List;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lio/reactivex/Observable;->fromIterable(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final send$lambda-3(Ljava/util/List;)[B
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    check-cast p0, Ljava/util/Collection;

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->toByteArray(Ljava/util/Collection;)[B

    move-result-object p0

    return-object p0
.end method

.method private static final send$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;[B)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->send([B)Lio/reactivex/Single;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final send$lambda-6(Ljava/util/List;)[B
    .locals 3

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    check-cast p0, Ljava/lang/Iterable;

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 60
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 61
    check-cast v1, [B

    const-string v2, "array"

    .line 45
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lkotlin/collections/ArraysKt;->toMutableList([B)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 62
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 59
    check-cast v0, Ljava/lang/Iterable;

    .line 46
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->flatten(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    .line 47
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->toByteArray(Ljava/util/Collection;)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public close()Lio/reactivex/Completable;
    .locals 2

    .line 54
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$H6uSNUFUMhC2OiOqN4HAZnpBk8o;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$H6uSNUFUMhC2OiOqN4HAZnpBk8o;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v0

    .line 57
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->close()Lio/reactivex/Completable;

    move-result-object v1

    check-cast v1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

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

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->eventData()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public open()Lio/reactivex/Completable;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->open()Lio/reactivex/Completable;

    move-result-object v0

    return-object v0
.end method

.method public open(Ljava/util/UUID;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "characteristic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->open(Ljava/util/UUID;)Lio/reactivex/Completable;

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

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->read(Ljava/lang/String;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public receivedData()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "[B>;"
        }
    .end annotation

    .line 15
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->receivedData()Lio/reactivex/Observable;

    move-result-object v0

    .line 16
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->initialStream:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$Qe0rYjX7ZKEjbX1lOblqI8SHkS8;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$Qe0rYjX7ZKEjbX1lOblqI8SHkS8;

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->scan(Ljava/lang/Object;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$DiSX2I4tDljnsvDhj8IRGpIdhmE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$DiSX2I4tDljnsvDhj8IRGpIdhmE;

    .line 24
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$fl1LeQhqQpuxJAT6m3G3wGqQbtU;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$fl1LeQhqQpuxJAT6m3G3wGqQbtU;

    .line 25
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    .line 26
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->eventData()Lio/reactivex/Observable;

    move-result-object v1

    check-cast v1, Lio/reactivex/ObservableSource;

    .line 14
    invoke-static {v0, v1}, Lio/reactivex/Observable;->merge(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "merge(\n                communicationChannel.receivedData()\n                        .scan(initialStream) { accumulator, data ->\n\n                            accumulator.clearMessages()\n                            accumulator.appendData(data)\n                            accumulator.extractMessages()\n\n                            accumulator\n                        }\n                        .map { it.getMessageList().toList() }\n                        .flatMap { Observable.fromIterable(it) },\n                communicationChannel.eventData()\n        )"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public refresh()V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->refresh()V

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

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->requestMTU(I)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public resubscribeCharacteristics()Lio/reactivex/Completable;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->resubscribeCharacteristics()Lio/reactivex/Completable;

    move-result-object v0

    return-object v0
.end method

.method public send([B)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Lio/reactivex/Single<",
            "[B>;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toMutableList([B)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    const/16 v0, 0x14

    .line 36
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->chunked(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 34
    invoke-static {p1}, Lio/reactivex/Observable;->fromIterable(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$qIHc3vlNMGFNvDbSXDTPGKkfguM;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$qIHc3vlNMGFNvDbSXDTPGKkfguM;

    .line 37
    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 40
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$WL3jlI0WZ_07TdSQLJO8azO78Lk;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$WL3jlI0WZ_07TdSQLJO8azO78Lk;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->concatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lio/reactivex/Observable;->toList()Lio/reactivex/Single;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$hZOiK2YhOSa0oKTMAzRrnShxNvs;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$hZOiK2YhOSa0oKTMAzRrnShxNvs;

    .line 44
    invoke-virtual {p1, v0}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    const-string v0, "fromIterable(\n                data.toMutableList()\n                        .chunked(20))\n                .map {\n                    it.toByteArray()\n                }\n                .concatMap {\n                    communicationChannel.send(it).toObservable()\n                }\n                .toList()\n                .map {\n                    it.map { array -> array.toMutableList() }\n                            .flatten()\n                            .toByteArray()\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public sendEvent([B)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Lio/reactivex/Single<",
            "[B>;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->sendEvent([B)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method
