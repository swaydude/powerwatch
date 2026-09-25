.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;
.super Ljava/lang/Object;
.source "SleepTimeRepository.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSleepTimeRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepTimeRepository.kt\npowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0008\u001a\u00020\u0007J\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006R\u0014\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;",
        "",
        "sleepTimeStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;)V",
        "possibleValues",
        "",
        "",
        "getDisplayValue",
        "getPossibleValues",
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
.field private final possibleValues:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final sleepTimeStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;)V
    .locals 4

    const-string v0, "sleepTimeStorage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;->sleepTimeStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;

    .line 33
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0x18

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ":00"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;->possibleValues:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final getDisplayValue()Ljava/lang/String;
    .locals 2

    .line 38
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;->sleepTimeStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;->getSleepTime()I

    move-result v0

    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ":00"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getPossibleValues()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;->possibleValues:Ljava/util/List;

    return-object v0
.end method
