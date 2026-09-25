.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBinding;
.source "FragmentRealtimeBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl3;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl2;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl1;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private mViewModelOnCaloriesCircleClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl1;

.field private mViewModelOnPowerCircleClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl3;

.field private mViewModelOnSleepCircleClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl2;

.field private mViewModelOnStepsCircleClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl;

.field private final mboundView0:Landroid/widget/LinearLayout;

.field private final mboundView10:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView11:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView13:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView14:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView3:Landroid/widget/FrameLayout;

.field private final mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView5:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView7:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f080160

    const/16 v2, 0xf

    .line 17
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

    .line 50
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x10

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 11
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

    const/16 v0, 0x9

    .line 53
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v0, 0xf

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v4, 0xa

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;)V

    const-wide/16 v0, -0x1

    .line 544
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    .line 61
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->caloriesCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;->setTag(Ljava/lang/Object;)V

    .line 62
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->currentDateTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 63
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    .line 64
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0xa

    .line 65
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mboundView10:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 66
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0xb

    .line 67
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mboundView11:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 68
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0xd

    .line 69
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mboundView13:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 70
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0xe

    .line 71
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mboundView14:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 72
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 73
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mboundView3:Landroid/widget/FrameLayout;

    .line 74
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x4

    .line 75
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 76
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x5

    .line 77
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mboundView5:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 78
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x7

    .line 79
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mboundView7:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 80
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0x8

    .line 81
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 82
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    .line 83
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->sleepCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;->setTag(Ljava/lang/Object;)V

    .line 84
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->stepsCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;->setTag(Ljava/lang/Object;)V

    .line 85
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->todayTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    .line 86
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 88
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewModelBodyPowerField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelBodyPowerField",
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

    .line 176
    monitor-enter p0

    .line 177
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    .line 178
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

    .line 239
    monitor-enter p0

    .line 240
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x200

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    .line 241
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

    .line 194
    monitor-enter p0

    .line 195
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x10

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    .line 196
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

.method private onChangeViewModelHeartBeatField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelHeartBeatField",
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

    .line 212
    monitor-enter p0

    .line 213
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x40

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    .line 214
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

