.class public final Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
.source "GetStartedViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\n\u0010\u001c\u001a\u00020\u0018*\u00020\u001dR\u001c\u0010\u000f\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u000b0\u000b0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\r0\r0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0013\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u00150\u00150\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;",
        "userAccountRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "languageController",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;",
        "biometricsViewModel",
        "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;",
        "activity",
        "Landroid/app/Activity;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V",
        "activityWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "fragmentManagerWeakReference",
        "isButtonVisible",
        "Landroidx/databinding/ObservableField;",
        "",
        "()Landroidx/databinding/ObservableField;",
        "onBackClicked",
        "",
        "onCreateView",
        "context",
        "Landroid/content/Context;",
        "onNextClicked",
        "Landroid/view/View;",
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
.field private final activityWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private final biometricsViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

.field private final fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;"
        }
    .end annotation
.end field

.field private final isButtonVisible:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final languageController:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;

.field private final userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

.field private final userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V
    .locals 2

    const-string v0, "userAccountRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userPrefsUtils"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "languageController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "biometricsViewModel"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x3

    .line 35
    invoke-direct {p0, v0, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    .line 31
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    .line 32
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->languageController:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;

    .line 33
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->biometricsViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    .line 37
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    .line 38
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->activityWeakReference:Ljava/lang/ref/WeakReference;

    .line 39
    new-instance p1, Landroidx/databinding/ObservableField;

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->isButtonVisible:Landroidx/databinding/ObservableField;

    return-void
.end method

.method public static synthetic lambda$4MEoYBIazT9QcCz05-9kJ9ifChM(Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->onNextClicked$lambda-1(Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$8coen33-v9CDZUppnUAR93Gk0rM(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->onNextClicked$lambda-3(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$kN0G87LpJbNwO82Y-JQ2wyHPQrY()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->onNextClicked$lambda-2()V

    return-void
.end method

.method public static synthetic lambda$yjroOViThYJKaMTLIV_D9ABwmyw(Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->onNextClicked$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final onNextClicked$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/CompletableSource;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->biometricsViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    .line 59
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->getBiometrics()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;

    move-result-object v1

    .line 60
    iget-object v15, v0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    .line 63
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->getAge()I

    move-result v9

    .line 64
    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->getWeight()Lkotlin/Pair;

    move-result-object v4

    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v3, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getMetricValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object v3

    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v11

    .line 65
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->getHeight()Lkotlin/Pair;

    move-result-object v3

    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v0, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getMetricValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v10

    .line 66
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->getGender()Ljava/lang/String;

    move-result-object v12

    .line 67
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object v3

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->getLanguage()Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLanguageKey()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object v14

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v13, 0x0

    const/16 v0, 0x21f

    const/16 v16, 0x0

    move-object v1, v15

    move v15, v0

    .line 62
    invoke-static/range {v2 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFLjava/lang/String;ZLpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v0

    .line 61
    invoke-interface {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;->update(Ljava/lang/Object;)Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    return-object v0
.end method

.method private static final onNextClicked$lambda-1(Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;Ljava/lang/Throwable;)V
    .locals 7

    const-string p2, "$this_onNextClicked"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "this$0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;->Companion:Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;->getPermissionsShownFlag(Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_1

    .line 74
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment$Companion;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f0801fd

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    goto :goto_1

    .line 77
    :cond_1
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/Activity;

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$ChooseProductScreen;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$ChooseProductScreen;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;

    invoke-static {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->goToPairingActivity(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;)V

    .line 78
    :goto_0
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/Activity;

    if-nez p0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_1
    return-void
.end method

.method private static final onNextClicked$lambda-2()V
    .locals 0

    return-void
.end method

.method private static final onNextClicked$lambda-3(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final isButtonVisible()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 39
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->isButtonVisible:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final onBackClicked()V
    .locals 1

    .line 51
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->popBackStack()V

    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/content/Context;)V
    .locals 10

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->onCreateView(Landroid/content/Context;)V

    .line 44
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->biometricsViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->getTextColor()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const v1, 0x7f050023

    invoke-static {p1, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 45
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->biometricsViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    .line 46
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3f

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;-><init>(ILkotlin/Pair;Lkotlin/Pair;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 45
    invoke-virtual {p1, v9}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->setBiometrics(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;)V

    return-void
.end method

.method public final onNextClicked(Landroid/view/View;)V
    .locals 6

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->isButtonVisible:Landroidx/databinding/ObservableField;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 56
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v1, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository$DefaultImpls;->getFirst$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;ZZILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object v1

    .line 57
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/-$$Lambda$GetStartedViewModel$yjroOViThYJKaMTLIV_D9ABwmyw;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/-$$Lambda$GetStartedViewModel$yjroOViThYJKaMTLIV_D9ABwmyw;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v1

    .line 71
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Completable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Completable;

    move-result-object v1

    .line 72
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/-$$Lambda$GetStartedViewModel$4MEoYBIazT9QcCz05-9kJ9ifChM;

    invoke-direct {v2, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/-$$Lambda$GetStartedViewModel$4MEoYBIazT9QcCz05-9kJ9ifChM;-><init>(Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Completable;->doOnEvent(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object p1

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/-$$Lambda$GetStartedViewModel$kN0G87LpJbNwO82Y-JQ2wyHPQrY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/-$$Lambda$GetStartedViewModel$kN0G87LpJbNwO82Y-JQ2wyHPQrY;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/-$$Lambda$GetStartedViewModel$8coen33-v9CDZUppnUAR93Gk0rM;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/-$$Lambda$GetStartedViewModel$8coen33-v9CDZUppnUAR93Gk0rM;

    .line 81
    invoke-virtual {p1, v1, v2}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 56
    invoke-virtual {v0, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method
