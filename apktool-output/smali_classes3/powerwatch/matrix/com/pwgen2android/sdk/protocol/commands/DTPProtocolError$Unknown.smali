.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$Unknown;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError;
.source "Gen2Comands.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Unknown"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$Unknown;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError;",
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
.field public static final INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$Unknown;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$Unknown;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$Unknown;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$Unknown;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$Unknown;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 23
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$UNKNOWN;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$UNKNOWN;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$UNKNOWN;->getStringCode()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Error: Unknown"

    const/4 v2, 0x0

    invoke-direct {p0, v1, v0, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
