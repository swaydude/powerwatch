.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;
.super Ljava/lang/Object;
.source "BleScanner.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B+\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ4\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001d"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;",
        "",
        "scanMode",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;",
        "scanFilters",
        "",
        "Lcom/polidea/rxandroidble2/scan/ScanFilter;",
        "scanTimeout",
        "",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;Ljava/util/List;Ljava/lang/Long;)V",
        "getScanFilters",
        "()Ljava/util/List;",
        "getScanMode",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;",
        "getScanTimeout",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "component1",
        "component2",
        "component3",
        "copy",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;Ljava/util/List;Ljava/lang/Long;)Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final scanFilters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/polidea/rxandroidble2/scan/ScanFilter;",
            ">;"
        }
    .end annotation
.end field

.field private final scanMode:Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;

.field private final scanTimeout:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;Ljava/util/List;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;Ljava/util/List;Ljava/lang/Long;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;",
            "Ljava/util/List<",
            "+",
            "Lcom/polidea/rxandroidble2/scan/ScanFilter;",
            ">;",
            "Ljava/lang/Long;",
            ")V"
        }
    .end annotation

    const-string v0, "scanMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scanFilters"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanMode:Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;

    .line 18
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanFilters:Ljava/util/List;

    .line 19
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanTimeout:Ljava/lang/Long;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;Ljava/util/List;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 17
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;->SCAN_MODE_LOW_LATENCY:Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 18
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/4 p3, 0x0

    .line 17
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;Ljava/util/List;Ljava/lang/Long;)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;Ljava/util/List;Ljava/lang/Long;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanMode:Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanFilters:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanTimeout:Ljava/lang/Long;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->copy(Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;Ljava/util/List;Ljava/lang/Long;)Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanMode:Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/polidea/rxandroidble2/scan/ScanFilter;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanFilters:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanTimeout:Ljava/lang/Long;

    return-object v0
.end method

.method public final copy(Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;Ljava/util/List;Ljava/lang/Long;)Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;",
            "Ljava/util/List<",
            "+",
            "Lcom/polidea/rxandroidble2/scan/ScanFilter;",
            ">;",
            "Ljava/lang/Long;",
            ")",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;"
        }
    .end annotation

    const-string v0, "scanMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scanFilters"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;

    invoke-direct {v0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;Ljava/util/List;Ljava/lang/Long;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanMode:Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanMode:Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanFilters:Ljava/util/List;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanFilters:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanTimeout:Ljava/lang/Long;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanTimeout:Ljava/lang/Long;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getScanFilters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/polidea/rxandroidble2/scan/ScanFilter;",
            ">;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanFilters:Ljava/util/List;

    return-object v0
.end method

.method public final getScanMode()Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;
    .locals 1

    .line 17
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanMode:Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;

    return-object v0
.end method

.method public final getScanTimeout()Ljava/lang/Long;
    .locals 1

    .line 19
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanTimeout:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanMode:Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanFilters:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanTimeout:Ljava/lang/Long;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleScannerConfiguration(scanMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanMode:Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", scanFilters="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanFilters:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", scanTimeout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->scanTimeout:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
