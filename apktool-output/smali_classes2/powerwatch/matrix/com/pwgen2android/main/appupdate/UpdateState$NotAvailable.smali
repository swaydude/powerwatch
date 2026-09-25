.class public final Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState$NotAvailable;
.super Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;
.source "AppUpdateController.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NotAvailable"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState$NotAvailable;",
        "Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;",
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


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "NOT_AVAILABLE"

    const/4 v1, 0x0

    .line 18
    invoke-direct {p0, v0, v1, v1}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;-><init>(Ljava/lang/String;Lcom/google/android/play/core/appupdate/AppUpdateInfo;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
