.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$7_uG2-s16mewLZXgyhd81pG43aY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$7_uG2-s16mewLZXgyhd81pG43aY;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$7_uG2-s16mewLZXgyhd81pG43aY;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$7_uG2-s16mewLZXgyhd81pG43aY;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$7_uG2-s16mewLZXgyhd81pG43aY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$7_uG2-s16mewLZXgyhd81pG43aY;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->lambda$7_uG2-s16mewLZXgyhd81pG43aY(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/AuthHeaderData;

    move-result-object p1

    return-object p1
.end method
