.class public Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer$a;
    }
.end annotation


# static fields
.field private static final d:Ljava/lang/String; = "MapRenderer"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field private e:J

.field private f:Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer$a;

.field private final g:Lcom/baidu/mapsdkplatform/comapi/map/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/baidu/mapsdkplatform/comapi/map/l;Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->f:Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer$a;

    iput-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->g:Lcom/baidu/mapsdkplatform/comapi/map/l;

    return-void
.end method

.method private a(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 2

    const/16 p1, 0x4100

    invoke-static {p1}, Landroid/opengl/GLES20;->glClear(I)V

    const p1, 0x3f59999a    # 0.85f

    const v0, 0x3f4ccccd    # 0.8f

    const/4 v1, 0x0

    invoke-static {p1, v0, v0, v1}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    return-void
.end method

.method private a()Z
    .locals 5

    iget-wide v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->e:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static native nativeInit(J)V
.end method

.method public static native nativeRender(J)I
.end method

.method public static native nativeResize(JII)V
.end method


# virtual methods
.method public a(J)V
    .locals 0

    iput-wide p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->e:J

    return-void
.end method

.method public onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 5

    invoke-direct {p0}, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->a()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->a(Ljavax/microedition/khronos/opengles/GL10;)V

    return-void

    :cond_0
    iget v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->c:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    iget-wide v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->e:J

    iget v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->a:I

    iget v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->b:I

    invoke-static {v2, v3, v0, v4}, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->nativeResize(JII)V

    iget v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->c:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->c:I

    :cond_1
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->f:Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer$a;

    invoke-interface {v0}, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer$a;->f()V

    iget-wide v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->e:J

    invoke-static {v2, v3}, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->nativeRender(J)I

    move-result v0

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->g:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-virtual {v2}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a()Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v2

    if-nez v2, :cond_2

    return-void

    :cond_2
    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->g:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-virtual {v2}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a()Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v2

    iget-object v2, v2, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->g:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-virtual {v2}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a()Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v2

    iget-object v2, v2, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/baidu/mapsdkplatform/comapi/map/n;

    iget-object v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->g:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-virtual {v4}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a()Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v4

    if-nez v4, :cond_4

    return-void

    :cond_4
    iget-object v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->g:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-virtual {v4}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a()Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v4

    invoke-virtual {v4}, Lcom/baidu/mapsdkplatform/comapi/map/e;->J()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v4

    if-eqz v3, :cond_3

    invoke-interface {v3, p1, v4}, Lcom/baidu/mapsdkplatform/comapi/map/n;->a(Ljavax/microedition/khronos/opengles/GL10;Lcom/baidu/mapsdkplatform/comapi/map/ad;)V

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->g:Lcom/baidu/mapsdkplatform/comapi/map/l;

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->requestRender()V

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a()Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->getRenderMode()I

    move-result v0

    if-eqz v0, :cond_8

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/baidu/mapsdkplatform/comapi/map/l;->setRenderMode(I)V

    goto :goto_1

    :cond_7
    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->getRenderMode()I

    move-result v0

    if-eq v0, v1, :cond_8

    invoke-virtual {p1, v1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->setRenderMode(I)V

    :cond_8
    :goto_1
    return-void
.end method

.method public onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 4

    iget-wide v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->e:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    invoke-static {v0, v1, p2, p3}, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->nativeResize(JII)V

    :cond_0
    return-void
.end method

.method public onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 0

    iget-wide p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->e:J

    invoke-static {p1, p2}, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->nativeInit(J)V

    invoke-direct {p0}, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->a()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->f:Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer$a;

    invoke-interface {p1}, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer$a;->f()V

    return-void
.end method
