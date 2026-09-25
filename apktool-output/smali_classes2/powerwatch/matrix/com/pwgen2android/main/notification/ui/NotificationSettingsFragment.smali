.class public final Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "NotificationSettingsFragment.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNotificationSettingsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationSettingsFragment.kt\npowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,71:1\n54#2,3:72\n*S KotlinDebug\n*F\n+ 1 NotificationSettingsFragment.kt\npowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment\n*L\n23#1:72,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\u000b\u001a\u00020\u000cH\u0014J\u0008\u0010\r\u001a\u00020\u0003H\u0014J\u0008\u0010\u000e\u001a\u00020\u000cH\u0014J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001b\u0010\u0006\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0018"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationSettingsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "()V",
        "notificationSettingsVM",
        "getNotificationSettingsVM",
        "()Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;",
        "notificationSettingsVM$delegate",
        "Lkotlin/Lazy;",
        "getBindingVariable",
        "",
        "getViewModel",
        "layoutRes",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "Companion",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment$Companion;

.field public static final DEVICE_KEY:Ljava/lang/String; = "device_key"


# instance fields
.field private final notificationSettingsVM$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 23
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 20
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 23
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment$notificationSettingsVM$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment$notificationSettingsVM$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 72
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 74
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 23
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;->notificationSettingsVM$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getNotificationSettingsVM()Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;
    .locals 1

    .line 23
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;->notificationSettingsVM$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;

    return-object v0
.end method

.method public static synthetic lambda$Q_PZf57LkvEgyz1KLNiCHYVuHYo(Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;->onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$gyJHH8bBn8cBGi5QkoUqeR9gdAw(Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;Landroid/view/View;)V

    return-void
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;->getNotificationSettingsVM()Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->onBackClicked()V

    return-void
.end method

.method private static final onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;->getNotificationSettingsVM()Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->onSaveClicked()V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method protected getBindingVariable()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 20
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;
    .locals 1

    .line 31
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;->getNotificationSettingsVM()Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 20
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0069

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    .line 38
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    const/4 p3, 0x0

    if-nez p2, :cond_0

    move-object p2, p3

    goto :goto_0

    :cond_0
    const-string v0, "device_key"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 40
    :goto_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;

    move-result-object v0

    invoke-virtual {v0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;->onCreate(Ljava/lang/String;)V

    .line 42
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;->getRootView()Landroid/view/View;

    move-result-object p2

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    const p3, 0x7f080165

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    move-object p3, p2

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    :goto_1
    if-nez p3, :cond_2

    goto :goto_2

    :cond_2
    const p2, 0x7f0f0060

    .line 43
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const-string v0, "getString(R.string.button_save)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonText(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    :goto_2
    const p2, 0x7f0f0143

    .line 44
    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const-string v0, "getString(R.string.notification_settings)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p3, :cond_3

    goto :goto_3

    .line 45
    :cond_3
    invoke-static {p3, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    :goto_3
    if-nez p3, :cond_4

    goto :goto_4

    .line 47
    :cond_4
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/-$$Lambda$NotificationSettingsFragment$gyJHH8bBn8cBGi5QkoUqeR9gdAw;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/-$$Lambda$NotificationSettingsFragment$gyJHH8bBn8cBGi5QkoUqeR9gdAw;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;)V

    invoke-static {p3, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->backButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    :goto_4
    if-nez p3, :cond_5

    goto :goto_5

    .line 51
    :cond_5
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/-$$Lambda$NotificationSettingsFragment$Q_PZf57LkvEgyz1KLNiCHYVuHYo;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/-$$Lambda$NotificationSettingsFragment$Q_PZf57LkvEgyz1KLNiCHYVuHYo;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsFragment;)V

    invoke-static {p3, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->rightButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    :goto_5
    return-object p1
.end method
