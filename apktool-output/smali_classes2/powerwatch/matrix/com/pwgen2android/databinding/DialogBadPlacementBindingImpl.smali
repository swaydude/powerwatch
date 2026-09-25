.class public Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBinding;
.source "DialogBadPlacementBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private mViewModelOnCancelClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl$OnClickListenerImpl;

.field private final mboundView0:Landroid/widget/LinearLayout;

.field private final mboundView1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;


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

    .line 30
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x2

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

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

    .line 33
    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    const-wide/16 v1, -0x1

    .line 130
    iput-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->mDirtyFlags:J

    .line 35
    aget-object p1, p3, v0

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    .line 36
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 37
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->mboundView1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 38
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    .line 39
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 41
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method protected executeBindings()V
    .locals 8

    .line 93
    monitor-enter p0

    .line 94
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    .line 95
    iput-wide v2, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->mDirtyFlags:J

    .line 96
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x0

    .line 98
    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialogVM;

    const-wide/16 v6, 0x3

    and-long/2addr v0, v6

    cmp-long v6, v0, v2

    if-eqz v6, :cond_1

    if-eqz v5, :cond_1

    .line 106
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->mViewModelOnCancelClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl$OnClickListenerImpl;

    if-nez v0, :cond_0

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl$OnClickListenerImpl;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->mViewModelOnCancelClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl$OnClickListenerImpl;

    :cond_0
    invoke-virtual {v0, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialogVM;)Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl$OnClickListenerImpl;

    move-result-object v4

    :cond_1
    if-eqz v6, :cond_2

    .line 113
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->mboundView1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v0, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    return-void

    :catchall_0
    move-exception v0

    .line 96
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 54
    monitor-enter p0

    .line 55
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 56
    monitor-exit p0

    return v0

    .line 58
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

    .line 46
    monitor-enter p0

    const-wide/16 v0, 0x2

    .line 47
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->mDirtyFlags:J

    .line 48
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 48
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

    .line 66
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialogVM;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialogVM;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialogVM;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 75
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialogVM;

    .line 76
    monitor-enter p0

    .line 77
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x1

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->mDirtyFlags:J

    .line 78
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 79
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBindingImpl;->notifyPropertyChanged(I)V

    .line 80
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/DialogBadPlacementBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 78
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
