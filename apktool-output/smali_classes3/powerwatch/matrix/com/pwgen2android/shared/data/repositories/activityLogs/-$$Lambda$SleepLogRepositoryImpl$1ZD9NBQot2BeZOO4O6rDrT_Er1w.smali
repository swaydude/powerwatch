.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$SleepLogRepositoryImpl$1ZD9NBQot2BeZOO4O6rDrT_Er1w;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$SleepLogRepositoryImpl$1ZD9NBQot2BeZOO4O6rDrT_Er1w;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/-$$Lambda$SleepLogRepositoryImpl$1ZD9NBQot2BeZOO4O6rDrT_Er1w;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;->lambda$1ZD9NBQot2BeZOO4O6rDrT_Er1w(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/SleepLogRepositoryImpl;Ljava/util/List;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
