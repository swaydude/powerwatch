.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBinding;
.source "FragmentEditUserActivityBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl$OnClickListenerImpl1;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private locationEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private mDirtyFlags:J

.field private mViewModelOnActivityTypeClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl$OnClickListenerImpl1;

.field private mViewModelOnDeleteClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl$OnClickListenerImpl;

.field private final mboundView1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private mboundView1androidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private final mboundView2:Landroid/widget/ImageView;

.field private final mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView5:Landroid/widget/ProgressBar;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f08004c

    const/4 v2, 0x6

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080156

    const/4 v2, 0x7

    .line 18
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

    .line 111
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x8

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

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

    const/4 v0, 0x6

    .line 114
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/4 v0, 0x0

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/LinearLayout;

    const/4 v4, 0x3

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Landroid/widget/LinearLayout;)V

    .line 35
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl$1;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->locationEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 72
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl$2;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mboundView1androidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    const-wide/16 v0, -0x1

    .line 356
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mDirtyFlags:J

    .line 120
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->locationEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;->setTag(Ljava/lang/Object;)V

    .line 121
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mainView:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 122
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mboundView1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 123
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 124
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mboundView2:Landroid/widget/ImageView;

    .line 125
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x4

    .line 126
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 127
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x5

    .line 128
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mboundView5:Landroid/widget/ProgressBar;

    .line 129
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setTag(Ljava/lang/Object;)V

    .line 130
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 132
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->invalidateAll()V

    return-void
.end method

