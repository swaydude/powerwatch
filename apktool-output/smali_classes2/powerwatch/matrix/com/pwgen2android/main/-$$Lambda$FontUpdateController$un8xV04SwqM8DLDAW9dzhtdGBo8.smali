.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$un8xV04SwqM8DLDAW9dzhtdGBo8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$un8xV04SwqM8DLDAW9dzhtdGBo8;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$un8xV04SwqM8DLDAW9dzhtdGBo8;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->lambda$un8xV04SwqM8DLDAW9dzhtdGBo8(Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)V

    return-void
.end method
