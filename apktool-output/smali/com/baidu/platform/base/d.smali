.class public abstract Lcom/baidu/platform/base/d;
.super Ljava/lang/Object;


# instance fields
.field protected a:Lcom/baidu/platform/base/SearchType;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Lcom/baidu/mapapi/search/core/SearchResult;
.end method

.method public a()Lcom/baidu/platform/base/SearchType;
    .locals 1

    iget-object v0, p0, Lcom/baidu/platform/base/d;->a:Lcom/baidu/platform/base/SearchType;

    return-object v0
.end method

.method public abstract a(Lcom/baidu/mapapi/search/core/SearchResult;Ljava/lang/Object;)V
.end method

.method public a(Lcom/baidu/platform/base/SearchType;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/platform/base/d;->a:Lcom/baidu/platform/base/SearchType;

    return-void
.end method

.method protected a(Ljava/lang/String;Lcom/baidu/mapapi/search/core/SearchResult;Z)Z
    .locals 2

    const/4 v0, 0x1

    if-eqz p1, :cond_4

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_4

    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    if-eqz p3, :cond_1

    const-string p1, "status"

    :goto_0
    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    goto :goto_1

    :cond_1
    const-string p1, "status_sp"

    goto :goto_0

    :goto_1
    if-eqz p1, :cond_3

    const/16 p3, 0xc8

    if-eq p1, p3, :cond_2

    const/16 p3, 0xe6

    if-eq p1, p3, :cond_2

    packed-switch p1, :pswitch_data_0

    sget-object p1, Lcom/baidu/mapapi/search/core/SearchResult$ERRORNO;->RESULT_NOT_FOUND:Lcom/baidu/mapapi/search/core/SearchResult$ERRORNO;

    :goto_2
    iput-object p1, p2, Lcom/baidu/mapapi/search/core/SearchResult;->error:Lcom/baidu/mapapi/search/core/SearchResult$ERRORNO;

    goto :goto_3

    :pswitch_0
    sget-object p1, Lcom/baidu/mapapi/search/core/SearchResult$ERRORNO;->PERMISSION_UNFINISHED:Lcom/baidu/mapapi/search/core/SearchResult$ERRORNO;

    goto :goto_2

    :cond_2
    sget-object p1, Lcom/baidu/mapapi/search/core/SearchResult$ERRORNO;->KEY_ERROR:Lcom/baidu/mapapi/search/core/SearchResult$ERRORNO;

    goto :goto_2

    :goto_3
    return v0

    :cond_3
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_4
    sget-object p1, Lcom/baidu/mapapi/search/core/SearchResult$ERRORNO;->SEARCH_SERVER_INTERNAL_ERROR:Lcom/baidu/mapapi/search/core/SearchResult$ERRORNO;

    iput-object p1, p2, Lcom/baidu/mapapi/search/core/SearchResult;->error:Lcom/baidu/mapapi/search/core/SearchResult$ERRORNO;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    sget-object p1, Lcom/baidu/mapapi/search/core/SearchResult$ERRORNO;->RESULT_NOT_FOUND:Lcom/baidu/mapapi/search/core/SearchResult$ERRORNO;

    iput-object p1, p2, Lcom/baidu/mapapi/search/core/SearchResult;->error:Lcom/baidu/mapapi/search/core/SearchResult$ERRORNO;

    return v0

    :pswitch_data_0
    .packed-switch 0x68
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
