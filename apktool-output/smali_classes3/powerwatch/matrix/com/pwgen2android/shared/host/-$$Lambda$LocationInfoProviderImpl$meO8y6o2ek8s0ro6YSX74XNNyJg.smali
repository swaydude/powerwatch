.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$meO8y6o2ek8s0ro6YSX74XNNyJg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$meO8y6o2ek8s0ro6YSX74XNNyJg;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$meO8y6o2ek8s0ro6YSX74XNNyJg;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;

    check-cast p1, Lkotlin/Unit;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->lambda$meO8y6o2ek8s0ro6YSX74XNNyJg(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Lkotlin/Unit;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
