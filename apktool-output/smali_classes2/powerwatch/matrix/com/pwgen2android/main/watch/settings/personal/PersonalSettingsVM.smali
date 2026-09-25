.class public final Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;
.super Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;
.source "PersonalSettingsVM.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPersonalSettingsVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonalSettingsVM.kt\npowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,240:1\n1547#2:241\n1618#2,3:242\n1547#2:247\n1618#2,3:248\n286#2,2:253\n37#3,2:245\n37#3,2:251\n37#3,2:255\n*S KotlinDebug\n*F\n+ 1 PersonalSettingsVM.kt\npowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM\n*L\n142#1:241\n142#1:242,3\n162#1:247\n162#1:248,3\n203#1:253,2\n143#1:245,2\n162#1:251,2\n212#1:255,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00018BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\u0014\u0010+\u001a\u00020,2\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010\u0016H\u0002J\u0008\u0010.\u001a\u00020,H\u0016J\u0010\u0010/\u001a\u00020,2\u0006\u00100\u001a\u000201H\u0016J\n\u00102\u001a\u00020,*\u000203J\n\u00104\u001a\u00020,*\u000203J\n\u00105\u001a\u00020,*\u000203J\n\u00106\u001a\u00020,*\u000203J\n\u00107\u001a\u00020,*\u000203R\u001f\u0010\u0014\u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u001c\u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0019R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010 \u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u0019R\u001c\u0010\"\u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u00120\u00120\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010%\u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u0019R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010)\u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\u0019\u00a8\u00069"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;",
        "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "userAccountRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "deviceRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "deviceProtocolStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "sleepTimeUIStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;",
        "activity",
        "Landroid/app/Activity;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V",
        "ageField",
        "Landroidx/databinding/ObservableField;",
        "",
        "kotlin.jvm.PlatformType",
        "getAgeField",
        "()Landroidx/databinding/ObservableField;",
        "contextWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "genderField",
        "getGenderField",
        "goalConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
        "heightField",
        "getHeightField",
        "managerWeakReference",
        "pairedDevice",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        "sleepTimeField",
        "getSleepTimeField",
        "user",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        "weightField",
        "getWeightField",
        "displaySleepTime",
        "",
        "deviceID",
        "onBackClicked",
        "onCreateView",
        "context",
        "Landroid/content/Context;",
        "onAgeClicked",
        "Landroid/view/View;",
        "onGenderClicked",
        "onHeightClicked",
        "onSleepTimeClicked",
        "onWeightClicked",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM$Companion;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final ageField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field private final contextWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private final deviceProtocolStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;

.field private final deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

.field private final genderField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private goalConfig:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

.field private final heightField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final managerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;"
        }
    .end annotation
.end field

.field private pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

.field private final sleepTimeField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final sleepTimeUIStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;

.field private user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

.field private final userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

.field private final userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

