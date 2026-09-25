.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/-$$Lambda$PowerWatchApp$vDBtc68NlVJi_rcTZ-45tbxVvpg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lkotlin/Lazy;


# direct methods
.method public synthetic constructor <init>(Lkotlin/Lazy;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/-$$Lambda$PowerWatchApp$vDBtc68NlVJi_rcTZ-45tbxVvpg;->f$0:Lkotlin/Lazy;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/-$$Lambda$PowerWatchApp$vDBtc68NlVJi_rcTZ-45tbxVvpg;->f$0:Lkotlin/Lazy;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/MonitoringEvent;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp;->lambda$vDBtc68NlVJi_rcTZ-45tbxVvpg(Lkotlin/Lazy;Lpowerwatch/matrix/com/pwgen2android/sdk/MonitoringEvent;)V

    return-void
.end method
