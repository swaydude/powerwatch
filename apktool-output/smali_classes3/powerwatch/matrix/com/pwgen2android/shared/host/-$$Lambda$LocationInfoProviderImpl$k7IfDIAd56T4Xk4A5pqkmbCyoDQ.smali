.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$k7IfDIAd56T4Xk4A5pqkmbCyoDQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/SingleOnSubscribe;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;

.field public final synthetic f$1:Landroid/location/Location;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Landroid/location/Location;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$k7IfDIAd56T4Xk4A5pqkmbCyoDQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$k7IfDIAd56T4Xk4A5pqkmbCyoDQ;->f$1:Landroid/location/Location;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/SingleEmitter;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$k7IfDIAd56T4Xk4A5pqkmbCyoDQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$k7IfDIAd56T4Xk4A5pqkmbCyoDQ;->f$1:Landroid/location/Location;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->lambda$k7IfDIAd56T4Xk4A5pqkmbCyoDQ(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Landroid/location/Location;Lio/reactivex/SingleEmitter;)V

    return-void
.end method
