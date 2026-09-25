.class public interface abstract Lcom/bugfender/sdk/r1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/bugfender/sdk/r1$a;

    invoke-direct {v0}, Lcom/bugfender/sdk/r1$a;-><init>()V

    sput-object v0, Lcom/bugfender/sdk/r1;->a:Ljava/util/Comparator;

    const-string v0, "logs-([\\d]+)\\.json"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/bugfender/sdk/r1;->b:Ljava/util/regex/Pattern;

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/bugfender/sdk/k2;)Lcom/bugfender/sdk/t1;
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
.end method

.method public abstract a()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bugfender/sdk/k2;",
            ">;"
        }
    .end annotation
.end method

.method public abstract a(JLjava/util/Comparator;)Ljava/util/List;
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
.end method

.method public abstract a(JJ)V
.end method

.method public abstract a(J)Z
.end method

.method public abstract a(Ljava/io/File;)Z
.end method

.method public abstract b(Lcom/bugfender/sdk/k2;)Lcom/bugfender/sdk/t1;
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
.end method

.method public abstract b()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bugfender/sdk/k2;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(J)Z
.end method

.method public abstract c()Lcom/bugfender/sdk/k2;
.end method

.method public abstract c(Lcom/bugfender/sdk/k2;)Lcom/bugfender/sdk/t1;
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
.end method

.method public abstract c(J)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d()Lcom/bugfender/sdk/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bugfender/sdk/t1<",
            "Lcom/bugfender/sdk/e1;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d(J)V
.end method

.method public abstract d(Lcom/bugfender/sdk/k2;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bugfender/sdk/i;
        }
    .end annotation
.end method

.method public abstract e()Lcom/bugfender/sdk/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bugfender/sdk/t1<",
            "Lcom/bugfender/sdk/u0;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f()Lcom/bugfender/sdk/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bugfender/sdk/t1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract g()J
.end method
