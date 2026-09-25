.class public final Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
.source "Gen1PairingViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGen1PairingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Gen1PairingViewModel.kt\npowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n1547#2:109\n1618#2,3:110\n*S KotlinDebug\n*F\n+ 1 Gen1PairingViewModel.kt\npowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel\n*L\n56#1:109\n56#1:110,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!J\u0008\u0010\"\u001a\u00020\u001bH\u0002J\u0008\u0010#\u001a\u00020\u001bH\u0002J\n\u0010$\u001a\u00020\u001b*\u00020%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0010\u0012\u000c\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0011\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 \u000e*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00120\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0010R\u001c\u0010\u0015\u001a\u0010\u0012\u000c\u0012\n \u000e*\u0004\u0018\u00010\t0\t0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "bluetoothManager",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;",
        "activity",
        "Landroid/app/Activity;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V",
        "bluetoothWarnDisplayed",
        "Landroidx/databinding/ObservableField;",
        "",
        "kotlin.jvm.PlatformType",
        "getBluetoothWarnDisplayed",
        "()Landroidx/databinding/ObservableField;",
        "foundDevices",
        "",
        "",
        "getFoundDevices",
        "fragmentManagerWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "scanningDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "scanningInProgress",
        "onBackClicked",
        "",
        "onDestroyView",
        "context",
        "Landroid/content/Context;",
        "onDeviceChosen",
        "position",
        "",
        "startScan",
        "stopScan",
        "onBluetoothEnableClicked",
        "Landroid/view/View;",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel$Companion;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final bluetoothManager:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

.field private final bluetoothWarnDisplayed:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field private final foundDevices:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
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

.field private final scanningDisposable:Lio/reactivex/disposables/CompositeDisposable;

.field private scanningInProgress:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel$Companion;

    .line 105
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V
    .locals 1

    const-string v0, "communicator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "fragmentManager"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    const/4 v0, 0x3

    .line 23
    invoke-direct {p0, p3, p3, v0, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 21
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->bluetoothManager:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

    .line 25
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->scanningDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 27
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    .line 29
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p3

    invoke-direct {p1, p3}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->foundDevices:Landroidx/databinding/ObservableField;

    .line 30
    new-instance p1, Landroidx/databinding/ObservableField;

    const/4 p3, 0x0

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    invoke-direct {p1, p4}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->bluetoothWarnDisplayed:Landroidx/databinding/ObservableField;

    .line 34
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    const/4 p4, 0x2

    new-array p4, p4, [Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    .line 35
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    aput-object v0, p4, p3

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    const/4 v0, 0x1

    aput-object p3, p4, v0

    invoke-interface {p2, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;->getChangeState([Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Lio/reactivex/Observable;

    move-result-object p2

    .line 36
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$Gen1PairingViewModel$QD-O9oGI4rwgl-vm4CWWPe-ITgw;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$Gen1PairingViewModel$QD-O9oGI4rwgl-vm4CWWPe-ITgw;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;)V

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p2

    .line 34
    invoke-virtual {p1, p2}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method private static final _init_$lambda-0(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    .line 38
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->getBluetoothWarnDisplayed()Landroidx/databinding/ObservableField;

    move-result-object v0

    xor-int/lit8 v1, p1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    .line 40
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->startScan()V

    goto :goto_0

    .line 42
    :cond_0
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->stopScan()V

    :goto_0
    return-void
.end method

.method public static synthetic lambda$GbfvpoZWG9dgRb_kGGhNg6HSeDo(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->startScan$lambda-3(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$L8souVxAxvRIyWvgvuH1KRD5W_M(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->startScan$lambda-2(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method

.method public static synthetic lambda$QD-O9oGI4rwgl-vm4CWWPe-ITgw(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->_init_$lambda-0(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)V

    return-void
.end method

.method private final startScan()V
    .locals 5

    .line 48
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->scanningInProgress:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 49
    iput-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->scanningInProgress:Z

    .line 51
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->scanningDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 52
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->foundDevicesChange()Lio/reactivex/Observable;

    move-result-object v2

    .line 53
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object v2

    .line 54
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$Gen1PairingViewModel$L8souVxAxvRIyWvgvuH1KRD5W_M;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$Gen1PairingViewModel$L8souVxAxvRIyWvgvuH1KRD5W_M;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;)V

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$Gen1PairingViewModel$GbfvpoZWG9dgRb_kGGhNg6HSeDo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$Gen1PairingViewModel$GbfvpoZWG9dgRb_kGGhNg6HSeDo;

    invoke-virtual {v2, v3, v4}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v2

    .line 51
    invoke-virtual {v1, v2}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 62
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator$DefaultImpls;->startScanning$default(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Ljava/util/List;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private static final startScan$lambda-2(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Received device "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".. Connected: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isConnected()Z

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "WatchModel"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->getFoundDevices()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->foundDevices()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 109
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 110
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 111
    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    .line 57
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 112
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 56
    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final startScan$lambda-3(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private final stopScan()V
    .locals 1

    .line 67
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->scanningInProgress:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 68
    iput-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->scanningInProgress:Z

    .line 69
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->stopScanning()V

    .line 70
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->scanningDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final getBluetoothWarnDisplayed()Landroidx/databinding/ObservableField;
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
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->bluetoothWarnDisplayed:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getFoundDevices()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->foundDevices:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final onBackClicked()V
    .locals 1

    .line 94
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

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

.method public final onBluetoothEnableClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->bluetoothManager:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;->enable()V

    return-void
.end method

.method public onDestroyView(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->onDestroyView(Landroid/content/Context;)V

    .line 99
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->stopScan()V

    return-void
.end method

.method public final onDeviceChosen(I)V
    .locals 8

    .line 76
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->foundDevices()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p1, :cond_1

    .line 77
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->stopScanning()V

    const/4 v0, 0x0

    .line 78
    iput-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->scanningInProgress:Z

    .line 79
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->foundDevices()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    .line 80
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->releaseScanningResources()V

    .line 81
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment$Companion;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f0801aa

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void

    .line 83
    :cond_1
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->TAG:Ljava/lang/String;

    const-string v0, "Error, chosen device doesn\'t exist.."

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Device does not exist after choosing from scanning list!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
