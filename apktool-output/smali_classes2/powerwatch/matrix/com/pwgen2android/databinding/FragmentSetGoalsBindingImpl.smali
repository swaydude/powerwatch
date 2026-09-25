.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;
.source "FragmentSetGoalsBindingImpl.java"


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private caloriesEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private distanceEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private mDirtyFlags:J

.field private final mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private mboundView3androidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private final mboundView6:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private mboundView6androidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private sleepEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private stepsEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f08022f

    const/4 v2, 0x7

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f0800fc

    const/16 v2, 0x8

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f0800a6

    const/16 v2, 0x9

    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080209

    const/16 v2, 0xa

    .line 20
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

    .line 255
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0xb

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 14
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

    move-object v13, p0

    const/4 v0, 0x4

    .line 258
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/4 v0, 0x0

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/LinearLayout;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/4 v3, 0x6

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v12}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Landroid/widget/LinearLayout;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;)V

    .line 31
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl$1;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;)V

    iput-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->caloriesEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 68
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl$2;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;)V

    iput-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->distanceEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 105
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl$3;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;)V

    iput-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mboundView3androidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 142
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl$4;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl$4;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;)V

    iput-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mboundView6androidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 179
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl$5;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl$5;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;)V

    iput-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->sleepEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 216
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl$6;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl$6;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;)V

    iput-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->stepsEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    const-wide/16 v0, -0x1

    .line 549
    iput-wide v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mDirtyFlags:J

    .line 269
    iget-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->caloriesEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;->setTag(Ljava/lang/Object;)V

    .line 270
    iget-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->distanceEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;->setTag(Ljava/lang/Object;)V

    .line 271
    iget-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mainView:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x3

    .line 272
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 273
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x6

    .line 274
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mboundView6:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 275
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    .line 276
    iget-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->sleepEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;->setTag(Ljava/lang/Object;)V

    .line 277
    iget-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->stepsEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;->setTag(Ljava/lang/Object;)V

    move-object/from16 v0, p2

    .line 278
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 280
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->invalidateAll()V

    return-void
.end method

