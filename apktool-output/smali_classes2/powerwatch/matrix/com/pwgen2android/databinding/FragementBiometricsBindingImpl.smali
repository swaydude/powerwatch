.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBinding;
.source "FragementBiometricsBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl4;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl3;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl2;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl1;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private mViewModelOnAgeClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl;

.field private mViewModelOnGenderClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl4;

.field private mViewModelOnHeightClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl2;

.field private mViewModelOnLanguageClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl1;

.field private mViewModelOnWeightClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl3;

.field private final mboundView0:Landroid/widget/LinearLayout;

.field private final mboundView1:Landroid/widget/FrameLayout;

.field private final mboundView10:Landroid/widget/FrameLayout;

.field private final mboundView11:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView12:Landroid/widget/TextView;

.field private final mboundView13:Landroid/widget/FrameLayout;

.field private final mboundView14:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView15:Landroid/widget/TextView;

.field private final mboundView16:Landroid/view/View;

.field private final mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView3:Landroid/widget/TextView;

.field private final mboundView4:Landroid/widget/FrameLayout;

.field private final mboundView5:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView6:Landroid/widget/TextView;

.field private final mboundView7:Landroid/widget/FrameLayout;

.field private final mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView9:Landroid/widget/TextView;


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

    .line 64
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x11

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

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

    const/4 v0, 0x7

    .line 67
    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    const-wide/16 v1, -0x1

    .line 495
    iput-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mDirtyFlags:J

    const/4 p1, 0x0

    .line 69
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    .line 70
    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 71
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView1:Landroid/widget/FrameLayout;

    .line 72
    invoke-virtual {p1, v1}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0xa

    .line 73
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView10:Landroid/widget/FrameLayout;

    .line 74
    invoke-virtual {p1, v1}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0xb

    .line 75
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView11:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 76
    invoke-virtual {p1, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0xc

    .line 77
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView12:Landroid/widget/TextView;

    .line 78
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0xd

    .line 79
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView13:Landroid/widget/FrameLayout;

    .line 80
    invoke-virtual {p1, v1}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0xe

    .line 81
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView14:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 82
    invoke-virtual {p1, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0xf

    .line 83
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView15:Landroid/widget/TextView;

    .line 84
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0x10

    .line 85
    aget-object p1, p3, p1

    check-cast p1, Landroid/view/View;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView16:Landroid/view/View;

    .line 86
    invoke-virtual {p1, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 87
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 88
    invoke-virtual {p1, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 89
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 90
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x4

    .line 91
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView4:Landroid/widget/FrameLayout;

    .line 92
    invoke-virtual {p1, v1}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x5

    .line 93
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView5:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 94
    invoke-virtual {p1, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x6

    .line 95
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView6:Landroid/widget/TextView;

    .line 96
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 97
    aget-object p1, p3, v0

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView7:Landroid/widget/FrameLayout;

    .line 98
    invoke-virtual {p1, v1}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0x8

    .line 99
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 100
    invoke-virtual {p1, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0x9

    .line 101
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView9:Landroid/widget/TextView;

    .line 102
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 103
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 105
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewModelAge(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelAge",
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

    .line 205
    monitor-enter p0

    .line 206
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x10

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mDirtyFlags:J

    .line 207
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

.method private onChangeViewModelGender(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelGender",
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

    .line 196
    monitor-enter p0

    .line 197
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x8

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelHeight(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelHeight",
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

    .line 223
    monitor-enter p0

    .line 224
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x40

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mDirtyFlags:J

    .line 225
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

.method private onChangeViewModelLanguage(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelLanguage",
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
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelLanguageShown(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelLanguageShown",
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
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelTextColor(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelTextColor",
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

    .line 169
    monitor-enter p0

    .line 170
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelWeight(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelWeight",
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

    .line 214
    monitor-enter p0

    .line 215
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x20

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mDirtyFlags:J

    .line 216
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
    .locals 38

    move-object/from16 v1, p0

    .line 234
    monitor-enter p0

    .line 235
    :try_start_0
    iget-wide v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 236
    iput-wide v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mDirtyFlags:J

    .line 237
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 256
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    const-wide/16 v6, 0x1ff

    and-long/2addr v6, v2

    const-wide/16 v14, 0x184

    const-wide/16 v16, 0x182

    const-wide/16 v18, 0x188

    const-wide/16 v20, 0x181

    const-wide/16 v22, 0x180

    const/4 v8, 0x0

    cmp-long v26, v6, v4

    if-eqz v26, :cond_16

    and-long v6, v2, v22

    cmp-long v26, v6, v4

    if-eqz v26, :cond_5

    if-eqz v0, :cond_5

    .line 268
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mViewModelOnAgeClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl;

    if-nez v6, :cond_0

    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl;

    invoke-direct {v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mViewModelOnAgeClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl;

    :cond_0
    invoke-virtual {v6, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl;

    move-result-object v6

    .line 270
    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mViewModelOnLanguageClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl1;

    if-nez v7, :cond_1

    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl1;

    invoke-direct {v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl1;-><init>()V

    iput-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mViewModelOnLanguageClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl1;

    :cond_1
    invoke-virtual {v7, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl1;->setValue(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl1;

    move-result-object v7

    .line 272
    iget-object v9, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mViewModelOnHeightClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl2;

    if-nez v9, :cond_2

    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl2;

    invoke-direct {v9}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl2;-><init>()V

    iput-object v9, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mViewModelOnHeightClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl2;

    :cond_2
    invoke-virtual {v9, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl2;->setValue(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl2;

    move-result-object v9

    .line 274
    iget-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mViewModelOnWeightClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl3;

    if-nez v12, :cond_3

    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl3;

    invoke-direct {v12}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl3;-><init>()V

    iput-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mViewModelOnWeightClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl3;

    :cond_3
    invoke-virtual {v12, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl3;->setValue(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl3;

    move-result-object v12

    .line 276
    iget-object v13, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mViewModelOnGenderClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl4;

    if-nez v13, :cond_4

    new-instance v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl4;

    invoke-direct {v13}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl4;-><init>()V

    iput-object v13, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mViewModelOnGenderClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl4;

    :cond_4
    invoke-virtual {v13, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl4;->setValue(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl$OnClickListenerImpl4;

    move-result-object v13

    goto :goto_0

    :cond_5
    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_0
    and-long v29, v2, v20

    cmp-long v31, v29, v4

    if-eqz v31, :cond_8

    if-eqz v0, :cond_6

    .line 283
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->getTextColor()Landroidx/databinding/ObservableField;

    move-result-object v29

    move-object/from16 v10, v29

    goto :goto_1

    :cond_6
    const/4 v10, 0x0

    .line 285
    :goto_1
    invoke-virtual {v1, v8, v10}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v10, :cond_7

    .line 290
    invoke-virtual {v10}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    goto :goto_2

    :cond_7
    const/4 v10, 0x0

    .line 295
    :goto_2
    invoke-static {v10}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Integer;)I

    move-result v10

    goto :goto_3

    :cond_8
    const/4 v10, 0x0

    :goto_3
    and-long v31, v2, v16

    cmp-long v11, v31, v4

    if-eqz v11, :cond_a

    if-eqz v0, :cond_9

    .line 301
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->getLanguage()Landroidx/databinding/ObservableField;

    move-result-object v11

    goto :goto_4

    :cond_9
    const/4 v11, 0x0

    :goto_4
    const/4 v8, 0x1

    .line 303
    invoke-virtual {v1, v8, v11}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v11, :cond_a

    .line 308
    invoke-virtual {v11}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    goto :goto_5

    :cond_a
    const/4 v8, 0x0

    :goto_5
    and-long v32, v2, v14

    cmp-long v11, v32, v4

    if-eqz v11, :cond_d

    if-eqz v0, :cond_b

    .line 315
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->getLanguageShown()Landroidx/databinding/ObservableField;

    move-result-object v11

    goto :goto_6

    :cond_b
    const/4 v11, 0x0

    :goto_6
    const/4 v14, 0x2

    .line 317
    invoke-virtual {v1, v14, v11}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v11, :cond_c

    .line 322
    invoke-virtual {v11}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    goto :goto_7

    :cond_c
    const/4 v11, 0x0

    .line 327
    :goto_7
    invoke-static {v11}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v11

    move/from16 v31, v11

    goto :goto_8

    :cond_d
    const/16 v31, 0x0

    :goto_8
    and-long v14, v2, v18

    cmp-long v11, v14, v4

    if-eqz v11, :cond_f

    if-eqz v0, :cond_e

    .line 333
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->getGender()Landroidx/databinding/ObservableField;

    move-result-object v11

    goto :goto_9

    :cond_e
    const/4 v11, 0x0

    :goto_9
    const/4 v14, 0x3

    .line 335
    invoke-virtual {v1, v14, v11}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v11, :cond_f

    .line 340
    invoke-virtual {v11}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    goto :goto_a

    :cond_f
    const/4 v11, 0x0

    :goto_a
    const-wide/16 v14, 0x190

    and-long v34, v2, v14

    cmp-long v14, v34, v4

    if-eqz v14, :cond_11

    if-eqz v0, :cond_10

    .line 347
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->getAge()Landroidx/databinding/ObservableField;

    move-result-object v14

    goto :goto_b

    :cond_10
    const/4 v14, 0x0

    :goto_b
    const/4 v15, 0x4

    .line 349
    invoke-virtual {v1, v15, v14}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v14, :cond_11

    .line 354
    invoke-virtual {v14}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    goto :goto_c

    :cond_11
    const/4 v14, 0x0

    :goto_c
    const-wide/16 v27, 0x1a0

    and-long v34, v2, v27

    cmp-long v15, v34, v4

    if-eqz v15, :cond_13

    if-eqz v0, :cond_12

    .line 361
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->getWeight()Landroidx/databinding/ObservableField;

    move-result-object v15

    goto :goto_d

    :cond_12
    const/4 v15, 0x0

    :goto_d
    const/4 v4, 0x5

    .line 363
    invoke-virtual {v1, v4, v15}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v15, :cond_13

    .line 368
    invoke-virtual {v15}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_e

    :cond_13
    const/4 v4, 0x0

    :goto_e
    const-wide/16 v24, 0x1c0

    and-long v36, v2, v24

    const-wide/16 v34, 0x0

    cmp-long v5, v36, v34

    if-eqz v5, :cond_15

    if-eqz v0, :cond_14

    .line 375
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->getHeight()Landroidx/databinding/ObservableField;

    move-result-object v0

    goto :goto_f

    :cond_14
    const/4 v0, 0x0

    :goto_f
    const/4 v5, 0x6

    .line 377
    invoke-virtual {v1, v5, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v0, :cond_15

    .line 382
    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v5, v8

    move v8, v10

    move-object v10, v4

    move-object v4, v9

    move-object v9, v12

    move-object v12, v0

    move/from16 v0, v31

    goto :goto_10

    :cond_15
    move-object v5, v8

    move v8, v10

    move/from16 v0, v31

    move-object v10, v4

    move-object v4, v9

    move-object v9, v12

    const/4 v12, 0x0

    goto :goto_10

    :cond_16
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

    :goto_10
    and-long v22, v2, v22

    const-wide/16 v34, 0x0

    cmp-long v15, v22, v34

    if-eqz v15, :cond_17

    .line 390
    iget-object v15, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView1:Landroid/widget/FrameLayout;

    invoke-virtual {v15, v9}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 391
    iget-object v9, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView10:Landroid/widget/FrameLayout;

    invoke-virtual {v9, v13}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 392
    iget-object v9, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView13:Landroid/widget/FrameLayout;

    invoke-virtual {v9, v7}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 393
    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView4:Landroid/widget/FrameLayout;

    invoke-virtual {v7, v4}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 394
    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView7:Landroid/widget/FrameLayout;

    invoke-virtual {v4, v6}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_17
    and-long v6, v2, v20

    const-wide/16 v20, 0x0

    cmp-long v4, v6, v20

    if-eqz v4, :cond_18

    .line 399
    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView11:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v4, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTextColor(I)V

    .line 400
    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView14:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v4, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTextColor(I)V

    .line 401
    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v4, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTextColor(I)V

    .line 402
    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView5:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v4, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTextColor(I)V

    .line 403
    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v4, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTextColor(I)V

    :cond_18
    and-long v6, v2, v18

    const-wide/16 v8, 0x0

    cmp-long v4, v6, v8

    if-eqz v4, :cond_19

    .line 408
    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView12:Landroid/widget/TextView;

    invoke-static {v4, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_19
    const-wide/16 v6, 0x184

    and-long/2addr v6, v2

    cmp-long v4, v6, v8

    if-eqz v4, :cond_1a

    .line 413
    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView13:Landroid/widget/FrameLayout;

    invoke-static {v4, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 414
    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView16:Landroid/view/View;

    invoke-static {v4, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_1a
    and-long v6, v2, v16

    cmp-long v0, v6, v8

    if-eqz v0, :cond_1b

    .line 419
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView15:Landroid/widget/TextView;

    invoke-static {v0, v5}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_1b
    const-wide/16 v4, 0x1a0

    and-long/2addr v4, v2

    cmp-long v0, v4, v8

    if-eqz v0, :cond_1c

    .line 424
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView3:Landroid/widget/TextView;

    invoke-static {v0, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_1c
    const-wide/16 v4, 0x1c0

    and-long/2addr v4, v2

    cmp-long v0, v4, v8

    if-eqz v0, :cond_1d

    .line 429
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView6:Landroid/widget/TextView;

    invoke-static {v0, v12}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_1d
    const-wide/16 v4, 0x190

    and-long/2addr v2, v4

    cmp-long v0, v2, v8

    if-eqz v0, :cond_1e

    .line 434
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mboundView9:Landroid/widget/TextView;

    invoke-static {v0, v14}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_1e
    return-void

    :catchall_0
    move-exception v0

    .line 237
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 118
    monitor-enter p0

    .line 119
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 120
    monitor-exit p0

    return v0

    .line 122
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

    .line 110
    monitor-enter p0

    const-wide/16 v0, 0x100

    .line 111
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mDirtyFlags:J

    .line 112
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 112
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

    .line 163
    :pswitch_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->onChangeViewModelHeight(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 161
    :pswitch_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->onChangeViewModelWeight(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 159
    :pswitch_2
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->onChangeViewModelAge(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 157
    :pswitch_3
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->onChangeViewModelGender(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 155
    :pswitch_4
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->onChangeViewModelLanguageShown(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 153
    :pswitch_5
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->onChangeViewModelLanguage(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 151
    :pswitch_6
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->onChangeViewModelTextColor(Landroidx/databinding/ObservableField;I)Z

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

    .line 130
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 139
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    .line 140
    monitor-enter p0

    .line 141
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x80

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->mDirtyFlags:J

    .line 142
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 143
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBindingImpl;->notifyPropertyChanged(I)V

    .line 144
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 142
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
