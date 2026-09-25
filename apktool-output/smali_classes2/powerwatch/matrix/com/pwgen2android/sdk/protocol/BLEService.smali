.class public abstract Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService;
.super Ljava/lang/Object;
.source "BLEServices.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$DtpService;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$DtpServicePWX;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$OtaService;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0003\u000b\u000c\rB\u001d\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0010\u0006R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u0082\u0001\u0003\u000e\u000f\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService;",
        "",
        "service",
        "Ljava/util/UUID;",
        "chars",
        "",
        "(Ljava/util/UUID;Ljava/util/Set;)V",
        "getChars",
        "()Ljava/util/Set;",
        "getService",
        "()Ljava/util/UUID;",
        "DtpService",
        "DtpServicePWX",
        "OtaService",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$DtpService;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$DtpServicePWX;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService$OtaService;",
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
.field private final chars:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation
.end field

.field private final service:Ljava/util/UUID;


# direct methods
.method private constructor <init>(Ljava/util/UUID;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;)V"
        }
    .end annotation

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService;->service:Ljava/util/UUID;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService;->chars:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/UUID;Ljava/util/Set;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService;-><init>(Ljava/util/UUID;Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final getChars()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService;->chars:Ljava/util/Set;

    return-object v0
.end method

.method public final getService()Ljava/util/UUID;
    .locals 1

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BLEService;->service:Ljava/util/UUID;

    return-object v0
.end method
