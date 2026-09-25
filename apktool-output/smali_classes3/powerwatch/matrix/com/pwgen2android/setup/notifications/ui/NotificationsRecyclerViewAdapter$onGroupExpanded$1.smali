.class final Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$onGroupExpanded$1;
.super Lkotlin/jvm/internal/Lambda;
.source "NotificationsRecyclerViewAdapter.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->onGroupExpanded(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;"
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
.field final synthetic $group:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$onGroupExpanded$1;->$group:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 143
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$onGroupExpanded$1;->invoke(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;)Z
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;->getType()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$SimpleItem;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$SimpleItem;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;->getHeaderIndex()I

    move-result p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$onGroupExpanded$1;->$group:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;->getHeaderIndex()I

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
