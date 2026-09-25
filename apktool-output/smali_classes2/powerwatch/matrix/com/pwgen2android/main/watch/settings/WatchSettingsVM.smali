.class public final Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;
.super Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;
.source "WatchSettingsVM.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0018\u0000 h2\u00020\u00012\u00020\u0002:\u0001hBe\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\u0002\u0010\u001bJ\u0012\u0010H\u001a\u0004\u0018\u00010\u001e2\u0006\u0010I\u001a\u00020JH\u0002J\u000e\u0010K\u001a\u0008\u0012\u0004\u0012\u00020=0LH\u0002J\u0018\u0010M\u001a\u00020N2\u0006\u0010I\u001a\u00020J2\u0006\u0010O\u001a\u00020PH\u0002J\u0008\u0010Q\u001a\u00020NH\u0016J\u0010\u0010R\u001a\u00020N2\u0006\u0010S\u001a\u00020TH\u0016J\u0010\u0010U\u001a\u00020N2\u0006\u0010S\u001a\u00020TH\u0016J\u0010\u0010V\u001a\u00020N2\u0006\u0010S\u001a\u00020TH\u0016J\u0010\u0010W\u001a\u00020N2\u0006\u0010X\u001a\u00020=H\u0002J\n\u0010Y\u001a\u00020N*\u00020ZJ\n\u0010[\u001a\u00020N*\u00020ZJ\n\u0010\\\u001a\u00020N*\u00020ZJ\n\u0010]\u001a\u00020N*\u00020ZJ\n\u0010^\u001a\u00020N*\u00020ZJ\n\u0010_\u001a\u00020N*\u00020ZJ\n\u0010`\u001a\u00020N*\u00020ZJ\n\u0010a\u001a\u00020N*\u00020ZJ\n\u0010b\u001a\u00020N*\u00020ZJ\n\u0010c\u001a\u00020N*\u00020ZJ\n\u0010d\u001a\u00020N*\u00020ZJ\n\u0010e\u001a\u00020N*\u00020ZJ\n\u0010f\u001a\u00020N*\u00020ZJ\n\u0010g\u001a\u00020N*\u00020ZR\u001f\u0010\u001c\u001a\u0010\u0012\u000c\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u001f\u0010\"\u001a\u0010\u0012\u000c\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010!R\u001f\u0010$\u001a\u0010\u0012\u000c\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010!R\u001f\u0010&\u001a\u0010\u0012\u000c\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010!R\u001f\u0010(\u001a\u0010\u0012\u000c\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010!R\u001f\u0010*\u001a\u0010\u0012\u000c\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010!R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010,\u001a\u0010\u0012\u000c\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010!R\u001f\u0010.\u001a\u0010\u0012\u000c\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010!R\u001f\u00100\u001a\u0010\u0012\u000c\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010!R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u00102\u001a\u0010\u0012\u000c\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010!R\u001c\u00104\u001a\u0010\u0012\u000c\u0012\n \u001f*\u0004\u0018\u00010\u001a0\u001a05X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u00108\u001a\u0010\u0012\u000c\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010!R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010:\u001a\u0010\u0012\u000c\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010!R\u001c\u0010<\u001a\u0004\u0018\u00010=X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008>\u0010?\"\u0004\u0008@\u0010AR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010B\u001a\u0010\u0012\u000c\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010!R\u000e\u0010D\u001a\u00020EX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010F\u001a\u0010\u0012\u000c\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u0010!\u00a8\u0006i"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;",
        "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "userAccountRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "languageController",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;",
        "realTimeDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;",
        "settingsDisplayValueLoader",
        "Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;",
        "deviceRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "deviceProtocolStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;",
        "settingsDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;",
        "settingsDataRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;",
        "activity",
        "Landroid/app/Activity;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V",
        "alarmField",
        "Landroidx/databinding/ObservableField;",
        "",
        "kotlin.jvm.PlatformType",
        "getAlarmField",
        "()Landroidx/databinding/ObservableField;",
        "alertModeField",
        "getAlertModeField",
        "backLightDurationField",
        "getBackLightDurationField",
        "backLightModeField",
        "getBackLightModeField",
        "bleDisconnectionField",
        "getBleDisconnectionField",
        "clockField",
        "getClockField",
        "dndField",
        "getDndField",
        "gpsUpdateField",
        "getGpsUpdateField",
        "homeScreenModeField",
        "getHomeScreenModeField",
        "languageField",
        "getLanguageField",
        "managerWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "pairedDevice",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        "popUpDurationField",
        "getPopUpDurationField",
        "ringtoneField",
        "getRingtoneField",
        "settingsData",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;",
        "getSettingsData",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;",
        "setSettingsData",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V",
        "unitsField",
        "getUnitsField",
        "user",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        "watchOnlySectionTitle",
        "getWatchOnlySectionTitle",
        "getTitle",
        "type",
        "Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;",
        "loadSettingsData",
        "Lio/reactivex/Observable;",
        "moveToNextScreen",
        "",
        "value",
        "",
        "onBackClicked",
        "onCreateView",
        "context",
        "Landroid/content/Context;",
        "onDestroyView",
        "onStart",
        "updateUI",
        "data",
        "onAlarmClicked",
        "Landroid/view/View;",
        "onAlertClicked",
        "onBLEAlertClicked",
        "onBackLightDurationClicked",
        "onBackLightModeClicked",
        "onClockClicked",
        "onDNDClicked",
        "onGPSUpdateClicked",
        "onHomeScreenClicked",
        "onLanguageClicked",
        "onPopUpDurationClicked",
        "onRingtoneClicked",
        "onTimerClicked",
        "onUnitsClicked",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM$Companion;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final alarmField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final alertModeField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final backLightDurationField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final backLightModeField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final bleDisconnectionField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final clockField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field private final deviceProtocolStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;

