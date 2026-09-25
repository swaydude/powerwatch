.class public Lcom/baidu/mapapi/search/poi/PoiDetailSearchOption;
.super Ljava/lang/Object;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/baidu/mapapi/search/poi/PoiDetailSearchOption;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/baidu/mapapi/search/poi/PoiDetailSearchOption;->b:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/mapapi/search/poi/PoiDetailSearchOption;->c:Z

    return-void
.end method


# virtual methods
.method public getUid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/poi/PoiDetailSearchOption;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getUids()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/poi/PoiDetailSearchOption;->b:Ljava/lang/String;

    return-object v0
.end method

.method public isSearchByUids()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapapi/search/poi/PoiDetailSearchOption;->c:Z

    return v0
.end method

.method public poiUid(Ljava/lang/String;)Lcom/baidu/mapapi/search/poi/PoiDetailSearchOption;
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/mapapi/search/poi/PoiDetailSearchOption;->c:Z

    iput-object p1, p0, Lcom/baidu/mapapi/search/poi/PoiDetailSearchOption;->a:Ljava/lang/String;

    return-object p0
.end method

.method public poiUids(Ljava/lang/String;)Lcom/baidu/mapapi/search/poi/PoiDetailSearchOption;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/mapapi/search/poi/PoiDetailSearchOption;->c:Z

    iput-object p1, p0, Lcom/baidu/mapapi/search/poi/PoiDetailSearchOption;->b:Ljava/lang/String;

    return-object p0
.end method
