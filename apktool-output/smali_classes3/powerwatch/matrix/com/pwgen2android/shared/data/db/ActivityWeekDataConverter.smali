.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityWeekDataConverter;
.super Ljava/lang/Object;
.source "TypeConverters.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0016\u0010\u0008\u001a\u00020\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0006H\u0007J\u0016\u0010\u000b\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0006H\u0007J\u0016\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0016\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0016\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000c\u001a\u00020\u0004H\u0007\u00a8\u0006\u0011"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityWeekDataConverter;",
        "",
        "()V",
        "fromRestingWeeks",
        "",
        "restingWeeks",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;",
        "fromSleepWeeks",
        "sleepWeeks",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;",
        "fromWalkingWeeks",
        "walkingWeeks",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;",
        "toRestingWeeks",
        "toSleepWeeks",
        "toWalkingWeeks",
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

    .line 218
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromRestingWeeks(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "restingWeeks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 222
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 223
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityWeekDataConverter$fromRestingWeeks$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityWeekDataConverter$fromRestingWeeks$type$1;-><init>()V

    .line 225
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityWeekDataConverter$fromRestingWeeks$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 226
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "gson.toJson(restingWeeks, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final fromSleepWeeks(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "sleepWeeks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 260
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityWeekDataConverter$fromSleepWeeks$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityWeekDataConverter$fromSleepWeeks$type$1;-><init>()V

    .line 262
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityWeekDataConverter$fromSleepWeeks$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 263
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "gson.toJson(sleepWeeks, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final fromWalkingWeeks(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "walkingWeeks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 241
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 242
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityWeekDataConverter$fromWalkingWeeks$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityWeekDataConverter$fromWalkingWeeks$type$1;-><init>()V

    .line 244
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityWeekDataConverter$fromWalkingWeeks$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 245
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "gson.toJson(walkingWeeks, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final toRestingWeeks(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;",
            ">;"
        }
    .end annotation

    const-string v0, "restingWeeks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 232
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityWeekDataConverter$toRestingWeeks$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityWeekDataConverter$toRestingWeeks$type$1;-><init>()V

    .line 234
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityWeekDataConverter$toRestingWeeks$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 235
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "gson.fromJson(restingWeeks, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final toSleepWeeks(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;",
            ">;"
        }
    .end annotation

    const-string v0, "sleepWeeks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 269
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityWeekDataConverter$toSleepWeeks$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityWeekDataConverter$toSleepWeeks$type$1;-><init>()V

    .line 271
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityWeekDataConverter$toSleepWeeks$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 272
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "gson.fromJson(sleepWeeks, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final toWalkingWeeks(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;",
            ">;"
        }
    .end annotation

    const-string v0, "walkingWeeks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 251
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityWeekDataConverter$toWalkingWeeks$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityWeekDataConverter$toWalkingWeeks$type$1;-><init>()V

    .line 253
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityWeekDataConverter$toWalkingWeeks$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 254
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "gson.fromJson(walkingWeeks, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    return-object p1
.end method
