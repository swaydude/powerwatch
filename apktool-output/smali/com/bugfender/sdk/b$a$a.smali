.class Lcom/bugfender/sdk/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bugfender/sdk/b$a;->a(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/bugfender/sdk/b$a;


# direct methods
.method constructor <init>(Lcom/bugfender/sdk/b$a;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/b$a$a;->b:Lcom/bugfender/sdk/b$a;

    iput-object p2, p0, Lcom/bugfender/sdk/b$a$a;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lcom/bugfender/sdk/b$a$a;->a:Ljava/util/List;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/bugfender/sdk/b$a$a;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    iget-object v3, p0, Lcom/bugfender/sdk/b$a$a;->b:Lcom/bugfender/sdk/b$a;

    iget-object v3, v3, Lcom/bugfender/sdk/b$a;->b:Lcom/bugfender/sdk/b;

    iget-object v4, v3, Lcom/bugfender/sdk/b;->a:Lcom/bugfender/sdk/k1;

    invoke-static {v3}, Lcom/bugfender/sdk/b;->a(Lcom/bugfender/sdk/b;)Z

    move-result v3

    iget-object v5, p0, Lcom/bugfender/sdk/b$a$a;->b:Lcom/bugfender/sdk/b$a;

    iget-object v5, v5, Lcom/bugfender/sdk/b$a;->b:Lcom/bugfender/sdk/b;

    invoke-static {v5}, Lcom/bugfender/sdk/b;->b(Lcom/bugfender/sdk/b;)Z

    move-result v5

    invoke-static {v2, v4, v3, v5}, Lcom/bugfender/sdk/g3;->a(Landroid/view/View;Lcom/bugfender/sdk/k1;ZZ)Lcom/bugfender/sdk/f3;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v3, v2}, Lcom/bugfender/sdk/f3;->a(Landroid/view/View;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/bugfender/sdk/b$a$a;->b:Lcom/bugfender/sdk/b$a;

    iget-object v1, v1, Lcom/bugfender/sdk/b$a;->b:Lcom/bugfender/sdk/b;

    invoke-static {v1}, Lcom/bugfender/sdk/b;->c(Lcom/bugfender/sdk/b;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lcom/bugfender/sdk/b$a$a;->b:Lcom/bugfender/sdk/b$a;

    iget-object v3, v2, Lcom/bugfender/sdk/b$a;->b:Lcom/bugfender/sdk/b;

    iget-object v2, v2, Lcom/bugfender/sdk/b$a;->a:Landroid/app/Activity;

    invoke-static {v3, v2}, Lcom/bugfender/sdk/b;->a(Lcom/bugfender/sdk/b;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method
