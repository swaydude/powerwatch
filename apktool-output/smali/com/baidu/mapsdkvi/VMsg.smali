.class public Lcom/baidu/mapsdkvi/VMsg;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/mapsdkvi/VMsg$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String; = "VMsg"

.field private static b:Landroid/os/Handler;

.field private static c:Landroid/os/HandlerThread;

.field private static d:Lcom/baidu/mapsdkvi/VMsg;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/baidu/mapsdkvi/VMsg;

    invoke-direct {v0}, Lcom/baidu/mapsdkvi/VMsg;-><init>()V

    sput-object v0, Lcom/baidu/mapsdkvi/VMsg;->d:Lcom/baidu/mapsdkvi/VMsg;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native InitClass(Ljava/lang/Object;)V
.end method

.method private static native OnUserCommand1(IIIJ)V
.end method

.method static synthetic a(IIIJ)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/baidu/mapsdkvi/VMsg;->OnUserCommand1(IIIJ)V

    return-void
.end method

.method public static destroy()V
    .locals 2

    sget-object v0, Lcom/baidu/mapsdkvi/VMsg;->c:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    const/4 v0, 0x0

    sput-object v0, Lcom/baidu/mapsdkvi/VMsg;->c:Landroid/os/HandlerThread;

    sget-object v1, Lcom/baidu/mapsdkvi/VMsg;->b:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    sput-object v0, Lcom/baidu/mapsdkvi/VMsg;->b:Landroid/os/Handler;

    return-void
.end method

.method public static getInstance()Lcom/baidu/mapsdkvi/VMsg;
    .locals 1

    sget-object v0, Lcom/baidu/mapsdkvi/VMsg;->d:Lcom/baidu/mapsdkvi/VMsg;

    return-object v0
.end method

.method public static init()V
    .locals 2

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "VIMsgThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/baidu/mapsdkvi/VMsg;->c:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    new-instance v0, Lcom/baidu/mapsdkvi/VMsg$a;

    sget-object v1, Lcom/baidu/mapsdkvi/VMsg;->c:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/baidu/mapsdkvi/VMsg$a;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/baidu/mapsdkvi/VMsg;->b:Landroid/os/Handler;

    return-void
.end method

.method private static postMessage(IIIJ)V
    .locals 4

    sget-object v0, Lcom/baidu/mapsdkvi/VMsg;->b:Landroid/os/Handler;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-wide/16 v1, 0x0

    cmp-long v3, p3, v1

    if-nez v3, :cond_1

    const/4 p3, 0x0

    goto :goto_0

    :cond_1
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    :goto_0
    invoke-static {v0, p0, p1, p2, p3}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p0

    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method
