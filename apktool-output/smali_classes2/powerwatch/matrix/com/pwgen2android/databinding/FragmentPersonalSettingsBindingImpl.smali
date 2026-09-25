.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;
.source "FragmentPersonalSettingsBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl4;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl3;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl2;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl1;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private mViewModelOnAgeClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl;

.field private mViewModelOnGenderClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl3;

.field private mViewModelOnHeightClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl1;

.field private mViewModelOnSleepTimeClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl4;

.field private mViewModelOnWeightClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl2;

.field private final mboundView0:Landroid/widget/LinearLayout;

.field private final mboundView1:Landroid/widget/RelativeLayout;

.field private final mboundView10:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView3:Landroid/widget/RelativeLayout;

.field private final mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView5:Landroid/widget/RelativeLayout;

.field private final mboundView6:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView7:Landroid/widget/RelativeLayout;

.field private final mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView9:Landroid/widget/RelativeLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f080077

    const/16 v2, 0xb

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f08006a

    const/16 v2, 0xc

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f08005e

    const/16 v2, 0xd

    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080068

    const/16 v2, 0xe

    .line 20
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080073

    const/16 v2, 0xf

    .line 21
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

    .line 57
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x10

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 10
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

    const/16 v0, 0xd

    .line 60
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    const/16 v0, 0xe

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    const/16 v0, 0xf

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/ImageView;

    const/4 v4, 0x5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;)V

    const-wide/16 v0, -0x1

    .line 402
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mDirtyFlags:J

    const/4 p1, 0x0

    .line 67
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    .line 68
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 69
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mboundView1:Landroid/widget/RelativeLayout;

    .line 70
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0xa

    .line 71
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mboundView10:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 72
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 73
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 74
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 75
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mboundView3:Landroid/widget/RelativeLayout;

    .line 76
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x4

    .line 77
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 78
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x5

    .line 79
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mboundView5:Landroid/widget/RelativeLayout;

    .line 80
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x6

    .line 81
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mboundView6:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 82
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x7

    .line 83
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mboundView7:Landroid/widget/RelativeLayout;

    .line 84
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0x8

    .line 85
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 86
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0x9

    .line 87
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mboundView9:Landroid/widget/RelativeLayout;

    .line 88
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 89
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 91
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewModelAgeField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelAgeField",
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

    .line 151
    monitor-enter p0

    .line 152
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelGenderField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelGenderField",
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
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x8

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelHeightField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelHeightField",
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

    .line 169
    monitor-enter p0

    .line 170
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelSleepTimeField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelSleepTimeField",
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

    .line 187
    monitor-enter p0

    .line 188
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x10

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelWeightField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelWeightField",
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

    .line 160
    monitor-enter p0

    .line 161
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mDirtyFlags:J

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


