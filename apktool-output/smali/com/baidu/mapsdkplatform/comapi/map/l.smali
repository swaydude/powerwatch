.class public Lcom/baidu/mapsdkplatform/comapi/map/l;
.super Landroid/opengl/GLSurfaceView;

# interfaces
.implements Landroid/view/GestureDetector$OnDoubleTapListener;
.implements Landroid/view/GestureDetector$OnGestureListener;
.implements Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/mapsdkplatform/comapi/map/l$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String; = "l"


# instance fields
.field private b:Landroid/os/Handler;

.field private c:Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;

.field private d:I

.field private e:I

.field private f:Landroid/view/GestureDetector;

.field private g:Lcom/baidu/mapsdkplatform/comapi/map/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/baidu/mapsdkplatform/comapi/map/ab;Ljava/lang/String;I)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;)V

    if-eqz p1, :cond_1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/baidu/mapsdkplatform/comapi/map/l;->setEGLContextClientVersion(I)V

    new-instance v0, Landroid/view/GestureDetector;

    invoke-direct {v0, p1, p0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->f:Landroid/view/GestureDetector;

    invoke-static {p1}, Lcom/baidu/mapapi/common/EnvironmentUtilities;->initAppDirectory(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-direct {v0, p1, p3, p4}, Lcom/baidu/mapsdkplatform/comapi/map/e;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    :cond_0
    iget-object p3, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(I)V

    invoke-direct {p0}, Lcom/baidu/mapsdkplatform/comapi/map/l;->g()V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a()V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {p1, p2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/ab;)V

    invoke-direct {p0}, Lcom/baidu/mapsdkplatform/comapi/map/l;->h()V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->b:Landroid/os/Handler;

    invoke-virtual {p1, p2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Landroid/os/Handler;)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->f()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->setBackgroundColor(I)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "BDMapSDKException: when you create an mapview, the context can not be null"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic a(Lcom/baidu/mapsdkplatform/comapi/map/l;)Lcom/baidu/mapsdkplatform/comapi/map/e;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    return-object p0
.end method

.method private static a(IIIIII)Z
    .locals 9

    invoke-static {}, Ljavax/microedition/khronos/egl/EGLContext;->getEGL()Ljavax/microedition/khronos/egl/EGL;

    move-result-object v0

    check-cast v0, Ljavax/microedition/khronos/egl/EGL10;

    sget-object v1, Ljavax/microedition/khronos/egl/EGL10;->EGL_DEFAULT_DISPLAY:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljavax/microedition/khronos/egl/EGL10;->eglGetDisplay(Ljava/lang/Object;)Ljavax/microedition/khronos/egl/EGLDisplay;

    move-result-object v1

    const/4 v2, 0x2

    new-array v3, v2, [I

    invoke-interface {v0, v1, v3}, Ljavax/microedition/khronos/egl/EGL10;->eglInitialize(Ljavax/microedition/khronos/egl/EGLDisplay;[I)Z

    const/16 v3, 0x64

    new-array v3, v3, [Ljavax/microedition/khronos/egl/EGLConfig;

    const/4 v4, 0x1

    new-array v5, v4, [I

    const/16 v6, 0xd

    new-array v6, v6, [I

    const/16 v7, 0x3024

    const/4 v8, 0x0

    aput v7, v6, v8

    aput p0, v6, v4

    const/16 p0, 0x3023

    aput p0, v6, v2

    const/4 p0, 0x3

    aput p1, v6, p0

    const/4 p0, 0x4

    const/16 p1, 0x3022

    aput p1, v6, p0

    const/4 p0, 0x5

    aput p2, v6, p0

    const/4 p0, 0x6

    const/16 p1, 0x3021

    aput p1, v6, p0

    const/4 p0, 0x7

    aput p3, v6, p0

    const/16 p0, 0x8

    const/16 p1, 0x3025

    aput p1, v6, p0

    const/16 p0, 0x9

    aput p4, v6, p0

    const/16 p0, 0xa

    const/16 p1, 0x3026

    aput p1, v6, p0

    const/16 p0, 0xb

    aput p5, v6, p0

    const/16 p0, 0xc

    const/16 p1, 0x3038

    aput p1, v6, p0

    const/16 p4, 0x64

    move-object p0, v0

    move-object p1, v1

    move-object p2, v6

    move-object p3, v3

    move-object p5, v5

    invoke-interface/range {p0 .. p5}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    move-result p0

    if-eqz p0, :cond_0

    aget p0, v5, v8

    if-lez p0, :cond_0

    return v4

    :cond_0
    return v8
.end method

.method static synthetic b(Lcom/baidu/mapsdkplatform/comapi/map/l;)I
    .locals 0

    iget p0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->d:I

    return p0
.end method

.method static synthetic c(Lcom/baidu/mapsdkplatform/comapi/map/l;)I
    .locals 0

    iget p0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->e:I

    return p0
.end method

.method private g()V
    .locals 14

    const/16 v0, 0x8

    const/16 v1, 0x8

    const/16 v2, 0x8

    const/16 v3, 0x8

    const/16 v4, 0x18

    const/4 v5, 0x0

    const/4 v6, 0x1

    :try_start_0
    invoke-static/range {v0 .. v5}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(IIIIII)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v8, 0x8

    const/16 v9, 0x8

    const/16 v10, 0x8

    const/16 v11, 0x8

    const/16 v12, 0x18

    const/4 v13, 0x0

    move-object v7, p0

    invoke-virtual/range {v7 .. v13}, Lcom/baidu/mapsdkplatform/comapi/map/l;->setEGLConfigChooser(IIIIII)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x5

    const/4 v1, 0x6

    const/4 v2, 0x5

    const/4 v3, 0x0

    const/16 v4, 0x18

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(IIIIII)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v8, 0x5

    const/4 v9, 0x6

    const/4 v10, 0x5

    const/4 v11, 0x0

    const/16 v12, 0x18

    const/4 v13, 0x0

    move-object v7, p0

    invoke-virtual/range {v7 .. v13}, Lcom/baidu/mapsdkplatform/comapi/map/l;->setEGLConfigChooser(IIIIII)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v6}, Lcom/baidu/mapsdkplatform/comapi/map/l;->setEGLConfigChooser(Z)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p0, v6}, Lcom/baidu/mapsdkplatform/comapi/map/l;->setEGLConfigChooser(Z)V

    :goto_0
    new-instance v0, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;

    invoke-direct {v0, p0, p0}, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;-><init>(Lcom/baidu/mapsdkplatform/comapi/map/l;Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer$a;)V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->c:Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/e;->j:J

    invoke-virtual {v0, v1, v2}, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->a(J)V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->c:Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;

    invoke-virtual {p0, v0}, Lcom/baidu/mapsdkplatform/comapi/map/l;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    invoke-virtual {p0, v6}, Lcom/baidu/mapsdkplatform/comapi/map/l;->setRenderMode(I)V

    return-void
.end method

.method private h()V
    .locals 1

    new-instance v0, Lcom/baidu/mapsdkplatform/comapi/map/m;

    invoke-direct {v0, p0}, Lcom/baidu/mapsdkplatform/comapi/map/m;-><init>(Lcom/baidu/mapsdkplatform/comapi/map/l;)V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->b:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public a()Lcom/baidu/mapsdkplatform/comapi/map/e;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    return-object v0
.end method

.method public a(FF)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0, p1, p2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(FF)V

    :cond_1
    :goto_0
    return-void
.end method

.method public a(I)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    const/16 v1, 0x32

    iput v1, v0, Landroid/os/Message;->what:I

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/e;->j:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->q()Z

    move-result v1

    const/4 v2, 0x3

    if-ne p1, v2, :cond_1

    const/4 p1, 0x0

    :goto_0
    iput p1, v0, Landroid/os/Message;->arg1:I

    goto :goto_1

    :cond_1
    if-eqz v1, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->b:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public a(Ljava/lang/String;Landroid/graphics/Rect;)V
    .locals 7

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_9

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v0, 0x0

    if-eqz p2, :cond_8

    iget v1, p2, Landroid/graphics/Rect;->left:I

    iget v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->e:I

    iget v3, p2, Landroid/graphics/Rect;->bottom:I

    if-ge v2, v3, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    iget v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->e:I

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
    iget v5, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->d:I

    if-le v3, v5, :cond_3

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    iget v5, p2, Landroid/graphics/Rect;->right:I

    iget v6, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->d:I

    sub-int/2addr v5, v6

    sub-int/2addr v3, v5

    :cond_3
    iget v5, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->e:I

    if-le v4, v5, :cond_4

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    iget v5, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->e:I

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
    iput v3, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->d:I

    iput v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->e:I

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

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {v0, p1, p2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_3

    :cond_6
    :goto_1
    iget-object p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object p2, p2, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {p2, p1, v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/baidu/mapsdkplatform/comapi/map/l;->requestRender()V

    :cond_7
    :goto_2
    return-void

    :cond_8
    iget-object p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object p2, p2, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {p2, p1, v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    :goto_3
    invoke-virtual {p0}, Lcom/baidu/mapsdkplatform/comapi/map/l;->requestRender()V

    :cond_9
    :goto_4
    return-void
.end method

.method public a(FFFF)Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(FFFF)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->u()V

    return-void
.end method

.method public b(I)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v2, :cond_0

    invoke-interface {v2}, Lcom/baidu/mapsdkplatform/comapi/map/n;->f()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->b:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(Landroid/os/Handler;)V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->c(I)V

    iput-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    :cond_2
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->b:Landroid/os/Handler;

    if-eqz p1, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public b(FF)Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0, p1, p2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->d(FF)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->v()V

    return-void
.end method

.method public c(FF)Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0, p1, p2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->c(FF)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public d()V
    .locals 2

    invoke-virtual {p0}, Lcom/baidu/mapsdkplatform/comapi/map/l;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    const/4 v1, -0x3

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setFormat(I)V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->s()V

    return-void
.end method

.method public d(FF)Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    float-to-int p1, p1

    float-to-int p2, p2

    invoke-virtual {v0, p1, p2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->c(II)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public e()V
    .locals 2

    invoke-virtual {p0}, Lcom/baidu/mapsdkplatform/comapi/map/l;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setFormat(I)V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->t()V

    return-void
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 4

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-boolean v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->k:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

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

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v2, v2, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

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
    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-boolean v2, v2, Lcom/baidu/mapsdkplatform/comapi/map/e;->f:Z

    if-eqz v2, :cond_4

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v0

    iget v2, v0, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a:F

    const/high16 v3, 0x3f800000    # 1.0f

    add-float/2addr v2, v3

    iput v2, v0, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a:F

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

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

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

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

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    const/4 v0, 0x1

    if-eqz p1, :cond_3

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-boolean p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->k:Z

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

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

    iget-object p3, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {p3}, Lcom/baidu/mapsdkplatform/comapi/map/e;->A()V

    iget-object p3, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

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

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

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

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_5

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-boolean v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->k:Z

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    const/4 v1, -0x1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    float-to-int v3, v3

    iget-object v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget v4, v4, Lcom/baidu/mapsdkplatform/comapi/map/e;->l:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(IIII)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

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

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v2, v0}, Lcom/baidu/mapsdkplatform/comapi/map/n;->b(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    const/4 v3, 0x1

    iput-boolean v3, v2, Lcom/baidu/mapsdkplatform/comapi/map/e;->p:Z

    goto :goto_0

    :cond_2
    iget-object v3, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

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
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

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

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

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

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onPause()V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->c()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onResume()V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

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
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->g()V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->d()V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->n()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/baidu/mapsdkplatform/comapi/map/l;->setRenderMode(I)V

    :cond_3
    :goto_1
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

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-boolean v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->k:Z

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    const/4 v2, -0x1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    iget-object v5, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget v5, v5, Lcom/baidu/mapsdkplatform/comapi/map/e;->l:I

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(IIII)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    const-string v3, ""

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

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
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v3, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/baidu/mapsdkplatform/comapi/map/n;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    iget-object v3, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

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

    :cond_4
    :goto_4
    return v1
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-super {p0, p1}, Landroid/opengl/GLSurfaceView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

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
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->f:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_3

    return v1

    :cond_3
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_4
    :goto_1
    return v1
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 4

    invoke-super {p0, p1, p2, p3, p4}, Landroid/opengl/GLSurfaceView;->surfaceChanged(Landroid/view/SurfaceHolder;III)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz p1, :cond_5

    iget-object p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->c:Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;

    iput p3, p1, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->a:I

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->c:Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;

    iput p4, p1, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->b:I

    iput p3, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->d:I

    iput p4, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->e:I

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->c:Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;

    const/4 p2, 0x0

    iput p2, p1, Lcom/baidu/mapsdkplatform/comapi/map/MapRenderer;->c:I

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

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

    iput p2, v0, Lcom/baidu/mapapi/map/WinRound;->left:I

    iget-object v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->j:Lcom/baidu/mapapi/map/WinRound;

    iput p2, v0, Lcom/baidu/mapapi/map/WinRound;->top:I

    iget-object p2, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->j:Lcom/baidu/mapapi/map/WinRound;

    iput p4, p2, Lcom/baidu/mapapi/map/WinRound;->bottom:I

    iget-object p2, p1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->j:Lcom/baidu/mapapi/map/WinRound;

    iput p3, p2, Lcom/baidu/mapapi/map/WinRound;->right:I

    iget-object p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {p2, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/ad;)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->g:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->d:I

    iget p3, p0, Lcom/baidu/mapsdkplatform/comapi/map/l;->e:I

    invoke-virtual {p1, p2, p3}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(II)V

    :cond_5
    :goto_0
    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/opengl/GLSurfaceView;->surfaceCreated(Landroid/view/SurfaceHolder;)V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->surfaceDestroyed(Landroid/view/SurfaceHolder;)V

    :cond_0
    return-void
.end method
