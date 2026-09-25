.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBinding;
.source "FragmentGen1PairingBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private mViewModelOnBluetoothEnableClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl$OnClickListenerImpl;

.field private final mboundView0:Landroid/widget/LinearLayout;

.field private final mboundView1:Landroid/widget/LinearLayout;

.field private final mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f0800f6

    const/4 v2, 0x3

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

    .line 33
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x4

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

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

    .line 36
    aget-object v0, p3, v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-direct {p0, p1, p2, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView;)V

    const-wide/16 v2, -0x1

    .line 173
    iput-wide v2, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->mDirtyFlags:J

    const/4 p1, 0x0

    .line 39
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    .line 40
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    .line 41
    aget-object p1, p3, v1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->mboundView1:Landroid/widget/LinearLayout;

    .line 42
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 43
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 44
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    .line 45
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 47
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewModelBluetoothWarnDisplayed(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelBluetoothWarnDisplayed",
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

    .line 99
    monitor-enter p0

    .line 100
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->mDirtyFlags:J

    .line 101
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
    .locals 13

    .line 110
    monitor-enter p0

    .line 111
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    .line 112
    iput-wide v2, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->mDirtyFlags:J

    .line 113
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;

    const-wide/16 v5, 0x7

    and-long/2addr v5, v0

    const-wide/16 v7, 0x6

    const/4 v9, 0x0

    const/4 v10, 0x0

    cmp-long v11, v5, v2

    if-eqz v11, :cond_4

    and-long v5, v0, v7

    cmp-long v12, v5, v2

    if-eqz v12, :cond_1

    if-eqz v4, :cond_1

    .line 127
    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->mViewModelOnBluetoothEnableClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl$OnClickListenerImpl;

    if-nez v5, :cond_0

    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl$OnClickListenerImpl;

    invoke-direct {v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->mViewModelOnBluetoothEnableClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl$OnClickListenerImpl;

    :cond_0
    invoke-virtual {v5, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl$OnClickListenerImpl;

    move-result-object v5

    goto :goto_0

    :cond_1
    move-object v5, v10

    :goto_0
    if-eqz v4, :cond_2

    .line 133
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;->getBluetoothWarnDisplayed()Landroidx/databinding/ObservableField;

    move-result-object v4

    goto :goto_1

    :cond_2
    move-object v4, v10

    .line 135
    :goto_1
    invoke-virtual {p0, v9, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v4, :cond_3

    .line 140
    invoke-virtual {v4}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/lang/Boolean;

    .line 145
    :cond_3
    invoke-static {v10}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v9

    move-object v10, v5

    :cond_4
    if-eqz v11, :cond_5

    .line 151
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->mboundView1:Landroid/widget/LinearLayout;

    invoke-static {v4, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_5
    and-long/2addr v0, v7

    cmp-long v4, v0, v2

    if-eqz v4, :cond_6

    .line 156
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v0, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
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

.method public hasPendingBindings()Z
    .locals 5

    .line 60
    monitor-enter p0

    .line 61
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 62
    monitor-exit p0

    return v0

    .line 64
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

    .line 52
    monitor-enter p0

    const-wide/16 v0, 0x4

    .line 53
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->mDirtyFlags:J

    .line 54
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 54
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

    .line 93
    :cond_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->onChangeViewModelBluetoothWarnDisplayed(Landroidx/databinding/ObservableField;I)Z

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

    .line 72
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 81
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingViewModel;

    .line 82
    monitor-enter p0

    .line 83
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x2

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->mDirtyFlags:J

    .line 84
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 85
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBindingImpl;->notifyPropertyChanged(I)V

    .line 86
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen1PairingBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 84
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
