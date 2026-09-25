.class public Lcom/bugfender/sdk/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bugfender/sdk/p0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bugfender/sdk/p0<",
        "Lcom/bugfender/sdk/e1;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bugfender/sdk/r1;


# direct methods
.method public constructor <init>(Lcom/bugfender/sdk/r1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bugfender/sdk/n0;->a:Lcom/bugfender/sdk/r1;

    return-void
.end method


# virtual methods
.method public a()Lcom/bugfender/sdk/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bugfender/sdk/t1<",
            "Lcom/bugfender/sdk/e1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bugfender/sdk/n0;->a:Lcom/bugfender/sdk/r1;

    invoke-interface {v0}, Lcom/bugfender/sdk/r1;->d()Lcom/bugfender/sdk/t1;

    move-result-object v0

    return-object v0
.end method
