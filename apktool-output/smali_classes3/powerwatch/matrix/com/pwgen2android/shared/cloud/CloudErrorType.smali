.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;
.super Ljava/lang/Throwable;
.source "CloudErrorResolver.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Unauthorized;,
        Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Forbidden;,
        Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$BadCredentials;,
        Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$UserNotEnabled;,
        Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$MigrationRequired;,
        Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$AccountAlreadyExists;,
        Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$PasswordNotMatch;,
        Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$PasswordEmptyChar;,
        Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Unknown;,
        Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$InvalidGrant;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\n\u0007\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010B\u000f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\n\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;",
        "",
        "error",
        "",
        "(Ljava/lang/String;)V",
        "getError",
        "()Ljava/lang/String;",
        "AccountAlreadyExists",
        "BadCredentials",
        "Forbidden",
        "InvalidGrant",
        "MigrationRequired",
        "PasswordEmptyChar",
        "PasswordNotMatch",
        "Unauthorized",
        "Unknown",
        "UserNotEnabled",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Unauthorized;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Forbidden;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$BadCredentials;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$UserNotEnabled;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$MigrationRequired;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$AccountAlreadyExists;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$PasswordNotMatch;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$PasswordEmptyChar;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$Unknown;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$InvalidGrant;",
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
.field private final error:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;->error:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getError()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;->error:Ljava/lang/String;

    return-object v0
.end method
