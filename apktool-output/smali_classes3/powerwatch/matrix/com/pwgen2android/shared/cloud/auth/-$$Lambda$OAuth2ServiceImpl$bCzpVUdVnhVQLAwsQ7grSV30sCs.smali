.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$bCzpVUdVnhVQLAwsQ7grSV30sCs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$bCzpVUdVnhVQLAwsQ7grSV30sCs;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$OAuth2ServiceImpl$bCzpVUdVnhVQLAwsQ7grSV30sCs;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;->lambda$bCzpVUdVnhVQLAwsQ7grSV30sCs(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    move-result-object p1

    return-object p1
.end method
