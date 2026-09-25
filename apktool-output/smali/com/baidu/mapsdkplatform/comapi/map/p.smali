.class public Lcom/baidu/mapsdkplatform/comapi/map/p;
.super Lcom/baidu/mapsdkplatform/comapi/map/ai;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/baidu/mapsdkplatform/comapi/map/ai;-><init>()V

    const/4 v0, 0x6

    iput v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/p;->c:I

    const-string v0, "tile"

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/p;->b:Ljava/lang/String;

    const/16 v0, 0x1f4

    iput v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/p;->d:I

    const v0, 0x15bf4

    iput v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/p;->g:I

    return-void
.end method