# virtual methods
.method protected executeBindings()V
    .locals 31

    move-object/from16 v1, p0

    .line 198
    monitor-enter p0

    .line 199
    :try_start_0
    iget-wide v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 200
    iput-wide v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mDirtyFlags:J

    .line 201
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 215
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;

    const-wide/16 v6, 0x7f

    and-long/2addr v6, v2

    const-wide/16 v12, 0x62

    const-wide/16 v14, 0x61

    const-wide/16 v16, 0x70

    const-wide/16 v18, 0x60

    const/16 v20, 0x0

    cmp-long v21, v6, v4

    if-eqz v21, :cond_10

    and-long v6, v2, v18

    cmp-long v21, v6, v4

    if-eqz v21, :cond_5

    if-eqz v0, :cond_5

    .line 226
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mViewModelOnAgeClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl;

    if-nez v6, :cond_0

    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl;

    invoke-direct {v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mViewModelOnAgeClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl;

    :cond_0
    invoke-virtual {v6, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl;

    move-result-object v6

    .line 228
    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mViewModelOnHeightClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl1;

    if-nez v7, :cond_1

    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl1;

    invoke-direct {v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl1;-><init>()V

    iput-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mViewModelOnHeightClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl1;

    :cond_1
    invoke-virtual {v7, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl1;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl1;

    move-result-object v7

    .line 230
    iget-object v8, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mViewModelOnWeightClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl2;

    if-nez v8, :cond_2

    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl2;

    invoke-direct {v8}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl2;-><init>()V

    iput-object v8, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mViewModelOnWeightClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl2;

    :cond_2
    invoke-virtual {v8, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl2;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl2;

    move-result-object v8

    .line 232
    iget-object v9, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mViewModelOnGenderClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl3;

    if-nez v9, :cond_3

    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl3;

    invoke-direct {v9}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl3;-><init>()V

    iput-object v9, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mViewModelOnGenderClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl3;

    :cond_3
    invoke-virtual {v9, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl3;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl3;

    move-result-object v9

    .line 234
    iget-object v10, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mViewModelOnSleepTimeClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl4;

    if-nez v10, :cond_4

    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl4;

    invoke-direct {v10}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl4;-><init>()V

    iput-object v10, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mViewModelOnSleepTimeClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl4;

    :cond_4
    invoke-virtual {v10, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl4;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl$OnClickListenerImpl4;

    move-result-object v10

    goto :goto_0

    :cond_5
    move-object/from16 v6, v20

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    :goto_0
    and-long v25, v2, v14

    cmp-long v11, v25, v4

    if-eqz v11, :cond_7

    if-eqz v0, :cond_6

    .line 241
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->getAgeField()Landroidx/databinding/ObservableField;

    move-result-object v11

    goto :goto_1

    :cond_6
    move-object/from16 v11, v20

    :goto_1
    const/4 v14, 0x0

    .line 243
    invoke-virtual {v1, v14, v11}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v11, :cond_7

    .line 248
    invoke-virtual {v11}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    goto :goto_2

    :cond_7
    move-object/from16 v11, v20

    :goto_2
    and-long v14, v2, v12

    cmp-long v27, v14, v4

    if-eqz v27, :cond_9

    if-eqz v0, :cond_8

    .line 255
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->getWeightField()Landroidx/databinding/ObservableField;

    move-result-object v14

    goto :goto_3

    :cond_8
    move-object/from16 v14, v20

    :goto_3
    const/4 v15, 0x1

    .line 257
    invoke-virtual {v1, v15, v14}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v14, :cond_9

    .line 262
    invoke-virtual {v14}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    goto :goto_4

    :cond_9
    move-object/from16 v14, v20

    :goto_4
    const-wide/16 v23, 0x64

    and-long v27, v2, v23

    cmp-long v15, v27, v4

    if-eqz v15, :cond_b

    if-eqz v0, :cond_a

    .line 269
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->getHeightField()Landroidx/databinding/ObservableField;

    move-result-object v15

    goto :goto_5

    :cond_a
    move-object/from16 v15, v20

    :goto_5
    const/4 v12, 0x2

    .line 271
    invoke-virtual {v1, v12, v15}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v15, :cond_b

    .line 276
    invoke-virtual {v15}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    goto :goto_6

    :cond_b
    move-object/from16 v12, v20

    :goto_6
    const-wide/16 v21, 0x68

    and-long v29, v2, v21

    cmp-long v13, v29, v4

    if-eqz v13, :cond_d

    if-eqz v0, :cond_c

    .line 283
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->getGenderField()Landroidx/databinding/ObservableField;

    move-result-object v13

    goto :goto_7

    :cond_c
    move-object/from16 v13, v20

    :goto_7
    const/4 v15, 0x3

    .line 285
    invoke-virtual {v1, v15, v13}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v13, :cond_d

    .line 290
    invoke-virtual {v13}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    goto :goto_8

    :cond_d
    move-object/from16 v13, v20

    :goto_8
    and-long v29, v2, v16

    cmp-long v15, v29, v4

    if-eqz v15, :cond_f

    if-eqz v0, :cond_e

    .line 297
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;->getSleepTimeField()Landroidx/databinding/ObservableField;

    move-result-object v0

    goto :goto_9

    :cond_e
    move-object/from16 v0, v20

    :goto_9
    const/4 v15, 0x4

    .line 299
    invoke-virtual {v1, v15, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v0, :cond_f

    .line 304
    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Ljava/lang/String;

    :cond_f
    move-object/from16 v0, v20

    goto :goto_a

    :cond_10
    move-object/from16 v0, v20

    move-object v6, v0

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    :goto_a
    and-long v18, v2, v18

    cmp-long v15, v18, v4

    if-eqz v15, :cond_11

    .line 312
    iget-object v15, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mboundView1:Landroid/widget/RelativeLayout;

    invoke-virtual {v15, v8}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 313
    iget-object v8, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mboundView3:Landroid/widget/RelativeLayout;

    invoke-virtual {v8, v7}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 314
    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mboundView5:Landroid/widget/RelativeLayout;

    invoke-virtual {v7, v6}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 315
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mboundView7:Landroid/widget/RelativeLayout;

    invoke-virtual {v6, v9}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 316
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mboundView9:Landroid/widget/RelativeLayout;

    invoke-virtual {v6, v10}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_11
    and-long v6, v2, v16

    cmp-long v8, v6, v4

    if-eqz v8, :cond_12

    .line 321
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mboundView10:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v6, v0}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_12
    const-wide/16 v6, 0x62

    and-long/2addr v6, v2

    cmp-long v0, v6, v4

    if-eqz v0, :cond_13

    .line 326
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v14}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_13
    const-wide/16 v6, 0x64

    and-long/2addr v6, v2

    cmp-long v0, v6, v4

    if-eqz v0, :cond_14

    .line 331
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v12}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_14
    const-wide/16 v6, 0x61

    and-long/2addr v6, v2

    cmp-long v0, v6, v4

    if-eqz v0, :cond_15

    .line 336
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mboundView6:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_15
    const-wide/16 v6, 0x68

    and-long/2addr v2, v6

    cmp-long v0, v2, v4

    if-eqz v0, :cond_16

    .line 341
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v13}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_16
    return-void

    :catchall_0
    move-exception v0

    .line 201
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 104
    monitor-enter p0

    .line 105
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 106
    monitor-exit p0

    return v0

    .line 108
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

    .line 96
    monitor-enter p0

    const-wide/16 v0, 0x40

    .line 97
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mDirtyFlags:J

    .line 98
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 98
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

    if-eqz p1, :cond_4

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 145
    :cond_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->onChangeViewModelSleepTimeField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 143
    :cond_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->onChangeViewModelGenderField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 141
    :cond_2
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->onChangeViewModelHeightField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 139
    :cond_3
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->onChangeViewModelWeightField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 137
    :cond_4
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->onChangeViewModelAgeField(Landroidx/databinding/ObservableField;I)Z

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

    .line 116
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 125
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/personal/PersonalSettingsVM;

    .line 126
    monitor-enter p0

    .line 127
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x20

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->mDirtyFlags:J

    .line 128
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 129
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBindingImpl;->notifyPropertyChanged(I)V

    .line 130
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPersonalSettingsBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 128
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
