.class final Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment$onCreateView$1;
.super Lkotlin/jvm/internal/Lambda;
.source "PermissionInfoFragment.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
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
.field final synthetic $adapter:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;

.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment;Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment$onCreateView$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment$onCreateView$1;->$adapter:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 65
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment$onCreateView$1;->invoke(I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(I)V
    .locals 4

    .line 66
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment$onCreateView$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionsInfoViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionsInfoViewModel;->getPermissionsList()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/UIPermissionInfo;

    .line 67
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment$onCreateView$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionsInfoViewModel;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment$onCreateView$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment$onCreateView$1$1;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment$onCreateView$1;->$adapter:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;

    invoke-direct {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment$onCreateView$1$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-virtual {v0, v1, p1, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionsInfoViewModel;->onPermissionChecked(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/setup/permissions/UIPermissionInfo;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
