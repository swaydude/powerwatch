.class Lcom/baidu/mapsdkplatform/comapi/map/m;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lcom/baidu/mapsdkplatform/comapi/map/l;


# direct methods
.method constructor <init>(Lcom/baidu/mapsdkplatform/comapi/map/l;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 12

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v0}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v2}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v2

    iget-wide v2, v2, Lcom/baidu/mapsdkplatform/comapi/map/e;->j:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    return-void

    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xfa0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_8

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v0}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-nez v0, :cond_2

    return-void

    :cond_2
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v0}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_27

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/mapsdkplatform/comapi/map/n;

    const/4 v4, 0x0

    iget v5, p1, Landroid/os/Message;->arg2:I

    if-ne v5, v2, :cond_7

    iget-object v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v4}, Lcom/baidu/mapsdkplatform/comapi/map/l;->b(Lcom/baidu/mapsdkplatform/comapi/map/l;)I

    move-result v4

    iget-object v5, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v5}, Lcom/baidu/mapsdkplatform/comapi/map/l;->c(Lcom/baidu/mapsdkplatform/comapi/map/l;)I

    move-result v5

    mul-int v4, v4, v5

    new-array v4, v4, [I

    iget-object v5, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v5}, Lcom/baidu/mapsdkplatform/comapi/map/l;->b(Lcom/baidu/mapsdkplatform/comapi/map/l;)I

    move-result v5

    iget-object v6, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v6}, Lcom/baidu/mapsdkplatform/comapi/map/l;->c(Lcom/baidu/mapsdkplatform/comapi/map/l;)I

    move-result v6

    mul-int v5, v5, v6

    new-array v5, v5, [I

    iget-object v6, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v6}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v6

    iget-object v6, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v6, :cond_4

    return-void

    :cond_4
    iget-object v6, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v6}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v6

    iget-object v6, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-object v7, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v7}, Lcom/baidu/mapsdkplatform/comapi/map/l;->b(Lcom/baidu/mapsdkplatform/comapi/map/l;)I

    move-result v7

    iget-object v8, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v8}, Lcom/baidu/mapsdkplatform/comapi/map/l;->c(Lcom/baidu/mapsdkplatform/comapi/map/l;)I

    move-result v8

    invoke-virtual {v6, v4, v7, v8}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a([III)[I

    move-result-object v4

    const/4 v6, 0x0

    :goto_1
    iget-object v7, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v7}, Lcom/baidu/mapsdkplatform/comapi/map/l;->c(Lcom/baidu/mapsdkplatform/comapi/map/l;)I

    move-result v7

    if-ge v6, v7, :cond_6

    const/4 v7, 0x0

    :goto_2
    iget-object v8, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v8}, Lcom/baidu/mapsdkplatform/comapi/map/l;->b(Lcom/baidu/mapsdkplatform/comapi/map/l;)I

    move-result v8

    if-ge v7, v8, :cond_5

    iget-object v8, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v8}, Lcom/baidu/mapsdkplatform/comapi/map/l;->b(Lcom/baidu/mapsdkplatform/comapi/map/l;)I

    move-result v8

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

    iget-object v9, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v9}, Lcom/baidu/mapsdkplatform/comapi/map/l;->c(Lcom/baidu/mapsdkplatform/comapi/map/l;)I

    move-result v9

    sub-int/2addr v9, v6

    sub-int/2addr v9, v2

    iget-object v10, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v10}, Lcom/baidu/mapsdkplatform/comapi/map/l;->b(Lcom/baidu/mapsdkplatform/comapi/map/l;)I

    move-result v10

    mul-int v9, v9, v10

    add-int/2addr v9, v7

    aput v8, v5, v9

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_6
    iget-object v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v4}, Lcom/baidu/mapsdkplatform/comapi/map/l;->b(Lcom/baidu/mapsdkplatform/comapi/map/l;)I

    move-result v4

    iget-object v6, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v6}, Lcom/baidu/mapsdkplatform/comapi/map/l;->c(Lcom/baidu/mapsdkplatform/comapi/map/l;)I

    move-result v6

    sget-object v7, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-static {v5, v4, v6, v7}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    :cond_7
    if-eqz v1, :cond_3

    invoke-interface {v1, v4}, Lcom/baidu/mapsdkplatform/comapi/map/n;->a(Landroid/graphics/Bitmap;)V

    goto/16 :goto_0

    :cond_8
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x27

    if-ne v0, v1, :cond_15

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v0}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v0

    if-nez v0, :cond_9

    return-void

    :cond_9
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v0}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-nez v0, :cond_a

    return-void

    :cond_a
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/16 v1, 0x64

    if-ne v0, v1, :cond_b

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->B()V

    goto :goto_4

    :cond_b
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_c

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->L()V

    goto :goto_4

    :cond_c
    iget v0, p1, Landroid/os/Message;->arg1:I

    if-ne v0, v2, :cond_d

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->requestRender()V

    goto :goto_4

    :cond_d
    iget v0, p1, Landroid/os/Message;->arg1:I

    if-nez v0, :cond_e

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->requestRender()V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b()Z

    move-result p1

    if-nez p1, :cond_11

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->getRenderMode()I

    move-result p1

    if-eqz p1, :cond_11

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-virtual {p1, v3}, Lcom/baidu/mapsdkplatform/comapi/map/l;->setRenderMode(I)V

    goto :goto_4

    :cond_e
    iget p1, p1, Landroid/os/Message;->arg1:I

    const/4 v0, 0x2

    if-ne p1, v0, :cond_11

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-nez p1, :cond_f

    return-void

    :cond_f
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_10
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v0, :cond_10

    invoke-interface {v0}, Lcom/baidu/mapsdkplatform/comapi/map/n;->c()V

    goto :goto_3

    :cond_11
    :goto_4
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-boolean p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->k:Z

    if-nez p1, :cond_13

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->c(Lcom/baidu/mapsdkplatform/comapi/map/l;)I

    move-result p1

    if-lez p1, :cond_13

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->b(Lcom/baidu/mapsdkplatform/comapi/map/l;)I

    move-result p1

    if-lez p1, :cond_13

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    invoke-virtual {p1, v3, v3}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(II)Lcom/baidu/mapapi/model/inner/GeoPoint;

    move-result-object p1

    if-eqz p1, :cond_13

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iput-boolean v2, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->k:Z

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_12
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v0, :cond_12

    invoke-interface {v0}, Lcom/baidu/mapsdkplatform/comapi/map/n;->b()V

    goto :goto_5

    :cond_13
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_14
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_27

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v0, :cond_14

    invoke-interface {v0}, Lcom/baidu/mapsdkplatform/comapi/map/n;->a()V

    goto :goto_6

    :cond_15
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x29

    if-ne v0, v1, :cond_1a

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    if-nez p1, :cond_16

    return-void

    :cond_16
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-nez p1, :cond_17

    return-void

    :cond_17
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-boolean p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->n:Z

    if-nez p1, :cond_18

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-boolean p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->o:Z

    if-eqz p1, :cond_27

    :cond_18
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_27

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-nez v0, :cond_19

    goto :goto_7

    :cond_19
    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/baidu/mapsdkplatform/comapi/map/n;->b(Lcom/baidu/mapsdkplatform/comapi/map/ad;)V

    goto :goto_7

    :cond_1a
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x3e7

    if-ne v0, v1, :cond_1d

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-nez p1, :cond_1b

    return-void

    :cond_1b
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1c
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_27

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v0, :cond_1c

    invoke-interface {v0}, Lcom/baidu/mapsdkplatform/comapi/map/n;->e()V

    goto :goto_8

    :cond_1d
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x32

    if-ne v0, v1, :cond_23

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v0}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-nez v0, :cond_1e

    return-void

    :cond_1e
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v0}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1f
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_27

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-nez v1, :cond_20

    goto :goto_9

    :cond_20
    iget v4, p1, Landroid/os/Message;->arg1:I

    if-nez v4, :cond_22

    :cond_21
    invoke-interface {v1, v3}, Lcom/baidu/mapsdkplatform/comapi/map/n;->a(Z)V

    goto :goto_9

    :cond_22
    iget v4, p1, Landroid/os/Message;->arg1:I

    if-ne v4, v2, :cond_1f

    iget-object v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {v4}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v4

    invoke-virtual {v4}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v4

    iget v4, v4, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a:F

    const/high16 v5, 0x41900000    # 18.0f

    cmpl-float v4, v4, v5

    if-ltz v4, :cond_21

    invoke-interface {v1, v2}, Lcom/baidu/mapsdkplatform/comapi/map/n;->a(Z)V

    goto :goto_9

    :cond_23
    iget v0, p1, Landroid/os/Message;->what:I

    const v1, 0xff09

    if-ne v0, v1, :cond_27

    iget v0, p1, Landroid/os/Message;->arg2:I

    iget v1, p1, Landroid/os/Message;->arg1:I

    const/16 v4, 0x12c

    if-ne v1, v4, :cond_27

    iget v1, p1, Landroid/os/Message;->arg2:I

    const/16 v4, 0x3eb

    if-ne v1, v4, :cond_24

    goto :goto_a

    :cond_24
    iget v1, p1, Landroid/os/Message;->arg2:I

    const/16 v2, 0x3ec

    if-lt v1, v2, :cond_25

    iget p1, p1, Landroid/os/Message;->arg2:I

    const/16 v1, 0x3fb

    :cond_25
    move v3, v0

    const/4 v2, 0x0

    :goto_a
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/m;->a:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_26
    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_27

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v0, :cond_26

    invoke-interface {v0, v2, v3}, Lcom/baidu/mapsdkplatform/comapi/map/n;->a(ZI)V

    goto :goto_b

    :cond_27
    return-void
.end method
