.class public Lcom/bugfender/sdk/t1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bugfender/sdk/t1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static i:I = 0x10000

.field private static final j:I = 0x1


# instance fields
.field private final a:Ljava/io/File;

.field private final b:Ljava/lang/String;

.field private c:Ljava/io/File;

.field private d:Ljava/io/PrintWriter;

.field private final e:Lcom/bugfender/sdk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/a<",
            "TT;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/bugfender/sdk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/a<",
            "Ljava/io/File;",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private g:I

.field private final h:Lcom/bugfender/sdk/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/bugfender/sdk/a;Lcom/bugfender/sdk/a;Ljava/io/File;Ljava/lang/String;Lcom/bugfender/sdk/c0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bugfender/sdk/a<",
            "TT;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/bugfender/sdk/a<",
            "Ljava/io/File;",
            "Ljava/util/List<",
            "TT;>;>;",
            "Ljava/io/File;",
            "Ljava/lang/String;",
            "Lcom/bugfender/sdk/c0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/bugfender/sdk/t1;->g:I

    iput-object p1, p0, Lcom/bugfender/sdk/t1;->e:Lcom/bugfender/sdk/a;

    iput-object p2, p0, Lcom/bugfender/sdk/t1;->f:Lcom/bugfender/sdk/a;

    iput-object p3, p0, Lcom/bugfender/sdk/t1;->a:Ljava/io/File;

    iput-object p4, p0, Lcom/bugfender/sdk/t1;->b:Ljava/lang/String;

    iput-object p5, p0, Lcom/bugfender/sdk/t1;->h:Lcom/bugfender/sdk/c0;

    return-void
.end method

