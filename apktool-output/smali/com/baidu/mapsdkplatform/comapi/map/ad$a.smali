.class public Lcom/baidu/mapsdkplatform/comapi/map/ad$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/mapsdkplatform/comapi/map/ad;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:J

.field public d:J

.field public e:Lcom/baidu/mapapi/model/inner/Point;

.field public f:Lcom/baidu/mapapi/model/inner/Point;

.field public g:Lcom/baidu/mapapi/model/inner/Point;

.field public h:Lcom/baidu/mapapi/model/inner/Point;

.field final synthetic i:Lcom/baidu/mapsdkplatform/comapi/map/ad;


# direct methods
.method public constructor <init>(Lcom/baidu/mapsdkplatform/comapi/map/ad;)V
    .locals 2

    iput-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ad$a;->i:Lcom/baidu/mapsdkplatform/comapi/map/ad;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ad$a;->a:J

    iput-wide v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ad$a;->b:J

    iput-wide v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ad$a;->c:J

    iput-wide v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ad$a;->d:J

    new-instance p1, Lcom/baidu/mapapi/model/inner/Point;

    const/4 v0, 0x0

    invoke-direct {p1, v0, v0}, Lcom/baidu/mapapi/model/inner/Point;-><init>(II)V

    iput-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ad$a;->e:Lcom/baidu/mapapi/model/inner/Point;

    new-instance p1, Lcom/baidu/mapapi/model/inner/Point;

    invoke-direct {p1, v0, v0}, Lcom/baidu/mapapi/model/inner/Point;-><init>(II)V

    iput-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ad$a;->f:Lcom/baidu/mapapi/model/inner/Point;

    new-instance p1, Lcom/baidu/mapapi/model/inner/Point;

    invoke-direct {p1, v0, v0}, Lcom/baidu/mapapi/model/inner/Point;-><init>(II)V

    iput-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ad$a;->g:Lcom/baidu/mapapi/model/inner/Point;

    new-instance p1, Lcom/baidu/mapapi/model/inner/Point;

    invoke-direct {p1, v0, v0}, Lcom/baidu/mapapi/model/inner/Point;-><init>(II)V

    iput-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ad$a;->h:Lcom/baidu/mapapi/model/inner/Point;

    return-void
.end method