.method static synthetic access$000(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;
    .locals 0

    .line 8
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    return-object p0
.end method

.method static synthetic access$100(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;
    .locals 0

    .line 8
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mboundView6:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    return-object p0
.end method

.method private onChangeViewModelCaloriesField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelCaloriesField",
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

    .line 387
    monitor-enter p0

    .line 388
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x20

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mDirtyFlags:J

    .line 389
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

.method private onChangeViewModelDistanceField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelDistanceField",
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

    .line 360
    monitor-enter p0

    .line 361
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mDirtyFlags:J

    .line 362
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

.method private onChangeViewModelDistanceUnitField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelDistanceUnitField",
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

    .line 342
    monitor-enter p0

    .line 343
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mDirtyFlags:J

    .line 344
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

.method private onChangeViewModelSleepField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelSleepField",
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

    .line 378
    monitor-enter p0

    .line 379
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x10

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mDirtyFlags:J

    .line 380
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

.method private onChangeViewModelSleepUnitField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelSleepUnitField",
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

    .line 351
    monitor-enter p0

    .line 352
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mDirtyFlags:J

    .line 353
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

.method private onChangeViewModelStepsField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelStepsField",
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

    .line 369
    monitor-enter p0

    .line 370
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x8

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mDirtyFlags:J

    .line 371
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
    .locals 27

    move-object/from16 v1, p0

    .line 398
    monitor-enter p0

    .line 399
    :try_start_0
    iget-wide v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 400
    iput-wide v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mDirtyFlags:J

    .line 401
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 414
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;

    const-wide/16 v6, 0xff

    and-long/2addr v6, v2

    const-wide/16 v8, 0xd0

    const-wide/16 v10, 0xc8

    const-wide/16 v12, 0xc4

    const-wide/16 v14, 0xc2

    const-wide/16 v16, 0xc1

    const-wide/16 v18, 0xe0

    const/16 v20, 0x0

    cmp-long v21, v6, v4

    if-eqz v21, :cond_c

    and-long v6, v2, v16

    cmp-long v21, v6, v4

    if-eqz v21, :cond_1

    if-eqz v0, :cond_0

    .line 423
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->getDistanceUnitField()Landroidx/databinding/ObservableField;

    move-result-object v6

    goto :goto_0

    :cond_0
    move-object/from16 v6, v20

    :goto_0
    const/4 v7, 0x0

    .line 425
    invoke-virtual {v1, v7, v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v6, :cond_1

    .line 430
    invoke-virtual {v6}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v6, v20

    :goto_1
    and-long v21, v2, v14

    cmp-long v7, v21, v4

    if-eqz v7, :cond_3

    if-eqz v0, :cond_2

    .line 437
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->getSleepUnitField()Landroidx/databinding/ObservableField;

    move-result-object v7

    goto :goto_2

    :cond_2
    move-object/from16 v7, v20

    :goto_2
    const/4 v14, 0x1

    .line 439
    invoke-virtual {v1, v14, v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v7, :cond_3

    .line 444
    invoke-virtual {v7}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v7, v20

    :goto_3
    and-long v14, v2, v12

    cmp-long v23, v14, v4

    if-eqz v23, :cond_5

    if-eqz v0, :cond_4

    .line 451
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->getDistanceField()Landroidx/databinding/ObservableField;

    move-result-object v14

    goto :goto_4

    :cond_4
    move-object/from16 v14, v20

    :goto_4
    const/4 v15, 0x2

    .line 453
    invoke-virtual {v1, v15, v14}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v14, :cond_5

    .line 458
    invoke-virtual {v14}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v14, v20

    :goto_5
    and-long v23, v2, v10

    cmp-long v15, v23, v4

    if-eqz v15, :cond_7

    if-eqz v0, :cond_6

    .line 465
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->getStepsField()Landroidx/databinding/ObservableField;

    move-result-object v15

    goto :goto_6

    :cond_6
    move-object/from16 v15, v20

    :goto_6
    const/4 v10, 0x3

    .line 467
    invoke-virtual {v1, v10, v15}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v15, :cond_7

    .line 472
    invoke-virtual {v15}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v10, v20

    :goto_7
    and-long v25, v2, v8

    cmp-long v11, v25, v4

    if-eqz v11, :cond_9

    if-eqz v0, :cond_8

    .line 479
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->getSleepField()Landroidx/databinding/ObservableField;

    move-result-object v11

    goto :goto_8

    :cond_8
    move-object/from16 v11, v20

    :goto_8
    const/4 v15, 0x4

    .line 481
    invoke-virtual {v1, v15, v11}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v11, :cond_9

    .line 486
    invoke-virtual {v11}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, v20

    :goto_9
    and-long v25, v2, v18

    cmp-long v15, v25, v4

    if-eqz v15, :cond_b

    if-eqz v0, :cond_a

    .line 493
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;->getCaloriesField()Landroidx/databinding/ObservableField;

    move-result-object v0

    goto :goto_a

    :cond_a
    move-object/from16 v0, v20

    :goto_a
    const/4 v15, 0x5

    .line 495
    invoke-virtual {v1, v15, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v0, :cond_b

    .line 500
    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v0, v20

    goto :goto_b

    :cond_c
    move-object/from16 v0, v20

    move-object v6, v0

    move-object v7, v6

    move-object v10, v7

    move-object v11, v10

    move-object v14, v11

    :goto_b
    and-long v18, v2, v18

    cmp-long v15, v18, v4

    if-eqz v15, :cond_d

    .line 508
    iget-object v15, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->caloriesEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-static {v15, v0}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_d
    const-wide/16 v18, 0x80

    and-long v18, v2, v18

    cmp-long v0, v18, v4

    if-eqz v0, :cond_e

    .line 513
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->caloriesEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    move-object/from16 v15, v20

    check-cast v15, Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;

    move-object/from16 v8, v20

    check-cast v8, Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;

    move-object/from16 v9, v20

    check-cast v9, Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;

    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->caloriesEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v0, v15, v8, v9, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 514
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->distanceEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->distanceEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v0, v15, v8, v9, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 515
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mboundView3androidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v0, v15, v8, v9, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 516
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mboundView6:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mboundView6androidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v0, v15, v8, v9, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 517
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->sleepEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->sleepEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v0, v15, v8, v9, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 518
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->stepsEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->stepsEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v0, v15, v8, v9, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    :cond_e
    and-long v4, v2, v12

    const-wide/16 v8, 0x0

    cmp-long v0, v4, v8

    if-eqz v0, :cond_f

    .line 523
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->distanceEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-static {v0, v14}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_f
    and-long v4, v2, v16

    cmp-long v0, v4, v8

    if-eqz v0, :cond_10

    .line 528
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v6}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_10
    const-wide/16 v4, 0xc2

    and-long/2addr v4, v2

    cmp-long v0, v4, v8

    if-eqz v0, :cond_11

    .line 533
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mboundView6:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v7}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_11
    const-wide/16 v4, 0xd0

    and-long/2addr v4, v2

    cmp-long v0, v4, v8

    if-eqz v0, :cond_12

    .line 538
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->sleepEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-static {v0, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_12
    const-wide/16 v4, 0xc8

    and-long/2addr v2, v4

    cmp-long v0, v2, v8

    if-eqz v0, :cond_13

    .line 543
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->stepsEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-static {v0, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_13
    return-void

    :catchall_0
    move-exception v0

    .line 401
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 293
    monitor-enter p0

    .line 294
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 295
    monitor-exit p0

    return v0

    .line 297
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

    .line 285
    monitor-enter p0

    const-wide/16 v0, 0x80

    .line 286
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mDirtyFlags:J

    .line 287
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 288
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 287
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

    if-eqz p1, :cond_5

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 336
    :cond_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->onChangeViewModelCaloriesField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 334
    :cond_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->onChangeViewModelSleepField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 332
    :cond_2
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->onChangeViewModelStepsField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 330
    :cond_3
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->onChangeViewModelDistanceField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 328
    :cond_4
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->onChangeViewModelSleepUnitField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 326
    :cond_5
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->onChangeViewModelDistanceUnitField(Landroidx/databinding/ObservableField;I)Z

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

    .line 305
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 314
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;

    .line 315
    monitor-enter p0

    .line 316
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x40

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->mDirtyFlags:J

    .line 317
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 318
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBindingImpl;->notifyPropertyChanged(I)V

    .line 319
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSetGoalsBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 317
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
