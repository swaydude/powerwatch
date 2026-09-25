.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;
.super Landroidx/fragment/app/FragmentPagerAdapter;
.source "CarouselPagerAdapter.kt"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u0008\u0010\u000c\u001a\u00020\u0008H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0008H\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0008H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0008H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0008H\u0016J \u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0008H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0008H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;",
        "Landroidx/fragment/app/FragmentPagerAdapter;",
        "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;",
        "context",
        "Landroid/content/Context;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "pagerID",
        "",
        "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;I)V",
        "scale",
        "",
        "getCount",
        "getFragmentTag",
        "",
        "position",
        "getItem",
        "Landroidx/fragment/app/Fragment;",
        "getRootView",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselLinearLayout;",
        "onPageScrollStateChanged",
        "",
        "state",
        "onPageScrolled",
        "positionOffset",
        "positionOffsetPixels",
        "onPageSelected",
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
.field private static final BIG_SCALE:F

.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter$Companion;

.field private static final DIFF_SCALE:F

.field private static final SMALL_SCALE:F


# instance fields
.field private final context:Landroid/content/Context;

.field private final fragmentManager:Landroidx/fragment/app/FragmentManager;

.field private final pagerID:I

.field private scale:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter$Companion;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 69
    sput v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->BIG_SCALE:F

    const v1, 0x3f333333    # 0.7f

    .line 70
    sput v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->SMALL_SCALE:F

    sub-float/2addr v0, v1

    .line 71
    sput v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->DIFF_SCALE:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0, p2}, Landroidx/fragment/app/FragmentPagerAdapter;-><init>(Landroidx/fragment/app/FragmentManager;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->context:Landroid/content/Context;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->fragmentManager:Landroidx/fragment/app/FragmentManager;

    iput p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->pagerID:I

    return-void
.end method

.method public static final synthetic access$getBIG_SCALE$cp()F
    .locals 1

    .line 11
    sget v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->BIG_SCALE:F

    return v0
.end method

.method public static final synthetic access$getDIFF_SCALE$cp()F
    .locals 1

    .line 11
    sget v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->DIFF_SCALE:F

    return v0
.end method

.method public static final synthetic access$getSMALL_SCALE$cp()F
    .locals 1

    .line 11
    sget v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->SMALL_SCALE:F

    return v0
.end method

.method private final getFragmentTag(I)Ljava/lang/String;
    .locals 2

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "android:switcher:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->pagerID:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final getRootView(I)Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselLinearLayout;
    .locals 1

    .line 60
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->fragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->getFragmentTag(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const v0, 0x7f0801db

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselLinearLayout;

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public getItem(I)Landroidx/fragment/app/Fragment;
    .locals 3

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 19
    :try_start_0
    sget v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->BIG_SCALE:F

    goto :goto_0

    .line 21
    :cond_0
    sget v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->SMALL_SCALE:F

    .line 18
    :goto_0
    iput v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->scale:F

    .line 23
    rem-int/lit8 p1, p1, 0x3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 29
    :goto_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment$Companion;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->context:Landroid/content/Context;

    iget v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->scale:F

    invoke-virtual {v0, v1, p1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment$Companion;->newInstance(Landroid/content/Context;IF)Landroidx/fragment/app/Fragment;

    move-result-object p1

    return-object p1
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 3

    const/4 p3, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    cmpg-float p3, p3, p2

    if-gtz p3, :cond_0

    const/high16 p3, 0x3f800000    # 1.0f

    cmpg-float p3, p2, p3

    if-gtz p3, :cond_0

    const/4 v1, 0x1

    :cond_0
    if-eqz v1, :cond_1

    .line 39
    :try_start_0
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->getRootView(I)Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselLinearLayout;

    move-result-object p3

    add-int/2addr p1, v0

    .line 40
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->getRootView(I)Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselLinearLayout;

    move-result-object p1

    .line 42
    sget v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->BIG_SCALE:F

    sget v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->DIFF_SCALE:F

    mul-float v2, v1, p2

    sub-float/2addr v0, v2

    invoke-virtual {p3, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselLinearLayout;->setScaleBoth(F)V

    .line 43
    sget p3, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->SMALL_SCALE:F

    mul-float v1, v1, p2

    add-float/2addr p3, v1

    invoke-virtual {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselLinearLayout;->setScaleBoth(F)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 46
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onPageSelected(I)V
    .locals 0

    return-void
.end method
