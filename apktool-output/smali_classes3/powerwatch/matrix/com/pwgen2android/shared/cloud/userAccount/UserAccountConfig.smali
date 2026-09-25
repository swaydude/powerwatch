.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;
.super Ljava/lang/Object;
.source "UserAccountConfig.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000e\u00a8\u0006\u0013"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;",
        "",
        "forgotPasswordUrl",
        "",
        "resetPasswordUrl",
        "verifyAccountUrl",
        "resendVerifyEmailUrl",
        "firebaseTokenUrl",
        "crudServiceConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V",
        "getCrudServiceConfig",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;",
        "getFirebaseTokenUrl",
        "()Ljava/lang/String;",
        "getForgotPasswordUrl",
        "getResendVerifyEmailUrl",
        "getResetPasswordUrl",
        "getVerifyAccountUrl",
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


# instance fields
.field private final crudServiceConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

.field private final firebaseTokenUrl:Ljava/lang/String;

.field private final forgotPasswordUrl:Ljava/lang/String;

.field private final resendVerifyEmailUrl:Ljava/lang/String;

.field private final resetPasswordUrl:Ljava/lang/String;

.field private final verifyAccountUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V
    .locals 1

    const-string v0, "forgotPasswordUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resetPasswordUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "verifyAccountUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resendVerifyEmailUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firebaseTokenUrl"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crudServiceConfig"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;->forgotPasswordUrl:Ljava/lang/String;

    .line 9
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;->resetPasswordUrl:Ljava/lang/String;

    .line 10
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;->verifyAccountUrl:Ljava/lang/String;

    .line 11
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;->resendVerifyEmailUrl:Ljava/lang/String;

    .line 12
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;->firebaseTokenUrl:Ljava/lang/String;

    .line 13
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;->crudServiceConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    return-void
.end method


# virtual methods
.method public final getCrudServiceConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;
    .locals 1

    .line 13
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;->crudServiceConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    return-object v0
.end method

.method public final getFirebaseTokenUrl()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;->firebaseTokenUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getForgotPasswordUrl()Ljava/lang/String;
    .locals 1

    .line 8
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;->forgotPasswordUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getResendVerifyEmailUrl()Ljava/lang/String;
    .locals 1

    .line 11
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;->resendVerifyEmailUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getResetPasswordUrl()Ljava/lang/String;
    .locals 1

    .line 9
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;->resetPasswordUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getVerifyAccountUrl()Ljava/lang/String;
    .locals 1

    .line 10
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;->verifyAccountUrl:Ljava/lang/String;

    return-object v0
.end method
