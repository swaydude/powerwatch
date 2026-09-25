.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;
.super Ljava/lang/Object;
.source "Commands.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\n\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B7\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\tH\u00c6\u0003J;\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0007H\u00d6\u0001J\t\u0010%\u001a\u00020&H\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u000c\"\u0004\u0008\u0010\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u000c\"\u0004\u0008\u0012\u0010\u000eR\u001a\u0010\u0008\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\'"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;",
        "",
        "otaVersion",
        "",
        "mtpVersion",
        "disVersion",
        "timestamp",
        "",
        "sections",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;",
        "(SSSILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;)V",
        "getDisVersion",
        "()S",
        "setDisVersion",
        "(S)V",
        "getMtpVersion",
        "setMtpVersion",
        "getOtaVersion",
        "setOtaVersion",
        "getSections",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;",
        "setSections",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;)V",
        "getTimestamp",
        "()I",
        "setTimestamp",
        "(I)V",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
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
.field private disVersion:S

.field private mtpVersion:S

.field private otaVersion:S

.field private sections:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;

.field private timestamp:I


# direct methods
.method public constructor <init>()V
    .locals 8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;-><init>(SSSILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(SSSILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;)V
    .locals 1

    const-string v0, "sections"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-short p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->otaVersion:S

    iput-short p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->mtpVersion:S

    .line 42
    iput-short p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->disVersion:S

    iput p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->timestamp:I

    .line 43
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->sections:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;

    return-void
.end method

.method public synthetic constructor <init>(SSSILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x1

    if-eqz p7, :cond_0

    const/4 p7, 0x1

    goto :goto_0

    :cond_0
    move p7, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    move v2, p3

    :goto_2
    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    const/4 p4, -0x1

    const/4 v3, -0x1

    goto :goto_3

    :cond_3
    move v3, p4

    :goto_3
    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_4

    .line 43
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;

    const/4 p1, 0x0

    invoke-direct {p5, p1, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_4
    move-object p6, p5

    move-object p1, p0

    move p2, p7

    move p3, v1

    move p4, v2

    move p5, v3

    .line 41
    invoke-direct/range {p1 .. p6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;-><init>(SSSILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;SSSILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-short p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->otaVersion:S

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-short p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->mtpVersion:S

    :cond_1
    move p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-short p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->disVersion:S

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->timestamp:I

    :cond_3
    move v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->sections:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move p3, p1

    move p4, p7

    move p5, v0

    move p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->copy(SSSILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()S
    .locals 1

    iget-short v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->otaVersion:S

    return v0
.end method

.method public final component2()S
    .locals 1

    iget-short v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->mtpVersion:S

    return v0
.end method

.method public final component3()S
    .locals 1

    iget-short v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->disVersion:S

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->timestamp:I

    return v0
.end method

.method public final component5()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->sections:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;

    return-object v0
.end method

.method public final copy(SSSILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;
    .locals 7

    const-string v0, "sections"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;

    move-object v1, v0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;-><init>(SSSILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;

    iget-short v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->otaVersion:S

    iget-short v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->otaVersion:S

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-short v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->mtpVersion:S

    iget-short v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->mtpVersion:S

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-short v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->disVersion:S

    iget-short v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->disVersion:S

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->timestamp:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->timestamp:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->sections:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->sections:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getDisVersion()S
    .locals 1

    .line 42
    iget-short v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->disVersion:S

    return v0
.end method

.method public final getMtpVersion()S
    .locals 1

    .line 41
    iget-short v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->mtpVersion:S

    return v0
.end method

.method public final getOtaVersion()S
    .locals 1

    .line 41
    iget-short v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->otaVersion:S

    return v0
.end method

.method public final getSections()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;
    .locals 1

    .line 43
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->sections:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;

    return-object v0
.end method

.method public final getTimestamp()I
    .locals 1

    .line 42
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->timestamp:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-short v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->otaVersion:S

    mul-int/lit8 v0, v0, 0x1f

    iget-short v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->mtpVersion:S

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-short v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->disVersion:S

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->timestamp:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->sections:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setDisVersion(S)V
    .locals 0

    .line 42
    iput-short p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->disVersion:S

    return-void
.end method

.method public final setMtpVersion(S)V
    .locals 0

    .line 41
    iput-short p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->mtpVersion:S

    return-void
.end method

.method public final setOtaVersion(S)V
    .locals 0

    .line 41
    iput-short p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->otaVersion:S

    return-void
.end method

.method public final setSections(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->sections:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;

    return-void
.end method

.method public final setTimestamp(I)V
    .locals 0

    .line 42
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->timestamp:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DISTableVersion(otaVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->otaVersion:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mtpVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->mtpVersion:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", disVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->disVersion:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->timestamp:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sections="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->sections:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
