.class public final Lkotlinx/coroutines/EventLoopKt;
.super Ljava/lang/Object;
.source "EventLoop.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\u001a\u0008\u0010\u000c\u001a\u00020\rH\u0000\u001a\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0000\u001a\u0008\u0010\u0012\u001a\u00020\u0006H\u0007\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0008\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000*\u001e\u0008\u0002\u0010\u0013\u001a\u0004\u0008\u0000\u0010\u0014\"\u0008\u0012\u0004\u0012\u0002H\u00140\u00152\u0008\u0012\u0004\u0012\u0002H\u00140\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "CLOSED_EMPTY",
        "Lkotlinx/coroutines/internal/Symbol;",
        "CLOSED_EMPTY$annotations",
        "()V",
        "DISPOSED_TASK",
        "MAX_MS",
        "",
        "MS_TO_NS",
        "SCHEDULE_COMPLETED",
        "",
        "SCHEDULE_DISPOSED",
        "SCHEDULE_OK",
        "createEventLoop",
        "Lkotlinx/coroutines/EventLoop;",
        "delayNanosToMillis",
        "timeNanos",
        "delayToNanos",
        "timeMillis",
        "processNextEventInCurrentThread",
        "Queue",
        "T",
        "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final CLOSED_EMPTY:Lkotlinx/coroutines/internal/Symbol;

.field private static final DISPOSED_TASK:Lkotlinx/coroutines/internal/Symbol;

.field private static final MAX_MS:J = 0x8637bd05af6L

.field private static final MS_TO_NS:J = 0xf4240L

.field private static final SCHEDULE_COMPLETED:I = 0x1

.field private static final SCHEDULE_DISPOSED:I = 0x2

.field private static final SCHEDULE_OK:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 11
    new-instance v0, Lkotlinx/coroutines/internal/Symbol;

    const-string v1, "REMOVED_TASK"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/Symbol;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/EventLoopKt;->DISPOSED_TASK:Lkotlinx/coroutines/internal/Symbol;

    .line 31
    new-instance v0, Lkotlinx/coroutines/internal/Symbol;

    const-string v1, "CLOSED_EMPTY"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/Symbol;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/EventLoopKt;->CLOSED_EMPTY:Lkotlinx/coroutines/internal/Symbol;

    return-void
.end method

.method private static synthetic CLOSED_EMPTY$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic access$getCLOSED_EMPTY$p()Lkotlinx/coroutines/internal/Symbol;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/coroutines/EventLoopKt;->CLOSED_EMPTY:Lkotlinx/coroutines/internal/Symbol;

    return-object v0
.end method

.method public static final synthetic access$getDISPOSED_TASK$p()Lkotlinx/coroutines/internal/Symbol;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/coroutines/EventLoopKt;->DISPOSED_TASK:Lkotlinx/coroutines/internal/Symbol;

    return-object v0
.end method

.method public static final createEventLoop()Lkotlinx/coroutines/EventLoop;
    .locals 3

    .line 316
    new-instance v0, Lkotlinx/coroutines/BlockingEventLoop;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    const-string v2, "Thread.currentThread()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lkotlinx/coroutines/BlockingEventLoop;-><init>(Ljava/lang/Thread;)V

    check-cast v0, Lkotlinx/coroutines/EventLoop;

    return-object v0
.end method

.method public static final delayNanosToMillis(J)J
    .locals 2

    const-wide/32 v0, 0xf4240

    .line 28
    div-long/2addr p0, v0

    return-wide p0
.end method

.method public static final delayToNanos(J)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-gtz v2, :cond_0

    goto :goto_0

    :cond_0
    const-wide v0, 0x8637bd05af6L

    cmp-long v2, p0, v0

    if-ltz v2, :cond_1

    const-wide v0, 0x7fffffffffffffffL

    goto :goto_0

    :cond_1
    const-wide/32 v0, 0xf4240

    mul-long v0, v0, p0

    :goto_0
    return-wide v0
.end method

.method public static final processNextEventInCurrentThread()J
    .locals 2

    .line 339
    sget-object v0, Lkotlinx/coroutines/ThreadLocalEventLoop;->INSTANCE:Lkotlinx/coroutines/ThreadLocalEventLoop;

    invoke-virtual {v0}, Lkotlinx/coroutines/ThreadLocalEventLoop;->currentOrNull$kotlinx_coroutines_core()Lkotlinx/coroutines/EventLoop;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkotlinx/coroutines/EventLoop;->processNextEvent()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    :goto_0
    return-wide v0
.end method
