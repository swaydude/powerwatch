.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;
.source "FragmentMainDashboardBindingImpl.java"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/generated/callback/OnRefreshListener$Listener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private final mCallback1:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;

.field private mDirtyFlags:J

.field private mViewModelOnToastMessageClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl$OnClickListenerImpl;

.field private final mboundView1:Landroid/widget/LinearLayout;

.field private final mboundView2:Landroid/widget/LinearLayout;

.field private final mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView5:Landroid/widget/LinearLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f080162

    const/4 v2, 0x7

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f0801d0

    const/16 v2, 0x8

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f08027a

    const/16 v2, 0x9

    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f0801b6

    const/16 v2, 0xa

    .line 20
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f0800a4

    const/16 v2, 0xb

    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080135

    const/16 v2, 0xc

    .line 22
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080207

    const/16 v2, 0xd

    .line 23
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f0801c4

    const/16 v2, 0xe

    .line 24
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080245

    const/16 v2, 0xf

    .line 25
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

    .line 47
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x10

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 16
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

    move-object/from16 v15, p0

    const/16 v0, 0xb

    .line 50
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Landroid/widget/FrameLayout;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/FrameLayout;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroidx/core/widget/NestedScrollView;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/FrameLayout;

    const/16 v0, 0xe

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/FrameLayout;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/FrameLayout;

    const/4 v0, 0x0

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroid/widget/FrameLayout;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Landroid/widget/FrameLayout;

    const/16 v0, 0xf

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Landroid/widget/FrameLayout;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v14, v0

    check-cast v14, Landroid/widget/FrameLayout;

    const/4 v3, 0x7

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v14}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroidx/core/widget/NestedScrollView;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;)V

    const-wide/16 v0, -0x1

    .line 455
    iput-wide v0, v15, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mDirtyFlags:J

    const/4 v0, 0x1

    .line 63
    aget-object v1, p3, v0

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, v15, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mboundView1:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    .line 64
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x2

    .line 65
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, v15, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mboundView2:Landroid/widget/LinearLayout;

    .line 66
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x3

    .line 67
    aget-object v1, p3, v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v1, v15, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 68
    invoke-virtual {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x4

    .line 69
    aget-object v1, p3, v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v1, v15, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 70
    invoke-virtual {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x5

    .line 71
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, v15, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mboundView5:Landroid/widget/LinearLayout;

    .line 72
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    .line 73
    iget-object v1, v15, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->refreshLayout:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-virtual {v1, v2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setTag(Ljava/lang/Object;)V

    .line 74
    iget-object v1, v15, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->syncFragment:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    move-object/from16 v1, p2

    .line 75
    invoke-virtual {v15, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 77
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/generated/callback/OnRefreshListener;

    invoke-direct {v1, v15, v0}, Lpowerwatch/matrix/com/pwgen2android/generated/callback/OnRefreshListener;-><init>(Lpowerwatch/matrix/com/pwgen2android/generated/callback/OnRefreshListener$Listener;I)V

    iput-object v1, v15, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mCallback1:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;

    .line 78
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewModelIsSwipeRefreshing(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelIsSwipeRefreshing",
            "fieldId"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;I)Z"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 196
    monitor-enter p0

    .line 197
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x40

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mDirtyFlags:J

    .line 198
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

.method private onChangeViewModelIsSyncBlocked(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelIsSyncBlocked",
            "fieldId"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;I)Z"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 169
    monitor-enter p0

    .line 170
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x8

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mDirtyFlags:J

    .line 171
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

.method private onChangeViewModelPullToSyncDisplayed(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelPullToSyncDisplayed",
            "fieldId"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;I)Z"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 160
    monitor-enter p0

    .line 161
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mDirtyFlags:J

    .line 162
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

.method private onChangeViewModelSyncInProgress(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelSyncInProgress",
            "fieldId"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;I)Z"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 151
    monitor-enter p0

    .line 152
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mDirtyFlags:J

    .line 153
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

.method private onChangeViewModelToastActionButtonFieldText(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelToastActionButtonFieldText",
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

    .line 142
    monitor-enter p0

    .line 143
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mDirtyFlags:J

    .line 144
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

.method private onChangeViewModelToastMessageDisplayed(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelToastMessageDisplayed",
            "fieldId"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;I)Z"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 187
    monitor-enter p0

    .line 188
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x20

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mDirtyFlags:J

    .line 189
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

.method private onChangeViewModelToastMessageFieldText(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelToastMessageFieldText",
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

    .line 178
    monitor-enter p0

    .line 179
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x10

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mDirtyFlags:J

    .line 180
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
.method public final _internalCallbackOnRefresh(I)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "sourceId"
        }
    .end annotation

    .line 441
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 451
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->onRefresh()V

    :cond_1
    return-void
.end method

.method protected executeBindings()V
    .locals 32

    move-object/from16 v1, p0

    .line 207
    monitor-enter p0

    .line 208
    :try_start_0
    iget-wide v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 209
    iput-wide v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mDirtyFlags:J

    .line 210
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 232
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;

    const-wide/16 v6, 0x1ff

    and-long/2addr v6, v2

    const-wide/16 v10, 0x188

    const-wide/16 v12, 0x1a4

    const-wide/16 v14, 0x180

    const-wide/16 v16, 0x182

    const-wide/16 v18, 0x190

    const-wide/16 v20, 0x181

    const/4 v8, 0x0

    cmp-long v24, v6, v4

    if-eqz v24, :cond_13

    and-long v6, v2, v20

    cmp-long v24, v6, v4

    if-eqz v24, :cond_1

    if-eqz v0, :cond_0

    .line 245
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->getToastActionButtonFieldText()Landroidx/databinding/ObservableField;

    move-result-object v6

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 247
    :goto_0
    invoke-virtual {v1, v8, v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v6, :cond_1

    .line 252
    invoke-virtual {v6}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    and-long v24, v2, v16

    const/4 v7, 0x1

    cmp-long v26, v24, v4

    if-eqz v26, :cond_4

    if-eqz v0, :cond_2

    .line 259
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->getSyncInProgress()Landroidx/databinding/ObservableField;

    move-result-object v24

    move-object/from16 v8, v24

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    .line 261
    :goto_2
    invoke-virtual {v1, v7, v8}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v8, :cond_3

    .line 266
    invoke-virtual {v8}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    goto :goto_3

    :cond_3
    const/4 v8, 0x0

    .line 271
    :goto_3
    invoke-static {v8}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v8

    goto :goto_4

    :cond_4
    const/4 v8, 0x0

    :goto_4
    and-long v25, v2, v12

    cmp-long v27, v25, v4

    if-eqz v27, :cond_8

    if-eqz v0, :cond_5

    .line 277
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->getPullToSyncDisplayed()Landroidx/databinding/ObservableField;

    move-result-object v25

    .line 279
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->getToastMessageDisplayed()Landroidx/databinding/ObservableField;

    move-result-object v26

    move-object/from16 v9, v25

    move-object/from16 v12, v26

    goto :goto_5

    :cond_5
    const/4 v9, 0x0

    const/4 v12, 0x0

    :goto_5
    const/4 v13, 0x2

    .line 281
    invoke-virtual {v1, v13, v9}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    const/4 v13, 0x5

    .line 282
    invoke-virtual {v1, v13, v12}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v9, :cond_6

    .line 287
    invoke-virtual {v9}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    goto :goto_6

    :cond_6
    const/4 v9, 0x0

    :goto_6
    if-eqz v12, :cond_7

    .line 291
    invoke-virtual {v12}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    goto :goto_7

    :cond_7
    const/4 v12, 0x0

    .line 296
    :goto_7
    invoke-static {v9}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v9

    .line 298
    invoke-static {v12}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v12

    xor-int/lit8 v13, v12, 0x1

    and-int/2addr v9, v13

    .line 310
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-static {v9}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v9

    goto :goto_8

    :cond_8
    const/4 v9, 0x0

    const/4 v12, 0x0

    :goto_8
    and-long v28, v2, v14

    cmp-long v13, v28, v4

    if-eqz v13, :cond_a

    if-eqz v0, :cond_a

    .line 316
    iget-object v13, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mViewModelOnToastMessageClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl$OnClickListenerImpl;

    if-nez v13, :cond_9

    new-instance v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl$OnClickListenerImpl;

    invoke-direct {v13}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v13, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mViewModelOnToastMessageClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl$OnClickListenerImpl;

    :cond_9
    invoke-virtual {v13, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl$OnClickListenerImpl;

    move-result-object v13

    goto :goto_9

    :cond_a
    const/4 v13, 0x0

    :goto_9
    and-long v28, v2, v10

    cmp-long v30, v28, v4

    if-eqz v30, :cond_d

    if-eqz v0, :cond_b

    .line 323
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->isSyncBlocked()Landroidx/databinding/ObservableField;

    move-result-object v28

    move-object/from16 v10, v28

    goto :goto_a

    :cond_b
    const/4 v10, 0x0

    :goto_a
    const/4 v11, 0x3

    .line 325
    invoke-virtual {v1, v11, v10}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v10, :cond_c

    .line 330
    invoke-virtual {v10}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    goto :goto_b

    :cond_c
    const/4 v10, 0x0

    .line 335
    :goto_b
    invoke-static {v10}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v10

    xor-int/2addr v7, v10

    .line 343
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v7}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v7

    goto :goto_c

    :cond_d
    const/4 v7, 0x0

    :goto_c
    and-long v10, v2, v18

    cmp-long v30, v10, v4

    if-eqz v30, :cond_f

    if-eqz v0, :cond_e

    .line 349
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->getToastMessageFieldText()Landroidx/databinding/ObservableField;

    move-result-object v10

    goto :goto_d

    :cond_e
    const/4 v10, 0x0

    :goto_d
    const/4 v11, 0x4

    .line 351
    invoke-virtual {v1, v11, v10}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v10, :cond_f

    .line 356
    invoke-virtual {v10}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    goto :goto_e

    :cond_f
    const/4 v10, 0x0

    :goto_e
    const-wide/16 v22, 0x1c0

    and-long v30, v2, v22

    cmp-long v11, v30, v4

    if-eqz v11, :cond_12

    if-eqz v0, :cond_10

    .line 363
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;->isSwipeRefreshing()Landroidx/databinding/ObservableField;

    move-result-object v0

    goto :goto_f

    :cond_10
    const/4 v0, 0x0

    :goto_f
    const/4 v11, 0x6

    .line 365
    invoke-virtual {v1, v11, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v0, :cond_11

    .line 370
    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    goto :goto_10

    :cond_11
    const/4 v0, 0x0

    .line 375
    :goto_10
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v0

    move-object v11, v6

    move v6, v8

    move v8, v12

    goto :goto_11

    :cond_12
    move-object v11, v6

    move v6, v8

    move v8, v12

    const/4 v0, 0x0

    goto :goto_11

    :cond_13
    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    :goto_11
    const-wide/16 v24, 0x1a0

    and-long v24, v2, v24

    cmp-long v12, v24, v4

    if-eqz v12, :cond_14

    .line 382
    iget-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mboundView2:Landroid/widget/LinearLayout;

    invoke-static {v12, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_14
    and-long v18, v2, v18

    cmp-long v8, v18, v4

    if-eqz v8, :cond_15

    .line 387
    iget-object v8, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v8, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_15
    and-long/2addr v14, v2

    cmp-long v8, v14, v4

    if-eqz v8, :cond_16

    .line 392
    iget-object v8, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v8, v13}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_16
    and-long v12, v2, v20

    cmp-long v8, v12, v4

    if-eqz v8, :cond_17

    .line 397
    iget-object v8, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v8, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_17
    const-wide/16 v10, 0x1a4

    and-long/2addr v10, v2

    cmp-long v8, v10, v4

    if-eqz v8, :cond_18

    .line 402
    iget-object v8, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mboundView5:Landroid/widget/LinearLayout;

    invoke-static {v8, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_18
    const-wide/16 v8, 0x100

    and-long/2addr v8, v2

    cmp-long v10, v8, v4

    if-eqz v10, :cond_19

    .line 407
    iget-object v8, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->refreshLayout:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget-object v9, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mCallback1:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;

    invoke-virtual {v8, v9}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V

    :cond_19
    const-wide/16 v8, 0x1c0

    and-long/2addr v8, v2

    cmp-long v10, v8, v4

    if-eqz v10, :cond_1a

    .line 412
    iget-object v8, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->refreshLayout:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-virtual {v8, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    :cond_1a
    const-wide/16 v8, 0x188

    and-long/2addr v8, v2

    cmp-long v0, v8, v4

    if-eqz v0, :cond_1b

    .line 417
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->refreshLayout:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-static {v0, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->swipeEnabled(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;Z)V

    :cond_1b
    and-long v2, v2, v16

    cmp-long v0, v2, v4

    if-eqz v0, :cond_1c

    .line 422
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->syncFragment:Landroid/widget/FrameLayout;

    invoke-static {v0, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_1c
    return-void

    :catchall_0
    move-exception v0

    .line 210
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 91
    monitor-enter p0

    .line 92
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 93
    monitor-exit p0

    return v0

    .line 95
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

    .line 83
    monitor-enter p0

    const-wide/16 v0, 0x100

    .line 84
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mDirtyFlags:J

    .line 85
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 85
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

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    .line 136
    :pswitch_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->onChangeViewModelIsSwipeRefreshing(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 134
    :pswitch_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->onChangeViewModelToastMessageDisplayed(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 132
    :pswitch_2
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->onChangeViewModelToastMessageFieldText(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 130
    :pswitch_3
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->onChangeViewModelIsSyncBlocked(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 128
    :pswitch_4
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->onChangeViewModelPullToSyncDisplayed(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 126
    :pswitch_5
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->onChangeViewModelSyncInProgress(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 124
    :pswitch_6
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->onChangeViewModelToastActionButtonFieldText(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

    .line 103
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 112
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;

    .line 113
    monitor-enter p0

    .line 114
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x80

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->mDirtyFlags:J

    .line 115
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 116
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBindingImpl;->notifyPropertyChanged(I)V

    .line 117
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 115
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
