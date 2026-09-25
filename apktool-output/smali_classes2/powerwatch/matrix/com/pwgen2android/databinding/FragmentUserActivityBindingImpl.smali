.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBinding;
.source "FragmentUserActivityBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl$OnClickListenerImpl1;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private mViewModelOnNextClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl$OnClickListenerImpl1;

.field private mViewModelOnPreviousClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl$OnClickListenerImpl;

.field private final mboundView0:Landroid/widget/LinearLayout;

.field private final mboundView1:Landroid/widget/ImageView;

.field private final mboundView10:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView11:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView12:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView13:Landroid/widget/RelativeLayout;

.field private final mboundView14:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView15:Landroid/widget/RelativeLayout;

.field private final mboundView16:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView17:Landroid/widget/RelativeLayout;

.field private final mboundView18:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView19:Landroid/widget/RelativeLayout;

.field private final mboundView20:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView21:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView4:Landroid/widget/ImageView;

.field private final mboundView5:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

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

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f080133

    const/16 v2, 0x18

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080102

    const/16 v2, 0x19

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f0800a6

    const/16 v2, 0x1a

    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080266

    const/16 v2, 0x1b

    .line 20
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f0801a6

    const/16 v2, 0x1c

    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f0800e0

    const/16 v2, 0x1d

    .line 22
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f08025a

    const/16 v2, 0x1e

    .line 23
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f08016a

    const/16 v2, 0x1f

    .line 24
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080080

    const/16 v2, 0x20

    .line 25
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f08007a

    const/16 v2, 0x21

    .line 26
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f0800ef

    const/16 v2, 0x22

    .line 27
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f0800d0

    const/16 v2, 0x23

    .line 28
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

    .line 79
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x24

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 21
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

    const/4 v4, 0x2

    .line 82
    aget-object v4, p3, v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v5, 0x21

    aget-object v5, p3, v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v6, 0x20

    aget-object v6, p3, v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v7, 0x1a

    aget-object v7, p3, v7

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v8, 0x17

    aget-object v8, p3, v8

    check-cast v8, Landroid/widget/FrameLayout;

    const/16 v9, 0x23

    aget-object v9, p3, v9

    check-cast v9, Landroid/widget/FrameLayout;

    const/16 v10, 0x1d

    aget-object v10, p3, v10

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v11, 0x22

    aget-object v11, p3, v11

    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v12, 0x19

    aget-object v12, p3, v12

    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v13, 0x18

    aget-object v13, p3, v13

    check-cast v13, Landroid/widget/LinearLayout;

    const/16 v14, 0x16

    aget-object v14, p3, v14

    check-cast v14, Landroid/widget/FrameLayout;

    const/16 v15, 0x1f

    aget-object v15, p3, v15

    check-cast v15, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v16, 0x1c

    aget-object v16, p3, v16

    check-cast v16, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v17, 0x3

    aget-object v17, p3, v17

    check-cast v17, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v18, 0x1e

    aget-object v18, p3, v18

    check-cast v18, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v19, 0x1b

    aget-object v19, p3, v19

    check-cast v19, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/16 v20, 0x12

    move/from16 v3, v20

    invoke-direct/range {v0 .. v19}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Landroid/widget/LinearLayout;Landroid/widget/FrameLayout;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;)V

    const-wide/16 v0, -0x1

    move-object/from16 v2, p0

    .line 924
    iput-wide v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 100
    iget-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->activityName:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    .line 101
    iget-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->chartFragmentContainer:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    .line 102
    iget-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mapsFragmentContainer:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 103
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    .line 104
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 105
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView1:Landroid/widget/ImageView;

    .line 106
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0xa

    .line 107
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView10:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 108
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0xb

    .line 109
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView11:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 110
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0xc

    .line 111
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView12:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 112
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0xd

    .line 113
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView13:Landroid/widget/RelativeLayout;

    .line 114
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0xe

    .line 115
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView14:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 116
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0xf

    .line 117
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView15:Landroid/widget/RelativeLayout;

    .line 118
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0x10

    .line 119
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView16:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 120
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0x11

    .line 121
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView17:Landroid/widget/RelativeLayout;

    .line 122
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0x12

    .line 123
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView18:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 124
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0x13

    .line 125
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView19:Landroid/widget/RelativeLayout;

    .line 126
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0x14

    .line 127
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView20:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 128
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0x15

    .line 129
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView21:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 130
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x4

    .line 131
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView4:Landroid/widget/ImageView;

    .line 132
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x5

    .line 133
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView5:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 134
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x6

    .line 135
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView6:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 136
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x7

    .line 137
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView7:Landroid/widget/RelativeLayout;

    .line 138
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0x8

    .line 139
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 140
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0x9

    .line 141
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView9:Landroid/widget/RelativeLayout;

    .line 142
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 143
    iget-object v0, v2, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->subtitleLabel:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    move-object/from16 v0, p2

    .line 144
    invoke-virtual {v2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 146
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->invalidateAll()V

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

    .line 304
    monitor-enter p0

    .line 305
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x100

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 306
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

    .line 259
    monitor-enter p0

    .line 260
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x8

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 261
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

    .line 313
    monitor-enter p0

    .line 314
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x200

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 315
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

.method private onChangeViewModelDate(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelDate",
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

    .line 295
    monitor-enter p0

    .line 296
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x80

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 297
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

    .line 241
    monitor-enter p0

    .line 242
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 243
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

    .line 268
    monitor-enter p0

    .line 269
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x10

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 270
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

    .line 385
    monitor-enter p0

    .line 386
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/32 v0, 0x20000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 387
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

    .line 340
    monitor-enter p0

    .line 341
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 342
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

    .line 286
    monitor-enter p0

    .line 287
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x40

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 288
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

    .line 277
    monitor-enter p0

    .line 278
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x20

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 279
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

    .line 232
    monitor-enter p0

    .line 233
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 234
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

    .line 250
    monitor-enter p0

    .line 251
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 252
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

    .line 376
    monitor-enter p0

    .line 377
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/32 v0, 0x10000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 378
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

    .line 367
    monitor-enter p0

    .line 368
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/32 v0, 0x8000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 369
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

.method private onChangeViewModelStartTime(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelStartTime",
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

    .line 331
    monitor-enter p0

    .line 332
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x800

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 333
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

    .line 322
    monitor-enter p0

    .line 323
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x400

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 324
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

    .line 349
    monitor-enter p0

    .line 350
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 351
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

    .line 358
    monitor-enter p0

    .line 359
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x4000

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 360
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
    .locals 79

    move-object/from16 v1, p0

    .line 396
    monitor-enter p0

    .line 397
    :try_start_0
    iget-wide v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 398
    iput-wide v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 399
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 447
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    const-wide/32 v6, 0xfffff

    and-long/2addr v6, v2

    const-wide/32 v16, 0xc0080

    const-wide/32 v18, 0xd0000

    const-wide/32 v20, 0xc0040

    const-wide/32 v22, 0xc0010

    const-wide/32 v24, 0xc1000

    const-wide/32 v26, 0xc0008

    const-wide/32 v28, 0xe0000

    const-wide/32 v30, 0xc0002

    const-wide/32 v34, 0xc0004

    const-wide/32 v36, 0xc0000

    const-wide/32 v38, 0xc8020

    const-wide/32 v40, 0xc0001

    const-wide/32 v42, 0x100000

    const/4 v13, 0x1

    const/4 v12, 0x0

    const/16 v45, 0x0

    cmp-long v46, v6, v4

    if-eqz v46, :cond_36

    and-long v6, v2, v40

    cmp-long v46, v6, v4

    if-eqz v46, :cond_1

    if-eqz v0, :cond_0

    .line 458
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getMaxHRValue()Landroidx/databinding/ObservableField;

    move-result-object v6

    goto :goto_0

    :cond_0
    move-object/from16 v6, v45

    .line 460
    :goto_0
    invoke-virtual {v1, v12, v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v6, :cond_1

    .line 465
    invoke-virtual {v6}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v6, v45

    :goto_1
    and-long v46, v2, v36

    cmp-long v7, v46, v4

    if-eqz v7, :cond_4

    if-eqz v0, :cond_4

    .line 472
    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mViewModelOnPreviousClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl$OnClickListenerImpl;

    if-nez v7, :cond_2

    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl$OnClickListenerImpl;

    invoke-direct {v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mViewModelOnPreviousClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl$OnClickListenerImpl;

    :cond_2
    invoke-virtual {v7, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl$OnClickListenerImpl;

    move-result-object v7

    .line 474
    iget-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mViewModelOnNextClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl$OnClickListenerImpl1;

    if-nez v12, :cond_3

    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl$OnClickListenerImpl1;

    invoke-direct {v12}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl$OnClickListenerImpl1;-><init>()V

    iput-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mViewModelOnNextClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl$OnClickListenerImpl1;

    :cond_3
    invoke-virtual {v12, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl$OnClickListenerImpl1;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl$OnClickListenerImpl1;

    move-result-object v12

    goto :goto_2

    :cond_4
    move-object/from16 v7, v45

    move-object v12, v7

    :goto_2
    and-long v47, v2, v30

    cmp-long v49, v47, v4

    if-eqz v49, :cond_6

    if-eqz v0, :cond_5

    .line 481
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getDistance()Landroidx/databinding/ObservableField;

    move-result-object v47

    move-object/from16 v8, v47

    goto :goto_3

    :cond_5
    move-object/from16 v8, v45

    .line 483
    :goto_3
    invoke-virtual {v1, v13, v8}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v8, :cond_6

    .line 488
    invoke-virtual {v8}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    goto :goto_4

    :cond_6
    move-object/from16 v8, v45

    :goto_4
    and-long v49, v2, v34

    cmp-long v9, v49, v4

    if-eqz v9, :cond_8

    if-eqz v0, :cond_7

    .line 495
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getNameField()Landroidx/databinding/ObservableField;

    move-result-object v9

    goto :goto_5

    :cond_7
    move-object/from16 v9, v45

    :goto_5
    const/4 v13, 0x2

    .line 497
    invoke-virtual {v1, v13, v9}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v9, :cond_8

    .line 502
    invoke-virtual {v9}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    goto :goto_6

    :cond_8
    move-object/from16 v9, v45

    :goto_6
    and-long v50, v2, v26

    cmp-long v13, v50, v4

    if-eqz v13, :cond_b

    if-eqz v0, :cond_9

    .line 509
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getAscendDisplayed()Landroidx/databinding/ObservableField;

    move-result-object v13

    goto :goto_7

    :cond_9
    move-object/from16 v13, v45

    :goto_7
    const/4 v10, 0x3

    .line 511
    invoke-virtual {v1, v10, v13}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v13, :cond_a

    .line 516
    invoke-virtual {v13}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    goto :goto_8

    :cond_a
    move-object/from16 v10, v45

    .line 521
    :goto_8
    invoke-static {v10}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v10

    goto :goto_9

    :cond_b
    const/4 v10, 0x0

    :goto_9
    and-long v52, v2, v22

    cmp-long v11, v52, v4

    if-eqz v11, :cond_d

    if-eqz v0, :cond_c

    .line 527
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getDuration()Landroidx/databinding/ObservableField;

    move-result-object v11

    goto :goto_a

    :cond_c
    move-object/from16 v11, v45

    :goto_a
    const/4 v13, 0x4

    .line 529
    invoke-virtual {v1, v13, v11}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v11, :cond_d

    .line 534
    invoke-virtual {v11}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    goto :goto_b

    :cond_d
    move-object/from16 v11, v45

    :goto_b
    and-long v52, v2, v38

    cmp-long v13, v52, v4

    if-eqz v13, :cond_11

    if-eqz v0, :cond_e

    .line 541
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getLeftArrowVisible()Landroidx/databinding/ObservableField;

    move-result-object v52

    move-object/from16 v14, v52

    goto :goto_c

    :cond_e
    move-object/from16 v14, v45

    :goto_c
    const/4 v15, 0x5

    .line 543
    invoke-virtual {v1, v15, v14}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v14, :cond_f

    .line 548
    invoke-virtual {v14}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    goto :goto_d

    :cond_f
    move-object/from16 v14, v45

    .line 553
    :goto_d
    invoke-static {v14}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v14

    if-eqz v13, :cond_12

    if-eqz v14, :cond_10

    const-wide/32 v54, 0x200000

    or-long v2, v2, v54

    goto :goto_e

    :cond_10
    or-long v2, v2, v42

    goto :goto_e

    :cond_11
    const/4 v14, 0x0

    :cond_12
    :goto_e
    and-long v54, v2, v20

    cmp-long v13, v54, v4

    if-eqz v13, :cond_15

    if-eqz v0, :cond_13

    .line 567
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getHiitActivityDisplayed()Landroidx/databinding/ObservableField;

    move-result-object v13

    goto :goto_f

    :cond_13
    move-object/from16 v13, v45

    :goto_f
    const/4 v15, 0x6

    .line 569
    invoke-virtual {v1, v15, v13}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v13, :cond_14

    .line 574
    invoke-virtual {v13}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    goto :goto_10

    :cond_14
    move-object/from16 v13, v45

    .line 579
    :goto_10
    invoke-static {v13}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v13

    xor-int/lit8 v15, v13, 0x1

    .line 587
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-static {v15}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v15

    goto :goto_11

    :cond_15
    const/4 v13, 0x0

    const/4 v15, 0x0

    :goto_11
    and-long v54, v2, v16

    cmp-long v56, v54, v4

    if-eqz v56, :cond_17

    if-eqz v0, :cond_16

    .line 593
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getDate()Landroidx/databinding/ObservableField;

    move-result-object v54

    move-object/from16 v4, v54

    goto :goto_12

    :cond_16
    move-object/from16 v4, v45

    :goto_12
    const/4 v5, 0x7

    .line 595
    invoke-virtual {v1, v5, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v4, :cond_17

    .line 600
    invoke-virtual {v4}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_13

    :cond_17
    move-object/from16 v4, v45

    :goto_13
    const-wide/32 v52, 0xc0100

    and-long v56, v2, v52

    const-wide/16 v54, 0x0

    cmp-long v5, v56, v54

    if-eqz v5, :cond_19

    if-eqz v0, :cond_18

    .line 607
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getActiveCals()Landroidx/databinding/ObservableField;

    move-result-object v5

    move-object/from16 v56, v4

    goto :goto_14

    :cond_18
    move-object/from16 v56, v4

    move-object/from16 v5, v45

    :goto_14
    const/16 v4, 0x8

    .line 609
    invoke-virtual {v1, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_1a

    .line 614
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_15

    :cond_19
    move-object/from16 v56, v4

    :cond_1a
    move-object/from16 v4, v45

    :goto_15
    const-wide/32 v50, 0xc0200

    and-long v57, v2, v50

    const-wide/16 v54, 0x0

    cmp-long v5, v57, v54

    if-eqz v5, :cond_1c

    if-eqz v0, :cond_1b

    .line 621
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getAvgHeartRate()Landroidx/databinding/ObservableField;

    move-result-object v5

    move-object/from16 v57, v4

    goto :goto_16

    :cond_1b
    move-object/from16 v57, v4

    move-object/from16 v5, v45

    :goto_16
    const/16 v4, 0x9

    .line 623
    invoke-virtual {v1, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_1d

    .line 628
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_17

    :cond_1c
    move-object/from16 v57, v4

    :cond_1d
    move-object/from16 v4, v45

    :goto_17
    const-wide/32 v47, 0xc0400

    and-long v58, v2, v47

    const-wide/16 v54, 0x0

    cmp-long v5, v58, v54

    if-eqz v5, :cond_1f

    if-eqz v0, :cond_1e

    .line 635
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getSubtitleField()Landroidx/databinding/ObservableField;

    move-result-object v5

    move-object/from16 v58, v4

    goto :goto_18

    :cond_1e
    move-object/from16 v58, v4

    move-object/from16 v5, v45

    :goto_18
    const/16 v4, 0xa

    .line 637
    invoke-virtual {v1, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_20

    .line 642
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_19

    :cond_1f
    move-object/from16 v58, v4

    :cond_20
    move-object/from16 v4, v45

    :goto_19
    const-wide/32 v32, 0xc0800

    and-long v59, v2, v32

    const-wide/16 v54, 0x0

    cmp-long v5, v59, v54

    if-eqz v5, :cond_22

    if-eqz v0, :cond_21

    .line 649
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getStartTime()Landroidx/databinding/ObservableField;

    move-result-object v5

    move-object/from16 v59, v4

    goto :goto_1a

    :cond_21
    move-object/from16 v59, v4

    move-object/from16 v5, v45

    :goto_1a
    const/16 v4, 0xb

    .line 651
    invoke-virtual {v1, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_23

    .line 656
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_1b

    :cond_22
    move-object/from16 v59, v4

    :cond_23
    move-object/from16 v4, v45

    :goto_1b
    and-long v60, v2, v24

    const-wide/16 v54, 0x0

    cmp-long v5, v60, v54

    if-eqz v5, :cond_26

    if-eqz v0, :cond_24

    .line 663
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getHasLocations()Landroidx/databinding/ObservableField;

    move-result-object v5

    move-object/from16 v60, v4

    goto :goto_1c

    :cond_24
    move-object/from16 v60, v4

    move-object/from16 v5, v45

    :goto_1c
    const/16 v4, 0xc

    .line 665
    invoke-virtual {v1, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_25

    .line 670
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto :goto_1d

    :cond_25
    move-object/from16 v4, v45

    .line 675
    :goto_1d
    invoke-static {v4}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v4

    xor-int/lit8 v5, v4, 0x1

    .line 683
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v5}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v5

    goto :goto_1e

    :cond_26
    move-object/from16 v60, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_1e
    const-wide/32 v61, 0xc2000

    and-long v61, v2, v61

    const-wide/16 v54, 0x0

    cmp-long v63, v61, v54

    if-eqz v63, :cond_28

    if-eqz v0, :cond_27

    .line 689
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getTotalAscendedValue()Landroidx/databinding/ObservableField;

    move-result-object v61

    move/from16 v62, v5

    move-object/from16 v78, v61

    move/from16 v61, v4

    move-object/from16 v4, v78

    goto :goto_1f

    :cond_27
    move/from16 v61, v4

    move/from16 v62, v5

    move-object/from16 v4, v45

    :goto_1f
    const/16 v5, 0xd

    .line 691
    invoke-virtual {v1, v5, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v4, :cond_29

    .line 696
    invoke-virtual {v4}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_20

    :cond_28
    move/from16 v61, v4

    move/from16 v62, v5

    :cond_29
    move-object/from16 v4, v45

    :goto_20
    const-wide/32 v63, 0xc4000

    and-long v63, v2, v63

    const-wide/16 v54, 0x0

    cmp-long v5, v63, v54

    if-eqz v5, :cond_2b

    if-eqz v0, :cond_2a

    .line 703
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getTotalDescendedValue()Landroidx/databinding/ObservableField;

    move-result-object v5

    move-object/from16 v63, v4

    goto :goto_21

    :cond_2a
    move-object/from16 v63, v4

    move-object/from16 v5, v45

    :goto_21
    const/16 v4, 0xe

    .line 705
    invoke-virtual {v1, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_2c

    .line 710
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_22

    :cond_2b
    move-object/from16 v63, v4

    :cond_2c
    move-object/from16 v4, v45

    :goto_22
    const-wide/32 v64, 0xc8000

    and-long v64, v2, v64

    const-wide/16 v54, 0x0

    cmp-long v5, v64, v54

    if-eqz v5, :cond_2f

    if-eqz v0, :cond_2d

    .line 717
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getRightArrowVisible()Landroidx/databinding/ObservableField;

    move-result-object v5

    move-object/from16 v64, v4

    goto :goto_23

    :cond_2d
    move-object/from16 v64, v4

    move-object/from16 v5, v45

    :goto_23
    const/16 v4, 0xf

    .line 719
    invoke-virtual {v1, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_2e

    .line 724
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    goto :goto_24

    :cond_2e
    move-object/from16 v4, v45

    .line 729
    :goto_24
    invoke-static {v4}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v65

    goto :goto_25

    :cond_2f
    move-object/from16 v64, v4

    move-object/from16 v4, v45

    move-object v5, v4

    const/16 v65, 0x0

    :goto_25
    and-long v66, v2, v18

    const-wide/16 v54, 0x0

    cmp-long v68, v66, v54

    if-eqz v68, :cond_31

    if-eqz v0, :cond_30

    .line 735
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getPace()Landroidx/databinding/ObservableField;

    move-result-object v66

    move-object/from16 v67, v5

    move-object/from16 v78, v66

    move-object/from16 v66, v4

    move-object/from16 v4, v78

    goto :goto_26

    :cond_30
    move-object/from16 v66, v4

    move-object/from16 v67, v5

    move-object/from16 v4, v45

    :goto_26
    const/16 v5, 0x10

    .line 737
    invoke-virtual {v1, v5, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v4, :cond_32

    .line 742
    invoke-virtual {v4}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_27

    :cond_31
    move-object/from16 v66, v4

    move-object/from16 v67, v5

    :cond_32
    move-object/from16 v4, v45

    :goto_27
    and-long v68, v2, v28

    const-wide/16 v54, 0x0

    cmp-long v5, v68, v54

    if-eqz v5, :cond_35

    if-eqz v0, :cond_33

    .line 749
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getHasHeartRates()Landroidx/databinding/ObservableField;

    move-result-object v5

    move-wide/from16 v68, v2

    goto :goto_28

    :cond_33
    move-wide/from16 v68, v2

    move-object/from16 v5, v45

    :goto_28
    const/16 v2, 0x11

    .line 751
    invoke-virtual {v1, v2, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_34

    .line 756
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v45, v2

    check-cast v45, Ljava/lang/Boolean;

    .line 761
    :cond_34
    invoke-static/range {v45 .. v45}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v2

    move-object/from16 v70, v6

    move-object/from16 v76, v8

    move-object/from16 v74, v11

    move-object/from16 v11, v56

    move-object/from16 v75, v57

    move-object/from16 v71, v58

    move-object/from16 v77, v59

    move/from16 v5, v61

    move/from16 v6, v62

    move-object/from16 v72, v63

    move-object/from16 v73, v64

    move-object/from16 v45, v67

    move-object v8, v4

    move/from16 v56, v10

    move-object/from16 v10, v60

    move v4, v2

    move-wide/from16 v2, v68

    goto :goto_29

    :cond_35
    move-wide/from16 v68, v2

    move-object/from16 v70, v6

    move-object/from16 v76, v8

    move-object/from16 v74, v11

    move-object/from16 v11, v56

    move-object/from16 v75, v57

    move-object/from16 v71, v58

    move-object/from16 v77, v59

    move/from16 v5, v61

    move/from16 v6, v62

    move-object/from16 v72, v63

    move-object/from16 v73, v64

    move-object/from16 v45, v67

    move-object v8, v4

    move/from16 v56, v10

    move-object/from16 v10, v60

    const/4 v4, 0x0

    goto :goto_29

    :cond_36
    move-object/from16 v7, v45

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object/from16 v66, v12

    move-object/from16 v70, v66

    move-object/from16 v71, v70

    move-object/from16 v72, v71

    move-object/from16 v73, v72

    move-object/from16 v74, v73

    move-object/from16 v75, v74

    move-object/from16 v76, v75

    move-object/from16 v77, v76

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v56, 0x0

    const/16 v65, 0x0

    :goto_29
    and-long v42, v2, v42

    const-wide/16 v54, 0x0

    cmp-long v57, v42, v54

    if-eqz v57, :cond_39

    if-eqz v0, :cond_37

    .line 770
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getRightArrowVisible()Landroidx/databinding/ObservableField;

    move-result-object v45

    :cond_37
    move/from16 v42, v15

    move-object/from16 v0, v45

    const/16 v15, 0xf

    .line 772
    invoke-virtual {v1, v15, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v0, :cond_38

    .line 777
    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v66, v0

    check-cast v66, Ljava/lang/Boolean;

    .line 782
    :cond_38
    invoke-static/range {v66 .. v66}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v65

    goto :goto_2a

    :cond_39
    move/from16 v42, v15

    :goto_2a
    move/from16 v0, v65

    and-long v38, v2, v38

    const-wide/16 v43, 0x0

    cmp-long v15, v38, v43

    if-eqz v15, :cond_3b

    if-eqz v14, :cond_3a

    const/16 v49, 0x1

    goto :goto_2b

    :cond_3a
    move/from16 v49, v0

    :goto_2b
    move/from16 v38, v0

    move/from16 v0, v49

    goto :goto_2c

    :cond_3b
    move/from16 v38, v0

    const/4 v0, 0x0

    :goto_2c
    and-long v34, v2, v34

    cmp-long v39, v34, v43

    move/from16 v34, v13

    if-eqz v39, :cond_3c

    .line 794
    iget-object v13, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->activityName:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v13, v9}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_3c
    if-eqz v15, :cond_3d

    .line 799
    iget-object v9, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->activityName:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v9, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->centerHorizontalInRelative(Landroid/view/View;Z)V

    .line 800
    iget-object v9, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->subtitleLabel:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v9, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->centerHorizontalInRelative(Landroid/view/View;Z)V

    :cond_3d
    and-long v28, v2, v28

    const-wide/16 v43, 0x0

    cmp-long v0, v28, v43

    if-eqz v0, :cond_3e

    .line 805
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->chartFragmentContainer:Landroid/widget/FrameLayout;

    invoke-static {v0, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_3e
    and-long v24, v2, v24

    cmp-long v0, v24, v43

    if-eqz v0, :cond_3f

    .line 810
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mapsFragmentContainer:Landroid/widget/FrameLayout;

    invoke-static {v0, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 811
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView21:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_3f
    and-long v4, v2, v36

    cmp-long v0, v4, v43

    if-eqz v0, :cond_40

    .line 816
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView1:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 817
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView4:Landroid/widget/ImageView;

    invoke-virtual {v0, v12}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_40
    const-wide/32 v4, 0xc0020

    and-long/2addr v4, v2

    cmp-long v0, v4, v43

    if-eqz v0, :cond_41

    .line 822
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView1:Landroid/widget/ImageView;

    invoke-static {v0, v14}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_41
    and-long v4, v2, v18

    cmp-long v0, v4, v43

    if-eqz v0, :cond_42

    .line 827
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView10:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v8}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_42
    and-long v4, v2, v16

    cmp-long v0, v4, v43

    if-eqz v0, :cond_43

    .line 832
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView11:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_43
    const-wide/32 v4, 0xc0800

    and-long/2addr v4, v2

    cmp-long v0, v4, v43

    if-eqz v0, :cond_44

    .line 837
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView12:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_44
    and-long v4, v2, v20

    cmp-long v0, v4, v43

    if-eqz v0, :cond_45

    .line 842
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView13:Landroid/widget/RelativeLayout;

    move/from16 v13, v34

    invoke-static {v0, v13}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 843
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView15:Landroid/widget/RelativeLayout;

    invoke-static {v0, v13}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 844
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView7:Landroid/widget/RelativeLayout;

    move/from16 v15, v42

    invoke-static {v0, v15}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 845
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView9:Landroid/widget/RelativeLayout;

    invoke-static {v0, v15}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_45
    and-long v4, v2, v40

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-eqz v0, :cond_46

    .line 850
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView14:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-object/from16 v4, v70

    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_46
    const-wide/32 v4, 0xc0200

    and-long/2addr v4, v2

    cmp-long v0, v4, v6

    if-eqz v0, :cond_47

    .line 855
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView16:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-object/from16 v4, v71

    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_47
    and-long v4, v2, v26

    cmp-long v0, v4, v6

    if-eqz v0, :cond_48

    .line 860
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView17:Landroid/widget/RelativeLayout;

    move/from16 v10, v56

    invoke-static {v0, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 861
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView19:Landroid/widget/RelativeLayout;

    invoke-static {v0, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_48
    const-wide/32 v4, 0xc2000

    and-long/2addr v4, v2

    cmp-long v0, v4, v6

    if-eqz v0, :cond_49

    .line 866
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView18:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-object/from16 v4, v72

    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_49
    const-wide/32 v4, 0xc4000

    and-long/2addr v4, v2

    cmp-long v0, v4, v6

    if-eqz v0, :cond_4a

    .line 871
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView20:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-object/from16 v4, v73

    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_4a
    const-wide/32 v4, 0xc8000

    and-long/2addr v4, v2

    cmp-long v0, v4, v6

    if-eqz v0, :cond_4b

    .line 876
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView4:Landroid/widget/ImageView;

    move/from16 v4, v38

    invoke-static {v0, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_4b
    and-long v4, v2, v22

    cmp-long v0, v4, v6

    if-eqz v0, :cond_4c

    .line 881
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView5:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-object/from16 v11, v74

    invoke-static {v0, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_4c
    const-wide/32 v4, 0xc0100

    and-long/2addr v4, v2

    cmp-long v0, v4, v6

    if-eqz v0, :cond_4d

    .line 886
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView6:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-object/from16 v4, v75

    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_4d
    and-long v4, v2, v30

    cmp-long v0, v4, v6

    if-eqz v0, :cond_4e

    .line 891
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-object/from16 v8, v76

    invoke-static {v0, v8}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_4e
    const-wide/32 v4, 0xc0400

    and-long/2addr v2, v4

    cmp-long v0, v2, v6

    if-eqz v0, :cond_4f

    .line 896
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->subtitleLabel:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    move-object/from16 v2, v77

    invoke-static {v0, v2}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_4f
    return-void

    :catchall_0
    move-exception v0

    .line 399
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 159
    monitor-enter p0

    .line 160
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 161
    monitor-exit p0

    return v0

    .line 163
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

    .line 151
    monitor-enter p0

    const-wide/32 v0, 0x80000

    .line 152
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 153
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 153
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

    .line 226
    :pswitch_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->onChangeViewModelHasHeartRates(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 224
    :pswitch_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->onChangeViewModelPace(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 222
    :pswitch_2
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->onChangeViewModelRightArrowVisible(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 220
    :pswitch_3
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->onChangeViewModelTotalDescendedValue(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 218
    :pswitch_4
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->onChangeViewModelTotalAscendedValue(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 216
    :pswitch_5
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->onChangeViewModelHasLocations(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 214
    :pswitch_6
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->onChangeViewModelStartTime(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 212
    :pswitch_7
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->onChangeViewModelSubtitleField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 210
    :pswitch_8
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->onChangeViewModelAvgHeartRate(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 208
    :pswitch_9
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->onChangeViewModelActiveCals(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 206
    :pswitch_a
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->onChangeViewModelDate(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 204
    :pswitch_b
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->onChangeViewModelHiitActivityDisplayed(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 202
    :pswitch_c
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->onChangeViewModelLeftArrowVisible(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 200
    :pswitch_d
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->onChangeViewModelDuration(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 198
    :pswitch_e
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->onChangeViewModelAscendDisplayed(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 196
    :pswitch_f
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->onChangeViewModelNameField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 194
    :pswitch_10
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->onChangeViewModelDistance(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 192
    :pswitch_11
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->onChangeViewModelMaxHRValue(Landroidx/databinding/ObservableField;I)Z

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

    .line 171
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;)V

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

    .line 180
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    .line 181
    monitor-enter p0

    .line 182
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/32 v2, 0x40000

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->mDirtyFlags:J

    .line 183
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 184
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBindingImpl;->notifyPropertyChanged(I)V

    .line 185
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 183
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
