.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$UserActivitySessionDataProviderImpl$uIYShWIQB7YE0lUKDE9Q6JibUik;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$UserActivitySessionDataProviderImpl$uIYShWIQB7YE0lUKDE9Q6JibUik;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$UserActivitySessionDataProviderImpl$uIYShWIQB7YE0lUKDE9Q6JibUik;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;->lambda$uIYShWIQB7YE0lUKDE9Q6JibUik(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;)V

    return-void
.end method
