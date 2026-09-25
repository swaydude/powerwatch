.class final Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview$SurfaceCallback;
.super Ljava/lang/Object;
.source "CameraPreview.kt"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "SurfaceCallback"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u0006H\u0016\u00a8\u0006\u000e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview$SurfaceCallback;",
        "Landroid/view/SurfaceHolder$Callback;",
        "(Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;)V",
        "surfaceChanged",
        "",
        "holder",
        "Landroid/view/SurfaceHolder;",
        "format",
        "",
        "width",
        "height",
        "surfaceCreated",
        "surface",
        "surfaceDestroyed",
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
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview$SurfaceCallback;->this$0:Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    const-string p2, "holder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 2

    const-string v0, "surface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview$SurfaceCallback;->this$0:Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->access$setMSurfaceAvailable$p(Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;Z)V

    .line 172
    :try_start_0
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview$SurfaceCallback;->this$0:Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->access$startIfReady(Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 174
    check-cast p1, Ljava/lang/Throwable;

    const-string v0, "error_camera"

    const-string v1, "Could not start camera source."

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    const-string v0, "surface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview$SurfaceCallback;->this$0:Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;->access$setMSurfaceAvailable$p(Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;Z)V

    return-void
.end method
