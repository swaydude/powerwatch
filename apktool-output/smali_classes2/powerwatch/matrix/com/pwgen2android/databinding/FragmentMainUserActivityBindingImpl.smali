.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBinding;
.source "FragmentMainUserActivityBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl2;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl1;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private mViewModelOnNextClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl2;

.field private mViewModelOnPreviousClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl;

.field private mViewModelOnSessionClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl1;

.field private final mboundView0:Landroid/widget/LinearLayout;

.field private final mboundView1:Landroid/widget/LinearLayout;

.field private final mboundView10:Landroid/widget/RelativeLayout;

.field private final mboundView11:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView12:Landroid/widget/RelativeLayout;

.field private final mboundView13:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView14:Landroid/widget/RelativeLayout;

.field private final mboundView15:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView16:Landroid/widget/RelativeLayout;

.field private final mboundView18:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView19:Landroid/widget/RelativeLayout;

.field private final mboundView20:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView21:Landroid/widget/RelativeLayout;

.field private final mboundView22:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView3:Landroid/widget/ImageView;

.field private final mboundView6:Landroid/widget/ImageView;

.field private final mboundView7:Landroid/widget/GridLayout;

.field private final mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView9:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f080102

    const/16 v2, 0x19

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f0800a6

    const/16 v2, 0x1a

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f08016a

    const/16 v2, 0x1b

    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080080

    const/16 v2, 0x1c

    .line 20
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080266

    const/16 v2, 0x1d

    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f08007a

    const/16 v2, 0x1e

    .line 22
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f0800ef

    const/16 v2, 0x1f

    .line 23
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f0800d0

    const/16 v2, 0x20

    .line 24
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

    .line 74
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x21

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 19
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

    move-object/from16 v3, p0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v4, 0x4

    .line 77
    aget-object v4, p3, v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v5, 0x1e

    aget-object v5, p3, v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v6, 0x1c

    aget-object v6, p3, v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v7, 0x1a

    aget-object v7, p3, v7

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v8, 0x18

    aget-object v8, p3, v8

    check-cast v8, Landroid/widget/FrameLayout;

    const/16 v9, 0x20

    aget-object v9, p3, v9

    check-cast v9, Landroid/widget/FrameLayout;

    const/16 v10, 0x1f

    aget-object v10, p3, v10

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v11, 0x19

    aget-object v11, p3, v11

    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/4 v12, 0x2

    aget-object v12, p3, v12

    check-cast v12, Landroid/widget/LinearLayout;

    const/16 v13, 0x17

    aget-object v13, p3, v13

    check-cast v13, Landroid/widget/FrameLayout;

    const/16 v14, 0x1b

    aget-object v14, p3, v14

    check-cast v14, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v15, 0x11

    aget-object v15, p3, v15

    check-cast v15, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v16, 0x5

    aget-object v16, p3, v16

    check-cast v16, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v17, 0x1d

    aget-object v17, p3, v17

    check-cast v17, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v18, 0x12

    move/from16 v3, v18

    invoke-direct/range {v0 .. v17}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Landroid/widget/LinearLayout;Landroid/widget/FrameLayout;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;)V

    const-wide/16 v0, -0x1

    move-object/from16 v2, p0

    .line 938
    iput-wide v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    .line 93
    iget-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->activityName:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    .line 94
    iget-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->chartFragmentContainer:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    .line 95
    iget-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->headerLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    .line 96
    iget-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mapsFragmentContainer:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 97
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    .line 98
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 99
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView1:Landroid/widget/LinearLayout;

    .line 100
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0xa

    .line 101
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView10:Landroid/widget/RelativeLayout;

    .line 102
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0xb

    .line 103
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView11:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 104
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0xc

    .line 105
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView12:Landroid/widget/RelativeLayout;

    .line 106
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0xd

    .line 107
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView13:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 108
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0xe

    .line 109
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView14:Landroid/widget/RelativeLayout;

    .line 110
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0xf

    .line 111
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView15:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 112
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0x10

    .line 113
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView16:Landroid/widget/RelativeLayout;

    .line 114
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0x12

    .line 115
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView18:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 116
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0x13

    .line 117
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView19:Landroid/widget/RelativeLayout;

    .line 118
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0x14

    .line 119
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView20:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 120
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0x15

    .line 121
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView21:Landroid/widget/RelativeLayout;

    .line 122
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0x16

    .line 123
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView22:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 124
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x3

    .line 125
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView3:Landroid/widget/ImageView;

    .line 126
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x6

    .line 127
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView6:Landroid/widget/ImageView;

    .line 128
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x7

    .line 129
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/GridLayout;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView7:Landroid/widget/GridLayout;

    .line 130
    invoke-virtual {v0, v1}, Landroid/widget/GridLayout;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0x8

    .line 131
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 132
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0x9

    .line 133
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView9:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 134
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    .line 135
    iget-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->paceTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    .line 136
    iget-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->subtitleLabel:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    move-object/from16 v0, p2

    .line 137
    invoke-virtual {v2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 139
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewModelActiveCals(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelActiveCals",
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

    .line 288
    monitor-enter p0

    .line 289
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x80

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    .line 290
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

.method private onChangeViewModelAscendDisplayed(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelAscendDisplayed",
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

    .line 252
    monitor-enter p0

    .line 253
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x8

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    .line 254
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

.method private onChangeViewModelAvgHeartRate(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelAvgHeartRate",
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

    .line 297
    monitor-enter p0

    .line 298
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x100

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    .line 299
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

.method private onChangeViewModelDistance(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelDistance",
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

    .line 234
    monitor-enter p0

    .line 235
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    .line 236
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

.method private onChangeViewModelDuration(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelDuration",
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

    .line 261
    monitor-enter p0

    .line 262
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x10

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    .line 263
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

.method private onChangeViewModelHasHeartRates(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelHasHeartRates",
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

    .line 378
    monitor-enter p0

    .line 379
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/32 v0, 0x20000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelHasLocations(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelHasLocations",
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

    .line 333
    monitor-enter p0

    .line 334
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    .line 335
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

.method private onChangeViewModelHiitActivityDisplayed(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelHiitActivityDisplayed",
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

    .line 279
    monitor-enter p0

    .line 280
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x40

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    .line 281
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

.method private onChangeViewModelLeftArrowVisible(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelLeftArrowVisible",
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

    .line 270
    monitor-enter p0

    .line 271
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x20

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    .line 272
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

.method private onChangeViewModelMaxHRValue(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelMaxHRValue",
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

    .line 225
    monitor-enter p0

    .line 226
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    .line 227
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

.method private onChangeViewModelNameField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelNameField",
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

    .line 243
    monitor-enter p0

    .line 244
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    .line 245
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

.method private onChangeViewModelNoSessions(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelNoSessions",
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

    .line 306
    monitor-enter p0

    .line 307
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x200

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    .line 308
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

.method private onChangeViewModelPace(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelPace",
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
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/32 v0, 0x10000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelPaceTitle(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelPaceTitle",
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

    .line 324
    monitor-enter p0

    .line 325
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x800

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    .line 326
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

.method private onChangeViewModelRightArrowVisible(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelRightArrowVisible",
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

    .line 360
    monitor-enter p0

    .line 361
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/32 v0, 0x8000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelSubtitleField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelSubtitleField",
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

    .line 315
    monitor-enter p0

    .line 316
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x400

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    .line 317
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

.method private onChangeViewModelTotalAscendedValue(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelTotalAscendedValue",
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
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelTotalDescendedValue(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelTotalDescendedValue",
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
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x4000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

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


# virtual methods
.method protected executeBindings()V
    .locals 81

    move-object/from16 v1, p0

    .line 389
    monitor-enter p0

    .line 390
    :try_start_0
    iget-wide v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 391
    iput-wide v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    .line 392
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 442
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    const-wide/32 v6, 0xfffff

    and-long/2addr v6, v2

    const-wide/32 v16, 0xc0080

    const-wide/32 v18, 0xc0040

    const-wide/32 v20, 0xc1000

    const-wide/32 v22, 0xc0200

    const-wide/32 v24, 0xc0010

    const-wide/32 v26, 0xe0000

    const-wide/32 v28, 0xc0008

    const-wide/32 v30, 0xc0004

    const-wide/32 v32, 0xc0002

    const-wide/32 v36, 0xc0000

    const-wide/32 v38, 0xc8020

    const-wide/32 v40, 0xc0001

    const-wide/32 v42, 0x100000

    const/4 v11, 0x1

    const/4 v10, 0x0

    const/16 v45, 0x0

    cmp-long v46, v6, v4

    if-eqz v46, :cond_38

    and-long v6, v2, v40

    cmp-long v46, v6, v4

    if-eqz v46, :cond_1

    if-eqz v0, :cond_0

    .line 453
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getMaxHRValue()Landroidx/databinding/ObservableField;

    move-result-object v6

    goto :goto_0

    :cond_0
    move-object/from16 v6, v45

    .line 455
    :goto_0
    invoke-virtual {v1, v10, v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v6, :cond_1

    .line 460
    invoke-virtual {v6}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v6, v45

    :goto_1
    and-long v46, v2, v36

    cmp-long v7, v46, v4

    if-eqz v7, :cond_5

    if-eqz v0, :cond_5

    .line 467
    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mViewModelOnPreviousClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl;

    if-nez v7, :cond_2

    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl;

    invoke-direct {v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mViewModelOnPreviousClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl;

    :cond_2
    invoke-virtual {v7, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl;

    move-result-object v7

    .line 469
    iget-object v10, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mViewModelOnSessionClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl1;

    if-nez v10, :cond_3

    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl1;

    invoke-direct {v10}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl1;-><init>()V

    iput-object v10, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mViewModelOnSessionClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl1;

    :cond_3
    invoke-virtual {v10, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl1;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl1;

    move-result-object v10

    .line 471
    iget-object v8, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mViewModelOnNextClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl2;

    if-nez v8, :cond_4

    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl2;

    invoke-direct {v8}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl2;-><init>()V

    iput-object v8, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mViewModelOnNextClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl2;

    :cond_4
    invoke-virtual {v8, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl2;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl$OnClickListenerImpl2;

    move-result-object v8

    goto :goto_2

    :cond_5
    move-object/from16 v7, v45

    move-object v8, v7

    move-object v10, v8

    :goto_2
    and-long v49, v2, v32

    cmp-long v9, v49, v4

    if-eqz v9, :cond_7

    if-eqz v0, :cond_6

    .line 478
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getDistance()Landroidx/databinding/ObservableField;

    move-result-object v9

    goto :goto_3

    :cond_6
    move-object/from16 v9, v45

    .line 480
    :goto_3
    invoke-virtual {v1, v11, v9}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v9, :cond_7

    .line 485
    invoke-virtual {v9}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    goto :goto_4

    :cond_7
    move-object/from16 v9, v45

    :goto_4
    and-long v49, v2, v30

    cmp-long v51, v49, v4

    if-eqz v51, :cond_9

    if-eqz v0, :cond_8

    .line 492
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getNameField()Landroidx/databinding/ObservableField;

    move-result-object v49

    move-object/from16 v11, v49

    goto :goto_5

    :cond_8
    move-object/from16 v11, v45

    :goto_5
    const/4 v12, 0x2

    .line 494
    invoke-virtual {v1, v12, v11}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v11, :cond_9

    .line 499
    invoke-virtual {v11}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    goto :goto_6

    :cond_9
    move-object/from16 v11, v45

    :goto_6
    and-long v12, v2, v28

    cmp-long v52, v12, v4

    if-eqz v52, :cond_c

    if-eqz v0, :cond_a

    .line 506
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getAscendDisplayed()Landroidx/databinding/ObservableField;

    move-result-object v12

    goto :goto_7

    :cond_a
    move-object/from16 v12, v45

    :goto_7
    const/4 v13, 0x3

    .line 508
    invoke-virtual {v1, v13, v12}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v12, :cond_b

    .line 513
    invoke-virtual {v12}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    goto :goto_8

    :cond_b
    move-object/from16 v12, v45

    .line 518
    :goto_8
    invoke-static {v12}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v12

    goto :goto_9

    :cond_c
    const/4 v12, 0x0

    :goto_9
    and-long v52, v2, v24

    cmp-long v13, v52, v4

    if-eqz v13, :cond_e

    if-eqz v0, :cond_d

    .line 524
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getDuration()Landroidx/databinding/ObservableField;

    move-result-object v13

    goto :goto_a

    :cond_d
    move-object/from16 v13, v45

    :goto_a
    const/4 v14, 0x4

    .line 526
    invoke-virtual {v1, v14, v13}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v13, :cond_e

    .line 531
    invoke-virtual {v13}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    goto :goto_b

    :cond_e
    move-object/from16 v13, v45

    :goto_b
    and-long v14, v2, v38

    cmp-long v54, v14, v4

    if-eqz v54, :cond_12

    if-eqz v0, :cond_f

    .line 538
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getLeftArrowVisible()Landroidx/databinding/ObservableField;

    move-result-object v14

    goto :goto_c

    :cond_f
    move-object/from16 v14, v45

    :goto_c
    const/4 v15, 0x5

    .line 540
    invoke-virtual {v1, v15, v14}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v14, :cond_10

    .line 545
    invoke-virtual {v14}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    goto :goto_d

    :cond_10
    move-object/from16 v14, v45

    .line 550
    :goto_d
    invoke-static {v14}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v14

    if-eqz v54, :cond_13

    if-eqz v14, :cond_11

    const-wide/32 v54, 0x200000

    or-long v2, v2, v54

    goto :goto_e

    :cond_11
    or-long v2, v2, v42

    goto :goto_e

    :cond_12
    const/4 v14, 0x0

    :cond_13
    :goto_e
    and-long v54, v2, v18

    cmp-long v15, v54, v4

    if-eqz v15, :cond_16

    if-eqz v0, :cond_14

    .line 564
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getHiitActivityDisplayed()Landroidx/databinding/ObservableField;

    move-result-object v15

    goto :goto_f

    :cond_14
    move-object/from16 v15, v45

    :goto_f
    const/4 v4, 0x6

    .line 566
    invoke-virtual {v1, v4, v15}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v15, :cond_15

    .line 571
    invoke-virtual {v15}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto :goto_10

    :cond_15
    move-object/from16 v4, v45

    .line 576
    :goto_10
    invoke-static {v4}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v4

    xor-int/lit8 v5, v4, 0x1

    .line 584
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v5}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v5

    goto :goto_11

    :cond_16
    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_11
    and-long v56, v2, v16

    const-wide/16 v54, 0x0

    cmp-long v15, v56, v54

    if-eqz v15, :cond_18

    if-eqz v0, :cond_17

    .line 590
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getActiveCals()Landroidx/databinding/ObservableField;

    move-result-object v15

    move/from16 v56, v4

    goto :goto_12

    :cond_17
    move/from16 v56, v4

    move-object/from16 v15, v45

    :goto_12
    const/4 v4, 0x7

    .line 592
    invoke-virtual {v1, v4, v15}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v15, :cond_19

    .line 597
    invoke-virtual {v15}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_13

    :cond_18
    move/from16 v56, v4

    :cond_19
    move-object/from16 v4, v45

    :goto_13
    const-wide/32 v52, 0xc0100

    and-long v57, v2, v52

    const-wide/16 v54, 0x0

    cmp-long v15, v57, v54

    if-eqz v15, :cond_1b

    if-eqz v0, :cond_1a

    .line 604
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getAvgHeartRate()Landroidx/databinding/ObservableField;

    move-result-object v15

    move-object/from16 v57, v4

    goto :goto_14

    :cond_1a
    move-object/from16 v57, v4

    move-object/from16 v15, v45

    :goto_14
    const/16 v4, 0x8

    .line 606
    invoke-virtual {v1, v4, v15}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v15, :cond_1c

    .line 611
    invoke-virtual {v15}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_15

    :cond_1b
    move-object/from16 v57, v4

    :cond_1c
    move-object/from16 v4, v45

    :goto_15
    and-long v58, v2, v22

    const-wide/16 v54, 0x0

    cmp-long v15, v58, v54

    if-eqz v15, :cond_1f

    if-eqz v0, :cond_1d

    .line 618
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getNoSessions()Landroidx/databinding/ObservableField;

    move-result-object v15

    move-object/from16 v58, v4

    goto :goto_16

    :cond_1d
    move-object/from16 v58, v4

    move-object/from16 v15, v45

    :goto_16
    const/16 v4, 0x9

    .line 620
    invoke-virtual {v1, v4, v15}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v15, :cond_1e

    .line 625
    invoke-virtual {v15}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto :goto_17

    :cond_1e
    move-object/from16 v4, v45

    .line 630
    :goto_17
    invoke-static {v4}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v4

    xor-int/lit8 v15, v4, 0x1

    .line 638
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-static {v15}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v15

    goto :goto_18

    :cond_1f
    move-object/from16 v58, v4

    const/4 v4, 0x0

    const/4 v15, 0x0

    :goto_18
    const-wide/32 v50, 0xc0400

    and-long v59, v2, v50

    const-wide/16 v54, 0x0

    cmp-long v61, v59, v54

    if-eqz v61, :cond_21

    if-eqz v0, :cond_20

    .line 644
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getSubtitleField()Landroidx/databinding/ObservableField;

    move-result-object v59

    move/from16 v60, v5

    move-object/from16 v80, v59

    move/from16 v59, v4

    move-object/from16 v4, v80

    goto :goto_19

    :cond_20
    move/from16 v59, v4

    move/from16 v60, v5

    move-object/from16 v4, v45

    :goto_19
    const/16 v5, 0xa

    .line 646
    invoke-virtual {v1, v5, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v4, :cond_22

    .line 651
    invoke-virtual {v4}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_1a

    :cond_21
    move/from16 v59, v4

    move/from16 v60, v5

    :cond_22
    move-object/from16 v4, v45

    :goto_1a
    const-wide/32 v47, 0xc0800

    and-long v61, v2, v47

    const-wide/16 v54, 0x0

    cmp-long v5, v61, v54

    if-eqz v5, :cond_24

    if-eqz v0, :cond_23

    .line 658
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getPaceTitle()Landroidx/databinding/ObservableField;

    move-result-object v5

    move-object/from16 v61, v4

    goto :goto_1b

    :cond_23
    move-object/from16 v61, v4

    move-object/from16 v5, v45

    :goto_1b
    const/16 v4, 0xb

    .line 660
    invoke-virtual {v1, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_25

    .line 665
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_1c

    :cond_24
    move-object/from16 v61, v4

    :cond_25
    move-object/from16 v4, v45

    :goto_1c
    and-long v62, v2, v20

    const-wide/16 v54, 0x0

    cmp-long v5, v62, v54

    if-eqz v5, :cond_28

    if-eqz v0, :cond_26

    .line 672
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getHasLocations()Landroidx/databinding/ObservableField;

    move-result-object v5

    move-object/from16 v62, v4

    goto :goto_1d

    :cond_26
    move-object/from16 v62, v4

    move-object/from16 v5, v45

    :goto_1d
    const/16 v4, 0xc

    .line 674
    invoke-virtual {v1, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_27

    .line 679
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto :goto_1e

    :cond_27
    move-object/from16 v4, v45

    .line 684
    :goto_1e
    invoke-static {v4}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v4

    goto :goto_1f

    :cond_28
    move-object/from16 v62, v4

    const/4 v4, 0x0

    :goto_1f
    const-wide/32 v63, 0xc2000

    and-long v63, v2, v63

    const-wide/16 v54, 0x0

    cmp-long v5, v63, v54

    if-eqz v5, :cond_2a

    if-eqz v0, :cond_29

    .line 690
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getTotalAscendedValue()Landroidx/databinding/ObservableField;

    move-result-object v5

    move/from16 v63, v4

    goto :goto_20

    :cond_29
    move/from16 v63, v4

    move-object/from16 v5, v45

    :goto_20
    const/16 v4, 0xd

    .line 692
    invoke-virtual {v1, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_2b

    .line 697
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_21

    :cond_2a
    move/from16 v63, v4

    :cond_2b
    move-object/from16 v4, v45

    :goto_21
    const-wide/32 v64, 0xc4000

    and-long v64, v2, v64

    const-wide/16 v54, 0x0

    cmp-long v5, v64, v54

    if-eqz v5, :cond_2d

    if-eqz v0, :cond_2c

    .line 704
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getTotalDescendedValue()Landroidx/databinding/ObservableField;

    move-result-object v5

    move-object/from16 v64, v4

    goto :goto_22

    :cond_2c
    move-object/from16 v64, v4

    move-object/from16 v5, v45

    :goto_22
    const/16 v4, 0xe

    .line 706
    invoke-virtual {v1, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_2e

    .line 711
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_23

    :cond_2d
    move-object/from16 v64, v4

    :cond_2e
    move-object/from16 v4, v45

    :goto_23
    const-wide/32 v65, 0xc8000

    and-long v65, v2, v65

    const-wide/16 v54, 0x0

    cmp-long v5, v65, v54

    if-eqz v5, :cond_31

    if-eqz v0, :cond_2f

    .line 718
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getRightArrowVisible()Landroidx/databinding/ObservableField;

    move-result-object v5

    move-object/from16 v65, v4

    goto :goto_24

    :cond_2f
    move-object/from16 v65, v4

    move-object/from16 v5, v45

    :goto_24
    const/16 v4, 0xf

    .line 720
    invoke-virtual {v1, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_30

    .line 725
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto :goto_25

    :cond_30
    move-object/from16 v4, v45

    .line 730
    :goto_25
    invoke-static {v4}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v66

    const-wide/32 v34, 0xd0000

    goto :goto_26

    :cond_31
    move-object/from16 v65, v4

    move-object/from16 v4, v45

    move-object v5, v4

    const-wide/32 v34, 0xd0000

    const/16 v66, 0x0

    :goto_26
    and-long v67, v2, v34

    const-wide/16 v54, 0x0

    cmp-long v69, v67, v54

    if-eqz v69, :cond_33

    if-eqz v0, :cond_32

    .line 736
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getPace()Landroidx/databinding/ObservableField;

    move-result-object v67

    move-object/from16 v68, v5

    move-object/from16 v80, v67

    move-object/from16 v67, v4

    move-object/from16 v4, v80

    goto :goto_27

    :cond_32
    move-object/from16 v67, v4

    move-object/from16 v68, v5

    move-object/from16 v4, v45

    :goto_27
    const/16 v5, 0x10

    .line 738
    invoke-virtual {v1, v5, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v4, :cond_34

    .line 743
    invoke-virtual {v4}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_28

    :cond_33
    move-object/from16 v67, v4

    move-object/from16 v68, v5

    :cond_34
    move-object/from16 v4, v45

    :goto_28
    and-long v69, v2, v26

    const-wide/16 v54, 0x0

    cmp-long v5, v69, v54

    if-eqz v5, :cond_37

    if-eqz v0, :cond_35

    .line 750
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getHasHeartRates()Landroidx/databinding/ObservableField;

    move-result-object v5

    move-wide/from16 v69, v2

    goto :goto_29

    :cond_35
    move-wide/from16 v69, v2

    move-object/from16 v5, v45

    :goto_29
    const/16 v2, 0x11

    .line 752
    invoke-virtual {v1, v2, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_36

    .line 757
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v45, v2

    check-cast v45, Ljava/lang/Boolean;

    .line 762
    :cond_36
    invoke-static/range {v45 .. v45}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v2

    move-object/from16 v73, v4

    move-object/from16 v72, v9

    move-object/from16 v76, v13

    move-object/from16 v77, v57

    move-object/from16 v71, v58

    move/from16 v5, v59

    move-object/from16 v79, v61

    move-object/from16 v78, v62

    move-object/from16 v74, v64

    move-object/from16 v75, v65

    move-object/from16 v45, v68

    move v4, v2

    move-object v9, v7

    move-object v13, v11

    move/from16 v7, v56

    move-wide/from16 v2, v69

    goto :goto_2a

    :cond_37
    move-wide/from16 v69, v2

    move-object/from16 v73, v4

    move-object/from16 v72, v9

    move-object/from16 v76, v13

    move-object/from16 v77, v57

    move-object/from16 v71, v58

    move/from16 v5, v59

    move-object/from16 v79, v61

    move-object/from16 v78, v62

    move-object/from16 v74, v64

    move-object/from16 v75, v65

    move-object/from16 v45, v68

    const/4 v4, 0x0

    move-object v9, v7

    move-object v13, v11

    move/from16 v7, v56

    :goto_2a
    move-object v11, v8

    move/from16 v56, v12

    move/from16 v8, v60

    move-object v12, v6

    move/from16 v6, v63

    goto :goto_2b

    :cond_38
    move-object/from16 v9, v45

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object/from16 v67, v13

    move-object/from16 v71, v67

    move-object/from16 v72, v71

    move-object/from16 v73, v72

    move-object/from16 v74, v73

    move-object/from16 v75, v74

    move-object/from16 v76, v75

    move-object/from16 v77, v76

    move-object/from16 v78, v77

    move-object/from16 v79, v78

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v56, 0x0

    const/16 v66, 0x0

    :goto_2b
    and-long v42, v2, v42

    const-wide/16 v54, 0x0

    cmp-long v57, v42, v54

    if-eqz v57, :cond_3b

    if-eqz v0, :cond_39

    .line 771
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getRightArrowVisible()Landroidx/databinding/ObservableField;

    move-result-object v45

    :cond_39
    move-object/from16 v42, v12

    move-object/from16 v0, v45

    const/16 v12, 0xf

    .line 773
    invoke-virtual {v1, v12, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v0, :cond_3a

    .line 778
    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v67, v0

    check-cast v67, Ljava/lang/Boolean;

    .line 783
    :cond_3a
    invoke-static/range {v67 .. v67}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v66

    goto :goto_2c

    :cond_3b
    move-object/from16 v42, v12

    :goto_2c
    move/from16 v0, v66

    and-long v38, v2, v38

    const-wide/16 v43, 0x0

    cmp-long v12, v38, v43

    if-eqz v12, :cond_3d

    if-eqz v14, :cond_3c

    const/16 v49, 0x1

    goto :goto_2d

    :cond_3c
    move/from16 v49, v0

    :goto_2d
    move/from16 v38, v0

    move/from16 v0, v49

    goto :goto_2e

    :cond_3d
    move/from16 v38, v0

    const/4 v0, 0x0

    :goto_2e
    and-long v36, v2, v36

    cmp-long v39, v36, v43

    move/from16 v36, v14

    if-eqz v39, :cond_3e

    .line 795
    iget-object v14, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->activityName:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v14, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 796
    iget-object v14, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView3:Landroid/widget/ImageView;

    invoke-virtual {v14, v9}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 797
    iget-object v9, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView6:Landroid/widget/ImageView;

    invoke-virtual {v9, v11}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 798
    iget-object v9, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView7:Landroid/widget/GridLayout;

    invoke-virtual {v9, v10}, Landroid/widget/GridLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3e
    and-long v9, v2, v30

    const-wide/16 v30, 0x0

    cmp-long v11, v9, v30

    if-eqz v11, :cond_3f

    .line 803
    iget-object v9, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->activityName:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v9, v13}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_3f
    if-eqz v12, :cond_40

    .line 808
    iget-object v9, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->activityName:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v9, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->centerHorizontalInRelative(Landroid/view/View;Z)V

    .line 809
    iget-object v9, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->subtitleLabel:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v9, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->centerHorizontalInRelative(Landroid/view/View;Z)V

    :cond_40
    and-long v9, v2, v26

    const-wide/16 v11, 0x0

    cmp-long v0, v9, v11

    if-eqz v0, :cond_41

    .line 814
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->chartFragmentContainer:Landroid/widget/FrameLayout;

    invoke-static {v0, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_41
    and-long v9, v2, v22

    cmp-long v0, v9, v11

    if-eqz v0, :cond_42

    .line 819
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->headerLayout:Landroid/widget/LinearLayout;

    invoke-static {v0, v15}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 820
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView1:Landroid/widget/LinearLayout;

    invoke-static {v0, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_42
    and-long v4, v2, v20

    cmp-long v0, v4, v11

    if-eqz v0, :cond_43

    .line 825
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mapsFragmentContainer:Landroid/widget/FrameLayout;

    invoke-static {v0, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_43
    and-long v4, v2, v18

    cmp-long v0, v4, v11

    if-eqz v0, :cond_44

    .line 830
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView10:Landroid/widget/RelativeLayout;

    invoke-static {v0, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 831
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView12:Landroid/widget/RelativeLayout;

    invoke-static {v0, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 832
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView14:Landroid/widget/RelativeLayout;

    invoke-static {v0, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 833
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView16:Landroid/widget/RelativeLayout;

    invoke-static {v0, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_44
    and-long v4, v2, v40

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-eqz v0, :cond_45

    .line 838
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView11:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-object/from16 v4, v42

    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_45
    const-wide/32 v4, 0xc0100

    and-long/2addr v4, v2

    cmp-long v0, v4, v6

    if-eqz v0, :cond_46

    .line 843
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView13:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-object/from16 v4, v71

    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_46
    and-long v4, v2, v32

    cmp-long v0, v4, v6

    if-eqz v0, :cond_47

    .line 848
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView15:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-object/from16 v9, v72

    invoke-static {v0, v9}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_47
    const-wide/32 v4, 0xd0000

    and-long/2addr v4, v2

    cmp-long v0, v4, v6

    if-eqz v0, :cond_48

    .line 853
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView18:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-object/from16 v4, v73

    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_48
    and-long v4, v2, v28

    cmp-long v0, v4, v6

    if-eqz v0, :cond_49

    .line 858
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView19:Landroid/widget/RelativeLayout;

    move/from16 v12, v56

    invoke-static {v0, v12}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 859
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView21:Landroid/widget/RelativeLayout;

    invoke-static {v0, v12}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_49
    const-wide/32 v4, 0xc2000

    and-long/2addr v4, v2

    cmp-long v0, v4, v6

    if-eqz v0, :cond_4a

    .line 864
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView20:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-object/from16 v4, v74

    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_4a
    const-wide/32 v4, 0xc4000

    and-long/2addr v4, v2

    cmp-long v0, v4, v6

    if-eqz v0, :cond_4b

    .line 869
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView22:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-object/from16 v4, v75

    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_4b
    const-wide/32 v4, 0xc0020

    and-long/2addr v4, v2

    cmp-long v0, v4, v6

    if-eqz v0, :cond_4c

    .line 874
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView3:Landroid/widget/ImageView;

    move/from16 v14, v36

    invoke-static {v0, v14}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_4c
    const-wide/32 v4, 0xc8000

    and-long/2addr v4, v2

    cmp-long v0, v4, v6

    if-eqz v0, :cond_4d

    .line 879
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView6:Landroid/widget/ImageView;

    move/from16 v4, v38

    invoke-static {v0, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_4d
    and-long v4, v2, v24

    cmp-long v0, v4, v6

    if-eqz v0, :cond_4e

    .line 884
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-object/from16 v13, v76

    invoke-static {v0, v13}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_4e
    and-long v4, v2, v16

    cmp-long v0, v4, v6

    if-eqz v0, :cond_4f

    .line 889
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mboundView9:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-object/from16 v4, v77

    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_4f
    const-wide/32 v4, 0xc0800

    and-long/2addr v4, v2

    cmp-long v0, v4, v6

    if-eqz v0, :cond_50

    .line 894
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->paceTitle:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-object/from16 v4, v78

    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_50
    const-wide/32 v4, 0xc0400

    and-long/2addr v2, v4

    cmp-long v0, v2, v6

    if-eqz v0, :cond_51

    .line 899
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->subtitleLabel:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-object/from16 v2, v79

    invoke-static {v0, v2}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_51
    return-void

    :catchall_0
    move-exception v0

    .line 392
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 152
    monitor-enter p0

    .line 153
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 154
    monitor-exit p0

    return v0

    .line 156
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

    .line 144
    monitor-enter p0

    const-wide/32 v0, 0x80000

    .line 145
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    .line 146
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 146
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

    .line 219
    :pswitch_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->onChangeViewModelHasHeartRates(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 217
    :pswitch_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->onChangeViewModelPace(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 215
    :pswitch_2
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->onChangeViewModelRightArrowVisible(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 213
    :pswitch_3
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->onChangeViewModelTotalDescendedValue(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 211
    :pswitch_4
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->onChangeViewModelTotalAscendedValue(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 209
    :pswitch_5
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->onChangeViewModelHasLocations(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 207
    :pswitch_6
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->onChangeViewModelPaceTitle(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 205
    :pswitch_7
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->onChangeViewModelSubtitleField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 203
    :pswitch_8
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->onChangeViewModelNoSessions(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 201
    :pswitch_9
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->onChangeViewModelAvgHeartRate(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 199
    :pswitch_a
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->onChangeViewModelActiveCals(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 197
    :pswitch_b
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->onChangeViewModelHiitActivityDisplayed(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 195
    :pswitch_c
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->onChangeViewModelLeftArrowVisible(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 193
    :pswitch_d
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->onChangeViewModelDuration(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 191
    :pswitch_e
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->onChangeViewModelAscendDisplayed(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 189
    :pswitch_f
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->onChangeViewModelNameField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 187
    :pswitch_10
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->onChangeViewModelDistance(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 185
    :pswitch_11
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->onChangeViewModelMaxHRValue(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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

    .line 164
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 173
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    .line 174
    monitor-enter p0

    .line 175
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/32 v2, 0x40000

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->mDirtyFlags:J

    .line 176
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 177
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBindingImpl;->notifyPropertyChanged(I)V

    .line 178
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainUserActivityBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 176
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
