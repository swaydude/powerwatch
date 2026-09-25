.class public final Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;
.super Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;
.source "DailyGoalsSettingsVM.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0002\u0010\rJ\u0008\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0016J\n\u0010&\u001a\u00020\"*\u00020\'J\n\u0010(\u001a\u00020\"*\u00020\'J\n\u0010)\u001a\u00020\"*\u00020\'J\n\u0010*\u001a\u00020\"*\u00020\'R\u001f\u0010\u000e\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u000c0\u000c0\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0019\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0013R\u001f\u0010\u001b\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0013R\u001f\u0010\u001d\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0013R\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;",
        "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "goalsRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "userAccountRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "activity",
        "Landroid/app/Activity;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V",
        "caloriesField",
        "Landroidx/databinding/ObservableField;",
        "",
        "kotlin.jvm.PlatformType",
        "getCaloriesField",
        "()Landroidx/databinding/ObservableField;",
        "contextWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "goalConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
        "managerWeakReference",
        "powerField",
        "getPowerField",
        "sleepField",
        "getSleepField",
        "stepsField",
        "getStepsField",
        "user",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        "onBackClicked",
        "",
        "onCreateView",
        "context",
        "Landroid/content/Context;",
        "onCaloriesClicked",
        "Landroid/view/View;",
        "onPowerClicked",
        "onSleepClicked",
        "onStepsClicked",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM$Companion;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final caloriesField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final contextWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private goalConfig:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

.field private final goalsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

.field private final managerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;"
        }
    .end annotation
.end field

.field private final powerField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final sleepField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final stepsField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

.field private final userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

.field private final userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM$Companion;

    .line 150
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V
    .locals 3

    const-string v0, "goalsRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userPrefsUtils"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userAccountRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    move-object v0, p4

    check-cast v0, Landroid/content/Context;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p0, v0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 66
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->goalsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    .line 67
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    .line 68
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    .line 75
    new-instance p1, Landroidx/databinding/ObservableField;

    const-string p2, ""

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->stepsField:Landroidx/databinding/ObservableField;

    .line 76
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->caloriesField:Landroidx/databinding/ObservableField;

    .line 77
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->sleepField:Landroidx/databinding/ObservableField;

    .line 78
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->powerField:Landroidx/databinding/ObservableField;

    .line 80
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->managerWeakReference:Ljava/lang/ref/WeakReference;

    .line 81
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->contextWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static synthetic lambda$HtG_0OT_qCH7QykBrd2blYFQ-M4(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)V

    return-void
.end method

