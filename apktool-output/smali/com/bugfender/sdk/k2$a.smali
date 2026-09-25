.class public Lcom/bugfender/sdk/k2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bugfender/sdk/k2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(F)Lcom/bugfender/sdk/k2$a;
    .locals 0

    iput p1, p0, Lcom/bugfender/sdk/k2$a;->c:F

    return-object p0
.end method

.method public a(I)Lcom/bugfender/sdk/k2$a;
    .locals 0

    iput p1, p0, Lcom/bugfender/sdk/k2$a;->k:I

    return-object p0
.end method

.method public a(J)Lcom/bugfender/sdk/k2$a;
    .locals 0

    iput-wide p1, p0, Lcom/bugfender/sdk/k2$a;->d:J

    return-object p0
.end method

.method public a(Lcom/bugfender/sdk/f;)Lcom/bugfender/sdk/k2$a;
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/k2$a;->b:Lcom/bugfender/sdk/f;

    return-object p0
.end method

.method public a(Lcom/bugfender/sdk/w;)Lcom/bugfender/sdk/k2$a;
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/k2$a;->a:Lcom/bugfender/sdk/w;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/bugfender/sdk/k2$a;
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/k2$a;->g:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/util/Date;)Lcom/bugfender/sdk/k2$a;
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/k2$a;->e:Ljava/util/Date;

    return-object p0
.end method

.method public a()Lcom/bugfender/sdk/k2;
    .locals 25

    move-object/from16 v0, p0

    new-instance v22, Lcom/bugfender/sdk/k2;

    move-object/from16 v1, v22

    iget-object v2, v0, Lcom/bugfender/sdk/k2$a;->a:Lcom/bugfender/sdk/w;

    iget-object v3, v0, Lcom/bugfender/sdk/k2$a;->b:Lcom/bugfender/sdk/f;

    iget v4, v0, Lcom/bugfender/sdk/k2$a;->c:F

    iget-wide v5, v0, Lcom/bugfender/sdk/k2$a;->d:J

    iget-object v7, v0, Lcom/bugfender/sdk/k2$a;->e:Ljava/util/Date;

    iget-object v8, v0, Lcom/bugfender/sdk/k2$a;->f:Ljava/lang/String;

    iget-object v9, v0, Lcom/bugfender/sdk/k2$a;->g:Ljava/lang/String;

    iget-object v10, v0, Lcom/bugfender/sdk/k2$a;->h:Ljava/lang/String;

    iget-wide v11, v0, Lcom/bugfender/sdk/k2$a;->i:J

    iget-wide v13, v0, Lcom/bugfender/sdk/k2$a;->j:J

    iget v15, v0, Lcom/bugfender/sdk/k2$a;->k:I

    move-object/from16 v23, v1

    iget-object v1, v0, Lcom/bugfender/sdk/k2$a;->l:Ljava/lang/String;

    move-object/from16 v16, v1

    move-object/from16 v24, v2

    iget-wide v1, v0, Lcom/bugfender/sdk/k2$a;->m:J

    move-wide/from16 v17, v1

    iget-wide v1, v0, Lcom/bugfender/sdk/k2$a;->n:J

    move-wide/from16 v19, v1

    iget-object v1, v0, Lcom/bugfender/sdk/k2$a;->o:Ljava/lang/String;

    move-object/from16 v21, v1

    move-object/from16 v1, v23

    move-object/from16 v2, v24

    invoke-direct/range {v1 .. v21}, Lcom/bugfender/sdk/k2;-><init>(Lcom/bugfender/sdk/w;Lcom/bugfender/sdk/f;FJLjava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;JJLjava/lang/String;)V

    return-object v22
.end method

.method public b(J)Lcom/bugfender/sdk/k2$a;
    .locals 0

    iput-wide p1, p0, Lcom/bugfender/sdk/k2$a;->m:J

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/bugfender/sdk/k2$a;
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/k2$a;->f:Ljava/lang/String;

    return-object p0
.end method

.method public c(J)Lcom/bugfender/sdk/k2$a;
    .locals 0

    iput-wide p1, p0, Lcom/bugfender/sdk/k2$a;->j:J

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/bugfender/sdk/k2$a;
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/k2$a;->l:Ljava/lang/String;

    return-object p0
.end method

.method public d(J)Lcom/bugfender/sdk/k2$a;
    .locals 0

    iput-wide p1, p0, Lcom/bugfender/sdk/k2$a;->n:J

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/bugfender/sdk/k2$a;
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/k2$a;->o:Ljava/lang/String;

    return-object p0
.end method

.method public e(J)Lcom/bugfender/sdk/k2$a;
    .locals 0

    iput-wide p1, p0, Lcom/bugfender/sdk/k2$a;->i:J

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lcom/bugfender/sdk/k2$a;
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/k2$a;->h:Ljava/lang/String;

    return-object p0
.end method
