.class public final Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "QRPairingFragment.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentScanBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQRPairingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QRPairingFragment.kt\npowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,176:1\n54#2,3:177\n*S KotlinDebug\n*F\n+ 1 QRPairingFragment.kt\npowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment\n*L\n50#1:177,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\u0017\u001a\u00020\u0018H\u0002J\u0008\u0010\u0019\u001a\u00020\u001aH\u0014J\u0008\u0010\u001b\u001a\u00020\u0003H\u0014J\u0008\u0010\u001c\u001a\u00020\u001aH\u0014J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0008\u0010!\u001a\u0004\u0018\u00010\"2\u0008\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0008\u0010%\u001a\u00020\u0018H\u0016J\u0012\u0010&\u001a\u00020\u00182\u0008\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0008\u0010)\u001a\u00020\u0018H\u0016J\u0008\u0010*\u001a\u00020\u0018H\u0003J\u0008\u0010+\u001a\u00020\u0018H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006-"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentScanBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;",
        "()V",
        "cPreview",
        "Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;",
        "cameraStopThread",
        "Ljava/lang/Thread;",
        "circleOverlayView",
        "Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;",
        "mCameraSource",
        "Lcom/google/android/gms/vision/CameraSource;",
        "rxPermissions",
        "Lcom/tbruyelle/rxpermissions2/RxPermissions;",
        "scanFinished",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "scanViewModel",
        "getScanViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;",
        "scanViewModel$delegate",
        "Lkotlin/Lazy;",
        "createCameraSource",
        "",
        "getBindingVariable",
        "",
        "getViewModel",
        "layoutRes",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onPause",
        "onResult",
        "barcode",
        "Lcom/google/android/gms/vision/barcode/Barcode;",
        "onResume",
        "requestCameraPermission",
        "startCameraSource",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment$Companion;


# instance fields
.field private cPreview:Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;

.field private cameraStopThread:Ljava/lang/Thread;

.field private circleOverlayView:Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;

.field private mCameraSource:Lcom/google/android/gms/vision/CameraSource;

.field private rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

.field private final scanFinished:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final scanViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 50
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 39
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 47
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->scanFinished:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 50
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment$scanViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment$scanViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 177
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 179
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 50
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->scanViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final createCameraSource()V
    .locals 4

    .line 100
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$QRPairingFragment$zoWSyczAmLjf3p1E497mTT_tly8;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$QRPairingFragment$zoWSyczAmLjf3p1E497mTT_tly8;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->cameraStopThread:Ljava/lang/Thread;

    .line 105
    new-instance v0, Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    :goto_0
    invoke-direct {v0, v1}, Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;->build()Lcom/google/android/gms/vision/barcode/BarcodeDetector;

    move-result-object v0

    .line 106
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/pair/camera/BarcodeTrackerFactory;

    move-object v3, p0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;

    invoke-direct {v1, v3}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/BarcodeTrackerFactory;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;)V

    .line 108
    new-instance v3, Lcom/google/android/gms/vision/MultiProcessor$Builder;

    check-cast v1, Lcom/google/android/gms/vision/MultiProcessor$Factory;

    invoke-direct {v3, v1}, Lcom/google/android/gms/vision/MultiProcessor$Builder;-><init>(Lcom/google/android/gms/vision/MultiProcessor$Factory;)V

    invoke-virtual {v3}, Lcom/google/android/gms/vision/MultiProcessor$Builder;->build()Lcom/google/android/gms/vision/MultiProcessor;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/vision/Detector$Processor;

    .line 107
    invoke-virtual {v0, v1}, Lcom/google/android/gms/vision/barcode/BarcodeDetector;->setProcessor(Lcom/google/android/gms/vision/Detector$Processor;)V

    .line 110
    new-instance v1, Lcom/google/android/gms/vision/CameraSource$Builder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->getContext()Landroid/content/Context;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    :goto_1
    check-cast v0, Lcom/google/android/gms/vision/Detector;

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/vision/CameraSource$Builder;-><init>(Landroid/content/Context;Lcom/google/android/gms/vision/Detector;)V

    const/4 v0, 0x0

    .line 111
    invoke-virtual {v1, v0}, Lcom/google/android/gms/vision/CameraSource$Builder;->setFacing(I)Lcom/google/android/gms/vision/CameraSource$Builder;

    move-result-object v0

    const/4 v1, 0x1

    .line 112
    invoke-virtual {v0, v1}, Lcom/google/android/gms/vision/CameraSource$Builder;->setAutoFocusEnabled(Z)Lcom/google/android/gms/vision/CameraSource$Builder;

    move-result-object v0

    const/high16 v1, 0x41700000    # 15.0f

    .line 113
    invoke-virtual {v0, v1}, Lcom/google/android/gms/vision/CameraSource$Builder;->setRequestedFps(F)Lcom/google/android/gms/vision/CameraSource$Builder;

    move-result-object v0

    .line 114
    invoke-virtual {v0}, Lcom/google/android/gms/vision/CameraSource$Builder;->build()Lcom/google/android/gms/vision/CameraSource;

    move-result-object v0

    .line 110
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->mCameraSource:Lcom/google/android/gms/vision/CameraSource;

    return-void