.method private a(Ljava/io/File;Ljava/lang/String;I)Lcom/bugfender/sdk/e0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/lang/String;",
            "I)",
            "Lcom/bugfender/sdk/e0<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    if-eqz p1, :cond_1

    new-instance v2, Lcom/bugfender/sdk/t1$a;

    invoke-direct {v2, p0, p2}, Lcom/bugfender/sdk/t1$a;-><init>(Lcom/bugfender/sdk/t1;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object p1

    new-instance p2, Lcom/bugfender/sdk/t1$b;

    invoke-direct {p2, p1}, Lcom/bugfender/sdk/t1$b;-><init>([Ljava/io/File;)V

    invoke-static {p1, p2}, Lcom/bugfender/sdk/h0;->a([Ljava/io/File;Lcom/bugfender/sdk/h0$a;)V

    if-nez p3, :cond_0

    const p3, 0x7fffffff

    :cond_0
    const/4 p2, 0x0

    :goto_0
    array-length v2, p1

    if-ge p2, v2, :cond_1

    if-ge p2, p3, :cond_1

    aget-object v2, p1, p2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, Lcom/bugfender/sdk/t1;->f:Lcom/bugfender/sdk/a;

    invoke-interface {v3, v2}, Lcom/bugfender/sdk/a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/bugfender/sdk/e0;

    invoke-direct {p1, v0, v1}, Lcom/bugfender/sdk/e0;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p1
.end method

.method private a(Ljava/lang/String;Ljava/io/File;)Z
    .locals 3

    invoke-virtual {p2}, Ljava/io/File;->length()J

    move-result-wide v0

    invoke-static {p1}, Lcom/bugfender/sdk/r2;->b(Ljava/lang/String;)I

    move-result p1

    int-to-long p1, p1

    add-long/2addr v0, p1

    sget p1, Lcom/bugfender/sdk/t1;->i:I

    int-to-long p1, p1

    cmp-long v2, v0, p1

    if-gtz v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private a(Z)Z
    .locals 3

    xor-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget v2, p0, Lcom/bugfender/sdk/t1;->g:I

    if-lez v2, :cond_0

    const/4 p1, 0x0

    iput p1, p0, Lcom/bugfender/sdk/t1;->g:I

    return v1

    :cond_0
    iget v2, p0, Lcom/bugfender/sdk/t1;->g:I

    if-le v2, v1, :cond_1

    return v1

    :cond_1
    if-eqz p1, :cond_2

    add-int/2addr v2, v1

    iput v2, p0, Lcom/bugfender/sdk/t1;->g:I

    :cond_2
    return v0
.end method


# virtual methods
.method public a(I)Lcom/bugfender/sdk/e0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/bugfender/sdk/e0<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bugfender/sdk/t1;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/bugfender/sdk/t1;->a:Ljava/io/File;

    invoke-direct {p0, v1, v0, p1}, Lcom/bugfender/sdk/t1;->a(Ljava/io/File;Ljava/lang/String;I)Lcom/bugfender/sdk/e0;

    move-result-object p1

    return-object p1
.end method

.method public a()Z
    .locals 8

    iget-object v0, p0, Lcom/bugfender/sdk/t1;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v5

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v7, p0, Lcom/bugfender/sdk/t1;->h:Lcom/bugfender/sdk/c0;

    invoke-virtual {v7, v5, v6}, Lcom/bugfender/sdk/c0;->c(J)V

    :cond_0
    and-int/2addr v2, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public a(Ljava/io/File;)Z
    .locals 3

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Lcom/bugfender/sdk/t1;->h:Lcom/bugfender/sdk/c0;

    invoke-virtual {v2, v0, v1}, Lcom/bugfender/sdk/c0;->c(J)V

    :cond_0
    return p1
.end method

.method public a(Ljava/lang/Object;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/bugfender/sdk/t1;->e:Lcom/bugfender/sdk/a;

    invoke-interface {v0, p1}, Lcom/bugfender/sdk/a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lcom/bugfender/sdk/t1;->c:Ljava/io/File;

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, v0}, Lcom/bugfender/sdk/t1;->a(Ljava/lang/String;Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/bugfender/sdk/t1;->d()Z

    :cond_0
    iget-object v0, p0, Lcom/bugfender/sdk/t1;->c:Ljava/io/File;

    if-nez v0, :cond_1

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/bugfender/sdk/t1;->a:Ljava/io/File;

    iget-object v2, p0, Lcom/bugfender/sdk/t1;->b:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/bugfender/sdk/t1;->c:Ljava/io/File;

    :cond_1
    iget-object v0, p0, Lcom/bugfender/sdk/t1;->d:Ljava/io/PrintWriter;

    if-nez v0, :cond_2

    new-instance v0, Ljava/io/PrintWriter;

    iget-object v1, p0, Lcom/bugfender/sdk/t1;->c:Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/File;)V

    iput-object v0, p0, Lcom/bugfender/sdk/t1;->d:Ljava/io/PrintWriter;

    :cond_2
    iget-object v0, p0, Lcom/bugfender/sdk/t1;->d:Ljava/io/PrintWriter;

    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/bugfender/sdk/t1;->d:Ljava/io/PrintWriter;

    invoke-virtual {v0}, Ljava/io/PrintWriter;->flush()V

    iget-object v0, p0, Lcom/bugfender/sdk/t1;->d:Ljava/io/PrintWriter;

    invoke-virtual {v0}, Ljava/io/PrintWriter;->checkError()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v1, p0, Lcom/bugfender/sdk/t1;->h:Lcom/bugfender/sdk/c0;

    invoke-static {p1}, Lcom/bugfender/sdk/r2;->b(Ljava/lang/String;)I

    move-result p1

    int-to-long v2, p1

    invoke-virtual {v1, v2, v3}, Lcom/bugfender/sdk/c0;->a(J)V

    :cond_3
    invoke-direct {p0, v0}, Lcom/bugfender/sdk/t1;->a(Z)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/t1;->a(Z)Z

    move-result p1

    return p1
.end method

.method public a(Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v2

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v4, p0, Lcom/bugfender/sdk/t1;->h:Lcom/bugfender/sdk/c0;

    invoke-virtual {v4, v2, v3}, Lcom/bugfender/sdk/c0;->c(J)V

    :cond_0
    and-int/2addr v0, v1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public b()Lcom/bugfender/sdk/e0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bugfender/sdk/e0<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/bugfender/sdk/t1;->a(I)Lcom/bugfender/sdk/e0;

    move-result-object v0

    return-object v0
.end method

.method public b(I)Lcom/bugfender/sdk/e0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/bugfender/sdk/e0<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/bugfender/sdk/t1;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/t1;->a:Ljava/io/File;

    invoke-direct {p0, v1, v0, p1}, Lcom/bugfender/sdk/t1;->a(Ljava/io/File;Ljava/lang/String;I)Lcom/bugfender/sdk/e0;

    move-result-object p1

    return-object p1
.end method

.method public c()Lcom/bugfender/sdk/e0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bugfender/sdk/e0<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/bugfender/sdk/t1;->b(I)Lcom/bugfender/sdk/e0;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 7

    iget-object v0, p0, Lcom/bugfender/sdk/t1;->d:Ljava/io/PrintWriter;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/PrintWriter;->close()V

    :cond_0
    iget-object v0, p0, Lcom/bugfender/sdk/t1;->c:Ljava/io/File;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/bugfender/sdk/t1;->a:Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/bugfender/sdk/t1;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ".json"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/bugfender/sdk/t1;->c:Ljava/io/File;

    invoke-virtual {v1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/bugfender/sdk/t1;->c:Ljava/io/File;

    iput-object v2, p0, Lcom/bugfender/sdk/t1;->d:Ljava/io/PrintWriter;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_1
    return v1

    :cond_2
    const/4 v0, 0x0

    return v0
.end method
