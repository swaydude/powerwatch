.class public Lcom/baidu/mapsdkplatform/comapi/map/al;
.super Lcom/baidu/mapsdkplatform/comapi/map/ai;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/baidu/mapsdkplatform/comapi/map/ai;-><init>()V

    const/4 v0, 0x6

    iput v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/al;->c:I

    const-string v0, "sdktile"

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/al;->b:Ljava/lang/String;

    const/16 v0, 0xa

    iput v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/al;->d:I

    const/16 v0, 0x17

    iput v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/al;->g:I

    return-void
.end method
