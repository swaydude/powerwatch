.class public Lcom/bugfender/sdk/l2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bugfender/sdk/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bugfender/sdk/a<",
        "Ljava/io/File;",
        "Lcom/bugfender/sdk/k2;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lcom/bugfender/sdk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/a<",
            "Lcom/bugfender/sdk/k2;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bugfender/sdk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bugfender/sdk/a<",
            "Lcom/bugfender/sdk/k2;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bugfender/sdk/l2;->a:Lcom/bugfender/sdk/a;

    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;)Lcom/bugfender/sdk/k2;
    .locals 1

    :try_start_0
    invoke-static {p1}, Lcom/bugfender/sdk/h0;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/bugfender/sdk/l2;->a:Lcom/bugfender/sdk/a;

    invoke-interface {v0, p1}, Lcom/bugfender/sdk/a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bugfender/sdk/k2;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public a(Lcom/bugfender/sdk/k2;)Ljava/io/File;
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "from(Session value) not supported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/bugfender/sdk/k2;

    invoke-virtual {p0, p1}, Lcom/bugfender/sdk/l2;->a(Lcom/bugfender/sdk/k2;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/bugfender/sdk/l2;->a(Ljava/io/File;)Lcom/bugfender/sdk/k2;

    move-result-object p1

    return-object p1
.end method