.method static synthetic access$000(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;
    .locals 0

    .line 8
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mboundView1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    return-object p0
.end method

.method private onChangeViewModelIsProgressVisible(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelIsProgressVisible",
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

    .line 188
    monitor-enter p0

    .line 189
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mDirtyFlags:J

    .line 190
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

.method private onChangeViewModelLocationField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelLocationField",
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

    .line 206
    monitor-enter p0

    .line 207
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mDirtyFlags:J

    .line 208
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

.method private onChangeViewModelTypeField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelTypeField",
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

    .line 197
    monitor-enter p0

    .line 198
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mDirtyFlags:J

    .line 199
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
    .locals 23

    move-object/from16 v1, p0

    .line 217
    monitor-enter p0

    .line 218
    :try_start_0
    iget-wide v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 219
    iput-wide v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mDirtyFlags:J

    .line 220
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 229
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;

    const-wide/16 v6, 0x1f

    and-long/2addr v6, v2

    const-wide/16 v8, 0x18

    const-wide/16 v10, 0x1a

    const-wide/16 v12, 0x19

    const/4 v14, 0x0

    const/4 v15, 0x0

    cmp-long v18, v6, v4

    if-eqz v18, :cond_a

    and-long v6, v2, v12

    cmp-long v18, v6, v4

    if-eqz v18, :cond_2

    if-eqz v0, :cond_0

    .line 241
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->isProgressVisible()Landroidx/databinding/ObservableField;

    move-result-object v6

    goto :goto_0

    :cond_0
    move-object v6, v15

    .line 243
    :goto_0
    invoke-virtual {v1, v14, v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v6, :cond_1

    .line 248
    invoke-virtual {v6}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    goto :goto_1

    :cond_1
    move-object v6, v15

    .line 253
    :goto_1
    invoke-static {v6}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v6

    xor-int/lit8 v7, v6, 0x1

    .line 261
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v7}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v7

    move v14, v7

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    and-long v18, v2, v10

    cmp-long v7, v18, v4

    if-eqz v7, :cond_4

    if-eqz v0, :cond_3

    .line 267
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->getTypeField()Landroidx/databinding/ObservableField;

    move-result-object v7

    goto :goto_3

    :cond_3
    move-object v7, v15

    :goto_3
    const/4 v12, 0x1

    .line 269
    invoke-virtual {v1, v12, v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v7, :cond_4

    .line 274
    invoke-virtual {v7}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object v7, v15

    :goto_4
    and-long v12, v2, v8

    cmp-long v20, v12, v4

    if-eqz v20, :cond_7

    if-eqz v0, :cond_7

    .line 281
    iget-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mViewModelOnDeleteClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl$OnClickListenerImpl;

    if-nez v12, :cond_5

    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl$OnClickListenerImpl;

    invoke-direct {v12}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mViewModelOnDeleteClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl$OnClickListenerImpl;

    :cond_5
    invoke-virtual {v12, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl$OnClickListenerImpl;

    move-result-object v12

    .line 283
    iget-object v13, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mViewModelOnActivityTypeClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl$OnClickListenerImpl1;

    if-nez v13, :cond_6

    new-instance v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl$OnClickListenerImpl1;

    invoke-direct {v13}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl$OnClickListenerImpl1;-><init>()V

    iput-object v13, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mViewModelOnActivityTypeClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl$OnClickListenerImpl1;

    :cond_6
    invoke-virtual {v13, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl$OnClickListenerImpl1;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl$OnClickListenerImpl1;

    move-result-object v13

    goto :goto_5

    :cond_7
    move-object v12, v15

    move-object v13, v12

    :goto_5
    const-wide/16 v16, 0x1c

    and-long v20, v2, v16

    cmp-long v22, v20, v4

    if-eqz v22, :cond_9

    if-eqz v0, :cond_8

    .line 290
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->getLocationField()Landroidx/databinding/ObservableField;

    move-result-object v0

    goto :goto_6

    :cond_8
    move-object v0, v15

    :goto_6
    const/4 v8, 0x2

    .line 292
    invoke-virtual {v1, v8, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v0, :cond_9

    .line 297
    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_7

    :cond_9
    move-object v0, v15

    goto :goto_7

    :cond_a
    move-object v0, v15

    move-object v7, v0

    move-object v12, v7

    move-object v13, v12

    const/4 v6, 0x0

    :goto_7
    const-wide/16 v8, 0x1c

    and-long/2addr v8, v2

    cmp-long v16, v8, v4

    if-eqz v16, :cond_b

    .line 305
    iget-object v8, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->locationEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-static {v8, v0}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_b
    const-wide/16 v8, 0x10

    and-long/2addr v8, v2

    cmp-long v0, v8, v4

    if-eqz v0, :cond_c

    .line 310
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->locationEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    move-object v8, v15

    check-cast v8, Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;

    move-object v9, v15

    check-cast v9, Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;

    check-cast v15, Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;

    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->locationEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v0, v8, v9, v15, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 311
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mboundView1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mboundView1androidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v0, v8, v9, v15, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    :cond_c
    and-long v4, v2, v10

    const-wide/16 v8, 0x0

    cmp-long v0, v4, v8

    if-eqz v0, :cond_d

    .line 316
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mboundView1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v7}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_d
    const-wide/16 v4, 0x18

    and-long/2addr v4, v2

    cmp-long v0, v4, v8

    if-eqz v0, :cond_e

    .line 321
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mboundView2:Landroid/widget/ImageView;

    invoke-virtual {v0, v13}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 322
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v0, v12}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_e
    const-wide/16 v4, 0x19

    and-long/2addr v2, v4

    cmp-long v0, v2, v8

    if-eqz v0, :cond_f

    .line 327
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v14}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 328
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mboundView5:Landroid/widget/ProgressBar;

    invoke-static {v0, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_f
    return-void

    :catchall_0
    move-exception v0

    .line 220
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 145
    monitor-enter p0

    .line 146
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 147
    monitor-exit p0

    return v0

    .line 149
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

    .line 137
    monitor-enter p0

    const-wide/16 v0, 0x10

    .line 138
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mDirtyFlags:J

    .line 139
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 139
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

    .line 182
    :cond_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->onChangeViewModelLocationField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 180
    :cond_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->onChangeViewModelTypeField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 178
    :cond_2
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->onChangeViewModelIsProgressVisible(Landroidx/databinding/ObservableField;I)Z

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

    .line 157
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 166
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;

    .line 167
    monitor-enter p0

    .line 168
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x8

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->mDirtyFlags:J

    .line 169
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 170
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBindingImpl;->notifyPropertyChanged(I)V

    .line 171
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 169
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
