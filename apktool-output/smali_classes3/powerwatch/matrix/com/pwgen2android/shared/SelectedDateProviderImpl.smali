.class public final Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProviderImpl;
.super Ljava/lang/Object;
.source "SelectedDateProvider.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0008\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0008\u0010\u0017\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0008\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\t0\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u00010\t0\t0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProviderImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/SelectDate;",
        "()V",
        "disposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "isToday",
        "",
        "selectedDate",
        "Ljava/util/Calendar;",
        "getSelectedDate",
        "()Ljava/util/Calendar;",
        "selectedDateObservable",
        "Lio/reactivex/Observable;",
        "getSelectedDateObservable",
        "()Lio/reactivex/Observable;",
        "selectedDateSubject",
        "Lio/reactivex/subjects/BehaviorSubject;",
        "kotlin.jvm.PlatformType",
        "reset",
        "",
        "setDate",
        "date",
        "update",
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
.field private final disposable:Lio/reactivex/disposables/CompositeDisposable;

.field private isToday:Z

.field private final selectedDateSubject:Lio/reactivex/subjects/BehaviorSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/BehaviorSubject<",
            "Ljava/util/Calendar;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const-string v1, "getInstance()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->midnight(Ljava/util/Calendar;)Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/subjects/BehaviorSubject;->createDefault(Ljava/lang/Object;)Lio/reactivex/subjects/BehaviorSubject;

    move-result-object v0

    const-string v1, "createDefault(Calendar.getInstance().midnight())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProviderImpl;->selectedDateSubject:Lio/reactivex/subjects/BehaviorSubject;

    .line 31
    new-instance v0, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {v0}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProviderImpl;->disposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 34
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProviderImpl;->getSelectedDateObservable()Lio/reactivex/Observable;

    move-result-object v1

    .line 35
    invoke-virtual {v1}, Lio/reactivex/Observable;->repeat()Lio/reactivex/Observable;

    move-result-object v1

    .line 36
    invoke-virtual {v1}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object v1

    .line 37
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/-$$Lambda$SelectedDateProviderImpl$3iDUFCt9yqM0bbzZGpjzBLvXTZs;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/-$$Lambda$SelectedDateProviderImpl$3iDUFCt9yqM0bbzZGpjzBLvXTZs;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProviderImpl;)V

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/-$$Lambda$SelectedDateProviderImpl$WoYIcFYRlv9YN8TQqZ9-tBdErU8;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/-$$Lambda$SelectedDateProviderImpl$WoYIcFYRlv9YN8TQqZ9-tBdErU8;

    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method private static final _init_$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProviderImpl;Ljava/util/Calendar;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 38
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const-string v1, "getInstance()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->isSameDay(Ljava/util/Calendar;Ljava/util/Calendar;)Z

    move-result p1

    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProviderImpl;->isToday:Z

    return-void
.end method

.method private static final _init_$lambda-1(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public static synthetic lambda$3iDUFCt9yqM0bbzZGpjzBLvXTZs(Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProviderImpl;Ljava/util/Calendar;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProviderImpl;->_init_$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProviderImpl;Ljava/util/Calendar;)V

    return-void
.end method

.method public static synthetic lambda$WoYIcFYRlv9YN8TQqZ9-tBdErU8(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProviderImpl;->_init_$lambda-1(Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public getSelectedDate()Ljava/util/Calendar;
    .locals 3

    .line 26
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProviderImpl;->selectedDateSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {v0}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Calendar;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    instance-of v2, v0, Ljava/util/Calendar;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/util/Calendar;

    :cond_1
    if-nez v1, :cond_2

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const-string v1, "getInstance()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->midnight(Ljava/util/Calendar;)Ljava/util/Calendar;

    move-result-object v1

    :cond_2
    return-object v1
.end method

.method public getSelectedDateObservable()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/Calendar;",
            ">;"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProviderImpl;->selectedDateSubject:Lio/reactivex/subjects/BehaviorSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public reset()V
    .locals 2

    .line 43
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const-string v1, "getInstance()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->midnight(Ljava/util/Calendar;)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProviderImpl;->setDate(Ljava/util/Calendar;)V

    return-void
.end method

.method public setDate(Ljava/util/Calendar;)V
    .locals 1

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProviderImpl;->selectedDateSubject:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public update()V
    .locals 2

    .line 47
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProviderImpl;->isToday:Z

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const-string v1, "getInstance()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProviderImpl;->getSelectedDate()Ljava/util/Calendar;

    move-result-object v1

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->isSameDay(Ljava/util/Calendar;Ljava/util/Calendar;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 48
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProviderImpl;->reset()V

    :cond_0
    return-void
.end method
