.class public abstract Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale;
.super Ljava/lang/Object;
.source "LanguageController.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "LanguageLocale"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$English;,
        Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$French;,
        Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$German;,
        Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Japanese;,
        Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Korean;,
        Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$SimplifiedChinese;,
        Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$TraditionalChinese;,
        Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Italian;,
        Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Spanish;,
        Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Portugal;,
        Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Russian;,
        Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Czech;,
        Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Polish;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\r\u0007\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013B\u000f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\r\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f \u00a8\u0006!"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale;",
        "",
        "locale",
        "Ljava/util/Locale;",
        "(Ljava/util/Locale;)V",
        "getLocale",
        "()Ljava/util/Locale;",
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
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$English;",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$French;",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$German;",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Japanese;",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Korean;",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$SimplifiedChinese;",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$TraditionalChinese;",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Italian;",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Spanish;",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Portugal;",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Russian;",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Czech;",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Polish;",
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
.field private final locale:Ljava/util/Locale;


# direct methods
.method private constructor <init>(Ljava/util/Locale;)V
    .locals 0

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale;->locale:Ljava/util/Locale;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Locale;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale;-><init>(Ljava/util/Locale;)V

    return-void
.end method


# virtual methods
.method public final getLocale()Ljava/util/Locale;
    .locals 1

    .line 134
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale;->locale:Ljava/util/Locale;

    return-object v0
.end method
