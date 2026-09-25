.class public final Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatchBlackOps;
.super Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;
.source "Products.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PowerWatchBlackOps"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatchBlackOps;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;",
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
.field public static final INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatchBlackOps;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatchBlackOps;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatchBlackOps;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatchBlackOps;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatchBlackOps;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const-string v0, "PowerWatch Black Ops"

    const v1, 0x7f0c0019

    const/4 v2, 0x0

    .line 10
    invoke-direct {p0, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
