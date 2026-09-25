.class public final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;
.super Ljava/lang/Object;
.source "AlarmsCommunicator.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0002J\u0008\u0010\u000b\u001a\u00020\u0008H\u0002J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V",
        "alarmRepeatMap",
        "",
        "create",
        "",
        "alarm",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;",
        "createDisable",
        "disableAlarm",
        "Lio/reactivex/Completable;",
        "deviceId",
        "",
        "enableAlarm",
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
.field private final alarmRepeatMap:[I

.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V
    .locals 1

    const-string v0, "communicator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    const/4 p1, 0x7

    new-array p1, p1, [I

    .line 20
    fill-array-data p1, :array_0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;->alarmRepeatMap:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x40
        0x1
        0x2
        0x4
        0x8
        0x10
        0x20
    .end array-data
.end method

.method private final create(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;)[B
    .locals 7

    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 24
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Ljava/util/TimeZone;->getOffset(J)I

    move-result v0

    const v1, 0xea60

    div-int/2addr v0, v1

    .line 26
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;->getHour()I

    move-result v1

    .line 27
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;->getMinute()I

    move-result v2

    .line 29
    div-int/lit8 v0, v0, 0x3c

    sub-int/2addr v1, v0

    if-gez v1, :cond_0

    add-int/lit8 v1, v1, 0x18

    .line 31
    :cond_0
    rem-int/lit8 v1, v1, 0x18

    .line 35
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;->getRepeat()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    const/16 p1, 0x80

    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;->getRepeat()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    .line 39
    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;->alarmRepeatMap:[I

    const-string v6, "day"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    aget v4, v5, v4

    or-int/2addr v0, v4

    goto :goto_0

    :cond_2
    move p1, v0

    :goto_1
    const/16 v0, 0x14

    new-array v0, v0, [B

    const/4 v4, 0x0

    :goto_2
    add-int/lit8 v5, v4, 0x1

    .line 47
    aput-byte v3, v0, v4

    const/16 v4, 0x13

    if-le v5, v4, :cond_3

    const/4 v4, -0x1

    aput-byte v4, v0, v3

    const/4 v3, 0x1

    const/4 v5, 0x2

    aput-byte v5, v0, v3

    aput-byte v3, v0, v5

    const/4 v5, 0x3

    aput-byte v3, v0, v5

    const/4 v3, 0x4

    aput-byte v4, v0, v3

    const/4 v3, 0x5

    aput-byte v4, v0, v3

    const/4 v3, 0x6

    aput-byte v4, v0, v3

    const/4 v3, 0x7

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    const/16 v1, 0x8

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    const/16 v1, 0x9

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    const/16 p1, 0xa

    aput-byte v4, v0, p1

    return-object v0

    :cond_3
    move v4, v5

    goto :goto_2
.end method

.method private final createDisable()[B
    .locals 5

    const/16 v0, 0x14

    new-array v0, v0, [B

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v3, v2, 0x1

    .line 68
    aput-byte v1, v0, v2

    const/16 v2, 0x13

    if-le v3, v2, :cond_0

    const/4 v2, -0x1

    aput-byte v2, v0, v1

    const/4 v3, 0x1

    const/4 v4, 0x2

    aput-byte v4, v0, v3

    aput-byte v3, v0, v4

    const/4 v4, 0x3

    aput-byte v3, v0, v4

    const/4 v3, 0x4

    aput-byte v2, v0, v3

    const/4 v3, 0x5

    aput-byte v2, v0, v3

    const/4 v3, 0x6

    aput-byte v2, v0, v3

    const/4 v3, 0x7

    aput-byte v2, v0, v3

    const/16 v3, 0x8

    aput-byte v2, v0, v3

    const/16 v3, 0x9

    aput-byte v1, v0, v3

    const/16 v1, 0xa

    aput-byte v2, v0, v1

    return-object v0

    :cond_0
    move v2, v3

    goto :goto_0
.end method

.method private static final disableAlarm$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;Lio/reactivex/SingleEmitter;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;->createDisable()[B

    move-result-object p0

    invoke-interface {p1, p0}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method private static final disableAlarm$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;Ljava/lang/String;[B)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicatorKt;->createMessage(Ljava/lang/String;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    move-result-object p1

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final enableAlarm$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;Lio/reactivex/SingleEmitter;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$alarm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;->create(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;)[B

    move-result-object p0

    invoke-interface {p2, p0}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method private static final enableAlarm$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;Ljava/lang/String;[B)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicatorKt;->createMessage(Ljava/lang/String;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    move-result-object p1

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method public static synthetic lambda$8efHjWPbJJOhuQRjmERTMWNFnS0(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;->disableAlarm$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method public static synthetic lambda$YP9F2_XuP7y-bxcK5PyBrWj5nuQ(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;Ljava/lang/String;[B)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;->disableAlarm$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;Ljava/lang/String;[B)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$amBDzcfsbuMH2y3ornf3kzmHpt4(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;->enableAlarm$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method public static synthetic lambda$ztN9RvARPbQ_FJUMjCruiW94bwg(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;Ljava/lang/String;[B)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;->enableAlarm$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;Ljava/lang/String;[B)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public disableAlarm(Ljava/lang/String;)Lio/reactivex/Completable;
    .locals 2

    const-string v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$Gen1AlarmsCommunicator$8efHjWPbJJOhuQRjmERTMWNFnS0;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$Gen1AlarmsCommunicator$8efHjWPbJJOhuQRjmERTMWNFnS0;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;)V

    invoke-static {v0}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object v0

    .line 97
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$Gen1AlarmsCommunicator$YP9F2_XuP7y-bxcK5PyBrWj5nuQ;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$Gen1AlarmsCommunicator$YP9F2_XuP7y-bxcK5PyBrWj5nuQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "create<ByteArray> {\n            it.onSuccess(createDisable())\n        }.flatMapCompletable {\n            communicator.sendMessage(createMessage(deviceId, it))\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public enableAlarm(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alarm"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$Gen1AlarmsCommunicator$amBDzcfsbuMH2y3ornf3kzmHpt4;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$Gen1AlarmsCommunicator$amBDzcfsbuMH2y3ornf3kzmHpt4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;)V

    invoke-static {v0}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object p2

    .line 89
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$Gen1AlarmsCommunicator$ztN9RvARPbQ_FJUMjCruiW94bwg;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/-$$Lambda$Gen1AlarmsCommunicator$ztN9RvARPbQ_FJUMjCruiW94bwg;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlarmsCommunicator;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "create<ByteArray> {\n            it.onSuccess(create(alarm))\n        }.flatMapCompletable {\n            communicator.sendMessage(createMessage(deviceId, it))\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
