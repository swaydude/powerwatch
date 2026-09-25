.class final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache$fetchAndRemove$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SentAlertsCache.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;->fetchAndRemove(Ljava/lang/String;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;",
        "kotlin.jvm.PlatformType"
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
.field final synthetic $title:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache$fetchAndRemove$1;->$title:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 41
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache$fetchAndRemove$1;->invoke(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;)Z
    .locals 1

    .line 41
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->isMessage()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;->getTitle()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache$fetchAndRemove$1;->$title:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
