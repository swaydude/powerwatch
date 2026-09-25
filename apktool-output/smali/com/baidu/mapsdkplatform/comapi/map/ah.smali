.class public Lcom/baidu/mapsdkplatform/comapi/map/ah;
.super Ljava/lang/Object;


# instance fields
.field private a:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;


# direct methods
.method public constructor <init>(Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ah;->a:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    return-void
.end method


# virtual methods
.method public a(Lcom/baidu/mapapi/model/inner/GeoPoint;)Landroid/graphics/Point;
    .locals 5

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Landroid/graphics/Point;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Landroid/graphics/Point;-><init>(II)V

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ah;->a:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {p1}, Lcom/baidu/mapapi/model/inner/GeoPoint;->getLongitudeE6()D

    move-result-wide v2

    double-to-int v2, v2

    invoke-virtual {p1}, Lcom/baidu/mapapi/model/inner/GeoPoint;->getLatitudeE6()D

    move-result-wide v3

    double-to-int p1, v3

    invoke-virtual {v1, v2, p1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->b(II)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "scrx"

    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, v0, Landroid/graphics/Point;->x:I

    const-string p1, "scry"

    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, v0, Landroid/graphics/Point;->y:I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    :cond_2
    :goto_0
    return-object v0
.end method

.method public a(II)Lcom/baidu/mapapi/model/inner/GeoPoint;
    .locals 3

    new-instance v0, Lcom/baidu/mapapi/model/inner/GeoPoint;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2, v1, v2}, Lcom/baidu/mapapi/model/inner/GeoPoint;-><init>(DD)V

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ah;->a:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {v1, p1, p2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(II)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "geox"

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    int-to-double v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/baidu/mapapi/model/inner/GeoPoint;->setLongitudeE6(D)V

    const-string p1, "geoy"

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    int-to-double p1, p1

    invoke-virtual {v0, p1, p2}, Lcom/baidu/mapapi/model/inner/GeoPoint;->setLatitudeE6(D)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    :cond_1
    :goto_0
    return-object v0
.end method
