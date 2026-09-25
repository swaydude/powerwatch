.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBinding;
.source "FragmentPermissionInfoBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl$OnClickListenerImpl1;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private mViewModelOnDoneClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl$OnClickListenerImpl;

.field private mViewModelOnSkipClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl$OnClickListenerImpl1;

.field private final mboundView0:Landroid/widget/LinearLayout;

.field private final mboundView1:Landroid/widget/FrameLayout;

.field private final mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f0801bd

    const/4 v2, 0x4

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

    .line 34
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x5

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 7
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

    .line 37
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    const/4 v4, 0x1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;Landroidx/recyclerview/widget/RecyclerView;)V

    const-wide/16 v0, -0x1

    .line 214
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->mDirtyFlags:J

    .line 41
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->loginButton:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 42
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    .line 43
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 44
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->mboundView1:Landroid/widget/FrameLayout;

    .line 45
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 46
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 47
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    .line 48
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 50
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewModelDoneEnabled(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelDoneEnabled",
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

    .line 102
    monitor-enter p0

    .line 103
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->mDirtyFlags:J

    .line 104
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
    .locals 15

    .line 113
    monitor-enter p0

    .line 114
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    .line 115
    iput-wide v2, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->mDirtyFlags:J

    .line 116
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionsInfoViewModel;

    const-wide/16 v5, 0x7

    and-long v7, v0, v5

    const-wide/16 v9, 0x6

    const/4 v11, 0x0

    const/4 v12, 0x0

    cmp-long v13, v7, v2

    if-eqz v13, :cond_8

    and-long v7, v0, v9

    cmp-long v14, v7, v2

    if-eqz v14, :cond_2

    if-eqz v4, :cond_2

    .line 134
    iget-object v7, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->mViewModelOnDoneClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl$OnClickListenerImpl;

    if-nez v7, :cond_0

    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl$OnClickListenerImpl;

    invoke-direct {v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v7, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->mViewModelOnDoneClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl$OnClickListenerImpl;

    :cond_0
    invoke-virtual {v7, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionsInfoViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl$OnClickListenerImpl;

    move-result-object v7

    .line 136
    iget-object v8, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->mViewModelOnSkipClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl$OnClickListenerImpl1;

    if-nez v8, :cond_1

    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl$OnClickListenerImpl1;

    invoke-direct {v8}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl$OnClickListenerImpl1;-><init>()V

    iput-object v8, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->mViewModelOnSkipClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl$OnClickListenerImpl1;

    :cond_1
    invoke-virtual {v8, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl$OnClickListenerImpl1;->setValue(Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionsInfoViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl$OnClickListenerImpl1;

    move-result-object v8

    goto :goto_0

    :cond_2
    move-object v7, v12

    move-object v8, v7

    :goto_0
    if-eqz v4, :cond_3

    .line 142
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionsInfoViewModel;->getDoneEnabled()Landroidx/databinding/ObservableField;

    move-result-object v4

    goto :goto_1

    :cond_3
    move-object v4, v12

    .line 144
    :goto_1
    invoke-virtual {p0, v11, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v4, :cond_4

    .line 149
    invoke-virtual {v4}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Ljava/lang/Boolean;

    .line 154
    :cond_4
    invoke-static {v12}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v11

    if-eqz v13, :cond_6

    if-eqz v11, :cond_5

    const-wide/16 v12, 0x10

    goto :goto_2

    :cond_5
    const-wide/16 v12, 0x8

    :goto_2
    or-long/2addr v0, v12

    .line 166
    :cond_6
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->loginButton:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;->getContext()Landroid/content/Context;

    move-result-object v4

    if-eqz v11, :cond_7

    const v12, 0x7f0700cf

    goto :goto_3

    :cond_7
    const v12, 0x7f0700cc

    :goto_3
    invoke-static {v4, v12}, Landroidx/appcompat/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    move-object v12, v4

    xor-int/lit8 v4, v11, 0x1

    .line 172
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v4

    goto :goto_4

    :cond_8
    move-object v7, v12

    move-object v8, v7

    const/4 v4, 0x0

    :goto_4
    and-long/2addr v5, v0

    cmp-long v13, v5, v2

    if-eqz v13, :cond_9

    .line 178
    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->loginButton:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    invoke-static {v5, v12}, Landroidx/databinding/adapters/ViewBindingAdapter;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 179
    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->loginButton:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    invoke-virtual {v5, v11}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;->setEnabled(Z)V

    .line 180
    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v5, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_9
    and-long/2addr v0, v9

    cmp-long v4, v0, v2

    if-eqz v4, :cond_a

    .line 185
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->loginButton:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    invoke-virtual {v0, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 186
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v0, v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_a
    return-void

    :catchall_0
    move-exception v0

    .line 116
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 63
    monitor-enter p0

    .line 64
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 65
    monitor-exit p0

    return v0

    .line 67
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

    .line 55
    monitor-enter p0

    const-wide/16 v0, 0x4

    .line 56
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->mDirtyFlags:J

    .line 57
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 57
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

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 96
    :cond_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->onChangeViewModelDoneEnabled(Landroidx/databinding/ObservableField;I)Z

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

    .line 75
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionsInfoViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionsInfoViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionsInfoViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 84
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionsInfoViewModel;

    .line 85
    monitor-enter p0

    .line 86
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x2

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->mDirtyFlags:J

    .line 87
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 88
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBindingImpl;->notifyPropertyChanged(I)V

    .line 89
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPermissionInfoBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 87
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
