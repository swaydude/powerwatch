.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$LoginCloudServiceImpl$1LanDXDO6a7fUvvd5NxwBwtYzSI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$LoginCloudServiceImpl$1LanDXDO6a7fUvvd5NxwBwtYzSI;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$LoginCloudServiceImpl$1LanDXDO6a7fUvvd5NxwBwtYzSI;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;->lambda$1LanDXDO6a7fUvvd5NxwBwtYzSI(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
