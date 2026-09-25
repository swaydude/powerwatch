.class public abstract Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;
.super Ljava/lang/Object;
.source "UserInfoCommands.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$English;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$SimplifiedChinese;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Japanese;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Russian;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$German;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$French;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Italian;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Spanish;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Portugal;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Korean;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$TraditionalChinese;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Czech;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Polish;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\r\u0007\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013B\u000f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\r\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f \u00a8\u0006!"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;",
        "",
        "value",
        "",
        "(I)V",
        "getValue",
        "()I",
        "Czech",
        "English",
        "French",
        "German",
        "Italian",
        "Japanese",
        "Korean",
        "Polish",
        "Portugal",
        "Russian",
        "SimplifiedChinese",
        "Spanish",
        "TraditionalChinese",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$English;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$SimplifiedChinese;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Japanese;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Russian;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$German;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$French;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Italian;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Spanish;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Portugal;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Korean;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$TraditionalChinese;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Czech;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Polish;",
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
.field private final value:I


# direct methods
.method private constructor <init>(I)V
    .locals 0

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;->value:I

    return-void
.end method

.method public synthetic constructor <init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    .line 114
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;->value:I

    return v0
.end method
