.class public abstract Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;
.super Ljava/lang/Object;
.source "Gen2Comands.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$SUCCESS;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$ERROR;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$LOCKED;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$WAIT;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$PROCESSING;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$UNKNOWN;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0006\u000b\u000c\r\u000e\u000f\u0010B\u0017\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u0082\u0001\u0006\u0011\u0012\u0013\u0014\u0015\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;",
        "",
        "stringCode",
        "",
        "hex",
        "",
        "(Ljava/lang/String;I)V",
        "getHex",
        "()I",
        "getStringCode",
        "()Ljava/lang/String;",
        "ERROR",
        "LOCKED",
        "PROCESSING",
        "SUCCESS",
        "UNKNOWN",
        "WAIT",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$SUCCESS;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$ERROR;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$LOCKED;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$WAIT;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$PROCESSING;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$UNKNOWN;",
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
.field private final hex:I

.field private final stringCode:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;->stringCode:Ljava/lang/String;

    iput p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;->hex:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final getHex()I
    .locals 1

    .line 35
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;->hex:I

    return v0
.end method

.method public final getStringCode()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;->stringCode:Ljava/lang/String;

    return-object v0
.end method
