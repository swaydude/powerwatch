.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
.source "MainDashboardViewModel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0008\u0008\u0002\u0010\u001f\u001a\u00020 \u00a2\u0006\u0002\u0010!J\u0006\u0010K\u001a\u00020:J\u0010\u0010L\u001a\u00020:2\u0008\u0010I\u001a\u0004\u0018\u00010JJ\u0010\u0010M\u001a\u00020:2\u0008\u0010N\u001a\u0004\u0018\u00010JJ\u0010\u0010O\u001a\u00020:2\u0008\u0010I\u001a\u0004\u0018\u00010JJ\u0010\u0010P\u001a\u00020:2\u0006\u0010Q\u001a\u00020\u001cH\u0016J\u0010\u0010R\u001a\u00020:2\u0006\u0010Q\u001a\u00020\u001cH\u0016J\u0006\u0010S\u001a\u00020:J\u0006\u0010T\u001a\u00020:J\u0008\u0010U\u001a\u00020:H\u0002J\u0008\u0010V\u001a\u00020:H\u0002J\u0012\u0010W\u001a\u00020:2\u0008\u0010I\u001a\u0004\u0018\u00010JH\u0007J\u0006\u0010X\u001a\u00020:J\u0008\u0010Y\u001a\u00020:H\u0002J\u0008\u0010Z\u001a\u00020:H\u0002J\u0012\u0010[\u001a\u00020:2\u0008\u0010I\u001a\u0004\u0018\u00010JH\u0002J\u000c\u0010\\\u001a\u00020:*\u00020]H\u0007R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\"\u001a\u0010\u0012\u000c\u0012\n %*\u0004\u0018\u00010$0$0#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010+\u001a\u0010\u0012\u000c\u0012\n %*\u0004\u0018\u00010,0,0#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010\'R\u001f\u0010-\u001a\u0010\u0012\u000c\u0012\n %*\u0004\u0018\u00010,0,0#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010\'R\u000e\u0010.\u001a\u00020/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u00100\u001a\u0010\u0012\u000c\u0012\n %*\u0004\u0018\u00010\u001a0\u001a01X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u00102\u001a\u0010\u0012\u000c\u0012\n %*\u0004\u0018\u00010,0,0#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010\'R5\u00104\u001a&\u0012\u000c\u0012\n %*\u0004\u0018\u00010606 %*\u0012\u0012\u000c\u0012\n %*\u0004\u0018\u00010606\u0018\u00010505\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u00108R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00109\u001a\u0008\u0012\u0004\u0012\u00020:05\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u00108R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010=\u001a\u0010\u0012\u000c\u0012\n %*\u0004\u0018\u00010,0,0#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010\'R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010C\u001a\u0010\u0012\u000c\u0012\n %*\u0004\u0018\u00010$0$0#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008D\u0010\'R\u001f\u0010E\u001a\u0010\u0012\u000c\u0012\n %*\u0004\u0018\u00010,0,0#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u0010\'R\u001f\u0010G\u001a\u0010\u0012\u000c\u0012\n %*\u0004\u0018\u00010$0$0#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008H\u0010\'R\u0010\u0010I\u001a\u0004\u0018\u00010JX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006^"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "goalConfigurationRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;",
        "watchSynchronizer",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;",
        "syncViewModel",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;",
        "bluetoothManager",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;",
        "otaProcessExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;",
        "updateInfoRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;",
        "deviceRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "deviceManager",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;",
        "selectDate",
        "Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;",
        "selectedDateProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;",
        "rxBus",
        "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;",
        "parentFragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "appContext",
        "Landroid/content/Context;",
        "metricsRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;",
        "dashboardToastConfigViewModel",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;)V",
        "backButtonFieldText",
        "Landroidx/databinding/ObservableField;",
        "",
        "kotlin.jvm.PlatformType",
        "getBackButtonFieldText",
        "()Landroidx/databinding/ObservableField;",
        "connectionDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "dataDisposable",
        "isSwipeRefreshing",
        "",
        "isSyncBlocked",
        "mainHandler",
        "Landroid/os/Handler;",
        "parentFragmentManagerWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "pullToSyncDisplayed",
        "getPullToSyncDisplayed",
        "realtimeWidgetTapEvent",
        "Lio/reactivex/Observable;",
        "",
        "getRealtimeWidgetTapEvent",
        "()Lio/reactivex/Observable;",
        "scrollToTopEvent",
        "",
        "getScrollToTopEvent",
        "syncDisposable",
        "syncInProgress",
        "getSyncInProgress",
        "timer",
        "Ljava/util/Timer;",
        "timerValue",
        "",
        "toastActionButtonFieldText",
        "getToastActionButtonFieldText",
        "toastMessageDisplayed",
        "getToastMessageDisplayed",
        "toastMessageFieldText",
        "getToastMessageFieldText",
        "toolbar",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;",
        "onBackButtonClicked",
        "onConnectivityOff",
        "onConnectivityOn",
        "mainToolbar",
        "onConnectivitySearching",
        "onCreateView",
        "context",
        "onDestroyView",
        "onRefresh",
        "onRightButtonClicked",
        "onSyncFinished",
        "onSyncStarted",
        "prepare",
        "resetDateToToday",
        "startSync",
        "stopAnimation",
        "triggerAnimation",
        "onToastMessageClicked",
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
.field private final appContext:Landroid/content/Context;