.end method

.method private static final createCameraSource$lambda-3(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->cPreview:Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->stop()V

    .line 102
    :goto_0
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->cPreview:Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;

    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->release()V

    :goto_1
    return-void
.end method

.method private final getScanViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;
    .locals 1

    .line 50
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->scanViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;

    return-object v0
.end method

.method public static synthetic lambda$DzTVneI3fXuN56lSyFk9z1xcxYg(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$rpx5Kumz4CXIURmFlKs0KlsKdVs(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->requestCameraPermission$lambda-2(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$vXpGPXE08EL4yCfWvMZ9qvCC31k(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->requestCameraPermission$lambda-1(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic lambda$zoWSyczAmLjf3p1E497mTT_tly8(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->createCameraSource$lambda-3(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;)V

    return-void
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;

    move-result-object v0

    return-object v0
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->getScanViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;->onBackClicked()V

    return-void
.end method

.method private final requestCameraPermission()V
    .locals 3

    .line 89
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

    if-eqz v0, :cond_0

    const-string v1, "android.permission.CAMERA"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tbruyelle/rxpermissions2/RxPermissions;->request([Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object v0

    .line 90
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$QRPairingFragment$vXpGPXE08EL4yCfWvMZ9qvCC31k;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$QRPairingFragment$vXpGPXE08EL4yCfWvMZ9qvCC31k;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;)V

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$QRPairingFragment$rpx5Kumz4CXIURmFlKs0KlsKdVs;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$QRPairingFragment$rpx5Kumz4CXIURmFlKs0KlsKdVs;

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    return-void

    :cond_0
    const-string v0, "rxPermissions"

    .line 89
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private static final requestCameraPermission$lambda-1(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 91
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 92
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->createCameraSource()V

    :cond_0
    return-void
.end method

.method private static final requestCameraPermission$lambda-2(Ljava/lang/Throwable;)V
    .locals 0

    .line 95
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private final startCameraSource()V
    .locals 3

    .line 151
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->mCameraSource:Lcom/google/android/gms/vision/CameraSource;

    if-eqz v0, :cond_2

    .line 153
    :try_start_0
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->cPreview:Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->start(Lcom/google/android/gms/vision/CameraSource;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 155
    check-cast v0, Ljava/lang/Throwable;

    const-string v1, "error_camera"

    const-string v2, "Unable to start camera source."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 156
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->mCameraSource:Lcom/google/android/gms/vision/CameraSource;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/vision/CameraSource;->release()V

    :goto_0
    const/4 v0, 0x0

    .line 157
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->mCameraSource:Lcom/google/android/gms/vision/CameraSource;

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method protected getBindingVariable()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;
    .locals 1

    .line 57
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->getScanViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 39
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0074

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const p2, 0x7f0801e5

    .line 66
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const p3, 0x7f0f0182

    .line 68
    invoke-virtual {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    check-cast p3, Ljava/lang/CharSequence;

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    if-nez p2, :cond_1

    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v0, 0x7f050023

    invoke-static {p3, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_1
    const p2, 0x7f08015d

    .line 70
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;

    const-string p3, "loginToolbar"

    .line 72
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->removeBackground(Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;)V

    const p3, 0x7f080081

    .line 73
    invoke-virtual {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$QRPairingFragment$DzTVneI3fXuN56lSyFk9z1xcxYg;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$QRPairingFragment$DzTVneI3fXuN56lSyFk9z1xcxYg;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;)V

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 77
    new-instance p2, Lcom/tbruyelle/rxpermissions2/RxPermissions;

    move-object p3, p0

    check-cast p3, Landroidx/fragment/app/Fragment;

    invoke-direct {p2, p3}, Lcom/tbruyelle/rxpermissions2/RxPermissions;-><init>(Landroidx/fragment/app/Fragment;)V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

    const p2, 0x7f0800a7

    .line 78
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->cPreview:Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;

    const p2, 0x7f0800bd

    .line 79
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->circleOverlayView:Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;

    .line 80
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

    if-eqz p2, :cond_3

    const-string p3, "android.permission.CAMERA"

    invoke-virtual {p2, p3}, Lcom/tbruyelle/rxpermissions2/RxPermissions;->isRevoked(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 81
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->createCameraSource()V

    :cond_2
    return-object p1

    :cond_3
    const-string p1, "rxPermissions"

    .line 80
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onPause()V
    .locals 1

    .line 167
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onPause()V

    .line 168
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->cPreview:Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->stop()V

    :goto_0
    return-void
.end method

.method public onResult(Lcom/google/android/gms/vision/barcode/Barcode;)V
    .locals 7

    .line 121
    new-instance v0, Landroid/graphics/RectF;

    const/4 v1, 0x0

    if-nez p1, :cond_0

    :goto_0
    move-object v2, v1

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/vision/barcode/Barcode;->getBoundingBox()Landroid/graphics/Rect;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget v2, v2, Landroid/graphics/Rect;->left:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_1
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-float v2, v2

    .line 122
    invoke-virtual {p1}, Lcom/google/android/gms/vision/barcode/Barcode;->getBoundingBox()Landroid/graphics/Rect;

    move-result-object v3

    iget v3, v3, Landroid/graphics/Rect;->top:I

    int-to-float v3, v3

    .line 123
    invoke-virtual {p1}, Lcom/google/android/gms/vision/barcode/Barcode;->getBoundingBox()Landroid/graphics/Rect;

    move-result-object v4

    iget v4, v4, Landroid/graphics/Rect;->right:I

    int-to-float v4, v4

    .line 124
    invoke-virtual {p1}, Lcom/google/android/gms/vision/barcode/Barcode;->getBoundingBox()Landroid/graphics/Rect;

    move-result-object v5

    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    int-to-float v5, v5

    .line 121
    invoke-direct {v0, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 126
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->cPreview:Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;

    if-nez v2, :cond_2

    move-object v2, v1

    goto :goto_2

    :cond_2
    iget v3, v0, Landroid/graphics/RectF;->top:F

    invoke-virtual {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->translateY(F)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    :goto_2
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    iput v2, v0, Landroid/graphics/RectF;->top:F

    .line 127
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->cPreview:Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;

    if-nez v2, :cond_3

    move-object v2, v1

    goto :goto_3

    :cond_3
    iget v3, v0, Landroid/graphics/RectF;->left:F

    invoke-virtual {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->translateX(F)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    :goto_3
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    iput v2, v0, Landroid/graphics/RectF;->left:F

    .line 128
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->cPreview:Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;

    if-nez v2, :cond_4

    move-object v2, v1

    goto :goto_4

    :cond_4
    iget v3, v0, Landroid/graphics/RectF;->right:F

    invoke-virtual {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->translateX(F)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    :goto_4
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    iput v2, v0, Landroid/graphics/RectF;->right:F

    .line 129
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->cPreview:Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;

    if-nez v2, :cond_5

    move-object v2, v1

    goto :goto_5

    :cond_5
    iget v3, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->translateY(F)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    :goto_5
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    iput v2, v0, Landroid/graphics/RectF;->bottom:F

    .line 131
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->circleOverlayView:Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;

    if-nez v2, :cond_6

    move-object v0, v1

    goto :goto_6

    :cond_6
    new-instance v3, Landroid/graphics/Rect;

    iget v4, v0, Landroid/graphics/RectF;->left:F

    float-to-int v4, v4

    iget v5, v0, Landroid/graphics/RectF;->top:F

    float-to-int v5, v5

    iget v6, v0, Landroid/graphics/RectF;->right:F

    float-to-int v6, v6

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    float-to-int v0, v0

    invoke-direct {v3, v4, v5, v6, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->shouldDecode(Landroid/graphics/Rect;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_6
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 132
    iget-object v0, p1, Lcom/google/android/gms/vision/barcode/Barcode;->rawValue:Ljava/lang/String;

    const-string v2, "rect_issue"

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->scanFinished:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_8

    .line 134
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->cameraStopThread:Ljava/lang/Thread;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 135
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->getScanViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;

    move-result-object v0

    iget-object p1, p1, Lcom/google/android/gms/vision/barcode/Barcode;->rawValue:Ljava/lang/String;

    const-string v1, "barcode.rawValue"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;->onQRCodeResolved(Ljava/lang/String;)V

    goto :goto_7

    :cond_7
    const-string p1, "cameraStopThread"

    .line 134
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1

    :cond_8
    :goto_7
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 144
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onResume()V

    .line 145
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->scanFinished:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 146
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->startCameraSource()V

    return-void
.end method
