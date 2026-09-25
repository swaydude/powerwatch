.class public final Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;
.super Ljava/lang/Object;
.source "LanguageController.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLanguageController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageController.kt\npowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1#2:171\n286#3,2:172\n286#3,2:174\n*S KotlinDebug\n*F\n+ 1 LanguageController.kt\npowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl\n*L\n68#1:172,2\n72#1:174,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0010\u0010\r\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0003J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u00a8\u0006\u001c"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "appContext",
        "Landroid/content/Context;",
        "(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;)V",
        "getAppLanguage",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;",
        "context",
        "getLanguage",
        "languageKey",
        "",
        "getLanguageByKey",
        "getLanguageByResourceID",
        "languageID",
        "",
        "getLocales",
        "",
        "initSetLanguage",
        "",
        "saveAppLanguage",
        "languageInfo",
        "updateResources",
        "locale",
        "Ljava/util/Locale;",
        "updateResourcesLegacy",
        "Companion",
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
.field private static final APP_LANGUAGE:Ljava/lang/String; = "com.matrix.powerwatch.APP_LANGUAGE"

.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;

.field private static final defaultLanguageInfo:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

.field private static final languageInfos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;

    const/16 v0, 0xd

    new-array v0, v0, [Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    .line 152
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$English;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$English;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$English;->getLocale()Ljava/util/Locale;

    move-result-object v3

    const-string v4, "en"

    const v5, 0x7f0f00c0

    const-string v6, "gen2_manual_en.pdf"

    invoke-direct {v2, v4, v5, v3, v6}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;-><init>(Ljava/lang/String;ILjava/util/Locale;Ljava/lang/String;)V

    const/4 v3, 0x0

    aput-object v2, v0, v3

    .line 153
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$French;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$French;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$French;->getLocale()Ljava/util/Locale;

    move-result-object v3

    const-string v7, "fr"

    const v8, 0x7f0f00da

    const-string v9, "gen2_manual_fr.pdf"

    invoke-direct {v2, v7, v8, v3, v9}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;-><init>(Ljava/lang/String;ILjava/util/Locale;Ljava/lang/String;)V

    const/4 v3, 0x1

    aput-object v2, v0, v3

    .line 154
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$German;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$German;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$German;->getLocale()Ljava/util/Locale;

    move-result-object v3

    const-string v7, "de"

    const v8, 0x7f0f00a4

    const-string v9, "gen2_manual_de.pdf"

    invoke-direct {v2, v7, v8, v3, v9}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;-><init>(Ljava/lang/String;ILjava/util/Locale;Ljava/lang/String;)V

    const/4 v3, 0x2

    aput-object v2, v0, v3

    .line 155
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Korean;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Korean;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Korean;->getLocale()Ljava/util/Locale;

    move-result-object v3

    const-string v7, "ko"

    const v8, 0x7f0f0101

    const-string v9, "gen2_manual_ko.pdf"

    invoke-direct {v2, v7, v8, v3, v9}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;-><init>(Ljava/lang/String;ILjava/util/Locale;Ljava/lang/String;)V

    const/4 v3, 0x3

    aput-object v2, v0, v3

    .line 156
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Japanese;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Japanese;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Japanese;->getLocale()Ljava/util/Locale;

    move-result-object v3

    const-string v7, "ja"

    const v8, 0x7f0f0100

    const-string v9, "gen2_manual_ja.pdf"

    invoke-direct {v2, v7, v8, v3, v9}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;-><init>(Ljava/lang/String;ILjava/util/Locale;Ljava/lang/String;)V

    const/4 v3, 0x4

    aput-object v2, v0, v3

    .line 157
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Italian;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Italian;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Italian;->getLocale()Ljava/util/Locale;

    move-result-object v3

    const-string v7, "it"

    const v8, 0x7f0f00ff

    const-string v9, "gen2_manual_it.pdf"

    invoke-direct {v2, v7, v8, v3, v9}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;-><init>(Ljava/lang/String;ILjava/util/Locale;Ljava/lang/String;)V

    const/4 v3, 0x5

    aput-object v2, v0, v3

    .line 158
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Portugal;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Portugal;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Portugal;->getLocale()Ljava/util/Locale;

    move-result-object v3

    const-string v7, "pt"

    const v8, 0x7f0f0165

    const-string v9, "gen2_manual_pt.pdf"

    invoke-direct {v2, v7, v8, v3, v9}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;-><init>(Ljava/lang/String;ILjava/util/Locale;Ljava/lang/String;)V

    const/4 v3, 0x6

    aput-object v2, v0, v3

    .line 159
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Spanish;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Spanish;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Spanish;->getLocale()Ljava/util/Locale;

    move-result-object v3

    const-string v7, "es"

    const v8, 0x7f0f019b

    const-string v9, "gen2_manual_es.pdf"

    invoke-direct {v2, v7, v8, v3, v9}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;-><init>(Ljava/lang/String;ILjava/util/Locale;Ljava/lang/String;)V

    const/4 v3, 0x7

    aput-object v2, v0, v3

    .line 160
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$SimplifiedChinese;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$SimplifiedChinese;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$SimplifiedChinese;->getLocale()Ljava/util/Locale;

    move-result-object v3

    const-string v7, "zh_CN"

    const v8, 0x7f0f0192

    const-string v9, "gen2_manual_zh_CN.pdf"

    invoke-direct {v2, v7, v8, v3, v9}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;-><init>(Ljava/lang/String;ILjava/util/Locale;Ljava/lang/String;)V

    const/16 v3, 0x8

    aput-object v2, v0, v3

    .line 161
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$TraditionalChinese;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$TraditionalChinese;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$TraditionalChinese;->getLocale()Ljava/util/Locale;

    move-result-object v3

    const-string v7, "zh_TW"

    const v8, 0x7f0f01c5

    const-string v9, "gen2_manual_zh_TW.pdf"

    invoke-direct {v2, v7, v8, v3, v9}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;-><init>(Ljava/lang/String;ILjava/util/Locale;Ljava/lang/String;)V

    const/16 v3, 0x9

    aput-object v2, v0, v3

    .line 162
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Russian;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Russian;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Russian;->getLocale()Ljava/util/Locale;

    move-result-object v3

    const-string v7, "ru"

    const v8, 0x7f0f017f

    const-string v9, "gen2_manual_ru.pdf"

    invoke-direct {v2, v7, v8, v3, v9}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;-><init>(Ljava/lang/String;ILjava/util/Locale;Ljava/lang/String;)V

    const/16 v3, 0xa

    aput-object v2, v0, v3

    .line 163
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Czech;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Czech;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Czech;->getLocale()Ljava/util/Locale;

    move-result-object v3

    const-string v7, "cs"

    const v8, 0x7f0f0095

    invoke-direct {v2, v7, v8, v3, v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;-><init>(Ljava/lang/String;ILjava/util/Locale;Ljava/lang/String;)V

    const/16 v3, 0xb

    aput-object v2, v0, v3

    .line 164
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Polish;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Polish;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Polish;->getLocale()Ljava/util/Locale;

    move-result-object v3

    const-string v7, "pl"

    const v8, 0x7f0f0163

    invoke-direct {v2, v7, v8, v3, v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;-><init>(Ljava/lang/String;ILjava/util/Locale;Ljava/lang/String;)V

    const/16 v1, 0xc

    aput-object v2, v0, v1

    .line 151
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->languageInfos:Ljava/util/List;

    .line 167
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$English;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$English;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$English;->getLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-direct {v0, v4, v5, v1, v6}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;-><init>(Ljava/lang/String;ILjava/util/Locale;Ljava/lang/String;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->defaultLanguageInfo:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;)V
    .locals 1

    const-string v0, "userPrefsUtils"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->onCreate()V

    .line 43
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getLanguage()Lio/reactivex/Observable;

    move-result-object p1

    .line 44
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$LanguageControllerImpl$NCKtBXX_VO4mYt2DmpcJjJxTGAk;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$LanguageControllerImpl$NCKtBXX_VO4mYt2DmpcJjJxTGAk;-><init>(Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;Landroid/content/Context;)V

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$LanguageControllerImpl$6_W_lE1XT6Ni8hGxLl9Q6osl68M;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$LanguageControllerImpl$6_W_lE1XT6Ni8hGxLl9Q6osl68M;

    invoke-virtual {p1, v0, p2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    return-void
.end method

.method private static final _init_$lambda-1(Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 45
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->saveAppLanguage(Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;Landroid/content/Context;)V

    return-void
.end method

.method private static final _init_$lambda-2(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public static final synthetic access$getDefaultLanguageInfo$cp()Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;
    .locals 1

    .line 34
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->defaultLanguageInfo:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    return-object v0
.end method

.method public static final synthetic access$getLanguageInfos$cp()Ljava/util/List;
    .locals 1

    .line 34
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->languageInfos:Ljava/util/List;

    return-object v0
.end method

.method public static synthetic lambda$6_W_lE1XT6Ni8hGxLl9Q6osl68M(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->_init_$lambda-2(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$NCKtBXX_VO4mYt2DmpcJjJxTGAk(Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->_init_$lambda-1(Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;)V

    return-void
.end method

.method private final saveAppLanguage(Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;Landroid/content/Context;)V
    .locals 1

    .line 77
    invoke-static {p2}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p2

    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLanguageKey()Ljava/lang/String;

    move-result-object p1

    const-string v0, "com.matrix.powerwatch.APP_LANGUAGE"

    invoke-interface {p2, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private final updateResources(Landroid/content/Context;Ljava/util/Locale;)Landroid/content/Context;
    .locals 1

    .line 107
    invoke-static {p2}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    .line 109
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 110
    invoke-virtual {v0, p2}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    .line 112
    invoke-virtual {p1, v0}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object p1

    const-string p2, "context.createConfigurationContext(configuration)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final updateResourcesLegacy(Landroid/content/Context;Ljava/util/Locale;)Landroid/content/Context;
    .locals 2

    .line 117
    invoke-static {p2}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    .line 119
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 121
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    .line 122
    iput-object p2, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 124
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    return-object p1
.end method


# virtual methods
.method public getAppLanguage(Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    .line 83
    invoke-static {p1}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.matrix.powerwatch.APP_LANGUAGE"

    invoke-interface {p1, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 85
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "systemLang.language"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/CharSequence;

    const-string v2, "zh"

    check-cast v2, Ljava/lang/CharSequence;

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v1, v2, v3, v4, v5}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 87
    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p1

    const-string v1, "systemLang.country"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/CharSequence;

    const-string v2, "hk"

    check-cast v2, Ljava/lang/CharSequence;

    const/4 v4, 0x1

    invoke-static {p1, v2, v4}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-nez p1, :cond_1

    .line 88
    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/CharSequence;

    const-string v2, "tw"

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {p1, v2, v4}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-nez p1, :cond_1

    .line 89
    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/CharSequence;

    const-string v1, "mo"

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {p1, v1, v4}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 93
    :goto_1
    invoke-virtual {v0}, Ljava/util/Locale;->getScript()Ljava/lang/String;

    move-result-object v1

    const-string v2, "systemLang.script"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/CharSequence;

    const-string v6, "hant"

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v1, v6, v4}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    move v3, p1

    .line 94
    :goto_2
    invoke-virtual {v0}, Ljava/util/Locale;->getScript()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/CharSequence;

    const-string v0, "hans"

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {p1, v0, v4}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_3

    :cond_3
    move v4, v3

    :goto_3
    if-eqz v4, :cond_6

    .line 97
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->languageInfos:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLanguageKey()Ljava/lang/String;

    move-result-object v1

    const-string v2, "zh_CN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    move-object v5, v0

    :cond_5
    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    goto :goto_4

    .line 98
    :cond_6
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->languageInfos:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLanguageKey()Ljava/lang/String;

    move-result-object v1

    const-string v2, "zh_TW"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    move-object v5, v0

    :cond_8
    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    :goto_4
    return-object v5

    .line 100
    :cond_9
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->languageInfos:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_a
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLanguageKey()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    move-object v5, v1

    :cond_b
    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    if-nez v5, :cond_c

    .line 101
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    const p1, 0x7f0f00c0

    new-instance v0, Ljava/util/Locale;

    const-string v1, "en"

    invoke-direct {v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    const-string v2, "gen2_manual_en.pdf"

    invoke-direct {v5, v1, p1, v0, v2}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;-><init>(Ljava/lang/String;ILjava/util/Locale;Ljava/lang/String;)V

    :cond_c
    return-object v5
.end method

.method public getLanguage(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;
    .locals 3

    const-string v0, "languageKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->languageInfos:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 172
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    .line 68
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLanguageKey()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 173
    :goto_0
    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    return-object v1
.end method

.method public getLanguageByKey(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;
    .locals 3

    const-string v0, "languageKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->languageInfos:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLanguageKey()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    if-nez v1, :cond_2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->defaultLanguageInfo:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    :cond_2
    return-object v1
.end method

.method public getLanguageByResourceID(I)Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;
    .locals 3

    .line 72
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->languageInfos:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 174
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    .line 72
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLanguageDisplay()I

    move-result v2

    if-ne v2, p1, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_0

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    .line 175
    :goto_1
    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    return-object v1
.end method

.method public getLocales()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;",
            ">;"
        }
    .end annotation

    .line 64
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->languageInfos:Ljava/util/List;

    return-object v0
.end method

.method public initSetLanguage(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->getAppLanguage(Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    move-result-object v0

    .line 55
    new-instance v1, Ljava/util/Locale;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLocale()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLocale()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    if-lt v0, v2, :cond_0

    .line 57
    invoke-direct {p0, p1, v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->updateResources(Landroid/content/Context;Ljava/util/Locale;)Landroid/content/Context;

    .line 59
    :cond_0
    invoke-direct {p0, p1, v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->updateResourcesLegacy(Landroid/content/Context;Ljava/util/Locale;)Landroid/content/Context;

    return-void
.end method
