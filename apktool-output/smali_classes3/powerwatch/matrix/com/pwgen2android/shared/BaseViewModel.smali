.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "BaseViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\t\u0008&\u0018\u00002\u00020\u0001B\u001d\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0008\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u001a\u0010\u0007\u001a\u00020\u0008X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "context",
        "Landroid/content/Context;",
        "rxBus",
        "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;",
        "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V",
        "compositeDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "getCompositeDisposable",
        "()Lio/reactivex/disposables/CompositeDisposable;",
        "setCompositeDisposable",
        "(Lio/reactivex/disposables/CompositeDisposable;)V",
        "onCleared",
        "",
        "onCreateView",
        "onDataReload",
        "onDestroy",
        "onDestroyView",
        "onPause",
        "onResume",
        "onStart",
        "onStop",
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
.field private compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V
    .locals 2

    .line 7
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 9
    new-instance v0, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {v0}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    if-nez p2, :cond_0

    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;->getEvents()Lio/reactivex/Observable;

    move-result-object p2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/-$$Lambda$BaseViewModel$B9Tlj-foB6P30O35d8AQkexmpeg;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/-$$Lambda$BaseViewModel$B9Tlj-foB6P30O35d8AQkexmpeg;

    invoke-virtual {p2, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p2

    .line 15
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/-$$Lambda$BaseViewModel$UHupsAak2vWw8m1s4ZQiChPE7WM;

    invoke-direct {v1, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/-$$Lambda$BaseViewModel$UHupsAak2vWw8m1s4ZQiChPE7WM;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;)V

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/-$$Lambda$BaseViewModel$yltwQNoz2Oa2pA6OsB0lE58tN5w;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/-$$Lambda$BaseViewModel$yltwQNoz2Oa2pA6OsB0lE58tN5w;

    invoke-virtual {p2, v1, p1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 14
    invoke-virtual {v0, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V

    return-void
.end method

.method public static synthetic lambda$B9Tlj-foB6P30O35d8AQkexmpeg(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->lambda-3$lambda-0(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$UHupsAak2vWw8m1s4ZQiChPE7WM(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->lambda-3$lambda-1(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic lambda$yltwQNoz2Oa2pA6OsB0lE58tN5w(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->lambda-3$lambda-2(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final lambda-3$lambda-0(Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    instance-of p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/DataReloadEvent;

    return p0
.end method

.method private static final lambda-3$lambda-1(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;Ljava/lang/Object;)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    .line 17
    invoke-virtual {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->onDataReload(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method private static final lambda-3$lambda-2(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method


# virtual methods
.method protected final getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;
    .locals 1

    .line 9
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    return-object v0
.end method

.method protected onCleared()V
    .locals 1

    .line 27
    invoke-super {p0}, Landroidx/lifecycle/ViewModel;->onCleared()V

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method

.method public onCreateView(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onDataReload(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onDestroy(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onDestroyView(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onPause(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onResume(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onStart(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onStop(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected final setCompositeDisposable(Lio/reactivex/disposables/CompositeDisposable;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    return-void
.end method
