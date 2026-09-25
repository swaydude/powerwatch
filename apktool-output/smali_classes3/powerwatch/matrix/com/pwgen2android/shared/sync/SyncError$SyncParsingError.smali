.class public final Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;
.super Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;
.source "WatchSynchronizer.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SyncParsingError"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;",
        "code",
        "",
        "(I)V",
        "getCode",
        "()I",
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
.field private final code:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    const-string v0, "Data parsing error occurred."

    const/4 v1, 0x0

    .line 78
    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;->code:I

    return-void
.end method


# virtual methods
.method public final getCode()I
    .locals 1

    .line 78
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;->code:I

    return v0
.end method
