.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBinding;
.source "FragmentChooseUnitsBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl$OnClickListenerImpl1;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private mViewModelOnImperialCheckedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl$OnClickListenerImpl1;

.field private mViewModelOnMetricCheckedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl$OnClickListenerImpl;

.field private final mboundView0:Landroid/widget/LinearLayout;

.field private final mboundView1:Landroid/widget/LinearLayout;

.field private final mboundView3:Landroid/widget/LinearLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f080276

    const/4 v2, 0x5

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080275

    const/4 v2, 0x6

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

    .line 35
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x7

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

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

    .line 38
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RadioButton;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/RadioButton;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    const/4 v4, 0x1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/TextView;Landroid/widget/TextView;)V

    const-wide/16 v0, -0x1

    .line 206
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->mDirtyFlags:J

    .line 44
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->checkedButtonImperial:Landroid/widget/RadioButton;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/RadioButton;->setTag(Ljava/lang/Object;)V

    .line 45
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->checkedButtonMetric:Landroid/widget/RadioButton;

    invoke-virtual {p1, v0}, Landroid/widget/RadioButton;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 46
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    .line 47
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 48
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->mboundView1:Landroid/widget/LinearLayout;

    .line 49
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 50
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->mboundView3:Landroid/widget/LinearLayout;

    .line 51
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    .line 52
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 54
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewModelMetricChecked(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelMetricChecked",
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

    .line 106
    monitor-enter p0

    .line 107
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->mDirtyFlags:J

    .line 108
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
    .locals 14

    .line 117
    monitor-enter p0

    .line 118
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    .line 119
    iput-wide v2, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->mDirtyFlags:J

    .line 120
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;

    const-wide/16 v5, 0x7

    and-long/2addr v5, v0

    const-wide/16 v7, 0x6

    const/4 v9, 0x0

    const/4 v10, 0x0

    cmp-long v11, v5, v2

    if-eqz v11, :cond_5

    and-long v5, v0, v7

    cmp-long v12, v5, v2

    if-eqz v12, :cond_2

    if-eqz v4, :cond_2

    .line 137
    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->mViewModelOnMetricCheckedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl$OnClickListenerImpl;

    if-nez v5, :cond_0

    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl$OnClickListenerImpl;

    invoke-direct {v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->mViewModelOnMetricCheckedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl$OnClickListenerImpl;

    :cond_0
    invoke-virtual {v5, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl$OnClickListenerImpl;

    move-result-object v5

    .line 139
    iget-object v6, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->mViewModelOnImperialCheckedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl$OnClickListenerImpl1;

    if-nez v6, :cond_1

    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl$OnClickListenerImpl1;

    invoke-direct {v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl$OnClickListenerImpl1;-><init>()V

    iput-object v6, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->mViewModelOnImperialCheckedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl$OnClickListenerImpl1;

    :cond_1
    invoke-virtual {v6, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl$OnClickListenerImpl1;->setValue(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl$OnClickListenerImpl1;

    move-result-object v6

    goto :goto_0

    :cond_2
    move-object v5, v10

    move-object v6, v5

    :goto_0
    if-eqz v4, :cond_3

    .line 145
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->getMetricChecked()Landroidx/databinding/ObservableField;

    move-result-object v4

    goto :goto_1

    :cond_3
    move-object v4, v10

    .line 147
    :goto_1
    invoke-virtual {p0, v9, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v4, :cond_4

    .line 152
    invoke-virtual {v4}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/lang/Boolean;

    .line 157
    :cond_4
    invoke-static {v10}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v9

    xor-int/lit8 v4, v9, 0x1

    .line 165
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v4

    move-object v10, v5

    move v13, v9

    move v9, v4

    move v4, v13

    goto :goto_2

    :cond_5
    move-object v6, v10

    const/4 v4, 0x0

    :goto_2
    if-eqz v11, :cond_6

    .line 171
    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->checkedButtonImperial:Landroid/widget/RadioButton;

    invoke-static {v5, v9}, Landroidx/databinding/adapters/CompoundButtonBindingAdapter;->setChecked(Landroid/widget/CompoundButton;Z)V

    .line 172
    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->checkedButtonMetric:Landroid/widget/RadioButton;

    invoke-static {v5, v4}, Landroidx/databinding/adapters/CompoundButtonBindingAdapter;->setChecked(Landroid/widget/CompoundButton;Z)V

    :cond_6
    and-long/2addr v0, v7

    cmp-long v4, v0, v2

    if-eqz v4, :cond_7

    .line 177
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->mboundView1:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v10}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 178
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->mboundView3:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_7
    return-void

    :catchall_0
    move-exception v0

    .line 120
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 67
    monitor-enter p0

    .line 68
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 69
    monitor-exit p0

    return v0

    .line 71
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

    .line 59
    monitor-enter p0

    const-wide/16 v0, 0x4

    .line 60
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->mDirtyFlags:J

    .line 61
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 61
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

    .line 100
    :cond_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->onChangeViewModelMetricChecked(Landroidx/databinding/ObservableField;I)Z

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

    .line 79
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 88
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;

    .line 89
    monitor-enter p0

    .line 90
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x2

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->mDirtyFlags:J

    .line 91
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 92
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBindingImpl;->notifyPropertyChanged(I)V

    .line 93
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 91
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
