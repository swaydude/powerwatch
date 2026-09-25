.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;
.super Ljava/lang/Object;
.source "Commands.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0008\u0010\u0017\u001a\u00020\u0018H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0019"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;",
        "",
        "fontType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;",
        "version",
        "",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;J)V",
        "getFontType",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;",
        "setFontType",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;)V",
        "getVersion",
        "()J",
        "setVersion",
        "(J)V",
        "component1",
        "component2",
        "copy",
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
.field private fontType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;

.field private version:J


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;J)V
    .locals 1

    const-string v0, "fontType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;->fontType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;

    iput-wide p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;->version:J

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;JILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;->fontType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    iget-wide p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;->version:J

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;->copy(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;J)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;->fontType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;->version:J

    return-wide v0
.end method

.method public final copy(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;J)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;
    .locals 1

    const-string v0, "fontType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;

    invoke-direct {v0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;J)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;->fontType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;->fontType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;->version:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;->version:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getFontType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;
    .locals 1

    .line 34
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;->fontType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;

    return-object v0
.end method

.method public final getVersion()J
    .locals 2

    .line 34
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;->version:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;->fontType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;->version:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setFontType(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;->fontType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;

    return-void
.end method

.method public final setVersion(J)V
    .locals 0

    .line 34
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;->version:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(fontType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;->fontType:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;->version:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
