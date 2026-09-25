.class public abstract Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;
.super Ljava/lang/Object;
.source "Commands.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$FontCoreLib;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$ClockFonts;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$Gauges;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$Icons;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$UserLocation1;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$UserLocation2;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$UserLocation3;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$FontLookupTable;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0008\u0008\t\n\u000b\u000c\r\u000e\u000fB\u000f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0004\u0082\u0001\u0008\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;",
        "",
        "name",
        "",
        "(Ljava/lang/String;)V",
        "getName",
        "()Ljava/lang/String;",
        "setName",
        "ClockFonts",
        "FontCoreLib",
        "FontLookupTable",
        "Gauges",
        "Icons",
        "UserLocation1",
        "UserLocation2",
        "UserLocation3",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$FontCoreLib;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$ClockFonts;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$Gauges;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$Icons;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$UserLocation1;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$UserLocation2;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$UserLocation3;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$FontLookupTable;",
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
.field private name:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;->name:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final setName(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;->name:Ljava/lang/String;

    return-void
.end method
