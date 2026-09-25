.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/-$$Lambda$StravaApiServiceImpl$e93cfx897ppycc5NfQdq2gtN-h0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/ObservableOnSubscribe;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/-$$Lambda$StravaApiServiceImpl$e93cfx897ppycc5NfQdq2gtN-h0;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/-$$Lambda$StravaApiServiceImpl$e93cfx897ppycc5NfQdq2gtN-h0;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/ObservableEmitter;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/-$$Lambda$StravaApiServiceImpl$e93cfx897ppycc5NfQdq2gtN-h0;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/-$$Lambda$StravaApiServiceImpl$e93cfx897ppycc5NfQdq2gtN-h0;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl;->lambda$e93cfx897ppycc5NfQdq2gtN-h0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;Lio/reactivex/ObservableEmitter;)V

    return-void
.end method
