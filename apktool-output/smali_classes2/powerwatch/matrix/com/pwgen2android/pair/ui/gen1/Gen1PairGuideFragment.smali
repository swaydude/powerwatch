.class public final Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment;
.super Landroidx/fragment/app/Fragment;
.source "Gen1PairGuideFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment;",
        "Landroidx/fragment/app/Fragment;",
        "()V",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method

.method public static synthetic lambda$NgG3Fy86YQYTIZH1lO2FPJFzefE(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment;->onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$QTHW2jnEWoE1vjOBP0Fytk7DaTc(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment;

    move-result-object v0

    return-object v0
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment;->getFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->popBackStack()V

    :goto_0
    return-void
.end method

.method private static final onCreateView$lambda-1(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment;Landroid/view/View;)V
    .locals 7

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment;->getFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment$Companion;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f0801fd

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0b005c

    const/4 v0, 0x0

    .line 19
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const p2, 0x7f080081

    .line 21
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$Gen1PairGuideFragment$QTHW2jnEWoE1vjOBP0Fytk7DaTc;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$Gen1PairGuideFragment$QTHW2jnEWoE1vjOBP0Fytk7DaTc;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment;)V

    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_0
    if-nez p1, :cond_2

    const/4 p2, 0x0

    goto :goto_1

    :cond_2
    const p2, 0x7f0801e5

    .line 25
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    :goto_1
    if-nez p2, :cond_3

    goto :goto_2

    :cond_3
    const p3, 0x7f0f0070

    .line 26
    invoke-virtual {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    check-cast p3, Ljava/lang/CharSequence;

    .line 25
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_2
    const p2, 0x7f080220

    .line 28
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    .line 30
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$Gen1PairGuideFragment$NgG3Fy86YQYTIZH1lO2FPJFzefE;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$Gen1PairGuideFragment$NgG3Fy86YQYTIZH1lO2FPJFzefE;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairGuideFragment;)V

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p1
.end method
