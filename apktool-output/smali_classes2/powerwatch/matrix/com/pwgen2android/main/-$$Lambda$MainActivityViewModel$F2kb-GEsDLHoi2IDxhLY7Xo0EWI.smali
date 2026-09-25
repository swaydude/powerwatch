.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$F2kb-GEsDLHoi2IDxhLY7Xo0EWI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;

.field public final synthetic f$3:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;

.field public final synthetic f$4:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$F2kb-GEsDLHoi2IDxhLY7Xo0EWI;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$F2kb-GEsDLHoi2IDxhLY7Xo0EWI;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$F2kb-GEsDLHoi2IDxhLY7Xo0EWI;->f$2:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$F2kb-GEsDLHoi2IDxhLY7Xo0EWI;->f$3:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;

    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$F2kb-GEsDLHoi2IDxhLY7Xo0EWI;->f$4:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$F2kb-GEsDLHoi2IDxhLY7Xo0EWI;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$F2kb-GEsDLHoi2IDxhLY7Xo0EWI;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$F2kb-GEsDLHoi2IDxhLY7Xo0EWI;->f$2:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$F2kb-GEsDLHoi2IDxhLY7Xo0EWI;->f$3:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;

    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$F2kb-GEsDLHoi2IDxhLY7Xo0EWI;->f$4:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    move-object v5, p1

    check-cast v5, Ljava/lang/Throwable;

    invoke-static/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->lambda$F2kb-GEsDLHoi2IDxhLY7Xo0EWI(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
