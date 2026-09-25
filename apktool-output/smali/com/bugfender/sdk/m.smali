.class public Lcom/bugfender/sdk/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[C

.field private static final b:C


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lcom/bugfender/sdk/m;->a:[C

    const/4 v1, 0x0

    aget-char v0, v0, v1

    sput-char v0, Lcom/bugfender/sdk/m;->b:C

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a([BIII)B
    .locals 2

    const/4 v0, 0x0

    :goto_0
    array-length v1, p0

    if-ge p1, v1, :cond_0

    aget-byte v1, p0, p1

    and-int/lit16 v1, v1, 0xff

    mul-int v0, v0, p2

    add-int/2addr v0, v1

    div-int v1, v0, p3

    int-to-byte v1, v1

    aput-byte v1, p0, p1

    rem-int/2addr v0, p3

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    int-to-byte p0, v0

    return p0
.end method

.method public static a([B)Ljava/lang/String;
    .locals 8

    array-length v0, p0

    if-nez v0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_1

    aget-byte v1, p0, v0

    if-nez v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    array-length v1, p0

    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p0

    array-length v1, p0

    mul-int/lit8 v1, v1, 0x2

    new-array v2, v1, [C

    move v3, v0

    move v4, v1

    :cond_2
    :goto_1
    array-length v5, p0

    if-ge v3, v5, :cond_3

    add-int/lit8 v4, v4, -0x1

    sget-object v5, Lcom/bugfender/sdk/m;->a:[C

    const/16 v6, 0x100

    const/16 v7, 0x3a

    invoke-static {p0, v3, v6, v7}, Lcom/bugfender/sdk/m;->a([BIII)B

    move-result v6

    aget-char v5, v5, v6

    aput-char v5, v2, v4

    aget-byte v5, p0, v3

    if-nez v5, :cond_2

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    if-ge v4, v1, :cond_4

    aget-char p0, v2, v4

    sget-char v3, Lcom/bugfender/sdk/m;->b:C

    if-ne p0, v3, :cond_4

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_4
    :goto_3
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_5

    add-int/lit8 v4, v4, -0x1

    sget-char p0, Lcom/bugfender/sdk/m;->b:C

    aput-char p0, v2, v4

    goto :goto_3

    :cond_5
    new-instance p0, Ljava/lang/String;

    sub-int/2addr v1, v4

    invoke-direct {p0, v2, v4, v1}, Ljava/lang/String;-><init>([CII)V

    return-object p0
.end method
