.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$ERROR;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;
.source "Gen2Comands.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ERROR"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$ERROR;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;",
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
.field public static final INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$ERROR;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$ERROR;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$ERROR;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$ERROR;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$ERROR;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const-string v0, "E404"

    const v1, 0xe404

    const/4 v2, 0x0

    .line 38
    invoke-direct {p0, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