.field private final weightField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM$Companion;

    .line 238
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V
    .locals 3

    const-string v0, "userAccountRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userPrefsUtils"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceProtocolStorage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communicator"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepTimeUIStorage"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    move-object v0, p7

    check-cast v0, Landroid/content/Context;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p0, v0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 66
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    .line 67
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    .line 68
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    .line 69
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->deviceProtocolStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;

    .line 70
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 71
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->sleepTimeUIStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;

    .line 80
    new-instance p1, Landroidx/databinding/ObservableField;

    const-string p2, ""

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->weightField:Landroidx/databinding/ObservableField;

    .line 81
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->heightField:Landroidx/databinding/ObservableField;

    .line 82
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->ageField:Landroidx/databinding/ObservableField;

    .line 83
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->genderField:Landroidx/databinding/ObservableField;

    .line 84
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->sleepTimeField:Landroidx/databinding/ObservableField;

    .line 86
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p8}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->managerWeakReference:Ljava/lang/ref/WeakReference;

    .line 87
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->contextWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private final displaySleepTime(Ljava/lang/String;)V
    .locals 2

    .line 221
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->deviceProtocolStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;->getDeviceProtocolVersion(Ljava/lang/String;)I

    move-result p1

    const/4 v0, 0x3

    if-ge p1, v0, :cond_1

    .line 224
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->sleepTimeField:Landroidx/databinding/ObservableField;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const v1, 0x7f0f0197

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_1

    .line 226
    :cond_1
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->sleepTimeUIStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;->getDisplayValue()Ljava/lang/String;

    move-result-object p1

    .line 227
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->sleepTimeField:Landroidx/databinding/ObservableField;

    invoke-virtual {v0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method static synthetic displaySleepTime$default(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 220
    :cond_0
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->displaySleepTime(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic lambda$H56I0A_tO65XKQra4cB5OQjGJq8(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->onCreateView$lambda-1(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$gbZvwIFKOZRKqF3jBIfkyW2aWFQ(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V

    return-void
.end method

.method public static synthetic lambda$jAy3DMYCmuwX-e3kb9td2MHNdtA(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V

    return-void
.end method

.method public static synthetic lambda$n1gPEbVO5P65UGQ1rvFcTANwnnM(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->onCreateView$lambda-3(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 99
    :cond_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->displaySleepTime(Ljava/lang/String;)V

    return-void
.end method

.method private static final onCreateView$lambda-1(Ljava/lang/Throwable;)V
    .locals 0

    .line 101
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 109
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    .line 111
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getHeight()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object v0

    .line 112
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->getHeightField()Landroidx/databinding/ObservableField;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 114
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getWeight()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object v0

    .line 115
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->getWeightField()Landroidx/databinding/ObservableField;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 117
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->getAgeField()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAge()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 119
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getGender()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->getDisplayResource()I

    move-result v0

    goto :goto_0

    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;->getDisplayResource()I

    move-result v0

    .line 120
    :goto_0
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    if-nez v1, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    if-nez v0, :cond_2

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getGender()Ljava/lang/String;

    move-result-object v0

    :cond_2
    const-string p1, "contextWeakReference.get()?.getString(res) ?: it.gender"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->getGenderField()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final onCreateView$lambda-3(Ljava/lang/Throwable;)V
    .locals 0

    .line 124
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method


# virtual methods
.method public final getAgeField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->ageField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getGenderField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 83
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->genderField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getHeightField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 81
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->heightField:Landroidx/databinding/ObservableField;

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

.method public final getSleepTimeField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 84
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->sleepTimeField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getWeightField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 80
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->weightField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final onAgeClicked(Landroid/view/View;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAge()I

    move-result p1

    .line 190
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Age;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Age;

    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    .line 191
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/16 v4, 0x78

    const/16 v5, 0xd

    const/4 v6, 0x0

    const/16 v7, 0x24

    const/4 v8, 0x0

    move-object v0, v9

    .line 190
    invoke-direct/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 195
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;

    invoke-virtual {p1, v9}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f080280

    const/4 v3, 0x0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v4, p1

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void

    :cond_1
    const-string p1, "user"

    .line 189
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onBackClicked()V
    .locals 1

    .line 233
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onBackClicked()V

    .line 234
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->managerWeakReference:Ljava/lang/ref/WeakReference;

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
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onCreateView(Landroid/content/Context;)V

    .line 92
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->sleepTimeField:Landroidx/databinding/ObservableField;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    const v2, 0x7f0f0197

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 94
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;

    const/4 v2, 0x0

    const/4 v3, 0x3

    .line 95
    invoke-static {v0, v2, v2, v3, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository$DefaultImpls;->load$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;ZZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    .line 96
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v4

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object v0

    .line 97
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/-$$Lambda$PersonalSettingsVM$jAy3DMYCmuwX-e3kb9td2MHNdtA;

    invoke-direct {v4, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/-$$Lambda$PersonalSettingsVM$jAy3DMYCmuwX-e3kb9td2MHNdtA;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;)V

    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/-$$Lambda$PersonalSettingsVM$H56I0A_tO65XKQra4cB5OQjGJq8;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/-$$Lambda$PersonalSettingsVM$H56I0A_tO65XKQra4cB5OQjGJq8;

    invoke-virtual {v0, v4, v5}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 94
    invoke-virtual {p1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 105
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;

    .line 106
    invoke-static {v0, v2, v2, v3, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository$DefaultImpls;->getFirst$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;ZZILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object v0

    .line 107
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Single;

    move-result-object v0

    .line 108
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/-$$Lambda$PersonalSettingsVM$gbZvwIFKOZRKqF3jBIfkyW2aWFQ;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/-$$Lambda$PersonalSettingsVM$gbZvwIFKOZRKqF3jBIfkyW2aWFQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;)V

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/-$$Lambda$PersonalSettingsVM$n1gPEbVO5P65UGQ1rvFcTANwnnM;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/-$$Lambda$PersonalSettingsVM$n1gPEbVO5P65UGQ1rvFcTANwnnM;

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Single;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 105
    invoke-virtual {p1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public final onGenderClicked(Landroid/view/View;)V
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "<this>"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getGender()Ljava/lang/String;

    move-result-object v1

    .line 171
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->getDisplayResource()I

    move-result v3

    goto :goto_0

    :cond_0
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;->getDisplayResource()I

    move-result v3

    .line 172
    :goto_0
    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/Activity;

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v4, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    :goto_1
    move-object v6, v1

    goto :goto_2

    :cond_2
    move-object v6, v3

    :goto_2
    const-string v3, "contextWeakReference.get()?.getString(res) ?: currentGender"

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Gender;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Gender;

    move-object v5, v4

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    .line 176
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    const/4 v9, 0x0

    const/4 v15, 0x2

    new-array v10, v15, [Ljava/lang/String;

    .line 178
    sget-object v8, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->getDescription()Ljava/lang/String;

    move-result-object v8

    const/4 v11, 0x0

    aput-object v8, v10, v11

    .line 179
    sget-object v8, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;->getDescription()Ljava/lang/String;

    move-result-object v8

    const/4 v12, 0x1

    aput-object v8, v10, v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    new-array v8, v15, [Ljava/lang/String;

    .line 181
    iget-object v15, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v15}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroid/app/Activity;

    if-nez v15, :cond_3

    goto :goto_3

    :cond_3
    sget-object v16, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;

    invoke-virtual/range {v16 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->getDisplayResource()I

    move-result v2

    invoke-virtual {v15, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    :goto_3
    move-object v2, v1

    :cond_4
    const-string v15, "contextWeakReference.get()?.getString(Gender.Male.displayResource) ?: currentGender"

    invoke-static {v2, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object v2, v8, v11

    .line 182
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/Activity;

    if-nez v2, :cond_5

    goto :goto_4

    :cond_5
    sget-object v11, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;

    invoke-virtual {v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;->getDisplayResource()I

    move-result v11

    invoke-virtual {v2, v11}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    move-object v1, v2

    :goto_4
    const-string v2, "contextWeakReference.get()?.getString(Gender.Female.displayResource) ?: currentGender"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object v1, v8, v12

    const/16 v1, 0xd

    const/4 v15, 0x0

    move-object v2, v8

    move-object v8, v4

    move v11, v13

    move v12, v14

    move-object v13, v2

    move v14, v1

    const/4 v1, 0x2

    .line 176
    invoke-direct/range {v8 .. v15}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    invoke-direct {v7, v4, v2, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x38

    const/4 v12, 0x0

    move-object v4, v3

    .line 174
    invoke-direct/range {v4 .. v12}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 185
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroidx/fragment/app/FragmentManager;

    if-nez v4, :cond_7

    goto :goto_5

    :cond_7
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;

    invoke-virtual {v1, v3}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroidx/fragment/app/Fragment;

    const v6, 0x7f080280

    const/4 v7, 0x0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v8, v1

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v9, 0x4

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_5
    return-void

    :cond_8
    const-string v1, "user"

    .line 169
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1
.end method

.method public final onHeightClicked(Landroid/view/View;)V
    .locals 13

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    const/4 v1, 0x0

    const-string v2, "user"

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getHeight()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {p1, v0, v3}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object p1

    .line 131
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    if-eqz v3, :cond_2

    invoke-virtual {v0, v3}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->isMetricsUsed(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Z

    move-result v0

    .line 133
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v1, v2, v0}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->maxUnitValue(Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;Z)I

    move-result v1

    .line 134
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$HEIGHT;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v2, v3, v0}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->minUnitValue(Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;Z)I

    move-result v0

    .line 136
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 137
    sget-object v11, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Height;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Height;

    .line 142
    new-instance v3, Lkotlin/ranges/IntRange;

    invoke-direct {v3, v0, v1}, Lkotlin/ranges/IntRange;-><init>(II)V

    check-cast v3, Ljava/lang/Iterable;

    .line 241
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .line 242
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v5, v3

    check-cast v5, Lkotlin/collections/IntIterator;

    invoke-virtual {v5}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v5

    .line 142
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 244
    :cond_0
    check-cast v4, Ljava/util/List;

    .line 241
    check-cast v4, Ljava/util/Collection;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/String;

    .line 246
    invoke-interface {v4, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-static {v3, v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 143
    move-object v5, v3

    check-cast v5, [Ljava/lang/String;

    .line 141
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    const/4 v8, 0x0

    const/16 v9, 0x10

    const/4 v10, 0x0

    move-object v3, v12

    move-object v4, v2

    move v6, v1

    move v7, v0

    invoke-direct/range {v3 .. v10}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 143
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 141
    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    invoke-direct {v6, v12, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;)V

    .line 137
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    move-object v4, v11

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    const/4 v9, 0x0

    const/16 v10, 0x20

    const/4 v11, 0x0

    move-object v3, p1

    move-object v5, v2

    move v7, v1

    move v8, v0

    invoke-direct/range {v3 .. v11}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 145
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;

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

    :goto_1
    return-void

    .line 131
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1

    .line 130
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1
.end method

.method public final onSleepTimeClicked(Landroid/view/View;)V
    .locals 14

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-eqz p1, :cond_6

    .line 203
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->connectedDevices()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 253
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    .line 203
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-nez v3, :cond_1

    move-object v3, v1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object v3

    :goto_0
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    if-nez v0, :cond_3

    goto/16 :goto_3

    .line 205
    :cond_3
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->deviceProtocolStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-nez v0, :cond_4

    move-object v0, v1

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;->getDeviceProtocolVersion(Ljava/lang/String;)I

    move-result p1

    const/4 v0, 0x3

    if-lt p1, v0, :cond_6

    .line 207
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->sleepTimeUIStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;->getDisplayValue()Ljava/lang/String;

    move-result-object v4

    .line 209
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$SleepTime;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$SleepTime;

    move-object v3, v0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    .line 211
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    const/4 v7, 0x0

    .line 212
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->sleepTimeUIStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;->getPossibleValues()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/String;

    .line 256
    invoke-interface {v2, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    const-string v6, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-static {v2, v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v8, v2

    check-cast v8, [Ljava/lang/String;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x1d

    const/4 v13, 0x0

    move-object v6, v0

    .line 211
    invoke-direct/range {v6 .. v13}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x2

    invoke-direct {v5, v0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x38

    const/4 v10, 0x0

    move-object v2, p1

    .line 209
    invoke-direct/range {v2 .. v10}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 214
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;

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

    :cond_6
    :goto_3
    return-void
.end method

.method public final onWeightClicked(Landroid/view/View;)V
    .locals 13

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    const/4 v1, 0x0

    const-string v2, "user"

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getWeight()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {p1, v0, v3}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object p1

    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 153
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    if-eqz v4, :cond_2

    invoke-virtual {v3, v4}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->isMetricsUsed(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Z

    move-result v1

    .line 155
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v2, v3, v1}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->maxUnitValue(Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;Z)I

    move-result v2

    .line 156
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$WEIGHT;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v3, v4, v1}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->minUnitValue(Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;Z)I

    move-result v1

    .line 158
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Weight;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Weight;

    .line 162
    new-instance v4, Lkotlin/ranges/IntRange;

    invoke-direct {v4, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    check-cast v4, Ljava/lang/Iterable;

    .line 247
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .line 248
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    move-object v6, v4

    check-cast v6, Lkotlin/collections/IntIterator;

    invoke-virtual {v6}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v6

    .line 162
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 250
    :cond_0
    check-cast v5, Ljava/util/List;

    .line 247
    check-cast v5, Ljava/util/Collection;

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/String;

    .line 252
    invoke-interface {v5, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-static {v4, v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v6, v4

    check-cast v6, [Ljava/lang/String;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x1c

    const/4 v11, 0x0

    .line 162
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    move-object v4, v12

    move-object v5, v0

    invoke-direct/range {v4 .. v11}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 163
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 162
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    invoke-direct {v7, v12, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;)V

    .line 158
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    move-object v5, v3

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    const/4 v10, 0x0

    const/16 v11, 0x20

    const/4 v12, 0x0

    move-object v4, p1

    move-object v6, v0

    move v8, v2

    move v9, v1

    invoke-direct/range {v4 .. v12}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 164
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;

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

    :goto_1
    return-void

    .line 153
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1

    .line 150
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1
.end method
