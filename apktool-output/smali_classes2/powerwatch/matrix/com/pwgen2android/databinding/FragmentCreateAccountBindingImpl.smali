.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;
.source "FragmentCreateAccountBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl2;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl1;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private emailEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private mDirtyFlags:J

.field private mViewModelGoToLoginAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl1;

.field private mViewModelOnCreateAccountClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl2;

.field private mViewModelOnTermsAndConditionsClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl;

.field private final mboundView0:Landroid/widget/FrameLayout;

.field private final mboundView10:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView11:Landroid/widget/LinearLayout;

.field private final mboundView12:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView13:Landroid/widget/LinearLayout;

.field private final mboundView7:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView9:Landroid/widget/ProgressBar;

.field private nameEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private passwordConfirmEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private passwordEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private termsCheckBoxandroidCheckedAttrChanged:Landroidx/databinding/InverseBindingListener;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f08008e

    const/16 v2, 0xe

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080246

    const/16 v2, 0xf

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

    .line 229
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x10

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 14
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

    move-object v13, p0

    const/16 v0, 0xe

    .line 232
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Landroid/widget/FrameLayout;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/16 v0, 0xf

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroid/widget/RelativeLayout;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Landroidx/appcompat/widget/AppCompatCheckBox;

    const/16 v3, 0x9

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v12}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/FrameLayout;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Landroid/widget/LinearLayout;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Landroid/widget/RelativeLayout;Landroidx/appcompat/widget/AppCompatCheckBox;)V

    .line 42
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$1;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;)V

    iput-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->emailEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 79
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$2;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;)V

    iput-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->nameEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 116
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$3;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;)V

    iput-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->passwordConfirmEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 153
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$4;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$4;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;)V

    iput-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->passwordEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 190
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$5;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$5;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;)V

    iput-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->termsCheckBoxandroidCheckedAttrChanged:Landroidx/databinding/InverseBindingListener;

    const-wide/16 v0, -0x1

    .line 715
    iput-wide v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    .line 243
    iget-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->createAccount:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;->setTag(Ljava/lang/Object;)V

    .line 244
    iget-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->emailEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;->setTag(Ljava/lang/Object;)V

    .line 245
    iget-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->loginDetails:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 246
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mboundView0:Landroid/widget/FrameLayout;

    .line 247
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0xa

    .line 248
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mboundView10:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 249
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0xb

    .line 250
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mboundView11:Landroid/widget/LinearLayout;

    .line 251
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0xc

    .line 252
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mboundView12:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 253
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0xd

    .line 254
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mboundView13:Landroid/widget/LinearLayout;

    .line 255
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x7

    .line 256
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mboundView7:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 257
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0x9

    .line 258
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mboundView9:Landroid/widget/ProgressBar;

    .line 259
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setTag(Ljava/lang/Object;)V

    .line 260
    iget-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->nameEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;->setTag(Ljava/lang/Object;)V

    .line 261
    iget-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->passwordConfirmEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;->setTag(Ljava/lang/Object;)V

    .line 262
    iget-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->passwordEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;->setTag(Ljava/lang/Object;)V

    .line 263
    iget-object v0, v13, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->termsCheckBox:Landroidx/appcompat/widget/AppCompatCheckBox;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatCheckBox;->setTag(Ljava/lang/Object;)V

    move-object/from16 v0, p2

    .line 264
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 266
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewModelConfirmPasswordField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelConfirmPasswordField",
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

    .line 397
    monitor-enter p0

    .line 398
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x80

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    .line 399
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

    .line 343
    monitor-enter p0

    .line 344
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    .line 345
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

    .line 379
    monitor-enter p0

    .line 380
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x20

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    .line 381
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

    .line 406
    monitor-enter p0

    .line 407
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x100

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    .line 408
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

