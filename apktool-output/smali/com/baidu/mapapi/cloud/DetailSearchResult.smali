.class public Lcom/baidu/mapapi/cloud/DetailSearchResult;
.super Lcom/baidu/mapapi/cloud/BaseSearchResult;


# instance fields
.field public poiInfo:Lcom/baidu/mapapi/cloud/CloudPoiInfo;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/mapapi/cloud/BaseSearchResult;-><init>()V

    return-void
.end method


# virtual methods
.method public parseFromJSON(Lorg/json/JSONObject;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/baidu/mapapi/cloud/BaseSearchResult;->parseFromJSON(Lorg/json/JSONObject;)V

    iget v0, p0, Lcom/baidu/mapapi/cloud/DetailSearchResult;->status:I

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "contents"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    new-instance v0, Lcom/baidu/mapapi/cloud/CloudPoiInfo;

    invoke-direct {v0}, Lcom/baidu/mapapi/cloud/CloudPoiInfo;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapapi/cloud/DetailSearchResult;->poiInfo:Lcom/baidu/mapapi/cloud/CloudPoiInfo;

    invoke-virtual {v0, p1}, Lcom/baidu/mapapi/cloud/CloudPoiInfo;->a(Lorg/json/JSONObject;)V

    return-void
.end method
