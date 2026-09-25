.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter;
.super Ljava/lang/Object;
.source "TypeConverters.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0016\u0010\u0007\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u0007J\u0016\u0010\u000b\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\tH\u0007J\u0016\u0010\u000e\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\tH\u0007J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0016\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0008\u001a\u00020\u0004H\u0007J\u0016\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\u000c\u001a\u00020\u0004H\u0007J\u0016\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u0008\u001a\u00020\u0004H\u0007\u00a8\u0006\u0014"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter;",
        "",
        "()V",
        "fromActivityType",
        "",
        "activityType",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;",
        "fromGPSPositions",
        "gpsPositions",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;",
        "fromHeartRates",
        "heartRates",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;",
        "fromRunningSplits",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;",
        "toActivityType",
        "toGPSPositions",
        "toHeartRates",
        "toRunningSplits",
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

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromActivityType(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;)Ljava/lang/String;
    .locals 1

    const-string v0, "activityType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->name()Ljava/lang/String;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type java.lang.String"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    const-string v0, "(this as java.lang.String).toUpperCase()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final fromGPSPositions(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "gpsPositions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 20
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter$fromGPSPositions$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter$fromGPSPositions$type$1;-><init>()V

    .line 22
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter$fromGPSPositions$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 23
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "gson.toJson(gpsPositions, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final fromHeartRates(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "heartRates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 56
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter$fromHeartRates$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter$fromHeartRates$type$1;-><init>()V

    .line 58
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter$fromHeartRates$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 59
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "gson.toJson(heartRates, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final fromRunningSplits(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "gpsPositions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 38
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter$fromRunningSplits$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter$fromRunningSplits$type$1;-><init>()V

    .line 40
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter$fromRunningSplits$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 41
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "gson.toJson(gpsPositions, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final toActivityType(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;
    .locals 1

    const-string v0, "activityType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->valueOf(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    move-result-object p1

    return-object p1
.end method

.method public final toGPSPositions(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;",
            ">;"
        }
    .end annotation

    const-string v0, "gpsPositions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 29
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter$toGPSPositions$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter$toGPSPositions$type$1;-><init>()V

    .line 31
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter$toGPSPositions$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 32
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "gson.fromJson(gpsPositions, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final toHeartRates(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;",
            ">;"
        }
    .end annotation

    const-string v0, "heartRates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 65
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter$toHeartRates$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter$toHeartRates$type$1;-><init>()V

    .line 67
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter$toHeartRates$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 68
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "gson.fromJson(heartRates, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final toRunningSplits(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;",
            ">;"
        }
    .end annotation

    const-string v0, "gpsPositions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 47
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter$toRunningSplits$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter$toRunningSplits$type$1;-><init>()V

    .line 49
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter$toRunningSplits$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 50
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "gson.fromJson(gpsPositions, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    return-object p1
.end method
