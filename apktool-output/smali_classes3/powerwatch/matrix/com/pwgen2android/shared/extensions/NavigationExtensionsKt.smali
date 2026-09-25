.class public final Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;
.super Ljava/lang/Object;
.source "NavigationExtensions.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNavigationExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationExtensions.kt\npowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n1858#2,3:124\n*S KotlinDebug\n*F\n+ 1 NavigationExtensions.kt\npowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt\n*L\n68#1:124,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0014\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a0\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u001a \u0010\u000f\u001a\u00020\u0006*\u00020\u00072\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0011\u001a\u00020\n\u001a\n\u0010\u0012\u001a\u00020\u0004*\u00020\u0013\u001a\u001e\u0010\u0014\u001a\u00020\u0006*\u00020\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u000c\u001a\u0014\u0010\u0019\u001a\u00020\u0006*\u00020\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0017\u001a\u0014\u0010\u001a\u001a\u00020\u0006*\u00020\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0017\u001a\n\u0010\u001b\u001a\u00020\u0006*\u00020\u0007\u00a8\u0006\u001c"
    }
    d2 = {
        "getFragmentsToPush",
        "",
        "Landroidx/fragment/app/Fragment;",
        "className",
        "",
        "addFragment",
        "",
        "Landroidx/fragment/app/FragmentManager;",
        "fragment",
        "fragmentContainer",
        "",
        "toBackStack",
        "",
        "animation",
        "Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;",
        "fillBackStack",
        "fragments",
        "containerID",
        "getNavigation",
        "Landroid/content/Intent;",
        "goToMainActivity",
        "Landroid/app/Activity;",
        "navigateToFragment",
        "Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;",
        "clearStack",
        "goToPairingActivity",
        "goToSetupActivity",
        "popBackStackAllowingStateLoss",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final addFragment(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-virtual {p0, p2}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    move-result-object v0

    .line 42
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object p0

    const-string v1, "beginTransaction()"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p4, :cond_1

    .line 46
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Default;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Default;

    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 p4, 0x1001

    invoke-virtual {p0, p4}, Landroidx/fragment/app/FragmentTransaction;->setTransition(I)Landroidx/fragment/app/FragmentTransaction;

    goto :goto_0

    .line 47
    :cond_0
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Side;

    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_1

    const p4, 0x7f01001e

    const v1, 0x7f01001f

    const v2, 0x7f01001d

    const v3, 0x7f010020

    invoke-virtual {p0, p4, v1, v2, v3}, Landroidx/fragment/app/FragmentTransaction;->setCustomAnimations(IIII)Landroidx/fragment/app/FragmentTransaction;

    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p4

    invoke-static {p4}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p4

    invoke-interface {p4}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p2, p1, p4}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    goto :goto_1

    .line 55
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p4

    invoke-static {p4}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p4

    invoke-interface {p4}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p2, p1, p4}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    :goto_1
    if-eqz p3, :cond_3

    const/4 p1, 0x0

    .line 59
    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    .line 62
    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    return-void
.end method

.method public static synthetic addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x1

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 39
    sget-object p4, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Default;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType$Default;

    check-cast p4, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;

    .line 38
    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;)V

    return-void
.end method

.method public static final fillBackStack(Landroidx/fragment/app/FragmentManager;Ljava/util/List;I)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/FragmentManager;",
            "Ljava/util/List<",
            "+",
            "Landroidx/fragment/app/Fragment;",
            ">;I)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    .line 68
    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    .line 125
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v3, 0x1

    if-gez v3, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    move-object v7, v4

    check-cast v7, Landroidx/fragment/app/Fragment;

    .line 70
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    const/4 v6, 0x1

    sub-int/2addr v4, v6

    if-ne v3, v4, :cond_2

    if-eq v0, v6, :cond_1

    const/4 v9, 0x1

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    :goto_1
    const/4 v10, 0x0

    const/16 v11, 0x8

    const/4 v12, 0x0

    move-object v6, p0

    move v8, p2

    invoke-static/range {v6 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    if-nez v3, :cond_3

    .line 71
    invoke-static {p0, v7, p2, v2, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;)V

    goto :goto_2

    .line 72
    :cond_3
    invoke-static {p0, v7, p2, v6, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;)V

    :goto_2
    move v3, v5

    goto :goto_0

    :cond_4
    return-void
.end method

.method public static final getFragmentsToPush(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation

    const-string v0, "className"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment$Companion;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    .line 80
    :cond_0
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInFragment;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInFragment$Companion;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInFragment;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    .line 81
    :cond_1
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$Companion;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/calendar/CalendarFragment;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    .line 82
    :cond_2
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment$Companion;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    .line 83
    :cond_3
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    .line 84
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$Companion;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    .line 87
    :cond_4
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final getNavigation(Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigateTo"

    .line 112
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$None;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$None;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$None;->getClassName()Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final goToMainActivity(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;Z)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigateToFragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    if-eqz p2, :cond_0

    const/high16 p2, 0x4000000

    .line 100
    invoke-virtual {v0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 101
    :cond_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;->getClassName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "navigateTo"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 102
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static synthetic goToMainActivity$default(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 98
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$None;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$None;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->goToMainActivity(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;Z)V

    return-void
.end method

.method public static final goToPairingActivity(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigateToFragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 107
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;->getClassName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "navigateTo"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 108
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static synthetic goToPairingActivity$default(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 105
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$None;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$None;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;

    :cond_0
    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->goToPairingActivity(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;)V

    return-void
.end method

.method public static final goToSetupActivity(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigateToFragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    new-instance v0, Landroid/content/Intent;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-class v2, Lpowerwatch/matrix/com/pwgen2android/setup/SetupActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 94
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;->getClassName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "navigateTo"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 95
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static synthetic goToSetupActivity$default(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 92
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$None;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$None;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;

    :cond_0
    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->goToSetupActivity(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;)V

    return-void
.end method

.method public static final popBackStackAllowingStateLoss(Landroidx/fragment/app/FragmentManager;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->popBackStack()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
