.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBinding;
.source "FragmentDailyGoalsSettingsBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl3;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl2;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl1;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private mViewModelOnCaloriesClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl1;

.field private mViewModelOnPowerClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl2;

.field private mViewModelOnSleepClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl;

.field private mViewModelOnStepsClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl3;

.field private final mboundView0:Landroid/widget/LinearLayout;

.field private final mboundView1:Landroid/widget/RelativeLayout;

.field private final mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView3:Landroid/widget/RelativeLayout;

.field private final mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView5:Landroid/widget/RelativeLayout;

.field private final mboundView6:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView7:Landroid/widget/RelativeLayout;

.field private final mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f080074

    const/16 v2, 0x9

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080064

    const/16 v2, 0xa

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080072

    const/16 v2, 0xb

    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080070

    const/16 v2, 0xc

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

    .line 51
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0xd

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 9
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

    const/16 v0, 0xa

    .line 54
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    const/4 v4, 0x4

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;)V

    const-wide/16 v0, -0x1

    .line 344
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mDirtyFlags:J

    const/4 p1, 0x0

    .line 60
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    .line 61
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 62
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mboundView1:Landroid/widget/RelativeLayout;

    .line 63
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 64
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 65
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 66
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mboundView3:Landroid/widget/RelativeLayout;

    .line 67
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x4

    .line 68
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 69
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x5

    .line 70
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mboundView5:Landroid/widget/RelativeLayout;

    .line 71
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x6

    .line 72
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mboundView6:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 73
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x7

    .line 74
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mboundView7:Landroid/widget/RelativeLayout;

    .line 75
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0x8

    .line 76
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 77
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    .line 78
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 80
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->invalidateAll()V

    return-void
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

    .line 165
    monitor-enter p0

    .line 166
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x8

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mDirtyFlags:J

    .line 167
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

