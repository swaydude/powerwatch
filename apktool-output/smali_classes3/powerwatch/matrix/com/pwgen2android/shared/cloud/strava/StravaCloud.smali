.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;
.super Ljava/lang/Object;
.source "StravaCloud.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00082\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000fH&\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;",
        "",
        "hasToken",
        "",
        "loadStoredCredentials",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;",
        "login",
        "Lio/reactivex/Single;",
        "stravaHost",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;",
        "logout",
        "Lio/reactivex/Completable;",
        "uploadActivity",
        "data",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract hasToken()Z
.end method

.method public abstract loadStoredCredentials()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;",
            ">;"
        }
    .end annotation
.end method

.method public abstract login(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;",
            ">;"
        }
    .end annotation
.end method

.method public abstract logout(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;)Lio/reactivex/Completable;
.end method

.method public abstract uploadActivity(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;)Lio/reactivex/Completable;
.end method
