.class public final Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;
.super Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;
.source "NotificationsRecyclerViewAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "HeaderWithAction"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;",
        "()V",
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
.field public static final INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 37
    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
