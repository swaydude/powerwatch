.class public abstract Lcom/bugfender/sdk/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bugfender/sdk/f3;


# static fields
.field public static final d:Ljava/lang/String; = "Interaction"


# instance fields
.field private final a:Z

.field private final b:Z

.field private c:Lcom/bugfender/sdk/k1;


# direct methods
.method public constructor <init>(Lcom/bugfender/sdk/k1;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bugfender/sdk/n;->c:Lcom/bugfender/sdk/k1;

    iput-boolean p2, p0, Lcom/bugfender/sdk/n;->a:Z

    iput-boolean p3, p0, Lcom/bugfender/sdk/n;->b:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bugfender/sdk/n;->c:Lcom/bugfender/sdk/k1;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lcom/bugfender/sdk/n;->c()Z

    move-result v0

    const-string v1, "Interaction"

    if-eqz v0, :cond_0

    invoke-static {v1, p1}, Lcom/bugfender/sdk/d1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, Lcom/bugfender/sdk/n;->b:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/bugfender/sdk/n;->b()Lcom/bugfender/sdk/k1;

    move-result-object v0

    invoke-virtual {v0, v1, p1}, Lcom/bugfender/sdk/k1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public b()Lcom/bugfender/sdk/k1;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/n;->c:Lcom/bugfender/sdk/k1;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bugfender/sdk/n;->a:Z

    return v0
.end method
