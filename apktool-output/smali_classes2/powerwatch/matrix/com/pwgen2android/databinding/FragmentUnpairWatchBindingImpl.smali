.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBinding;
.source "FragmentUnpairWatchBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl2;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl1;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private mViewModelOnCancelClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl2;

.field private mViewModelOnUnpairAndResetClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl;

.field private mViewModelOnUnpairClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl1;

.field private final mboundView0:Landroid/widget/LinearLayout;

.field private final mboundView1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;


# direct methods
.method static constructor <clinit>()V
    .locals 0

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

    .line 36
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x4

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 3
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

    const/4 v0, 0x0

    .line 39
    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    const-wide/16 v1, -0x1

    .line 170
    iput-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mDirtyFlags:J

    .line 41
    aget-object p1, p3, v0

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    .line 42
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 43
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mboundView1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 44
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 45
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 46
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 47
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 48
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    .line 49
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 51
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method protected executeBindings()V
    .locals 8

    .line 103
    monitor-enter p0

    .line 104
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    .line 105
    iput-wide v2, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mDirtyFlags:J

    .line 106
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;

    const-wide/16 v5, 0x3

    and-long/2addr v0, v5

    const/4 v5, 0x0

    cmp-long v6, v0, v2

    if-eqz v6, :cond_3

    if-eqz v4, :cond_3

    .line 118
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mViewModelOnUnpairAndResetClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl;

    if-nez v0, :cond_0

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mViewModelOnUnpairAndResetClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl;

    :cond_0
    invoke-virtual {v0, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl;

    move-result-object v5

    .line 120
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mViewModelOnUnpairClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl1;

    if-nez v0, :cond_1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl1;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl1;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mViewModelOnUnpairClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl1;

    :cond_1
    invoke-virtual {v0, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl1;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl1;

    move-result-object v0

    .line 122
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mViewModelOnCancelClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl2;

    if-nez v1, :cond_2

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl2;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl2;-><init>()V

    iput-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mViewModelOnCancelClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl2;

    :cond_2
    invoke-virtual {v1, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl2;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl$OnClickListenerImpl2;

    move-result-object v1

    move-object v7, v5

    move-object v5, v0

    move-object v0, v7

    goto :goto_0

    :cond_3
    move-object v0, v5

    move-object v1, v0

    :goto_0
    if-eqz v6, :cond_4

    .line 129
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mboundView1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v2, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 130
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 131
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    return-void

    :catchall_0
    move-exception v0

    .line 106
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 64
    monitor-enter p0

    .line 65
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 66
    monitor-exit p0

    return v0

    .line 68
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

    .line 56
    monitor-enter p0

    const-wide/16 v0, 0x2

    .line 57
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mDirtyFlags:J

    .line 58
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 58
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

    .line 76
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 85
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;

    .line 86
    monitor-enter p0

    .line 87
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x1

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->mDirtyFlags:J

    .line 88
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 89
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBindingImpl;->notifyPropertyChanged(I)V

    .line 90
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUnpairWatchBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 88
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
