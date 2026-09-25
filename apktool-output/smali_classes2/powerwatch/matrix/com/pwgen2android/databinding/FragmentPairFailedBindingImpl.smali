.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBinding;
.source "FragmentPairFailedBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private mViewModelOnTryAgainClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl$OnClickListenerImpl;

.field private final mboundView0:Landroid/widget/FrameLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f0800ae

    const/4 v2, 0x2

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080081

    const/4 v2, 0x3

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "bindingComponent",
            "root"
        }
    .end annotation

    .line 30
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x4

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "bindingComponent",
            "root",
            "bindings"
        }
    .end annotation

    const/4 v0, 0x3

    .line 33
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/ImageView;Landroid/widget/ImageView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;)V

    const-wide/16 v0, -0x1

    .line 132
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->mDirtyFlags:J

    const/4 p1, 0x0

    .line 38
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->mboundView0:Landroid/widget/FrameLayout;

    const/4 p3, 0x0

    .line 39
    invoke-virtual {p1, p3}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    .line 40
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->tryAgainButton:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    invoke-virtual {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;->setTag(Ljava/lang/Object;)V

    .line 41
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 43
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method protected executeBindings()V
    .locals 8

    .line 95
    monitor-enter p0

    .line 96
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    .line 97
    iput-wide v2, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->mDirtyFlags:J

    .line 98
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x0

    .line 100
    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairFailedViewModel;

    const-wide/16 v6, 0x3

    and-long/2addr v0, v6

    cmp-long v6, v0, v2

    if-eqz v6, :cond_1

    if-eqz v5, :cond_1

    .line 108
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->mViewModelOnTryAgainClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl$OnClickListenerImpl;

    if-nez v0, :cond_0

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl$OnClickListenerImpl;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->mViewModelOnTryAgainClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl$OnClickListenerImpl;

    :cond_0
    invoke-virtual {v0, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairFailedViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl$OnClickListenerImpl;

    move-result-object v4

    :cond_1
    if-eqz v6, :cond_2

    .line 115
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->tryAgainButton:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    invoke-virtual {v0, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    return-void

    :catchall_0
    move-exception v0

    .line 98
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 56
    monitor-enter p0

    .line 57
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 58
    monitor-exit p0

    return v0

    .line 60
    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public invalidateAll()V
    .locals 2

    .line 48
    monitor-enter p0

    const-wide/16 v0, 0x2

    .line 49
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->mDirtyFlags:J

    .line 50
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 50
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected onFieldChange(ILjava/lang/Object;I)Z
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "localFieldId",
            "object",
            "fieldId"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "variableId",
            "variable"
        }
    .end annotation

    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    .line 68
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairFailedViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairFailedViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairFailedViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 77
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairFailedViewModel;

    .line 78
    monitor-enter p0

    .line 79
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x1

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->mDirtyFlags:J

    .line 80
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 81
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBindingImpl;->notifyPropertyChanged(I)V

    .line 82
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairFailedBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 80
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
