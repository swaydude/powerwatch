.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/-$$Lambda$AGPSRepositoryCache$3lpnkz7oW6a8C89oqsiYQZyxFl0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/SingleOnSubscribe;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/-$$Lambda$AGPSRepositoryCache$3lpnkz7oW6a8C89oqsiYQZyxFl0;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/-$$Lambda$AGPSRepositoryCache$3lpnkz7oW6a8C89oqsiYQZyxFl0;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/SingleEmitter;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/-$$Lambda$AGPSRepositoryCache$3lpnkz7oW6a8C89oqsiYQZyxFl0;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/-$$Lambda$AGPSRepositoryCache$3lpnkz7oW6a8C89oqsiYQZyxFl0;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->lambda$3lpnkz7oW6a8C89oqsiYQZyxFl0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;Lio/reactivex/SingleEmitter;)V

    return-void
.end method
