.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBinding;
.source "FragmentForgotPasswordBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private emailEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private mDirtyFlags:J

.field private mViewModelOnForgotPasswordClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl$OnClickListenerImpl;

.field private final mboundView0:Landroid/widget/FrameLayout;

.field private final mboundView2:Landroid/widget/LinearLayout;

.field private final mboundView5:Landroid/widget/ProgressBar;

.field private final mboundView6:Landroid/widget/TextView;

.field private final mboundView7:Landroid/widget/FrameLayout;

.field private final mboundView8:Landroid/widget/TextView;

.field private final mboundView9:Landroid/widget/LinearLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f080163

    const/16 v2, 0xa

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

    .line 78
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0xb

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

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

    const/4 v0, 0x4

    .line 81
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/Button;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/EditText;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    const/4 v4, 0x5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/Button;Landroid/widget/EditText;Landroid/widget/LinearLayout;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;)V

    .line 39
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl$1;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->emailEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    const-wide/16 v0, -0x1

    .line 400
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mDirtyFlags:J

    .line 87
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->createAccount:Landroid/widget/Button;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    .line 88
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->emailEditText:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setTag(Ljava/lang/Object;)V

    .line 89
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->loginDetails:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 90
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mboundView0:Landroid/widget/FrameLayout;

    .line 91
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 92
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mboundView2:Landroid/widget/LinearLayout;

    .line 93
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x5

    .line 94
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mboundView5:Landroid/widget/ProgressBar;

    .line 95
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x6

    .line 96
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mboundView6:Landroid/widget/TextView;

    .line 97
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x7

    .line 98
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mboundView7:Landroid/widget/FrameLayout;

    .line 99
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0x8

    .line 100
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mboundView8:Landroid/widget/TextView;

    .line 101
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0x9

    .line 102
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mboundView9:Landroid/widget/LinearLayout;

    .line 103
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    .line 104
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 106
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewModelDisplayNetworkError(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelDisplayNetworkError",
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

    .line 166
    monitor-enter p0

    .line 167
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mDirtyFlags:J

    .line 168
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

.method private onChangeViewModelEmailField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelEmailField",
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

    .line 193
    monitor-enter p0

    .line 194
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x8

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mDirtyFlags:J

    .line 195
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

    .line 202
    monitor-enter p0

    .line 203
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x10

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mDirtyFlags:J

    .line 204
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

    .line 184
    monitor-enter p0

    .line 185
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mDirtyFlags:J

    .line 186
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

.method private onChangeViewModelResponseSuccess(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelResponseSuccess",
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

    .line 175
    monitor-enter p0

    .line 176
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mDirtyFlags:J

    .line 177
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
    .locals 29

    move-object/from16 v1, p0

    .line 213
    monitor-enter p0

    .line 214
    :try_start_0
    iget-wide v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 215
    iput-wide v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mDirtyFlags:J

    .line 216
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 233
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;

    const-wide/16 v6, 0x7f

    and-long/2addr v6, v2

    const-wide/16 v10, 0x68

    const-wide/16 v12, 0x62

    const-wide/16 v14, 0x64

    const-wide/16 v16, 0x61

    const-wide/16 v18, 0x60

    const/4 v8, 0x0

    cmp-long v22, v6, v4

    if-eqz v22, :cond_f

    and-long v6, v2, v16

    cmp-long v22, v6, v4

    if-eqz v22, :cond_2

    if-eqz v0, :cond_0

    .line 244
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->getDisplayNetworkError()Landroidx/databinding/ObservableField;

    move-result-object v6

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 246
    :goto_0
    invoke-virtual {v1, v8, v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v6, :cond_1

    .line 251
    invoke-virtual {v6}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    .line 256
    :goto_1
    invoke-static {v6}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v6

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    and-long v22, v2, v12

    cmp-long v7, v22, v4

    if-eqz v7, :cond_5

    if-eqz v0, :cond_3

    .line 262
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->getResponseSuccess()Landroidx/databinding/ObservableField;

    move-result-object v7

    goto :goto_3

    :cond_3
    const/4 v7, 0x0

    :goto_3
    const/4 v8, 0x1

    .line 264
    invoke-virtual {v1, v8, v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v7, :cond_4

    .line 269
    invoke-virtual {v7}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    goto :goto_4

    :cond_4
    const/4 v7, 0x0

    .line 274
    :goto_4
    invoke-static {v7}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v7

    xor-int/lit8 v8, v7, 0x1

    .line 282
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-static {v8}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v8

    goto :goto_5

    :cond_5
    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_5
    and-long v23, v2, v14

    cmp-long v25, v23, v4

    if-eqz v25, :cond_8

    if-eqz v0, :cond_6

    .line 288
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->isButtonVisible()Landroidx/databinding/ObservableField;

    move-result-object v22

    move-object/from16 v12, v22

    goto :goto_6

    :cond_6
    const/4 v12, 0x0

    :goto_6
    const/4 v13, 0x2

    .line 290
    invoke-virtual {v1, v13, v12}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v12, :cond_7

    .line 295
    invoke-virtual {v12}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    goto :goto_7

    :cond_7
    const/4 v12, 0x0

    .line 300
    :goto_7
    invoke-static {v12}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v12

    xor-int/lit8 v13, v12, 0x1

    .line 308
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-static {v13}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v13

    move/from16 v22, v12

    goto :goto_8

    :cond_8
    const/4 v13, 0x0

    const/16 v22, 0x0

    :goto_8
    and-long v25, v2, v10

    cmp-long v12, v25, v4

    if-eqz v12, :cond_a

    if-eqz v0, :cond_9

    .line 314
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->getEmailField()Landroidx/databinding/ObservableField;

    move-result-object v12

    goto :goto_9

    :cond_9
    const/4 v12, 0x0

    :goto_9
    const/4 v9, 0x3

    .line 316
    invoke-virtual {v1, v9, v12}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v12, :cond_a

    .line 321
    invoke-virtual {v12}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    goto :goto_a

    :cond_a
    const/4 v9, 0x0

    :goto_a
    const-wide/16 v20, 0x70

    and-long v26, v2, v20

    cmp-long v12, v26, v4

    if-eqz v12, :cond_c

    if-eqz v0, :cond_b

    .line 328
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->getErrorMessage()Landroidx/databinding/ObservableField;

    move-result-object v12

    goto :goto_b

    :cond_b
    const/4 v12, 0x0

    :goto_b
    const/4 v10, 0x4

    .line 330
    invoke-virtual {v1, v10, v12}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v12, :cond_c

    .line 335
    invoke-virtual {v12}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    goto :goto_c

    :cond_c
    const/4 v10, 0x0

    :goto_c
    and-long v11, v2, v18

    cmp-long v28, v11, v4

    if-eqz v28, :cond_e

    if-eqz v0, :cond_e

    .line 342
    iget-object v11, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mViewModelOnForgotPasswordClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl$OnClickListenerImpl;

    if-nez v11, :cond_d

    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl$OnClickListenerImpl;

    invoke-direct {v11}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v11, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mViewModelOnForgotPasswordClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl$OnClickListenerImpl;

    :cond_d
    invoke-virtual {v11, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl$OnClickListenerImpl;

    move-result-object v0

    move-object v11, v10

    goto :goto_d

    :cond_e
    move-object v11, v10

    const/4 v0, 0x0

    :goto_d
    move-object v10, v9

    move v9, v6

    move v6, v8

    move/from16 v8, v22

    goto :goto_e

    :cond_f
    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    :goto_e
    and-long v18, v2, v18

    cmp-long v12, v18, v4

    if-eqz v12, :cond_10

    .line 350
    iget-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->createAccount:Landroid/widget/Button;

    invoke-virtual {v12, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_10
    and-long/2addr v14, v2

    cmp-long v0, v14, v4

    if-eqz v0, :cond_11

    .line 355
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->createAccount:Landroid/widget/Button;

    invoke-static {v0, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 356
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mboundView5:Landroid/widget/ProgressBar;

    invoke-static {v0, v13}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_11
    const-wide/16 v12, 0x68

    and-long/2addr v12, v2

    cmp-long v0, v12, v4

    if-eqz v0, :cond_12

    .line 361
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->emailEditText:Landroid/widget/EditText;

    invoke-static {v0, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_12
    const-wide/16 v12, 0x40

    and-long/2addr v12, v2

    cmp-long v0, v12, v4

    if-eqz v0, :cond_13

    .line 366
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->emailEditText:Landroid/widget/EditText;

    const/4 v8, 0x0

    move-object v10, v8

    check-cast v10, Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;

    move-object v12, v8

    check-cast v12, Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;

    check-cast v8, Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;

    iget-object v13, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->emailEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v0, v10, v12, v8, v13}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    :cond_13
    const-wide/16 v12, 0x62

    and-long/2addr v12, v2

    cmp-long v0, v12, v4

    if-eqz v0, :cond_14

    .line 371
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mboundView2:Landroid/widget/LinearLayout;

    invoke-static {v0, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 372
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mboundView7:Landroid/widget/FrameLayout;

    invoke-static {v0, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 373
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mboundView8:Landroid/widget/TextView;

    invoke-static {v0, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_14
    const-wide/16 v6, 0x70

    and-long/2addr v6, v2

    cmp-long v0, v6, v4

    if-eqz v0, :cond_15

    .line 378
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mboundView6:Landroid/widget/TextView;

    invoke-static {v0, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_15
    and-long v2, v2, v16

    cmp-long v0, v2, v4

    if-eqz v0, :cond_16

    .line 383
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mboundView9:Landroid/widget/LinearLayout;

    invoke-static {v0, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->showWithTimer(Landroid/view/View;Z)V

    :cond_16
    return-void

    :catchall_0
    move-exception v0

    .line 216
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 119
    monitor-enter p0

    .line 120
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 121
    monitor-exit p0

    return v0

    .line 123
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

    .line 111
    monitor-enter p0

    const-wide/16 v0, 0x40

    .line 112
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mDirtyFlags:J

    .line 113
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 113
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

    .line 160
    :cond_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->onChangeViewModelErrorMessage(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 158
    :cond_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->onChangeViewModelEmailField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 156
    :cond_2
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->onChangeViewModelIsButtonVisible(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 154
    :cond_3
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->onChangeViewModelResponseSuccess(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 152
    :cond_4
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->onChangeViewModelDisplayNetworkError(Landroidx/databinding/ObservableField;I)Z

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

    .line 131
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 140
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;

    .line 141
    monitor-enter p0

    .line 142
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x20

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mDirtyFlags:J

    .line 143
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 144
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->notifyPropertyChanged(I)V

    .line 145
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 143
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
