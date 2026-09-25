.class Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger$1;
.super Ljava/lang/Object;
.source "CloudInterceptLogger.java"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public log(Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "message"
        }
    .end annotation

    .line 97
    invoke-static {}, Lokhttp3/internal/platform/Platform;->get()Lokhttp3/internal/platform/Platform;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Lokhttp3/internal/platform/Platform;->log(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
