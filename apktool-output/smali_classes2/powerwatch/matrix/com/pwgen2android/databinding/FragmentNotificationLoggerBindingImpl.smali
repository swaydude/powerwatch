.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;
.super Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBinding;
.source "FragmentNotificationLoggerBindingImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl2;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl1;,
        Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl;
    }
.end annotation


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;


# instance fields
.field private mDirtyFlags:J

.field private mViewModelOnBackClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl1;

.field private mViewModelOnRemoveClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl2;

.field private mViewModelOnSharedClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl;

.field private final mboundView0:Landroid/widget/LinearLayout;

.field private final mboundView3:Landroidx/appcompat/widget/AppCompatButton;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const v1, 0x7f080262

    const/4 v2, 0x4

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f08015e

    const/4 v2, 0x5

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f0801ea

    const/4 v2, 0x6

    .line 19
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
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x7

    invoke-static {p1, p2, v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 10
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

    .line 38
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroidx/appcompat/widget/AppCompatButton;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/ImageView;Landroidx/recyclerview/widget/RecyclerView;Landroidx/appcompat/widget/AppCompatButton;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    const-wide/16 v0, -0x1

    .line 172
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->mDirtyFlags:J

    .line 45
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->backButton:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 46
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    .line 47
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 48
    aget-object p1, p3, p1

    check-cast p1, Landroidx/appcompat/widget/AppCompatButton;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->mboundView3:Landroidx/appcompat/widget/AppCompatButton;

    .line 49
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/AppCompatButton;->setTag(Ljava/lang/Object;)V

    .line 50
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->shareButton:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 51
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->setRootTag(Landroid/view/View;)V

    .line 53
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method protected executeBindings()V
    .locals 8

    .line 105
    monitor-enter p0

    .line 106
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    .line 107
    iput-wide v2, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->mDirtyFlags:J

    .line 108
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;

    const-wide/16 v5, 0x3

    and-long/2addr v0, v5

    const/4 v5, 0x0

    cmp-long v6, v0, v2

    if-eqz v6, :cond_3

    if-eqz v4, :cond_3

    .line 120
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->mViewModelOnSharedClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl;

    if-nez v0, :cond_0

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->mViewModelOnSharedClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl;

    :cond_0
    invoke-virtual {v0, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl;->setValue(Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl;

    move-result-object v5

    .line 122
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->mViewModelOnBackClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl1;

    if-nez v0, :cond_1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl1;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl1;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->mViewModelOnBackClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl1;

    :cond_1
    invoke-virtual {v0, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl1;->setValue(Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl1;

    move-result-object v0

    .line 124
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->mViewModelOnRemoveClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl2;

    if-nez v1, :cond_2

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl2;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl2;-><init>()V

    iput-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->mViewModelOnRemoveClickedAndroidViewViewOnClickListener:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl2;

    :cond_2
    invoke-virtual {v1, v4}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl2;->setValue(Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl2;

    move-result-object v1

    move-object v7, v5

    move-object v5, v0

    move-object v0, v7

    goto :goto_0

    :cond_3
    move-object v0, v5

    move-object v1, v0

    :goto_0
    if-eqz v6, :cond_4

    .line 131
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->backButton:Landroid/widget/ImageView;

    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 132
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->mboundView3:Landroidx/appcompat/widget/AppCompatButton;

    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/AppCompatButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 133
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->shareButton:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    return-void

    :catchall_0
    move-exception v0

    .line 108
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 66
    monitor-enter p0

    .line 67
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 68
    monitor-exit p0

    return v0

    .line 70
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

    .line 58
    monitor-enter p0

    const-wide/16 v0, 0x2

    .line 59
    :try_start_0
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->mDirtyFlags:J

    .line 60
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 60
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

    .line 78
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->setViewModel(Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setViewModel(Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ViewModel"
        }
    .end annotation

    .line 87
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;

    .line 88
    monitor-enter p0

    .line 89
    :try_start_0
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->mDirtyFlags:J

    const-wide/16 v2, 0x1

    or-long/2addr v0, v2

    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->mDirtyFlags:J

    .line 90
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 91
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;->notifyPropertyChanged(I)V

    .line 92
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 90
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
