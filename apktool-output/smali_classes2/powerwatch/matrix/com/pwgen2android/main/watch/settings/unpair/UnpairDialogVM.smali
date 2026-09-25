.class public final Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;
.super Landroidx/lifecycle/ViewModel;
.source "UnpairDialogVM.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u0006\u0010\u001c\u001a\u00020\u0015J\u0006\u0010\u001d\u001a\u00020\u0015J\u0008\u0010\u001e\u001a\u00020\u001fH\u0002J\n\u0010 \u001a\u00020\u0015*\u00020!J\n\u0010\"\u001a\u00020\u0015*\u00020!J\n\u0010#\u001a\u00020\u0015*\u00020!R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u000b0\u000b0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u0012\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;",
        "Landroidx/lifecycle/ViewModel;",
        "watchSettingsExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;",
        "deviceRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "updateInfoRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;",
        "deviceManager",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;",
        "context",
        "Landroid/app/Activity;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Landroid/app/Activity;)V",
        "compositeDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "contextWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "dialogClose",
        "Lkotlin/Function1;",
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairAction;",
        "",
        "getDialogClose",
        "()Lkotlin/jvm/functions/Function1;",
        "setDialogClose",
        "(Lkotlin/jvm/functions/Function1;)V",
        "pairedDevice",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        "onCreateView",
        "onDestroyView",
        "unPairDevice",
        "Lio/reactivex/Completable;",
        "onCancelClicked",
        "Landroid/view/View;",
        "onUnpairAndResetClicked",
        "onUnpairClicked",
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
.field private final compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final contextWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private final deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

.field private final deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

.field private dialogClose:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairAction;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

.field private final updateInfoRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;

.field private final watchSettingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Landroid/app/Activity;)V
    .locals 1

    const-string v0, "watchSettingsExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateInfoRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 26
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->watchSettingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    .line 27
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    .line 28
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->updateInfoRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;

    .line 29
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    .line 31
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->contextWeakReference:Ljava/lang/ref/WeakReference;

    .line 33
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    return-void
.end method

.method public static synthetic lambda$CXUS7qlmfOpx4VnELYGbSuH-9mo()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->onUnpairAndResetClicked$lambda-6()V

    return-void
.end method

