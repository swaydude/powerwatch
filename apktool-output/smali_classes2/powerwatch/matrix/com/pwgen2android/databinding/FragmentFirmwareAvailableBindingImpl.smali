.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBinding;
.source "FragmentFirmwareAvailableBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private mViewModelStartUpdateAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl$OnClickListenerImpl;

.field private final mboundView0:Landroid/widget/LinearLayout;

.field private final mboundView1:Landroid/widget/TextView;

.field private final mboundView10:Landroid/widget/TextView;

.field private final mboundView11:Landroid/widget/LinearLayout;

.field private final mboundView12:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView2:Landroid/widget/TextView;

.field private final mboundView3:Landroid/widget/TextView;

.field private final mboundView4:Landroid/widget/TextView;

.field private final mboundView5:Landroid/widget/TextView;

.field private final mboundView7:Landroid/widget/Button;

.field private final mboundView8:Landroid/widget/LinearLayout;

.field private final mboundView9:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f0801c7

    const/16 v2, 0xd

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

    .line 51
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0xe

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 7
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

    const/4 v0, 0x6

    .line 54
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ProgressBar;

    const/16 v4, 0xe

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/LinearLayout;Landroid/widget/ProgressBar;)V

    const-wide/16 v0, -0x1

    .line 674
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    .line 58
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->actionLayout:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 59
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    .line 60
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 61
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView1:Landroid/widget/TextView;

    .line 62
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0xa

    .line 63
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView10:Landroid/widget/TextView;

    .line 64
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0xb

    .line 65
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView11:Landroid/widget/LinearLayout;

    .line 66
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0xc

    .line 67
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView12:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 68
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 69
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 70
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 71
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 72
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x4

    .line 73
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView4:Landroid/widget/TextView;

    .line 74
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x5

    .line 75
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView5:Landroid/widget/TextView;

    .line 76
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x7

    .line 77
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView7:Landroid/widget/Button;

    .line 78
    invoke-virtual {p1, v0}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0x8

    .line 79
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView8:Landroid/widget/LinearLayout;

    .line 80
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0x9

    .line 81
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView9:Landroid/widget/TextView;

    .line 82
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 83
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 85
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewModelDisplayPreconditionsError(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelDisplayPreconditionsError",
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

    .line 262
    monitor-enter p0

    .line 263
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x800

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    .line 264
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

.method private onChangeViewModelFirmwareVersion(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelFirmwareVersion",
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

    .line 271
    monitor-enter p0

    .line 272
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    .line 273
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

.method private onChangeViewModelOtaFailed(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelOtaFailed",
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

    .line 190
    monitor-enter p0

    .line 191
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x8

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    .line 192
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

.method private onChangeViewModelOtaInProgress(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelOtaInProgress",
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

    .line 208
    monitor-enter p0

    .line 209
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x20

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    .line 210
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

.method private onChangeViewModelOtaStatus(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelOtaStatus",
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

    .line 280
    monitor-enter p0

    .line 281
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    .line 282
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

.method private onChangeViewModelReleaseInfo(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelReleaseInfo",
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

    .line 217
    monitor-enter p0

    .line 218
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x40

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    .line 219
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

.method private onChangeViewModelReleaseNotes(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelReleaseNotes",
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

    .line 181
    monitor-enter p0

    .line 182
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    .line 183
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

.method private onChangeViewModelUpdateAvailable(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelUpdateAvailable",
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

    .line 253
    monitor-enter p0

    .line 254
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x400

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    .line 255
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

.method private onChangeViewModelUpdateButtonEnabled(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelUpdateButtonEnabled",
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

    .line 235
    monitor-enter p0

    .line 236
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x100

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    .line 237
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

.method private onChangeViewModelUpdateButtonText(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelUpdateButtonText",
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

    .line 226
    monitor-enter p0

    .line 227
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x80

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    .line 228
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

.method private onChangeViewModelUpdateFailedReason(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelUpdateFailedReason",
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

    .line 244
    monitor-enter p0

    .line 245
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x200

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    .line 246
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

.method private onChangeViewModelUpdateInfo(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelUpdateInfo",
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

    .line 163
    monitor-enter p0

    .line 164
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    .line 165
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

.method private onChangeViewModelUpdatePhaseText(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelUpdatePhaseText",
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

    .line 199
    monitor-enter p0

    .line 200
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x10

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    .line 201
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

.method private onChangeViewModelUpdatePreconditionsErrorText(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelUpdatePreconditionsErrorText",
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

    .line 172
    monitor-enter p0

    .line 173
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    .line 174
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
    .locals 59

    move-object/from16 v1, p0

    .line 291
    monitor-enter p0

    .line 292
    :try_start_0
    iget-wide v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 293
    iput-wide v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    .line 294
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 330
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;

    const-wide/32 v6, 0xffff

    and-long/2addr v6, v2

    const-wide/32 v14, 0xc080

    const-wide/32 v16, 0xc040

    const-wide/32 v18, 0xd000

    const-wide/32 v20, 0xc020

    const-wide/32 v22, 0xc010

    const-wide/32 v24, 0xc800

    const-wide/32 v26, 0xc008

    const-wide/32 v28, 0xc004

    const-wide/32 v30, 0xc200

    const-wide/32 v32, 0xc002

    const-wide/32 v34, 0xc001

    const-wide/32 v36, 0xc400

    const/4 v10, 0x0

    cmp-long v40, v6, v4

    if-eqz v40, :cond_28

    and-long v6, v2, v34

    cmp-long v40, v6, v4

    if-eqz v40, :cond_1

    if-eqz v0, :cond_0

    .line 341
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdateInfo()Landroidx/databinding/ObservableField;

    move-result-object v6

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 343
    :goto_0
    invoke-virtual {v1, v10, v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v6, :cond_1

    .line 348
    invoke-virtual {v6}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    and-long v40, v2, v32

    cmp-long v7, v40, v4

    if-eqz v7, :cond_3

    if-eqz v0, :cond_2

    .line 355
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdatePreconditionsErrorText()Landroidx/databinding/ObservableField;

    move-result-object v7

    goto :goto_2

    :cond_2
    const/4 v7, 0x0

    :goto_2
    const/4 v10, 0x1

    .line 357
    invoke-virtual {v1, v10, v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v7, :cond_3

    .line 362
    invoke-virtual {v7}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    goto :goto_3

    :cond_3
    const/4 v7, 0x0

    :goto_3
    and-long v41, v2, v28

    cmp-long v10, v41, v4

    if-eqz v10, :cond_5

    if-eqz v0, :cond_4

    .line 369
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getReleaseNotes()Landroidx/databinding/ObservableField;

    move-result-object v10

    goto :goto_4

    :cond_4
    const/4 v10, 0x0

    :goto_4
    const/4 v11, 0x2

    .line 371
    invoke-virtual {v1, v11, v10}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v10, :cond_5

    .line 376
    invoke-virtual {v10}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    goto :goto_5

    :cond_5
    const/4 v10, 0x0

    :goto_5
    and-long v42, v2, v26

    cmp-long v11, v42, v4

    if-eqz v11, :cond_8

    if-eqz v0, :cond_6

    .line 383
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getOtaFailed()Landroidx/databinding/ObservableField;

    move-result-object v11

    goto :goto_6

    :cond_6
    const/4 v11, 0x0

    :goto_6
    const/4 v8, 0x3

    .line 385
    invoke-virtual {v1, v8, v11}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v11, :cond_7

    .line 390
    invoke-virtual {v11}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    goto :goto_7

    :cond_7
    const/4 v8, 0x0

    .line 395
    :goto_7
    invoke-static {v8}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v8

    goto :goto_8

    :cond_8
    const/4 v8, 0x0

    :goto_8
    and-long v44, v2, v22

    cmp-long v9, v44, v4

    if-eqz v9, :cond_a

    if-eqz v0, :cond_9

    .line 401
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdatePhaseText()Landroidx/databinding/ObservableField;

    move-result-object v9

    goto :goto_9

    :cond_9
    const/4 v9, 0x0

    :goto_9
    const/4 v11, 0x4

    .line 403
    invoke-virtual {v1, v11, v9}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v9, :cond_a

    .line 408
    invoke-virtual {v9}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    goto :goto_a

    :cond_a
    const/4 v9, 0x0

    :goto_a
    and-long v44, v2, v20

    cmp-long v11, v44, v4

    if-eqz v11, :cond_d

    if-eqz v0, :cond_b

    .line 415
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getOtaInProgress()Landroidx/databinding/ObservableField;

    move-result-object v11

    goto :goto_b

    :cond_b
    const/4 v11, 0x0

    :goto_b
    const/4 v12, 0x5

    .line 417
    invoke-virtual {v1, v12, v11}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v11, :cond_c

    .line 422
    invoke-virtual {v11}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    goto :goto_c

    :cond_c
    const/4 v11, 0x0

    .line 427
    :goto_c
    invoke-static {v11}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v11

    xor-int/lit8 v12, v11, 0x1

    .line 435
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-static {v12}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v12

    goto :goto_d

    :cond_d
    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_d
    and-long v46, v2, v16

    cmp-long v13, v46, v4

    if-eqz v13, :cond_f

    if-eqz v0, :cond_e

    .line 441
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getReleaseInfo()Landroidx/databinding/ObservableField;

    move-result-object v13

    goto :goto_e

    :cond_e
    const/4 v13, 0x0

    :goto_e
    const/4 v4, 0x6

    .line 443
    invoke-virtual {v1, v4, v13}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v13, :cond_f

    .line 448
    invoke-virtual {v13}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_f

    :cond_f
    const/4 v4, 0x0

    :goto_f
    and-long v48, v2, v14

    const-wide/16 v46, 0x0

    cmp-long v5, v48, v46

    if-eqz v5, :cond_11

    if-eqz v0, :cond_10

    .line 455
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdateButtonText()Landroidx/databinding/ObservableField;

    move-result-object v5

    goto :goto_10

    :cond_10
    const/4 v5, 0x0

    :goto_10
    const/4 v13, 0x7

    .line 457
    invoke-virtual {v1, v13, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_11

    .line 462
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    goto :goto_11

    :cond_11
    const/4 v5, 0x0

    :goto_11
    const-wide/32 v44, 0xc000

    and-long v48, v2, v44

    const-wide/16 v46, 0x0

    cmp-long v13, v48, v46

    if-eqz v13, :cond_13

    if-eqz v0, :cond_13

    .line 469
    iget-object v13, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mViewModelStartUpdateAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl$OnClickListenerImpl;

    if-nez v13, :cond_12

    new-instance v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl$OnClickListenerImpl;

    invoke-direct {v13}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v13, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mViewModelStartUpdateAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl$OnClickListenerImpl;

    :cond_12
    invoke-virtual {v13, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl$OnClickListenerImpl;

    move-result-object v13

    goto :goto_12

    :cond_13
    const/4 v13, 0x0

    :goto_12
    const-wide/32 v42, 0xc100

    and-long v48, v2, v42

    const-wide/16 v46, 0x0

    cmp-long v50, v48, v46

    if-eqz v50, :cond_19

    if-eqz v0, :cond_14

    .line 476
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdateButtonEnabled()Landroidx/databinding/ObservableField;

    move-result-object v48

    move-object/from16 v14, v48

    goto :goto_13

    :cond_14
    const/4 v14, 0x0

    :goto_13
    const/16 v15, 0x8

    .line 478
    invoke-virtual {v1, v15, v14}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v14, :cond_15

    .line 483
    invoke-virtual {v14}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    goto :goto_14

    :cond_15
    const/4 v14, 0x0

    .line 488
    :goto_14
    invoke-static {v14}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v14

    if-eqz v50, :cond_17

    if-eqz v14, :cond_16

    const-wide/32 v50, 0x20000

    goto :goto_15

    :cond_16
    const-wide/32 v50, 0x10000

    :goto_15
    or-long v2, v2, v50

    :cond_17
    if-eqz v14, :cond_18

    .line 500
    iget-object v15, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView7:Landroid/widget/Button;

    invoke-virtual {v15}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v15

    move-wide/from16 v50, v2

    const v2, 0x7f0700cf

    invoke-static {v15, v2}, Landroidx/appcompat/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_16

    :cond_18
    move-wide/from16 v50, v2

    iget-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView7:Landroid/widget/Button;

    invoke-virtual {v2}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f0700cc

    invoke-static {v2, v3}, Landroidx/appcompat/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    :goto_16
    move v15, v14

    move-object v14, v2

    move-wide/from16 v2, v50

    goto :goto_17

    :cond_19
    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_17
    and-long v50, v2, v30

    const-wide/16 v46, 0x0

    cmp-long v52, v50, v46

    if-eqz v52, :cond_1b

    if-eqz v0, :cond_1a

    .line 506
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdateFailedReason()Landroidx/databinding/ObservableField;

    move-result-object v50

    move-object/from16 v51, v5

    move-object/from16 v58, v50

    move-object/from16 v50, v4

    move-object/from16 v4, v58

    goto :goto_18

    :cond_1a
    move-object/from16 v50, v4

    move-object/from16 v51, v5

    const/4 v4, 0x0

    :goto_18
    const/16 v5, 0x9

    .line 508
    invoke-virtual {v1, v5, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v4, :cond_1c

    .line 513
    invoke-virtual {v4}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_19

    :cond_1b
    move-object/from16 v50, v4

    move-object/from16 v51, v5

    :cond_1c
    const/4 v4, 0x0

    :goto_19
    and-long v52, v2, v36

    const-wide/16 v46, 0x0

    cmp-long v5, v52, v46

    if-eqz v5, :cond_1f

    if-eqz v0, :cond_1d

    .line 520
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getUpdateAvailable()Landroidx/databinding/ObservableField;

    move-result-object v5

    move-object/from16 v52, v4

    goto :goto_1a

    :cond_1d
    move-object/from16 v52, v4

    const/4 v5, 0x0

    :goto_1a
    const/16 v4, 0xa

    .line 522
    invoke-virtual {v1, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_1e

    .line 527
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto :goto_1b

    :cond_1e
    const/4 v4, 0x0

    .line 532
    :goto_1b
    invoke-static {v4}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v4

    goto :goto_1c

    :cond_1f
    move-object/from16 v52, v4

    const/4 v4, 0x0

    :goto_1c
    and-long v53, v2, v24

    const-wide/16 v46, 0x0

    cmp-long v5, v53, v46

    if-eqz v5, :cond_22

    if-eqz v0, :cond_20

    .line 538
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getDisplayPreconditionsError()Landroidx/databinding/ObservableField;

    move-result-object v5

    move/from16 v53, v4

    goto :goto_1d

    :cond_20
    move/from16 v53, v4

    const/4 v5, 0x0

    :goto_1d
    const/16 v4, 0xb

    .line 540
    invoke-virtual {v1, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_21

    .line 545
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto :goto_1e

    :cond_21
    const/4 v4, 0x0

    .line 550
    :goto_1e
    invoke-static {v4}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v4

    goto :goto_1f

    :cond_22
    move/from16 v53, v4

    const/4 v4, 0x0

    :goto_1f
    and-long v54, v2, v18

    const-wide/16 v46, 0x0

    cmp-long v5, v54, v46

    if-eqz v5, :cond_24

    if-eqz v0, :cond_23

    .line 556
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getFirmwareVersion()Landroidx/databinding/ObservableField;

    move-result-object v5

    move/from16 v40, v4

    goto :goto_20

    :cond_23
    move/from16 v40, v4

    const/4 v5, 0x0

    :goto_20
    const/16 v4, 0xc

    .line 558
    invoke-virtual {v1, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_25

    .line 563
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_21

    :cond_24
    move/from16 v40, v4

    :cond_25
    const/4 v4, 0x0

    :goto_21
    const-wide/32 v38, 0xe000

    and-long v54, v2, v38

    const-wide/16 v46, 0x0

    cmp-long v5, v54, v46

    if-eqz v5, :cond_27

    if-eqz v0, :cond_26

    .line 570
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;->getOtaStatus()Landroidx/databinding/ObservableField;

    move-result-object v0

    goto :goto_22

    :cond_26
    const/4 v0, 0x0

    :goto_22
    const/16 v5, 0xd

    .line 572
    invoke-virtual {v1, v5, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v0, :cond_27

    .line 577
    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v5, v4

    move-object/from16 v57, v9

    move/from16 v41, v12

    move-object v12, v13

    move-object/from16 v9, v50

    move-object/from16 v56, v51

    move-object/from16 v4, v52

    move-object v13, v10

    move/from16 v10, v53

    move-object/from16 v58, v14

    move-object v14, v0

    move/from16 v0, v40

    move/from16 v40, v11

    move-object/from16 v11, v58

    goto :goto_23

    :cond_27
    move-object v5, v4

    move-object/from16 v57, v9

    move/from16 v41, v12

    move-object v12, v13

    move/from16 v0, v40

    move-object/from16 v9, v50

    move-object/from16 v56, v51

    move-object/from16 v4, v52

    move-object v13, v10

    move/from16 v40, v11

    move-object v11, v14

    move/from16 v10, v53

    const/4 v14, 0x0

    goto :goto_23

    :cond_28
    const/4 v0, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    :goto_23
    and-long v36, v2, v36

    const-wide/16 v46, 0x0

    cmp-long v50, v36, v46

    move-object/from16 v36, v12

    if-eqz v50, :cond_29

    .line 585
    iget-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->actionLayout:Landroid/widget/LinearLayout;

    invoke-static {v12, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_29
    and-long v34, v2, v34

    cmp-long v10, v34, v46

    if-eqz v10, :cond_2a

    .line 590
    iget-object v10, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView1:Landroid/widget/TextView;

    invoke-static {v10, v6}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_2a
    and-long v30, v2, v30

    cmp-long v6, v30, v46

    if-eqz v6, :cond_2b

    .line 595
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView10:Landroid/widget/TextView;

    invoke-static {v6, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_2b
    and-long v26, v2, v26

    cmp-long v4, v26, v46

    if-eqz v4, :cond_2c

    .line 600
    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView10:Landroid/widget/TextView;

    invoke-static {v4, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_2c
    and-long v24, v2, v24

    cmp-long v4, v24, v46

    if-eqz v4, :cond_2d

    .line 605
    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView11:Landroid/widget/LinearLayout;

    invoke-static {v4, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->showWithTimer(Landroid/view/View;Z)V

    :cond_2d
    and-long v24, v2, v32

    cmp-long v0, v24, v46

    if-eqz v0, :cond_2e

    .line 610
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView12:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v7}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_2e
    and-long v6, v2, v18

    cmp-long v0, v6, v46

    if-eqz v0, :cond_2f

    .line 615
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView2:Landroid/widget/TextView;

    invoke-static {v0, v5}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_2f
    and-long v4, v2, v16

    cmp-long v0, v4, v46

    if-eqz v0, :cond_30

    .line 620
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView3:Landroid/widget/TextView;

    invoke-static {v0, v9}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_30
    and-long v4, v2, v28

    cmp-long v0, v4, v46

    if-eqz v0, :cond_31

    .line 625
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView4:Landroid/widget/TextView;

    invoke-static {v0, v13}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_31
    const-wide/32 v4, 0xe000

    and-long/2addr v4, v2

    cmp-long v0, v4, v46

    if-eqz v0, :cond_32

    .line 630
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView5:Landroid/widget/TextView;

    invoke-static {v0, v14}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_32
    const-wide/32 v4, 0xc100

    and-long/2addr v4, v2

    cmp-long v0, v4, v46

    if-eqz v0, :cond_33

    .line 635
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView7:Landroid/widget/Button;

    invoke-static {v0, v11}, Landroidx/databinding/adapters/ViewBindingAdapter;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 636
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView7:Landroid/widget/Button;

    invoke-virtual {v0, v15}, Landroid/widget/Button;->setEnabled(Z)V

    :cond_33
    const-wide/32 v4, 0xc000

    and-long/2addr v4, v2

    cmp-long v0, v4, v46

    if-eqz v0, :cond_34

    .line 641
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView7:Landroid/widget/Button;

    move-object/from16 v13, v36

    invoke-virtual {v0, v13}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_34
    const-wide/32 v4, 0xc080

    and-long/2addr v4, v2

    cmp-long v0, v4, v46

    if-eqz v0, :cond_35

    .line 646
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView7:Landroid/widget/Button;

    move-object/from16 v4, v56

    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_35
    and-long v4, v2, v20

    cmp-long v0, v4, v46

    if-eqz v0, :cond_36

    .line 651
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView7:Landroid/widget/Button;

    move/from16 v12, v41

    invoke-static {v0, v12}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 652
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView8:Landroid/widget/LinearLayout;

    move/from16 v11, v40

    invoke-static {v0, v11}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_36
    and-long v2, v2, v22

    cmp-long v0, v2, v46

    if-eqz v0, :cond_37

    .line 657
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mboundView9:Landroid/widget/TextView;

    move-object/from16 v9, v57

    invoke-static {v0, v9}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_37
    return-void

    :catchall_0
    move-exception v0

    .line 294
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
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

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

    const-wide/32 v0, 0x8000

    .line 91
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    .line 92
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->requestRebind()V

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

    .line 157
    :pswitch_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->onChangeViewModelOtaStatus(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 155
    :pswitch_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->onChangeViewModelFirmwareVersion(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 153
    :pswitch_2
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->onChangeViewModelDisplayPreconditionsError(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 151
    :pswitch_3
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->onChangeViewModelUpdateAvailable(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 149
    :pswitch_4
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->onChangeViewModelUpdateFailedReason(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 147
    :pswitch_5
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->onChangeViewModelUpdateButtonEnabled(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 145
    :pswitch_6
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->onChangeViewModelUpdateButtonText(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 143
    :pswitch_7
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->onChangeViewModelReleaseInfo(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 141
    :pswitch_8
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->onChangeViewModelOtaInProgress(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 139
    :pswitch_9
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->onChangeViewModelUpdatePhaseText(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 137
    :pswitch_a
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->onChangeViewModelOtaFailed(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 135
    :pswitch_b
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->onChangeViewModelReleaseNotes(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 133
    :pswitch_c
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->onChangeViewModelUpdatePreconditionsErrorText(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 131
    :pswitch_d
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->onChangeViewModelUpdateInfo(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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

    .line 110
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;)V
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
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;

    .line 120
    monitor-enter p0

    .line 121
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x4000

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->mDirtyFlags:J

    .line 122
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 123
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBindingImpl;->notifyPropertyChanged(I)V

    .line 124
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBinding;->requestRebind()V

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
