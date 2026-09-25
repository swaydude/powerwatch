.class public final Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment;
.super Landroidx/fragment/app/Fragment;
.source "WatchProductFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment;",
        "Landroidx/fragment/app/Fragment;",
        "()V",
        "watchProduct",
        "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment$Companion;

.field private static final WATCH_PRODUCT_KEY:Ljava/lang/String; = "watch_product"


# instance fields
.field private watchProduct:Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method

.method public static final newInstance(Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;)Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment$Companion;

    invoke-virtual {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment$Companion;->newInstance(Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;)Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0b0084

    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 22
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    const/4 p3, 0x0

    if-nez p2, :cond_0

    move-object p2, p3

    goto :goto_0

    :cond_0
    const-string v0, "watch_product"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p2

    :goto_0
    instance-of v0, p2, Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;

    if-eqz v0, :cond_1

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;

    goto :goto_1

    :cond_1
    move-object p2, p3

    :goto_1
    if-eqz p2, :cond_4

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment;->watchProduct:Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;

    .line 25
    sget p2, Lpowerwatch/matrix/com/pwgen2android/R$id;->watch_product_title:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment;->watchProduct:Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;

    const-string v1, "watchProduct"

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;->getName()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p2, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    sget p2, Lpowerwatch/matrix/com/pwgen2android/R$id;->watch_image:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    .line 27
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment;->watchProduct:Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;->getImage()I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    return-object p1

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p3

    .line 25
    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p3

    .line 23
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Watch product must be provided."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
