.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBinding;
.source "FragmentSignInBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl2;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl1;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private emailEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private mDirtyFlags:J

.field private mViewModelOnCreateAccountClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl;

.field private mViewModelOnForgotPasswordClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl2;

.field private mViewModelOnLoginClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl1;

.field private final mboundView0:Landroid/widget/FrameLayout;

.field private final mboundView10:Landroid/widget/LinearLayout;

.field private final mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView6:Landroid/widget/ProgressBar;

.field private final mboundView7:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private passwordEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;


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

    .line 114
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0xb

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

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

    const/4 v0, 0x2

    .line 117
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/LinearLayout;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/4 v4, 0x5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;Landroid/widget/LinearLayout;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;)V

    .line 38
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$1;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->emailEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 75
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$2;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->passwordEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    const-wide/16 v0, -0x1

    .line 452
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mDirtyFlags:J

    .line 124
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->emailEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;->setTag(Ljava/lang/Object;)V

    .line 125
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->errorTextView:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    .line 126
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->loginButton:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;->setTag(Ljava/lang/Object;)V

    .line 127
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->loginDetails:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 128
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mboundView0:Landroid/widget/FrameLayout;

    .line 129
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0xa

    .line 130
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mboundView10:Landroid/widget/LinearLayout;

    .line 131
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x4

    .line 132
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 133
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x6

    .line 134
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mboundView6:Landroid/widget/ProgressBar;

    .line 135
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x7

    .line 136
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mboundView7:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 137
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0x8

    .line 138
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 139
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    .line 140
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->passwordEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;->setTag(Ljava/lang/Object;)V

    .line 141
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 143
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->invalidateAll()V

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

    .line 203
    monitor-enter p0

    .line 204
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mDirtyFlags:J

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

    .line 221
    monitor-enter p0

    .line 222
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mDirtyFlags:J

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

    .line 230
    monitor-enter p0

    .line 231
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x8

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mDirtyFlags:J

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

    .line 212
    monitor-enter p0

    .line 213
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelPasswordField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelPasswordField",
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
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x10

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mDirtyFlags:J

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


