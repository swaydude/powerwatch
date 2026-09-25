.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBinding;
.source "FragmentActivityPeriodsBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl4;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl3;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl2;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl1;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private mViewModelOnDayPeriodClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl4;

.field private mViewModelOnMonthPeriodClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl2;

.field private mViewModelOnNextClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl3;

.field private mViewModelOnPreviousClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl1;

.field private mViewModelOnWeekPeriodClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl;

.field private final mboundView0:Landroid/widget/LinearLayout;

.field private final mboundView1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView4:Landroid/widget/ImageView;

.field private final mboundView5:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView6:Landroid/widget/ImageView;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f080133

    const/4 v2, 0x7

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f08011d

    const/16 v2, 0x8

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f08011c

    const/16 v2, 0x9

    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080258

    const/16 v2, 0xa

    .line 20
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080257

    const/16 v2, 0xb

    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f0801f7

    const/16 v2, 0xc

    .line 22
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f0801f6

    const/16 v2, 0xd

    .line 23
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080123

    const/16 v2, 0xe

    .line 24
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080122

    const/16 v2, 0xf

    .line 25
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f0800b4

    const/16 v2, 0x10

    .line 26
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

    .line 54
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x11

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 15
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

    move-object v14, p0

    const/16 v0, 0x10

    .line 57
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v0, 0xf

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v0, 0xe

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/LinearLayout;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/4 v3, 0x3

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v13}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Landroid/widget/LinearLayout;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;)V

    const-wide/16 v0, -0x1

    .line 395
    iput-wide v0, v14, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mDirtyFlags:J

    const/4 v0, 0x0

    .line 69
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v14, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    .line 70
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 71
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v14, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mboundView1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 72
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x2

    .line 73
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v14, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 74
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x3

    .line 75
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v14, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 76
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x4

    .line 77
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v14, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mboundView4:Landroid/widget/ImageView;

    .line 78
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x5

    .line 79
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v14, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mboundView5:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 80
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x6

    .line 81
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v14, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mboundView6:Landroid/widget/ImageView;

    .line 82
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    move-object/from16 v0, p2

    .line 83
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 85
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewModelCurrentDateText(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelCurrentDateText",
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

    .line 159
    monitor-enter p0

    .line 160
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mDirtyFlags:J

    .line 161
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

.method private onChangeViewModelCurrentPeriodType(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelCurrentPeriodType",
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

    .line 150
    monitor-enter p0

    .line 151
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mDirtyFlags:J

    .line 152
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

.method private onChangeViewModelNavigationColor(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelNavigationColor",
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

    .line 141
    monitor-enter p0

    .line 142
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mDirtyFlags:J

    .line 143
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
    .locals 26

    move-object/from16 v1, p0

    .line 170
    monitor-enter p0

    .line 171
    :try_start_0
    iget-wide v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 172
    iput-wide v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mDirtyFlags:J

    .line 173
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 193
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;

    const-wide/16 v6, 0x1f

    and-long/2addr v6, v2

    const-wide/16 v10, 0x18

    const-wide/16 v12, 0x1b

    cmp-long v16, v6, v4

    if-eqz v16, :cond_14

    and-long v6, v2, v10

    cmp-long v16, v6, v4

    if-eqz v16, :cond_5

    if-eqz v0, :cond_5

    .line 204
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mViewModelOnWeekPeriodClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl;

    if-nez v6, :cond_0

    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl;

    invoke-direct {v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mViewModelOnWeekPeriodClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl;

    :cond_0
    invoke-virtual {v6, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl;

    move-result-object v6

    .line 206
    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mViewModelOnPreviousClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl1;

    if-nez v7, :cond_1

    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl1;

    invoke-direct {v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl1;-><init>()V

    iput-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mViewModelOnPreviousClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl1;

    :cond_1
    invoke-virtual {v7, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl1;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl1;

    move-result-object v7

    .line 208
    iget-object v15, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mViewModelOnMonthPeriodClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl2;

    if-nez v15, :cond_2

    new-instance v15, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl2;

    invoke-direct {v15}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl2;-><init>()V

    iput-object v15, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mViewModelOnMonthPeriodClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl2;

    :cond_2
    invoke-virtual {v15, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl2;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl2;

    move-result-object v15

    .line 210
    iget-object v10, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mViewModelOnNextClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl3;

    if-nez v10, :cond_3

    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl3;

    invoke-direct {v10}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl3;-><init>()V

    iput-object v10, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mViewModelOnNextClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl3;

    :cond_3
    invoke-virtual {v10, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl3;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl3;

    move-result-object v10

    .line 212
    iget-object v11, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mViewModelOnDayPeriodClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl4;

    if-nez v11, :cond_4

    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl4;

    invoke-direct {v11}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl4;-><init>()V

    iput-object v11, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mViewModelOnDayPeriodClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl4;

    :cond_4
    invoke-virtual {v11, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl4;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl$OnClickListenerImpl4;

    move-result-object v11

    goto :goto_0

    :cond_5
    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    :goto_0
    and-long v18, v2, v12

    const/4 v14, 0x2

    cmp-long v20, v18, v4

    if-eqz v20, :cond_11

    if-eqz v0, :cond_6

    .line 219
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;->getCurrentPeriodType()Landroidx/databinding/ObservableField;

    move-result-object v18

    move-object/from16 v8, v18

    goto :goto_1

    :cond_6
    const/4 v8, 0x0

    :goto_1
    const/4 v9, 0x1

    .line 221
    invoke-virtual {v1, v9, v8}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v8, :cond_7

    .line 226
    invoke-virtual {v8}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    goto :goto_2

    :cond_7
    const/4 v8, 0x0

    .line 231
    :goto_2
    invoke-static {v8}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Integer;)I

    move-result v8

    if-ne v8, v9, :cond_8

    const/16 v21, 0x1

    goto :goto_3

    :cond_8
    const/16 v21, 0x0

    :goto_3
    if-nez v8, :cond_9

    const/16 v22, 0x1

    goto :goto_4

    :cond_9
    const/16 v22, 0x0

    :goto_4
    if-ne v8, v14, :cond_a

    goto :goto_5

    :cond_a
    const/4 v9, 0x0

    :goto_5
    if-eqz v20, :cond_c

    if-eqz v21, :cond_b

    const-wide/16 v23, 0x40

    goto :goto_6

    :cond_b
    const-wide/16 v23, 0x20

    :goto_6
    or-long v2, v2, v23

    :cond_c
    and-long v23, v2, v12

    cmp-long v8, v23, v4

    if-eqz v8, :cond_e

    if-eqz v22, :cond_d

    const-wide/16 v23, 0x400

    goto :goto_7

    :cond_d
    const-wide/16 v23, 0x200

    :goto_7
    or-long v2, v2, v23

    :cond_e
    and-long v23, v2, v12

    cmp-long v8, v23, v4

    if-eqz v8, :cond_10

    if-eqz v9, :cond_f

    const-wide/16 v23, 0x100

    goto :goto_8

    :cond_f
    const-wide/16 v23, 0x80

    :goto_8
    or-long v2, v2, v23

    :cond_10
    const-wide/16 v18, 0x1c

    goto :goto_9

    :cond_11
    const/4 v9, 0x0

    const-wide/16 v18, 0x1c

    const/16 v21, 0x0

    const/16 v22, 0x0

    :goto_9
    and-long v23, v2, v18

    cmp-long v8, v23, v4

    if-eqz v8, :cond_13

    if-eqz v0, :cond_12

    .line 269
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;->getCurrentDateText()Landroidx/databinding/ObservableField;

    move-result-object v8

    goto :goto_a

    :cond_12
    const/4 v8, 0x0

    .line 271
    :goto_a
    invoke-virtual {v1, v14, v8}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v8, :cond_13

    .line 276
    invoke-virtual {v8}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    goto :goto_b

    :cond_13
    const/4 v8, 0x0

    goto :goto_b

    :cond_14
    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    :goto_b
    const-wide/16 v23, 0x540

    and-long v23, v2, v23

    cmp-long v14, v23, v4

    if-eqz v14, :cond_16

    if-eqz v0, :cond_15

    .line 286
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;->getNavigationColor()Landroidx/databinding/ObservableField;

    move-result-object v0

    goto :goto_c

    :cond_15
    const/4 v0, 0x0

    :goto_c
    const/4 v14, 0x0

    .line 288
    invoke-virtual {v1, v14, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v0, :cond_17

    .line 293
    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    move-object/from16 v16, v0

    goto :goto_d

    :cond_16
    const/4 v14, 0x0

    :cond_17
    const/16 v16, 0x0

    :goto_d
    and-long/2addr v12, v2

    cmp-long v0, v12, v4

    if-eqz v0, :cond_1b

    const v12, 0x7f050105

    if-eqz v21, :cond_18

    .line 300
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v13

    goto :goto_e

    :cond_18
    iget-object v13, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v13, v12}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->getColorFromResource(Landroid/view/View;I)I

    move-result v13

    :goto_e
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    if-eqz v9, :cond_19

    .line 302
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v9

    goto :goto_f

    :cond_19
    iget-object v9, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v9, v12}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->getColorFromResource(Landroid/view/View;I)I

    move-result v9

    :goto_f
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    if-eqz v22, :cond_1a

    .line 304
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v12

    goto :goto_10

    :cond_1a
    iget-object v14, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mboundView1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v14, v12}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->getColorFromResource(Landroid/view/View;I)I

    move-result v12

    :goto_10
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    .line 308
    invoke-static {v13}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Integer;)I

    move-result v14

    .line 310
    invoke-static {v9}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Integer;)I

    move-result v9

    .line 312
    invoke-static {v12}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Integer;)I

    move-result v12

    const-wide/16 v16, 0x18

    move/from16 v25, v12

    move v12, v9

    move v9, v14

    move/from16 v14, v25

    goto :goto_11

    :cond_1b
    const/4 v9, 0x0

    const/4 v12, 0x0

    const-wide/16 v16, 0x18

    :goto_11
    and-long v16, v2, v16

    cmp-long v13, v16, v4

    if-eqz v13, :cond_1c

    .line 318
    iget-object v13, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mboundView1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v13, v11}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 319
    iget-object v11, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v11, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 320
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v6, v15}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 321
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mboundView4:Landroid/widget/ImageView;

    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 322
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mboundView6:Landroid/widget/ImageView;

    invoke-virtual {v6, v10}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1c
    if-eqz v0, :cond_1d

    .line 327
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mboundView1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v0, v14}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTextColor(I)V

    .line 328
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v0, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTextColor(I)V

    .line 329
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v0, v12}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTextColor(I)V

    :cond_1d
    const-wide/16 v6, 0x1c

    and-long/2addr v2, v6

    cmp-long v0, v2, v4

    if-eqz v0, :cond_1e

    .line 334
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mboundView5:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v8}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_1e
    return-void

    :catchall_0
    move-exception v0

    .line 173
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 98
    monitor-enter p0

    .line 99
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 100
    monitor-exit p0

    return v0

    .line 102
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

    .line 90
    monitor-enter p0

    const-wide/16 v0, 0x10

    .line 91
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mDirtyFlags:J

    .line 92
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 92
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

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 135
    :cond_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->onChangeViewModelCurrentDateText(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 133
    :cond_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->onChangeViewModelCurrentPeriodType(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 131
    :cond_2
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->onChangeViewModelNavigationColor(Landroidx/databinding/ObservableField;I)Z

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

    .line 110
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 119
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;

    .line 120
    monitor-enter p0

    .line 121
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x8

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->mDirtyFlags:J

    .line 122
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 123
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBindingImpl;->notifyPropertyChanged(I)V

    .line 124
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 122
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