.method private onChangeViewModelPowerField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelPowerField",
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

    .line 147
    monitor-enter p0

    .line 148
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mDirtyFlags:J

    .line 149
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

    .line 156
    monitor-enter p0

    .line 157
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mDirtyFlags:J

    .line 158
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

    .line 138
    monitor-enter p0

    .line 139
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mDirtyFlags:J

    .line 140
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

    .line 176
    monitor-enter p0

    .line 177
    :try_start_0
    iget-wide v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 178
    iput-wide v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mDirtyFlags:J

    .line 179
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;

    const-wide/16 v6, 0x3f

    and-long/2addr v6, v2

    const-wide/16 v8, 0x34

    const-wide/16 v10, 0x32

    const-wide/16 v14, 0x31

    const-wide/16 v16, 0x30

    const/16 v18, 0x0

    cmp-long v19, v6, v4

    if-eqz v19, :cond_d

    and-long v6, v2, v16

    cmp-long v19, v6, v4

    if-eqz v19, :cond_4

    if-eqz v0, :cond_4

    .line 201
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mViewModelOnSleepClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl;

    if-nez v6, :cond_0

    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl;

    invoke-direct {v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mViewModelOnSleepClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl;

    :cond_0
    invoke-virtual {v6, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl;

    move-result-object v6

    .line 203
    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mViewModelOnCaloriesClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl1;

    if-nez v7, :cond_1

    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl1;

    invoke-direct {v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl1;-><init>()V

    iput-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mViewModelOnCaloriesClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl1;

    :cond_1
    invoke-virtual {v7, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl1;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl1;

    move-result-object v7

    .line 205
    iget-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mViewModelOnPowerClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl2;

    if-nez v12, :cond_2

    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl2;

    invoke-direct {v12}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl2;-><init>()V

    iput-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mViewModelOnPowerClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl2;

    :cond_2
    invoke-virtual {v12, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl2;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl2;

    move-result-object v12

    .line 207
    iget-object v13, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mViewModelOnStepsClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl3;

    if-nez v13, :cond_3

    new-instance v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl3;

    invoke-direct {v13}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl3;-><init>()V

    iput-object v13, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mViewModelOnStepsClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl3;

    :cond_3
    invoke-virtual {v13, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl3;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl$OnClickListenerImpl3;

    move-result-object v13

    goto :goto_0

    :cond_4
    move-object/from16 v6, v18

    move-object v7, v6

    move-object v12, v7

    move-object v13, v12

    :goto_0
    and-long v21, v2, v14

    cmp-long v23, v21, v4

    if-eqz v23, :cond_6

    if-eqz v0, :cond_5

    .line 214
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->getStepsField()Landroidx/databinding/ObservableField;

    move-result-object v21

    move-object/from16 v14, v21

    goto :goto_1

    :cond_5
    move-object/from16 v14, v18

    :goto_1
    const/4 v15, 0x0

    .line 216
    invoke-virtual {v1, v15, v14}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v14, :cond_6

    .line 221
    invoke-virtual {v14}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    goto :goto_2

    :cond_6
    move-object/from16 v14, v18

    :goto_2
    and-long v23, v2, v10

    cmp-long v15, v23, v4

    if-eqz v15, :cond_8

    if-eqz v0, :cond_7

    .line 228
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->getPowerField()Landroidx/databinding/ObservableField;

    move-result-object v15

    goto :goto_3

    :cond_7
    move-object/from16 v15, v18

    :goto_3
    const/4 v10, 0x1

    .line 230
    invoke-virtual {v1, v10, v15}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v15, :cond_8

    .line 235
    invoke-virtual {v15}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    goto :goto_4

    :cond_8
    move-object/from16 v10, v18

    :goto_4
    and-long v25, v2, v8

    cmp-long v11, v25, v4

    if-eqz v11, :cond_a

    if-eqz v0, :cond_9

    .line 242
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->getSleepField()Landroidx/databinding/ObservableField;

    move-result-object v11

    goto :goto_5

    :cond_9
    move-object/from16 v11, v18

    :goto_5
    const/4 v15, 0x2

    .line 244
    invoke-virtual {v1, v15, v11}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v11, :cond_a

    .line 249
    invoke-virtual {v11}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    goto :goto_6

    :cond_a
    move-object/from16 v11, v18

    :goto_6
    const-wide/16 v19, 0x38

    and-long v25, v2, v19

    cmp-long v15, v25, v4

    if-eqz v15, :cond_c

    if-eqz v0, :cond_b

    .line 256
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->getCaloriesField()Landroidx/databinding/ObservableField;

    move-result-object v0

    goto :goto_7

    :cond_b
    move-object/from16 v0, v18

    :goto_7
    const/4 v15, 0x3

    .line 258
    invoke-virtual {v1, v15, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v0, :cond_c

    .line 263
    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Ljava/lang/String;

    :cond_c
    move-object/from16 v0, v18

    goto :goto_8

    :cond_d
    move-object/from16 v0, v18

    move-object v6, v0

    move-object v7, v6

    move-object v10, v7

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    :goto_8
    and-long v15, v2, v16

    cmp-long v17, v15, v4

    if-eqz v17, :cond_e

    .line 271
    iget-object v15, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mboundView1:Landroid/widget/RelativeLayout;

    invoke-virtual {v15, v13}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 272
    iget-object v13, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mboundView3:Landroid/widget/RelativeLayout;

    invoke-virtual {v13, v7}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 273
    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mboundView5:Landroid/widget/RelativeLayout;

    invoke-virtual {v7, v6}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 274
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mboundView7:Landroid/widget/RelativeLayout;

    invoke-virtual {v6, v12}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_e
    const-wide/16 v6, 0x31

    and-long/2addr v6, v2

    cmp-long v12, v6, v4

    if-eqz v12, :cond_f

    .line 279
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v6, v14}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_f
    const-wide/16 v6, 0x38

    and-long/2addr v6, v2

    cmp-long v12, v6, v4

    if-eqz v12, :cond_10

    .line 284
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v6, v0}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_10
    and-long v6, v2, v8

    cmp-long v0, v6, v4

    if-eqz v0, :cond_11

    .line 289
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mboundView6:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_11
    const-wide/16 v6, 0x32

    and-long/2addr v2, v6

    cmp-long v0, v2, v4

    if-eqz v0, :cond_12

    .line 294
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_12
    return-void

    :catchall_0
    move-exception v0

    .line 179
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 93
    monitor-enter p0

    .line 94
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 95
    monitor-exit p0

    return v0

    .line 97
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

    .line 85
    monitor-enter p0

    const-wide/16 v0, 0x20

    .line 86
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mDirtyFlags:J

    .line 87
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 87
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

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 132
    :cond_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->onChangeViewModelCaloriesField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 130
    :cond_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->onChangeViewModelSleepField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 128
    :cond_2
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->onChangeViewModelPowerField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 126
    :cond_3
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->onChangeViewModelStepsField(Landroidx/databinding/ObservableField;I)Z

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

    .line 105
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 114
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;

    .line 115
    monitor-enter p0

    .line 116
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x10

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->mDirtyFlags:J

    .line 117
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 118
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBindingImpl;->notifyPropertyChanged(I)V

    .line 119
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDailyGoalsSettingsBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 117
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
