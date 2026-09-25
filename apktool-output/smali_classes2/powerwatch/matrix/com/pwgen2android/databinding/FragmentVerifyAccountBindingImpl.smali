.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBinding;
.source "FragmentVerifyAccountBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl$OnClickListenerImpl1;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private mViewModelOnContinueClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl$OnClickListenerImpl1;

.field private mViewModelOnResendClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl$OnClickListenerImpl;

.field private final mboundView0:Landroid/widget/LinearLayout;

.field private final mboundView1:Landroid/widget/FrameLayout;

.field private final mboundView2:Landroid/widget/TextView;

.field private final mboundView4:Landroid/widget/ProgressBar;

.field private final mboundView5:Landroid/widget/TextView;

.field private final mboundView6:Landroid/widget/TextView;

.field private final mboundView7:Landroid/widget/TextView;


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

    .line 41
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x8

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 4
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

    const/4 v0, 0x3

    .line 44
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/Button;

    const/4 v1, 0x4

    invoke-direct {p0, p1, p2, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/Button;)V

    const-wide/16 v2, -0x1

    .line 314
    iput-wide v2, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mDirtyFlags:J

    .line 47
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->continueButton:Landroid/widget/Button;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 48
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    .line 49
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 50
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mboundView1:Landroid/widget/FrameLayout;

    .line 51
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 52
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 53
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 54
    aget-object p1, p3, v1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mboundView4:Landroid/widget/ProgressBar;

    .line 55
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x5

    .line 56
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mboundView5:Landroid/widget/TextView;

    .line 57
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x6

    .line 58
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mboundView6:Landroid/widget/TextView;

    .line 59
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x7

    .line 60
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mboundView7:Landroid/widget/TextView;

    .line 61
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 62
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 64
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewModelEmail(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelEmail",
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

    .line 122
    monitor-enter p0

    .line 123
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mDirtyFlags:J

    .line 124
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

.method private onChangeViewModelErrorMessage(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelErrorMessage",
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

    .line 149
    monitor-enter p0

    .line 150
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x8

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mDirtyFlags:J

    .line 151
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

.method private onChangeViewModelInfoMessage(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelInfoMessage",
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

    .line 140
    monitor-enter p0

    .line 141
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mDirtyFlags:J

    .line 142
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

.method private onChangeViewModelIsButtonVisible(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelIsButtonVisible",
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

    .line 131
    monitor-enter p0

    .line 132
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mDirtyFlags:J

    .line 133
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
    .locals 28

    move-object/from16 v1, p0

    .line 160
    monitor-enter p0

    .line 161
    :try_start_0
    iget-wide v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 162
    iput-wide v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mDirtyFlags:J

    .line 163
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;

    const-wide/16 v6, 0x3f

    and-long/2addr v6, v2

    const-wide/16 v8, 0x34

    const-wide/16 v12, 0x32

    const-wide/16 v14, 0x31

    const-wide/16 v16, 0x30

    const/4 v10, 0x0

    cmp-long v20, v6, v4

    if-eqz v20, :cond_c

    and-long v6, v2, v14

    cmp-long v20, v6, v4

    if-eqz v20, :cond_1

    if-eqz v0, :cond_0

    .line 186
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->getEmail()Landroidx/databinding/ObservableField;

    move-result-object v6

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 188
    :goto_0
    invoke-virtual {v1, v10, v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v6, :cond_1

    .line 193
    invoke-virtual {v6}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    and-long v20, v2, v12

    cmp-long v7, v20, v4

    if-eqz v7, :cond_4

    if-eqz v0, :cond_2

    .line 200
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->isButtonVisible()Landroidx/databinding/ObservableField;

    move-result-object v7

    goto :goto_2

    :cond_2
    const/4 v7, 0x0

    :goto_2
    const/4 v10, 0x1

    .line 202
    invoke-virtual {v1, v10, v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v7, :cond_3

    .line 207
    invoke-virtual {v7}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    goto :goto_3

    :cond_3
    const/4 v7, 0x0

    .line 212
    :goto_3
    invoke-static {v7}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v7

    xor-int/lit8 v10, v7, 0x1

    .line 220
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-static {v10}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v10

    move/from16 v27, v10

    move v10, v7

    move/from16 v7, v27

    goto :goto_4

    :cond_4
    const/4 v7, 0x0

    :goto_4
    and-long v20, v2, v16

    cmp-long v22, v20, v4

    if-eqz v22, :cond_7

    if-eqz v0, :cond_7

    .line 226
    iget-object v11, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mViewModelOnResendClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl$OnClickListenerImpl;

    if-nez v11, :cond_5

    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl$OnClickListenerImpl;

    invoke-direct {v11}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v11, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mViewModelOnResendClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl$OnClickListenerImpl;

    :cond_5
    invoke-virtual {v11, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl$OnClickListenerImpl;

    move-result-object v11

    .line 228
    iget-object v14, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mViewModelOnContinueClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl$OnClickListenerImpl1;

    if-nez v14, :cond_6

    new-instance v14, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl$OnClickListenerImpl1;

    invoke-direct {v14}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl$OnClickListenerImpl1;-><init>()V

    iput-object v14, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mViewModelOnContinueClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl$OnClickListenerImpl1;

    :cond_6
    invoke-virtual {v14, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl$OnClickListenerImpl1;->setValue(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl$OnClickListenerImpl1;

    move-result-object v14

    goto :goto_5

    :cond_7
    const/4 v11, 0x0

    const/4 v14, 0x0

    :goto_5
    and-long v23, v2, v8

    cmp-long v15, v23, v4

    if-eqz v15, :cond_9

    if-eqz v0, :cond_8

    .line 235
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->getInfoMessage()Landroidx/databinding/ObservableField;

    move-result-object v15

    goto :goto_6

    :cond_8
    const/4 v15, 0x0

    :goto_6
    const/4 v8, 0x2

    .line 237
    invoke-virtual {v1, v8, v15}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v15, :cond_9

    .line 242
    invoke-virtual {v15}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    goto :goto_7

    :cond_9
    const/4 v8, 0x0

    :goto_7
    const-wide/16 v18, 0x38

    and-long v25, v2, v18

    cmp-long v9, v25, v4

    if-eqz v9, :cond_b

    if-eqz v0, :cond_a

    .line 249
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->getErrorMessage()Landroidx/databinding/ObservableField;

    move-result-object v0

    goto :goto_8

    :cond_a
    const/4 v0, 0x0

    :goto_8
    const/4 v9, 0x3

    .line 251
    invoke-virtual {v1, v9, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v0, :cond_b

    .line 256
    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v9, v8

    move-object v8, v0

    move-object v0, v11

    move-object v11, v14

    goto :goto_9

    :cond_b
    move-object v9, v8

    move-object v0, v11

    move-object v11, v14

    const/4 v8, 0x0

    goto :goto_9

    :cond_c
    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    :goto_9
    and-long v14, v2, v16

    cmp-long v16, v14, v4

    if-eqz v16, :cond_d

    .line 264
    iget-object v14, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->continueButton:Landroid/widget/Button;

    invoke-virtual {v14, v11}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 265
    iget-object v11, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mboundView5:Landroid/widget/TextView;

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_d
    and-long v11, v2, v12

    cmp-long v0, v11, v4

    if-eqz v0, :cond_e

    .line 270
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->continueButton:Landroid/widget/Button;

    invoke-static {v0, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 271
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mboundView4:Landroid/widget/ProgressBar;

    invoke-static {v0, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_e
    const-wide/16 v10, 0x31

    and-long/2addr v10, v2

    cmp-long v0, v10, v4

    if-eqz v0, :cond_f

    .line 276
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mboundView2:Landroid/widget/TextView;

    invoke-static {v0, v6}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_f
    const-wide/16 v6, 0x38

    and-long/2addr v6, v2

    cmp-long v0, v6, v4

    if-eqz v0, :cond_10

    .line 281
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mboundView6:Landroid/widget/TextView;

    invoke-static {v0, v8}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_10
    const-wide/16 v6, 0x34

    and-long/2addr v2, v6

    cmp-long v0, v2, v4

    if-eqz v0, :cond_11

    .line 286
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mboundView7:Landroid/widget/TextView;

    invoke-static {v0, v9}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_11
    return-void

    :catchall_0
    move-exception v0

    .line 163
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 77
    monitor-enter p0

    .line 78
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 79
    monitor-exit p0

    return v0

    .line 81
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

    .line 69
    monitor-enter p0

    const-wide/16 v0, 0x20

    .line 70
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mDirtyFlags:J

    .line 71
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 71
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

    .line 116
    :cond_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->onChangeViewModelErrorMessage(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 114
    :cond_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->onChangeViewModelInfoMessage(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 112
    :cond_2
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->onChangeViewModelIsButtonVisible(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 110
    :cond_3
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->onChangeViewModelEmail(Landroidx/databinding/ObservableField;I)Z

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

    .line 89
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 98
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;

    .line 99
    monitor-enter p0

    .line 100
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x10

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->mDirtyFlags:J

    .line 101
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 102
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBindingImpl;->notifyPropertyChanged(I)V

    .line 103
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 101
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
