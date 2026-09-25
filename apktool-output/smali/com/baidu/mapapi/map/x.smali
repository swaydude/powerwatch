.class Lcom/baidu/mapapi/map/x;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/baidu/mapapi/map/TextureMapView;


# direct methods
.method constructor <init>(Lcom/baidu/mapapi/map/TextureMapView;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/x;->a:Lcom/baidu/mapapi/map/TextureMapView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, Lcom/baidu/mapapi/map/x;->a:Lcom/baidu/mapapi/map/TextureMapView;

    invoke-static {p1}, Lcom/baidu/mapapi/map/TextureMapView;->a(Lcom/baidu/mapapi/map/TextureMapView;)Lcom/baidu/mapsdkplatform/comapi/map/ae;

    move-result-object p1

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b()Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iget p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->a:F

    iget-object v0, p0, Lcom/baidu/mapapi/map/x;->a:Lcom/baidu/mapapi/map/TextureMapView;

    invoke-static {v0}, Lcom/baidu/mapapi/map/TextureMapView;->a(Lcom/baidu/mapapi/map/TextureMapView;)Lcom/baidu/mapsdkplatform/comapi/map/ae;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b()Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v0

    iget v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a:F

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v1, v2

    iput v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a:F

    iget v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a:F

    cmpl-float v1, v1, p1

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    iget p1, v0, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a:F

    :goto_0
    iput p1, v0, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a:F

    sget p1, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    or-int/lit8 p1, p1, 0x10

    sput p1, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    iget-object p1, p0, Lcom/baidu/mapapi/map/x;->a:Lcom/baidu/mapapi/map/TextureMapView;

    invoke-static {p1}, Lcom/baidu/mapapi/map/TextureMapView;->a(Lcom/baidu/mapapi/map/TextureMapView;)Lcom/baidu/mapsdkplatform/comapi/map/ae;

    move-result-object p1

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b()Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    const/16 v1, 0x12c

    invoke-virtual {p1, v0, v1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/ad;I)V

    return-void
.end method
