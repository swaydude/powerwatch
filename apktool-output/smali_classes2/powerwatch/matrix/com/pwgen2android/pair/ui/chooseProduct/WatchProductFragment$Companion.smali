.class public final Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment$Companion;
.super Ljava/lang/Object;
.source "WatchProductFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment$Companion;",
        "",
        "()V",
        "WATCH_PRODUCT_KEY",
        "",
        "newInstance",
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment;",
        "product",
        "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final newInstance(Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;)Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment;
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "product"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment;-><init>()V

    .line 38
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 39
    check-cast p1, Ljava/io/Serializable;

    const-string v2, "watch_product"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 40
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 38
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/WatchProductFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method
