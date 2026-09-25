.class public Lcom/bugfender/sdk/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bugfender/sdk/r1;


# static fields
.field private static final r:Ljava/lang/String; = "session.json"

.field private static final s:Ljava/lang/String; = "bugfender"

.field private static final t:Ljava/lang/String; = "logs"

.field private static final u:Ljava/lang/String; = "issues"

.field private static final v:Ljava/lang/String; = "crashes"


# instance fields
.field private final c:Landroid/content/Context;

.field private final d:Lcom/bugfender/sdk/n2;

.field private final e:Lcom/bugfender/sdk/l2;

.field private final f:Lcom/bugfender/sdk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/a<",
            "Lcom/bugfender/sdk/e1;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/bugfender/sdk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/a<",
            "Ljava/io/File;",
            "Ljava/util/List<",
            "Lcom/bugfender/sdk/e1;",
            ">;>;"
        }
    .end annotation
.end field

.field private final h:Lcom/bugfender/sdk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/a<",
            "Lcom/bugfender/sdk/u0;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lcom/bugfender/sdk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/a<",
            "Ljava/io/File;",
            "Ljava/util/List<",
            "Lcom/bugfender/sdk/u0;",
            ">;>;"
        }
    .end annotation
.end field

.field private final j:Lcom/bugfender/sdk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/a<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Lcom/bugfender/sdk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/a<",
            "Ljava/io/File;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private l:Lcom/bugfender/sdk/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/t1<",
            "Lcom/bugfender/sdk/e1;",
            ">;"
        }
    .end annotation
.end field

.field private m:Lcom/bugfender/sdk/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/t1<",
            "Lcom/bugfender/sdk/u0;",
            ">;"
        }
    .end annotation
.end field

.field private n:Lcom/bugfender/sdk/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/t1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private o:Ljava/io/File;

.field private p:Ljava/io/File;

.field private q:Lcom/bugfender/sdk/c0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bugfender/sdk/n2;Lcom/bugfender/sdk/l2;Lcom/bugfender/sdk/g1;Lcom/bugfender/sdk/f1;Lcom/bugfender/sdk/x0;Lcom/bugfender/sdk/v0;Lcom/bugfender/sdk/c0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/bugfender/sdk/v2;

    invoke-direct {v0}, Lcom/bugfender/sdk/v2;-><init>()V

    iput-object v0, p0, Lcom/bugfender/sdk/s1;->j:Lcom/bugfender/sdk/a;

    new-instance v0, Lcom/bugfender/sdk/u2;

    invoke-direct {v0}, Lcom/bugfender/sdk/u2;-><init>()V

    iput-object v0, p0, Lcom/bugfender/sdk/s1;->k:Lcom/bugfender/sdk/a;

    iput-object p1, p0, Lcom/bugfender/sdk/s1;->c:Landroid/content/Context;

    iput-object p2, p0, Lcom/bugfender/sdk/s1;->d:Lcom/bugfender/sdk/n2;

    iput-object p3, p0, Lcom/bugfender/sdk/s1;->e:Lcom/bugfender/sdk/l2;

    iput-object p4, p0, Lcom/bugfender/sdk/s1;->f:Lcom/bugfender/sdk/a;

    iput-object p5, p0, Lcom/bugfender/sdk/s1;->g:Lcom/bugfender/sdk/a;

    iput-object p6, p0, Lcom/bugfender/sdk/s1;->h:Lcom/bugfender/sdk/a;

    iput-object p7, p0, Lcom/bugfender/sdk/s1;->i:Lcom/bugfender/sdk/a;

    iput-object p8, p0, Lcom/bugfender/sdk/s1;->q:Lcom/bugfender/sdk/c0;

    return-void
.end method