.field private final backButtonFieldText:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final bluetoothManager:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

.field private final connectionDisposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final dashboardToastConfigViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;

.field private final dataDisposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

.field private final goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

.field private final isSwipeRefreshing:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final isSyncBlocked:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final mainHandler:Landroid/os/Handler;

.field private final parentFragmentManagerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;"
        }
    .end annotation
.end field

.field private final pullToSyncDisplayed:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final realtimeWidgetTapEvent:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

.field private final scrollToTopEvent:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final selectDate:Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;

.field private final selectedDateProvider:Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;

.field private final syncDisposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final syncInProgress:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final syncViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;

.field private timer:Ljava/util/Timer;

.field private timerValue:I

.field private final toastActionButtonFieldText:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final toastMessageDisplayed:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final toastMessageFieldText:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private toolbar:Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

.field private final watchSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;)V
    .locals 14

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    move-object/from16 v10, p13

    move-object/from16 v11, p15

    const-string v12, "goalConfigurationRepository"

    invoke-static {p1, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "watchSynchronizer"

    invoke-static {v2, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "syncViewModel"

    invoke-static {v3, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "bluetoothManager"

    invoke-static {v4, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "otaProcessExecutor"

    move-object/from16 v13, p5

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "updateInfoRepository"

    move-object/from16 v13, p6

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "deviceRepository"

    move-object/from16 v13, p7

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "deviceManager"

    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "selectDate"

    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "selectedDateProvider"

    invoke-static {v7, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "rxBus"

    invoke-static {v8, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "parentFragmentManager"

    invoke-static {v9, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "appContext"

    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "metricsRepository"

    move-object/from16 v13, p14

    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "dashboardToastConfigViewModel"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v12, 0x0

    const/4 v13, 0x3

    .line 69
    invoke-direct {p0, v12, v12, v13, v12}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 54
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    .line 55
    iput-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->watchSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;

    .line 56
    iput-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->syncViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;

    .line 57
    iput-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->bluetoothManager:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

    .line 61
    iput-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    .line 62
    iput-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->selectDate:Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;

    .line 63
    iput-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->selectedDateProvider:Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;

    .line 64
    iput-object v8, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    .line 66
    iput-object v10, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->appContext:Landroid/content/Context;

    .line 68
    iput-object v11, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->dashboardToastConfigViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;

    .line 71
    invoke-virtual/range {p11 .. p11}, Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;->getEvents()Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$g0uK9KcjDE-jKhQhPPmkldNyBKw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$g0uK9KcjDE-jKhQhPPmkldNyBKw;

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$C-le_a1dZAuCIJ-zcXdfg5dGGXw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$C-le_a1dZAuCIJ-zcXdfg5dGGXw;

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    const-string v2, "rxBus.events.filter { it is MainTabReselected }.map { Unit }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->scrollToTopEvent:Lio/reactivex/Observable;

    .line 72
    invoke-virtual/range {p11 .. p11}, Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;->getEvents()Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$fd7YiHstIYlkD_gYkGrA7qyPLs0;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$fd7YiHstIYlkD_gYkGrA7qyPLs0;

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v1

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->realtimeWidgetTapEvent:Lio/reactivex/Observable;

    .line 74
    new-instance v1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {v1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->syncDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 75
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->parentFragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    .line 77
    new-instance v1, Landroidx/databinding/ObservableField;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->isSwipeRefreshing:Landroidx/databinding/ObservableField;

    .line 78
    new-instance v1, Landroidx/databinding/ObservableField;

    invoke-direct {v1, v2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->isSyncBlocked:Landroidx/databinding/ObservableField;

    .line 79
    new-instance v1, Landroidx/databinding/ObservableField;

    invoke-direct {v1, v2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->syncInProgress:Landroidx/databinding/ObservableField;

    .line 80
    new-instance v1, Landroidx/databinding/ObservableField;

    invoke-direct {v1, v2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->toastMessageDisplayed:Landroidx/databinding/ObservableField;

    .line 81
    new-instance v1, Landroidx/databinding/ObservableField;

    const-string v3, ""

    invoke-direct {v1, v3}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->toastMessageFieldText:Landroidx/databinding/ObservableField;

    .line 82
    new-instance v1, Landroidx/databinding/ObservableField;

    const v4, 0x7f0f00f2

    invoke-virtual {v10, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->backButtonFieldText:Landroidx/databinding/ObservableField;

    .line 83
    new-instance v1, Landroidx/databinding/ObservableField;

    invoke-direct {v1, v3}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->toastActionButtonFieldText:Landroidx/databinding/ObservableField;

    .line 84
    new-instance v1, Landroidx/databinding/ObservableField;

    invoke-direct {v1, v2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->pullToSyncDisplayed:Landroidx/databinding/ObservableField;

    .line 86
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->mainHandler:Landroid/os/Handler;

    .line 87
    new-instance v1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {v1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->connectionDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 89
    new-instance v1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {v1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->dataDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 93
    invoke-interface/range {p8 .. p8}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;->init()V

    .line 303
    new-instance v1, Ljava/util/Timer;

    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->timer:Ljava/util/Timer;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 17

    move/from16 v0, p16

    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_0

    .line 69
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;

    move-object v1, v0

    move-object/from16 v2, p4

    move-object/from16 v3, p7

    move-object/from16 v4, p2

    move-object/from16 v5, p6

    move-object/from16 v6, p5

    move-object/from16 v7, p13

    move-object/from16 v8, p14

    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V

    move-object/from16 v16, v0

    goto :goto_0

    :cond_0
    move-object/from16 v16, p15

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    .line 54
    invoke-direct/range {v1 .. v16}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;)V

    return-void
.end method

.method public static final synthetic access$getMainHandler$p(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;)Landroid/os/Handler;
    .locals 0

    .line 54
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->mainHandler:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic access$getTimerValue$p(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;)I
    .locals 0

    .line 54
    iget p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->timerValue:I

    return p0
.end method

.method public static final synthetic access$setTimerValue$p(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;I)V
    .locals 0

    .line 54
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->timerValue:I

    return-void
.end method

.method public static synthetic lambda$1KLaSiXD8ancBDBcGIJKdIma92U(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->onConnectivityOn$lambda-15(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    return-void
.end method

.method public static synthetic lambda$3IJOOLhPBZ2UJtlc67AJ5FMrgGU(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->prepare$lambda-20(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$5EohLT5i7yRMzTs0gr_FLFj3tmE(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/lang/Boolean;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->prepare$lambda-18(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/lang/Boolean;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$7GLnQcvYxJ7fiHyRdwKfmgtauxk(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->onCreateView$lambda-11(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;)V

    return-void
.end method

.method public static synthetic lambda$B-4YTza6SPU7Lj2HxmGi6LXywpI(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->onCreateView$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$C-le_a1dZAuCIJ-zcXdfg5dGGXw(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->scrollToTopEvent$lambda-1(Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$N4ZO93qUXDzICP-4qG85ZPdhxTc(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->onCreateView$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$SFBYgVI4U69iEg7K8dXW0QByN6k(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->onCreateView$lambda-7(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;)V

    return-void
.end method

.method public static synthetic lambda$TR2-v3mqkXSDaRjYc-CuAps-QYU(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->onCreateView$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;)V

    return-void
.end method

.method public static synthetic lambda$VGPFeBYIaF0j870ezmberaO0OQM(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->onCreateView$lambda-9(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;)V

    return-void
.end method

.method public static synthetic lambda$Ykc5MfQJTb0Af4lUN4tEyMSGeNU(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->onCreateView$lambda-8(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$ZMLNOTCpmIv3MbxpucCsuq4p4F4(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Landroid/content/Context;Lio/reactivex/Notification;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->onCreateView$lambda-10(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Landroid/content/Context;Lio/reactivex/Notification;)V

    return-void
.end method

.method public static synthetic lambda$aI1kphLQtIT0G-0ppp-RWU-4vtw(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->prepare$lambda-17(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$bPb-Jop865-5aAlLMZF3BE3Djnk(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->onConnectivityOff$lambda-16(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    return-void
.end method

.method public static synthetic lambda$dFYUvGqZNrm7AF66a1e89wT5PwA(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->onCreateView$lambda-6$lambda-5(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;)V

    return-void
.end method

.method public static synthetic lambda$fd7YiHstIYlkD_gYkGrA7qyPLs0(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->realtimeWidgetTapEvent$lambda-2(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$g0uK9KcjDE-jKhQhPPmkldNyBKw(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->scrollToTopEvent$lambda-0(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$uVXtR6y3vvZboY0_PFcuZM6WRXM(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->prepare$lambda-19(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState;)V

    return-void
.end method

.method public static synthetic lambda$v_ckqOJwxX6koOUO7d6pGTsI3e4(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->onToastMessageClicked$lambda-13(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;)V

    return-void
.end method

.method public static synthetic lambda$w4vRvk1ru3V6SDtWTk8aOoX_i1c(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->onConnectivitySearching$lambda-14(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    return-void
.end method

.method public static synthetic lambda$znz-rzBYYnd21u4-tRDRRv6cx2I(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->onCreateView$lambda-12(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final onConnectivityOff$lambda-16(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x7f0c0007

    .line 351
    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonIcon(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;I)V

    :goto_0
    return-void
.end method

.method private static final onConnectivityOn$lambda-15(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x7f0c0008

    .line 345
    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonIcon(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;I)V

    :goto_0
    return-void
.end method

.method private static final onConnectivitySearching$lambda-14(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x7f0c0009

    .line 338
    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonIcon(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;I)V

    :goto_0
    return-void
.end method

.method private static final onCreateView$lambda-10(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Landroid/content/Context;Lio/reactivex/Notification;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    invoke-virtual {p2}, Lio/reactivex/Notification;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;

    .line 176
    instance-of v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 185
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    if-eqz v1, :cond_6

    .line 177
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->syncViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;->getSyncProgressText()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->appContext:Landroid/content/Context;

    const v5, 0x7f0f01b0

    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 179
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AGPS - Sync progress: datainfo - "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", progress: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;->getProgress()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 180
    invoke-virtual {p2}, Lio/reactivex/Notification;->isOnComplete()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p2}, Lio/reactivex/Notification;->isOnError()Z

    move-result p1

    if-nez p1, :cond_1

    .line 181
    invoke-virtual {p2}, Lio/reactivex/Notification;->isOnNext()Z

    move-result p1

    if-eqz p1, :cond_e

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;->getError()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_e

    .line 182
    :cond_1
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;->isAGPSNeeded()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;->getError()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;->getError()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$DeviceNotConnected;

    if-eqz p1, :cond_3

    .line 183
    :cond_2
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->onSyncFinished()V

    .line 185
    :cond_3
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->syncViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;->getSyncProgressField()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p1, v4}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 187
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;->getError()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_e

    .line 188
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;->getError()Ljava/lang/Throwable;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "Sync error!"

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    const-class p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;

    invoke-static {p0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p0

    .line 189
    invoke-interface {p0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;->getError()Ljava/lang/Throwable;

    move-result-object p1

    const-string p2, "No message provided."

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    move-object p2, p1

    :goto_1
    invoke-static {p0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_6

    .line 195
    :cond_6
    instance-of p2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;

    const-string v1, ", completed: "

    if-eqz p2, :cond_a

    .line 196
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AGPS Progress: started - "

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;->getStarted()Z

    move-result v5

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;->getCompleted()Z

    move-result v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 197
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->getSyncInProgress()Landroidx/databinding/ObservableField;

    move-result-object p2

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;->getStarted()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;->getCompleted()Z

    move-result v1

    if-nez v1, :cond_7

    const/4 v1, 0x1

    goto :goto_2

    :cond_7
    const/4 v1, 0x0

    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 198
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->isSyncBlocked()Landroidx/databinding/ObservableField;

    move-result-object p2

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;->getStarted()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;->getCompleted()Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_3

    :cond_8
    const/4 v2, 0x0

    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 199
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;->getCompleted()Z

    move-result p2

    if-eqz p2, :cond_9

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->syncViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;->getSyncProgressField()Landroidx/databinding/ObservableField;

    move-result-object p2

    invoke-virtual {p2, v4}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 200
    :cond_9
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->syncViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;->getSyncProgressText()Landroidx/databinding/ObservableField;

    move-result-object p0

    const p2, 0x7f0f015e

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto/16 :goto_6

    .line 203
    :cond_a
    instance-of p2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;

    if-eqz p2, :cond_e

    .line 204
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Font update progress: started - "

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;->getStarted()Z

    move-result v5

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;->getCompleted()Z

    move-result v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 205
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->getSyncInProgress()Landroidx/databinding/ObservableField;

    move-result-object p2

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;->getStarted()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;->getCompleted()Z

    move-result v1

    if-nez v1, :cond_b

    const/4 v1, 0x1

    goto :goto_4

    :cond_b
    const/4 v1, 0x0

    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 206
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->isSyncBlocked()Landroidx/databinding/ObservableField;

    move-result-object p2

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;->getStarted()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;->getCompleted()Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_5

    :cond_c
    const/4 v2, 0x0

    :goto_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 207
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;->getCompleted()Z

    move-result p2

    if-eqz p2, :cond_d

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->syncViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;->getSyncProgressField()Landroidx/databinding/ObservableField;

    move-result-object p2

    invoke-virtual {p2, v4}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 208
    :cond_d
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->syncViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;->getSyncProgressText()Landroidx/databinding/ObservableField;

    move-result-object p0

    const p2, 0x7f0f00d6

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :cond_e
    :goto_6
    return-void
.end method

.method private static final onCreateView$lambda-11(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;)V
    .locals 0

    return-void
.end method

.method private static final onCreateView$lambda-12(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "Sync error occurred."

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final onCreateView$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Ljava/util/List;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Goals successfully retrieved from the server"

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->info$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final onCreateView$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "Error while getting goals from the server.."

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final onCreateView$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;)V
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->isSyncBlocked()Landroidx/databinding/ObservableField;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->watchSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;->getSyncInProgress()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 125
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;->getType()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;

    move-result-object v0

    .line 126
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$None;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$None;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    .line 127
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->getToastMessageDisplayed()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_0

    .line 129
    :cond_0
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$OTAInProgress;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$OTAInProgress;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    .line 130
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->isSyncBlocked()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 131
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->getToastMessageDisplayed()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_0

    .line 133
    :cond_1
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$FontUpdateInProgress;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$FontUpdateInProgress;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 134
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->syncViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;->getSyncProgressText()Landroidx/databinding/ObservableField;

    move-result-object v0

    const v1, 0x7f0f00d6

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_0

    .line 138
    :cond_2
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;->getType()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$CriticalUpdateRequired;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$CriticalUpdateRequired;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 139
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->isSyncBlocked()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 141
    :cond_3
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->getToastMessageFieldText()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 142
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->getToastMessageDisplayed()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 143
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->getToastActionButtonFieldText()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;->getButtonText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 147
    :goto_0
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;->getDurationSec()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 148
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 149
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$dFYUvGqZNrm7AF66a1e89wT5PwA;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$dFYUvGqZNrm7AF66a1e89wT5PwA;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;)V

    .line 152
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;->getDurationSec()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    int-to-long v1, p0

    const-wide/16 v3, 0x3e8

    mul-long v1, v1, v3

    .line 149
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_4
    return-void
.end method

.method private static final onCreateView$lambda-6$lambda-5(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->getToastMessageDisplayed()Landroidx/databinding/ObservableField;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 151
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->dashboardToastConfigViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->resetSyncErrorEvent()V

    return-void
.end method

.method private static final onCreateView$lambda-7(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    const-string v0, "getInstance()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->midnight(Ljava/util/Calendar;)Ljava/util/Calendar;

    move-result-object p1

    .line 162
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->selectedDateProvider:Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;->getSelectedDate()Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->isSameDay(Ljava/util/Calendar;Ljava/util/Calendar;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 163
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->selectDate:Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;->setDate(Ljava/util/Calendar;)V

    :cond_0
    return-void
.end method

.method private static final onCreateView$lambda-8(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "Sync tracker error received"

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final onCreateView$lambda-9(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->syncViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;->getSyncProgressField()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;->getProgress()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private final onSyncFinished()V
    .locals 2

    .line 219
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->syncInProgress:Landroidx/databinding/ObservableField;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 220
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->isSyncBlocked:Landroidx/databinding/ObservableField;

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private final onSyncStarted()V
    .locals 3

    .line 225
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->syncViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;->getSyncProgressText()Landroidx/databinding/ObservableField;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->appContext:Landroid/content/Context;

    const v2, 0x7f0f01b0

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 226
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->syncInProgress:Landroidx/databinding/ObservableField;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 227
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->isSyncBlocked:Landroidx/databinding/ObservableField;

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final onToastMessageClicked$lambda-13(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;)V
    .locals 10

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 258
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;->getType()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType;

    move-result-object v0

    .line 259
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$BluetoothDisabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$BluetoothDisabled;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 260
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->bluetoothManager:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;->enable()V

    goto :goto_0

    .line 262
    :cond_0
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$CriticalUpdateRequired;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastType$CriticalUpdateRequired;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 263
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;->getUpdateInfo()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;

    move-result-object v0

    .line 264
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageConfig;->getDevice()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    move-result-object p1

    .line 265
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdateAvailableData;

    .line 266
    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;->getReleaseVersion()Ljava/lang/String;

    move-result-object v3

    .line 267
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;->getReleaseNotes()Ljava/lang/String;

    move-result-object v5

    .line 268
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;->getDownloadUrl()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getPid()I

    move-result v7

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;->getReleaseDate()Ljava/lang/String;

    move-result-object v8

    move-object v2, v9

    .line 266
    invoke-direct/range {v2 .. v8}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 269
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getFirmwareVersion()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 265
    invoke-direct {v1, v9, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdateAvailableData;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;Z)V

    .line 271
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->parentFragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Landroidx/fragment/app/FragmentManager;

    if-nez v2, :cond_1

    goto :goto_0

    .line 272
    :cond_1
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment$Companion;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdateAvailableData;->getVersion()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    move-result-object p1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdateAvailableData;->getDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;

    move-result-object v0

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdateAvailableData;->getUpdateAvailable()Z

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;Z)Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Landroidx/fragment/app/Fragment;

    const v4, 0x7f0800db

    const/4 v5, 0x0

    .line 273
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    move-object v6, p0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    const/4 v7, 0x4

    const/4 v8, 0x0

    .line 271
    invoke-static/range {v2 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private static final prepare$lambda-17(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 375
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private static final prepare$lambda-18(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/lang/Boolean;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState;
    .locals 1

    const-string v0, "deviceInfo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 378
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isConnected()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 379
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$ConnectivityOn;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$ConnectivityOn;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState;

    goto :goto_0

    .line 381
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 382
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$ConnectivitySearch;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$ConnectivitySearch;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState;

    goto :goto_0

    .line 383
    :cond_1
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$ConnectivityOff;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$ConnectivityOff;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState;

    :goto_0
    return-object p0
.end method

.method private static final prepare$lambda-19(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 390
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$ConnectivityOn;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$ConnectivityOn;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->onConnectivityOn(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    goto :goto_0

    .line 391
    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$ConnectivityOff;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$ConnectivityOff;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->onConnectivityOff(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    goto :goto_0

    .line 392
    :cond_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$ConnectivitySearch;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/ToolbarChangeState$ConnectivitySearch;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->onConnectivitySearching(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private static final prepare$lambda-20(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private static final realtimeWidgetTapEvent$lambda-2(Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    instance-of p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/RealTimeWidgetTap;

    return p0
.end method

.method private static final scrollToTopEvent$lambda-0(Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    instance-of p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/MainTabReselected;

    return p0
.end method

.method private static final scrollToTopEvent$lambda-1(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final startSync()V
    .locals 10

    .line 281
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->onSyncStarted()V

    .line 282
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->watchSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;

    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x17

    const/4 v8, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;-><init>(ZLjava/util/concurrent/TimeUnit;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;->startSync(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;)V

    return-void
.end method

.method private final stopAnimation()V
    .locals 2

    .line 327
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->timerValue:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "timer_issue: stopping - "

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 328
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->timer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 329
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->timer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->purge()I

    .line 330
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->timer:Ljava/util/Timer;

    const/4 v0, 0x0

    .line 331
    iput v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->timerValue:I

    .line 332
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "timer_issue: stop done"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void
.end method

.method private final triggerAnimation(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
    .locals 6

    .line 307
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->timer:Ljava/util/Timer;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel$triggerAnimation$1;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel$triggerAnimation$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    check-cast v1, Ljava/util/TimerTask;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x1f4

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method


# virtual methods
.method public final getBackButtonFieldText()Landroidx/databinding/ObservableField;
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
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->backButtonFieldText:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 54
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final getPullToSyncDisplayed()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 84
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->pullToSyncDisplayed:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getRealtimeWidgetTapEvent()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 72
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->realtimeWidgetTapEvent:Lio/reactivex/Observable;

    return-object v0
.end method

.method public final getScrollToTopEvent()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 71
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->scrollToTopEvent:Lio/reactivex/Observable;

    return-object v0
.end method

.method public final getSyncInProgress()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 79
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->syncInProgress:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getToastActionButtonFieldText()Landroidx/databinding/ObservableField;
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
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->toastActionButtonFieldText:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getToastMessageDisplayed()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 80
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->toastMessageDisplayed:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getToastMessageFieldText()Landroidx/databinding/ObservableField;
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
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->toastMessageFieldText:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final isSwipeRefreshing()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 77
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->isSwipeRefreshing:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final isSyncBlocked()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 78
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->isSyncBlocked:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final onBackButtonClicked()V
    .locals 8

    .line 232
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->parentFragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_0

    goto :goto_0

    .line 233
    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f0800db

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final onConnectivityOff(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
    .locals 2

    .line 349
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "timer_issue: off"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 350
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->stopAnimation()V

    .line 351
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->mainHandler:Landroid/os/Handler;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$bPb-Jop865-5aAlLMZF3BE3Djnk;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$bPb-Jop865-5aAlLMZF3BE3Djnk;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onConnectivityOn(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
    .locals 2

    .line 343
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "timer_issue: on"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 344
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->stopAnimation()V

    .line 345
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->mainHandler:Landroid/os/Handler;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$1KLaSiXD8ancBDBcGIJKdIma92U;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$1KLaSiXD8ancBDBcGIJKdIma92U;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onConnectivitySearching(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
    .locals 2

    .line 336
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "timer_issue: searching"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 337
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->stopAnimation()V

    .line 338
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->mainHandler:Landroid/os/Handler;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$w4vRvk1ru3V6SDtWTk8aOoX_i1c;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$w4vRvk1ru3V6SDtWTk8aOoX_i1c;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 339
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->triggerAnimation(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    return-void
.end method

.method public onCreateView(Landroid/content/Context;)V
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->onCreateView(Landroid/content/Context;)V

    .line 114
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->dataDisposable:Lio/reactivex/disposables/CompositeDisposable;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository$DefaultImpls;->all$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    .line 115
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$B-4YTza6SPU7Lj2HxmGi6LXywpI;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$B-4YTza6SPU7Lj2HxmGi6LXywpI;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;)V

    .line 117
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$N4ZO93qUXDzICP-4qG85ZPdhxTc;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$N4ZO93qUXDzICP-4qG85ZPdhxTc;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;)V

    .line 115
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 114
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 119
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->pullToSyncDisplayed:Landroidx/databinding/ObservableField;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;->Companion:Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;

    invoke-virtual {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;->getPullDownShown(Landroid/content/Context;)Z

    move-result v1

    xor-int/2addr v1, v4

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 120
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->syncInProgress:Landroidx/databinding/ObservableField;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->watchSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;->getSyncInProgress()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 121
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->syncDisposable:Lio/reactivex/disposables/CompositeDisposable;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->dashboardToastConfigViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->getCurrentConfig()Lio/reactivex/Observable;

    move-result-object v1

    .line 122
    invoke-virtual {v1}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v1

    .line 123
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$TR2-v3mqkXSDaRjYc-CuAps-QYU;

    invoke-direct {v2, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$TR2-v3mqkXSDaRjYc-CuAps-QYU;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 121
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 156
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->syncDisposable:Lio/reactivex/disposables/CompositeDisposable;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->watchSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;->formattedDataOutput()Lio/reactivex/Observable;

    move-result-object v1

    .line 158
    invoke-virtual {v1}, Lio/reactivex/Observable;->repeat()Lio/reactivex/Observable;

    move-result-object v1

    .line 159
    invoke-virtual {v1}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object v1

    .line 160
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$SFBYgVI4U69iEg7K8dXW0QByN6k;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$SFBYgVI4U69iEg7K8dXW0QByN6k;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;)V

    .line 165
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$Ykc5MfQJTb0Af4lUN4tEyMSGeNU;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$Ykc5MfQJTb0Af4lUN4tEyMSGeNU;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;)V

    .line 160
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 156
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 169
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->syncDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 170
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->watchSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;->gpsTransferOutput()Lio/reactivex/Observable;

    move-result-object v1

    .line 171
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$VGPFeBYIaF0j870ezmberaO0OQM;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$VGPFeBYIaF0j870ezmberaO0OQM;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v1

    .line 174
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$ZMLNOTCpmIv3MbxpucCsuq4p4F4;

    invoke-direct {v2, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$ZMLNOTCpmIv3MbxpucCsuq4p4F4;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->doOnEach(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$7GLnQcvYxJ7fiHyRdwKfmgtauxk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$7GLnQcvYxJ7fiHyRdwKfmgtauxk;

    .line 213
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$znz-rzBYYnd21u4-tRDRRv6cx2I;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$znz-rzBYYnd21u4-tRDRRv6cx2I;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;)V

    invoke-virtual {p1, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 169
    invoke-virtual {v0, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public onDestroyView(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 287
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->onDestroyView(Landroid/content/Context;)V

    .line 288
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->syncDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {p1}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    .line 289
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->dataDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {p1}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    .line 290
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->connectionDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {p1}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    .line 291
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->stopAnimation()V

    return-void
.end method

.method public final onRefresh()V
    .locals 5

    .line 241
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->pullToSyncDisplayed:Landroidx/databinding/ObservableField;

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    .line 243
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x1

    .line 245
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    if-nez v0, :cond_0

    .line 241
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->toastMessageDisplayed:Landroidx/databinding/ObservableField;

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 242
    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;->Companion:Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;

    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->appContext:Landroid/content/Context;

    invoke-virtual {v0, v2, v4}, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;->setPullDownShown(ZLandroid/content/Context;)V

    .line 243
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->pullToSyncDisplayed:Landroidx/databinding/ObservableField;

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 245
    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->syncInProgress:Landroidx/databinding/ObservableField;

    invoke-virtual {v0, v3}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 246
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->isSwipeRefreshing:Landroidx/databinding/ObservableField;

    invoke-virtual {v0, v3}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 247
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->isSwipeRefreshing:Landroidx/databinding/ObservableField;

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 248
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->startSync()V

    return-void
.end method

.method public final onRightButtonClicked()V
    .locals 0

    return-void
.end method

.method public final onToastMessageClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 254
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->dashboardToastConfigViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/DashboardToastMessageViewModel;->getCurrentConfig()Lio/reactivex/Observable;

    move-result-object p1

    .line 255
    invoke-virtual {p1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object p1

    .line 256
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$v_ckqOJwxX6koOUO7d6pGTsI3e4;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$v_ckqOJwxX6koOUO7d6pGTsI3e4;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Single;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    return-void
.end method

.method public final prepare(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 358
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->toolbar:Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    .line 360
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    invoke-interface {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;->defaultDevice()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    .line 361
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->bluetoothManager:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

    invoke-interface {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;->isEnabled()Z

    .line 371
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->connectionDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 372
    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager$DefaultImpls;->connect$default(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v3

    new-instance v15, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    const-string v7, ""

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v11, ""

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0xee

    const/16 v17, 0x0

    move-object v6, v15

    move-object v5, v15

    move/from16 v15, v16

    move-object/from16 v16, v17

    invoke-direct/range {v6 .. v16}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;-><init>(Ljava/lang/String;Ljava/lang/Short;SILjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;Ljava/util/List;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v5}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v3

    check-cast v3, Lio/reactivex/ObservableSource;

    .line 373
    iget-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->bluetoothManager:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

    const/4 v6, 0x2

    new-array v6, v6, [Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    .line 374
    sget-object v7, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    aput-object v7, v6, v4

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    const/4 v7, 0x1

    aput-object v4, v6, v7

    invoke-interface {v5, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;->getChangeState([Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Lio/reactivex/Observable;

    move-result-object v4

    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$aI1kphLQtIT0G-0ppp-RWU-4vtw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$aI1kphLQtIT0G-0ppp-RWU-4vtw;

    .line 375
    invoke-virtual {v4, v5}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v4

    .line 376
    iget-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->bluetoothManager:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

    invoke-interface {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;->isEnabled()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v4, v5}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v4

    check-cast v4, Lio/reactivex/ObservableSource;

    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$5EohLT5i7yRMzTs0gr_FLFj3tmE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$5EohLT5i7yRMzTs0gr_FLFj3tmE;

    .line 371
    invoke-static {v3, v4, v5}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object v3

    .line 386
    invoke-virtual {v3}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v3

    .line 387
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object v3

    .line 388
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$uVXtR6y3vvZboY0_PFcuZM6WRXM;

    invoke-direct {v4, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$uVXtR6y3vvZboY0_PFcuZM6WRXM;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$3IJOOLhPBZ2UJtlc67AJ5FMrgGU;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/-$$Lambda$MainDashboardViewModel$3IJOOLhPBZ2UJtlc67AJ5FMrgGU;

    invoke-virtual {v3, v4, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 371
    invoke-virtual {v2, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public final resetDateToToday()V
    .locals 2

    .line 297
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const-string v1, "getInstance()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->midnight(Ljava/util/Calendar;)Ljava/util/Calendar;

    move-result-object v0

    .line 298
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->selectedDateProvider:Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;->getSelectedDate()Ljava/util/Calendar;

    move-result-object v1

    invoke-static {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->isSameDay(Ljava/util/Calendar;Ljava/util/Calendar;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 299
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->selectDate:Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;

    invoke-interface {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;->setDate(Ljava/util/Calendar;)V

    :cond_0
    return-void
.end method
