.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$V6mD5UrrXLX25LfMjXUYs9K_mXQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$V6mD5UrrXLX25LfMjXUYs9K_mXQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$V6mD5UrrXLX25LfMjXUYs9K_mXQ;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$V6mD5UrrXLX25LfMjXUYs9K_mXQ;->f$2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$V6mD5UrrXLX25LfMjXUYs9K_mXQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$V6mD5UrrXLX25LfMjXUYs9K_mXQ;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$V6mD5UrrXLX25LfMjXUYs9K_mXQ;->f$2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;

    invoke-static {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;->lambda$V6mD5UrrXLX25LfMjXUYs9K_mXQ(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;)Lio/reactivex/SingleSource;

    move-result-object v0

    return-object v0
.end method
