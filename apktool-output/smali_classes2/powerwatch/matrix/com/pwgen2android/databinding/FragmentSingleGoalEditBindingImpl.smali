.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBinding;
.source "FragmentSingleGoalEditBindingImpl.java"


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private goalValueEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private mDirtyFlags:J

.field private final mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private mboundView2androidTextAttrChanged:Landroidx/databinding/InverseBindingListener;


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

    .line 101
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x3

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

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

    const/4 v0, 0x1

    .line 104
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/4 v0, 0x0

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/FrameLayout;

    const/4 v4, 0x2

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;Landroid/widget/FrameLayout;)V

    .line 25
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl$1;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->goalValueEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 62
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl$2;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->mboundView2androidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    const-wide/16 v0, -0x1

    .line 251
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->mDirtyFlags:J

    .line 108
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->goalValueEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;->setTag(Ljava/lang/Object;)V

    .line 109
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->mainView:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 110
    aget-object p1, p3, p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 111
    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    .line 112
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 114
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->invalidateAll()V

    return-void
.end method

.method static synthetic access$000(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;
    .locals 0

    .line 8
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    return-object p0
.end method

.method private onChangeViewModelValueField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelValueField",
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

    .line 177
    monitor-enter p0

    .line 178
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->mDirtyFlags:J

    .line 179
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

.method private onChangeViewModelValueUnitField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelValueUnitField",
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

    .line 168
    monitor-enter p0

    .line 169
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->mDirtyFlags:J

    .line 170
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

    .line 188
    monitor-enter p0

    .line 189
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    .line 190
    iput-wide v2, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->mDirtyFlags:J

    .line 191
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 194
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;

    const-wide/16 v5, 0xf

    and-long/2addr v5, v0

    const-wide/16 v7, 0xd

    const-wide/16 v9, 0xe

    const/4 v11, 0x0

    cmp-long v12, v5, v2

    if-eqz v12, :cond_4

    and-long v5, v0, v7

    cmp-long v12, v5, v2

    if-eqz v12, :cond_1

    if-eqz v4, :cond_0

    .line 205
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->getValueUnitField()Landroidx/databinding/ObservableField;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v11

    :goto_0
    const/4 v6, 0x0

    .line 207
    invoke-virtual {p0, v6, v5}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v5, :cond_1

    .line 212
    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v5, v11

    :goto_1
    and-long v12, v0, v9

    cmp-long v6, v12, v2

    if-eqz v6, :cond_3

    if-eqz v4, :cond_2

    .line 219
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;->getValueField()Landroidx/databinding/ObservableField;

    move-result-object v4

    goto :goto_2

    :cond_2
    move-object v4, v11

    :goto_2
    const/4 v6, 0x1

    .line 221
    invoke-virtual {p0, v6, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v4, :cond_3

    .line 226
    invoke-virtual {v4}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object v4, v11

    goto :goto_3

    :cond_4
    move-object v4, v11

    move-object v5, v4

    :goto_3
    and-long/2addr v9, v0

    cmp-long v6, v9, v2

    if-eqz v6, :cond_5

    .line 234
    iget-object v6, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->goalValueEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    invoke-static {v6, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_5
    const-wide/16 v9, 0x8

    and-long/2addr v9, v0

    cmp-long v4, v9, v2

    if-eqz v4, :cond_6

    .line 239
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->goalValueEditText:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableEditText;

    move-object v6, v11

    check-cast v6, Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;

    move-object v9, v11

    check-cast v9, Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;

    check-cast v11, Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;

    iget-object v10, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->goalValueEditTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v4, v6, v9, v11, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 240
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iget-object v10, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->mboundView2androidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v4, v6, v9, v11, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    :cond_6
    and-long/2addr v0, v7

    cmp-long v4, v0, v2

    if-eqz v4, :cond_7

    .line 245
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v5}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_7
    return-void

    :catchall_0
    move-exception v0

    .line 191
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 127
    monitor-enter p0

    .line 128
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 129
    monitor-exit p0

    return v0

    .line 131
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

    .line 119
    monitor-enter p0

    const-wide/16 v0, 0x8

    .line 120
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->mDirtyFlags:J

    .line 121
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->requestRebind()V

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

    .line 162
    :cond_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->onChangeViewModelValueField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 160
    :cond_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->onChangeViewModelValueUnitField(Landroidx/databinding/ObservableField;I)Z

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

    .line 139
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 148
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;

    .line 149
    monitor-enter p0

    .line 150
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x4

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->mDirtyFlags:J

    .line 151
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 152
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBindingImpl;->notifyPropertyChanged(I)V

    .line 153
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentSingleGoalEditBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 151
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
