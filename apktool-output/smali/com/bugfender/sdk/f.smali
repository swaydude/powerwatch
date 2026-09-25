.class public Lcom/bugfender/sdk/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/bugfender/sdk/e;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/bugfender/sdk/e;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1, p2, p3}, Lcom/bugfender/sdk/f;->a(Lcom/bugfender/sdk/e;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/bugfender/sdk/f;->a:Lcom/bugfender/sdk/e;

    iput-object p2, p0, Lcom/bugfender/sdk/f;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/bugfender/sdk/f;->c:Ljava/lang/String;

    return-void
.end method

.method private a(Lcom/bugfender/sdk/e;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "Application must be not null"

    invoke-static {p1, v0}, Lcom/bugfender/sdk/w1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "Version name must be not null"

    invoke-static {p2, p1}, Lcom/bugfender/sdk/w1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "Version code must be not null"

    invoke-static {p3, p1}, Lcom/bugfender/sdk/w1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static b(Lcom/bugfender/sdk/e;Ljava/lang/String;Ljava/lang/String;)Lcom/bugfender/sdk/f;
    .locals 1

    new-instance v0, Lcom/bugfender/sdk/f;

    invoke-direct {v0, p0, p1, p2}, Lcom/bugfender/sdk/f;-><init>(Lcom/bugfender/sdk/e;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/bugfender/sdk/e;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/f;->a:Lcom/bugfender/sdk/e;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/f;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/f;->b:Ljava/lang/String;

    return-object v0
.end method
