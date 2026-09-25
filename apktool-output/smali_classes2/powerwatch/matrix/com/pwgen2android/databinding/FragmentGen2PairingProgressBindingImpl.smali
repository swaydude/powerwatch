.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBinding;
.source "FragmentGen2PairingProgressBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private mViewModelOnBluetoothEnableClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl$OnClickListenerImpl;

.field private final mboundView0:Landroid/widget/FrameLayout;

.field private final mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView3:Landroid/widget/LinearLayout;

.field private final mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;


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

    .line 34
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x5

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

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

    .line 37
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    const/4 v1, 0x3

    invoke-direct {p0, p1, p2, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;)V

    const-wide/16 v2, -0x1

    .line 243
    iput-wide v2, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mDirtyFlags:J

    .line 40
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mainPairingCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 41
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mboundView0:Landroid/widget/FrameLayout;

    .line 42
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 43
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 44
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    .line 45
    aget-object p1, p3, v1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mboundView3:Landroid/widget/LinearLayout;

    .line 46
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x4

    .line 47
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 48
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    .line 49
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 51
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->invalidateAll()V

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

    .line 107
    monitor-enter p0

    .line 108
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelPairingProgressField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelPairingProgressField",
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

    .line 125
    monitor-enter p0

    .line 126
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mDirtyFlags:J

    .line 127
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

.method private onChangeViewModelPairingProgressText(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelPairingProgressText",
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

    .line 116
    monitor-enter p0

    .line 117
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mDirtyFlags:J

    .line 118
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
    .locals 21

    move-object/from16 v1, p0

    .line 136
    monitor-enter p0

    .line 137
    :try_start_0
    iget-wide v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 138
    iput-wide v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mDirtyFlags:J

    .line 139
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;

    const-wide/16 v6, 0x1f

    and-long/2addr v6, v2

    const-wide/16 v8, 0x19

    const-wide/16 v10, 0x1a

    const-wide/16 v12, 0x18

    const/4 v14, 0x0

    cmp-long v18, v6, v4

    if-eqz v18, :cond_8

    and-long v6, v2, v12

    cmp-long v18, v6, v4

    if-eqz v18, :cond_1

    if-eqz v0, :cond_1

    .line 157
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mViewModelOnBluetoothEnableClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl$OnClickListenerImpl;

    if-nez v6, :cond_0

    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl$OnClickListenerImpl;

    invoke-direct {v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mViewModelOnBluetoothEnableClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl$OnClickListenerImpl;

    :cond_0
    invoke-virtual {v6, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl$OnClickListenerImpl;

    move-result-object v6

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    :goto_0
    and-long v18, v2, v8

    cmp-long v7, v18, v4

    if-eqz v7, :cond_4

    if-eqz v0, :cond_2

    .line 164
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->getBluetoothWarnDisplayed()Landroidx/databinding/ObservableField;

    move-result-object v7

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    .line 166
    :goto_1
    invoke-virtual {v1, v14, v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v7, :cond_3

    .line 171
    invoke-virtual {v7}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    goto :goto_2

    :cond_3
    const/4 v7, 0x0

    .line 176
    :goto_2
    invoke-static {v7}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v14

    :cond_4
    and-long v18, v2, v10

    cmp-long v7, v18, v4

    if-eqz v7, :cond_6

    if-eqz v0, :cond_5

    .line 182
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->getPairingProgressText()Landroidx/databinding/ObservableField;

    move-result-object v7

    goto :goto_3

    :cond_5
    const/4 v7, 0x0

    :goto_3
    const/4 v15, 0x1

    .line 184
    invoke-virtual {v1, v15, v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v7, :cond_6

    .line 189
    invoke-virtual {v7}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    goto :goto_4

    :cond_6
    const/4 v7, 0x0

    :goto_4
    const-wide/16 v15, 0x1c

    and-long v19, v2, v15

    cmp-long v15, v19, v4

    if-eqz v15, :cond_9

    if-eqz v0, :cond_7

    .line 196
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->getPairingProgressField()Landroidx/databinding/ObservableField;

    move-result-object v15

    goto :goto_5

    :cond_7
    const/4 v15, 0x0

    :goto_5
    const/4 v0, 0x2

    .line 198
    invoke-virtual {v1, v0, v15}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v15, :cond_a

    .line 203
    invoke-virtual {v15}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    goto :goto_6

    :cond_8
    const/4 v6, 0x0

    const/4 v7, 0x0

    :cond_9
    const/4 v15, 0x0

    :cond_a
    :goto_6
    const-wide/16 v16, 0x1c

    and-long v16, v2, v16

    cmp-long v0, v16, v4

    if-eqz v0, :cond_b

    .line 211
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mainPairingCircle:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;

    invoke-virtual {v0, v15}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;->setCircleValue(Landroidx/databinding/ObservableField;)V

    :cond_b
    and-long/2addr v10, v2

    cmp-long v0, v10, v4

    if-eqz v0, :cond_c

    .line 216
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v7}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_c
    and-long v7, v2, v8

    cmp-long v0, v7, v4

    if-eqz v0, :cond_d

    .line 221
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mboundView3:Landroid/widget/LinearLayout;

    invoke-static {v0, v14}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/BindingAdaptersKt;->goneUnless(Landroid/view/View;Z)V

    :cond_d
    and-long/2addr v2, v12

    cmp-long v0, v2, v4

    if-eqz v0, :cond_e

    .line 226
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-virtual {v0, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_e
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

.method public hasPendingBindings()Z
    .locals 5

    .line 64
    monitor-enter p0

    .line 65
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 66
    monitor-exit p0

    return v0

    .line 68
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

    .line 56
    monitor-enter p0

    const-wide/16 v0, 0x10

    .line 57
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mDirtyFlags:J

    .line 58
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 58
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

    .line 101
    :cond_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->onChangeViewModelPairingProgressField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 99
    :cond_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->onChangeViewModelPairingProgressText(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 97
    :cond_2
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->onChangeViewModelBluetoothWarnDisplayed(Landroidx/databinding/ObservableField;I)Z

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

    .line 76
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 85
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;

    .line 86
    monitor-enter p0

    .line 87
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x8

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->mDirtyFlags:J

    .line 88
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 89
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBindingImpl;->notifyPropertyChanged(I)V

    .line 90
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentGen2PairingProgressBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 88
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
