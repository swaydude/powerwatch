.class public Lcom/baidu/mapsdkplatform/comapi/map/ae;
.super Landroid/view/TextureView;

# interfaces
.implements Landroid/view/GestureDetector$OnDoubleTapListener;
.implements Landroid/view/GestureDetector$OnGestureListener;
.implements Landroid/view/TextureView$SurfaceTextureListener;
.implements Lcom/baidu/mapsdkplatform/comapi/map/o$a;


# static fields
.field public static a:I

.field public static b:I

.field public static c:I


# instance fields
.field private d:Landroid/view/GestureDetector;

.field private e:Landroid/os/Handler;

.field private f:Z

.field private g:Landroid/graphics/SurfaceTexture;

.field private h:Lcom/baidu/mapsdkplatform/comapi/map/o;

.field private i:Lcom/baidu/mapsdkplatform/comapi/map/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/baidu/mapsdkplatform/comapi/map/ab;Ljava/lang/String;I)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->f:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->h:Lcom/baidu/mapsdkplatform/comapi/map/o;

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Landroid/content/Context;Lcom/baidu/mapsdkplatform/comapi/map/ab;Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic a(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/e;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    return-object p0
.end method

.method private a(Landroid/content/Context;Lcom/baidu/mapsdkplatform/comapi/map/ab;Ljava/lang/String;I)V
    .locals 1

    invoke-virtual {p0, p0}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    if-eqz p1, :cond_1

    new-instance v0, Landroid/view/GestureDetector;

    invoke-direct {v0, p1, p0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->d:Landroid/view/GestureDetector;

    invoke-static {p1}, Lcom/baidu/mapapi/common/EnvironmentUtilities;->initAppDirectory(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-direct {v0, p1, p3, p4}, Lcom/baidu/mapsdkplatform/comapi/map/e;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    :cond_0
    iget-object p3, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(I)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a()V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {p1, p2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/ab;)V

    invoke-direct {p0}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->e()V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->e:Landroid/os/Handler;

    invoke-virtual {p1, p2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Landroid/os/Handler;)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->f()V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "BDMapSDKException: when you create an mapview, the context can not be null"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic b(Lcom/baidu/mapsdkplatform/comapi/map/ae;)Lcom/baidu/mapsdkplatform/comapi/map/o;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->h:Lcom/baidu/mapsdkplatform/comapi/map/o;

    return-object p0
.end method

.method private e()V
    .locals 1

    new-instance v0, Lcom/baidu/mapsdkplatform/comapi/map/af;

    invoke-direct {v0, p0}, Lcom/baidu/mapsdkplatform/comapi/map/af;-><init>(Lcom/baidu/mapsdkplatform/comapi/map/ae;)V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->e:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 5

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    sget v1, Lcom/baidu/mapsdkplatform/comapi/map/ae;->c:I

    const/4 v2, 0x1

    if-gt v1, v2, :cond_1

    iget-wide v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->j:J

    sget v3, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a:I

    sget v4, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b:I

    invoke-static {v0, v1, v3, v4}, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->nativeResize(JII)V

    sget v0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->c:I

    add-int/2addr v0, v2

    sput v0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->c:I

    :cond_1
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-wide v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->j:J

    invoke-static {v0, v1}, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->nativeRender(J)I

    move-result v0

    return v0
.end method

.method public a(I)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/baidu/mapsdkplatform/comapi/map/n;->f()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->e:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(Landroid/os/Handler;)V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->c(I)V

    iput-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    :cond_2
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->e:Landroid/os/Handler;

    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->h:Lcom/baidu/mapsdkplatform/comapi/map/o;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/o;->c()V

    iput-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->h:Lcom/baidu/mapsdkplatform/comapi/map/o;

    :cond_3
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->g:Landroid/graphics/SurfaceTexture;

    if-eqz p1, :cond_5

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x13

    if-lt p1, v0, :cond_4

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->g:Landroid/graphics/SurfaceTexture;

    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->release()V

    :cond_4
    iput-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->g:Landroid/graphics/SurfaceTexture;

    :cond_5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Ljava/lang/String;Landroid/graphics/Rect;)V
    .locals 7

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_9

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v0, 0x0

    if-eqz p2, :cond_8

    iget v1, p2, Landroid/graphics/Rect;->left:I

    sget v2, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b:I

    iget v3, p2, Landroid/graphics/Rect;->bottom:I

    if-ge v2, v3, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    sget v2, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b:I

    iget v3, p2, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v2, v3

    :goto_0
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v3

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v4

    if-ltz v1, :cond_7

    if-ltz v2, :cond_7

    if-lez v3, :cond_7

    if-gtz v4, :cond_2

    goto :goto_2

    :cond_2
    sget v5, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a:I

    if-le v3, v5, :cond_3

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    iget v5, p2, Landroid/graphics/Rect;->right:I

    sget v6, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a:I

    sub-int/2addr v5, v6

    sub-int/2addr v3, v5

    :cond_3
    sget v5, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b:I

    if-le v4, v5, :cond_4

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    sget v5, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b:I

    sub-int/2addr p2, v5

    sub-int/2addr v4, p2

    :cond_4
    invoke-static {}, Lcom/baidu/mapapi/common/SysOSUtil;->getScreenSizeX()I

    move-result p2

    if-gt v1, p2, :cond_6

    invoke-static {}, Lcom/baidu/mapapi/common/SysOSUtil;->getScreenSizeY()I

    move-result p2

    if-le v2, p2, :cond_5

    goto :goto_1

    :cond_5
    sput v3, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a:I

    sput v4, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b:I

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    const-string v0, "x"

    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "y"

    invoke-virtual {p2, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "width"

    invoke-virtual {p2, v0, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "height"

    invoke-virtual {p2, v0, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {v0, p1, p2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->h:Lcom/baidu/mapsdkplatform/comapi/map/o;

    if-eqz p1, :cond_9

    goto :goto_3

    :cond_6
    :goto_1
    iget-object p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object p2, p2, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {p2, p1, v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->h:Lcom/baidu/mapsdkplatform/comapi/map/o;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/o;->a()V

    :cond_7
    :goto_2
    return-void

    :cond_8
    iget-object p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object p2, p2, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {p2, p1, v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->h:Lcom/baidu/mapsdkplatform/comapi/map/o;

    if-eqz p1, :cond_9

    :goto_3
    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/o;->a()V

    :cond_9
    :goto_4
    return-void
.end method

.method public b()Lcom/baidu/mapsdkplatform/comapi/map/e;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    return-object v0
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lcom/baidu/mapsdkplatform/comapi/map/n;->d()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->g()V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->d()V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->n()V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->h:Lcom/baidu/mapsdkplatform/comapi/map/o;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/o;->a()V

    :cond_3
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->f:Z

    :cond_4
    :goto_1
    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->f:Z

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->c()V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->c()V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->h:Lcom/baidu/mapsdkplatform/comapi/map/o;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/o;->b()V

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :goto_0
    return-void
.end method

.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 4

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-boolean v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->k:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {v0, v2, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(II)Lcom/baidu/mapapi/model/inner/GeoPoint;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v2, v2, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v2, v2, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v3, :cond_1

    invoke-interface {v3, p1}, Lcom/baidu/mapsdkplatform/comapi/map/n;->b(Lcom/baidu/mapapi/model/inner/GeoPoint;)V

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-boolean v2, v2, Lcom/baidu/mapsdkplatform/comapi/map/e;->f:Z

    if-eqz v2, :cond_4

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v0

    iget v2, v0, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a:F

    const/high16 v3, 0x3f800000    # 1.0f

    add-float/2addr v2, v3

    iput v2, v0, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a:F

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-boolean v2, v2, Lcom/baidu/mapsdkplatform/comapi/map/e;->g:Z

    if-nez v2, :cond_3

    invoke-virtual {p1}, Lcom/baidu/mapapi/model/inner/GeoPoint;->getLongitudeE6()D

    move-result-wide v2

    iput-wide v2, v0, Lcom/baidu/mapsdkplatform/comapi/map/ad;->d:D

    invoke-virtual {p1}, Lcom/baidu/mapapi/model/inner/GeoPoint;->getLatitudeE6()D

    move-result-wide v2

    iput-wide v2, v0, Lcom/baidu/mapsdkplatform/comapi/map/ad;->e:D

    :cond_3
    sget p1, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    or-int/2addr p1, v1

    sput p1, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    const/16 v2, 0x12c

    invoke-virtual {p1, v0, v2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/ad;I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sput-wide v2, Lcom/baidu/mapsdkplatform/comapi/map/e;->m:J

    return v1

    :cond_4
    return v0

    :cond_5
    :goto_1
    return v1
.end method

.method public onDoubleTapEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 2

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    const/4 v0, 0x1

    if-eqz p1, :cond_3

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-boolean p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->k:Z

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-boolean p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->e:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    mul-float p3, p3, p3

    mul-float p4, p4, p4

    add-float/2addr p3, p4

    float-to-double p3, p3

    invoke-static {p3, p4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p3

    double-to-float p1, p3

    const/high16 p3, 0x43fa0000    # 500.0f

    cmpg-float p3, p1, p3

    if-gtz p3, :cond_1

    return v1

    :cond_1
    sget p3, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    or-int/2addr p3, v0

    sput p3, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    iget-object p3, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {p3}, Lcom/baidu/mapsdkplatform/comapi/map/e;->A()V

    iget-object p3, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    const/16 p4, 0x22

    const v1, 0x3f19999a    # 0.6f

    mul-float p1, p1, v1

    float-to-int p1, p1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    shl-int/lit8 v1, v1, 0x10

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p2

    float-to-int p2, p2

    or-int/2addr p2, v1

    invoke-virtual {p3, p4, p1, p2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(III)I

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->M()V

    return v0

    :cond_2
    return v1

    :cond_3
    :goto_0
    return v0
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 6

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_5

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-boolean v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->k:Z

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    const/4 v1, -0x1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    float-to-int v3, v3

    iget-object v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget v4, v4, Lcom/baidu/mapsdkplatform/comapi/map/e;->l:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(IIII)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-nez v1, :cond_1

    return-void

    :cond_1
    if-eqz v0, :cond_3

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/baidu/mapsdkplatform/comapi/map/n;

    invoke-interface {v2, v0}, Lcom/baidu/mapsdkplatform/comapi/map/n;->b(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    const/4 v3, 0x1

    iput-boolean v3, v2, Lcom/baidu/mapsdkplatform/comapi/map/e;->p:Z

    goto :goto_0

    :cond_2
    iget-object v3, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    float-to-int v5, v5

    invoke-virtual {v3, v4, v5}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(II)Lcom/baidu/mapapi/model/inner/GeoPoint;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/baidu/mapsdkplatform/comapi/map/n;->c(Lcom/baidu/mapapi/model/inner/GeoPoint;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/mapsdkplatform/comapi/map/n;

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v2, v3, v4}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(II)Lcom/baidu/mapapi/model/inner/GeoPoint;

    move-result-object v2

    if-eqz v1, :cond_4

    invoke-interface {v1, v2}, Lcom/baidu/mapsdkplatform/comapi/map/n;->c(Lcom/baidu/mapapi/model/inner/GeoPoint;)V

    goto :goto_1

    :cond_5
    :goto_2
    return-void
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 6

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-boolean v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->k:Z

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    const/4 v2, -0x1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    iget-object v5, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget v5, v5, Lcom/baidu/mapsdkplatform/comapi/map/e;->l:I

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(IIII)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    const-string v3, ""

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string v0, "px"

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v3, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "py"

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {v3, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    move-object v2, v3

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    move-object v3, v2

    :goto_1
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v3, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/baidu/mapsdkplatform/comapi/map/n;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v2, :cond_4

    iget-object v3, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    float-to-int v5, v5

    invoke-virtual {v3, v4, v5}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(II)Lcom/baidu/mapapi/model/inner/GeoPoint;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/baidu/mapsdkplatform/comapi/map/n;->a(Lcom/baidu/mapapi/model/inner/GeoPoint;)V

    goto :goto_3

    :cond_5
    :goto_4
    return v1
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 4

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->g:Landroid/graphics/SurfaceTexture;

    if-nez v0, :cond_6

    iput-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->g:Landroid/graphics/SurfaceTexture;

    new-instance p1, Lcom/baidu/mapsdkplatform/comapi/map/o;

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->g:Landroid/graphics/SurfaceTexture;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    invoke-direct {p1, v0, p0, v1, p0}, Lcom/baidu/mapsdkplatform/comapi/map/o;-><init>(Landroid/graphics/SurfaceTexture;Lcom/baidu/mapsdkplatform/comapi/map/o$a;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/baidu/mapsdkplatform/comapi/map/ae;)V

    iput-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->h:Lcom/baidu/mapsdkplatform/comapi/map/o;

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/o;->start()V

    sput p2, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a:I

    sput p3, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b:I

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->f:I

    const/4 v1, -0x1

    if-eqz v0, :cond_2

    iget v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->f:I

    if-eq v0, v1, :cond_2

    iget v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->f:I

    iget-object v2, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->j:Lcom/baidu/mapapi/map/WinRound;

    iget v2, v2, Lcom/baidu/mapapi/map/WinRound;->left:I

    iget-object v3, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->j:Lcom/baidu/mapapi/map/WinRound;

    iget v3, v3, Lcom/baidu/mapapi/map/WinRound;->right:I

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    if-ne v0, v2, :cond_3

    :cond_2
    iput v1, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->f:I

    :cond_3
    iget v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->g:I

    if-eqz v0, :cond_4

    iget v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->g:I

    if-eq v0, v1, :cond_4

    iget v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->g:I

    iget-object v2, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->j:Lcom/baidu/mapapi/map/WinRound;

    iget v2, v2, Lcom/baidu/mapapi/map/WinRound;->bottom:I

    iget-object v3, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->j:Lcom/baidu/mapapi/map/WinRound;

    iget v3, v3, Lcom/baidu/mapapi/map/WinRound;->top:I

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    if-ne v0, v2, :cond_5

    :cond_4
    iput v1, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->g:I

    :cond_5
    iget-object v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->j:Lcom/baidu/mapapi/map/WinRound;

    const/4 v1, 0x0

    iput v1, v0, Lcom/baidu/mapapi/map/WinRound;->left:I

    iget-object v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->j:Lcom/baidu/mapapi/map/WinRound;

    iput v1, v0, Lcom/baidu/mapapi/map/WinRound;->top:I

    iget-object v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->j:Lcom/baidu/mapapi/map/WinRound;

    iput p3, v0, Lcom/baidu/mapapi/map/WinRound;->bottom:I

    iget-object p3, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->j:Lcom/baidu/mapapi/map/WinRound;

    iput p2, p3, Lcom/baidu/mapapi/map/WinRound;->right:I

    iget-object p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {p2, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/ad;)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    sget p2, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a:I

    sget p3, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b:I

    invoke-virtual {p1, p2, p3}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(II)V

    goto :goto_0

    :cond_6
    invoke-virtual {p0, v0}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->setSurfaceTexture(Landroid/graphics/SurfaceTexture;)V

    :goto_0
    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 4

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez p1, :cond_0

    return-void

    :cond_0
    sput p2, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a:I

    sput p3, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b:I

    const/4 v0, 0x1

    sput v0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->c:I

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object p1

    iget v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->f:I

    const/4 v1, -0x1

    if-eqz v0, :cond_1

    iget v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->f:I

    if-eq v0, v1, :cond_1

    iget v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->f:I

    iget-object v2, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->j:Lcom/baidu/mapapi/map/WinRound;

    iget v2, v2, Lcom/baidu/mapapi/map/WinRound;->left:I

    iget-object v3, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->j:Lcom/baidu/mapapi/map/WinRound;

    iget v3, v3, Lcom/baidu/mapapi/map/WinRound;->right:I

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    if-ne v0, v2, :cond_2

    :cond_1
    iput v1, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->f:I

    :cond_2
    iget v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->g:I

    if-eqz v0, :cond_3

    iget v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->g:I

    if-eq v0, v1, :cond_3

    iget v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->g:I

    iget-object v2, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->j:Lcom/baidu/mapapi/map/WinRound;

    iget v2, v2, Lcom/baidu/mapapi/map/WinRound;->bottom:I

    iget-object v3, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->j:Lcom/baidu/mapapi/map/WinRound;

    iget v3, v3, Lcom/baidu/mapapi/map/WinRound;->top:I

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    if-ne v0, v2, :cond_4

    :cond_3
    iput v1, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->g:I

    :cond_4
    iget-object v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->j:Lcom/baidu/mapapi/map/WinRound;

    const/4 v1, 0x0

    iput v1, v0, Lcom/baidu/mapapi/map/WinRound;->left:I

    iget-object v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->j:Lcom/baidu/mapapi/map/WinRound;

    iput v1, v0, Lcom/baidu/mapapi/map/WinRound;->top:I

    iget-object v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->j:Lcom/baidu/mapapi/map/WinRound;

    iput p3, v0, Lcom/baidu/mapapi/map/WinRound;->bottom:I

    iget-object v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->j:Lcom/baidu/mapapi/map/WinRound;

    iput p2, v0, Lcom/baidu/mapapi/map/WinRound;->right:I

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/ad;)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    sget v0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a:I

    sget v1, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b:I

    invoke-virtual {p1, v0, v1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(II)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-wide v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->j:J

    invoke-static {v0, v1, p2, p3}, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->nativeResize(JII)V

    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    iget-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->f:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->h:Lcom/baidu/mapsdkplatform/comapi/map/o;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/o;->a()V

    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-super {p0, p1}, Landroid/view/TextureView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v2, :cond_1

    invoke-interface {v2, p1}, Lcom/baidu/mapsdkplatform/comapi/map/n;->a(Landroid/view/MotionEvent;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->d:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_3

    return v1

    :cond_3
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/ae;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_4
    :goto_1
    return v1
.end method
