.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "BaseActivity.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DB:",
        "Landroidx/databinding/ViewDataBinding;",
        "VM:",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;",
        ">",
        "Landroidx/appcompat/app/AppCompatActivity;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008&\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u0002*\u0008\u0008\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0008\u0010\u0013\u001a\u00020\u0014H$J\u0008\u0010\u0015\u001a\u00020\u0014H%J\r\u0010\u0016\u001a\u00028\u0001H$\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00192\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0008\u0010\u001f\u001a\u00020\u0019H\u0002R\u001a\u0010\u0007\u001a\u00020\u0008X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR\u001c\u0010\r\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011\u00a8\u0006 "
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;",
        "DB",
        "Landroidx/databinding/ViewDataBinding;",
        "VM",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "preventBackPress",
        "",
        "getPreventBackPress",
        "()Z",
        "setPreventBackPress",
        "(Z)V",
        "viewDataBinding",
        "getViewDataBinding",
        "()Landroidx/databinding/ViewDataBinding;",
        "setViewDataBinding",
        "(Landroidx/databinding/ViewDataBinding;)V",
        "Landroidx/databinding/ViewDataBinding;",
        "getBindingVariable",
        "",
        "getLayoutId",
        "getViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;",
        "onConfigurationChanged",
        "",
        "newConfig",
        "Landroid/content/res/Configuration;",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "performDataBinding",
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
.field private preventBackPress:Z

.field protected viewDataBinding:Landroidx/databinding/ViewDataBinding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TDB;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private final performDataBinding()V
    .locals 3

    .line 30
    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;->getLayoutId()I

    move-result v1

    invoke-static {v0, v1}, Landroidx/databinding/DataBindingUtil;->setContentView(Landroid/app/Activity;I)Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    const-string v1, "setContentView(this, getLayoutId())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;->setViewDataBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 31
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;->getViewDataBinding()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;->getBindingVariable()I

    move-result v1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 32
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;->getViewDataBinding()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->executePendingBindings()V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method protected abstract getBindingVariable()I
.end method

.method protected abstract getLayoutId()I
.end method

.method protected final getPreventBackPress()Z
    .locals 1

    .line 16
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;->preventBackPress:Z

    return v0
.end method

.method protected final getViewDataBinding()Landroidx/databinding/ViewDataBinding;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TDB;"
        }
    .end annotation

    .line 12
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;->viewDataBinding:Landroidx/databinding/ViewDataBinding;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "viewDataBinding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method protected abstract getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TVM;"
        }
    .end annotation
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    const-string v0, "newConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 42
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;

    move-result-object p1

    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;->resetLanguage(Landroid/content/Context;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 36
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 37
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;->performDataBinding()V

    return-void
.end method

.method protected final setPreventBackPress(Z)V
    .locals 0

    .line 16
    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;->preventBackPress:Z

    return-void
.end method

.method protected final setViewDataBinding(Landroidx/databinding/ViewDataBinding;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TDB;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;->viewDataBinding:Landroidx/databinding/ViewDataBinding;

    return-void
.end method
