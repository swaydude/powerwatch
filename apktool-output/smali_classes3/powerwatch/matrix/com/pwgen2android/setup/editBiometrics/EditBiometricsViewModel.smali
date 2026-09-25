.class public final Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;
.source "EditBiometricsViewModel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u000cJ\u0008\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0008H\u0016J\u0006\u0010\u001f\u001a\u00020\u001cR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0010\u0012\u000c\u0012\n \u0015*\u0004\u0018\u00010\n0\n0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;",
        "userAccountRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "activityContext",
        "Landroid/content/Context;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "savePreferencesViewModel",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V",
        "biometricsViewModel",
        "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;",
        "getBiometricsViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;",
        "setBiometricsViewModel",
        "(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;)V",
        "fragmentManagerWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "showSaveProgress",
        "Landroidx/databinding/ObservableField;",
        "",
        "getShowSaveProgress",
        "()Landroidx/databinding/ObservableField;",
        "onBackClicked",
        "",
        "onCreateView",
        "context",
        "onSaveClicked",
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
.field private final synthetic $$delegate_0:Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

.field public biometricsViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

.field private final fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;"
        }
    .end annotation
.end field

.field private final userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

.field private final userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V
    .locals 2

    const-string v0, "userAccountRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userPrefsUtils"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savePreferencesViewModel"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 24
    invoke-direct {p0, p3, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    .line 20
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    .line 24
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    .line 27
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 23
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModelImpl;

    const/4 p6, 0x1

    const/4 p7, 0x0

    invoke-direct {p5, p7, p6, p7}, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModelImpl;-><init>(Landroidx/databinding/ObservableField;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p5, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 18
    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V

    return-void
.end method

.method public static synthetic lambda$18iKqZ3ZhtychWRAhp6KR_lLndo(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->onSaveClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;)V

    return-void
.end method

.method public static synthetic lambda$TcOrSl6k77mD-kiJb3KrDADhb50(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->onSaveClicked$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$UWQ4V7OcEYEcsPCz7_eD_RWJNPk(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->onSaveClicked$lambda-3(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$lfjWNb5Lx8yrUF19nqbZJvlC0xk(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->onSaveClicked$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final onSaveClicked$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/CompletableSource;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->getBiometricsViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->getBiometrics()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->component1()I

    move-result v9

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->component2()Lkotlin/Pair;

    move-result-object v3

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->component3()Lkotlin/Pair;

    move-result-object v4

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->component4()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->component5()Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    .line 65
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v1, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getMetricValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v11

    .line 66
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v1, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getMetricValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v10

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x61f

    const/16 v16, 0x0

    .line 63
    invoke-static/range {v2 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFLjava/lang/String;ZLpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    move-result-object v1

    .line 68
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;->update(Ljava/lang/Object;)Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    return-object v0
.end method

.method private static final onSaveClicked$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final onSaveClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->onBackClicked()V

    return-void
.end method

.method private static final onSaveClicked$lambda-3(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->onBackClicked()V

    return-void
.end method


# virtual methods
.method public final getBiometricsViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;
    .locals 1

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->biometricsViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "biometricsViewModel"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public getShowSaveProgress()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object v0

    return-object v0
.end method

.method public onBackClicked()V
    .locals 1

    .line 83
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onBackClicked()V

    .line 84
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

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
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onCreateView(Landroid/content/Context;)V

    .line 36
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->getBiometricsViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->getLanguageShown()Landroidx/databinding/ObservableField;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final onSaveClicked()V
    .locals 6

    .line 59
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 60
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v1, v3, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository$DefaultImpls;->getFirst$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;ZZILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object v1

    .line 61
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$EditBiometricsViewModel$lfjWNb5Lx8yrUF19nqbZJvlC0xk;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$EditBiometricsViewModel$lfjWNb5Lx8yrUF19nqbZJvlC0xk;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v1

    .line 70
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Completable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Completable;

    move-result-object v1

    .line 71
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$EditBiometricsViewModel$TcOrSl6k77mD-kiJb3KrDADhb50;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$EditBiometricsViewModel$TcOrSl6k77mD-kiJb3KrDADhb50;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Completable;->doOnEvent(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object v1

    .line 74
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$EditBiometricsViewModel$18iKqZ3ZhtychWRAhp6KR_lLndo;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$EditBiometricsViewModel$18iKqZ3ZhtychWRAhp6KR_lLndo;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;)V

    .line 76
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$EditBiometricsViewModel$UWQ4V7OcEYEcsPCz7_eD_RWJNPk;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/-$$Lambda$EditBiometricsViewModel$UWQ4V7OcEYEcsPCz7_eD_RWJNPk;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;)V

    .line 74
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 60
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public final setBiometricsViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;->biometricsViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    return-void
.end method
