.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$vAuqmX2UwQbNBXNCSOJGOnO7oGw;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$vAuqmX2UwQbNBXNCSOJGOnO7oGw;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$vAuqmX2UwQbNBXNCSOJGOnO7oGw;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;->lambda$vAuqmX2UwQbNBXNCSOJGOnO7oGw(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    move-result-object p1

    return-object p1
.end method
