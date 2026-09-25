.class public final Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
.source "OtaTrackViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u00030\u00030\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0016R\u0017\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0016R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0016R\u001f\u0010!\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\"0\"0\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0016R\u0017\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u0016\u00a8\u0006&"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;",
        "context",
        "Landroid/content/Context;",
        "bluetoothManager",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "otaExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;",
        "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;)V",
        "getBluetoothManager",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;",
        "getCommunicator",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "contextWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "otaChangeStatus",
        "Landroidx/databinding/ObservableField;",
        "Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhase;",
        "getOtaChangeStatus",
        "()Landroidx/databinding/ObservableField;",
        "otaCompleted",
        "",
        "getOtaCompleted",
        "otaError",
        "getOtaError",
        "getOtaExecutor",
        "()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;",
        "otaPhaseDescription",
        "",
        "getOtaPhaseDescription",
        "otaProgressField",
        "",
        "getOtaProgressField",
        "otaUiVisible",
        "getOtaUiVisible",
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
.field private final bluetoothManager:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field private final contextWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final otaChangeStatus:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhase;",
            ">;"
        }
    .end annotation
.end field

.field private final otaCompleted:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final otaError:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final otaExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;

.field private final otaPhaseDescription:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final otaProgressField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final otaUiVisible:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communicator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "otaExecutor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x3

    .line 22
    invoke-direct {p0, v0, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->bluetoothManager:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

    .line 21
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 22
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->otaExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;

    .line 24
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    .line 26
    new-instance p1, Landroidx/databinding/ObservableField;

    const/4 p2, 0x0

    .line 30
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    .line 26
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->otaProgressField:Landroidx/databinding/ObservableField;

    .line 27
    new-instance p1, Landroidx/databinding/ObservableField;

    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhase;

    sget-object p4, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$INITIAL;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$INITIAL;

    check-cast p4, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhaseStatus$NOT_STARTED;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhaseStatus$NOT_STARTED;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhaseStatus;

    invoke-direct {p2, p4, v0}, Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhase;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhaseStatus;)V

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->otaChangeStatus:Landroidx/databinding/ObservableField;

    .line 29
    new-instance p1, Landroidx/databinding/ObservableField;

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->otaCompleted:Landroidx/databinding/ObservableField;

    .line 30
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p3}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->otaError:Landroidx/databinding/ObservableField;

    .line 31
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p3}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->otaUiVisible:Landroidx/databinding/ObservableField;

    .line 33
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1}, Landroidx/databinding/ObservableField;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->otaPhaseDescription:Landroidx/databinding/ObservableField;

    return-void
.end method


# virtual methods
.method public final getBluetoothManager()Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;
    .locals 1

    .line 20
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->bluetoothManager:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

    return-object v0
.end method

.method public final getCommunicator()Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;
    .locals 1

    .line 21
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    return-object v0
.end method

.method public final getOtaChangeStatus()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhase;",
            ">;"
        }
    .end annotation

    .line 27
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->otaChangeStatus:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getOtaCompleted()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->otaCompleted:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getOtaError()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->otaError:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getOtaExecutor()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;
    .locals 1

    .line 22
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->otaExecutor:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;

    return-object v0
.end method

.method public final getOtaPhaseDescription()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->otaPhaseDescription:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getOtaProgressField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->otaProgressField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getOtaUiVisible()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 31
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->otaUiVisible:Landroidx/databinding/ObservableField;

    return-object v0
.end method
