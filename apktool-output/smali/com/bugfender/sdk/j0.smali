.class public Lcom/bugfender/sdk/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/bugfender/sdk/e3;
    .locals 2

    new-instance v0, Lcom/bugfender/sdk/e3;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p2, "https://dashboard.bugfender.com"

    :cond_0
    invoke-direct {v0, p1, p2}, Lcom/bugfender/sdk/e3;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public a(Lcom/bugfender/sdk/g1;)Lcom/bugfender/sdk/f1;
    .locals 1

    new-instance v0, Lcom/bugfender/sdk/f1;

    invoke-direct {v0, p1}, Lcom/bugfender/sdk/f1;-><init>(Lcom/bugfender/sdk/g1;)V

    return-object v0
.end method

.method public a(Lcom/bugfender/sdk/n2;)Lcom/bugfender/sdk/l2;
    .locals 1

    new-instance v0, Lcom/bugfender/sdk/l2;

    invoke-direct {v0, p1}, Lcom/bugfender/sdk/l2;-><init>(Lcom/bugfender/sdk/a;)V

    return-object v0
.end method

.method public a(Landroid/content/Context;Lcom/bugfender/sdk/g1;Lcom/bugfender/sdk/f1;Lcom/bugfender/sdk/n2;Lcom/bugfender/sdk/l2;Lcom/bugfender/sdk/x0;Lcom/bugfender/sdk/v0;Lcom/bugfender/sdk/c0;)Lcom/bugfender/sdk/r1;
    .locals 10

    new-instance v9, Lcom/bugfender/sdk/s1;

    move-object v0, v9

    move-object v1, p1

    move-object v2, p4

    move-object v3, p5

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/bugfender/sdk/s1;-><init>(Landroid/content/Context;Lcom/bugfender/sdk/n2;Lcom/bugfender/sdk/l2;Lcom/bugfender/sdk/g1;Lcom/bugfender/sdk/f1;Lcom/bugfender/sdk/x0;Lcom/bugfender/sdk/v0;Lcom/bugfender/sdk/c0;)V

    return-object v9
.end method

.method public a(Lcom/bugfender/sdk/x0;)Lcom/bugfender/sdk/v0;
    .locals 1

    new-instance v0, Lcom/bugfender/sdk/v0;

    invoke-direct {v0, p1}, Lcom/bugfender/sdk/v0;-><init>(Lcom/bugfender/sdk/x0;)V

    return-object v0
.end method

.method public a()Lcom/bugfender/sdk/x0;
    .locals 1

    new-instance v0, Lcom/bugfender/sdk/x0;

    invoke-direct {v0}, Lcom/bugfender/sdk/x0;-><init>()V

    return-object v0
.end method

.method public a(Landroid/content/Context;Lcom/bugfender/sdk/z1;Landroid/content/SharedPreferences;)Lcom/bugfender/sdk/x2;
    .locals 1

    new-instance v0, Lcom/bugfender/sdk/y2;

    invoke-direct {v0, p1, p2, p3}, Lcom/bugfender/sdk/y2;-><init>(Landroid/content/Context;Lcom/bugfender/sdk/z1;Landroid/content/SharedPreferences;)V

    return-object v0
.end method

.method public a(Landroid/content/Context;)Lcom/bugfender/sdk/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lcom/bugfender/sdk/x<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/bugfender/sdk/p2;

    invoke-direct {v0, p1}, Lcom/bugfender/sdk/p2;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public b()Lcom/bugfender/sdk/g1;
    .locals 1

    new-instance v0, Lcom/bugfender/sdk/g1;

    invoke-direct {v0}, Lcom/bugfender/sdk/g1;-><init>()V

    return-object v0
.end method

.method public b(Landroid/content/Context;)Lcom/bugfender/sdk/z1;
    .locals 1

    new-instance v0, Lcom/bugfender/sdk/z1;

    invoke-direct {v0, p1}, Lcom/bugfender/sdk/z1;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public c(Landroid/content/Context;)Lcom/bugfender/sdk/a2;
    .locals 1

    new-instance v0, Lcom/bugfender/sdk/b2;

    invoke-direct {v0, p1}, Lcom/bugfender/sdk/b2;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public c()Lcom/bugfender/sdk/m1;
    .locals 1

    new-instance v0, Lcom/bugfender/sdk/n1;

    invoke-direct {v0}, Lcom/bugfender/sdk/n1;-><init>()V

    return-object v0
.end method

.method public d(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2

    const-string v0, "bugfender.preferences"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    return-object p1
.end method

.method public d()Lcom/bugfender/sdk/c0;
    .locals 1

    new-instance v0, Lcom/bugfender/sdk/c0;

    invoke-direct {v0}, Lcom/bugfender/sdk/c0;-><init>()V

    return-object v0
.end method

.method public e()Lcom/bugfender/sdk/n2;
    .locals 1

    new-instance v0, Lcom/bugfender/sdk/n2;

    invoke-direct {v0}, Lcom/bugfender/sdk/n2;-><init>()V

    return-object v0
.end method