.field private final deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

.field private final dndField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final gpsUpdateField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final homeScreenModeField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final languageController:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;

.field private final languageField:Landroidx/databinding/ObservableField;
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

.field private final popUpDurationField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final realTimeDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;

.field private final ringtoneField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

.field private final settingsDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;

.field private final settingsDataRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;

.field private final settingsDisplayValueLoader:Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;

.field private final unitsField:Landroidx/databinding/ObservableField;
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

.field private final watchOnlySectionTitle:Landroidx/databinding/ObservableField;
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

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM$Companion;

    .line 318
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V
    .locals 3

    const-string v0, "userAccountRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userPrefsUtils"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "languageController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "realTimeDataProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settingsDisplayValueLoader"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceRepository"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communicator"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceProtocolStorage"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settingsDataProvider"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settingsDataRepository"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    move-object v0, p11

    check-cast v0, Landroid/content/Context;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p0, v0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 44
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    .line 45
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    .line 46
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->languageController:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;

    .line 47
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->realTimeDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;

    .line 48
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsDisplayValueLoader:Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;

    .line 49
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    .line 50
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 51
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->deviceProtocolStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;

    .line 52
    iput-object p9, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;

    .line 53
    iput-object p10, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsDataRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;

    .line 60
    new-instance p1, Landroidx/databinding/ObservableField;

    const-string p2, ""

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->clockField:Landroidx/databinding/ObservableField;

    .line 61
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->unitsField:Landroidx/databinding/ObservableField;

    .line 62
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->languageField:Landroidx/databinding/ObservableField;

    .line 64
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->dndField:Landroidx/databinding/ObservableField;

    .line 65
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->backLightModeField:Landroidx/databinding/ObservableField;

    .line 66
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->backLightDurationField:Landroidx/databinding/ObservableField;

    .line 67
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->popUpDurationField:Landroidx/databinding/ObservableField;

    .line 68
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->gpsUpdateField:Landroidx/databinding/ObservableField;

    .line 69
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->homeScreenModeField:Landroidx/databinding/ObservableField;

    .line 70
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->bleDisconnectionField:Landroidx/databinding/ObservableField;

    .line 71
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->ringtoneField:Landroidx/databinding/ObservableField;

    .line 72
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->alertModeField:Landroidx/databinding/ObservableField;

    .line 73
    new-instance p1, Landroidx/databinding/ObservableField;

    const p3, 0x7f0f01e9

    invoke-virtual {p11, p3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p1, p3}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->watchOnlySectionTitle:Landroidx/databinding/ObservableField;

    .line 74
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->alarmField:Landroidx/databinding/ObservableField;

    .line 78
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p12}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->managerWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private final getTitle(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;)Ljava/lang/String;
    .locals 3

    .line 273
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$DND;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$DND;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v1, ""

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object p1

    if-nez p1, :cond_0

    :goto_0
    move-object v1, v2

    goto/16 :goto_1

    :cond_0
    const v0, 0x7f0f00ab

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_1

    .line 274
    :cond_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BackLight;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BackLight;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const v0, 0x7f0f004d

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_1

    .line 275
    :cond_3
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BackLightDuration;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BackLightDuration;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const v0, 0x7f0f004c

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_1

    .line 276
    :cond_5
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$PopUpDuration;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$PopUpDuration;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    const v0, 0x7f0f0164

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_1

    .line 277
    :cond_7
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$GPSUpdateRate;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$GPSUpdateRate;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    const v0, 0x7f0f00eb

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_1

    .line 278
    :cond_9
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$HomeScreen;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$HomeScreen;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object p1

    if-nez p1, :cond_a

    goto :goto_0

    :cond_a
    const v0, 0x7f0f00f3

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 279
    :cond_b
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BLEDisconnection;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BLEDisconnection;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object p1

    if-nez p1, :cond_c

    goto/16 :goto_0

    :cond_c
    const v0, 0x7f0f0057

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 280
    :cond_d
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$Ringtone;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$Ringtone;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object p1

    if-nez p1, :cond_e

    goto/16 :goto_0

    :cond_e
    const v0, 0x7f0f017e

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 281
    :cond_f
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$Alert;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$Alert;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object p1

    if-nez p1, :cond_10

    goto/16 :goto_0

    :cond_10
    const v0, 0x7f0f0033

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 282
    :cond_11
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$UNKNOWN;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$UNKNOWN;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    goto :goto_1

    .line 284
    :cond_12
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$AlarmRepeatMode;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$AlarmRepeatMode;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    goto :goto_1

    .line 285
    :cond_13
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$AlarmActivation;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$AlarmActivation;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_14

    :goto_1
    return-object v1

    :cond_14
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static synthetic lambda$9MTBT3QFApLPbD5_jLQqBlvhz6A(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->onStart$lambda-9(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V

    return-void
.end method

.method public static synthetic lambda$Gx_Vd51jY9IzkL8rv_CcruYVoho(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->loadSettingsData$lambda-8(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$QqbvZjG_bkAeeqlKCHVVTGCGsGs(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->onCreateView$lambda-7(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$d6sEkkOMJ4pF4KQPAYlEzElfJMo(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->onCreateView$lambda-1(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$f_hKzL3Mf20F8zftlP7JBDbI_ms(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V

    return-void
.end method

.method public static synthetic lambda$g2EZcTu2e0eI7QU-akd5gDyHlCM(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->onCreateView$lambda-5(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$jk24b1FWtuCtqNjabKOAlHNRs7c(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->onCreateView$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$rYELHU3lS_4jce1EYW6VcvNz9lw(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->onStart$lambda-10(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$sIruRqO24zHxmk3-r_gPRuNc-14(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V

    return-void
.end method

.method public static synthetic lambda$ty6p-KankbXymwiyXkYlYqijZQw(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->onCreateView$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V

    return-void
.end method

.method public static synthetic lambda$wCifHmVUALsxrCBrwlCmIp9gHWI(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->onCreateView$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V

    return-void
.end method

.method private final loadSettingsData()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;",
            ">;"
        }
    .end annotation

    .line 169
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$Gx_Vd51jY9IzkL8rv_CcruYVoho;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$Gx_Vd51jY9IzkL8rv_CcruYVoho;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "defer<SettingsData> {\n            val address = pairedDevice?.bluetoothAddress\n            if (address == null) Observable.empty<SettingsData>()\n            else {\n                val data = settingsDataProvider.loadStoredSettings(address)\n                if (data == null) Observable.empty<SettingsData>()\n                else Observable.just(data)\n            }\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final loadSettingsData$lambda-8(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    .line 171
    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_1

    .line 173
    :cond_1
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->loadStoredSettings(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    move-result-object p0

    if-nez p0, :cond_2

    .line 174
    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_1

    .line 175
    :cond_2
    invoke-static {p0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    :goto_1
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private final moveToNextScreen(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;B)V
    .locals 8

    .line 260
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->deviceProtocolStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;->getDeviceProtocolVersion(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x4

    if-ge v0, v1, :cond_1

    return-void

    .line 263
    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->defaultConnectedDevice()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v2

    :goto_1
    if-eqz v2, :cond_5

    .line 265
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_3

    goto :goto_2

    .line 266
    :cond_3
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getTitle(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    const-string v2, ""

    :cond_4
    invoke-virtual {v0, p1, v2, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;Ljava/lang/String;B)Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f080280

    const/4 v4, 0x0

    .line 267
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v5, p1

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v6, 0x4

    const/4 v7, 0x0

    .line 265
    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :cond_5
    :goto_2
    return-void
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 88
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    .line 91
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {v0, p2}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->isMetricsUsed(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f0f0111

    goto :goto_0

    :cond_0
    const v0, 0x7f0f00f9

    .line 93
    :goto_0
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {v1, p2}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->isTwelveHourFormatUsed(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Z

    move-result v1

    if-eqz v1, :cond_1

    const v1, 0x7f0f01cd

    goto :goto_1

    :cond_1
    const v1, 0x7f0f01ce

    .line 96
    :goto_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getUnitsField()Landroidx/databinding/ObservableField;

    move-result-object v2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_2

    move-object v0, v4

    goto :goto_2

    :cond_2
    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v2, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 97
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getClockField()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    :goto_3
    invoke-virtual {v0, v4}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 99
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->languageController:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->getLanguage()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p2}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;->getLanguage(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    move-result-object p2

    .line 100
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_4

    if-eqz p2, :cond_4

    .line 101
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getLanguageField()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLanguageDisplay()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :cond_4
    return-void
.end method

.method private static final onCreateView$lambda-1(Ljava/lang/Throwable;)V
    .locals 0

    .line 104
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    .line 111
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->deviceProtocolStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;->getDeviceProtocolVersion(Ljava/lang/String;)I

    move-result p1

    const v0, 0x7f0f01e9

    const/4 v1, 0x0

    const/4 v2, 0x4

    if-ge p1, v2, :cond_2

    .line 113
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getWatchOnlySectionTitle()Landroidx/databinding/ObservableField;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object v3

    if-nez v3, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " - "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    const v0, 0x7f0f0197

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_3

    .line 114
    :cond_2
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getWatchOnlySectionTitle()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object p0

    if-nez p0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_2
    invoke-virtual {p1, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :goto_3
    return-void
.end method

.method private static final onCreateView$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->loadSettingsData()Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final onCreateView$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 121
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->updateUI(Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V

    return-void
.end method

.method private static final onCreateView$lambda-5(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private static final onCreateView$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 130
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->updateUI(Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V

    return-void
.end method

.method private static final onCreateView$lambda-7(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private static final onStart$lambda-10(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private static final onStart$lambda-9(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 185
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->updateUI(Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V

    return-void
.end method

.method private final updateUI(Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V
    .locals 4

    .line 147
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    if-eqz p1, :cond_0

    .line 150
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->dndField:Landroidx/databinding/ObservableField;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsDisplayValueLoader:Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->getDnd()I

    move-result p1

    int-to-byte p1, p1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$DND;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$DND;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1, p1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;->getDisplayValue(BLpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 151
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->backLightModeField:Landroidx/databinding/ObservableField;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsDisplayValueLoader:Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->getBackLight()I

    move-result v1

    int-to-byte v1, v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BackLight;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BackLight;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;->getDisplayValue(BLpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 152
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->backLightDurationField:Landroidx/databinding/ObservableField;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsDisplayValueLoader:Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->getBackLightDuration()I

    move-result v1

    int-to-byte v1, v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BackLightDuration;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BackLightDuration;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;->getDisplayValue(BLpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 153
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->popUpDurationField:Landroidx/databinding/ObservableField;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsDisplayValueLoader:Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->getPopupDuration()I

    move-result v1

    int-to-byte v1, v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$PopUpDuration;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$PopUpDuration;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;->getDisplayValue(BLpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 154
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->gpsUpdateField:Landroidx/databinding/ObservableField;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsDisplayValueLoader:Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->getGpsUpdateRate()I

    move-result v1

    int-to-byte v1, v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$GPSUpdateRate;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$GPSUpdateRate;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;->getDisplayValue(BLpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 155
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->homeScreenModeField:Landroidx/databinding/ObservableField;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsDisplayValueLoader:Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->getHomeScreen()I

    move-result v1

    int-to-byte v1, v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$HomeScreen;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$HomeScreen;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;->getDisplayValue(BLpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 156
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->bleDisconnectionField:Landroidx/databinding/ObservableField;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsDisplayValueLoader:Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->getBleDisconnect()I

    move-result v1

    int-to-byte v1, v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BLEDisconnection;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BLEDisconnection;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;->getDisplayValue(BLpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 157
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->ringtoneField:Landroidx/databinding/ObservableField;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsDisplayValueLoader:Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->getRingtone()I

    move-result v1

    int-to-byte v1, v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$Ringtone;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$Ringtone;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;->getDisplayValue(BLpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 158
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->alertModeField:Landroidx/databinding/ObservableField;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsDisplayValueLoader:Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->getAlert()I

    move-result v1

    int-to-byte v1, v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$Alert;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$Alert;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getActivityContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;->getDisplayValue(BLpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final getAlarmField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->alarmField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getAlertModeField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 72
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->alertModeField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getBackLightDurationField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->backLightDurationField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getBackLightModeField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->backLightModeField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getBleDisconnectionField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->bleDisconnectionField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getClockField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 60
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->clockField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getDndField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 64
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->dndField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getGpsUpdateField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 68
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->gpsUpdateField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getHomeScreenModeField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 69
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->homeScreenModeField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 44
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final getLanguageField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 62
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->languageField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getPopUpDurationField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 67
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->popUpDurationField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getRingtoneField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 71
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->ringtoneField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getSettingsData()Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;
    .locals 1

    .line 76
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    return-object v0
.end method

.method public final getUnitsField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 61
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->unitsField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getWatchOnlySectionTitle()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 73
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->watchOnlySectionTitle:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final onAlarmClicked(Landroid/view/View;)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->deviceProtocolStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;->getDeviceProtocolVersion(Ljava/lang/String;)I

    move-result p1

    const/4 v0, 0x4

    if-ge p1, v0, :cond_1

    return-void

    .line 239
    :cond_1
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->defaultConnectedDevice()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_4

    .line 241
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_3

    goto :goto_2

    .line 242
    :cond_3
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmSettingFragment;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f080280

    const/4 v3, 0x0

    .line 243
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v4, p1

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v5, 0x4

    const/4 v6, 0x0

    .line 241
    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :cond_4
    :goto_2
    return-void
.end method

.method public final onAlertClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    if-nez p1, :cond_0

    return-void

    .line 232
    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$Alert;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$Alert;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->getAlert()I

    move-result v0

    int-to-byte v0, v0

    invoke-direct {p0, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->moveToNextScreen(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;B)V

    return-void
.end method

.method public final onBLEAlertClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    if-nez p1, :cond_0

    return-void

    .line 222
    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BLEDisconnection;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BLEDisconnection;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->getBleDisconnect()I

    move-result v0

    int-to-byte v0, v0

    invoke-direct {p0, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->moveToNextScreen(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;B)V

    return-void
.end method

.method public onBackClicked()V
    .locals 1

    .line 314
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->managerWeakReference:Ljava/lang/ref/WeakReference;

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

.method public final onBackLightDurationClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    if-nez p1, :cond_0

    return-void

    .line 202
    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BackLightDuration;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BackLightDuration;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->getBackLightDuration()I

    move-result v0

    int-to-byte v0, v0

    invoke-direct {p0, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->moveToNextScreen(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;B)V

    return-void
.end method

.method public final onBackLightModeClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    if-nez p1, :cond_0

    return-void

    .line 197
    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BackLight;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$BackLight;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->getBackLight()I

    move-result v0

    int-to-byte v0, v0

    invoke-direct {p0, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->moveToNextScreen(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;B)V

    return-void
.end method

.method public final onClockClicked(Landroid/view/View;)V
    .locals 20

    move-object/from16 v0, p0

    const-string v1, "<this>"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 294
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->getTimeFormatType()I

    move-result v1

    .line 296
    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Clock;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Clock;

    move-object v3, v2

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    .line 297
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x68

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 298
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    const/4 v13, 0x0

    const/4 v2, 0x2

    new-array v14, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    .line 300
    sget-object v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$Twelve;->getFormat()I

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v14, v2

    const/4 v2, 0x1

    .line 301
    sget-object v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$TwentyFour;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$TwentyFour;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HourFormat$TwentyFour;->getFormat()I

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v14, v2

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x1d

    const/16 v19, 0x0

    move-object v12, v1

    .line 298
    invoke-direct/range {v12 .. v19}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "h"

    invoke-direct {v5, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x38

    const/4 v10, 0x0

    move-object v2, v11

    .line 296
    invoke-direct/range {v2 .. v10}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 303
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroidx/fragment/app/FragmentManager;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;

    invoke-virtual {v1, v11}, Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;)Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroidx/fragment/app/Fragment;

    const v4, 0x7f080280

    const/4 v5, 0x0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v6, v1

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v7, 0x4

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void

    :cond_1
    const-string v1, "user"

    .line 294
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1
.end method

.method public onCreateView(Landroid/content/Context;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onCreateView(Landroid/content/Context;)V

    .line 84
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x0

    .line 85
    invoke-static {v1, v2, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository$DefaultImpls;->getFirst$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;ZZILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object v1

    .line 86
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/reactivex/Single;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Single;

    move-result-object v1

    .line 87
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$sIruRqO24zHxmk3-r_gPRuNc-14;

    invoke-direct {v5, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$sIruRqO24zHxmk3-r_gPRuNc-14;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;Landroid/content/Context;)V

    sget-object v6, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$d6sEkkOMJ4pF4KQPAYlEzElfJMo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$d6sEkkOMJ4pF4KQPAYlEzElfJMo;

    invoke-virtual {v1, v5, v6}, Lio/reactivex/Single;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 84
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 107
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;

    .line 108
    invoke-static {v1, v2, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository$DefaultImpls;->load$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;ZZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    .line 109
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$f_hKzL3Mf20F8zftlP7JBDbI_ms;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$f_hKzL3Mf20F8zftlP7JBDbI_ms;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v1

    .line 116
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$jk24b1FWtuCtqNjabKOAlHNRs7c;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$jk24b1FWtuCtqNjabKOAlHNRs7c;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    .line 119
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object v1

    .line 120
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$ty6p-KankbXymwiyXkYlYqijZQw;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$ty6p-KankbXymwiyXkYlYqijZQw;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;)V

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$g2EZcTu2e0eI7QU-akd5gDyHlCM;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$g2EZcTu2e0eI7QU-akd5gDyHlCM;

    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 107
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 127
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->observe()Lio/reactivex/Observable;

    move-result-object v1

    .line 128
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object v1

    .line 129
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$wCifHmVUALsxrCBrwlCmIp9gHWI;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$wCifHmVUALsxrCBrwlCmIp9gHWI;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;)V

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$QqbvZjG_bkAeeqlKCHVVTGCGsGs;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$QqbvZjG_bkAeeqlKCHVVTGCGsGs;

    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 127
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 136
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsDataRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->loadAlarm()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 138
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsDisplayValueLoader:Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;->getAlarmControl()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;->getMode()B

    move-result v2

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$AlarmActivation;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$AlarmActivation;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    invoke-virtual {v1, v2, v3, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;->getDisplayValue(BLpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 139
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;->getDaySelection()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;->getMode()B

    move-result v2

    invoke-virtual {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection$Companion;->getDaySelection(I)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

    move-result-object v1

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegateKt;->setCurrentRepeat(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;)V

    .line 140
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;->getAlarmControl()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;->getMode()B

    move-result v0

    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl$Companion;->getAlarmControl(I)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    move-result-object v0

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegateKt;->setCurrentSelectionMode(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;)V

    .line 141
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->alarmField:Landroidx/databinding/ObservableField;

    invoke-virtual {v0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final onDNDClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    if-nez p1, :cond_0

    return-void

    .line 192
    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$DND;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$DND;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->getDnd()I

    move-result v0

    int-to-byte v0, v0

    invoke-direct {p0, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->moveToNextScreen(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;B)V

    return-void
.end method

.method public onDestroyView(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onDestroyView(Landroid/content/Context;)V

    .line 164
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method

.method public final onGPSUpdateClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    if-nez p1, :cond_0

    return-void

    .line 212
    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$GPSUpdateRate;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$GPSUpdateRate;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->getGpsUpdateRate()I

    move-result v0

    int-to-byte v0, v0

    invoke-direct {p0, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->moveToNextScreen(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;B)V

    return-void
.end method

.method public final onHomeScreenClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    if-nez p1, :cond_0

    return-void

    .line 217
    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$HomeScreen;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$HomeScreen;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->getHomeScreen()I

    move-result v0

    int-to-byte v0, v0

    invoke-direct {p0, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->moveToNextScreen(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;B)V

    return-void
.end method

.method public final onLanguageClicked(Landroid/view/View;)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 308
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageFragment;

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
.end method

.method public final onPopUpDurationClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    if-nez p1, :cond_0

    return-void

    .line 207
    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$PopUpDuration;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$PopUpDuration;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->getPopupDuration()I

    move-result v0

    int-to-byte v0, v0

    invoke-direct {p0, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->moveToNextScreen(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;B)V

    return-void
.end method

.method public final onRingtoneClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    if-nez p1, :cond_0

    return-void

    .line 227
    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$Ringtone;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$Ringtone;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->getRingtone()I

    move-result v0

    int-to-byte v0, v0

    invoke-direct {p0, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->moveToNextScreen(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;B)V

    return-void
.end method

.method public onStart(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onStart(Landroid/content/Context;)V

    .line 182
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    .line 183
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->loadSettingsData()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object v0

    .line 184
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$9MTBT3QFApLPbD5_jLQqBlvhz6A;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$9MTBT3QFApLPbD5_jLQqBlvhz6A;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;)V

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$rYELHU3lS_4jce1EYW6VcvNz9lw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/-$$Lambda$WatchSettingsVM$rYELHU3lS_4jce1EYW6VcvNz9lw;

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 182
    invoke-virtual {p1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public final onTimerClicked(Landroid/view/View;)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->deviceProtocolStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;->getDeviceProtocolVersion(Ljava/lang/String;)I

    move-result p1

    const/4 v0, 0x4

    if-ge p1, v0, :cond_1

    return-void

    .line 251
    :cond_1
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->defaultConnectedDevice()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_4

    .line 253
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_3

    goto :goto_2

    .line 254
    :cond_3
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingFragment;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f080280

    const/4 v3, 0x0

    .line 255
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v4, p1

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v5, 0x4

    const/4 v6, 0x0

    .line 253
    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :cond_4
    :goto_2
    return-void
.end method

.method public final onUnitsClicked(Landroid/view/View;)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 290
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;

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
.end method

.method public final setSettingsData(Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/WatchSettingsVM;->settingsData:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    return-void
.end method
