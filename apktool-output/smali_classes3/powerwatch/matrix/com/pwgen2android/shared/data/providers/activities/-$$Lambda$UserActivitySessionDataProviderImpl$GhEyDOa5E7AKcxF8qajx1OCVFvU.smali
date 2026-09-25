.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$UserActivitySessionDataProviderImpl$GhEyDOa5E7AKcxF8qajx1OCVFvU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$UserActivitySessionDataProviderImpl$GhEyDOa5E7AKcxF8qajx1OCVFvU;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$UserActivitySessionDataProviderImpl$GhEyDOa5E7AKcxF8qajx1OCVFvU;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$UserActivitySessionDataProviderImpl$GhEyDOa5E7AKcxF8qajx1OCVFvU;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$UserActivitySessionDataProviderImpl$GhEyDOa5E7AKcxF8qajx1OCVFvU;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;->lambda$GhEyDOa5E7AKcxF8qajx1OCVFvU(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;)Lio/reactivex/ObservableSource;

    move-result-object v0

    return-object v0
.end method