.method private onChangeViewModelSelectedDateSubTitle(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelSelectedDateSubTitle",
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

    .line 203
    monitor-enter p0

    .line 204
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x20

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    .line 205
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

.method private onChangeViewModelSelectedDateTitle(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelSelectedDateTitle",
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

    .line 185
    monitor-enter p0

    .line 186
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x8

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    .line 187
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

    .line 230
    monitor-enter p0

    .line 231
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x100

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    .line 232
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

.method private onChangeViewModelSleepPercentageField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelSleepPercentageField",
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

    .line 158
    monitor-enter p0

    .line 159
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    .line 160
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

.method private onChangeViewModelSolarPowerField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelSolarPowerField",
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

    .line 167
    monitor-enter p0

    .line 168
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    .line 169
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

    .line 221
    monitor-enter p0

    .line 222
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x80

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    .line 223
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
    .locals 46

    move-object/from16 v1, p0

    .line 250
    monitor-enter p0

    .line 251
    :try_start_0
    iget-wide v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 252
    iput-wide v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    .line 253
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 277
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;

    const-wide/16 v6, 0xfff

    and-long/2addr v6, v2

    const-wide/16 v12, 0xc08

    const-wide/16 v16, 0xc04

    const-wide/16 v18, 0xc40

    const-wide/16 v20, 0xc02

    const-wide/16 v22, 0xe00

    const-wide/16 v24, 0xc20

    const-wide/16 v26, 0xc01

    const-wide/16 v28, 0xc00

    const/16 v30, 0x0

    cmp-long v31, v6, v4

    if-eqz v31, :cond_1b

    and-long v6, v2, v26

    cmp-long v31, v6, v4

    if-eqz v31, :cond_1

    if-eqz v0, :cond_0

    .line 287
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->getSleepPercentageField()Landroidx/databinding/ObservableField;

    move-result-object v6

    goto :goto_0

    :cond_0
    move-object/from16 v6, v30

    :goto_0
    const/4 v7, 0x0

    .line 289
    invoke-virtual {v1, v7, v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v6, :cond_1

    .line 294
    invoke-virtual {v6}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v6, v30

    :goto_1
    and-long v31, v2, v28

    cmp-long v7, v31, v4

    if-eqz v7, :cond_6

    if-eqz v0, :cond_6

    .line 301
    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mViewModelOnStepsCircleClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl;

    if-nez v7, :cond_2

    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl;

    invoke-direct {v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mViewModelOnStepsCircleClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl;

    :cond_2
    invoke-virtual {v7, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl;

    move-result-object v7

    .line 303
    iget-object v14, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mViewModelOnCaloriesCircleClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl1;

    if-nez v14, :cond_3

    new-instance v14, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl1;

    invoke-direct {v14}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl1;-><init>()V

    iput-object v14, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mViewModelOnCaloriesCircleClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl1;

    :cond_3
    invoke-virtual {v14, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl1;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl1;

    move-result-object v14

    .line 305
    iget-object v15, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mViewModelOnSleepCircleClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl2;

    if-nez v15, :cond_4

    new-instance v15, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl2;

    invoke-direct {v15}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl2;-><init>()V

    iput-object v15, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mViewModelOnSleepCircleClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl2;

    :cond_4
    invoke-virtual {v15, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl2;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl2;

    move-result-object v15

    .line 307
    iget-object v8, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mViewModelOnPowerCircleClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl3;

    if-nez v8, :cond_5

    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl3;

    invoke-direct {v8}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl3;-><init>()V

    iput-object v8, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mViewModelOnPowerCircleClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl3;

    :cond_5
    invoke-virtual {v8, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl3;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl3;

    move-result-object v8

    goto :goto_2

    :cond_6
    move-object/from16 v7, v30

    move-object v8, v7

    move-object v14, v8

    move-object v15, v14

    :goto_2
    and-long v35, v2, v20

    cmp-long v9, v35, v4

    if-eqz v9, :cond_8

    if-eqz v0, :cond_7

    .line 314
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->getSolarPowerField()Landroidx/databinding/ObservableField;

    move-result-object v9

    goto :goto_3

    :cond_7
    move-object/from16 v9, v30

    :goto_3
    const/4 v10, 0x1

    .line 316
    invoke-virtual {v1, v10, v9}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v9, :cond_8

    .line 321
    invoke-virtual {v9}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    goto :goto_4

    :cond_8
    move-object/from16 v9, v30

    :goto_4
    and-long v10, v2, v16

    cmp-long v37, v10, v4

    if-eqz v37, :cond_a

    if-eqz v0, :cond_9

    .line 328
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->getBodyPowerField()Landroidx/databinding/ObservableField;

    move-result-object v10

    goto :goto_5

    :cond_9
    move-object/from16 v10, v30

    :goto_5
    const/4 v11, 0x2

    .line 330
    invoke-virtual {v1, v11, v10}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v10, :cond_a

    .line 335
    invoke-virtual {v10}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    goto :goto_6

    :cond_a
    move-object/from16 v10, v30

    :goto_6
    and-long v37, v2, v12

    cmp-long v11, v37, v4

    if-eqz v11, :cond_c

    if-eqz v0, :cond_b

    .line 342
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->getSelectedDateTitle()Landroidx/databinding/ObservableField;

    move-result-object v11

    goto :goto_7

    :cond_b
    move-object/from16 v11, v30

    :goto_7
    const/4 v12, 0x3

    .line 344
    invoke-virtual {v1, v12, v11}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v11, :cond_c

    .line 349
    invoke-virtual {v11}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    goto :goto_8

    :cond_c
    move-object/from16 v11, v30

    :goto_8
    const-wide/16 v12, 0xc10

    and-long v39, v2, v12

    cmp-long v12, v39, v4

    if-eqz v12, :cond_e

    if-eqz v0, :cond_d

    .line 356
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->getDistanceField()Landroidx/databinding/ObservableField;

    move-result-object v12

    goto :goto_9

    :cond_d
    move-object/from16 v12, v30

    :goto_9
    const/4 v13, 0x4

    .line 358
    invoke-virtual {v1, v13, v12}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v12, :cond_e

    .line 363
    invoke-virtual {v12}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    goto :goto_a

    :cond_e
    move-object/from16 v12, v30

    :goto_a
    and-long v39, v2, v24

    cmp-long v13, v39, v4

    if-eqz v13, :cond_10

    if-eqz v0, :cond_f

    .line 370
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->getSelectedDateSubTitle()Landroidx/databinding/ObservableField;

    move-result-object v13

    goto :goto_b

    :cond_f
    move-object/from16 v13, v30

    :goto_b
    const/4 v4, 0x5

    .line 372
    invoke-virtual {v1, v4, v13}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v13, :cond_10

    .line 377
    invoke-virtual {v13}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_c

    :cond_10
    move-object/from16 v4, v30

    :goto_c
    and-long v41, v2, v18

    const-wide/16 v39, 0x0

    cmp-long v5, v41, v39

    if-eqz v5, :cond_12

    if-eqz v0, :cond_11

    .line 384
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->getHeartBeatField()Landroidx/databinding/ObservableField;

    move-result-object v5

    goto :goto_d

    :cond_11
    move-object/from16 v5, v30

    :goto_d
    const/4 v13, 0x6

    .line 386
    invoke-virtual {v1, v13, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_12

    .line 391
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    goto :goto_e

    :cond_12
    move-object/from16 v5, v30

    :goto_e
    const-wide/16 v33, 0xc80

    and-long v41, v2, v33

    const-wide/16 v39, 0x0

    cmp-long v13, v41, v39

    if-eqz v13, :cond_14

    if-eqz v0, :cond_13

    .line 398
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->getStepsField()Landroidx/databinding/ObservableField;

    move-result-object v13

    move-object/from16 v41, v4

    goto :goto_f

    :cond_13
    move-object/from16 v41, v4

    move-object/from16 v13, v30

    :goto_f
    const/4 v4, 0x7

    .line 400
    invoke-virtual {v1, v4, v13}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v13, :cond_15

    .line 405
    invoke-virtual {v13}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_10

    :cond_14
    move-object/from16 v41, v4

    :cond_15
    move-object/from16 v4, v30

    :goto_10
    const-wide/16 v31, 0xd00

    and-long v42, v2, v31

    const-wide/16 v39, 0x0

    cmp-long v13, v42, v39

    if-eqz v13, :cond_17

    if-eqz v0, :cond_16

    .line 412
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->getSleepField()Landroidx/databinding/ObservableField;

    move-result-object v13

    move-object/from16 v42, v4

    goto :goto_11

    :cond_16
    move-object/from16 v42, v4

    move-object/from16 v13, v30

    :goto_11
    const/16 v4, 0x8

    .line 414
    invoke-virtual {v1, v4, v13}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v13, :cond_18

    .line 419
    invoke-virtual {v13}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_12

    :cond_17
    move-object/from16 v42, v4

    :cond_18
    move-object/from16 v4, v30

    :goto_12
    and-long v43, v2, v22

    const-wide/16 v39, 0x0

    cmp-long v13, v43, v39

    if-eqz v13, :cond_1a

    if-eqz v0, :cond_19

    .line 426
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->getCaloriesField()Landroidx/databinding/ObservableField;

    move-result-object v0

    goto :goto_13

    :cond_19
    move-object/from16 v0, v30

    :goto_13
    const/16 v13, 0x9

    .line 428
    invoke-virtual {v1, v13, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v0, :cond_1a

    .line 433
    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v30, v0

    check-cast v30, Ljava/lang/String;

    :cond_1a
    move-object/from16 v45, v11

    move-object v13, v12

    move-object/from16 v0, v41

    move-object/from16 v12, v42

    move-object v11, v9

    move-object v9, v6

    move-object v6, v4

    move-object/from16 v4, v30

    goto :goto_14

    :cond_1b
    move-object/from16 v0, v30

    move-object v4, v0

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v45, v15

    :goto_14
    and-long v28, v2, v28

    const-wide/16 v39, 0x0

    cmp-long v30, v28, v39

    move-object/from16 v28, v13

    if-eqz v30, :cond_1c

    .line 441
    iget-object v13, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->caloriesCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    invoke-virtual {v13, v14}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 442
    iget-object v13, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mboundView3:Landroid/widget/FrameLayout;

    invoke-virtual {v13, v8}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 443
    iget-object v8, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->sleepCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    invoke-virtual {v8, v15}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 444
    iget-object v8, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->stepsCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    invoke-virtual {v8, v7}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1c
    and-long v7, v2, v24

    const-wide/16 v13, 0x0

    cmp-long v15, v7, v13

    if-eqz v15, :cond_1d

    .line 449
    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->currentDateTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v7, v0}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_1d
    and-long v7, v2, v22

    cmp-long v0, v7, v13

    if-eqz v0, :cond_1e

    .line 454
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mboundView10:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_1e
    and-long v7, v2, v18

    cmp-long v0, v7, v13

    if-eqz v0, :cond_1f

    .line 459
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mboundView11:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v5}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_1f
    const-wide/16 v4, 0xd00

    and-long/2addr v4, v2

    cmp-long v0, v4, v13

    if-eqz v0, :cond_20

    .line 464
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mboundView13:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v6}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_20
    and-long v4, v2, v26

    cmp-long v0, v4, v13

    if-eqz v0, :cond_21

    .line 469
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mboundView14:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v9}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_21
    and-long v4, v2, v16

    cmp-long v0, v4, v13

    if-eqz v0, :cond_22

    .line 474
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_22
    and-long v4, v2, v20

    cmp-long v0, v4, v13

    if-eqz v0, :cond_23

    .line 479
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mboundView5:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_23
    const-wide/16 v4, 0xc80

    and-long/2addr v4, v2

    cmp-long v0, v4, v13

    if-eqz v0, :cond_24

    .line 484
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mboundView7:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v12}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_24
    const-wide/16 v4, 0xc10

    and-long/2addr v4, v2

    cmp-long v0, v4, v13

    if-eqz v0, :cond_25

    .line 489
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-object/from16 v12, v28

    invoke-static {v0, v12}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_25
    const-wide/16 v4, 0xc08

    and-long/2addr v2, v4

    cmp-long v0, v2, v13

    if-eqz v0, :cond_26

    .line 494
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->todayTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-object/from16 v11, v45

    invoke-static {v0, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_26
    return-void

    :catchall_0
    move-exception v0

    .line 253
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 101
    monitor-enter p0

    .line 102
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 103
    monitor-exit p0

    return v0

    .line 105
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

    .line 93
    monitor-enter p0

    const-wide/16 v0, 0x800

    .line 94
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    .line 95
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 95
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

    .line 152
    :pswitch_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->onChangeViewModelCaloriesField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 150
    :pswitch_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->onChangeViewModelSleepField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 148
    :pswitch_2
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->onChangeViewModelStepsField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 146
    :pswitch_3
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->onChangeViewModelHeartBeatField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 144
    :pswitch_4
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->onChangeViewModelSelectedDateSubTitle(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 142
    :pswitch_5
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->onChangeViewModelDistanceField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 140
    :pswitch_6
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->onChangeViewModelSelectedDateTitle(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 138
    :pswitch_7
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->onChangeViewModelBodyPowerField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 136
    :pswitch_8
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->onChangeViewModelSolarPowerField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 134
    :pswitch_9
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->onChangeViewModelSleepPercentageField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
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

    .line 113
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 122
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;

    .line 123
    monitor-enter p0

    .line 124
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x400

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->mDirtyFlags:J

    .line 125
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 126
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;->notifyPropertyChanged(I)V

    .line 127
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 125
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
