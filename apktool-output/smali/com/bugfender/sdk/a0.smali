.class public Lcom/bugfender/sdk/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Lcom/bugfender/sdk/o1;

.field private b:Lcom/bugfender/sdk/w;

.field private final c:Lcom/bugfender/sdk/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/x<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/bugfender/sdk/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/q<",
            "Lcom/bugfender/sdk/y;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bugfender/sdk/o1;Lcom/bugfender/sdk/w;Lcom/bugfender/sdk/x;Lcom/bugfender/sdk/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bugfender/sdk/o1;",
            "Lcom/bugfender/sdk/w;",
            "Lcom/bugfender/sdk/x<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/bugfender/sdk/q<",
            "Lcom/bugfender/sdk/y;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bugfender/sdk/a0;->a:Lcom/bugfender/sdk/o1;

    iput-object p2, p0, Lcom/bugfender/sdk/a0;->b:Lcom/bugfender/sdk/w;

    iput-object p3, p0, Lcom/bugfender/sdk/a0;->c:Lcom/bugfender/sdk/x;

    iput-object p4, p0, Lcom/bugfender/sdk/a0;->d:Lcom/bugfender/sdk/q;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lcom/bugfender/sdk/a0;->a:Lcom/bugfender/sdk/o1;

    iget-object v1, p0, Lcom/bugfender/sdk/a0;->b:Lcom/bugfender/sdk/w;

    invoke-virtual {v1}, Lcom/bugfender/sdk/w;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/bugfender/sdk/a0;->b:Lcom/bugfender/sdk/w;

    iget-object v3, p0, Lcom/bugfender/sdk/a0;->c:Lcom/bugfender/sdk/x;

    const/4 v4, 0x1

    invoke-interface {v3, v4}, Lcom/bugfender/sdk/x;->a(Z)Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/bugfender/sdk/o1;->a(Ljava/lang/String;Lcom/bugfender/sdk/w;Ljava/util/Map;)Lcom/bugfender/sdk/y;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/a0;->d:Lcom/bugfender/sdk/q;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lcom/bugfender/sdk/q;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/bugfender/sdk/h; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/bugfender/sdk/a0;->d:Lcom/bugfender/sdk/q;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lcom/bugfender/sdk/q;->a(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method
