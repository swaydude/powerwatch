.class Lcom/bugfender/sdk/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bugfender/sdk/x1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bugfender/sdk/b;->a(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/bugfender/sdk/b;


# direct methods
.method constructor <init>(Lcom/bugfender/sdk/b;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/b$a;->b:Lcom/bugfender/sdk/b;

    iput-object p2, p0, Lcom/bugfender/sdk/b$a;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/bugfender/sdk/b$a;->b:Lcom/bugfender/sdk/b;

    invoke-static {v0}, Lcom/bugfender/sdk/b;->d(Lcom/bugfender/sdk/b;)Lcom/bugfender/sdk/m1;

    move-result-object v0

    new-instance v1, Lcom/bugfender/sdk/b$a$a;

    invoke-direct {v1, p0, p1}, Lcom/bugfender/sdk/b$a$a;-><init>(Lcom/bugfender/sdk/b$a;Ljava/util/List;)V

    invoke-interface {v0, v1}, Lcom/bugfender/sdk/m1;->a(Ljava/lang/Runnable;)V

    return-void
.end method