.method private onChangeViewModelGoToLoginLinkDisplayed(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelGoToLoginLinkDisplayed",
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

    .line 388
    monitor-enter p0

    .line 389
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x40

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    .line 390
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

    .line 370
    monitor-enter p0

    .line 371
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x10

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    .line 372
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

.method private onChangeViewModelLicenceAccepted(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelLicenceAccepted",
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

    .line 334
    monitor-enter p0

    .line 335
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    .line 336
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

    .line 352
    monitor-enter p0

    .line 353
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    .line 354
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

    .line 361
    monitor-enter p0

    .line 362
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x8

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    .line 363
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
    .locals 44

    move-object/from16 v1, p0

    .line 417
    monitor-enter p0

    .line 418
    :try_start_0
    iget-wide v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 419
    iput-wide v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    .line 420
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 448
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;

    const-wide/16 v6, 0x7ff

    and-long/2addr v6, v2

    const-wide/16 v12, 0x608

    const-wide/16 v16, 0x604

    const-wide/16 v18, 0x602

    const-wide/16 v20, 0x620

    const-wide/16 v22, 0x610

    const-wide/16 v24, 0x601

    const-wide/16 v26, 0x600

    const/4 v14, 0x0

    cmp-long v30, v6, v4

    if-eqz v30, :cond_1b

    and-long v6, v2, v24

    cmp-long v30, v6, v4

    if-eqz v30, :cond_2

    if-eqz v0, :cond_0

    .line 457
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->getLicenceAccepted()Landroidx/databinding/ObservableField;

    move-result-object v6

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 459
    :goto_0
    invoke-virtual {v1, v14, v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v6, :cond_1

    .line 464
    invoke-virtual {v6}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    .line 469
    :goto_1
    invoke-static {v6}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v6

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    and-long v30, v2, v26

    cmp-long v7, v30, v4

    if-eqz v7, :cond_6

    if-eqz v0, :cond_6

    .line 475
    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mViewModelOnTermsAndConditionsClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl;

    if-nez v7, :cond_3

    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl;

    invoke-direct {v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mViewModelOnTermsAndConditionsClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl;

    :cond_3
    invoke-virtual {v7, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl;

    move-result-object v7

    .line 477
    iget-object v14, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mViewModelGoToLoginAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl1;

    if-nez v14, :cond_4

    new-instance v14, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl1;

    invoke-direct {v14}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl1;-><init>()V

    iput-object v14, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mViewModelGoToLoginAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl1;

    :cond_4
    invoke-virtual {v14, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl1;->setValue(Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl1;

    move-result-object v14

    .line 479
    iget-object v15, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mViewModelOnCreateAccountClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl2;

    if-nez v15, :cond_5

    new-instance v15, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl2;

    invoke-direct {v15}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl2;-><init>()V

    iput-object v15, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mViewModelOnCreateAccountClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl2;

    :cond_5
    invoke-virtual {v15, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl2;->setValue(Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl$OnClickListenerImpl2;

    move-result-object v15

    goto :goto_3

    :cond_6
    const/4 v7, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_3
    and-long v32, v2, v18

    cmp-long v34, v32, v4

    if-eqz v34, :cond_9

    if-eqz v0, :cond_7

    .line 486
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->getDisplayNetworkError()Landroidx/databinding/ObservableField;

    move-result-object v32

    move-object/from16 v8, v32

    goto :goto_4

    :cond_7
    const/4 v8, 0x0

    :goto_4
    const/4 v9, 0x1

    .line 488
    invoke-virtual {v1, v9, v8}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v8, :cond_8

    .line 493
    invoke-virtual {v8}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    goto :goto_5

    :cond_8
    const/4 v8, 0x0

    .line 498
    :goto_5
    invoke-static {v8}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v8

    goto :goto_6

    :cond_9
    const/4 v8, 0x0

    :goto_6
    and-long v34, v2, v16

    cmp-long v9, v34, v4

    if-eqz v9, :cond_b

    if-eqz v0, :cond_a

    .line 504
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->getNameField()Landroidx/databinding/ObservableField;

    move-result-object v9

    goto :goto_7

    :cond_a
    const/4 v9, 0x0

    :goto_7
    const/4 v10, 0x2

    .line 506
    invoke-virtual {v1, v10, v9}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v9, :cond_b

    .line 511
    invoke-virtual {v9}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    goto :goto_8

    :cond_b
    const/4 v9, 0x0

    :goto_8
    and-long v10, v2, v12

    cmp-long v36, v10, v4

    if-eqz v36, :cond_d

    if-eqz v0, :cond_c

    .line 518
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->getPasswordField()Landroidx/databinding/ObservableField;

    move-result-object v10

    goto :goto_9

    :cond_c
    const/4 v10, 0x0

    :goto_9
    const/4 v11, 0x3

    .line 520
    invoke-virtual {v1, v11, v10}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v10, :cond_d

    .line 525
    invoke-virtual {v10}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    goto :goto_a

    :cond_d
    const/4 v10, 0x0

    :goto_a
    and-long v36, v2, v22

    cmp-long v11, v36, v4

    if-eqz v11, :cond_10

    if-eqz v0, :cond_e

    .line 532
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->isButtonVisible()Landroidx/databinding/ObservableField;

    move-result-object v11

    goto :goto_b

    :cond_e
    const/4 v11, 0x0

    :goto_b
    const/4 v12, 0x4

    .line 534
    invoke-virtual {v1, v12, v11}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v11, :cond_f

    .line 539
    invoke-virtual {v11}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    goto :goto_c

    :cond_f
    const/4 v11, 0x0

    .line 544
    :goto_c
    invoke-static {v11}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v11

    xor-int/lit8 v12, v11, 0x1

    .line 552
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-static {v12}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v12

    goto :goto_d

    :cond_10
    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_d
    and-long v38, v2, v20

    cmp-long v13, v38, v4

    if-eqz v13, :cond_12

    if-eqz v0, :cond_11

    .line 558
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->getEmailField()Landroidx/databinding/ObservableField;

    move-result-object v13

    goto :goto_e

    :cond_11
    const/4 v13, 0x0

    :goto_e
    const/4 v4, 0x5

    .line 560
    invoke-virtual {v1, v4, v13}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v13, :cond_12

    .line 565
    invoke-virtual {v13}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_f

    :cond_12
    const/4 v4, 0x0

    :goto_f
    const-wide/16 v34, 0x640

    and-long v40, v2, v34

    const-wide/16 v38, 0x0

    cmp-long v5, v40, v38

    if-eqz v5, :cond_15

    if-eqz v0, :cond_13

    .line 572
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->getGoToLoginLinkDisplayed()Landroidx/databinding/ObservableField;

    move-result-object v5

    goto :goto_10

    :cond_13
    const/4 v5, 0x0

    :goto_10
    const/4 v13, 0x6

    .line 574
    invoke-virtual {v1, v13, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_14

    .line 579
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    goto :goto_11

    :cond_14
    const/4 v5, 0x0

    .line 584
    :goto_11
    invoke-static {v5}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v5

    goto :goto_12

    :cond_15
    const/4 v5, 0x0

    :goto_12
    const-wide/16 v32, 0x680

    and-long v40, v2, v32

    const-wide/16 v38, 0x0

    cmp-long v13, v40, v38

    if-eqz v13, :cond_17

    if-eqz v0, :cond_16

    .line 590
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->getConfirmPasswordField()Landroidx/databinding/ObservableField;

    move-result-object v13

    move-object/from16 v40, v4

    goto :goto_13

    :cond_16
    move-object/from16 v40, v4

    const/4 v13, 0x0

    :goto_13
    const/4 v4, 0x7

    .line 592
    invoke-virtual {v1, v4, v13}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v13, :cond_18

    .line 597
    invoke-virtual {v13}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_14

    :cond_17
    move-object/from16 v40, v4

    :cond_18
    const/4 v4, 0x0

    :goto_14
    const-wide/16 v28, 0x700

    and-long v41, v2, v28

    const-wide/16 v38, 0x0

    cmp-long v13, v41, v38

    if-eqz v13, :cond_1a

    if-eqz v0, :cond_19

    .line 604
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->getErrorMessage()Landroidx/databinding/ObservableField;

    move-result-object v0

    goto :goto_15

    :cond_19
    const/4 v0, 0x0

    :goto_15
    const/16 v13, 0x8

    .line 606
    invoke-virtual {v1, v13, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v0, :cond_1a

    .line 611
    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object/from16 v13, v40

    goto :goto_16

    :cond_1a
    move-object/from16 v13, v40

    const/4 v0, 0x0

    :goto_16
    move/from16 v43, v11

    move-object v11, v7

    move-object v7, v14

    move/from16 v14, v43

    goto :goto_17

    :cond_1b
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

    :goto_17
    and-long v26, v2, v26

    const-wide/16 v38, 0x0

    cmp-long v30, v26, v38

    move/from16 v26, v6

    if-eqz v30, :cond_1c

    .line 619
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->createAccount:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    invoke-virtual {v6, v15}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 620
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mboundView12:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v6, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 621
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mboundView7:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v6, v11}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1c
    and-long v6, v2, v22

    cmp-long v11, v6, v38

    if-eqz v11, :cond_1d

    .line 626
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->createAccount:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    invoke-static {v6, v14}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 627
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mboundView9:Landroid/widget/ProgressBar;

    invoke-static {v6, v12}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_1d
    and-long v6, v2, v20

    cmp-long v11, v6, v38

    if-eqz v11, :cond_1e

    .line 632
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->emailEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-static {v6, v13}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_1e
    const-wide/16 v6, 0x400

    and-long/2addr v6, v2

    cmp-long v11, v6, v38

    if-eqz v11, :cond_1f

    .line 637
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->emailEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/4 v7, 0x0

    move-object v15, v7

    check-cast v15, Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;

    move-object v11, v7

    check-cast v11, Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;

    move-object v12, v7

    check-cast v12, Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;

    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->emailEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v6, v15, v11, v12, v7}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 638
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->nameEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->nameEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v6, v15, v11, v12, v7}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 639
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->passwordConfirmEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->passwordConfirmEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v6, v15, v11, v12, v7}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 640
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->passwordEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->passwordEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v6, v15, v11, v12, v7}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 641
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->termsCheckBox:Landroidx/appcompat/widget/AppCompatCheckBox;

    const/4 v7, 0x0

    move-object v15, v7

    check-cast v15, Landroid/widget/CompoundButton$OnCheckedChangeListener;

    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->termsCheckBoxandroidCheckedAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v6, v15, v7}, Landroidx/databinding/adapters/CompoundButtonBindingAdapter;->setListeners(Landroid/widget/CompoundButton;Landroid/widget/CompoundButton$OnCheckedChangeListener;Landroidx/databinding/InverseBindingListener;)V

    :cond_1f
    const-wide/16 v6, 0x700

    and-long/2addr v6, v2

    const-wide/16 v11, 0x0

    cmp-long v13, v6, v11

    if-eqz v13, :cond_20

    .line 646
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mboundView10:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v6, v0}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_20
    const-wide/16 v6, 0x640

    and-long/2addr v6, v2

    cmp-long v0, v6, v11

    if-eqz v0, :cond_21

    .line 651
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mboundView11:Landroid/widget/LinearLayout;

    invoke-static {v0, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_21
    and-long v5, v2, v18

    cmp-long v0, v5, v11

    if-eqz v0, :cond_22

    .line 656
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mboundView13:Landroid/widget/LinearLayout;

    invoke-static {v0, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->showWithTimer(Landroid/view/View;Z)V

    :cond_22
    and-long v5, v2, v16

    cmp-long v0, v5, v11

    if-eqz v0, :cond_23

    .line 661
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->nameEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-static {v0, v9}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_23
    const-wide/16 v5, 0x680

    and-long/2addr v5, v2

    cmp-long v0, v5, v11

    if-eqz v0, :cond_24

    .line 666
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->passwordConfirmEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_24
    const-wide/16 v4, 0x608

    and-long/2addr v4, v2

    cmp-long v0, v4, v11

    if-eqz v0, :cond_25

    .line 671
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->passwordEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-static {v0, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_25
    and-long v2, v2, v24

    cmp-long v0, v2, v11

    if-eqz v0, :cond_26

    .line 676
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->termsCheckBox:Landroidx/appcompat/widget/AppCompatCheckBox;

    move/from16 v6, v26

    invoke-static {v0, v6}, Landroidx/databinding/adapters/CompoundButtonBindingAdapter;->setChecked(Landroid/widget/CompoundButton;Z)V

    :cond_26
    return-void

    :catchall_0
    move-exception v0

    .line 420
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 279
    monitor-enter p0

    .line 280
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 281
    monitor-exit p0

    return v0

    .line 283
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

    .line 271
    monitor-enter p0

    const-wide/16 v0, 0x400

    .line 272
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    .line 273
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 274
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 273
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

    .line 328
    :pswitch_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->onChangeViewModelErrorMessage(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 326
    :pswitch_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->onChangeViewModelConfirmPasswordField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 324
    :pswitch_2
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->onChangeViewModelGoToLoginLinkDisplayed(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 322
    :pswitch_3
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->onChangeViewModelEmailField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 320
    :pswitch_4
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->onChangeViewModelIsButtonVisible(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 318
    :pswitch_5
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->onChangeViewModelPasswordField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 316
    :pswitch_6
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->onChangeViewModelNameField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 314
    :pswitch_7
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->onChangeViewModelDisplayNetworkError(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 312
    :pswitch_8
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->onChangeViewModelLicenceAccepted(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
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

    .line 291
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 300
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;

    .line 301
    monitor-enter p0

    .line 302
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x200

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->mDirtyFlags:J

    .line 303
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 304
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBindingImpl;->notifyPropertyChanged(I)V

    .line 305
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 303
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
