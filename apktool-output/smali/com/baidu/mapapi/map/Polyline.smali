.class public final Lcom/baidu/mapapi/map/Polyline;
.super Lcom/baidu/mapapi/map/Overlay;


# instance fields
.field a:I

.field b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field c:[I

.field d:[I

.field e:I

.field f:Z

.field g:Z

.field h:Z

.field i:Z

.field j:Lcom/baidu/mapapi/map/BitmapDescriptor;

.field k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/map/BitmapDescriptor;",
            ">;"
        }
    .end annotation
.end field

.field l:I


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/baidu/mapapi/map/Overlay;-><init>()V

    const/4 v0, 0x5

    iput v0, p0, Lcom/baidu/mapapi/map/Polyline;->e:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/mapapi/map/Polyline;->f:Z

    iput-boolean v0, p0, Lcom/baidu/mapapi/map/Polyline;->g:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/baidu/mapapi/map/Polyline;->h:Z

    iput-boolean v1, p0, Lcom/baidu/mapapi/map/Polyline;->i:Z

    iput v0, p0, Lcom/baidu/mapapi/map/Polyline;->l:I

    sget-object v0, Lcom/baidu/mapsdkplatform/comapi/map/j;->i:Lcom/baidu/mapsdkplatform/comapi/map/j;

    iput-object v0, p0, Lcom/baidu/mapapi/map/Polyline;->type:Lcom/baidu/mapsdkplatform/comapi/map/j;

    return-void
.end method

.method private a(Z)Landroid/os/Bundle;
    .locals 1

    if-eqz p1, :cond_1

    iget p1, p0, Lcom/baidu/mapapi/map/Polyline;->l:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const-string p1, "CircleDashTexture.png"

    goto :goto_0

    :cond_0
    const-string p1, "lineDashTexture.png"

    :goto_0
    invoke-static {p1}, Lcom/baidu/mapapi/map/BitmapDescriptorFactory;->fromAsset(Ljava/lang/String;)Lcom/baidu/mapapi/map/BitmapDescriptor;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/BitmapDescriptor;->b()Landroid/os/Bundle;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p1, p0, Lcom/baidu/mapapi/map/Polyline;->j:Lcom/baidu/mapapi/map/BitmapDescriptor;

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/BitmapDescriptor;->b()Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method private static a([ILandroid/os/Bundle;)V
    .locals 1

    if-eqz p0, :cond_0

    array-length v0, p0

    if-lez v0, :cond_0

    const-string v0, "traffic_array"

    invoke-virtual {p1, v0, p0}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    :cond_0
    return-void
.end method

.method private b(Z)Landroid/os/Bundle;
    .locals 5

    const-string v0, "total"

    if-eqz p1, :cond_1

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "lineDashTexture.png"

    invoke-static {v0}, Lcom/baidu/mapapi/map/BitmapDescriptorFactory;->fromAsset(Ljava/lang/String;)Lcom/baidu/mapapi/map/BitmapDescriptor;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/BitmapDescriptor;->b()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "texture_0"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    return-object p1

    :cond_1
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lcom/baidu/mapapi/map/Polyline;->k:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_3

    iget-object v3, p0, Lcom/baidu/mapapi/map/Polyline;->k:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "texture_"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/baidu/mapapi/map/Polyline;->k:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/baidu/mapapi/map/BitmapDescriptor;

    invoke-virtual {v4}, Lcom/baidu/mapapi/map/BitmapDescriptor;->b()Landroid/os/Bundle;

    move-result-object v4

    invoke-virtual {p1, v3, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    add-int/lit8 v2, v2, 0x1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p1
.end method

.method private static b([ILandroid/os/Bundle;)V
    .locals 1

    if-eqz p0, :cond_0

    array-length v0, p0

    if-lez v0, :cond_0

    const-string v0, "color_array"

    invoke-virtual {p1, v0, p0}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    const/4 p0, 0x1

    const-string v0, "total"

    invoke-virtual {p1, v0, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method


# virtual methods
.method a(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 7

    invoke-super {p0, p1}, Lcom/baidu/mapapi/map/Overlay;->a(Landroid/os/Bundle;)Landroid/os/Bundle;

    iget-object v0, p0, Lcom/baidu/mapapi/map/Polyline;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/model/LatLng;

    invoke-static {v0}, Lcom/baidu/mapapi/model/CoordUtil;->ll2mc(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/model/inner/GeoPoint;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/model/inner/GeoPoint;->getLongitudeE6()D

    move-result-wide v2

    const-string v4, "location_x"

    invoke-virtual {p1, v4, v2, v3}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    invoke-virtual {v0}, Lcom/baidu/mapapi/model/inner/GeoPoint;->getLatitudeE6()D

    move-result-wide v2

    const-string v0, "location_y"

    invoke-virtual {p1, v0, v2, v3}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    iget v0, p0, Lcom/baidu/mapapi/map/Polyline;->e:I

    const-string v2, "width"

    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/Polyline;->b:Ljava/util/List;

    invoke-static {v0, p1}, Lcom/baidu/mapapi/map/Overlay;->a(Ljava/util/List;Landroid/os/Bundle;)V

    iget v0, p0, Lcom/baidu/mapapi/map/Polyline;->a:I

    invoke-static {v0, p1}, Lcom/baidu/mapapi/map/Overlay;->a(ILandroid/os/Bundle;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/Polyline;->c:[I

    invoke-static {v0, p1}, Lcom/baidu/mapapi/map/Polyline;->a([ILandroid/os/Bundle;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/Polyline;->d:[I

    invoke-static {v0, p1}, Lcom/baidu/mapapi/map/Polyline;->b([ILandroid/os/Bundle;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/Polyline;->c:[I

    const-string v2, "baidumapsdk"

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    array-length v4, v0

    if-lez v4, :cond_0

    array-length v0, v0

    iget-object v4, p0, Lcom/baidu/mapapi/map/Polyline;->b:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v3

    if-le v0, v4, :cond_0

    const-string v0, "the size of textureIndexs is larger than the size of points"

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, p0, Lcom/baidu/mapapi/map/Polyline;->f:Z

    const-string v4, "dotline"

    invoke-virtual {p1, v4, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-boolean v0, p0, Lcom/baidu/mapapi/map/Polyline;->g:Z

    const-string v5, "focus"

    invoke-virtual {p1, v5, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-boolean v0, p0, Lcom/baidu/mapapi/map/Polyline;->i:Z

    const-string v5, "isClickable"

    invoke-virtual {p1, v5, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :try_start_0
    iget-object v0, p0, Lcom/baidu/mapapi/map/Polyline;->j:Lcom/baidu/mapapi/map/BitmapDescriptor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v5, "image_info"

    const-string v6, "custom"

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {p1, v6, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-direct {p0, v1}, Lcom/baidu/mapapi/map/Polyline;->a(Z)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v5, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lcom/baidu/mapapi/map/Polyline;->f:Z

    if-eqz v0, :cond_2

    invoke-direct {p0, v3}, Lcom/baidu/mapapi/map/Polyline;->a(Z)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v5, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    const-string v0, "dotted_line_type"

    iget v5, p0, Lcom/baidu/mapapi/map/Polyline;->l:I

    invoke-virtual {p1, v0, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_2
    invoke-virtual {p1, v6, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :goto_0
    iget-object v0, p0, Lcom/baidu/mapapi/map/Polyline;->k:Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string v5, "image_info_list"

    const-string v6, "customlist"

    if-eqz v0, :cond_3

    :try_start_2
    invoke-virtual {p1, v6, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-direct {p0, v1}, Lcom/baidu/mapapi/map/Polyline;->b(Z)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v5, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_1

    :cond_3
    iget-boolean v0, p0, Lcom/baidu/mapapi/map/Polyline;->f:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/baidu/mapapi/map/Polyline;->c:[I

    if-eqz v0, :cond_4

    array-length v0, v0

    if-gtz v0, :cond_5

    :cond_4
    iget-object v0, p0, Lcom/baidu/mapapi/map/Polyline;->d:[I

    if-eqz v0, :cond_6

    array-length v0, v0

    if-lez v0, :cond_6

    :cond_5
    invoke-direct {p0, v3}, Lcom/baidu/mapapi/map/Polyline;->b(Z)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v5, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_6
    invoke-virtual {p1, v6, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :goto_1
    const-string v0, "keep"

    iget-boolean v5, p0, Lcom/baidu/mapapi/map/Polyline;->h:Z

    if-eqz v5, :cond_7

    goto :goto_2

    :cond_7
    const/4 v3, 0x0

    :goto_2
    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catch_0
    const-string v0, "load texture resource failed!"

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1, v4, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :goto_3
    return-object p1
.end method

.method public getColor()I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/map/Polyline;->a:I

    return v0
.end method

.method public getColorList()[I
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/Polyline;->d:[I

    return-object v0
.end method

.method public getDottedLineType()I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/map/Polyline;->l:I

    return v0
.end method

.method public getPoints()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/model/LatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/baidu/mapapi/map/Polyline;->b:Ljava/util/List;

    return-object v0
.end method

.method public getTexture()Lcom/baidu/mapapi/map/BitmapDescriptor;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/Polyline;->j:Lcom/baidu/mapapi/map/BitmapDescriptor;

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/map/Polyline;->e:I

    return v0
.end method

.method public isClickable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapapi/map/Polyline;->i:Z

    return v0
.end method

.method public isDottedLine()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapapi/map/Polyline;->f:Z

    return v0
.end method

.method public isFocus()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapapi/map/Polyline;->g:Z

    return v0
.end method

.method public isIsKeepScale()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapapi/map/Polyline;->h:Z

    return v0
.end method

.method public setClickable(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/mapapi/map/Polyline;->i:Z

    iget-object p1, p0, Lcom/baidu/mapapi/map/Polyline;->listener:Lcom/baidu/mapapi/map/Overlay$a;

    invoke-interface {p1, p0}, Lcom/baidu/mapapi/map/Overlay$a;->b(Lcom/baidu/mapapi/map/Overlay;)V

    return-void
.end method

.method public setColor(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/mapapi/map/Polyline;->a:I

    iget-object p1, p0, Lcom/baidu/mapapi/map/Polyline;->listener:Lcom/baidu/mapapi/map/Overlay$a;

    invoke-interface {p1, p0}, Lcom/baidu/mapapi/map/Overlay$a;->b(Lcom/baidu/mapapi/map/Overlay;)V

    return-void
.end method

.method public setColorList([I)V
    .locals 1

    if-eqz p1, :cond_0

    array-length v0, p1

    if-eqz v0, :cond_0

    iput-object p1, p0, Lcom/baidu/mapapi/map/Polyline;->d:[I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "BDMapSDKException: colorList can not empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setDottedLine(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/mapapi/map/Polyline;->f:Z

    iget-object p1, p0, Lcom/baidu/mapapi/map/Polyline;->listener:Lcom/baidu/mapapi/map/Overlay$a;

    invoke-interface {p1, p0}, Lcom/baidu/mapapi/map/Overlay$a;->b(Lcom/baidu/mapapi/map/Overlay;)V

    return-void
.end method

.method public setDottedLineType(Lcom/baidu/mapapi/map/PolylineDottedLineType;)V
    .locals 0

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/PolylineDottedLineType;->ordinal()I

    move-result p1

    iput p1, p0, Lcom/baidu/mapapi/map/Polyline;->l:I

    iget-object p1, p0, Lcom/baidu/mapapi/map/Polyline;->listener:Lcom/baidu/mapapi/map/Overlay$a;

    invoke-interface {p1, p0}, Lcom/baidu/mapapi/map/Overlay$a;->b(Lcom/baidu/mapapi/map/Overlay;)V

    return-void
.end method

.method public setFocus(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/mapapi/map/Polyline;->g:Z

    iget-object p1, p0, Lcom/baidu/mapapi/map/Polyline;->listener:Lcom/baidu/mapapi/map/Overlay$a;

    invoke-interface {p1, p0}, Lcom/baidu/mapapi/map/Overlay$a;->b(Lcom/baidu/mapapi/map/Overlay;)V

    return-void
.end method

.method public setIndexs([I)V
    .locals 1

    if-eqz p1, :cond_0

    array-length v0, p1

    if-eqz v0, :cond_0

    iput-object p1, p0, Lcom/baidu/mapapi/map/Polyline;->c:[I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "BDMapSDKException: indexList can not empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setIsKeepScale(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/mapapi/map/Polyline;->h:Z

    return-void
.end method

.method public setPoints(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/model/LatLng;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/baidu/mapapi/map/Polyline;->b:Ljava/util/List;

    iget-object p1, p0, Lcom/baidu/mapapi/map/Polyline;->listener:Lcom/baidu/mapapi/map/Overlay$a;

    invoke-interface {p1, p0}, Lcom/baidu/mapapi/map/Overlay$a;->b(Lcom/baidu/mapapi/map/Overlay;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "BDMapSDKException: points list can not contains null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "BDMapSDKException: points count can not less than 2 or more than 10000"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "BDMapSDKException: points list can not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setTexture(Lcom/baidu/mapapi/map/BitmapDescriptor;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/Polyline;->j:Lcom/baidu/mapapi/map/BitmapDescriptor;

    iget-object p1, p0, Lcom/baidu/mapapi/map/Polyline;->listener:Lcom/baidu/mapapi/map/Overlay$a;

    invoke-interface {p1, p0}, Lcom/baidu/mapapi/map/Overlay$a;->b(Lcom/baidu/mapapi/map/Overlay;)V

    return-void
.end method

.method public setTextureList(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/map/BitmapDescriptor;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/baidu/mapapi/map/Polyline;->k:Ljava/util/List;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "BDMapSDKException: textureList can not empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setWidth(I)V
    .locals 0

    if-lez p1, :cond_0

    iput p1, p0, Lcom/baidu/mapapi/map/Polyline;->e:I

    iget-object p1, p0, Lcom/baidu/mapapi/map/Polyline;->listener:Lcom/baidu/mapapi/map/Overlay$a;

    invoke-interface {p1, p0}, Lcom/baidu/mapapi/map/Overlay$a;->b(Lcom/baidu/mapapi/map/Overlay;)V

    :cond_0
    return-void
.end method
