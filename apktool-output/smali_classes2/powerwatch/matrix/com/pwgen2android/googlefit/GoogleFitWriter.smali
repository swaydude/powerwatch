.class public final Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;
.super Ljava/lang/Object;
.source "GoogleFitWriter.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u001c\u0010\t\u001a\u00020\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u0002\u001a\u00020\u0003J\u001c\u0010\u000e\u001a\u00020\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000c2\u0006\u0010\u0002\u001a\u00020\u0003J\u001c\u0010\u0010\u001a\u00020\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000c2\u0006\u0010\u0002\u001a\u00020\u0003J\u001c\u0010\u0012\u001a\u00020\n2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u000c2\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "context",
        "Landroid/content/Context;",
        "googleFitSessionWriter",
        "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;",
        "googleFitDataWriter",
        "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;",
        "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V",
        "saveRestingLog",
        "Lio/reactivex/Completable;",
        "logs",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;",
        "saveSleepingLog",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
        "saveWalkingLog",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
        "writeSessions",
        "userSessions",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
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
.field private final context:Landroid/content/Context;

.field private final googleFitDataWriter:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;

.field private final googleFitSessionWriter:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googleFitSessionWriter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googleFitDataWriter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;->context:Landroid/content/Context;

    .line 12
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;->googleFitSessionWriter:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;

    .line 13
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;->googleFitDataWriter:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;

    return-void
.end method


# virtual methods
.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 11
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final saveRestingLog(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;->googleFitDataWriter:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;

    invoke-virtual {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveRestingLog(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public final saveSleepingLog(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;->googleFitDataWriter:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveSleepingLog$default(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;Landroid/content/Context;ZILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public final saveWalkingLog(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;->googleFitDataWriter:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;

    invoke-virtual {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveWalkingLog(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public final writeSessions(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "userSessions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitWriter;->googleFitSessionWriter:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;

    invoke-virtual {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->writeSessions(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method
