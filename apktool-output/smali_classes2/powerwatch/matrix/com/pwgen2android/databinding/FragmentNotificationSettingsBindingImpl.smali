.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;
.source "FragmentNotificationSettingsBindingImpl.java"


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private batteryNotificationandroidCheckedAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private connectionNotificationandroidCheckedAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private goalsNotificationsandroidCheckedAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private mDirtyFlags:J

.field private final mboundView0:Landroid/widget/LinearLayout;


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

    .line 138
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x4

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 8
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

    .line 141
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroidx/appcompat/widget/SwitchCompat;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroidx/appcompat/widget/SwitchCompat;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroidx/appcompat/widget/SwitchCompat;

    const/4 v4, 0x3

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/appcompat/widget/SwitchCompat;Landroidx/appcompat/widget/SwitchCompat;Landroidx/appcompat/widget/SwitchCompat;)V

    .line 25
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl$1;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->batteryNotificationandroidCheckedAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 62
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl$2;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->connectionNotificationandroidCheckedAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 99
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl$3;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->goalsNotificationsandroidCheckedAttrChanged:Landroidx/databinding/InverseBindingListener;

    const-wide/16 v0, -0x1

    .line 338
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->mDirtyFlags:J

    .line 146
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->batteryNotification:Landroidx/appcompat/widget/SwitchCompat;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SwitchCompat;->setTag(Ljava/lang/Object;)V

    .line 147
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->connectionNotification:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SwitchCompat;->setTag(Ljava/lang/Object;)V

    .line 148
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->goalsNotifications:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SwitchCompat;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 149
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    .line 150
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    .line 151
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 153
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewModelBatteryNotificationStatus(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelBatteryNotificationStatus",
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

    .line 218
    monitor-enter p0

    .line 219
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->mDirtyFlags:J

    .line 220
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

.method private onChangeViewModelConnectionNotificationStatus(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelConnectionNotificationStatus",
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

    .line 227
    monitor-enter p0

    .line 228
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->mDirtyFlags:J

    .line 229
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

.method private onChangeViewModelGoalsNotificationStatus(Landroidx/databinding/ObservableField;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "ViewModelGoalsNotificationStatus",
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

    .line 209
    monitor-enter p0

    .line 210
    :try_start_0
    iget-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->mDirtyFlags:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->mDirtyFlags:J

    .line 211
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

    .line 238
    monitor-enter p0

    .line 239
    :try_start_0
    iget-wide v2, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->mDirtyFlags:J

    const-wide/16 v4, 0x0

    .line 240
    iput-wide v4, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->mDirtyFlags:J

    .line 241
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 248
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;

    const-wide/16 v6, 0x1f

    and-long/2addr v6, v2

    const-wide/16 v8, 0x1c

    const-wide/16 v10, 0x19

    const-wide/16 v12, 0x1a

    const/4 v14, 0x0

    const/4 v15, 0x0

    cmp-long v16, v6, v4

    if-eqz v16, :cond_9

    and-long v6, v2, v10

    cmp-long v16, v6, v4

    if-eqz v16, :cond_2

    if-eqz v0, :cond_0

    .line 260
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->getGoalsNotificationStatus()Landroidx/databinding/ObservableField;

    move-result-object v6

    goto :goto_0

    :cond_0
    move-object v6, v15

    .line 262
    :goto_0
    invoke-virtual {v1, v14, v6}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v6, :cond_1

    .line 267
    invoke-virtual {v6}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    goto :goto_1

    :cond_1
    move-object v6, v15

    .line 272
    :goto_1
    invoke-static {v6}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v6

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    and-long v16, v2, v12

    cmp-long v7, v16, v4

    if-eqz v7, :cond_5

    if-eqz v0, :cond_3

    .line 278
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->getBatteryNotificationStatus()Landroidx/databinding/ObservableField;

    move-result-object v7

    goto :goto_3

    :cond_3
    move-object v7, v15

    :goto_3
    const/4 v14, 0x1

    .line 280
    invoke-virtual {v1, v14, v7}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v7, :cond_4

    .line 285
    invoke-virtual {v7}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    goto :goto_4

    :cond_4
    move-object v7, v15

    .line 290
    :goto_4
    invoke-static {v7}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v7

    goto :goto_5

    :cond_5
    const/4 v7, 0x0

    :goto_5
    and-long v17, v2, v8

    cmp-long v14, v17, v4

    if-eqz v14, :cond_8

    if-eqz v0, :cond_6

    .line 296
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->getConnectionNotificationStatus()Landroidx/databinding/ObservableField;

    move-result-object v0

    goto :goto_6

    :cond_6
    move-object v0, v15

    :goto_6
    const/4 v14, 0x2

    .line 298
    invoke-virtual {v1, v14, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->updateRegistration(ILandroidx/databinding/Observable;)Z

    if-eqz v0, :cond_7

    .line 303
    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    goto :goto_7

    :cond_7
    move-object v0, v15

    .line 308
    :goto_7
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v14

    move v0, v14

    move v14, v7

    goto :goto_8

    :cond_8
    move v14, v7

    const/4 v0, 0x0

    goto :goto_8

    :cond_9
    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v14, 0x0

    :goto_8
    and-long/2addr v12, v2

    cmp-long v7, v12, v4

    if-eqz v7, :cond_a

    .line 315
    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->batteryNotification:Landroidx/appcompat/widget/SwitchCompat;

    invoke-static {v7, v14}, Landroidx/databinding/adapters/CompoundButtonBindingAdapter;->setChecked(Landroid/widget/CompoundButton;Z)V

    :cond_a
    const-wide/16 v12, 0x10

    and-long/2addr v12, v2

    cmp-long v7, v12, v4

    if-eqz v7, :cond_b

    .line 320
    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->batteryNotification:Landroidx/appcompat/widget/SwitchCompat;

    check-cast v15, Landroid/widget/CompoundButton$OnCheckedChangeListener;

    iget-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->batteryNotificationandroidCheckedAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v7, v15, v12}, Landroidx/databinding/adapters/CompoundButtonBindingAdapter;->setListeners(Landroid/widget/CompoundButton;Landroid/widget/CompoundButton$OnCheckedChangeListener;Landroidx/databinding/InverseBindingListener;)V

    .line 321
    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->connectionNotification:Landroidx/appcompat/widget/SwitchCompat;

    iget-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->connectionNotificationandroidCheckedAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v7, v15, v12}, Landroidx/databinding/adapters/CompoundButtonBindingAdapter;->setListeners(Landroid/widget/CompoundButton;Landroid/widget/CompoundButton$OnCheckedChangeListener;Landroidx/databinding/InverseBindingListener;)V

    .line 322
    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->goalsNotifications:Landroidx/appcompat/widget/SwitchCompat;

    iget-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->goalsNotificationsandroidCheckedAttrChanged:Landroidx/databinding/InverseBindingListener;

    invoke-static {v7, v15, v12}, Landroidx/databinding/adapters/CompoundButtonBindingAdapter;->setListeners(Landroid/widget/CompoundButton;Landroid/widget/CompoundButton$OnCheckedChangeListener;Landroidx/databinding/InverseBindingListener;)V

    :cond_b
    and-long v7, v2, v8

    cmp-long v9, v7, v4

    if-eqz v9, :cond_c

    .line 327
    iget-object v7, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->connectionNotification:Landroidx/appcompat/widget/SwitchCompat;

    invoke-static {v7, v0}, Landroidx/databinding/adapters/CompoundButtonBindingAdapter;->setChecked(Landroid/widget/CompoundButton;Z)V

    :cond_c
    and-long/2addr v2, v10

    cmp-long v0, v2, v4

    if-eqz v0, :cond_d

    .line 332
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->goalsNotifications:Landroidx/appcompat/widget/SwitchCompat;

    invoke-static {v0, v6}, Landroidx/databinding/adapters/CompoundButtonBindingAdapter;->setChecked(Landroid/widget/CompoundButton;Z)V

    :cond_d
    return-void

    :catchall_0
    move-exception v0

    .line 241
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 166
    monitor-enter p0

    .line 167
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 168
    monitor-exit p0

    return v0

    .line 170
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

    .line 158
    monitor-enter p0

    const-wide/16 v0, 0x10

    .line 159
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->mDirtyFlags:J

    .line 160
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 160
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

    .line 203
    :cond_0
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->onChangeViewModelConnectionNotificationStatus(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 201
    :cond_1
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->onChangeViewModelBatteryNotificationStatus(Landroidx/databinding/ObservableField;I)Z

    move-result p1

    return p1

    .line 199
    :cond_2
    check-cast p2, Landroidx/databinding/ObservableField;

    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->onChangeViewModelGoalsNotificationStatus(Landroidx/databinding/ObservableField;I)Z

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

    .line 178
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 187
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;

    .line 188
    monitor-enter p0

    .line 189
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x8

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->mDirtyFlags:J

    .line 190
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 191
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBindingImpl;->notifyPropertyChanged(I)V

    .line 192
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 190
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
