.class public Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;
.super Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;
.source "NotificationsRecyclerViewAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "HeaderState"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;",
        "title",
        "",
        "colapsed",
        "",
        "headerIndex",
        "",
        "(Ljava/lang/String;ZI)V",
        "getColapsed",
        "()Z",
        "setColapsed",
        "(Z)V",
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


# instance fields
.field private colapsed:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZI)V
    .locals 2

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$Header;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$Header;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, p3, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;-><init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-boolean p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;->colapsed:Z

    return-void
.end method


# virtual methods
.method public final getColapsed()Z
    .locals 1

    .line 51
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;->colapsed:Z

    return v0
.end method

.method public final setColapsed(Z)V
    .locals 0

    .line 51
    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;->colapsed:Z

    return-void
.end method
