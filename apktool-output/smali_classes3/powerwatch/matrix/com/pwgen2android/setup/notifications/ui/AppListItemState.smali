.class public abstract Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;
.super Ljava/lang/Object;
.source "NotificationsRecyclerViewAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;,
        Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;,
        Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$NonCollapsibleHeader;,
        Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ActionHeader;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\u001f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010\u0082\u0001\u0002\u0015\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;",
        "",
        "title",
        "",
        "type",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;",
        "headerIndex",
        "",
        "(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;I)V",
        "getHeaderIndex",
        "()I",
        "getTitle",
        "()Ljava/lang/String;",
        "getType",
        "()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;",
        "setType",
        "(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;)V",
        "ActionHeader",
        "HeaderState",
        "ItemState",
        "NonCollapsibleHeader",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;",
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
.field private final headerIndex:I

.field private final title:Ljava/lang/String;

.field private type:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;I)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;->title:Ljava/lang/String;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;->type:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;

    iput p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;->headerIndex:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;-><init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;I)V

    return-void
.end method


# virtual methods
.method public final getHeaderIndex()I
    .locals 1

    .line 48
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;->headerIndex:I

    return v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;
    .locals 1

    .line 48
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;->type:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;

    return-object v0
.end method

.method public final setType(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState;->type:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;

    return-void
.end method
