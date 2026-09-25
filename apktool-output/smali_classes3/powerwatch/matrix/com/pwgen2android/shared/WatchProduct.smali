.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;
.super Ljava/lang/Object;
.source "Products.kt"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatchSilver;,
        Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatchBlackOps;,
        Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatchX;,
        Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatch2;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0004\u000b\u000c\r\u000eB\u0017\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u0082\u0001\u0004\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;",
        "Ljava/io/Serializable;",
        "name",
        "",
        "image",
        "",
        "(Ljava/lang/String;I)V",
        "getImage",
        "()I",
        "getName",
        "()Ljava/lang/String;",
        "PowerWatch2",
        "PowerWatchBlackOps",
        "PowerWatchSilver",
        "PowerWatchX",
        "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatchSilver;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatchBlackOps;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatchX;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatch2;",
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
.field private final image:I

.field private final name:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;->name:Ljava/lang/String;

    iput p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;->image:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final getImage()I
    .locals 1

    .line 7
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;->image:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 7
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;->name:Ljava/lang/String;

    return-object v0
.end method
