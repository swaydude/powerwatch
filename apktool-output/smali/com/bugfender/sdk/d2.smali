.class public Lcom/bugfender/sdk/d2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bugfender/sdk/d2$b;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Ljava/nio/charset/Charset;

.field private final c:Ljava/io/RandomAccessFile;

.field private final d:[[B

.field private final e:I

.field private final f:I

.field private g:Lcom/bugfender/sdk/d2$b;

.field private h:Z


# direct methods
.method private constructor <init>(Ljava/io/File;ILjava/nio/charset/Charset;)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bugfender/sdk/d2;->h:Z

    iput p2, p0, Lcom/bugfender/sdk/d2;->a:I

    iput-object p3, p0, Lcom/bugfender/sdk/d2;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p3}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/charset/CharsetEncoder;->maxBytesPerChar()F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v2

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/bugfender/sdk/t2;->a:Ljava/nio/charset/Charset;

    if-ne p3, v1, :cond_3

    :goto_0
    const/4 v1, 0x1

    iput v1, p0, Lcom/bugfender/sdk/d2;->f:I

    const/4 v2, 0x3

    new-array v2, v2, [[B

    const-string v3, "\r\n"

    invoke-virtual {v3, p3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    aput-object v3, v2, v0

    const-string v3, "\n"

    invoke-virtual {v3, p3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    aput-object v3, v2, v1

    const-string v1, "\r"

    invoke-virtual {v1, p3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p3

    const/4 v1, 0x2

    aput-object p3, v2, v1

    iput-object v2, p0, Lcom/bugfender/sdk/d2;->d:[[B

    aget-object p3, v2, v0

    array-length p3, p3

    iput p3, p0, Lcom/bugfender/sdk/d2;->e:I

    new-instance p3, Ljava/io/RandomAccessFile;

    const-string v0, "r"

    invoke-direct {p3, p1, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/bugfender/sdk/d2;->c:Ljava/io/RandomAccessFile;

    invoke-virtual {p3}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v0

    int-to-long v2, p2

    rem-long v4, v0, v2

    long-to-int p1, v4

    if-lez p1, :cond_1

    div-long/2addr v0, v2

    const-wide/16 p2, 0x1

    add-long/2addr v0, p2

    move v8, p1

    move-wide v6, v0

    goto :goto_2

    :cond_1
    div-long v2, v0, v2

    const-wide/16 v4, 0x0

    cmp-long p3, v0, v4

    if-lez p3, :cond_2

    move v8, p2

    goto :goto_1

    :cond_2
    move v8, p1

    :goto_1
    move-wide v6, v2

    :goto_2
    new-instance p1, Lcom/bugfender/sdk/d2$b;

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v4, p1

    move-object v5, p0

    invoke-direct/range {v4 .. v10}, Lcom/bugfender/sdk/d2$b;-><init>(Lcom/bugfender/sdk/d2;JI[BLcom/bugfender/sdk/d2$a;)V

    iput-object p1, p0, Lcom/bugfender/sdk/d2;->g:Lcom/bugfender/sdk/d2$b;

    return-void

    :cond_3
    new-instance p1, Ljava/io/UnsupportedEncodingException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Encoding "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " is not supported yet (feel free to submit a patch)"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/UnsupportedEncodingException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/io/File;Ljava/nio/charset/Charset;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x1000

    invoke-direct {p0, p1, v0, p2}, Lcom/bugfender/sdk/d2;-><init>(Ljava/io/File;ILjava/nio/charset/Charset;)V

    return-void
.end method

.method static synthetic a(Lcom/bugfender/sdk/d2;)I
    .locals 0

    iget p0, p0, Lcom/bugfender/sdk/d2;->a:I

    return p0
.end method

.method static synthetic b(Lcom/bugfender/sdk/d2;)Ljava/io/RandomAccessFile;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/d2;->c:Ljava/io/RandomAccessFile;

    return-object p0
.end method

.method static synthetic c(Lcom/bugfender/sdk/d2;)Ljava/nio/charset/Charset;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/d2;->b:Ljava/nio/charset/Charset;

    return-object p0
.end method

.method static synthetic d(Lcom/bugfender/sdk/d2;)I
    .locals 0

    iget p0, p0, Lcom/bugfender/sdk/d2;->e:I

    return p0
.end method

.method static synthetic e(Lcom/bugfender/sdk/d2;)I
    .locals 0

    iget p0, p0, Lcom/bugfender/sdk/d2;->f:I

    return p0
.end method

.method static synthetic f(Lcom/bugfender/sdk/d2;)[[B
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/d2;->d:[[B

    return-object p0
.end method


# virtual methods
.method public a()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/bugfender/sdk/d2;->c:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public b()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/bugfender/sdk/d2;->g:Lcom/bugfender/sdk/d2$b;

    invoke-static {v0}, Lcom/bugfender/sdk/d2$b;->a(Lcom/bugfender/sdk/d2$b;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/bugfender/sdk/d2;->g:Lcom/bugfender/sdk/d2$b;

    invoke-static {v1}, Lcom/bugfender/sdk/d2$b;->b(Lcom/bugfender/sdk/d2$b;)Lcom/bugfender/sdk/d2$b;

    move-result-object v1

    iput-object v1, p0, Lcom/bugfender/sdk/d2;->g:Lcom/bugfender/sdk/d2$b;

    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/bugfender/sdk/d2$b;->a(Lcom/bugfender/sdk/d2$b;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v1, ""

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/bugfender/sdk/d2;->h:Z

    if-nez v1, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bugfender/sdk/d2;->h:Z

    invoke-virtual {p0}, Lcom/bugfender/sdk/d2;->b()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/bugfender/sdk/d2;->c:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    return-void
.end method
