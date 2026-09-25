.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$5PsJlqFj7dclbbTF8WRqPC0yUJE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;


# direct methods
.method public synthetic constructor <init>(ZLpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$5PsJlqFj7dclbbTF8WRqPC0yUJE;->f$0:Z

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$5PsJlqFj7dclbbTF8WRqPC0yUJE;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$5PsJlqFj7dclbbTF8WRqPC0yUJE;->f$2:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$5PsJlqFj7dclbbTF8WRqPC0yUJE;->f$0:Z

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$5PsJlqFj7dclbbTF8WRqPC0yUJE;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$5PsJlqFj7dclbbTF8WRqPC0yUJE;->f$2:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    invoke-static {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->lambda$5PsJlqFj7dclbbTF8WRqPC0yUJE(ZLpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/ObservableSource;

    move-result-object v0

    return-object v0
.end method
