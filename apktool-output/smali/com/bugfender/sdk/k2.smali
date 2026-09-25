.class public Lcom/bugfender/sdk/k2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bugfender/sdk/k2$a;
    }
.end annotation


# instance fields
.field private a:Lcom/bugfender/sdk/w;

.field private b:Lcom/bugfender/sdk/f;

.field private c:F

.field private d:J

.field private e:Ljava/util/Date;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:J

.field private j:J

.field private k:I

.field private l:Ljava/lang/String;

.field private m:J

.field private n:J

.field private o:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/bugfender/sdk/w;Lcom/bugfender/sdk/f;FJLjava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;JJLjava/lang/String;)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lcom/bugfender/sdk/k2;->a:Lcom/bugfender/sdk/w;

    move-object v1, p2

    iput-object v1, v0, Lcom/bugfender/sdk/k2;->b:Lcom/bugfender/sdk/f;

    move v1, p3

    iput v1, v0, Lcom/bugfender/sdk/k2;->c:F

    move-wide v1, p4

    iput-wide v1, v0, Lcom/bugfender/sdk/k2;->d:J

    move-object v1, p6

    iput-object v1, v0, Lcom/bugfender/sdk/k2;->e:Ljava/util/Date;

    move-object v1, p7

    iput-object v1, v0, Lcom/bugfender/sdk/k2;->f:Ljava/lang/String;

    move-object v1, p8

    iput-object v1, v0, Lcom/bugfender/sdk/k2;->g:Ljava/lang/String;

    move-object v1, p9

    iput-object v1, v0, Lcom/bugfender/sdk/k2;->h:Ljava/lang/String;

    move-wide v1, p10

    iput-wide v1, v0, Lcom/bugfender/sdk/k2;->i:J

    move-wide v1, p12

    iput-wide v1, v0, Lcom/bugfender/sdk/k2;->j:J

    move/from16 v1, p14

    iput v1, v0, Lcom/bugfender/sdk/k2;->k:I

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/bugfender/sdk/k2;->l:Ljava/lang/String;

    move-wide/from16 v1, p16

    iput-wide v1, v0, Lcom/bugfender/sdk/k2;->m:J

    move-wide/from16 v1, p18

    iput-wide v1, v0, Lcom/bugfender/sdk/k2;->n:J

    move-object/from16 v1, p20

    iput-object v1, v0, Lcom/bugfender/sdk/k2;->o:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/bugfender/sdk/f;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/k2;->b:Lcom/bugfender/sdk/f;

    return-object v0
.end method

.method public a(J)V
    .locals 0

    iput-wide p1, p0, Lcom/bugfender/sdk/k2;->n:J

    return-void
.end method

.method public b()F
    .locals 1

    iget v0, p0, Lcom/bugfender/sdk/k2;->c:F

    return v0
.end method

.method public c()Lcom/bugfender/sdk/w;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/k2;->a:Lcom/bugfender/sdk/w;

    return-object v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lcom/bugfender/sdk/k2;->d:J

    return-wide v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/k2;->g:Ljava/lang/String;

    return-object v0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Lcom/bugfender/sdk/k2;->m:J

    return-wide v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lcom/bugfender/sdk/k2;->k:I

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/k2;->f:Ljava/lang/String;

    return-object v0
.end method

.method public i()J
    .locals 2

    iget-wide v0, p0, Lcom/bugfender/sdk/k2;->j:J

    return-wide v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/k2;->l:Ljava/lang/String;

    return-object v0
.end method

.method public k()J
    .locals 2

    iget-wide v0, p0, Lcom/bugfender/sdk/k2;->n:J

    return-wide v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/k2;->o:Ljava/lang/String;

    return-object v0
.end method

.method public m()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/k2;->e:Ljava/util/Date;

    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/k2;->h:Ljava/lang/String;

    return-object v0
.end method

.method public o()J
    .locals 2

    iget-wide v0, p0, Lcom/bugfender/sdk/k2;->i:J

    return-wide v0
.end method
