.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$NUxHI0VOCEHFPWgeJKC9PoEYZO0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$NUxHI0VOCEHFPWgeJKC9PoEYZO0;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$NUxHI0VOCEHFPWgeJKC9PoEYZO0;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda$NUxHI0VOCEHFPWgeJKC9PoEYZO0(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
