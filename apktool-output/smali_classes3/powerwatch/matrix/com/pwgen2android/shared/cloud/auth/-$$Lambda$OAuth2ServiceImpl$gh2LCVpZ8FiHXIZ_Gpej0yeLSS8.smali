.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$gh2LCVpZ8FiHXIZ_Gpej0yeLSS8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;

.field public final synthetic f$3:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$gh2LCVpZ8FiHXIZ_Gpej0yeLSS8;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$gh2LCVpZ8FiHXIZ_Gpej0yeLSS8;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$gh2LCVpZ8FiHXIZ_Gpej0yeLSS8;->f$2:Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$gh2LCVpZ8FiHXIZ_Gpej0yeLSS8;->f$3:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$gh2LCVpZ8FiHXIZ_Gpej0yeLSS8;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$gh2LCVpZ8FiHXIZ_Gpej0yeLSS8;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$gh2LCVpZ8FiHXIZ_Gpej0yeLSS8;->f$2:Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$gh2LCVpZ8FiHXIZ_Gpej0yeLSS8;->f$3:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;

    invoke-static {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;->lambda$gh2LCVpZ8FiHXIZ_Gpej0yeLSS8(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;)Lio/reactivex/SingleSource;

    move-result-object v0

    return-object v0
.end method
