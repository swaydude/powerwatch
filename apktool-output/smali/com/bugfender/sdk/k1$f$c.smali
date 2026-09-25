.class Lcom/bugfender/sdk/k1$f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bugfender/sdk/k1$f;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bugfender/sdk/k1$f;


# direct methods
.method constructor <init>(Lcom/bugfender/sdk/k1$f;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/k1$f$c;->a:Lcom/bugfender/sdk/k1$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/k1$f$c;->a:Lcom/bugfender/sdk/k1$f;

    iget-object v0, v0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->m(Lcom/bugfender/sdk/k1;)V

    return-void
.end method
