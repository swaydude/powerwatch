.class public final Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;
.source "MainActivity.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$PagerAdapter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/ActivityMainBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\npowerwatch/matrix/com/pwgen2android/main/MainActivity\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,266:1\n54#2,3:267\n286#3,2:270\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\npowerwatch/matrix/com/pwgen2android/main/MainActivity\n*L\n49#1:267,3\n257#1:270,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00017B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\u0018\u001a\u00020\u0015H\u0014J\u0008\u0010\u0019\u001a\u00020\u0015H\u0014J\u0008\u0010\u001a\u001a\u00020\u0003H\u0014J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001fH\u0002J\"\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0008\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0008\u0010%\u001a\u00020\u001cH\u0016J\u0012\u0010&\u001a\u00020\u001c2\u0008\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\u0012\u0010)\u001a\u00020\u001c2\u0008\u0010*\u001a\u0004\u0018\u00010$H\u0014J\u0008\u0010+\u001a\u00020\u001cH\u0015J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001fH\u0002J\u0008\u0010-\u001a\u00020\u001cH\u0002J\u0010\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u000200H\u0002J\u0018\u0010.\u001a\u00020\u001c2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000202H\u0002J\u000e\u00104\u001a\u00020\u001c2\u0006\u00105\u001a\u000206R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0008\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u000c\u001a\u0004\u0008\u000f\u0010\u0010R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00068"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/ActivityMainBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "()V",
        "appUpdateController",
        "Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;",
        "mainActivityViewModel",
        "getMainActivityViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;",
        "mainActivityViewModel$delegate",
        "Lkotlin/Lazy;",
        "pagerAdapter",
        "Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$PagerAdapter;",
        "getPagerAdapter",
        "()Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$PagerAdapter;",
        "pagerAdapter$delegate",
        "tabLayout",
        "Lcom/google/android/material/tabs/TabLayout;",
        "updateCode",
        "",
        "viewPager",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;",
        "getBindingVariable",
        "getLayoutId",
        "getViewModel",
        "goToTab",
        "",
        "i",
        "initTabControl",
        "Landroidx/viewpager/widget/ViewPager;",
        "onActivityResult",
        "requestCode",
        "resultCode",
        "data",
        "Landroid/content/Intent;",
        "onBackPressed",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onNewIntent",
        "intent",
        "onResume",
        "setUpPager",
        "setUpTabTitles",
        "showDialog",
        "updateInfo",
        "Lcom/google/android/play/core/appupdate/AppUpdateInfo;",
        "title",
        "",
        "body",
        "showTab",
        "show",
        "",
        "PagerAdapter",
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


# instance fields
.field private appUpdateController:Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;

.field private final mainActivityViewModel$delegate:Lkotlin/Lazy;

.field private final pagerAdapter$delegate:Lkotlin/Lazy;

.field private tabLayout:Lcom/google/android/material/tabs/TabLayout;

.field private final updateCode:I

