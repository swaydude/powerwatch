.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;
.source "FragmentControlViewBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl$OnClickListenerImpl;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl$OnProgressChangedImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private mViewModelOnPlayClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl$OnClickListenerImpl;

.field private mViewModelOnProgressChangedAndroidxDatabindingAdaptersSeekBarBindingAdapterOnProgressChanged:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl$OnProgressChangedImpl;

.field private final mboundView0:Landroid/widget/LinearLayout;

.field private final mboundView2:Landroid/widget/SeekBar;


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

    .line 31
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x3

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

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

    const/4 v0, 0x1

    .line 34
    aget-object v0, p3, v0

    check-cast v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    const/4 v1, 0x2

    invoke-direct {p0, p1, p2, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/google/android/material/floatingactionbutton/FloatingActionButton;)V

    const-wide/16 v2, -0x1

    .line 224
    iput-wide v2, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mDirtyFlags:J

    const/4 p1, 0x0

    .line 37
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    .line 38
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    .line 39
    aget-object p1, p3, v1

    check-cast p1, Landroid/widget/SeekBar;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mboundView2:Landroid/widget/SeekBar;

    .line 40
    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setTag(Ljava/lang/Object;)V

    .line 41
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->playButton:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {p1, v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setTag(Ljava/lang/Object;)V

    .line 42
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 44
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewModelButtonIcon(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelButtonIcon",
            "fieldId"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Integer;",
            ">;I)Z"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 107
    monitor-enter p0

    .line 108
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mDirtyFlags:J

    .line 109
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

.method private onChangeViewModelCurrentProgress(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelCurrentProgress",
            "fieldId"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Integer;",
            ">;I)Z"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 98
    monitor-enter p0

    .line 99
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mDirtyFlags:J

    .line 100
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
    .locals 20

    move-object/from16 v1, p0

    .line 118
    monitor-enter p0

    .line 119
    :try_start_0
    iget-wide v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 120
    iput-wide v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mDirtyFlags:J

    .line 121
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;

    const-wide/16 v6, 0xf

    and-long/2addr v6, v2

    const-wide/16 v8, 0xe

    const-wide/16 v10, 0xc

    const-wide/16 v12, 0xd

    const/4 v14, 0x0

    cmp-long v16, v6, v4

    if-eqz v16, :cond_9

    and-long v6, v2, v10

    cmp-long v16, v6, v4

    if-eqz v16, :cond_2

    if-eqz v0, :cond_2

    .line 139
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mViewModelOnProgressChangedAndroidxDatabindingAdaptersSeekBarBindingAdapterOnProgressChanged:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl$OnProgressChangedImpl;

    if-nez v6, :cond_0

    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl$OnProgressChangedImpl;

    invoke-direct {v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl$OnProgressChangedImpl;-><init>()V

    iput-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mViewModelOnProgressChangedAndroidxDatabindingAdaptersSeekBarBindingAdapterOnProgressChanged:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl$OnProgressChangedImpl;

    :cond_0
    invoke-virtual {v6, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl$OnProgressChangedImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl$OnProgressChangedImpl;

    move-result-object v6

    .line 141
    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mViewModelOnPlayClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl$OnClickListenerImpl;

    if-nez v7, :cond_1

    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl$OnClickListenerImpl;

    invoke-direct {v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mViewModelOnPlayClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl$OnClickListenerImpl;

    :cond_1
    invoke-virtual {v7, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl$OnClickListenerImpl;

    move-result-object v7

    goto :goto_0

    :cond_2
    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    and-long v16, v2, v12

    cmp-long v18, v16, v4

    if-eqz v18, :cond_5

    if-eqz v0, :cond_3

    .line 148
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;->getCurrentProgress()Landroidx/databinding/ObservableField;

    move-result-object v16

    move-object/from16 v15, v16

    goto :goto_1

    :cond_3
    const/4 v15, 0x0

    .line 150
    :goto_1
    invoke-virtual {v1, v14, v15}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v15, :cond_4

    .line 155
    invoke-virtual {v15}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Integer;

    goto :goto_2

    :cond_4
    const/4 v15, 0x0

    .line 160
    :goto_2
    invoke-static {v15}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Integer;)I

    move-result v15

    goto :goto_3

    :cond_5
    const/4 v15, 0x0

    :goto_3
    and-long v17, v2, v8

    cmp-long v19, v17, v4

    if-eqz v19, :cond_8

    if-eqz v0, :cond_6

    .line 166
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;->getButtonIcon()Landroidx/databinding/ObservableField;

    move-result-object v0

    goto :goto_4

    :cond_6
    const/4 v0, 0x0

    :goto_4
    const/4 v14, 0x1

    .line 168
    invoke-virtual {v1, v14, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v0, :cond_7

    .line 173
    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    goto :goto_5

    :cond_7
    const/4 v0, 0x0

    .line 178
    :goto_5
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Integer;)I

    move-result v14

    move v0, v14

    move v14, v15

    goto :goto_6

    :cond_8
    move v14, v15

    const/4 v0, 0x0

    goto :goto_6

    :cond_9
    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_6
    and-long/2addr v12, v2

    cmp-long v15, v12, v4

    if-eqz v15, :cond_a

    .line 185
    iget-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mboundView2:Landroid/widget/SeekBar;

    invoke-static {v12, v14}, Landroidx/databinding/adapters/SeekBarBindingAdapter;->setProgress(Landroid/widget/SeekBar;I)V

    :cond_a
    and-long/2addr v10, v2

    cmp-long v12, v10, v4

    if-eqz v12, :cond_b

    .line 190
    iget-object v10, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mboundView2:Landroid/widget/SeekBar;

    const/4 v11, 0x0

    move-object v15, v11

    check-cast v15, Landroidx/databinding/adapters/SeekBarBindingAdapter$OnStartTrackingTouch;

    move-object v12, v11

    check-cast v12, Landroidx/databinding/adapters/SeekBarBindingAdapter$OnStopTrackingTouch;

    check-cast v11, Landroidx/databinding/InverseBindingListener;

    invoke-static {v10, v15, v12, v6, v11}, Landroidx/databinding/adapters/SeekBarBindingAdapter;->setOnSeekBarChangeListener(Landroid/widget/SeekBar;Landroidx/databinding/adapters/SeekBarBindingAdapter$OnStartTrackingTouch;Landroidx/databinding/adapters/SeekBarBindingAdapter$OnStopTrackingTouch;Landroidx/databinding/adapters/SeekBarBindingAdapter$OnProgressChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 191
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->playButton:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v6, v7}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_b
    and-long/2addr v2, v8

    cmp-long v6, v2, v4

    if-eqz v6, :cond_c

    .line 196
    iget-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->playButton:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-static {v2, v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModelKt;->setImageUri(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;I)V

    :cond_c
    return-void

    :catchall_0
    move-exception v0

    .line 121
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 57
    monitor-enter p0

    .line 58
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 59
    monitor-exit p0

    return v0

    .line 61
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

    .line 49
    monitor-enter p0

    const-wide/16 v0, 0x8

    .line 50
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mDirtyFlags:J

    .line 51
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 51
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

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 92
    :cond_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->onChangeViewModelButtonIcon(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 90
    :cond_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->onChangeViewModelCurrentProgress(Landroidx/databinding/ObservableField;I)Z

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

    .line 69
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 78
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;

    .line 79
    monitor-enter p0

    .line 80
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x4

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->mDirtyFlags:J

    .line 81
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 82
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBindingImpl;->notifyPropertyChanged(I)V

    .line 83
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentControlViewBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 81
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
