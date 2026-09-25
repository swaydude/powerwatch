.class public final Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;
.super Landroid/view/SurfaceView;
.source "CameraPreview.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview$SurfaceCallback;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0018\u00002\u00020\u0001:\u00018B\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0012\u0010#\u001a\u00020\u001f2\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002J\u0008\u0010$\u001a\u00020%H\u0002J\u0008\u0010&\u001a\u00020\u001fH\u0002J\u0010\u0010\'\u001a\u00020%2\u0006\u0010(\u001a\u00020)H\u0014J\u0018\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\tH\u0014J\u0006\u0010-\u001a\u00020%J\u0018\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0002J\u0010\u00101\u001a\u00020%2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cJ\u0008\u00102\u001a\u00020%H\u0003J\u0006\u00103\u001a\u00020%J\u000e\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u0016J\u000e\u00106\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0004R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00069"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;",
        "Landroid/view/SurfaceView;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "cameraSource",
        "Lcom/google/android/gms/vision/CameraSource;",
        "getCameraSource",
        "()Lcom/google/android/gms/vision/CameraSource;",
        "setCameraSource",
        "(Lcom/google/android/gms/vision/CameraSource;)V",
        "mContext",
        "getMContext",
        "()Landroid/content/Context;",
        "setMContext",
        "mHeight",
        "",
        "mHeightScaleFactor",
        "mHolder",
        "Landroid/view/SurfaceHolder;",
        "mLock",
        "",
        "mPreviewHeight",
        "mPreviewWidth",
        "mStartRequested",
        "",
        "mSurfaceAvailable",
        "mWidth",
        "mWidthScaleFactor",
        "checkCameraHardware",
        "init",
        "",
        "isPortraitMode",
        "onDraw",
        "canvas",
        "Landroid/graphics/Canvas;",
        "onMeasure",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "release",
        "setupScales",
        "width",
        "height",
        "start",
        "startIfReady",
        "stop",
        "translateX",
        "x",
        "translateY",
        "y",
        "SurfaceCallback",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private cameraSource:Lcom/google/android/gms/vision/CameraSource;

.field public mContext:Landroid/content/Context;

.field private mHeight:F

.field private mHeightScaleFactor:F

.field private mHolder:Landroid/view/SurfaceHolder;

.field private final mLock:Ljava/lang/Object;

.field private mPreviewHeight:I

.field private mPreviewWidth:I

.field private mStartRequested:Z

.field private mSurfaceAvailable:Z

.field private mWidth:F

