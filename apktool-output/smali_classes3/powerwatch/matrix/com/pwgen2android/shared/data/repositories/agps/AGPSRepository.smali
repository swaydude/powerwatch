.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;
.super Ljava/lang/Object;
.source "AGPSRepository.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository;
.implements Lpowerwatch/matrix/com/pwgen2android/secret/SaveRepository;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository<",
        "Ljava/lang/String;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/secret/SaveRepository<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0008f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H&J\u0008\u0010\u0007\u001a\u00020\u0008H&\u00a8\u0006\t"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;",
        "Lpowerwatch/matrix/com/pwgen2android/secret/SaveRepository;",
        "isWatchUpdateNeeded",
        "",
        "storeLastUpdateTimestamp",
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
.method public abstract isWatchUpdateNeeded()Z
.end method

.method public abstract storeLastUpdateTimestamp()V
.end method
