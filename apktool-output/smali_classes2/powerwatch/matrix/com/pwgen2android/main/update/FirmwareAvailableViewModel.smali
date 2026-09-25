.class public final Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;
.source "FirmwareAvailableViewModel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\u0008\u0010]\u001a\u00020^H\u0016J\u0010\u0010_\u001a\u00020^2\u0006\u0010`\u001a\u00020aH\u0016J\u0010\u0010b\u001a\u00020^2\u0006\u0010`\u001a\u00020aH\u0016J\u0016\u0010c\u001a\u00020^2\u0006\u0010d\u001a\u00020a2\u0006\u0010e\u001a\u00020\u0016J\n\u0010f\u001a\u00020^*\u00020gR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u001f\u0010\u0014\u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u000e0\u000e0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010 \u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u0019R\u0017\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0019R\u0017\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u0019R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\'0\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u0019R\u0017\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\u0019R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008-\u0010.\"\u0004\u0008/\u00100R\u000e\u00101\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u0010\u0019R\u0017\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u0010\u0019R\u000e\u00108\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010\u0019R\u001f\u0010?\u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u0010\u0019R\u001f\u0010A\u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u001b0\u001b0\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008B\u0010\u0019R\u000e\u0010C\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010E\u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u001b0\u001b0\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u0010\u0019R\u000e\u0010G\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010I\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008J\u0010\u0019R\u000e\u0010K\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010M\u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u001b0\u001b0\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008N\u0010\u0019R\u001f\u0010O\u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u001b0\u001b0\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008P\u0010\u0019R\u001c\u0010Q\u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010S0S0RX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010V\u001a\u00020U2\u0006\u0010T\u001a\u00020U@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008W\u0010X\"\u0004\u0008Y\u0010ZR\u000e\u0010[\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006h"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "bluetoothManager",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;",
        "deviceManager",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;",
        "networkInfoProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;",
        "deviceRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "otaProcessExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;",
        "parentFragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "activity",
        "Landroid/app/Activity;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;Landroidx/fragment/app/FragmentManager;Landroid/app/Activity;)V",
        "getDeviceRepository",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "displayPreconditionsError",
        "Landroidx/databinding/ObservableField;",
        "",
        "kotlin.jvm.PlatformType",
        "getDisplayPreconditionsError",
        "()Landroidx/databinding/ObservableField;",
        "downloadPhase",
        "",
        "firmwareVersion",
        "getFirmwareVersion",
        "fragmentManagerWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "otaFailed",
        "getOtaFailed",
        "otaFinishedSuccess",
        "getOtaFinishedSuccess",
        "otaInProgress",
        "getOtaInProgress",
        "otaProgressValue",
        "",
        "getOtaProgressValue",
        "otaStatus",
        "getOtaStatus",
        "pairedDevice",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        "getPairedDevice",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        "setPairedDevice",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V",
        "preconditionsErrorBluetoothText",
        "preconditionsErrorDeviceNotConnected",
        "preconditionsErrorNetworkText",
        "releaseInfo",
        "getReleaseInfo",
        "releaseNotes",
        "getReleaseNotes",
        "retryNowText",
        "syncNotAllowedDuringActivity",
        "syncPhase",
        "syncTimeoutError",
        "unknownSyncError",
        "updateAvailable",
        "getUpdateAvailable",
        "updateButtonEnabled",
        "getUpdateButtonEnabled",
        "updateButtonText",
        "getUpdateButtonText",
        "updateFailedDeviceNotConnectedError",
        "updateFailedNetworkError",
        "updateFailedReason",
        "getUpdateFailedReason",
        "updateFailedTransferError",
        "updateFailedUnknownError",
        "updateInfo",
        "getUpdateInfo",
        "updateNowText",
        "updatePhase",
        "updatePhaseText",
        "getUpdatePhaseText",
        "updatePreconditionsErrorText",
        "getUpdatePreconditionsErrorText",
        "updatePreconditionsObservable",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;",
        "value",
        "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;",
        "versionRelease",
        "getVersionRelease",
        "()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;",
        "setVersionRelease",
        "(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V",
        "watchBusy",
        "watchReadyToUseText",
        "onBackClicked",
        "",
        "onCreateView",
        "context",
        "Landroid/content/Context;",
        "onDestroy",
        "prepareUpdateInfo",
        "activityContext",
        "hasUpdate",
        "startUpdate",
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
.field private final deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

