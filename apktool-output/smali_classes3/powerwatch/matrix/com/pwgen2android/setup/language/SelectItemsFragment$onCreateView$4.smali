.class final Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$onCreateView$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SelectItemsFragment.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSelectItemsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectItemsFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$onCreateView$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n1858#2,3:114\n*S KotlinDebug\n*F\n+ 1 SelectItemsFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$onCreateView$4\n*L\n86#1:114,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "selectedIndex",
        ""
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $adapter:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseItemRecyclerAdapter;

.field final synthetic $items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/UIChooseItemView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseItemRecyclerAdapter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/UIChooseItemView;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseItemRecyclerAdapter;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$onCreateView$4;->$items:Ljava/util/List;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$onCreateView$4;->$adapter:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseItemRecyclerAdapter;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 85
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$onCreateView$4;->invoke(I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(I)V
    .locals 5

    .line 86
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$onCreateView$4;->$items:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 115
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/UIChooseItemView;

    if-ne v2, p1, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 87
    :goto_1
    invoke-virtual {v3, v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/UIChooseItemView;->setChecked(Z)V

    move v2, v4

    goto :goto_0

    .line 89
    :cond_2
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$onCreateView$4;->$adapter:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseItemRecyclerAdapter;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseItemRecyclerAdapter;->notifyDataSetChanged()V

    return-void
.end method
