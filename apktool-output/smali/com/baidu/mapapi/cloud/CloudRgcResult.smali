.class public Lcom/baidu/mapapi/cloud/CloudRgcResult;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/mapapi/cloud/CloudRgcResult$PoiInfo;,
        Lcom/baidu/mapapi/cloud/CloudRgcResult$AddressCompents;
    }
.end annotation


# instance fields
.field public addressCompents:Lcom/baidu/mapapi/cloud/CloudRgcResult$AddressCompents;

.field public customLocationDescription:Ljava/lang/String;

.field public customPois:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/cloud/CloudPoiInfo;",
            ">;"
        }
    .end annotation
.end field

.field public formattedAddress:Ljava/lang/String;

.field public location:Lcom/baidu/mapapi/model/LatLng;

.field public message:Ljava/lang/String;

.field public pois:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/cloud/CloudRgcResult$PoiInfo;",
            ">;"
        }
    .end annotation
.end field

.field public recommendedLocationDescription:Ljava/lang/String;

.field public status:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public parseFromJSON(Lorg/json/JSONObject;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    :try_start_0
    const-string v0, "status"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/baidu/mapapi/cloud/CloudRgcResult;->status:I

    const-string v0, "message"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/mapapi/cloud/CloudRgcResult;->message:Ljava/lang/String;

    iget v0, p0, Lcom/baidu/mapapi/cloud/CloudRgcResult;->status:I

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Lcom/baidu/mapapi/cloud/CloudRgcResult;->status:I

    :cond_1
    iget v0, p0, Lcom/baidu/mapapi/cloud/CloudRgcResult;->status:I

    if-eqz v0, :cond_2

    return-void

    :cond_2
    const-string v0, "location"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v1, Lcom/baidu/mapapi/model/LatLng;

    const-string v2, "lat"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v2

    const-string v4, "lng"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    iput-object v1, p0, Lcom/baidu/mapapi/cloud/CloudRgcResult;->location:Lcom/baidu/mapapi/model/LatLng;

    invoke-static {}, Lcom/baidu/mapapi/SDKInitializer;->getCoordType()Lcom/baidu/mapapi/CoordType;

    move-result-object v0

    sget-object v1, Lcom/baidu/mapapi/CoordType;->GCJ02:Lcom/baidu/mapapi/CoordType;

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/baidu/mapapi/cloud/CloudRgcResult;->location:Lcom/baidu/mapapi/model/LatLng;

    invoke-static {v0}, Lcom/baidu/mapsdkplatform/comapi/util/CoordTrans;->baiduToGcj(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/model/LatLng;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/mapapi/cloud/CloudRgcResult;->location:Lcom/baidu/mapapi/model/LatLng;

    :cond_3
    const-string v0, "address_component"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v1, Lcom/baidu/mapapi/cloud/CloudRgcResult$AddressCompents;

    invoke-direct {v1, p0}, Lcom/baidu/mapapi/cloud/CloudRgcResult$AddressCompents;-><init>(Lcom/baidu/mapapi/cloud/CloudRgcResult;)V

    iput-object v1, p0, Lcom/baidu/mapapi/cloud/CloudRgcResult;->addressCompents:Lcom/baidu/mapapi/cloud/CloudRgcResult$AddressCompents;

    invoke-virtual {v1, v0}, Lcom/baidu/mapapi/cloud/CloudRgcResult$AddressCompents;->a(Lorg/json/JSONObject;)V

    :cond_4
    const-string v0, "formatted_address"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/mapapi/cloud/CloudRgcResult;->formattedAddress:Ljava/lang/String;

    const-string v0, "pois"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/baidu/mapapi/cloud/CloudRgcResult;->pois:Ljava/util/List;

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_6

    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    if-nez v3, :cond_5

    goto :goto_1

    :cond_5
    new-instance v4, Lcom/baidu/mapapi/cloud/CloudRgcResult$PoiInfo;

    invoke-direct {v4, p0}, Lcom/baidu/mapapi/cloud/CloudRgcResult$PoiInfo;-><init>(Lcom/baidu/mapapi/cloud/CloudRgcResult;)V

    invoke-virtual {v4, v3}, Lcom/baidu/mapapi/cloud/CloudRgcResult$PoiInfo;->parseFromJSON(Lorg/json/JSONObject;)V

    iget-object v3, p0, Lcom/baidu/mapapi/cloud/CloudRgcResult;->pois:Ljava/util/List;

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    const-string v0, "custom_pois"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/baidu/mapapi/cloud/CloudRgcResult;->customPois:Ljava/util/List;

    :goto_2
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_8

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    if-nez v2, :cond_7

    goto :goto_3

    :cond_7
    new-instance v3, Lcom/baidu/mapapi/cloud/CloudPoiInfo;

    invoke-direct {v3}, Lcom/baidu/mapapi/cloud/CloudPoiInfo;-><init>()V

    invoke-virtual {v3, v2}, Lcom/baidu/mapapi/cloud/CloudPoiInfo;->b(Lorg/json/JSONObject;)V

    iget-object v2, p0, Lcom/baidu/mapapi/cloud/CloudRgcResult;->customPois:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_8
    const-string v0, "custom_location_description"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/mapapi/cloud/CloudRgcResult;->customLocationDescription:Ljava/lang/String;

    const-string v0, "recommended_location_description"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/baidu/mapapi/cloud/CloudRgcResult;->recommendedLocationDescription:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    :goto_4
    return-void
.end method
