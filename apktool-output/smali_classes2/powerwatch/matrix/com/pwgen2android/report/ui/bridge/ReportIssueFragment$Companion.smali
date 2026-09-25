.class public final Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueFragment$Companion;
.super Ljava/lang/Object;
.source "ReportIssueFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueFragment$Companion;",
        "",
        "()V",
        "newInstance",
        "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueFragment;",
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
.method private constructor <init>()V
    .locals 0

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueFragment$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final newInstance()Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueFragment;
    .locals 2

    .line 86
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 87
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueFragment;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueFragment;-><init>()V

    .line 89
    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v1
.end method
