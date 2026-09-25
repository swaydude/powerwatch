.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;
.source "FragmentChangePasswordBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private mViewModelOnChangePasswordClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl$OnClickListenerImpl;

.field private final mboundView0:Landroid/widget/FrameLayout;

.field private final mboundView10:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView11:Landroid/widget/LinearLayout;

.field private final mboundView2:Landroid/widget/LinearLayout;

.field private final mboundView7:Landroid/widget/ProgressBar;

.field private final mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView9:Landroid/widget/FrameLayout;

.field private oldPasswordEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private passwordConfirmEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private passwordEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f08008e

    const/16 v2, 0xc

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080163

    const/16 v2, 0xd

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

    .line 153
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0xe

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 12
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

    const/16 v0, 0xc

    .line 156
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/FrameLayout;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/4 v4, 0x7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/FrameLayout;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;Landroid/widget/LinearLayout;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;)V

    .line 40
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl$1;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->oldPasswordEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 77
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl$2;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->passwordConfirmEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 114
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl$3;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->passwordEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    const-wide/16 v0, -0x1

    .line 546
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mDirtyFlags:J

    .line 165
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->createAccount:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;->setTag(Ljava/lang/Object;)V

    .line 166
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->loginDetails:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 167
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mboundView0:Landroid/widget/FrameLayout;

    .line 168
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0xa

    .line 169
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mboundView10:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 170
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0xb

    .line 171
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mboundView11:Landroid/widget/LinearLayout;

    .line 172
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 173
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mboundView2:Landroid/widget/LinearLayout;

    .line 174
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x7

    .line 175
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mboundView7:Landroid/widget/ProgressBar;

    .line 176
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0x8

    .line 177
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 178
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/16 p1, 0x9

    .line 179
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mboundView9:Landroid/widget/FrameLayout;

    .line 180
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    .line 181
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->oldPasswordEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;->setTag(Ljava/lang/Object;)V

    .line 182
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->passwordConfirmEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;->setTag(Ljava/lang/Object;)V

    .line 183
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->passwordEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;->setTag(Ljava/lang/Object;)V

    .line 184
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 186
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->invalidateAll()V

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

    .line 286
    monitor-enter p0

    .line 287
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x10

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mDirtyFlags:J

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

    .line 250
    monitor-enter p0

    .line 251
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mDirtyFlags:J

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

    .line 295
    monitor-enter p0

    .line 296
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x20

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mDirtyFlags:J

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

    .line 268
    monitor-enter p0

    .line 269
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelOldPasswordField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelOldPasswordField",
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

    .line 277
    monitor-enter p0

    .line 278
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x8

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mDirtyFlags:J

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

    .line 304
    monitor-enter p0

    .line 305
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x40

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mDirtyFlags:J

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

    .line 259
    monitor-enter p0

    .line 260
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mDirtyFlags:J

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


