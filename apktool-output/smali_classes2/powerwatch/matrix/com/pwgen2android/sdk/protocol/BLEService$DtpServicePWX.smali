.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$DtpServicePWX;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService;
.source "BLEServices.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DtpServicePWX"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$DtpServicePWX;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService;",
        "()V",
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


# static fields
.field public static final INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$DtpServicePWX;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$DtpServicePWX;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$DtpServicePWX;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$DtpServicePWX;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$DtpServicePWX;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    const-string v0, "00002760-08C2-11E1-9073-0E8AC72E1011"

    .line 32
    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    const-string v1, "fromString(DTP_SERVICE)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/util/UUID;

    const-string v2, "00002760-08C2-11E1-9073-0E8AC72E0013"

    .line 33
    invoke-static {v2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    const-string v3, "fromString(BASIC_DTP_SERVICE_PWX_RX)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "00002760-08C2-11E1-9073-0E8AC72E0012"

    invoke-static {v2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    const-string v3, "fromString(BASIC_DTP_SERVICE_TX)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    const/4 v2, 0x0

    .line 32
    invoke-direct {p0, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService;-><init>(Ljava/util/UUID;Ljava/util/Set;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
