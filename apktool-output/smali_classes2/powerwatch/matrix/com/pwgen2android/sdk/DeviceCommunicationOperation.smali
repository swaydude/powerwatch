.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;
.super Ljava/lang/Object;
.source "DeviceCommunicationQueuer.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<RESUlT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B\'\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0008H\u00c6\u0003J3\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0008H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001a"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;",
        "RESUlT",
        "",
        "operationObs",
        "Lio/reactivex/Observable;",
        "operationType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;",
        "operationID",
        "",
        "(Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;)V",
        "getOperationID",
        "()Ljava/lang/String;",
        "getOperationObs",
        "()Lio/reactivex/Observable;",
        "getOperationType",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final operationID:Ljava/lang/String;

.field private final operationObs:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "TRESUlT;>;"
        }
    .end annotation
.end field

.field private final operationType:Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;


# direct methods
.method public constructor <init>(Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "TRESUlT;>;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "operationObs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "operationType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "operationID"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationObs:Lio/reactivex/Observable;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationType:Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationID:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 24
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType$Delayer;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType$Delayer;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p3

    const-string p4, "randomUUID().toString()"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;-><init>(Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationObs:Lio/reactivex/Observable;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationType:Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationID:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->copy(Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "TRESUlT;>;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationObs:Lio/reactivex/Observable;

    return-object v0
.end method

.method public final component2()Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationType:Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationID:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "TRESUlT;>;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;",
            "Ljava/lang/String;",
            ")",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation<",
            "TRESUlT;>;"
        }
    .end annotation

    const-string v0, "operationObs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "operationType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "operationID"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    invoke-direct {v0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;-><init>(Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationObs:Lio/reactivex/Observable;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationObs:Lio/reactivex/Observable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationType:Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationType:Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationID:Ljava/lang/String;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationID:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getOperationID()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationID:Ljava/lang/String;

    return-object v0
.end method

.method public final getOperationObs()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "TRESUlT;>;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationObs:Lio/reactivex/Observable;

    return-object v0
.end method

.method public final getOperationType()Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;
    .locals 1

    .line 24
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationType:Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationObs:Lio/reactivex/Observable;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationType:Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationID:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DeviceCommunicationOperation(operationObs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationObs:Lio/reactivex/Observable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", operationType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationType:Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", operationID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->operationID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