.method private a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " folder inside the session folder: "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " couldn\'t be opened."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Bugfender-SDK"

    invoke-static {p2, p1}, Lcom/bugfender/sdk/d1;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Ljava/io/FileNotFoundException;

    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private a([Ljava/io/File;Ljava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/io/File;",
            "Ljava/util/Comparator<",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    new-instance p2, Lcom/bugfender/sdk/s1$b;

    invoke-direct {p2, p0, p1}, Lcom/bugfender/sdk/s1$b;-><init>(Lcom/bugfender/sdk/s1;[Ljava/io/File;)V

    invoke-static {p1, p2}, Lcom/bugfender/sdk/h0;->a([Ljava/io/File;Lcom/bugfender/sdk/h0$a;)V

    return-void

    :cond_0
    invoke-static {p1, p2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    return-void
.end method

.method private static b(JJ)I
    .locals 1

    cmp-long v0, p0, p2

    if-gez v0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    :goto_0
    return p0
.end method

.method private b(Ljava/io/File;)J
    .locals 6

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v4, p1, v1

    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v4

    goto :goto_1

    :cond_1
    invoke-direct {p0, v4}, Lcom/bugfender/sdk/s1;->b(Ljava/io/File;)J

    move-result-wide v4

    :goto_1
    add-long/2addr v2, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    move-wide v0, v2

    :goto_2
    return-wide v0
.end method

.method private e(J)Ljava/io/File;
    .locals 4

    new-instance v0, Ljava/io/File;

    invoke-direct {p0}, Lcom/bugfender/sdk/s1;->h()Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "session-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private e(Lcom/bugfender/sdk/k2;)Ljava/io/File;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/bugfender/sdk/k2;->f()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/bugfender/sdk/s1;->e(J)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The old session with local-sessionId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/bugfender/sdk/k2;->f()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " couldn\'t be opened."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Bugfender-SDK"

    invoke-static {v0, p1}, Lcom/bugfender/sdk/d1;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/io/FileNotFoundException;

    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private h()Ljava/io/File;
    .locals 3

    iget-object v0, p0, Lcom/bugfender/sdk/s1;->c:Landroid/content/Context;

    const-string v1, "bugfender"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/bugfender/sdk/k2;)Lcom/bugfender/sdk/t1;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bugfender/sdk/k2;",
            ")",
            "Lcom/bugfender/sdk/t1<",
            "Lcom/bugfender/sdk/u0;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bugfender/sdk/u1;
        }
    .end annotation

    :try_start_0
    invoke-direct {p0, p1}, Lcom/bugfender/sdk/s1;->e(Lcom/bugfender/sdk/k2;)Ljava/io/File;

    move-result-object p1

    const-string v0, "issues"

    invoke-direct {p0, p1, v0}, Lcom/bugfender/sdk/s1;->a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    new-instance p1, Lcom/bugfender/sdk/t1;

    iget-object v2, p0, Lcom/bugfender/sdk/s1;->h:Lcom/bugfender/sdk/a;

    iget-object v3, p0, Lcom/bugfender/sdk/s1;->i:Lcom/bugfender/sdk/a;

    const-string v5, "issues"

    iget-object v6, p0, Lcom/bugfender/sdk/s1;->q:Lcom/bugfender/sdk/c0;

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/bugfender/sdk/t1;-><init>(Lcom/bugfender/sdk/a;Lcom/bugfender/sdk/a;Ljava/io/File;Ljava/lang/String;Lcom/bugfender/sdk/c0;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lcom/bugfender/sdk/u1;

    invoke-direct {v0, p1}, Lcom/bugfender/sdk/u1;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public a()Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bugfender/sdk/k2;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/bugfender/sdk/s1;->h()Ljava/io/File;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bugfender/sdk/s1;->c()Lcom/bugfender/sdk/k2;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    new-instance v3, Lcom/bugfender/sdk/s1$c;

    invoke-direct {v3, p0, v0}, Lcom/bugfender/sdk/s1$c;-><init>(Lcom/bugfender/sdk/s1;[Ljava/io/File;)V

    invoke-static {v0, v3}, Lcom/bugfender/sdk/h0;->a([Ljava/io/File;Lcom/bugfender/sdk/h0$a;)V

    array-length v3, v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_3

    aget-object v6, v0, v5

    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/bugfender/sdk/k2;->f()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_2

    invoke-virtual {v6}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v7

    array-length v8, v7

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_2

    aget-object v10, v7, v9

    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v11

    const-string v12, "session.json"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_1

    iget-object v11, p0, Lcom/bugfender/sdk/s1;->e:Lcom/bugfender/sdk/l2;

    invoke-virtual {v11, v10}, Lcom/bugfender/sdk/l2;->a(Ljava/io/File;)Lcom/bugfender/sdk/k2;

    move-result-object v10

    if-eqz v10, :cond_0

    invoke-interface {v2, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_0
    iget-object v10, p0, Lcom/bugfender/sdk/s1;->q:Lcom/bugfender/sdk/c0;

    invoke-static {v6, v10}, Lcom/bugfender/sdk/h0;->a(Ljava/io/File;Lcom/bugfender/sdk/c0;)Z

    :cond_1
    :goto_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    return-object v2
.end method

.method public a(JLjava/util/Comparator;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/Comparator<",
            "Ljava/io/File;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/bugfender/sdk/s1;->e(J)Ljava/io/File;

    move-result-object p1

    new-instance p2, Lcom/bugfender/sdk/s1$a;

    invoke-direct {p2, p0}, Lcom/bugfender/sdk/s1$a;-><init>(Lcom/bugfender/sdk/s1;)V

    invoke-virtual {p1, p2}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object p1

    array-length p2, p1

    if-lez p2, :cond_0

    const/4 p2, 0x0

    aget-object p1, p1, p2

    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Lcom/bugfender/sdk/s1;->a([Ljava/io/File;Ljava/util/Comparator;)V

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public a(JJ)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/bugfender/sdk/s1;->e(J)Ljava/io/File;

    move-result-object p1

    new-instance p2, Ljava/io/File;

    const-string v0, "session.json"

    invoke-direct {p2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/bugfender/sdk/s1;->e:Lcom/bugfender/sdk/l2;

    invoke-virtual {p1, p2}, Lcom/bugfender/sdk/l2;->a(Ljava/io/File;)Lcom/bugfender/sdk/k2;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Lcom/bugfender/sdk/k2;->a(J)V

    iget-object p3, p0, Lcom/bugfender/sdk/s1;->d:Lcom/bugfender/sdk/n2;

    invoke-virtual {p3, p1}, Lcom/bugfender/sdk/n2;->a(Lcom/bugfender/sdk/k2;)Ljava/lang/String;

    move-result-object p1

    iget-object p3, p0, Lcom/bugfender/sdk/s1;->q:Lcom/bugfender/sdk/c0;

    invoke-static {p2, p1, p3}, Lcom/bugfender/sdk/h0;->b(Ljava/io/File;Ljava/lang/String;Lcom/bugfender/sdk/c0;)V

    return-void
.end method

.method public a(J)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/bugfender/sdk/s1;->e(J)Ljava/io/File;

    move-result-object p1

    iget-object p2, p0, Lcom/bugfender/sdk/s1;->q:Lcom/bugfender/sdk/c0;

    invoke-static {p1, p2}, Lcom/bugfender/sdk/h0;->a(Ljava/io/File;Lcom/bugfender/sdk/c0;)Z

    move-result p1

    return p1
.end method

.method public a(Ljava/io/File;)Z
    .locals 3

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Lcom/bugfender/sdk/s1;->q:Lcom/bugfender/sdk/c0;

    invoke-virtual {v2, v0, v1}, Lcom/bugfender/sdk/c0;->c(J)V

    :cond_0
    return p1
.end method

.method public b(Lcom/bugfender/sdk/k2;)Lcom/bugfender/sdk/t1;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bugfender/sdk/k2;",
            ")",
            "Lcom/bugfender/sdk/t1<",
            "Lcom/bugfender/sdk/e1;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bugfender/sdk/u1;
        }
    .end annotation

    :try_start_0
    invoke-direct {p0, p1}, Lcom/bugfender/sdk/s1;->e(Lcom/bugfender/sdk/k2;)Ljava/io/File;

    move-result-object p1

    const-string v0, "logs"

    invoke-direct {p0, p1, v0}, Lcom/bugfender/sdk/s1;->a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    new-instance p1, Lcom/bugfender/sdk/t1;

    iget-object v2, p0, Lcom/bugfender/sdk/s1;->f:Lcom/bugfender/sdk/a;

    iget-object v3, p0, Lcom/bugfender/sdk/s1;->g:Lcom/bugfender/sdk/a;

    const-string v5, "logs"

    iget-object v6, p0, Lcom/bugfender/sdk/s1;->q:Lcom/bugfender/sdk/c0;

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/bugfender/sdk/t1;-><init>(Lcom/bugfender/sdk/a;Lcom/bugfender/sdk/a;Ljava/io/File;Ljava/lang/String;Lcom/bugfender/sdk/c0;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lcom/bugfender/sdk/u1;

    invoke-direct {v0, p1}, Lcom/bugfender/sdk/u1;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public b()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bugfender/sdk/k2;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/bugfender/sdk/s1;->c()Lcom/bugfender/sdk/k2;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bugfender/sdk/s1;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v1, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-object v1
.end method

.method public b(J)Z
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/bugfender/sdk/s1;->e(J)Ljava/io/File;

    move-result-object p1

    new-instance p2, Ljava/io/File;

    const-string v0, "crashes"

    invoke-direct {p2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/bugfender/sdk/s1;->q:Lcom/bugfender/sdk/c0;

    invoke-static {p2, p1}, Lcom/bugfender/sdk/h0;->b(Ljava/io/File;Lcom/bugfender/sdk/c0;)Z

    move-result p1

    return p1
.end method

.method public c()Lcom/bugfender/sdk/k2;
    .locals 3

    iget-object v0, p0, Lcom/bugfender/sdk/s1;->p:Ljava/io/File;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/bugfender/sdk/s1;->o:Ljava/io/File;

    const-string v2, "session.json"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/bugfender/sdk/s1;->p:Ljava/io/File;

    :cond_0
    iget-object v0, p0, Lcom/bugfender/sdk/s1;->e:Lcom/bugfender/sdk/l2;

    iget-object v1, p0, Lcom/bugfender/sdk/s1;->p:Ljava/io/File;

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/l2;->a(Ljava/io/File;)Lcom/bugfender/sdk/k2;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/bugfender/sdk/k2;)Lcom/bugfender/sdk/t1;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bugfender/sdk/k2;",
            ")",
            "Lcom/bugfender/sdk/t1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bugfender/sdk/u1;
        }
    .end annotation

    :try_start_0
    invoke-direct {p0, p1}, Lcom/bugfender/sdk/s1;->e(Lcom/bugfender/sdk/k2;)Ljava/io/File;

    move-result-object p1

    const-string v0, "crashes"

    invoke-direct {p0, p1, v0}, Lcom/bugfender/sdk/s1;->a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    new-instance p1, Lcom/bugfender/sdk/t1;

    iget-object v2, p0, Lcom/bugfender/sdk/s1;->j:Lcom/bugfender/sdk/a;

    iget-object v3, p0, Lcom/bugfender/sdk/s1;->k:Lcom/bugfender/sdk/a;

    const-string v5, "crashes"

    iget-object v6, p0, Lcom/bugfender/sdk/s1;->q:Lcom/bugfender/sdk/c0;

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/bugfender/sdk/t1;-><init>(Lcom/bugfender/sdk/a;Lcom/bugfender/sdk/a;Ljava/io/File;Ljava/lang/String;Lcom/bugfender/sdk/c0;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lcom/bugfender/sdk/u1;

    invoke-direct {v0, p1}, Lcom/bugfender/sdk/u1;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public c(J)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/bugfender/sdk/s1;->a(JLjava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public d()Lcom/bugfender/sdk/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bugfender/sdk/t1<",
            "Lcom/bugfender/sdk/e1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bugfender/sdk/s1;->l:Lcom/bugfender/sdk/t1;

    return-object v0
.end method

.method public d(J)V
    .locals 1

    invoke-virtual {p0}, Lcom/bugfender/sdk/s1;->c()Lcom/bugfender/sdk/k2;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/bugfender/sdk/k2;->a(J)V

    iget-object p1, p0, Lcom/bugfender/sdk/s1;->p:Ljava/io/File;

    iget-object p2, p0, Lcom/bugfender/sdk/s1;->d:Lcom/bugfender/sdk/n2;

    invoke-virtual {p2, v0}, Lcom/bugfender/sdk/n2;->a(Lcom/bugfender/sdk/k2;)Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/bugfender/sdk/s1;->q:Lcom/bugfender/sdk/c0;

    invoke-static {p1, p2, v0}, Lcom/bugfender/sdk/h0;->b(Ljava/io/File;Ljava/lang/String;Lcom/bugfender/sdk/c0;)V

    return-void
.end method

.method public d(Lcom/bugfender/sdk/k2;)V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bugfender/sdk/i;
        }
    .end annotation

    invoke-direct {p0}, Lcom/bugfender/sdk/s1;->h()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "session-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/bugfender/sdk/k2;->f()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/bugfender/sdk/s1;->o:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->mkdir()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/bugfender/sdk/s1;->o:Ljava/io/File;

    const-string v2, "session.json"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/bugfender/sdk/s1;->p:Ljava/io/File;

    iget-object v0, p0, Lcom/bugfender/sdk/s1;->d:Lcom/bugfender/sdk/n2;

    invoke-virtual {v0, p1}, Lcom/bugfender/sdk/n2;->a(Lcom/bugfender/sdk/k2;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/bugfender/sdk/s1;->p:Ljava/io/File;

    iget-object v1, p0, Lcom/bugfender/sdk/s1;->q:Lcom/bugfender/sdk/c0;

    invoke-static {v0, p1, v1}, Lcom/bugfender/sdk/h0;->a(Ljava/io/File;Ljava/lang/String;Lcom/bugfender/sdk/c0;)V

    new-instance v5, Ljava/io/File;

    iget-object p1, p0, Lcom/bugfender/sdk/s1;->o:Ljava/io/File;

    const-string v0, "logs"

    invoke-direct {v5, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->mkdir()Z

    move-result p1

    const-string v0, "Session folder: "

    if-eqz p1, :cond_2

    new-instance p1, Lcom/bugfender/sdk/t1;

    iget-object v3, p0, Lcom/bugfender/sdk/s1;->f:Lcom/bugfender/sdk/a;

    iget-object v4, p0, Lcom/bugfender/sdk/s1;->g:Lcom/bugfender/sdk/a;

    iget-object v7, p0, Lcom/bugfender/sdk/s1;->q:Lcom/bugfender/sdk/c0;

    const-string v6, "logs"

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Lcom/bugfender/sdk/t1;-><init>(Lcom/bugfender/sdk/a;Lcom/bugfender/sdk/a;Ljava/io/File;Ljava/lang/String;Lcom/bugfender/sdk/c0;)V

    iput-object p1, p0, Lcom/bugfender/sdk/s1;->l:Lcom/bugfender/sdk/t1;

    new-instance v11, Ljava/io/File;

    iget-object p1, p0, Lcom/bugfender/sdk/s1;->o:Ljava/io/File;

    const-string v1, "issues"

    invoke-direct {v11, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v11}, Ljava/io/File;->mkdir()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lcom/bugfender/sdk/t1;

    iget-object v9, p0, Lcom/bugfender/sdk/s1;->h:Lcom/bugfender/sdk/a;

    iget-object v10, p0, Lcom/bugfender/sdk/s1;->i:Lcom/bugfender/sdk/a;

    iget-object v13, p0, Lcom/bugfender/sdk/s1;->q:Lcom/bugfender/sdk/c0;

    const-string v12, "issues"

    move-object v8, p1

    invoke-direct/range {v8 .. v13}, Lcom/bugfender/sdk/t1;-><init>(Lcom/bugfender/sdk/a;Lcom/bugfender/sdk/a;Ljava/io/File;Ljava/lang/String;Lcom/bugfender/sdk/c0;)V

    iput-object p1, p0, Lcom/bugfender/sdk/s1;->m:Lcom/bugfender/sdk/t1;

    new-instance v3, Ljava/io/File;

    iget-object p1, p0, Lcom/bugfender/sdk/s1;->o:Ljava/io/File;

    const-string v0, "crashes"

    invoke-direct {v3, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->mkdir()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lcom/bugfender/sdk/t1;

    iget-object v1, p0, Lcom/bugfender/sdk/s1;->j:Lcom/bugfender/sdk/a;

    iget-object v2, p0, Lcom/bugfender/sdk/s1;->k:Lcom/bugfender/sdk/a;

    iget-object v5, p0, Lcom/bugfender/sdk/s1;->q:Lcom/bugfender/sdk/c0;

    const-string v4, "crashes"

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/bugfender/sdk/t1;-><init>(Lcom/bugfender/sdk/a;Lcom/bugfender/sdk/a;Ljava/io/File;Ljava/lang/String;Lcom/bugfender/sdk/c0;)V

    iput-object p1, p0, Lcom/bugfender/sdk/s1;->n:Lcom/bugfender/sdk/t1;

    return-void

    :cond_0
    new-instance p1, Lcom/bugfender/sdk/i;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Crashes folder: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " couldn\'t create the crashes folder."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/bugfender/sdk/i;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Lcom/bugfender/sdk/i;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/bugfender/sdk/s1;->o:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " couldn\'t create the issue folder."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/bugfender/sdk/i;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Lcom/bugfender/sdk/i;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/bugfender/sdk/s1;->o:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " couldn\'t create the log folder."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/bugfender/sdk/i;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Lcom/bugfender/sdk/i;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Session with name: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " couldn\'t create the session folder."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/bugfender/sdk/i;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Lcom/bugfender/sdk/i;

    const-string v0, "Bugfender folder doesn\'t exist and it couldn\'t be created"

    invoke-direct {p1, v0}, Lcom/bugfender/sdk/i;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e()Lcom/bugfender/sdk/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bugfender/sdk/t1<",
            "Lcom/bugfender/sdk/u0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bugfender/sdk/s1;->m:Lcom/bugfender/sdk/t1;

    return-object v0
.end method

.method public f()Lcom/bugfender/sdk/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bugfender/sdk/t1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bugfender/sdk/s1;->n:Lcom/bugfender/sdk/t1;

    return-object v0
.end method

.method public g()J
    .locals 4

    iget-object v0, p0, Lcom/bugfender/sdk/s1;->q:Lcom/bugfender/sdk/c0;

    invoke-virtual {v0}, Lcom/bugfender/sdk/c0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/bugfender/sdk/s1;->h()Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/s1;->q:Lcom/bugfender/sdk/c0;

    invoke-direct {p0, v0}, Lcom/bugfender/sdk/s1;->b(Ljava/io/File;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/bugfender/sdk/c0;->b(J)V

    :cond_0
    iget-object v0, p0, Lcom/bugfender/sdk/s1;->q:Lcom/bugfender/sdk/c0;

    invoke-virtual {v0}, Lcom/bugfender/sdk/c0;->a()J

    move-result-wide v0

    return-wide v0
.end method