.method public static synthetic lambda$IJPcS0_OGAwW1_h_GHG7c6DiQuc(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V

    return-void
.end method

.method public static synthetic lambda$NFRn3AbCxMRz86lgKHTc0z-XS6Y(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->onUnpairClicked$lambda-4(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$RoCeK_GStMcFlF8j0oAZco3Oka8(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->onUnpairAndResetClicked$lambda-7(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$Uf2siSp7RdifcYZOJPlv0gC6eXM()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->onUnpairClicked$lambda-3()V

    return-void
.end method

.method public static synthetic lambda$UqC6cBX8OfLrA04qg24Hvo0b8RI(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->onCreateView$lambda-1(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$w7a4aoOtV9irhR2YFK3wF8WPITw(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->onUnpairClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$zTdyumK73b1RjiOXWMGPemtTmss(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->onUnpairAndResetClicked$lambda-5(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    return-void
.end method

.method private static final onCreateView$lambda-1(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private static final onUnpairAndResetClicked$lambda-5(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;Ljava/lang/Throwable;)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;->destroy()V

    .line 74
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/Activity;

    if-nez p0, :cond_0

    goto :goto_0

    .line 75
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_0
    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    const/4 v0, 0x0

    .line 76
    invoke-static {p0, v0, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->goToPairingActivity$default(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;ILjava/lang/Object;)V

    :goto_1
    return-void
.end method

.method private static final onUnpairAndResetClicked$lambda-6()V
    .locals 0

    return-void
.end method

.method private static final onUnpairAndResetClicked$lambda-7(Ljava/lang/Throwable;)V
    .locals 0

    .line 79
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final onUnpairClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;Ljava/lang/Throwable;)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;->destroy()V

    .line 61
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/Activity;

    if-nez p0, :cond_0

    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_0
    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    const/4 v0, 0x0

    .line 63
    invoke-static {p0, v0, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->goToPairingActivity$default(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;ILjava/lang/Object;)V

    :goto_1
    return-void
.end method

.method private static final onUnpairClicked$lambda-3()V
    .locals 0

    return-void
.end method

.method private static final onUnpairClicked$lambda-4(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private final unPairDevice()Lio/reactivex/Completable;
    .locals 2

    .line 53
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->pairedDevice:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;->delete(Ljava/lang/Object;)Lio/reactivex/Completable;

    move-result-object v0

    .line 54
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->updateInfoRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;->delete()Lio/reactivex/Completable;

    move-result-object v1

    check-cast v1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "deviceRepository.delete(pairedDevice!!)\n                .andThen(updateInfoRepository.delete())"

    .line 53
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final getDialogClose()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairAction;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->dialogClose:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final onCancelClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->dialogClose:Lkotlin/jvm/functions/Function1;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairAction$None;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairAction$None;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public final onCreateView()V
    .locals 5

    .line 38
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 39
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-static {v1, v2, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository$DefaultImpls;->load$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;ZZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    .line 40
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/-$$Lambda$UnpairDialogVM$IJPcS0_OGAwW1_h_GHG7c6DiQuc;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/-$$Lambda$UnpairDialogVM$IJPcS0_OGAwW1_h_GHG7c6DiQuc;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;)V

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/-$$Lambda$UnpairDialogVM$UqC6cBX8OfLrA04qg24Hvo0b8RI;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/-$$Lambda$UnpairDialogVM$UqC6cBX8OfLrA04qg24Hvo0b8RI;

    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public final onDestroyView()V
    .locals 1

    .line 50
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method

.method public final onUnpairAndResetClicked(Landroid/view/View;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->watchSettingsExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/ResetMode$FactoryReset;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/ResetMode$FactoryReset;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/ResetMode;

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;->resetWatch(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/ResetMode;)Lio/reactivex/Completable;

    move-result-object v0

    .line 70
    invoke-virtual {v0}, Lio/reactivex/Completable;->onErrorComplete()Lio/reactivex/Completable;

    move-result-object v0

    .line 71
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->unPairDevice()Lio/reactivex/Completable;

    move-result-object v1

    check-cast v1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    .line 72
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/-$$Lambda$UnpairDialogVM$zTdyumK73b1RjiOXWMGPemtTmss;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/-$$Lambda$UnpairDialogVM$zTdyumK73b1RjiOXWMGPemtTmss;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->doOnEvent(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/-$$Lambda$UnpairDialogVM$CXUS7qlmfOpx4VnELYGbSuH-9mo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/-$$Lambda$UnpairDialogVM$CXUS7qlmfOpx4VnELYGbSuH-9mo;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/-$$Lambda$UnpairDialogVM$RoCeK_GStMcFlF8j0oAZco3Oka8;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/-$$Lambda$UnpairDialogVM$RoCeK_GStMcFlF8j0oAZco3Oka8;

    .line 78
    invoke-virtual {v0, v1, v2}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 69
    invoke-virtual {p1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public final onUnpairClicked(Landroid/view/View;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 59
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->unPairDevice()Lio/reactivex/Completable;

    move-result-object v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/-$$Lambda$UnpairDialogVM$w7a4aoOtV9irhR2YFK3wF8WPITw;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/-$$Lambda$UnpairDialogVM$w7a4aoOtV9irhR2YFK3wF8WPITw;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->doOnEvent(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/-$$Lambda$UnpairDialogVM$Uf2siSp7RdifcYZOJPlv0gC6eXM;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/-$$Lambda$UnpairDialogVM$Uf2siSp7RdifcYZOJPlv0gC6eXM;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/-$$Lambda$UnpairDialogVM$NFRn3AbCxMRz86lgKHTc0z-XS6Y;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/-$$Lambda$UnpairDialogVM$NFRn3AbCxMRz86lgKHTc0z-XS6Y;

    .line 64
    invoke-virtual {v0, v1, v2}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 58
    invoke-virtual {p1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public final setDialogClose(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairAction;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 35
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;->dialogClose:Lkotlin/jvm/functions/Function1;

    return-void
.end method
