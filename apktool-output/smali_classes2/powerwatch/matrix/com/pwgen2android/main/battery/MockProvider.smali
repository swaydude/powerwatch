.class public final Lpowerwatch/matrix/com/pwgen2android/main/battery/MockProvider;
.super Ljava/lang/Object;
.source "BatteryNotificationCenter.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u000e\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0004H\u0016J\u0016\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/battery/MockProvider;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;",
        "()V",
        "loadData",
        "Lio/reactivex/Observable;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;",
        "page",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
        "observeCurrentData",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;",
        "observeData",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic lambda$1k1HItYBWjsGe4z90jpsu-TT9hQ(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/MockProvider;->observeCurrentData$lambda-4$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)V

    return-void
.end method

.method public static synthetic lambda$N2vB96qz5S1pLrsB9_2YekdyI4E(Ljava/lang/Integer;Ljava/lang/Long;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/MockProvider;->observeCurrentData$lambda-4$lambda-2(Ljava/lang/Integer;Ljava/lang/Long;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$XQeN2MT0F2farxtvT1L-XSDOk3Q(Ljava/lang/Integer;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/MockProvider;->observeCurrentData$lambda-4(Ljava/lang/Integer;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$fpW4GzlWaJ3ZyFPWpTyl_3IXsbw(Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/MockProvider;->observeCurrentData$lambda-0(Ljava/lang/Integer;)V

    return-void
.end method

.method private static final observeCurrentData$lambda-0(Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "mock_receive : next - "

    .line 33
    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void
.end method

.method private static final observeCurrentData$lambda-4(Ljava/lang/Integer;)Lio/reactivex/ObservableSource;
    .locals 3

    const-string v0, "next"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5

    invoke-static {v1, v2, v0}, Lio/reactivex/Observable;->timer(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v0

    .line 36
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$MockProvider$N2vB96qz5S1pLrsB9_2YekdyI4E;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$MockProvider$N2vB96qz5S1pLrsB9_2YekdyI4E;-><init>(Ljava/lang/Integer;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$MockProvider$1k1HItYBWjsGe4z90jpsu-TT9hQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$MockProvider$1k1HItYBWjsGe4z90jpsu-TT9hQ;

    .line 49
    invoke-virtual {p0, v0}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final observeCurrentData$lambda-4$lambda-2(Ljava/lang/Integer;Ljava/lang/Long;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;
    .locals 18

    const-string v0, "$next"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xa

    mul-int/lit8 v0, v0, 0xa

    rsub-int/lit8 v0, v0, 0x64

    .line 39
    new-instance v15, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    int-to-float v12, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/16 v14, 0x2ff

    const/16 v16, 0x0

    move-object v2, v15

    move-object/from16 v17, v15

    move-object/from16 v15, v16

    invoke-direct/range {v2 .. v15}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;-><init>(IIIFIIJFFLpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v2, 0x1388

    if-eq v0, v1, :cond_3

    const/16 v1, 0x28

    if-eq v0, v1, :cond_2

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_1

    const/16 v1, 0x5a

    if-eq v0, v1, :cond_0

    move-object/from16 v1, v17

    goto :goto_0

    :cond_0
    const/16 v0, 0x2ee0

    move-object/from16 v1, v17

    .line 42
    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->setTotalSteps(I)V

    goto :goto_0

    :cond_1
    move-object/from16 v1, v17

    const/16 v0, 0x258

    .line 43
    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->setTotalSleep(I)V

    goto :goto_0

    :cond_2
    move-object/from16 v1, v17

    .line 44
    invoke-virtual {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->setTotalActiveCalories(I)V

    goto :goto_0

    :cond_3
    move-object/from16 v1, v17

    .line 45
    invoke-virtual {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->setTotalThermalPower(I)V

    :goto_0
    return-object v1
.end method

.method private static final observeCurrentData$lambda-4$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)V
    .locals 1

    .line 49
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->getBatteryPercent()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    const-string v0, "mock_receive : next run - "

    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public loadData(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;",
            ">;>;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    new-instance p1, Lkotlin/NotImplementedError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "An operation is not implemented: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Not yet implemented"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public observeCurrentData()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    const/16 v1, 0xa

    .line 32
    invoke-static {v0, v1}, Lio/reactivex/Observable;->range(II)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$MockProvider$fpW4GzlWaJ3ZyFPWpTyl_3IXsbw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$MockProvider$fpW4GzlWaJ3ZyFPWpTyl_3IXsbw;

    .line 33
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$MockProvider$XQeN2MT0F2farxtvT1L-XSDOk3Q;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$MockProvider$XQeN2MT0F2farxtvT1L-XSDOk3Q;

    .line 34
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->concatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "range(1, 10)\n                .doOnNext { println(\"mock_receive : next - $it\") }\n                .concatMap { next ->\n                    Observable.timer(5, TimeUnit.SECONDS)\n                            .map {\n                                val level = 100 - 10*next\n\n                                RealtimeWatchData(batteryPercent = level.toFloat())\n                                        .apply {\n                                            when (level) {\n                                                90 -> totalSteps = 12000\n                                                60 -> totalSleep = 600\n                                                40 -> totalActiveCalories = 5000\n                                                10 -> totalThermalPower = 5000\n                                            }\n                                        }\n                            }\n                            .doOnNext { \"mock_receive : next run - ${it.batteryPercent}\" }\n                }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public observeData(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;",
            ">;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    new-instance p1, Lkotlin/NotImplementedError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "An operation is not implemented: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Not yet implemented"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method
