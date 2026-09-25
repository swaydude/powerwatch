.class public final Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$NonCollapsibleHeader;
.super Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;
.source "NotificationsRecyclerViewAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NonCollapsibleHeader"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$NonCollapsibleHeader;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;",
        "title",
        "",
        "headerIndex",
        "",
        "(Ljava/lang/String;I)V",
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
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 53
    invoke-direct {p0, p1, v0, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;-><init>(Ljava/lang/String;ZI)V

    .line 55
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$NotCollapsibleHeader;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$NotCollapsibleHeader;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$NonCollapsibleHeader;->setType(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;)V

    return-void
.end method
