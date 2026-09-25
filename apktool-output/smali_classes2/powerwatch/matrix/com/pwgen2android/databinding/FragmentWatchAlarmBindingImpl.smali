.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;
.source "FragmentWatchAlarmBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl$OnClickListenerImpl1;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private mViewModelOnActivationClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl$OnClickListenerImpl;

.field private mViewModelOnAlarmRepeatClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl$OnClickListenerImpl1;

.field private final mboundView0:Landroid/widget/LinearLayout;

.field private final mboundView1:Landroid/widget/RelativeLayout;

.field private final mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final mboundView3:Landroid/widget/RelativeLayout;

.field private final mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f080139

    const/4 v2, 0x5

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080170

    const/4 v2, 0x6

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080054

    const/4 v2, 0x7

    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f08005f

    const/16 v2, 0x8

    .line 20
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f08005d

    const/16 v2, 0x9

    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f0801c5

    const/16 v2, 0xa

    .line 22
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f08019f

    const/16 v2, 0xb

    .line 23
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f080048

    const/16 v2, 0xc

    .line 24
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f0801a0

    const/16 v2, 0xd

    .line 25
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f08019e

    const/16 v2, 0xe

    .line 26
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

    .line 47
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0xf

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 15
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

    move-object v14, p0

    const/16 v0, 0xc

    .line 50
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lcom/super_rabbit/wheel_picker/WheelPicker;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Lcom/super_rabbit/wheel_picker/WheelPicker;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Lcom/super_rabbit/wheel_picker/WheelPicker;

    const/16 v0, 0xe

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroid/widget/TextView;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Landroid/widget/TextView;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Landroid/widget/LinearLayout;

    const/4 v3, 0x2

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v13}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/LinearLayout;Lcom/super_rabbit/wheel_picker/WheelPicker;Landroid/widget/ImageView;Landroid/widget/ImageView;Lcom/super_rabbit/wheel_picker/WheelPicker;Lcom/super_rabbit/wheel_picker/WheelPicker;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/LinearLayout;)V

    const-wide/16 v0, -0x1

    .line 244
    iput-wide v0, v14, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mDirtyFlags:J

    const/4 v0, 0x0

    .line 62
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v14, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    .line 63
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 64
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v14, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mboundView1:Landroid/widget/RelativeLayout;

    .line 65
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x2

    .line 66
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v14, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 67
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x3

    .line 68
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v14, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mboundView3:Landroid/widget/RelativeLayout;

    .line 69
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x4

    .line 70
    aget-object v0, p3, v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iput-object v0, v14, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 71
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setTag(Ljava/lang/Object;)V

    move-object/from16 v0, p2

    .line 72
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 74
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewModelAlarmActivationField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelAlarmActivationField",
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

    .line 128
    monitor-enter p0

    .line 129
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mDirtyFlags:J

    .line 130
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

.method private onChangeViewModelAlarmRepeatField(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelAlarmRepeatField",
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

    .line 137
    monitor-enter p0

    .line 138
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mDirtyFlags:J

    .line 139
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
    .locals 19

    move-object/from16 v1, p0

    .line 148
    monitor-enter p0

    .line 149
    :try_start_0
    iget-wide v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 150
    iput-wide v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mDirtyFlags:J

    .line 151
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    const-wide/16 v6, 0xf

    and-long/2addr v6, v2

    const-wide/16 v8, 0xe

    const-wide/16 v10, 0xd

    const-wide/16 v12, 0xc

    const/4 v14, 0x0

    cmp-long v15, v6, v4

    if-eqz v15, :cond_7

    and-long v6, v2, v10

    cmp-long v15, v6, v4

    if-eqz v15, :cond_1

    if-eqz v0, :cond_0

    .line 167
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->getAlarmActivationField()Landroidx/databinding/ObservableField;

    move-result-object v6

    goto :goto_0

    :cond_0
    move-object v6, v14

    :goto_0
    const/4 v7, 0x0

    .line 169
    invoke-virtual {v1, v7, v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v6, :cond_1

    .line 174
    invoke-virtual {v6}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v6, v14

    :goto_1
    and-long v15, v2, v8

    cmp-long v7, v15, v4

    if-eqz v7, :cond_3

    if-eqz v0, :cond_2

    .line 181
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;->getAlarmRepeatField()Landroidx/databinding/ObservableField;

    move-result-object v7

    goto :goto_2

    :cond_2
    move-object v7, v14

    :goto_2
    const/4 v15, 0x1

    .line 183
    invoke-virtual {v1, v15, v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v7, :cond_3

    .line 188
    invoke-virtual {v7}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object v7, v14

    :goto_3
    and-long v15, v2, v12

    cmp-long v17, v15, v4

    if-eqz v17, :cond_6

    if-eqz v0, :cond_6

    .line 195
    iget-object v14, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mViewModelOnActivationClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl$OnClickListenerImpl;

    if-nez v14, :cond_4

    new-instance v14, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl$OnClickListenerImpl;

    invoke-direct {v14}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v14, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mViewModelOnActivationClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl$OnClickListenerImpl;

    :cond_4
    invoke-virtual {v14, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl$OnClickListenerImpl;

    move-result-object v14

    .line 197
    iget-object v15, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mViewModelOnAlarmRepeatClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl$OnClickListenerImpl1;

    if-nez v15, :cond_5

    new-instance v15, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl$OnClickListenerImpl1;

    invoke-direct {v15}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl$OnClickListenerImpl1;-><init>()V

    iput-object v15, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mViewModelOnAlarmRepeatClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl$OnClickListenerImpl1;

    :cond_5
    invoke-virtual {v15, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl$OnClickListenerImpl1;->setValue(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl$OnClickListenerImpl1;

    move-result-object v0

    move-object/from16 v18, v14

    move-object v14, v0

    move-object/from16 v0, v18

    goto :goto_4

    :cond_6
    move-object v0, v14

    goto :goto_4

    :cond_7
    move-object v0, v14

    move-object v6, v0

    move-object v7, v6

    :goto_4
    and-long/2addr v12, v2

    cmp-long v15, v12, v4

    if-eqz v15, :cond_8

    .line 205
    iget-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mboundView1:Landroid/widget/RelativeLayout;

    invoke-virtual {v12, v14}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 206
    iget-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mboundView3:Landroid/widget/RelativeLayout;

    invoke-virtual {v12, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_8
    and-long/2addr v8, v2

    cmp-long v0, v8, v4

    if-eqz v0, :cond_9

    .line 211
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mboundView2:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v7}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_9
    and-long/2addr v2, v10

    cmp-long v0, v2, v4

    if-eqz v0, :cond_a

    .line 216
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mboundView4:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0, v6}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_a
    return-void

    :catchall_0
    move-exception v0

    .line 151
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 87
    monitor-enter p0

    .line 88
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 89
    monitor-exit p0

    return v0

    .line 91
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

    .line 79
    monitor-enter p0

    const-wide/16 v0, 0x8

    .line 80
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mDirtyFlags:J

    .line 81
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 81
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

    .line 122
    :cond_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->onChangeViewModelAlarmRepeatField(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 120
    :cond_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->onChangeViewModelAlarmActivationField(Landroidx/databinding/ObservableField;I)Z

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

    .line 99
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 108
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/alarm/WatchAlarmViewModel;

    .line 109
    monitor-enter p0

    .line 110
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x4

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->mDirtyFlags:J

    .line 111
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 112
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBindingImpl;->notifyPropertyChanged(I)V

    .line 113
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentWatchAlarmBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 111
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
