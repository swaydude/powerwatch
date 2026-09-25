.class public final Lpowerwatch/matrix/com/pwgen2android/shared/extensions/RealtimeExtensionsKt;
.super Ljava/lang/Object;
.source "RealtimeExtensions.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRealtimeExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealtimeExtensions.kt\npowerwatch/matrix/com/pwgen2android/shared/extensions/RealtimeExtensionsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,28:1\n13536#2,2:29\n13536#2,2:31\n*S KotlinDebug\n*F\n+ 1 RealtimeExtensions.kt\npowerwatch/matrix/com/pwgen2android/shared/extensions/RealtimeExtensionsKt\n*L\n7#1:29,2\n20#1:31,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u0004\"\u00020\u0002\u00a2\u0006\u0002\u0010\u0005\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00060\u0004\"\u00020\u0006\u00a2\u0006\u0002\u0010\u0008\u001a\n\u0010\t\u001a\u00020\n*\u00020\u0006\u00a8\u0006\u000b"
    }
    d2 = {
        "add",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;",
        "dataItems",
        "",
        "(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;[Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;)V",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;",
        "valueItems",
        "(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;[Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;)V",
        "showPercentage",
        "",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final varargs add(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;[Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v3, p1, v2

    .line 21
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getBodyPower()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v4

    const/4 v5, 0x1

    new-array v6, v5, [Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getBodyPower()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v7

    aput-object v7, v6, v1

    invoke-static {v4, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/RealtimeExtensionsKt;->add(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;[Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;)V

    .line 22
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getStepsData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v4

    new-array v6, v5, [Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getStepsData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v7

    aput-object v7, v6, v1

    invoke-static {v4, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/RealtimeExtensionsKt;->add(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;[Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;)V

    .line 23
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getDistanceData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v4

    new-array v6, v5, [Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getDistanceData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v7

    aput-object v7, v6, v1

    invoke-static {v4, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/RealtimeExtensionsKt;->add(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;[Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;)V

    .line 24
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getHeartBeatData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v4

    new-array v6, v5, [Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getHeartBeatData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v7

    aput-object v7, v6, v1

    invoke-static {v4, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/RealtimeExtensionsKt;->add(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;[Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;)V

    .line 25
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getCaloriesData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v4

    new-array v6, v5, [Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getCaloriesData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v7

    aput-object v7, v6, v1

    invoke-static {v4, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/RealtimeExtensionsKt;->add(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;[Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;)V

    .line 26
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getSleepData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v4

    new-array v5, v5, [Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;->getSleepData()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    move-result-object v3

    aput-object v3, v5, v1

    invoke-static {v4, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/RealtimeExtensionsKt;->add(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;[Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final varargs add(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;[Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;)V
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p1, v2

    .line 8
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getValue()F

    move-result v4

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getValue()F

    move-result v5

    add-float/2addr v4, v5

    invoke-virtual {p0, v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->setValue(F)V

    .line 9
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getGoalValue()F

    move-result v4

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getGoalValue()F

    move-result v5

    cmpg-float v4, v4, v5

    if-nez v4, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_1

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getGoalValue()F

    move-result v3

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getGoalValue()F

    move-result v3

    :goto_2
    invoke-virtual {p0, v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->setGoalValue(F)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static final showPercentage(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;)Ljava/lang/String;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getGoalValue()F

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    cmpg-float v0, v0, v3

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const-string p0, "0.00%"

    goto :goto_1

    .line 15
    :cond_1
    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    new-array v0, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getValue()F

    move-result v3

    const/16 v4, 0x64

    int-to-float v4, v4

    mul-float v3, v3, v4

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;->getGoalValue()F

    move-result p0

    div-float/2addr v3, p0

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    aput-object p0, v0, v2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string v0, "%.2f"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "java.lang.String.format(format, *args)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "%"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    :goto_1
    return-object p0
.end method
