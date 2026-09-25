.class public final Lcom/baidu/mapsdkplatform/comapi/map/ab;
.super Ljava/lang/Object;


# instance fields
.field a:Lcom/baidu/mapsdkplatform/comapi/map/ad;

.field b:Z

.field c:I

.field d:Z

.field e:Z

.field f:Z

.field g:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/baidu/mapsdkplatform/comapi/map/ad;

    invoke-direct {v0}, Lcom/baidu/mapsdkplatform/comapi/map/ad;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ab;->a:Lcom/baidu/mapsdkplatform/comapi/map/ad;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ab;->b:Z

    iput v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ab;->c:I

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ab;->d:Z

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ab;->e:Z

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ab;->f:Z

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ab;->g:Z

    return-void
.end method


# virtual methods
.method public a(I)Lcom/baidu/mapsdkplatform/comapi/map/ab;
    .locals 0

    iput p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ab;->c:I

    return-object p0
.end method

.method public a(Lcom/baidu/mapsdkplatform/comapi/map/ad;)Lcom/baidu/mapsdkplatform/comapi/map/ab;
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ab;->a:Lcom/baidu/mapsdkplatform/comapi/map/ad;

    return-object p0
.end method

.method public a(Z)Lcom/baidu/mapsdkplatform/comapi/map/ab;
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ab;->b:Z

    return-object p0
.end method

.method public b(Z)Lcom/baidu/mapsdkplatform/comapi/map/ab;
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ab;->d:Z

    return-object p0
.end method

.method public c(Z)Lcom/baidu/mapsdkplatform/comapi/map/ab;
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ab;->e:Z

    return-object p0
.end method

.method public d(Z)Lcom/baidu/mapsdkplatform/comapi/map/ab;
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ab;->f:Z

    return-object p0
.end method

.method public e(Z)Lcom/baidu/mapsdkplatform/comapi/map/ab;
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ab;->g:Z

    return-object p0
.end method