.field private final displayPreconditionsError:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final downloadPhase:Ljava/lang/String;

.field private final firmwareVersion:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;"
        }
    .end annotation
.end field

.field private final otaFailed:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final otaFinishedSuccess:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final otaInProgress:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final otaProcessExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;

.field private final otaProgressValue:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final otaStatus:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

.field private final preconditionsErrorBluetoothText:Ljava/lang/String;

.field private final preconditionsErrorDeviceNotConnected:Ljava/lang/String;

.field private final preconditionsErrorNetworkText:Ljava/lang/String;

.field private final releaseInfo:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final releaseNotes:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final retryNowText:Ljava/lang/String;

.field private final syncNotAllowedDuringActivity:Ljava/lang/String;

.field private final syncPhase:Ljava/lang/String;

.field private final syncTimeoutError:Ljava/lang/String;

.field private final unknownSyncError:Ljava/lang/String;

.field private final updateAvailable:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final updateButtonEnabled:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final updateButtonText:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final updateFailedDeviceNotConnectedError:Ljava/lang/String;

.field private final updateFailedNetworkError:Ljava/lang/String;

.field private final updateFailedReason:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final updateFailedTransferError:Ljava/lang/String;

.field private final updateFailedUnknownError:Ljava/lang/String;

.field private final updateInfo:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final updateNowText:Ljava/lang/String;

.field private final updatePhase:Ljava/lang/String;

.field private final updatePhaseText:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final updatePreconditionsErrorText:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final updatePreconditionsObservable:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;",
            ">;"
        }
    .end annotation
.end field

.field private versionRelease:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

.field private final watchBusy:Ljava/lang/String;