.method public static synthetic lambda$mZJakJYGK4kL4S44xNbIeOjLXBI(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V

    return-void
.end method

.method public static synthetic lambda$obPsJfaeMnneDfZwfIsn0MNlhCQ(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->onCreateView$lambda-1(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$sUwmdkrJwQ6xLMDbfNxsXdZwfiY(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->onCreateView$lambda-3(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->goalConfig:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    .line 90
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->getStepsField()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSteps()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 91
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->getCaloriesField()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getCalories()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 92
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->getSleepField()Landroidx/databinding/ObservableField;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSleep()I

    move-result v2

    int-to-float v2, v2

    const/16 v3, 0x3c

    int-to-float v3, v3

    div-float/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v2, 0x68

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 93
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->getPowerField()Landroidx/databinding/ObservableField;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getPower()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " \u00b5Wh"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final onCreateView$lambda-1(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private static final onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 103
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    return-void
.end method

.method private static final onCreateView$lambda-3(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final getCaloriesField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 76
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->caloriesField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 66
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final getPowerField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 78
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->powerField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getSleepField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 77
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->sleepField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getStepsField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 75
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->stepsField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public onBackClicked()V
    .locals 1

    .line 145
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onBackClicked()V

    .line 146
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->managerWeakReference:Ljava/lang/ref/WeakReference;

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

.method public final onCaloriesClicked(Landroid/view/View;)V
    .locals 9

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->goalConfig:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    if-nez p1, :cond_0

    goto :goto_1

    .line 121
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->isMetricsUsed(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Z

    move-result v0

    .line 122
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Calories;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Calories;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getCalories()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    if-eqz v0, :cond_1

    const-string v0, " kcal"

    goto :goto_0

    :cond_1
    const-string v0, " Cal"

    :goto_0
    invoke-direct {v1, v2, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;Ljava/lang/Number;Ljava/lang/String;)V

    .line 123
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/FragmentManager;

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;

    invoke-virtual {p1, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Landroidx/fragment/app/Fragment;

    const v4, 0x7f080280

    const/4 v5, 0x0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v6, p1

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v7, 0x4

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_1
    return-void

    :cond_3
    const-string p1, "user"

    .line 121
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onCreateView(Landroid/content/Context;)V
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onCreateView(Landroid/content/Context;)V

    .line 86
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->goalsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {v0, v1, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository$DefaultImpls;->load$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;ZZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    .line 87
    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object v0

    .line 88
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/-$$Lambda$DailyGoalsSettingsVM$HtG_0OT_qCH7QykBrd2blYFQ-M4;

    invoke-direct {v4, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/-$$Lambda$DailyGoalsSettingsVM$HtG_0OT_qCH7QykBrd2blYFQ-M4;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;)V

    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/-$$Lambda$DailyGoalsSettingsVM$obPsJfaeMnneDfZwfIsn0MNlhCQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/-$$Lambda$DailyGoalsSettingsVM$obPsJfaeMnneDfZwfIsn0MNlhCQ;

    invoke-virtual {v0, v4, v5}, Lio/reactivex/Single;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 86
    invoke-virtual {p1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 99
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;

    .line 100
    invoke-static {v0, v1, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository$DefaultImpls;->getFirst$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;ZZILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object v0

    .line 101
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Single;

    move-result-object v0

    .line 102
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/-$$Lambda$DailyGoalsSettingsVM$mZJakJYGK4kL4S44xNbIeOjLXBI;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/-$$Lambda$DailyGoalsSettingsVM$mZJakJYGK4kL4S44xNbIeOjLXBI;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;)V

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/-$$Lambda$DailyGoalsSettingsVM$sUwmdkrJwQ6xLMDbfNxsXdZwfiY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/-$$Lambda$DailyGoalsSettingsVM$sUwmdkrJwQ6xLMDbfNxsXdZwfiY;

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Single;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 99
    invoke-virtual {p1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public final onPowerClicked(Landroid/view/View;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->goalConfig:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    if-nez p1, :cond_0

    goto :goto_0

    .line 137
    :cond_0
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Power;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Power;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getPower()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    const-string v2, " \u00b5Wh"

    invoke-direct {v0, v1, p1, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;Ljava/lang/Number;Ljava/lang/String;)V

    .line 138
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f080280

    const/4 v4, 0x0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v5, p1

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final onSleepClicked(Landroid/view/View;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->goalConfig:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    if-nez p1, :cond_0

    goto :goto_0

    .line 130
    :cond_0
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Sleep;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Sleep;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSleep()I

    move-result p1

    int-to-float p1, p1

    const/16 v2, 0x3c

    int-to-float v2, v2

    div-float/2addr p1, v2

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    const-string v2, "h"

    invoke-direct {v0, v1, p1, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;Ljava/lang/Number;Ljava/lang/String;)V

    .line 131
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f080280

    const/4 v4, 0x0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v5, p1

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final onStepsClicked(Landroid/view/View;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->goalConfig:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    if-nez p1, :cond_0

    goto :goto_0

    .line 113
    :cond_0
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Steps;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType$Steps;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSteps()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    const-string v2, ""

    invoke-direct {v0, v1, p1, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;Ljava/lang/Number;Ljava/lang/String;)V

    .line 114
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f080280

    const/4 v4, 0x0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v5, p1

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method
