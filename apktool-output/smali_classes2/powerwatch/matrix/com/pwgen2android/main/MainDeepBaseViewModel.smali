.class public abstract Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
.source "MainDeepBaseViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\u0008&\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0008\u0010\t\u001a\u00020\nH\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;",
        "activityContext",
        "Landroid/content/Context;",
        "rxBus",
        "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;",
        "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V",
        "getActivityContext",
        "()Landroid/content/Context;",
        "onBackClicked",
        "",
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
.field private final activityContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->activityContext:Landroid/content/Context;

    .line 10
    instance-of p2, p1, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;

    if-eqz p2, :cond_0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->showTab(Z)V

    :goto_1
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V

    return-void
.end method


# virtual methods
.method protected final getActivityContext()Landroid/content/Context;
    .locals 1

    .line 7
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->activityContext:Landroid/content/Context;

    return-object v0
.end method

.method public onBackClicked()V
    .locals 2

    .line 14
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->activityContext:Landroid/content/Context;

    instance-of v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;

    if-eqz v1, :cond_0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->showTab(Z)V

    :goto_1
    return-void
.end method
