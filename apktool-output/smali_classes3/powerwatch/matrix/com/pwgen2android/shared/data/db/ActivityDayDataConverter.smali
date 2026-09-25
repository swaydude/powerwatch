.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityDayDataConverter;
.super Ljava/lang/Object;
.source "TypeConverters.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0016\u0010\u0008\u001a\u00020\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0006H\u0007J\u0016\u0010\u000b\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0006H\u0007J\u0016\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0016\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0016\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000c\u001a\u00020\u0004H\u0007\u00a8\u0006\u0011"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityDayDataConverter;",
        "",
        "()V",
        "fromRestingDays",
        "",
        "restingDays",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;",
        "fromSleepDays",
        "sleepDays",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;",
        "fromWalkingDays",
        "walkingDays",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;",
        "toRestingDays",
        "toSleepDays",
        "toWalkingDays",
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

    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromRestingDays(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "restingDays"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 165
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityDayDataConverter$fromRestingDays$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityDayDataConverter$fromRestingDays$type$1;-><init>()V

    .line 167
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityDayDataConverter$fromRestingDays$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 168
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "gson.toJson(restingDays, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final fromSleepDays(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "sleepDays"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 202
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityDayDataConverter$fromSleepDays$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityDayDataConverter$fromSleepDays$type$1;-><init>()V

    .line 204
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityDayDataConverter$fromSleepDays$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 205
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "gson.toJson(sleepDays, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final fromWalkingDays(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "walkingDays"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 184
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityDayDataConverter$fromWalkingDays$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityDayDataConverter$fromWalkingDays$type$1;-><init>()V

    .line 186
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityDayDataConverter$fromWalkingDays$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 187
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "gson.toJson(walkingDays, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final toRestingDays(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;",
            ">;"
        }
    .end annotation

    const-string v0, "restingDays"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 174
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityDayDataConverter$toRestingDays$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityDayDataConverter$toRestingDays$type$1;-><init>()V

    .line 176
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityDayDataConverter$toRestingDays$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 177
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "gson.fromJson(restingDays, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final toSleepDays(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;",
            ">;"
        }
    .end annotation

    const-string v0, "sleepDays"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 211
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityDayDataConverter$toSleepDays$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityDayDataConverter$toSleepDays$type$1;-><init>()V

    .line 213
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityDayDataConverter$toSleepDays$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 214
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "gson.fromJson(sleepDays, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final toWalkingDays(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;",
            ">;"
        }
    .end annotation

    const-string v0, "walkingDays"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 193
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityDayDataConverter$toWalkingDays$type$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityDayDataConverter$toWalkingDays$type$1;-><init>()V

    .line 195
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityDayDataConverter$toWalkingDays$type$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 196
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "gson.fromJson(walkingDays, type)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    return-object p1
.end method
