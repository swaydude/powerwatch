.class Lcom/baidu/mapapi/map/z;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/mapsdkplatform/comapi/map/h$a;


# instance fields
.field final synthetic a:Lcom/baidu/mapapi/map/MapView$CustomMapStyleCallBack;

.field final synthetic b:Lcom/baidu/mapapi/map/MapCustomStyleOptions;

.field final synthetic c:Lcom/baidu/mapapi/map/WearMapView;


# direct methods
.method constructor <init>(Lcom/baidu/mapapi/map/WearMapView;Lcom/baidu/mapapi/map/MapView$CustomMapStyleCallBack;Lcom/baidu/mapapi/map/MapCustomStyleOptions;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/z;->c:Lcom/baidu/mapapi/map/WearMapView;

    iput-object p2, p0, Lcom/baidu/mapapi/map/z;->a:Lcom/baidu/mapapi/map/MapView$CustomMapStyleCallBack;

    iput-object p3, p0, Lcom/baidu/mapapi/map/z;->b:Lcom/baidu/mapapi/map/MapCustomStyleOptions;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/z;->a:Lcom/baidu/mapapi/map/MapView$CustomMapStyleCallBack;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lcom/baidu/mapapi/map/MapView$CustomMapStyleCallBack;->onCustomMapStyleLoadFailed(ILjava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 p2, 0x1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/baidu/mapapi/map/z;->c:Lcom/baidu/mapapi/map/WearMapView;

    invoke-static {p1, p3, p2}, Lcom/baidu/mapapi/map/WearMapView;->a(Lcom/baidu/mapapi/map/WearMapView;Ljava/lang/String;I)V

    :goto_0
    iget-object p1, p0, Lcom/baidu/mapapi/map/z;->c:Lcom/baidu/mapapi/map/WearMapView;

    invoke-virtual {p1, p2}, Lcom/baidu/mapapi/map/WearMapView;->setMapCustomStyleEnable(Z)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/baidu/mapapi/map/z;->b:Lcom/baidu/mapapi/map/MapCustomStyleOptions;

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/MapCustomStyleOptions;->getLocalCustomStyleFilePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_2

    iget-object p3, p0, Lcom/baidu/mapapi/map/z;->c:Lcom/baidu/mapapi/map/WearMapView;

    const/4 v0, 0x0

    invoke-static {p3, p1, v0}, Lcom/baidu/mapapi/map/WearMapView;->a(Lcom/baidu/mapapi/map/WearMapView;Ljava/lang/String;I)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/map/z;->a:Lcom/baidu/mapapi/map/MapView$CustomMapStyleCallBack;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/baidu/mapapi/map/MapView$CustomMapStyleCallBack;->onPreLoadLastCustomMapStyle(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/baidu/mapapi/map/z;->c:Lcom/baidu/mapapi/map/WearMapView;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lcom/baidu/mapapi/map/WearMapView;->a(Lcom/baidu/mapapi/map/WearMapView;Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/baidu/mapapi/map/z;->c:Lcom/baidu/mapapi/map/WearMapView;

    invoke-virtual {p1, v1}, Lcom/baidu/mapapi/map/WearMapView;->setMapCustomStyleEnable(Z)V

    :cond_1
    return-void
.end method

.method public a(ZLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/z;->a:Lcom/baidu/mapapi/map/MapView$CustomMapStyleCallBack;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/baidu/mapapi/map/MapView$CustomMapStyleCallBack;->onCustomMapStyleLoadSuccess(ZLjava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/baidu/mapapi/map/z;->c:Lcom/baidu/mapapi/map/WearMapView;

    const/4 v0, 0x1

    invoke-static {p1, p2, v0}, Lcom/baidu/mapapi/map/WearMapView;->a(Lcom/baidu/mapapi/map/WearMapView;Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/baidu/mapapi/map/z;->c:Lcom/baidu/mapapi/map/WearMapView;

    invoke-virtual {p1, v0}, Lcom/baidu/mapapi/map/WearMapView;->setMapCustomStyleEnable(Z)V

    :cond_1
    return-void
.end method
