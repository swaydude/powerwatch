.class public final Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState$Running;
.super Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;
.source "AppUpdateController.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Running"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState$Running;",
        "Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;",
        "updateInfo",
        "Lcom/google/android/play/core/appupdate/AppUpdateInfo;",
        "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)V",
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
.method public constructor <init>(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)V
    .locals 2

    const-string v0, "updateInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "RUNNING"

    const/4 v1, 0x0

    .line 19
    invoke-direct {p0, v0, p1, v1}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;-><init>(Ljava/lang/String;Lcom/google/android/play/core/appupdate/AppUpdateInfo;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
