.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBinding;
.source "FragmentSyncBindingImpl.java"


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private final mboundView0:Landroid/widget/FrameLayout;

.field private final mboundView2:Landroid/widget/TextView;


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

    .line 29
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x3

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 4
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

    const/4 v0, 0x1

    .line 32
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    const/4 v1, 0x2

    invoke-direct {p0, p1, p2, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;)V

    const-wide/16 v2, -0x1

    .line 173
    iput-wide v2, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->mDirtyFlags:J

    .line 35
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->mainSyncCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 36
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->mboundView0:Landroid/widget/FrameLayout;

    .line 37
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    .line 38
    aget-object p1, p3, v1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 39
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 40
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 42
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewModelSyncProgressField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelSyncProgressField",
            "fieldId"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Integer;",
            ">;I)Z"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 105
    monitor-enter p0

    .line 106
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->mDirtyFlags:J

    .line 107
    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private onChangeViewModelSyncProgressText(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelSyncProgressText",
            "fieldId"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;I)Z"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 96
    monitor-enter p0

    .line 97
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->mDirtyFlags:J

    .line 98
    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method protected executeBindings()V
    .locals 14

    .line 116
    monitor-enter p0

    .line 117
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    .line 118
    iput-wide v2, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->mDirtyFlags:J

    .line 119
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;

    const-wide/16 v5, 0xf

    and-long/2addr v5, v0

    const-wide/16 v7, 0xd

    const-wide/16 v9, 0xe

    const/4 v11, 0x0

    cmp-long v12, v5, v2

    if-eqz v12, :cond_3

    and-long v5, v0, v7

    cmp-long v12, v5, v2

    if-eqz v12, :cond_1

    if-eqz v4, :cond_0

    .line 133
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;->getSyncProgressText()Landroidx/databinding/ObservableField;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v11

    :goto_0
    const/4 v6, 0x0

    .line 135
    invoke-virtual {p0, v6, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_1

    .line 140
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v5, v11

    :goto_1
    and-long v12, v0, v9

    cmp-long v6, v12, v2

    if-eqz v6, :cond_4

    if-eqz v4, :cond_2

    .line 147
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;->getSyncProgressField()Landroidx/databinding/ObservableField;

    move-result-object v11

    :cond_2
    const/4 v4, 0x1

    .line 149
    invoke-virtual {p0, v4, v11}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v11, :cond_4

    .line 154
    invoke-virtual {v11}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    goto :goto_2

    :cond_3
    move-object v5, v11

    :cond_4
    :goto_2
    and-long/2addr v9, v0

    cmp-long v4, v9, v2

    if-eqz v4, :cond_5

    .line 162
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->mainSyncCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    invoke-virtual {v4, v11}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;->setCircleValue(Landroidx/databinding/ObservableField;)V

    :cond_5
    and-long/2addr v0, v7

    cmp-long v4, v0, v2

    if-eqz v4, :cond_6

    .line 167
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->mboundView2:Landroid/widget/TextView;

    invoke-static {v0, v5}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_6
    return-void

    :catchall_0
    move-exception v0

    .line 119
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 55
    monitor-enter p0

    .line 56
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 57
    monitor-exit p0

    return v0

    .line 59
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

    .line 47
    monitor-enter p0

    const-wide/16 v0, 0x8

    .line 48
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->mDirtyFlags:J

    .line 49
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 49
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected onFieldChange(ILjava/lang/Object;I)Z
    .locals 1
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

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 90
    :cond_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->onChangeViewModelSyncProgressField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 88
    :cond_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->onChangeViewModelSyncProgressText(Landroidx/databinding/ObservableField;I)Z

    move-result p1

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

    .line 67
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 76
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;

    .line 77
    monitor-enter p0

    .line 78
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x4

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->mDirtyFlags:J

    .line 79
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 80
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBindingImpl;->notifyPropertyChanged(I)V

    .line 81
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSyncBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 79
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
