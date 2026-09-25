.class public abstract Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType;
.super Ljava/lang/Object;
.source "ReportIssueViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType$Companion;,
        Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType$LOGS;,
        Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType$SCREENSHOT;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u0000 \u00072\u00020\u0001:\u0003\u0007\u0008\tB\u000f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType;",
        "",
        "type",
        "",
        "(Ljava/lang/String;)V",
        "getType",
        "()Ljava/lang/String;",
        "Companion",
        "LOGS",
        "SCREENSHOT",
        "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType$LOGS;",
        "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType$SCREENSHOT;",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType$Companion;

.field public static final key:Ljava/lang/String; = "attachmentType"


# instance fields
.field private final type:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType;->Companion:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType;->type:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getType()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType;->type:Ljava/lang/String;

    return-object v0
.end method
