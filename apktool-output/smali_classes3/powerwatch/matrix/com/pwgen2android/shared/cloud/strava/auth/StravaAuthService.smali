.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;
.super Ljava/lang/Object;
.source "StravaAuthServiceImpl.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0006H&J&\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H&\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;",
        "",
        "authorize",
        "Lio/reactivex/Single;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;",
        "config",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;",
        "host",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;",
        "logout",
        "Lio/reactivex/Completable;",
        "stravaHost",
        "refresh",
        "refreshToken",
        "",
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
.method public abstract authorize(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;",
            ">;"
        }
    .end annotation
.end method

.method public abstract logout(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;)Lio/reactivex/Completable;
.end method

.method public abstract refresh(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;",
            ">;"
        }
    .end annotation
.end method
