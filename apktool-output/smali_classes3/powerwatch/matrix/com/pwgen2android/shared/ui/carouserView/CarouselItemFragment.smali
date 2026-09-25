.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment;
.super Landroidx/fragment/app/Fragment;
.source "CarouselItemFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0008\u001a\u00020\tH\u0002J\u0012\u0010\n\u001a\u00020\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment;",
        "Landroidx/fragment/app/Fragment;",
        "()V",
        "imageArray",
        "",
        "screenHeight",
        "",
        "screenWidth",
        "getWidthAndHeight",
        "",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment$Companion;

.field private static final POSITON:Ljava/lang/String;

.field private static final SCALE:Ljava/lang/String;


# instance fields
.field private final imageArray:[I

.field private screenHeight:I

.field private screenWidth:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment$Companion;

    const-string v0, "position"

    .line 61
    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment;->POSITON:Ljava/lang/String;

    const-string v0, "scale"

    .line 62
    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment;->SCALE:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const/4 v0, 0x3

    new-array v0, v0, [I

    .line 21
    fill-array-data v0, :array_0

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment;->imageArray:[I

    return-void

    :array_0
    .array-data 4
        0x7f0c001f
        0x7f0c0020
        0x7f0c0022
    .end array-data
.end method

.method public static final synthetic access$getPOSITON$cp()Ljava/lang/String;
    .locals 1

    .line 16
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment;->POSITON:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getSCALE$cp()Ljava/lang/String;
    .locals 1

    .line 16
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment;->SCALE:Ljava/lang/String;

    return-object v0
.end method

.method private final getWidthAndHeight()V
    .locals 2

    .line 53
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 54
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    :goto_0
    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 55
    :goto_1
    iget v1, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment;->screenHeight:I

    .line 56
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment;->screenWidth:I

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 24
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 25
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment;->getWidthAndHeight()V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const p3, 0x7f0b002a

    const/4 v0, 0x0

    .line 32
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.widget.LinearLayout"

    invoke-static {p1, p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Landroid/widget/LinearLayout;

    .line 33
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    const/4 p3, 0x2

    if-nez p2, :cond_1

    const/4 p2, 0x2

    goto :goto_0

    :cond_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment;->POSITON:Ljava/lang/String;

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p2

    .line 34
    :goto_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_2

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_2
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment;->SCALE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    .line 36
    :goto_1
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    iget v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment;->screenWidth:I

    div-int/2addr v2, p3

    iget v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment;->screenHeight:I

    div-int/2addr v3, p3

    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 39
    sget p3, Lpowerwatch/matrix/com/pwgen2android/R$id;->root_container:I

    invoke-virtual {p1, p3}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselLinearLayout;

    .line 40
    sget v2, Lpowerwatch/matrix/com/pwgen2android/R$id;->pagerImg:I

    invoke-virtual {p3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselLinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 41
    check-cast v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 42
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment;->imageArray:[I

    aget p2, v1, p2

    invoke-virtual {v2, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 44
    invoke-virtual {p3, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselLinearLayout;->setScaleBoth(F)V

    .line 46
    check-cast p1, Landroid/view/View;

    return-object p1
.end method