.field private final watchReadyToUseText:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;Landroidx/fragment/app/FragmentManager;Landroid/app/Activity;)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    const-string v7, "bluetoothManager"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "deviceManager"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "networkInfoProvider"

    move-object/from16 v8, p3

    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "deviceRepository"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "otaProcessExecutor"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "parentFragmentManager"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "activity"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    move-object v7, v6

    check-cast v7, Landroid/content/Context;

    const/4 v9, 0x0

    const/4 v10, 0x2

    invoke-direct {p0, v7, v9, v10, v9}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 49
    iput-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    .line 50
    iput-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->otaProcessExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;

    const v3, 0x7f0f019d

    .line 56
    invoke-virtual {v6, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "activity.getString(R.string.start_update)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updateNowText:Ljava/lang/String;

    const v4, 0x7f0f017d

    .line 57
    invoke-virtual {v6, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v7, "activity.getString(R.string.retry_update)"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->retryNowText:Ljava/lang/String;

    const v4, 0x7f0f005e

    .line 58
    invoke-virtual {v6, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v7, "activity.getString(R.string.button_done)"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->watchReadyToUseText:Ljava/lang/String;

    const v4, 0x7f0f01d8

    .line 59
    invoke-virtual {v6, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v7, "activity.getString(R.string.update_failed_reason_unknown)"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updateFailedUnknownError:Ljava/lang/String;

    const v7, 0x7f0f01d9

    .line 60
    invoke-virtual {v6, v7}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v11, "activity.getString(R.string.update_failed_transfer_error)"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updateFailedTransferError:Ljava/lang/String;

    const v7, 0x7f0f01d7

    .line 61
    invoke-virtual {v6, v7}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v11, "activity.getString(R.string.update_failed_network_error)"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updateFailedNetworkError:Ljava/lang/String;

    const v7, 0x7f0f01d6

    .line 62
    invoke-virtual {v6, v7}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v11, "activity.getString(R.string.update_failed_device_not_connected)"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updateFailedDeviceNotConnectedError:Ljava/lang/String;

    const v7, 0x7f0f0138

    .line 63
    invoke-virtual {v6, v7}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v11, "activity.getString(R.string.network_not_available_text)"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->preconditionsErrorNetworkText:Ljava/lang/String;

    const v7, 0x7f0f0058

    .line 64
    invoke-virtual {v6, v7}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v11, "activity.getString(R.string.bluetooth_disabled_message)"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->preconditionsErrorBluetoothText:Ljava/lang/String;

    const v7, 0x7f0f00a7

    .line 65
    invoke-virtual {v6, v7}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v11, "activity.getString(R.string.device_not_connected)"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->preconditionsErrorDeviceNotConnected:Ljava/lang/String;

    const v7, 0x7f0f00ae

    .line 66
    invoke-virtual {v6, v7}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v11, "activity.getString(R.string.download_firmware)"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->downloadPhase:Ljava/lang/String;

    const v7, 0x7f0f003a

    .line 67
    invoke-virtual {v6, v7}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v11, "activity.getString(R.string.applying_updates)"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updatePhase:Ljava/lang/String;

    const v7, 0x7f0f01b0

    .line 68
    invoke-virtual {v6, v7}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v11, "activity.getString(R.string.syncing_watch)"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->syncPhase:Ljava/lang/String;

    const v11, 0x7f0f01ae

    .line 69
    invoke-virtual {v6, v11}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v11

    const-string v12, "activity.getString(R.string.sync_not_allowed_message)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v11, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->syncNotAllowedDuringActivity:Ljava/lang/String;

    const v11, 0x7f0f01e4

    .line 70
    invoke-virtual {v6, v11}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v11

    const-string v12, "activity.getString(R.string.watch_busy_text)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v11, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->watchBusy:Ljava/lang/String;

    const v11, 0x7f0f01af

    .line 71
    invoke-virtual {v6, v11}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v11

    const-string v12, "activity.getString(R.string.sync_timeout)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v11, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->syncTimeoutError:Ljava/lang/String;

    const v11, 0x7f0f00a6

    .line 73
    invoke-virtual {v6, v11}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v6

    const-string v11, "activity.getString(R.string.device_communication_error)"

    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->unknownSyncError:Ljava/lang/String;

    .line 75
    new-instance v6, Landroidx/databinding/ObservableField;

    invoke-direct {v6}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->releaseInfo:Landroidx/databinding/ObservableField;

    .line 76
    new-instance v6, Landroidx/databinding/ObservableField;

    invoke-direct {v6}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->firmwareVersion:Landroidx/databinding/ObservableField;

    .line 77
    new-instance v6, Landroidx/databinding/ObservableField;

    invoke-direct {v6}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->releaseNotes:Landroidx/databinding/ObservableField;

    .line 78
    new-instance v6, Landroidx/databinding/ObservableField;

    invoke-direct {v6}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->otaStatus:Landroidx/databinding/ObservableField;

    .line 79
    new-instance v6, Landroidx/databinding/ObservableField;

    const/4 v11, 0x0

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-direct {v6, v12}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->otaInProgress:Landroidx/databinding/ObservableField;

    .line 80
    new-instance v6, Landroidx/databinding/ObservableField;

    invoke-direct {v6, v12}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->otaFinishedSuccess:Landroidx/databinding/ObservableField;

    .line 81
    new-instance v6, Landroidx/databinding/ObservableField;

    invoke-direct {v6, v12}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->otaFailed:Landroidx/databinding/ObservableField;

    .line 82
    new-instance v6, Landroidx/databinding/ObservableField;

    const/4 v13, 0x1

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    invoke-direct {v6, v14}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updateAvailable:Landroidx/databinding/ObservableField;

    .line 83
    new-instance v6, Landroidx/databinding/ObservableField;

    invoke-direct {v6}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updateInfo:Landroidx/databinding/ObservableField;

    .line 84
    new-instance v6, Landroidx/databinding/ObservableField;

    invoke-direct {v6}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->otaProgressValue:Landroidx/databinding/ObservableField;

    .line 85
    new-instance v6, Landroidx/databinding/ObservableField;

    invoke-direct {v6, v4}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updateFailedReason:Landroidx/databinding/ObservableField;

    .line 86
    new-instance v4, Landroidx/databinding/ObservableField;

    invoke-direct {v4, v14}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updateButtonEnabled:Landroidx/databinding/ObservableField;

    .line 87
    new-instance v4, Landroidx/databinding/ObservableField;

    invoke-direct {v4, v3}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updateButtonText:Landroidx/databinding/ObservableField;

    .line 88
    new-instance v3, Landroidx/databinding/ObservableField;

    invoke-direct {v3, v7}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updatePhaseText:Landroidx/databinding/ObservableField;

    .line 90
    new-instance v3, Landroidx/databinding/ObservableField;

    const-string v4, ""

    invoke-direct {v3, v4}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updatePreconditionsErrorText:Landroidx/databinding/ObservableField;

    .line 91
    new-instance v3, Landroidx/databinding/ObservableField;

    invoke-direct {v3, v12}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->displayPreconditionsError:Landroidx/databinding/ObservableField;

    new-array v3, v10, [Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    .line 95
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    aput-object v4, v3, v11

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    aput-object v4, v3, v13

    invoke-interface {v1, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;->getChangeState([Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Lio/reactivex/Observable;

    move-result-object v1

    check-cast v1, Lio/reactivex/ObservableSource;

    .line 96
    invoke-static {v2, v11, v13, v9}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager$DefaultImpls;->connect$default(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v2

    check-cast v2, Lio/reactivex/ObservableSource;

    .line 97
    invoke-interface/range {p3 .. p3}, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;->getNetworkStatusChange()Lio/reactivex/Observable;

    move-result-object v3

    check-cast v3, Lio/reactivex/ObservableSource;

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$aZjBXGZ8an7TepvqRwyhWy42tJo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$aZjBXGZ8an7TepvqRwyhWy42tJo;

    .line 94
    invoke-static {v1, v2, v3, v4}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/Function3;)Lio/reactivex/Observable;

    move-result-object v1

    .line 100
    invoke-virtual {v1, v13}, Lio/reactivex/Observable;->replay(I)Lio/reactivex/observables/ConnectableObservable;

    move-result-object v1

    .line 101
    invoke-virtual {v1}, Lio/reactivex/observables/ConnectableObservable;->autoConnect()Lio/reactivex/Observable;

    move-result-object v1

    const-string v2, "combineLatest(\n                    bluetoothManager.getChangeState(BluetoothState.Enabled, BluetoothState.Disabled),\n                    deviceManager.connect(),\n                    networkInfoProvider.networkStatusChange, Function3<BluetoothState, DeviceInfo, NetworkStatus, UpdatePreconditionsState> { bluetooth, deviceConnection, network ->\n                UpdatePreconditionsState(bluetooth == BluetoothState.Enabled, network == NetworkStatus.Connected, deviceConnection.isConnected)\n            })\n                    .replay(1)\n                    .autoConnect()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updatePreconditionsObservable:Lio/reactivex/Observable;

    .line 103
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v13, 0x3f

    const/4 v14, 0x0

    move-object v6, v1

    invoke-direct/range {v6 .. v14}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->versionRelease:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    .line 110
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static synthetic lambda$-HrQMHrz1Zwi7f7QOivF3rDWFNY(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->onCreateView$lambda-3(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$21FprlhyENUJ5kv6rkvlTmYmeBM(Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->onCreateView$lambda-8(Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$6ajYOG-tBjRzosXQGczJRwQPKJ4(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$BErXzq-elmqeoaLzbOTEkRosC40(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->onCreateView$lambda-9(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$DFn3BsWRoQY9lxuAag68OheVA0M(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->onCreateView$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V

    return-void
.end method

.method public static synthetic lambda$OWD2lr4mRBIqGqjl5QSO1Y0a_vc(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->onCreateView$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$Y8uZnDbVLV6bXxTC7FSpoDrbvbY(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->startUpdate$lambda-11(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic lambda$aZjBXGZ8an7TepvqRwyhWy42tJo(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;)Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updatePreconditionsObservable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;)Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$cq2o__pK5s5SnFyJkFvtHXhvMl4(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->onCreateView$lambda-7(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$h98AGhwByVeqWaNuQMXe35k9K_M(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V

    return-void
.end method

.method public static synthetic lambda$s7xOqfNffXCab-sqRxF2T46C_WI(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->startUpdate$lambda-12(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$w9SmCDakero0UvMFyfiXDfqmIBQ(Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->startUpdate$lambda-10(Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->setPairedDevice(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V

    return-void
.end method

.method private static final onCreateView$lambda-3(Ljava/lang/Throwable;)V
    .locals 0

    .line 135
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final onCreateView$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object p0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$INITIAL;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$INITIAL;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final onCreateView$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object v0

    .line 146
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    .line 150
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x0

    .line 148
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 147
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getOtaInProgress()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 148
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getOtaProgressValue()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p1, v4}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 149
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdateButtonText()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->watchReadyToUseText:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 150
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getOtaFinishedSuccess()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {p0, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 152
    :cond_0
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 153
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getOtaFailed()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 154
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getOtaInProgress()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 155
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getOtaProgressValue()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 156
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdateButtonText()Landroidx/databinding/ObservableField;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->retryNowText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 158
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getOtaError()Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    .line 159
    :cond_1
    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v3, "Received OTA error!"

    move-object v4, p1

    invoke-static/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 161
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$DeviceNotConnected;

    if-eqz v0, :cond_2

    .line 162
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdateFailedReason()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updateFailedDeviceNotConnectedError:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 164
    :cond_2
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$WatchBusy;

    if-eqz v0, :cond_3

    .line 165
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdateFailedReason()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->watchBusy:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 168
    :cond_3
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$ActivityInProgress;

    if-eqz v0, :cond_4

    .line 169
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdateFailedReason()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->syncNotAllowedDuringActivity:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 171
    :cond_4
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncTimeoutError;

    if-eqz v0, :cond_5

    .line 172
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdateFailedReason()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->syncTimeoutError:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 175
    :cond_5
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$Unknown;

    if-eqz v0, :cond_6

    .line 176
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdateFailedReason()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->unknownSyncError:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 179
    :cond_6
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$FileTransferInterrupted;

    if-eqz v0, :cond_7

    .line 180
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdateFailedReason()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updateFailedTransferError:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 182
    :cond_7
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$FileDownload;

    if-eqz v0, :cond_8

    .line 183
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdateFailedReason()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updateFailedNetworkError:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 185
    :cond_8
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$DeviceNotConnected;

    if-eqz v0, :cond_9

    .line 186
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdateFailedReason()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updateFailedDeviceNotConnectedError:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 188
    :cond_9
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$VersionMismatch;

    if-eqz v0, :cond_a

    goto/16 :goto_0

    .line 191
    :cond_a
    instance-of p1, p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAError$DeviceNotAppeared;

    if-eqz p1, :cond_b

    goto/16 :goto_0

    .line 195
    :cond_b
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdateFailedReason()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updateFailedUnknownError:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_0

    .line 201
    :cond_c
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getTotalProgress()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "Received OTA progress: "

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->info$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 202
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getOtaProgressValue()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getTotalProgress()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 203
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getOtaInProgress()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 204
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object p1

    .line 205
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$SYNC;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$SYNC;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 206
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdatePhaseText()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->syncPhase:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_0

    .line 208
    :cond_d
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_STARTED;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_STARTED;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 209
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdatePhaseText()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->downloadPhase:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_0

    .line 211
    :cond_e
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_FINISHED;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_FINISHED;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_f

    .line 212
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdatePhaseText()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->downloadPhase:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_0

    .line 215
    :cond_f
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdatePhaseText()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updatePhase:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private static final onCreateView$lambda-7(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v0, "OTA output subscriber received error and died!"

    invoke-static {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->wtfError(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final onCreateView$lambda-8(Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lkotlin/Pair;
    .locals 1

    const-string v0, "preconditions"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "otaState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final onCreateView$lambda-9(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;Lkotlin/Pair;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->getDeviceConnection()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->getNetwork()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->getBluetooth()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 230
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 231
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdateButtonEnabled()Landroidx/databinding/ObservableField;

    move-result-object p0

    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private static final startUpdate$lambda-10(Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->getBluetooth()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError$BluetoothNotEnabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError$BluetoothNotEnabled;

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 249
    :cond_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->getNetwork()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError$NetworkNotConnected;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError$NetworkNotConnected;

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 250
    :cond_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;->getDeviceConnection()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError$DeviceNotConnected;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError$DeviceNotConnected;

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 251
    :cond_2
    invoke-static {p0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final startUpdate$lambda-11(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 8

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 256
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getOtaInProgress()Landroidx/databinding/ObservableField;

    move-result-object p2

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 257
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->otaProcessExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getVersionRelease()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;->getDownloadUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getVersionRelease()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    move-result-object v3

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v4, p1

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor$DefaultImpls;->startOTA$default(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void
.end method

.method private static final startUpdate$lambda-12(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;Ljava/lang/Throwable;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdateButtonEnabled()Landroidx/databinding/ObservableField;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 261
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError;

    const/4 v1, 0x1

    .line 263
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v0, :cond_0

    .line 261
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError$BluetoothNotEnabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError$BluetoothNotEnabled;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 262
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdatePreconditionsErrorText()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->preconditionsErrorBluetoothText:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 263
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getDisplayPreconditionsError()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    .line 265
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError$DeviceNotConnected;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError$DeviceNotConnected;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 266
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdatePreconditionsErrorText()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->preconditionsErrorDeviceNotConnected:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 267
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getDisplayPreconditionsError()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    .line 269
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError$NetworkNotConnected;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError$NetworkNotConnected;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 270
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdatePreconditionsErrorText()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->preconditionsErrorNetworkText:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 271
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getDisplayPreconditionsError()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private static final updatePreconditionsObservable$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;)Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;
    .locals 2

    const-string v0, "bluetooth"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "network"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Connected;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Connected;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isConnected()Z

    move-result p1

    invoke-direct {v0, p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;-><init>(ZZZ)V

    return-object v0
.end method


# virtual methods
.method public final getDeviceRepository()Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;
    .locals 1

    .line 49
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    return-object v0
.end method

.method public final getDisplayPreconditionsError()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 91
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->displayPreconditionsError:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getFirmwareVersion()Landroidx/databinding/ObservableField;
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
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->firmwareVersion:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 45
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final getOtaFailed()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 81
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->otaFailed:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getOtaFinishedSuccess()Landroidx/databinding/ObservableField;
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
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->otaFinishedSuccess:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getOtaInProgress()Landroidx/databinding/ObservableField;
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
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->otaInProgress:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getOtaProgressValue()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 84
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->otaProgressValue:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getOtaStatus()Landroidx/databinding/ObservableField;
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
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->otaStatus:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getPairedDevice()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;
    .locals 1

    .line 112
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    return-object v0
.end method

.method public final getReleaseInfo()Landroidx/databinding/ObservableField;
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
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->releaseInfo:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getReleaseNotes()Landroidx/databinding/ObservableField;
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
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->releaseNotes:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getUpdateAvailable()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updateAvailable:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getUpdateButtonEnabled()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updateButtonEnabled:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getUpdateButtonText()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 87
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updateButtonText:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getUpdateFailedReason()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 85
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updateFailedReason:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getUpdateInfo()Landroidx/databinding/ObservableField;
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
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updateInfo:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getUpdatePhaseText()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 88
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updatePhaseText:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getUpdatePreconditionsErrorText()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 90
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updatePreconditionsErrorText:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getVersionRelease()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;
    .locals 1

    .line 103
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->versionRelease:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    return-object v0
.end method

.method public onBackClicked()V
    .locals 1

    .line 115
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onBackClicked()V

    .line 116
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->popBackStackImmediate()Z

    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onCreateView(Landroid/content/Context;)V

    .line 130
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;->defaultDevice()Lio/reactivex/Single;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$6ajYOG-tBjRzosXQGczJRwQPKJ4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$6ajYOG-tBjRzosXQGczJRwQPKJ4;

    .line 131
    invoke-virtual {v0, v1}, Lio/reactivex/Single;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Maybe;

    move-result-object v0

    .line 132
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$h98AGhwByVeqWaNuQMXe35k9K_M;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$h98AGhwByVeqWaNuQMXe35k9K_M;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;)V

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$-HrQMHrz1Zwi7f7QOivF3rDWFNY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$-HrQMHrz1Zwi7f7QOivF3rDWFNY;

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Maybe;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 130
    invoke-virtual {p1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 138
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->otaProcessExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;->otaOutput()Lio/reactivex/Observable;

    move-result-object v0

    .line 139
    invoke-virtual {v0}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object v0

    .line 140
    invoke-virtual {v0}, Lio/reactivex/Observable;->repeat()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$OWD2lr4mRBIqGqjl5QSO1Y0a_vc;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$OWD2lr4mRBIqGqjl5QSO1Y0a_vc;

    .line 142
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    .line 143
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object v0

    .line 144
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$DFn3BsWRoQY9lxuAag68OheVA0M;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$DFn3BsWRoQY9lxuAag68OheVA0M;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;)V

    .line 220
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$cq2o__pK5s5SnFyJkFvtHXhvMl4;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$cq2o__pK5s5SnFyJkFvtHXhvMl4;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;)V

    .line 144
    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 138
    invoke-virtual {p1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 224
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updatePreconditionsObservable:Lio/reactivex/Observable;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->otaProcessExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;->otaOutput()Lio/reactivex/Observable;

    move-result-object v1

    check-cast v1, Lio/reactivex/ObservableSource;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$21FprlhyENUJ5kv6rkvlTmYmeBM;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$21FprlhyENUJ5kv6rkvlTmYmeBM;

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->withLatestFrom(Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object v0

    .line 227
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$BErXzq-elmqeoaLzbOTEkRosC40;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$BErXzq-elmqeoaLzbOTEkRosC40;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 224
    invoke-virtual {p1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public onDestroy(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onDestroy(Landroid/content/Context;)V

    .line 123
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->otaInProgress:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    .line 124
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->otaProcessExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;->resetExecutorState()V

    :cond_0
    return-void
.end method

.method public final prepareUpdateInfo(Landroid/content/Context;Z)V
    .locals 6

    const-string v0, "activityContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 284
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->versionRelease:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;->getReleaseDate()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move-object v0, v2

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-static {v3, v4, v2, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toZonedCalendar$default(JLjava/util/TimeZone;ILjava/lang/Object;)Ljava/util/Calendar;

    move-result-object v0

    :goto_0
    const-string v3, "java.lang.String.format(format, *args)"

    const/4 v4, 0x0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const-string v5, "en"

    invoke-static {v0, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->monthDayYearFormatText(Ljava/util/Calendar;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 285
    :cond_2
    sget-object v2, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    const v2, 0x7f0f0175

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v5, "activityContext.getString(R.string.released_time)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v5, v1, [Ljava/lang/Object;

    aput-object v0, v5, v4

    invoke-static {v5, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 287
    :goto_1
    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    const v0, 0x7f0f00fe

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "activityContext.getString(R.string.installed_version)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v0, v1, [Ljava/lang/Object;

    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->versionRelease:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;->getInstalledVersion()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v0, v4

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_3

    if-eqz v2, :cond_3

    .line 288
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 289
    :cond_3
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->releaseInfo:Landroidx/databinding/ObservableField;

    invoke-virtual {p2, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final setPairedDevice(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    return-void
.end method

.method public final setVersionRelease(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->versionRelease:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    .line 106
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->firmwareVersion:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 107
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->releaseNotes:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;->getReleaseNotes()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final startUpdate(Landroid/view/View;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 238
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->otaFinishedSuccess:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 239
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->onBackClicked()V

    return-void

    .line 242
    :cond_0
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->otaFailed:Landroidx/databinding/ObservableField;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 243
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_2

    .line 246
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->updatePreconditionsObservable:Lio/reactivex/Observable;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$w9SmCDakero0UvMFyfiXDfqmIBQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$w9SmCDakero0UvMFyfiXDfqmIBQ;

    .line 247
    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    .line 253
    invoke-virtual {v1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object v1

    .line 254
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Single;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Single;

    move-result-object v1

    .line 255
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$Y8uZnDbVLV6bXxTC7FSpoDrbvbY;

    invoke-direct {v2, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$Y8uZnDbVLV6bXxTC7FSpoDrbvbY;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;Ljava/lang/String;)V

    .line 258
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$s7xOqfNffXCab-sqRxF2T46C_WI;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/update/-$$Lambda$FirmwareAvailableViewModel$s7xOqfNffXCab-sqRxF2T46C_WI;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;)V

    .line 255
    invoke-virtual {v1, v2, p1}, Lio/reactivex/Single;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 246
    invoke-virtual {v0, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    :cond_2
    return-void
.end method
