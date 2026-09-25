.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository$DefaultImpls;
.super Ljava/lang/Object;
.source "WalkingLogRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;)Lorg/koin/core/Koin;
    .locals 1

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object p0

    return-object p0
.end method
