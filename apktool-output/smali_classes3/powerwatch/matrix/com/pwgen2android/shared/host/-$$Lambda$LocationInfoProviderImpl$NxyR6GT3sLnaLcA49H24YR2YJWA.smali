.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$NxyR6GT3sLnaLcA49H24YR2YJWA;
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

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$NxyR6GT3sLnaLcA49H24YR2YJWA;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationInfoProviderImpl$NxyR6GT3sLnaLcA49H24YR2YJWA;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;->lambda$NxyR6GT3sLnaLcA49H24YR2YJWA(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;Ljava/lang/Boolean;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
