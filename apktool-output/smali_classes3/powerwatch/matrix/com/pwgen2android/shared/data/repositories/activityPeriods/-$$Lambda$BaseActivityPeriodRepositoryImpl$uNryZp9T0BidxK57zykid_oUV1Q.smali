.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$uNryZp9T0BidxK57zykid_oUV1Q;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$uNryZp9T0BidxK57zykid_oUV1Q;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/-$$Lambda$BaseActivityPeriodRepositoryImpl$uNryZp9T0BidxK57zykid_oUV1Q;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;->lambda$uNryZp9T0BidxK57zykid_oUV1Q(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/BaseActivityPeriodRepositoryImpl;Ljava/util/List;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
