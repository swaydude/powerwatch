.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;
.super Ljava/lang/Object;
.source "SleepTimeRepository.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;",
        "",
        "sleepTimeStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;)V",
        "getSleepTime",
        "",
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
.field private final sleepTimeStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;)V
    .locals 1

    const-string v0, "sleepTimeStorage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;->sleepTimeStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;

    return-void
.end method


# virtual methods
.method public final getSleepTime()I
    .locals 1

    .line 46
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;->sleepTimeStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;->getSleepTime()I

    move-result v0

    add-int/lit8 v0, v0, -0x9

    if-gez v0, :cond_0

    .line 48
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    goto :goto_0

    :cond_0
    rsub-int/lit8 v0, v0, 0x18

    :goto_0
    return v0
.end method