.field private mWidthScaleFactor:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    const/high16 p1, 0x3f800000    # 1.0f

    .line 27
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mWidthScaleFactor:F

    .line 28
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mHeightScaleFactor:F

    .line 35
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mLock:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    invoke-direct {p0, p1, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 p2, 0x3f800000    # 1.0f

    .line 27
    iput p2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mWidthScaleFactor:F

    .line 28
    iput p2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mHeightScaleFactor:F

    .line 35
    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mLock:Ljava/lang/Object;

    .line 90
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->setMContext(Landroid/content/Context;)V

    .line 91
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    invoke-direct {p0, p1, p2, p3}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p1, 0x3f800000    # 1.0f

    .line 27
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mWidthScaleFactor:F

    .line 28
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mHeightScaleFactor:F

    .line 35
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mLock:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$setMSurfaceAvailable$p(Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;Z)V
    .locals 0

    .line 19
    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mSurfaceAvailable:Z

    return-void
.end method

.method public static final synthetic access$startIfReady(Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->startIfReady()V

    return-void
.end method

.method private final checkCameraHardware(Landroid/content/Context;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    :goto_0
    move-object v1, v0

    goto :goto_1

    .line 105
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const-string v2, "android.hardware.camera"

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :goto_1
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    goto :goto_4

    .line 107
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    if-nez v1, :cond_3

    move-object v1, v0

    goto :goto_2

    :cond_3
    const-string v3, "android.hardware.camera.front"

    invoke-virtual {v1, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :goto_2
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_4

    .line 109
    :cond_4
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    const-string v0, "android.hardware.camera.any"

    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_3
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :goto_4
    return v2
.end method

.method private final init()V
    .locals 2

    .line 95
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->checkCameraHardware(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 96
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mHolder:Landroid/view/SurfaceHolder;

    .line 97
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview$SurfaceCallback;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview$SurfaceCallback;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;)V

    check-cast v1, Landroid/view/SurfaceHolder$Callback;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    goto :goto_0

    :cond_0
    const-string v0, "camera_error"

    const-string v1, "Error: Camera not found"

    .line 99
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method private final isPortraitMode()Z
    .locals 3

    .line 188
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->getMContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    return v2

    :cond_1
    const-string v0, "error_camera"

    const-string v2, "isPortraitMode returning false by default"

    .line 196
    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v1
.end method

.method private final setupScales(II)V
    .locals 2

    .line 50
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mPreviewWidth:I

    if-eqz v0, :cond_0

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mPreviewHeight:I

    if-eqz v1, :cond_0

    int-to-float p1, p1

    int-to-float v0, v0

    div-float/2addr p1, v0

    .line 51
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mWidthScaleFactor:F

    int-to-float p1, p2

    int-to-float p2, v1

    div-float/2addr p1, p2

    .line 52
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mHeightScaleFactor:F

    .line 53
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Scales - X: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mWidthScaleFactor:F

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, ", Y: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mHeightScaleFactor:F

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rect_issue"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method private final startIfReady()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 145
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mStartRequested:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mSurfaceAvailable:Z

    if-eqz v0, :cond_3

    .line 146
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->cameraSource:Lcom/google/android/gms/vision/CameraSource;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/vision/CameraSource;->start(Landroid/view/SurfaceHolder;)Lcom/google/android/gms/vision/CameraSource;

    .line 148
    :goto_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->cameraSource:Lcom/google/android/gms/vision/CameraSource;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/vision/CameraSource;->getPreviewSize()Lcom/google/android/gms/common/images/Size;

    move-result-object v0

    .line 149
    :goto_1
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/android/gms/common/images/Size;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Lcom/google/android/gms/common/images/Size;->getHeight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 150
    invoke-virtual {v0}, Lcom/google/android/gms/common/images/Size;->getWidth()I

    move-result v2

    invoke-virtual {v0}, Lcom/google/android/gms/common/images/Size;->getHeight()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 155
    iput v1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mPreviewWidth:I

    .line 156
    iput v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mPreviewHeight:I

    .line 161
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mWidth:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-lez v2, :cond_2

    iget v2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mHeight:F

    cmpl-float v1, v2, v1

    if-lez v1, :cond_2

    float-to-int v0, v0

    float-to-int v1, v2

    .line 162
    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->setupScales(II)V

    :cond_2
    const/4 v0, 0x0

    .line 164
    iput-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mStartRequested:Z

    :cond_3
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method public final getCameraSource()Lcom/google/android/gms/vision/CameraSource;
    .locals 1

    .line 21
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->cameraSource:Lcom/google/android/gms/vision/CameraSource;

    return-object v0
.end method

.method public final getMContext()Landroid/content/Context;
    .locals 1

    .line 22
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-super {p0, p1}, Landroid/view/SurfaceView;->onDraw(Landroid/graphics/Canvas;)V

    .line 40
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 41
    :try_start_0
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mPreviewWidth:I

    if-eqz v1, :cond_0

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mPreviewHeight:I

    if-eqz v1, :cond_0

    .line 42
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mPreviewWidth:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    iput v1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mWidthScaleFactor:F

    .line 43
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result p1

    int-to-float p1, p1

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mPreviewHeight:I

    int-to-float v1, v1

    div-float/2addr p1, v1

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mHeightScaleFactor:F

    const-string p1, "rect_issue"

    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Scales - X: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mWidthScaleFactor:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", Y: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mHeightScaleFactor:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method protected onMeasure(II)V
    .locals 0

    .line 64
    invoke-super {p0, p1, p2}, Landroid/view/SurfaceView;->onMeasure(II)V

    .line 65
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->getMeasuredWidth()I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mWidth:F

    .line 66
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->getMeasuredHeight()I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mHeight:F

    .line 67
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->setMeasuredDimension(II)V

    return-void
.end method

.method public final release()V
    .locals 1

    .line 136
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->cameraSource:Lcom/google/android/gms/vision/CameraSource;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    .line 137
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/vision/CameraSource;->release()V

    :goto_0
    const/4 v0, 0x0

    .line 138
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->cameraSource:Lcom/google/android/gms/vision/CameraSource;

    :cond_1
    return-void
.end method

.method public final setCameraSource(Lcom/google/android/gms/vision/CameraSource;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->cameraSource:Lcom/google/android/gms/vision/CameraSource;

    return-void
.end method

.method public final setMContext(Landroid/content/Context;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mContext:Landroid/content/Context;

    return-void
.end method

.method public final start(Lcom/google/android/gms/vision/CameraSource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p1, :cond_0

    .line 118
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->stop()V

    .line 121
    :cond_0
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->cameraSource:Lcom/google/android/gms/vision/CameraSource;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    .line 124
    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mStartRequested:Z

    .line 125
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->startIfReady()V

    :cond_1
    return-void
.end method

.method public final stop()V
    .locals 1

    .line 130
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->cameraSource:Lcom/google/android/gms/vision/CameraSource;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    .line 131
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/vision/CameraSource;->stop()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final translateX(F)F
    .locals 1

    .line 71
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mWidthScaleFactor:F

    mul-float p1, p1, v0

    return p1
.end method

.method public final translateY(F)F
    .locals 1

    .line 80
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->mHeightScaleFactor:F

    mul-float p1, p1, v0

    return p1
.end method
