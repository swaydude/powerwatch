.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBinding;
.source "FragmentThirdPartyPermissionBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl$OnClickListenerImpl1;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private mViewModelOnDoneClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl$OnClickListenerImpl;

.field private mViewModelOnSkipClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl$OnClickListenerImpl1;

.field private final mboundView0:Landroid/widget/LinearLayout;

.field private final mboundView1:Landroid/widget/FrameLayout;

.field private final mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

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
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x5

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

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

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;Landroidx/recyclerview/widget/RecyclerView;)V

    const-wide/16 v0, -0x1

    .line 154
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->mDirtyFlags:J

    .line 41
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->loginButton:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 42
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    .line 43
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 44
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->mboundView1:Landroid/widget/FrameLayout;

    .line 45
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 46
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 47
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    .line 48
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 50
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method protected executeBindings()V
    .locals 7

    .line 102
    monitor-enter p0

    .line 103
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    .line 104
    iput-wide v2, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->mDirtyFlags:J

    .line 105
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;

    const-wide/16 v5, 0x3

    and-long/2addr v0, v5

    const/4 v5, 0x0

    cmp-long v6, v0, v2

    if-eqz v6, :cond_2

    if-eqz v4, :cond_2

    .line 116
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->mViewModelOnDoneClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl$OnClickListenerImpl;

    if-nez v0, :cond_0

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl$OnClickListenerImpl;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->mViewModelOnDoneClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl$OnClickListenerImpl;

    :cond_0
    invoke-virtual {v0, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl$OnClickListenerImpl;

    move-result-object v5

    .line 118
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->mViewModelOnSkipClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl$OnClickListenerImpl1;

    if-nez v0, :cond_1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl$OnClickListenerImpl1;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl$OnClickListenerImpl1;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->mViewModelOnSkipClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl$OnClickListenerImpl1;

    :cond_1
    invoke-virtual {v0, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl$OnClickListenerImpl1;->setValue(Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl$OnClickListenerImpl1;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v5

    :goto_0
    if-eqz v6, :cond_3

    .line 125
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->loginButton:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    invoke-virtual {v1, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 126
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->mboundView3:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    return-void

    :catchall_0
    move-exception v0

    .line 105
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
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->mDirtyFlags:J

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

    const-wide/16 v0, 0x2

    .line 56
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->mDirtyFlags:J

    .line 57
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->requestRebind()V

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

    const/4 p1, 0x0

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
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;)V
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
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;

    .line 85
    monitor-enter p0

    .line 86
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x1

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->mDirtyFlags:J

    .line 87
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 88
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBindingImpl;->notifyPropertyChanged(I)V

    .line 89
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBinding;->requestRebind()V

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
