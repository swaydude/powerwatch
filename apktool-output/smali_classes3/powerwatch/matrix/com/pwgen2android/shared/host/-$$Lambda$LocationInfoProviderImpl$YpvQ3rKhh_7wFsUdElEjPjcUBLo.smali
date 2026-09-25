.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$YpvQ3rKhh_7wFsUdElEjPjcUBLo;
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

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$YpvQ3rKhh_7wFsUdElEjPjcUBLo;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$YpvQ3rKhh_7wFsUdElEjPjcUBLo;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;

    check-cast p1, Lkotlin/Pair;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->lambda$YpvQ3rKhh_7wFsUdElEjPjcUBLo(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Lkotlin/Pair;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
