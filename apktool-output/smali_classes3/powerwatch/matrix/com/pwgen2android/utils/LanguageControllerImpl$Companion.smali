.class public final Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;
.super Ljava/lang/Object;
.source "LanguageController.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\rB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;",
        "",
        "()V",
        "APP_LANGUAGE",
        "",
        "defaultLanguageInfo",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;",
        "getDefaultLanguageInfo",
        "()Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;",
        "languageInfos",
        "",
        "getLanguageInfos",
        "()Ljava/util/List;",
        "LanguageLocale",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDefaultLanguageInfo()Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;
    .locals 1

    .line 167
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->access$getDefaultLanguageInfo$cp()Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    move-result-object v0

    return-object v0
.end method

.method public final getLanguageInfos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;",
            ">;"
        }
    .end annotation

    .line 151
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->access$getLanguageInfos$cp()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
