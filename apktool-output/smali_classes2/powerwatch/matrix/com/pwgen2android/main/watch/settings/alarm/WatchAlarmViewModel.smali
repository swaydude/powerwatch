.class public final Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;
.source "WatchAlarmViewModel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;
.implements Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWatchAlarmViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchAlarmViewModel.kt\npowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,195:1\n1547#2:196\n1618#2,3:197\n1547#2:202\n1618#2,3:203\n37#3,2:200\n37#3,2:206\n*S KotlinDebug\n*F\n+ 1 WatchAlarmViewModel.kt\npowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel\n*L\n128#1:196\n128#1:197,3\n132#1:202\n132#1:203,3\n128#1:200,2\n132#1:206,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BG\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0013J\u0006\u0010H\u001a\u00020FJ\u0008\u0010I\u001a\u00020FH\u0002J\u0006\u0010J\u001a\u00020FJ\u0011\u0010K\u001a\u0008\u0012\u0004\u0012\u00020\u00150L\u00a2\u0006\u0002\u0010MJ\u0011\u0010N\u001a\u0008\u0012\u0004\u0012\u00020\u00150L\u00a2\u0006\u0002\u0010MJ\u0011\u0010O\u001a\u0008\u0012\u0004\u0012\u00020\u00150L\u00a2\u0006\u0002\u0010MJ\u0008\u0010P\u001a\u00020QH\u0016J\u0010\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020TH\u0016J\u0006\u0010U\u001a\u00020QJ \u0010V\u001a\u00020Q2\u0006\u0010W\u001a\u00020\"2\u0006\u0010X\u001a\u00020\"2\u0006\u0010Y\u001a\u00020FH\u0002J \u0010Z\u001a\u00020Q2\u0006\u0010W\u001a\u00020\"2\u0006\u0010X\u001a\u00020\"2\u0006\u0010Y\u001a\u00020FH\u0002J\u0018\u0010[\u001a\u00020\"2\u0006\u0010W\u001a\u00020\"2\u0006\u0010Y\u001a\u00020FH\u0002J\n\u0010\\\u001a\u00020Q*\u00020]J\n\u0010^\u001a\u00020Q*\u00020]R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082D\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001aR\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001aR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\"0\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u001aR\u001a\u0010$\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(R\u001a\u0010)\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008*\u0010+\"\u0004\u0008,\u0010-R\u001a\u0010.\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008/\u0010+\"\u0004\u00080\u0010-R\u001c\u00101\u001a\u0010\u0012\u000c\u0012\n 3*\u0004\u0018\u00010\u00070\u000702X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00104\u001a\u0008\u0012\u0004\u0012\u00020\"0\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u0010\u001aR\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00088\u00109\"\u0004\u0008:\u0010;R\u001c\u0010<\u001a\u0004\u0018\u00010=X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008>\u0010?\"\u0004\u0008@\u0010AR\u001c\u0010B\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008C\u0010&\"\u0004\u0008D\u0010(R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010E\u001a\u0008\u0012\u0004\u0012\u00020F0\u0018X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008G\u0010\u001aR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006_"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;",
        "activity",
        "Landroid/app/Activity;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "settingsDisplayValueLoader",
        "Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;",
        "alarmTimerSettingExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "settingsDataRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;",
        "savePreferencesViewModel",
        "(Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V",
        "AM",
        "",
        "PM",
        "alarmActivationField",
        "Landroidx/databinding/ObservableField;",
        "getAlarmActivationField",
        "()Landroidx/databinding/ObservableField;",
        "alarmRepeatField",
        "getAlarmRepeatField",
        "amPm",
        "getAmPm",
        "getCommunicator",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "hourValue",
        "",
        "getHourValue",
        "initialAM",
        "getInitialAM",
        "()Ljava/lang/String;",
        "setInitialAM",
        "(Ljava/lang/String;)V",
        "initialHourValue",
        "getInitialHourValue",
        "()I",
        "setInitialHourValue",
        "(I)V",
        "initialMinuteValue",
        "getInitialMinuteValue",
        "setInitialMinuteValue",
        "managerWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "minuteValue",
        "getMinuteValue",
        "oldAlarmActive",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;",
        "getOldAlarmActive",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;",
        "setOldAlarmActive",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;)V",
        "oldAlarmRepetition",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;",
        "getOldAlarmRepetition",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;",
        "setOldAlarmRepetition",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;)V",
        "oldAlarmTime",
        "getOldAlarmTime",
        "setOldAlarmTime",
        "showSaveProgress",
        "",
        "getShowSaveProgress",
        "isAMPMUSed",
        "isAMSet",
        "isOldAlarmSet",
        "loadAMValues",
        "",
        "()[Ljava/lang/String;",
        "loadHourValues",
        "loadMinuteValues",
        "onBackClicked",
        "",
        "onCreateView",
        "context",
        "Landroid/content/Context;",
        "onDoneClicked",
        "prepareForMainDisplay",
        "hour",
        "minute",
        "amSelected",
        "prepareForOldDisplay",
        "processHourValue",
        "onActivationClicked",
        "Landroid/view/View;",
        "onAlarmRepeatClicked",
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