.field private viewPager:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 37
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;-><init>()V

    const/16 v0, 0x457

    .line 41
    iput v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->updateCode:I

    .line 46
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$pagerAdapter$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$pagerAdapter$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->pagerAdapter$delegate:Lkotlin/Lazy;

    .line 49
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$mainActivityViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$mainActivityViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 267
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 269
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 49
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->mainActivityViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getMainActivityViewModel(Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;)Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;
    .locals 0

    .line 37
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->getMainActivityViewModel()Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$showDialog(Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->showDialog(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final getMainActivityViewModel()Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;
    .locals 1

    .line 49
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->mainActivityViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;

    return-object v0
.end method

.method private final getPagerAdapter()Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$PagerAdapter;
    .locals 1

    .line 46
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->pagerAdapter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$PagerAdapter;

    return-object v0
.end method

.method private final initTabControl(Landroidx/viewpager/widget/ViewPager;)V
    .locals 3

    .line 138
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->tabLayout:Lcom/google/android/material/tabs/TabLayout;

    const/4 v1, 0x0

    const-string v2, "tabLayout"

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 139
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->setUpPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 140
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->setUpTabTitles()V

    .line 142
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->tabLayout:Lcom/google/android/material/tabs/TabLayout;

    if-eqz p1, :cond_0

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$initTabControl$1;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$initTabControl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;)V

    check-cast v0, Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->addOnTabSelectedListener(Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;)V

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1

    .line 138
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1
.end method

.method public static synthetic lambda$6PsRwSrww_xZORn_Z7oMbj5lbNE()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->showDialog$lambda-2$lambda-0()V

    return-void
.end method

.method public static synthetic lambda$Ggl0bsRQ6haxzAWNMt0_I8DN7XQ(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->onResume$lambda-7(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$bTsgFIDOgZ_l8xCAeCjWFQX9IcI(Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->onResume$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;)V

    return-void
.end method

.method public static synthetic lambda$meLm0nXHlLDdEpHVoHAcyH0cVTA(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->showDialog$lambda-4(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic lambda$mwl4hPxVbhBbznwtlefWKmsD8B4(Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;Lcom/google/android/play/core/appupdate/AppUpdateInfo;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->showDialog$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;Lcom/google/android/play/core/appupdate/AppUpdateInfo;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic lambda$pHw45vXzQdCLgF9fKhZlxgHKSWE(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->showDialog$lambda-3(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic lambda$vsLoHtjLZ04Yw_iL-8SNww4kdgk(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->showDialog$lambda-5(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic lambda$wci5VZOIZaY2B5Y8umo9ArYXFKo(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->showDialog$lambda-2$lambda-1(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final onResume$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;->getStatus()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AppUpdateInfo: update available type - "

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 129
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState$Available;

    if-eqz v0, :cond_0

    .line 130
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;->getUpdateInfo()Lcom/google/android/play/core/appupdate/AppUpdateInfo;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->showDialog(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)V

    :cond_0
    return-void
.end method

.method private static final onResume$lambda-7(Ljava/lang/Throwable;)V
    .locals 0

    .line 133
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private final setUpPager(Landroidx/viewpager/widget/ViewPager;)V
    .locals 1

    .line 157
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->getPagerAdapter()Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$PagerAdapter;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/PagerAdapter;

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    const/4 v0, 0x2

    .line 158
    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    return-void
.end method

.method private final setUpTabTitles()V
    .locals 7

    .line 163
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->tabLayout:Lcom/google/android/material/tabs/TabLayout;

    const/4 v1, 0x0

    const-string v2, "tabLayout"

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    move-result v0

    if-lez v0, :cond_4

    const/4 v3, 0x0

    :goto_0
    add-int/lit8 v4, v3, 0x1

    .line 164
    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->tabLayout:Lcom/google/android/material/tabs/TabLayout;

    if-eqz v5, :cond_3

    invoke-virtual {v5, v3}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v5

    if-nez v5, :cond_0

    goto :goto_1

    .line 165
    :cond_0
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->getPagerAdapter()Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$PagerAdapter;

    move-result-object v6

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$PagerAdapter;->getScreens()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkotlin/Triple;

    invoke-virtual {v6}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    invoke-virtual {v5, v6}, Lcom/google/android/material/tabs/TabLayout$Tab;->setText(Ljava/lang/CharSequence;)Lcom/google/android/material/tabs/TabLayout$Tab;

    :goto_1
    if-nez v5, :cond_1

    goto :goto_2

    .line 166
    :cond_1
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->getPagerAdapter()Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$PagerAdapter;

    move-result-object v6

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$PagerAdapter;->getScreens()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/Triple;

    invoke-virtual {v3}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {v5, v3}, Lcom/google/android/material/tabs/TabLayout$Tab;->setIcon(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    :goto_2
    if-lt v4, v0, :cond_2

    goto :goto_3

    :cond_2
    move v3, v4

    goto :goto_0

    .line 164
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1

    .line 169
    :cond_4
    :goto_3
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->tabLayout:Lcom/google/android/material/tabs/TabLayout;

    if-eqz v0, :cond_5

    const-string v1, "proTextRegular"

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextViewKt;->setCustomFont(Lcom/google/android/material/tabs/TabLayout;Ljava/lang/String;)V

    return-void

    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1

    .line 163
    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1
.end method

.method private final showDialog(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)V
    .locals 4

    .line 86
    new-instance v0, Landroid/app/AlertDialog$Builder;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v1, "New update is available. Please, update to latest version to continue using the app."

    .line 89
    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const-string v2, "App Update"

    .line 90
    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const-string v2, "OK"

    .line 91
    check-cast v2, Ljava/lang/CharSequence;

    .line 92
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivity$mwl4hPxVbhBbznwtlefWKmsD8B4;

    invoke-direct {v3, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivity$mwl4hPxVbhBbznwtlefWKmsD8B4;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;Lcom/google/android/play/core/appupdate/AppUpdateInfo;)V

    .line 91
    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const-string v1, "Cancel"

    .line 99
    check-cast v1, Ljava/lang/CharSequence;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivity$pHw45vXzQdCLgF9fKhZlxgHKSWE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivity$pHw45vXzQdCLgF9fKhZlxgHKSWE;

    invoke-virtual {p1, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 100
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method private final showDialog(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 104
    new-instance v0, Landroid/app/AlertDialog$Builder;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 107
    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p2

    .line 108
    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p2, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const-string p2, "OK"

    .line 109
    check-cast p2, Ljava/lang/CharSequence;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivity$meLm0nXHlLDdEpHVoHAcyH0cVTA;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivity$meLm0nXHlLDdEpHVoHAcyH0cVTA;

    invoke-virtual {p1, p2, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const-string p2, "Cancel"

    .line 113
    check-cast p2, Ljava/lang/CharSequence;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivity$vsLoHtjLZ04Yw_iL-8SNww4kdgk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivity$vsLoHtjLZ04Yw_iL-8SNww4kdgk;

    invoke-virtual {p1, p2, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 114
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method private static final showDialog$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;Lcom/google/android/play/core/appupdate/AppUpdateInfo;Landroid/content/DialogInterface;I)V
    .locals 1

    const-string p3, "this$0"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "$updateInfo"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->appUpdateController:Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;

    if-eqz p3, :cond_0

    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    iget p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->updateCode:I

    invoke-virtual {p3, v0, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;->startUpdate(Landroid/app/Activity;Lcom/google/android/play/core/appupdate/AppUpdateInfo;I)Lio/reactivex/Completable;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivity$6PsRwSrww_xZORn_Z7oMbj5lbNE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivity$6PsRwSrww_xZORn_Z7oMbj5lbNE;

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivity$wci5VZOIZaY2B5Y8umo9ArYXFKo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivity$wci5VZOIZaY2B5Y8umo9ArYXFKo;

    .line 94
    invoke-virtual {p0, p1, p3}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 97
    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    return-void

    :cond_0
    const-string p0, "appUpdateController"

    .line 93
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private static final showDialog$lambda-2$lambda-0()V
    .locals 0

    return-void
.end method

.method private static final showDialog$lambda-2$lambda-1(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private static final showDialog$lambda-3(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 99
    invoke-interface {p0}, Landroid/content/DialogInterface;->cancel()V

    return-void
.end method

.method private static final showDialog$lambda-4(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 111
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method private static final showDialog$lambda-5(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 113
    invoke-interface {p0}, Landroid/content/DialogInterface;->cancel()V

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

    .line 37
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method protected getLayoutId()I
    .locals 1

    const v0, 0x7f0b001d

    return v0
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;
    .locals 1

    .line 53
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->getMainActivityViewModel()Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;
    .locals 1

    .line 37
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;

    return-object v0
.end method

.method public final goToTab(I)V
    .locals 1

    .line 173
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->tabLayout:Lcom/google/android/material/tabs/TabLayout;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->select()V

    :goto_0
    return-void

    :cond_1
    const-string p1, "tabLayout"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .line 218
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 219
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModelKt;->getREQUEST_ID()I

    move-result p3

    const/4 v0, -0x1

    if-ne p1, p3, :cond_1

    const-string p3, "call_service"

    if-ne p2, v0, :cond_0

    .line 221
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "App registered"

    invoke-static {v1, v2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 223
    :cond_0
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "App not registered"

    invoke-static {v1, v2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    if-ne p2, v0, :cond_2

    const/16 p3, 0x3039

    if-ne p1, p3, :cond_2

    .line 228
    move-object p1, p0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const/4 p2, 0x2

    const-string p3, "Access to fit granted"

    const/4 v0, 0x0

    invoke-static {p1, p3, v0, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_1

    .line 230
    :cond_2
    iget p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->updateCode:I

    if-ne p2, p1, :cond_6

    const-string p1, "AppUpdateInfo"

    if-eq p2, v0, :cond_5

    if-eqz p2, :cond_4

    const/4 p3, 0x1

    if-eq p2, p3, :cond_3

    goto :goto_1

    :cond_3
    const-string p2, "App update failed"

    .line 239
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_4
    const-string p2, "User canceled app update"

    .line 236
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_5
    const-string p2, "User accepted app update"

    .line 233
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    :goto_1
    return-void
.end method

.method public onBackPressed()V
    .locals 6

    .line 249
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->viewPager:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;

    const-string v1, "viewPager"

    const/4 v2, 0x0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->getCurrentItem()I

    move-result v0

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->getPagerAdapter()Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$PagerAdapter;

    move-result-object v3

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$PagerAdapter;->getCount()I

    move-result v3

    if-ge v0, v3, :cond_2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->viewPager:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->getCurrentItem()I

    move-result v0

    if-ltz v0, :cond_2

    .line 250
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->getPagerAdapter()Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$PagerAdapter;

    move-result-object v0

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->viewPager:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$PagerAdapter;->getItem(I)Landroidx/fragment/app/Fragment;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v2

    .line 249
    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v2

    :cond_2
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_3

    .line 252
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;->onBackPressed()V

    goto :goto_1

    .line 256
    :cond_3
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v1

    const-string v3, "this.supportFragmentManager.fragments"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    .line 270
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Landroidx/fragment/app/Fragment;

    .line 257
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    move-object v2, v3

    :cond_5
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 260
    instance-of v0, v2, Lpowerwatch/matrix/com/pwgen2android/shared/BaseContainerFragment;

    if-eqz v0, :cond_6

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/BaseContainerFragment;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseContainerFragment;->onBackPressed()Z

    move-result v0

    if-nez v0, :cond_7

    .line 261
    :cond_6
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;->onBackPressed()V

    :cond_7
    :goto_1
    return-void

    .line 249
    :cond_8
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v2
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 61
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0f019f

    .line 62
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(R.string.steps)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManagerKt;->setSteps(Ljava/lang/String;)V

    const p1, 0x7f0b001d

    .line 63
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->setContentView(I)V

    .line 64
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;

    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->appUpdateController:Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;

    .line 66
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->getMainActivityViewModel()Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->getFirebaseField()Landroidx/databinding/ObservableField;

    move-result-object p1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$onCreate$1;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$onCreate$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;)V

    check-cast v0, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 75
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->getMainActivityViewModel()Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;

    move-result-object p1

    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->onCreateView(Landroid/content/Context;)V

    const p1, 0x7f08027c

    .line 77
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string v0, "findViewById(R.id.viewPager)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->viewPager:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;

    const p1, 0x7f08023b

    .line 78
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string v0, "findViewById(R.id.tabs)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/google/android/material/tabs/TabLayout;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->tabLayout:Lcom/google/android/material/tabs/TabLayout;

    .line 80
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->viewPager:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;

    if-eqz p1, :cond_0

    check-cast p1, Landroidx/viewpager/widget/ViewPager;

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->initTabControl(Landroidx/viewpager/widget/ViewPager;)V

    return-void

    :cond_0
    const-string p1, "viewPager"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 119
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;->onNewIntent(Landroid/content/Intent;)V

    return-void
.end method

.method protected onResume()V
    .locals 3

    .line 124
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;->onResume()V

    .line 125
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->getMainActivityViewModel()Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->onResume()V

    .line 126
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->appUpdateController:Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;

    if-eqz v0, :cond_0

    move-object v1, p0

    check-cast v1, Landroid/app/Activity;

    iget v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->updateCode:I

    invoke-virtual {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;->onResume(Landroid/app/Activity;I)Lio/reactivex/Single;

    move-result-object v0

    .line 127
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivity$bTsgFIDOgZ_l8xCAeCjWFQX9IcI;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivity$bTsgFIDOgZ_l8xCAeCjWFQX9IcI;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;)V

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivity$Ggl0bsRQ6haxzAWNMt0_I8DN7XQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivity$Ggl0bsRQ6haxzAWNMt0_I8DN7XQ;

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Single;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    return-void

    :cond_0
    const-string v0, "appUpdateController"

    .line 126
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final showTab(Z)V
    .locals 4

    .line 178
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->tabLayout:Lcom/google/android/material/tabs/TabLayout;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    const/4 v2, 0x0

    const-string v3, "viewPager"

    if-eqz p1, :cond_1

    .line 179
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->viewPager:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;

    if-eqz p1, :cond_0

    invoke-virtual {p1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->setSwipeLocked(Z)V

    goto :goto_0

    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1

    .line 182
    :cond_1
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->viewPager:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->setSwipeLocked(Z)V

    const/16 v2, 0x8

    .line 178
    :goto_0
    invoke-virtual {v0, v2}, Lcom/google/android/material/tabs/TabLayout;->setVisibility(I)V

    return-void

    .line 182
    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1

    :cond_3
    const-string p1, "tabLayout"

    .line 178
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1
.end method
