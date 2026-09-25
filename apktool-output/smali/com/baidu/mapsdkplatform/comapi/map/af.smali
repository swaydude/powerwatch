.class Lcom/baidu/mapsdkplatform/comapi/map/af;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lcom/baidu/mapsdkplatform/comapi/map/ae;


# direct methods
.method constructor <init>(Lcom/baidu/mapsdkplatform/comapi/map/ae;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 12

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {v0}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v0

    if-eqz v0, :cond_2a

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {v0}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    goto/16 :goto_c

    :cond_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {v2}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v2

    iget-wide v2, v2, Lcom/baidu/mapsdkplatform/comapi/map/e;->j:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    return-void

    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xfa0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_8

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {v0}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-nez v0, :cond_2

    return-void

    :cond_2
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {v0}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/mapsdkplatform/comapi/map/n;

    const/4 v4, 0x0

    iget v5, p1, Landroid/os/Message;->arg2:I

    if-ne v5, v3, :cond_7

    sget v4, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a:I

    sget v5, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b:I

    mul-int v4, v4, v5

    new-array v4, v4, [I

    sget v5, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a:I

    sget v6, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b:I

    mul-int v5, v5, v6

    new-array v5, v5, [I

    iget-object v6, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {v6}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v6

    iget-object v6, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v6, :cond_4

    return-void

    :cond_4
    iget-object v6, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {v6}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v6

    iget-object v6, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    sget v7, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a:I

    sget v8, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b:I

    invoke-virtual {v6, v4, v7, v8}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a([III)[I

    move-result-object v4

    const/4 v6, 0x0

    :goto_1
    sget v7, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b:I

    if-ge v6, v7, :cond_6

    const/4 v7, 0x0

    :goto_2
    sget v8, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a:I

    if-ge v7, v8, :cond_5

    sget v8, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a:I

    mul-int v8, v8, v6

    add-int/2addr v8, v7

    aget v8, v4, v8

    shr-int/lit8 v9, v8, 0x10

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v10, v8, 0x10

    const/high16 v11, 0xff0000

    and-int/2addr v10, v11

    const v11, -0xff0100

    and-int/2addr v8, v11

    or-int/2addr v8, v10

    or-int/2addr v8, v9

    sget v9, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b:I

    sub-int/2addr v9, v6

    sub-int/2addr v9, v3

    sget v10, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a:I

    mul-int v9, v9, v10

    add-int/2addr v9, v7

    aput v8, v5, v9

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_6
    sget v4, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a:I

    sget v6, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b:I

    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v5, v4, v6, v7}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    :cond_7
    if-eqz v1, :cond_3

    invoke-interface {v1, v4}, Lcom/baidu/mapsdkplatform/comapi/map/n;->a(Landroid/graphics/Bitmap;)V

    goto :goto_0

    :cond_8
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x27

    const/high16 v4, 0x41900000    # 18.0f

    if-ne v0, v1, :cond_1a

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {v0}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v0

    if-nez v0, :cond_9

    return-void

    :cond_9
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/16 v1, 0x64

    if-ne v0, v1, :cond_a

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->B()V

    goto :goto_5

    :cond_a
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_b

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->L()V

    goto :goto_5

    :cond_b
    iget v0, p1, Landroid/os/Message;->arg1:I

    if-ne v0, v3, :cond_c

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/o;

    move-result-object p1

    if-eqz p1, :cond_10

    :goto_3
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/o;

    move-result-object p1

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/o;->a()V

    goto :goto_5

    :cond_c
    iget v0, p1, Landroid/os/Message;->arg1:I

    if-nez v0, :cond_d

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/o;

    move-result-object p1

    if-eqz p1, :cond_10

    goto :goto_3

    :cond_d
    iget p1, p1, Landroid/os/Message;->arg1:I

    const/4 v0, 0x2

    if-ne p1, v0, :cond_10

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-nez p1, :cond_e

    return-void

    :cond_e
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_f
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v0, :cond_f

    invoke-interface {v0}, Lcom/baidu/mapsdkplatform/comapi/map/n;->c()V

    goto :goto_4

    :cond_10
    :goto_5
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-boolean p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->k:Z

    if-nez p1, :cond_13

    sget p1, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b:I

    if-lez p1, :cond_13

    sget p1, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a:I

    if-lez p1, :cond_13

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    invoke-virtual {p1, v2, v2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(II)Lcom/baidu/mapapi/model/inner/GeoPoint;

    move-result-object p1

    if-eqz p1, :cond_13

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iput-boolean v3, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->k:Z

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-nez p1, :cond_11

    return-void

    :cond_11
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_12
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v0, :cond_12

    invoke-interface {v0}, Lcom/baidu/mapsdkplatform/comapi/map/n;->b()V

    goto :goto_6

    :cond_13
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-nez p1, :cond_14

    return-void

    :cond_14
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_15
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v0, :cond_15

    invoke-interface {v0}, Lcom/baidu/mapsdkplatform/comapi/map/n;->a()V

    goto :goto_7

    :cond_16
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->q()Z

    move-result p1

    if-eqz p1, :cond_2a

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-nez p1, :cond_17

    return-void

    :cond_17
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-nez v0, :cond_18

    goto :goto_8

    :cond_18
    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {v1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v1

    iget v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a:F

    cmpl-float v1, v1, v4

    if-ltz v1, :cond_19

    invoke-interface {v0, v3}, Lcom/baidu/mapsdkplatform/comapi/map/n;->a(Z)V

    goto :goto_8

    :cond_19
    invoke-interface {v0, v2}, Lcom/baidu/mapsdkplatform/comapi/map/n;->a(Z)V

    goto :goto_8

    :cond_1a
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x29

    if-ne v0, v1, :cond_21

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    if-nez p1, :cond_1b

    return-void

    :cond_1b
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-boolean p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->n:Z

    if-nez p1, :cond_1c

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-boolean p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->o:Z

    if-eqz p1, :cond_2a

    :cond_1c
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-nez p1, :cond_1d

    return-void

    :cond_1d
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1e
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-nez v0, :cond_1f

    goto :goto_9

    :cond_1f
    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {v1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/baidu/mapsdkplatform/comapi/map/n;->b(Lcom/baidu/mapsdkplatform/comapi/map/ad;)V

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {v1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->q()Z

    move-result v1

    if-eqz v1, :cond_1e

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {v1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v1

    iget v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a:F

    cmpl-float v1, v1, v4

    if-ltz v1, :cond_20

    invoke-interface {v0, v3}, Lcom/baidu/mapsdkplatform/comapi/map/n;->a(Z)V

    goto :goto_9

    :cond_20
    invoke-interface {v0, v2}, Lcom/baidu/mapsdkplatform/comapi/map/n;->a(Z)V

    goto :goto_9

    :cond_21
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x3e7

    if-ne v0, v1, :cond_24

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-nez p1, :cond_22

    return-void

    :cond_22
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_23
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v0, :cond_23

    invoke-interface {v0}, Lcom/baidu/mapsdkplatform/comapi/map/n;->e()V

    goto :goto_a

    :cond_24
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x32

    if-ne v0, v1, :cond_2a

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {v0}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-nez v0, :cond_25

    return-void

    :cond_25
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {v0}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_26
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-nez v1, :cond_27

    goto :goto_b

    :cond_27
    iget v5, p1, Landroid/os/Message;->arg1:I

    if-nez v5, :cond_29

    :cond_28
    invoke-interface {v1, v2}, Lcom/baidu/mapsdkplatform/comapi/map/n;->a(Z)V

    goto :goto_b

    :cond_29
    iget v5, p1, Landroid/os/Message;->arg1:I

    if-ne v5, v3, :cond_26

    iget-object v5, p0, Lcom/baidu/mapsdkplatform/comapi/map/af;->a:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-static {v5}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v5

    invoke-virtual {v5}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v5

    iget v5, v5, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a:F

    cmpl-float v5, v5, v4

    if-ltz v5, :cond_28

    invoke-interface {v1, v3}, Lcom/baidu/mapsdkplatform/comapi/map/n;->a(Z)V

    goto :goto_b

    :cond_2a
    :goto_c
    return-void
.end method
