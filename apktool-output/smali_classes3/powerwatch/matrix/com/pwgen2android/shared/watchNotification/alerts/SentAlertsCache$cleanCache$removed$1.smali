.class final Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache$cleanCache$removed$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SentAlertsCache.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;->cleanCache(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Long;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
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
.field final synthetic $time:J

.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;


# direct methods
.method constructor <init>(JLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;)V
    .locals 0

    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache$cleanCache$removed$1;->$time:J

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache$cleanCache$removed$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 33
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache$cleanCache$removed$1;->invoke(Ljava/lang/Long;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/Long;)Z
    .locals 4

    .line 33
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache$cleanCache$removed$1;->$time:J

    const-string v2, "it"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long/2addr v0, v2

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache$cleanCache$removed$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;->access$getRemoveThreshold$p(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;)J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