.field private final AM:Ljava/lang/String;

.field private final PM:Ljava/lang/String;

.field private final alarmActivationField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final alarmRepeatField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final alarmTimerSettingExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

.field private final amPm:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field private final hourValue:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private initialAM:Ljava/lang/String;

.field private initialHourValue:I

.field private initialMinuteValue:I

.field private final managerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;"
        }
    .end annotation
.end field

.field private final minuteValue:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private oldAlarmActive:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

.field private oldAlarmRepetition:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

.field private oldAlarmTime:Ljava/lang/String;

.field private final settingsDataRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;

.field private final settingsDisplayValueLoader:Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;

.field private final userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V
    .locals 2

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communicator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settingsDisplayValueLoader"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alarmTimerSettingExecutor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userPrefsUtils"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settingsDataRepository"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savePreferencesViewModel"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    check-cast p1, Landroid/content/Context;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 27
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 28
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->settingsDisplayValueLoader:Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;

    .line 29
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->alarmTimerSettingExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    .line 30
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    .line 31
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->settingsDataRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;

    .line 33
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    .line 35
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    const-string p1, "AM"

    .line 37
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->AM:Ljava/lang/String;

    const-string p2, "PM"

    .line 38
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->PM:Ljava/lang/String;

    .line 40
    new-instance p2, Landroidx/databinding/ObservableField;

    invoke-direct {p2}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->alarmRepeatField:Landroidx/databinding/ObservableField;

    .line 41
    new-instance p2, Landroidx/databinding/ObservableField;

    invoke-direct {p2}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->alarmActivationField:Landroidx/databinding/ObservableField;

    .line 42
    new-instance p2, Landroidx/databinding/ObservableField;

    invoke-direct {p2}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->hourValue:Landroidx/databinding/ObservableField;

    .line 43
    new-instance p2, Landroidx/databinding/ObservableField;

    invoke-direct {p2}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->minuteValue:Landroidx/databinding/ObservableField;

    .line 44
    new-instance p2, Landroidx/databinding/ObservableField;

    invoke-direct {p2}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->amPm:Landroidx/databinding/ObservableField;

    .line 48
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->initialAM:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p9

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    .line 32
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModelImpl;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModelImpl;-><init>(Landroidx/databinding/ObservableField;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    move-object v9, v0

    goto :goto_0

    :cond_0
    move-object/from16 v9, p8

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    .line 26
    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;-><init>(Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V

    return-void
.end method

.method private final isAMSet()Z
    .locals 3

    .line 139
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->amPm:Landroidx/databinding/ObservableField;

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->AM:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static synthetic lambda$D7KrapNuoVTS_JPQgKV3v4Gdsbg()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->onDoneClicked$lambda-3()V

    return-void
.end method

.method public static synthetic lambda$rvPKcUBssDy_uDcWLuCOt2FnQz4(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->onDoneClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$xMXShJ9NoqJVduGKQj5Nkpw56NQ(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->onDoneClicked$lambda-4(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final onDoneClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;Ljava/lang/Throwable;)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 164
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->onBackClicked()V

    return-void
.end method

.method private static final onDoneClicked$lambda-3()V
    .locals 0

    return-void
.end method

.method private static final onDoneClicked$lambda-4(Ljava/lang/Throwable;)V
    .locals 0

    .line 168
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private final prepareForMainDisplay(IIZ)V
    .locals 0

    .line 118
    invoke-direct {p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->processHourValue(IZ)I

    move-result p1

    .line 119
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->initialHourValue:I

    .line 120
    iput p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->initialMinuteValue:I

    if-eqz p3, :cond_0

    .line 121
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->AM:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->PM:Ljava/lang/String;

    :goto_0
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->initialAM:Ljava/lang/String;

    return-void
.end method

.method private final prepareForOldDisplay(IIZ)V
    .locals 2

    .line 112
    invoke-direct {p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->processHourValue(IZ)I

    move-result p1

    .line 113
    sget-object p3, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    const/4 p3, 0x2

    new-array v0, p3, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v0, p2

    invoke-static {v0, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "%02d:%02d"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "java.lang.String.format(format, *args)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->oldAlarmTime:Ljava/lang/String;

    return-void
.end method

.method private final processHourValue(IZ)I
    .locals 2

    .line 90
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->isAMPMUSed()Z

    move-result p2

    const/16 v0, 0xc

    if-eqz p2, :cond_0

    if-le p1, v0, :cond_0

    add-int/lit8 v1, p1, -0xc

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    if-nez p2, :cond_1

    if-ge p1, v0, :cond_1

    add-int/lit8 v1, p1, 0xc

    :cond_1
    return v1
.end method


# virtual methods
.method public final getAlarmActivationField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 41
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->alarmActivationField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getAlarmRepeatField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->alarmRepeatField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getAmPm()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 44
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->amPm:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getCommunicator()Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;
    .locals 1

    .line 27
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    return-object v0
.end method

.method public final getHourValue()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->hourValue:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getInitialAM()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->initialAM:Ljava/lang/String;

    return-object v0
.end method

.method public final getInitialHourValue()I
    .locals 1

    .line 46
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->initialHourValue:I

    return v0
.end method

.method public final getInitialMinuteValue()I
    .locals 1

    .line 47
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->initialMinuteValue:I

    return v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 26
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final getMinuteValue()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->minuteValue:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getOldAlarmActive()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;
    .locals 1

    .line 51
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->oldAlarmActive:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    return-object v0
.end method

.method public final getOldAlarmRepetition()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;
    .locals 1

    .line 52
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->oldAlarmRepetition:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

    return-object v0
.end method

.method public final getOldAlarmTime()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->oldAlarmTime:Ljava/lang/String;

    return-object v0
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

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object v0

    return-object v0
.end method

.method public final isAMPMUSed()Z
    .locals 1

    .line 124
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->isTwelveHourFormatUsed()Z

    move-result v0

    return v0
.end method

.method public final isOldAlarmSet()Z
    .locals 1

    .line 87
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->oldAlarmActive:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final loadAMValues()[Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    .line 136
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->AM:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->PM:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public final loadHourValues()[Ljava/lang/String;
    .locals 6

    .line 127
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->isAMPMUSed()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lkotlin/ranges/IntRange;

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/ranges/IntRange;

    const/16 v2, 0x17

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 128
    :goto_0
    check-cast v0, Ljava/lang/Iterable;

    .line 196
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 197
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v3, v0

    check-cast v3, Lkotlin/collections/IntIterator;

    invoke-virtual {v3}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v3

    .line 128
    sget-object v4, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v5, v1

    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    const-string v4, "%02d"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "java.lang.String.format(format, *args)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 199
    :cond_1
    check-cast v2, Ljava/util/List;

    .line 196
    check-cast v2, Ljava/util/Collection;

    new-array v0, v1, [Ljava/lang/String;

    .line 201
    invoke-interface {v2, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public final loadMinuteValues()[Ljava/lang/String;
    .locals 6

    .line 132
    new-instance v0, Lkotlin/ranges/IntRange;

    const/4 v1, 0x0

    const/16 v2, 0x3b

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    check-cast v0, Ljava/lang/Iterable;

    .line 202
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 203
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lkotlin/collections/IntIterator;

    invoke-virtual {v3}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v3

    .line 132
    sget-object v4, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v5, v1

    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    const-string v4, "%02d"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "java.lang.String.format(format, *args)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 205
    :cond_0
    check-cast v2, Ljava/util/List;

    .line 202
    check-cast v2, Ljava/util/Collection;

    new-array v0, v1, [Ljava/lang/String;

    .line 207
    invoke-interface {v2, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public final onActivationClicked(Landroid/view/View;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->defaultConnectedDevice()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    .line 188
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_1

    goto :goto_1

    .line 189
    :cond_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$AlarmActivation;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$AlarmActivation;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    .line 190
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const v3, 0x7f0f001e

    invoke-virtual {p1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v3, "context.getString(R.string.activation)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegateKt;->getCurrentSelectionMode()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    move-result-object v3

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;->getMode()B

    move-result v3

    .line 189
    invoke-virtual {v0, v2, p1, v3}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;Ljava/lang/String;B)Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f080280

    const/4 v4, 0x0

    .line 191
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v5, p1

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v6, 0x4

    const/4 v7, 0x0

    .line 188
    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final onAlarmRepeatClicked(Landroid/view/View;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->defaultConnectedDevice()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    .line 178
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_1

    goto :goto_1

    .line 179
    :cond_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$AlarmRepeatMode;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$AlarmRepeatMode;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    .line 180
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const v3, 0x7f0f0176

    invoke-virtual {p1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v3, "context.getString(R.string.repeat)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegateKt;->getCurrentRepeat()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

    move-result-object v3

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;->getMode()B

    move-result v3

    .line 179
    invoke-virtual {v0, v2, p1, v3}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;Ljava/lang/String;B)Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f080280

    const/4 v4, 0x0

    .line 181
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v5, p1

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v6, 0x4

    const/4 v7, 0x0

    .line 178
    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public onBackClicked()V
    .locals 1

    .line 142
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->managerWeakReference:Ljava/lang/ref/WeakReference;

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
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onCreateView(Landroid/content/Context;)V

    .line 56
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->alarmRepeatField:Landroidx/databinding/ObservableField;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->settingsDisplayValueLoader:Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;

    .line 57
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegateKt;->getCurrentRepeat()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;->getMode()B

    move-result v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$AlarmRepeatMode;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$AlarmRepeatMode;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->getActivityContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 56
    invoke-virtual {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;->getDisplayValue(BLpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 60
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->alarmActivationField:Landroidx/databinding/ObservableField;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->settingsDisplayValueLoader:Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;

    .line 61
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegateKt;->getCurrentSelectionMode()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;->getMode()B

    move-result v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$AlarmActivation;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$AlarmActivation;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->getActivityContext()Landroid/content/Context;

    move-result-object v3

    .line 60
    invoke-virtual {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;->getDisplayValue(BLpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 64
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->settingsDataRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;->loadAlarm()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 66
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;->getHour()B

    move-result v0

    .line 67
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;->getMinute()B

    move-result v1

    .line 68
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;->isAM()Z

    move-result v2

    .line 70
    invoke-direct {p0, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->prepareForOldDisplay(IIZ)V

    .line 72
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;->getAlarmControl()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    move-result-object v0

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->oldAlarmActive:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    .line 73
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;->getDaySelection()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

    move-result-object p1

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->oldAlarmRepetition:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

    .line 76
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 80
    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toCalendar(J)Ljava/util/Calendar;

    move-result-object p1

    .line 81
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->hourInDay(Ljava/util/Calendar;)I

    move-result v0

    .line 82
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->hourInDay(Ljava/util/Calendar;)I

    move-result v1

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->minInHour(Ljava/util/Calendar;)I

    move-result p1

    const/4 v2, 0x1

    sub-int/2addr p1, v2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->isAMPMUSed()Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0xc

    if-ge v0, v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-direct {p0, v1, p1, v2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->prepareForMainDisplay(IIZ)V

    return-void
.end method

.method public final onDoneClicked()V
    .locals 11

    .line 146
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->hourValue:Landroidx/databinding/ObservableField;

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 147
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->minuteValue:Landroidx/databinding/ObservableField;

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 148
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->isAMPMUSed()Z

    move-result v2

    .line 150
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    const/16 v3, 0xc

    if-ge v0, v3, :cond_1

    if-eqz v2, :cond_0

    .line 152
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->isAMSet()Z

    move-result v5

    if-eqz v5, :cond_1

    :cond_0
    const/4 v8, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    const/4 v8, 0x0

    :goto_0
    if-eqz v2, :cond_2

    if-le v0, v3, :cond_2

    add-int/lit8 v0, v0, -0xc

    .line 159
    :cond_2
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v2

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->alarmTimerSettingExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    .line 160
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;

    int-to-byte v6, v0

    int-to-byte v7, v1

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegateKt;->getCurrentRepeat()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

    move-result-object v9

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegateKt;->getCurrentSelectionMode()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    move-result-object v10

    move-object v5, v4

    invoke-direct/range {v5 .. v10}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;-><init>(BBZLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;)V

    .line 159
    invoke-interface {v3, v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->setAlarm(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;)Lio/reactivex/Completable;

    move-result-object v0

    .line 161
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Completable;

    move-result-object v0

    .line 162
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/-$$Lambda$WatchAlarmViewModel$rvPKcUBssDy_uDcWLuCOt2FnQz4;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/-$$Lambda$WatchAlarmViewModel$rvPKcUBssDy_uDcWLuCOt2FnQz4;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->doOnEvent(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/-$$Lambda$WatchAlarmViewModel$D7KrapNuoVTS_JPQgKV3v4Gdsbg;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/-$$Lambda$WatchAlarmViewModel$D7KrapNuoVTS_JPQgKV3v4Gdsbg;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/-$$Lambda$WatchAlarmViewModel$xMXShJ9NoqJVduGKQj5Nkpw56NQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/-$$Lambda$WatchAlarmViewModel$xMXShJ9NoqJVduGKQj5Nkpw56NQ;

    .line 165
    invoke-virtual {v0, v1, v3}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 159
    invoke-virtual {v2, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public final setInitialAM(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->initialAM:Ljava/lang/String;

    return-void
.end method

.method public final setInitialHourValue(I)V
    .locals 0

    .line 46
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->initialHourValue:I

    return-void
.end method

.method public final setInitialMinuteValue(I)V
    .locals 0

    .line 47
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->initialMinuteValue:I

    return-void
.end method

.method public final setOldAlarmActive(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->oldAlarmActive:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;

    return-void
.end method

.method public final setOldAlarmRepetition(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->oldAlarmRepetition:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;

    return-void
.end method

.method public final setOldAlarmTime(Ljava/lang/String;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->oldAlarmTime:Ljava/lang/String;

    return-void
.end method