# virtual methods
.method protected executeBindings()V
    .locals 29

    move-object/from16 v1, p0

    .line 250
    monitor-enter p0

    .line 251
    :try_start_0
    iget-wide v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 252
    iput-wide v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mDirtyFlags:J

    .line 253
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 269
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;

    const-wide/16 v6, 0x7f

    and-long/2addr v6, v2

    const-wide/16 v10, 0x62

    const-wide/16 v12, 0x68

    const-wide/16 v14, 0x61

    const-wide/16 v16, 0x60

    const-wide/16 v18, 0x64

    const/4 v8, 0x0

    cmp-long v20, v6, v4

    if-eqz v20, :cond_10

    and-long v6, v2, v16

    cmp-long v20, v6, v4

    if-eqz v20, :cond_3

    if-eqz v0, :cond_3

    .line 280
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mViewModelOnCreateAccountClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl;

    if-nez v6, :cond_0

    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl;

    invoke-direct {v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mViewModelOnCreateAccountClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl;

    :cond_0
    invoke-virtual {v6, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl;

    move-result-object v6

    .line 282
    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mViewModelOnLoginClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl1;

    if-nez v7, :cond_1

    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl1;

    invoke-direct {v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl1;-><init>()V

    iput-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mViewModelOnLoginClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl1;

    :cond_1
    invoke-virtual {v7, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl1;->setValue(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl1;

    move-result-object v7

    .line 284
    iget-object v9, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mViewModelOnForgotPasswordClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl2;

    if-nez v9, :cond_2

    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl2;

    invoke-direct {v9}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl2;-><init>()V

    iput-object v9, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mViewModelOnForgotPasswordClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl2;

    :cond_2
    invoke-virtual {v9, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl2;->setValue(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl$OnClickListenerImpl2;

    move-result-object v9

    goto :goto_0

    :cond_3
    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    :goto_0
    and-long v21, v2, v14

    cmp-long v23, v21, v4

    if-eqz v23, :cond_6

    if-eqz v0, :cond_4

    .line 291
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->getDisplayNetworkError()Landroidx/databinding/ObservableField;

    move-result-object v21

    move-object/from16 v14, v21

    goto :goto_1

    :cond_4
    const/4 v14, 0x0

    .line 293
    :goto_1
    invoke-virtual {v1, v8, v14}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v14, :cond_5

    .line 298
    invoke-virtual {v14}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    goto :goto_2

    :cond_5
    const/4 v14, 0x0

    .line 303
    :goto_2
    invoke-static {v14}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v14

    goto :goto_3

    :cond_6
    const/4 v14, 0x0

    :goto_3
    and-long v23, v2, v10

    cmp-long v15, v23, v4

    if-eqz v15, :cond_9

    if-eqz v0, :cond_7

    .line 309
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->isButtonVisible()Landroidx/databinding/ObservableField;

    move-result-object v8

    goto :goto_4

    :cond_7
    const/4 v8, 0x0

    :goto_4
    const/4 v15, 0x1

    .line 311
    invoke-virtual {v1, v15, v8}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v8, :cond_8

    .line 316
    invoke-virtual {v8}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    goto :goto_5

    :cond_8
    const/4 v8, 0x0

    .line 321
    :goto_5
    invoke-static {v8}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v8

    xor-int/lit8 v15, v8, 0x1

    .line 329
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-static {v15}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v15

    goto :goto_6

    :cond_9
    const/4 v15, 0x0

    :goto_6
    and-long v23, v2, v18

    cmp-long v25, v23, v4

    if-eqz v25, :cond_b

    if-eqz v0, :cond_a

    .line 335
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->getEmailField()Landroidx/databinding/ObservableField;

    move-result-object v23

    move-object/from16 v10, v23

    goto :goto_7

    :cond_a
    const/4 v10, 0x0

    :goto_7
    const/4 v11, 0x2

    .line 337
    invoke-virtual {v1, v11, v10}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v10, :cond_b

    .line 342
    invoke-virtual {v10}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    goto :goto_8

    :cond_b
    const/4 v10, 0x0

    :goto_8
    and-long v25, v2, v12

    cmp-long v11, v25, v4

    if-eqz v11, :cond_d

    if-eqz v0, :cond_c

    .line 349
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->getErrorMessage()Landroidx/databinding/ObservableField;

    move-result-object v11

    goto :goto_9

    :cond_c
    const/4 v11, 0x0

    :goto_9
    const/4 v12, 0x3

    .line 351
    invoke-virtual {v1, v12, v11}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v11, :cond_d

    .line 356
    invoke-virtual {v11}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    goto :goto_a

    :cond_d
    const/4 v11, 0x0

    :goto_a
    const-wide/16 v12, 0x70

    and-long v27, v2, v12

    cmp-long v12, v27, v4

    if-eqz v12, :cond_f

    if-eqz v0, :cond_e

    .line 363
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->getPasswordField()Landroidx/databinding/ObservableField;

    move-result-object v0

    goto :goto_b

    :cond_e
    const/4 v0, 0x0

    :goto_b
    const/4 v12, 0x4

    .line 365
    invoke-virtual {v1, v12, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v0, :cond_f

    .line 370
    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_c

    :cond_f
    const/4 v0, 0x0

    goto :goto_c

    :cond_10
    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_c
    and-long v12, v2, v18

    cmp-long v18, v12, v4

    if-eqz v18, :cond_11

    .line 378
    iget-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->emailEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-static {v12, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_11
    const-wide/16 v12, 0x40

    and-long/2addr v12, v2

    cmp-long v10, v12, v4

    if-eqz v10, :cond_12

    .line 383
    iget-object v10, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->emailEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/4 v12, 0x0

    move-object v13, v12

    check-cast v13, Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;

    move-object v4, v12

    check-cast v4, Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;

    move-object v5, v12

    check-cast v5, Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;

    iget-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->emailEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v10, v13, v4, v5, v12}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 384
    iget-object v10, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->passwordEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    iget-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->passwordEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v10, v13, v4, v5, v12}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    :cond_12
    const-wide/16 v4, 0x68

    and-long/2addr v4, v2

    const-wide/16 v12, 0x0

    cmp-long v10, v4, v12

    if-eqz v10, :cond_13

    .line 389
    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->errorTextView:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v4, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_13
    and-long v4, v2, v16

    cmp-long v10, v4, v12

    if-eqz v10, :cond_14

    .line 394
    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->loginButton:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    invoke-virtual {v4, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 395
    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v4, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 396
    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mboundView7:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v4, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 397
    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v4, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_14
    const-wide/16 v4, 0x62

    and-long/2addr v4, v2

    const-wide/16 v6, 0x0

    cmp-long v9, v4, v6

    if-eqz v9, :cond_15

    .line 402
    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->loginButton:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    invoke-static {v4, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 403
    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mboundView6:Landroid/widget/ProgressBar;

    invoke-static {v4, v15}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_15
    const-wide/16 v4, 0x61

    and-long/2addr v4, v2

    cmp-long v8, v4, v6

    if-eqz v8, :cond_16

    .line 408
    iget-object v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mboundView10:Landroid/widget/LinearLayout;

    invoke-static {v4, v14}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->showWithTimer(Landroid/view/View;Z)V

    :cond_16
    const-wide/16 v4, 0x70

    and-long/2addr v2, v4

    cmp-long v4, v2, v6

    if-eqz v4, :cond_17

    .line 413
    iget-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->passwordEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-static {v2, v0}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_17
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

    .line 156
    monitor-enter p0

    .line 157
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 158
    monitor-exit p0

    return v0

    .line 160
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

    .line 148
    monitor-enter p0

    const-wide/16 v0, 0x40

    .line 149
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mDirtyFlags:J

    .line 150
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 150
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

    .line 197
    :cond_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->onChangeViewModelPasswordField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 195
    :cond_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->onChangeViewModelErrorMessage(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 193
    :cond_2
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->onChangeViewModelEmailField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 191
    :cond_3
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->onChangeViewModelIsButtonVisible(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 189
    :cond_4
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->onChangeViewModelDisplayNetworkError(Landroidx/databinding/ObservableField;I)Z

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

    .line 168
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 177
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;

    .line 178
    monitor-enter p0

    .line 179
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x20

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->mDirtyFlags:J

    .line 180
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 181
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBindingImpl;->notifyPropertyChanged(I)V

    .line 182
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSignInBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 180
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
