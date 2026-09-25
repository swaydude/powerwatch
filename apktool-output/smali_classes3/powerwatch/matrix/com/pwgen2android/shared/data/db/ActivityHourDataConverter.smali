.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter;
.super Ljava/lang/Object;
.source "TypeConverters.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0016\u0010\u0008\u001a\u00020\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0006H\u0007J\u0016\u0010\u000b\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0006H\u0007J\u0016\u0010\u000e\u001a\u00020\u00042\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0006H\u0007J\u0016\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0016\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0016\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000c\u001a\u00020\u0004H\u0007J\u0016\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u000f\u001a\u00020\u0004H\u0007\u00a8\u0006\u0015"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter;",
        "",
        "()V",
        "fromRestingHours",
        "",
        "restingHours",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
        "fromSleepHours",
        "sleepHours",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;",
        "fromSleepMins",
        "sleepMins",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;",
        "fromWalkingHours",
        "walkingHours",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
        "toRestingHours",
        "toSleepHours",
        "toSleepMins",
        "toWalkingHours",
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

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromRestingHours(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "restingHours"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 88
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$fromRestingHours$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$fromRestingHours$type$1;-><init>()V

    .line 90
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$fromRestingHours$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 91
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "gson.toJson(restingHours, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final fromSleepHours(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "sleepHours"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 143
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$fromSleepHours$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$fromSleepHours$type$1;-><init>()V

    .line 145
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$fromSleepHours$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 146
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "gson.toJson(sleepHours, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final fromSleepMins(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "sleepMins"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 125
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$fromSleepMins$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$fromSleepMins$type$1;-><init>()V

    .line 127
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$fromSleepMins$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 128
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "gson.toJson(sleepMins, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final fromWalkingHours(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "walkingHours"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 107
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$fromWalkingHours$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$fromWalkingHours$type$1;-><init>()V

    .line 109
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$fromWalkingHours$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 110
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "gson.toJson(walkingHours, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final toRestingHours(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
            ">;"
        }
    .end annotation

    const-string v0, "restingHours"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 97
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$toRestingHours$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$toRestingHours$type$1;-><init>()V

    .line 99
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$toRestingHours$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 100
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "gson.fromJson(restingHours, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final toSleepHours(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;",
            ">;"
        }
    .end annotation

    const-string v0, "sleepHours"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 152
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$toSleepHours$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$toSleepHours$type$1;-><init>()V

    .line 154
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$toSleepHours$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 155
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "gson.fromJson(sleepHours, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final toSleepMins(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;",
            ">;"
        }
    .end annotation

    const-string v0, "sleepMins"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 134
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$toSleepMins$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$toSleepMins$type$1;-><init>()V

    .line 136
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$toSleepMins$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 137
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "gson.fromJson(sleepMins, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final toWalkingHours(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;",
            ">;"
        }
    .end annotation

    const-string v0, "walkingHours"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 116
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$toWalkingHours$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$toWalkingHours$type$1;-><init>()V

    .line 118
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter$toWalkingHours$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 119
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "gson.fromJson(walkingHours, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    return-object p1
.end method
