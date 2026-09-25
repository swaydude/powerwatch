.class public Lcom/bugfender/sdk/o2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bugfender/sdk/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/x<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/bugfender/sdk/z0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/z0<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final c:Lcom/bugfender/sdk/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/q<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bugfender/sdk/x;Lcom/bugfender/sdk/z0;Lcom/bugfender/sdk/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bugfender/sdk/x<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/bugfender/sdk/z0<",
            "TT;>;",
            "Lcom/bugfender/sdk/q<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bugfender/sdk/o2;->a:Lcom/bugfender/sdk/x;

    iput-object p2, p0, Lcom/bugfender/sdk/o2;->b:Lcom/bugfender/sdk/z0;

    iput-object p3, p0, Lcom/bugfender/sdk/o2;->c:Lcom/bugfender/sdk/q;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/bugfender/sdk/o2;->b:Lcom/bugfender/sdk/z0;

    invoke-virtual {v0}, Lcom/bugfender/sdk/z0;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Float;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bugfender/sdk/o2;->a:Lcom/bugfender/sdk/x;

    iget-object v1, p0, Lcom/bugfender/sdk/o2;->b:Lcom/bugfender/sdk/z0;

    invoke-virtual {v1}, Lcom/bugfender/sdk/z0;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/bugfender/sdk/o2;->b:Lcom/bugfender/sdk/z0;

    invoke-virtual {v2}, Lcom/bugfender/sdk/z0;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-interface {v0, v1, v2}, Lcom/bugfender/sdk/x;->a(Ljava/lang/Object;Ljava/lang/Float;)Z

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/bugfender/sdk/o2;->b:Lcom/bugfender/sdk/z0;

    invoke-virtual {v0}, Lcom/bugfender/sdk/z0;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bugfender/sdk/o2;->a:Lcom/bugfender/sdk/x;

    iget-object v1, p0, Lcom/bugfender/sdk/o2;->b:Lcom/bugfender/sdk/z0;

    invoke-virtual {v1}, Lcom/bugfender/sdk/z0;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/bugfender/sdk/o2;->b:Lcom/bugfender/sdk/z0;

    invoke-virtual {v2}, Lcom/bugfender/sdk/z0;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-interface {v0, v1, v2}, Lcom/bugfender/sdk/x;->a(Ljava/lang/Object;Ljava/lang/Integer;)Z

    move-result v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/bugfender/sdk/o2;->b:Lcom/bugfender/sdk/z0;

    invoke-virtual {v0}, Lcom/bugfender/sdk/z0;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/bugfender/sdk/o2;->a:Lcom/bugfender/sdk/x;

    iget-object v1, p0, Lcom/bugfender/sdk/o2;->b:Lcom/bugfender/sdk/z0;

    invoke-virtual {v1}, Lcom/bugfender/sdk/z0;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/bugfender/sdk/o2;->b:Lcom/bugfender/sdk/z0;

    invoke-virtual {v2}, Lcom/bugfender/sdk/z0;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/bugfender/sdk/x;->a(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/bugfender/sdk/o2;->b:Lcom/bugfender/sdk/z0;

    invoke-virtual {v0}, Lcom/bugfender/sdk/z0;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/bugfender/sdk/o2;->a:Lcom/bugfender/sdk/x;

    iget-object v1, p0, Lcom/bugfender/sdk/o2;->b:Lcom/bugfender/sdk/z0;

    invoke-virtual {v1}, Lcom/bugfender/sdk/z0;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/bugfender/sdk/o2;->b:Lcom/bugfender/sdk/z0;

    invoke-virtual {v2}, Lcom/bugfender/sdk/z0;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-interface {v0, v1, v2}, Lcom/bugfender/sdk/x;->a(Ljava/lang/Object;Ljava/lang/Boolean;)Z

    move-result v0

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/bugfender/sdk/o2;->c:Lcom/bugfender/sdk/q;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/bugfender/sdk/q;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/bugfender/sdk/o2;->c:Lcom/bugfender/sdk/q;

    invoke-interface {v1, v0}, Lcom/bugfender/sdk/q;->a(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