# virtual methods
.method protected executeBindings()V
    .locals 37

    move-object/from16 v1, p0

    .line 315
    monitor-enter p0

    .line 316
    :try_start_0
    iget-wide v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 317
    iput-wide v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mDirtyFlags:J

    .line 318
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 340
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;

    const-wide/16 v6, 0x1ff

    and-long/2addr v6, v2

    const-wide/16 v10, 0x190

    const-wide/16 v12, 0x188

    const-wide/16 v16, 0x182

    const-wide/16 v18, 0x184

    const-wide/16 v20, 0x181

    const-wide/16 v22, 0x180

    const/4 v8, 0x0

    cmp-long v26, v6, v4

    if-eqz v26, :cond_13

    and-long v6, v2, v20

    cmp-long v26, v6, v4

    if-eqz v26, :cond_2

    if-eqz v0, :cond_0

    .line 350
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->getDisplayNetworkError()Landroidx/databinding/ObservableField;

    move-result-object v6

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 352
    :goto_0
    invoke-virtual {v1, v8, v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v6, :cond_1

    .line 357
    invoke-virtual {v6}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    .line 362
    :goto_1
    invoke-static {v6}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v6

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    and-long v26, v2, v16

    cmp-long v7, v26, v4

    if-eqz v7, :cond_5

    if-eqz v0, :cond_3

    .line 368
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->getResponseSuccess()Landroidx/databinding/ObservableField;

    move-result-object v7

    goto :goto_3

    :cond_3
    const/4 v7, 0x0

    :goto_3
    const/4 v8, 0x1

    .line 370
    invoke-virtual {v1, v8, v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v7, :cond_4

    .line 375
    invoke-virtual {v7}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    goto :goto_4

    :cond_4
    const/4 v7, 0x0

    .line 380
    :goto_4
    invoke-static {v7}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v7

    xor-int/lit8 v8, v7, 0x1

    .line 388
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-static {v8}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v8

    goto :goto_5

    :cond_5
    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_5
    and-long v27, v2, v18

    cmp-long v29, v27, v4

    if-eqz v29, :cond_8

    if-eqz v0, :cond_6

    .line 394
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->isButtonVisible()Landroidx/databinding/ObservableField;

    move-result-object v26

    move-object/from16 v9, v26

    goto :goto_6

    :cond_6
    const/4 v9, 0x0

    :goto_6
    const/4 v14, 0x2

    .line 396
    invoke-virtual {v1, v14, v9}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v9, :cond_7

    .line 401
    invoke-virtual {v9}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    goto :goto_7

    :cond_7
    const/4 v9, 0x0

    .line 406
    :goto_7
    invoke-static {v9}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v9

    xor-int/lit8 v14, v9, 0x1

    .line 414
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    invoke-static {v14}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v14

    move/from16 v26, v14

    goto :goto_8

    :cond_8
    const/4 v9, 0x0

    const/16 v26, 0x0

    :goto_8
    and-long v14, v2, v22

    cmp-long v30, v14, v4

    if-eqz v30, :cond_a

    if-eqz v0, :cond_a

    .line 420
    iget-object v14, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mViewModelOnChangePasswordClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl$OnClickListenerImpl;

    if-nez v14, :cond_9

    new-instance v14, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl$OnClickListenerImpl;

    invoke-direct {v14}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v14, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mViewModelOnChangePasswordClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl$OnClickListenerImpl;

    :cond_9
    invoke-virtual {v14, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl$OnClickListenerImpl;

    move-result-object v14

    goto :goto_9

    :cond_a
    const/4 v14, 0x0

    :goto_9
    and-long v30, v2, v12

    cmp-long v15, v30, v4

    if-eqz v15, :cond_c

    if-eqz v0, :cond_b

    .line 427
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->getOldPasswordField()Landroidx/databinding/ObservableField;

    move-result-object v15

    goto :goto_a

    :cond_b
    const/4 v15, 0x0

    :goto_a
    const/4 v12, 0x3

    .line 429
    invoke-virtual {v1, v12, v15}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v15, :cond_c

    .line 434
    invoke-virtual {v15}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    goto :goto_b

    :cond_c
    const/4 v12, 0x0

    :goto_b
    and-long v32, v2, v10

    cmp-long v13, v32, v4

    if-eqz v13, :cond_e

    if-eqz v0, :cond_d

    .line 441
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->getConfirmPasswordField()Landroidx/databinding/ObservableField;

    move-result-object v13

    goto :goto_c

    :cond_d
    const/4 v13, 0x0

    :goto_c
    const/4 v15, 0x4

    .line 443
    invoke-virtual {v1, v15, v13}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v13, :cond_e

    .line 448
    invoke-virtual {v13}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    goto :goto_d

    :cond_e
    const/4 v13, 0x0

    :goto_d
    const-wide/16 v28, 0x1a0

    and-long v32, v2, v28

    cmp-long v15, v32, v4

    if-eqz v15, :cond_10

    if-eqz v0, :cond_f

    .line 455
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->getErrorMessage()Landroidx/databinding/ObservableField;

    move-result-object v15

    goto :goto_e

    :cond_f
    const/4 v15, 0x0

    :goto_e
    const/4 v10, 0x5

    .line 457
    invoke-virtual {v1, v10, v15}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v15, :cond_10

    .line 462
    invoke-virtual {v15}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    goto :goto_f

    :cond_10
    const/4 v10, 0x0

    :goto_f
    const-wide/16 v24, 0x1c0

    and-long v34, v2, v24

    cmp-long v11, v34, v4

    if-eqz v11, :cond_12

    if-eqz v0, :cond_11

    .line 469
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->getPasswordField()Landroidx/databinding/ObservableField;

    move-result-object v0

    goto :goto_10

    :cond_11
    const/4 v0, 0x0

    :goto_10
    const/4 v11, 0x6

    .line 471
    invoke-virtual {v1, v11, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v0, :cond_12

    .line 476
    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v11, v10

    goto :goto_11

    :cond_12
    move-object v11, v10

    const/4 v0, 0x0

    :goto_11
    move v10, v6

    move/from16 v6, v26

    move/from16 v36, v9

    move v9, v8

    move/from16 v8, v36

    goto :goto_12

    :cond_13
    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_12
    and-long v22, v2, v22

    cmp-long v15, v22, v4

    if-eqz v15, :cond_14

    .line 484
    iget-object v15, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->createAccount:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    invoke-virtual {v15, v14}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_14
    and-long v14, v2, v18

    cmp-long v18, v14, v4

    if-eqz v18, :cond_15

    .line 489
    iget-object v14, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->createAccount:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    invoke-static {v14, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 490
    iget-object v8, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mboundView7:Landroid/widget/ProgressBar;

    invoke-static {v8, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_15
    and-long v14, v2, v16

    cmp-long v6, v14, v4

    if-eqz v6, :cond_16

    .line 495
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mboundView10:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v6, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 496
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mboundView2:Landroid/widget/LinearLayout;

    invoke-static {v6, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    .line 497
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mboundView9:Landroid/widget/FrameLayout;

    invoke-static {v6, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_16
    and-long v6, v2, v20

    cmp-long v8, v6, v4

    if-eqz v8, :cond_17

    .line 502
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mboundView11:Landroid/widget/LinearLayout;

    invoke-static {v6, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->showWithTimer(Landroid/view/View;Z)V

    :cond_17
    const-wide/16 v6, 0x1a0

    and-long/2addr v6, v2

    cmp-long v8, v6, v4

    if-eqz v8, :cond_18

    .line 507
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mboundView8:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v6, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_18
    const-wide/16 v6, 0x188

    and-long/2addr v6, v2

    cmp-long v8, v6, v4

    if-eqz v8, :cond_19

    .line 512
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->oldPasswordEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-static {v6, v12}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_19
    const-wide/16 v6, 0x100

    and-long/2addr v6, v2

    cmp-long v8, v6, v4

    if-eqz v8, :cond_1a

    .line 517
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->oldPasswordEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/4 v7, 0x0

    move-object v9, v7

    check-cast v9, Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;

    move-object v8, v7

    check-cast v8, Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;

    check-cast v7, Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;

    iget-object v10, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->oldPasswordEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v6, v9, v8, v7, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 518
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->passwordConfirmEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    iget-object v10, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->passwordConfirmEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v6, v9, v8, v7, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 519
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->passwordEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    iget-object v10, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->passwordEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v6, v9, v8, v7, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    :cond_1a
    const-wide/16 v6, 0x190

    and-long/2addr v6, v2

    cmp-long v8, v6, v4

    if-eqz v8, :cond_1b

    .line 524
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->passwordConfirmEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-static {v6, v13}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_1b
    const-wide/16 v6, 0x1c0

    and-long/2addr v2, v6

    cmp-long v6, v2, v4

    if-eqz v6, :cond_1c

    .line 529
    iget-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->passwordEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-static {v2, v0}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_1c
    return-void

    :catchall_0
    move-exception v0

    .line 318
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 199
    monitor-enter p0

    .line 200
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 201
    monitor-exit p0

    return v0

    .line 203
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

    .line 191
    monitor-enter p0

    const-wide/16 v0, 0x100

    .line 192
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mDirtyFlags:J

    .line 193
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 194
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 193
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

    .line 244
    :pswitch_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->onChangeViewModelPasswordField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 242
    :pswitch_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->onChangeViewModelErrorMessage(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 240
    :pswitch_2
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->onChangeViewModelConfirmPasswordField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 238
    :pswitch_3
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->onChangeViewModelOldPasswordField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 236
    :pswitch_4
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->onChangeViewModelIsButtonVisible(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 234
    :pswitch_5
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->onChangeViewModelResponseSuccess(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 232
    :pswitch_6
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->onChangeViewModelDisplayNetworkError(Landroidx/databinding/ObservableField;I)Z

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

    .line 211
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 220
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;

    .line 221
    monitor-enter p0

    .line 222
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x80

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->mDirtyFlags:J

    .line 223
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 224
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBindingImpl;->notifyPropertyChanged(I)V

    .line 225
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChangePasswordBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 223
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
