.class Lcom/bugfender/sdk/j1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bugfender/sdk/h1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bugfender/sdk/j1;->a(Lcom/bugfender/sdk/logcat/LogcatInterceptor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bugfender/sdk/logcat/LogcatInterceptor;

.field final synthetic b:Lcom/bugfender/sdk/j1;


# direct methods
.method constructor <init>(Lcom/bugfender/sdk/j1;Lcom/bugfender/sdk/logcat/LogcatInterceptor;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/j1$a;->b:Lcom/bugfender/sdk/j1;

    iput-object p2, p0, Lcom/bugfender/sdk/j1$a;->a:Lcom/bugfender/sdk/logcat/LogcatInterceptor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/bugfender/sdk/j1$a;->b:Lcom/bugfender/sdk/j1;

    invoke-static {v0}, Lcom/bugfender/sdk/j1;->a(Lcom/bugfender/sdk/j1;)I

    move-result v0

    invoke-static {p1, v0}, Lcom/bugfender/sdk/a3;->a(Ljava/lang/String;I)Lcom/bugfender/sdk/a3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bugfender/sdk/a3;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/bugfender/sdk/j1$a;->b:Lcom/bugfender/sdk/j1;

    iget-object v1, p0, Lcom/bugfender/sdk/j1$a;->a:Lcom/bugfender/sdk/logcat/LogcatInterceptor;

    invoke-static {v0, p1, v1}, Lcom/bugfender/sdk/j1;->a(Lcom/bugfender/sdk/j1;Lcom/bugfender/sdk/a3;Lcom/bugfender/sdk/logcat/LogcatInterceptor;)V
    :try_end_0
    .catch Lcom/bugfender/sdk/s0; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method
