.class public final Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModelImpl;
.super Ljava/lang/Object;
.source "LoginFlowBaseViewModel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u000b\u001a\u00020\u0007H\u0016R\"\u0010\u0005\u001a\u0010\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00070\u00070\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModelImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;",
        "networkInfoProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;)V",
        "displayNetworkError",
        "Landroidx/databinding/ObservableField;",
        "",
        "kotlin.jvm.PlatformType",
        "getDisplayNetworkError",
        "()Landroidx/databinding/ObservableField;",
        "checkAndDisplayNetworkError",
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
.field private final displayNetworkError:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final networkInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;)V
    .locals 1

    const-string v0, "networkInfoProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModelImpl;->networkInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;

    .line 15
    new-instance p1, Landroidx/databinding/ObservableField;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p1, v0}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModelImpl;->displayNetworkError:Landroidx/databinding/ObservableField;

    return-void
.end method


# virtual methods
.method public checkAndDisplayNetworkError()Z
    .locals 3

    .line 18
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModelImpl;->networkInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 21
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModelImpl;->getDisplayNetworkError()Landroidx/databinding/ObservableField;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 22
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModelImpl;->getDisplayNetworkError()Landroidx/databinding/ObservableField;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :cond_0
    return v0
.end method

.method public getDisplayNetworkError()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 15
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModelImpl;->displayNetworkError:Landroidx/databinding/ObservableField;

    return-object v0
.end method
