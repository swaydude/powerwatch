.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;
.super Ljava/lang/Object;
.source "TraceLoggerImpl.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\rH\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R4\u0010\t\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r \u000e*\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\u000c0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;",
        "appContext",
        "Landroid/content/Context;",
        "traceLoggerStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerStorage;",
        "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerStorage;)V",
        "disposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "logSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "Lkotlin/Pair;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;",
        "kotlin.jvm.PlatformType",
        "logTag",
        "createFile",
        "",
        "logDataType",
        "deleteFile",
        "getFileName",
        "getStoredLogs",
        "Ljava/io/File;",
        "log",
        "data",
        "writeToFile",
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
.field private final appContext:Landroid/content/Context;

.field private final disposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final logSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;",
            ">;>;"
        }
    .end annotation
.end field

.field private final logTag:Ljava/lang/String;

.field private final traceLoggerStorage:Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerStorage;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerStorage;)V
    .locals 2

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "traceLoggerStorage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;->appContext:Landroid/content/Context;

    .line 31
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;->traceLoggerStorage:Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerStorage;

    .line 33
    const-class p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;->logTag:Ljava/lang/String;

    .line 34
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    const-string p2, "create<Pair<String, LogDataType>>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;->logSubject:Lio/reactivex/subjects/PublishSubject;

    .line 35
    new-instance p2, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p2}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;->disposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 39
    invoke-virtual {p1}, Lio/reactivex/subjects/PublishSubject;->retry()Lio/reactivex/Observable;

    move-result-object p1

    .line 40
    invoke-virtual {p1}, Lio/reactivex/Observable;->repeat()Lio/reactivex/Observable;

    move-result-object p1

    .line 41
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    invoke-static {v0}, Lio/reactivex/schedulers/Schedulers;->from(Ljava/util/concurrent/Executor;)Lio/reactivex/Scheduler;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object p1

    .line 42
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/-$$Lambda$TraceLoggerImpl$EikWOAb9h-YzkmfoZyVLRiaZDPc;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/-$$Lambda$TraceLoggerImpl$EikWOAb9h-YzkmfoZyVLRiaZDPc;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;)V

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/-$$Lambda$TraceLoggerImpl$y3kuZn5j7fZQFWti3vq5ZKnPDT8;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/-$$Lambda$TraceLoggerImpl$y3kuZn5j7fZQFWti3vq5ZKnPDT8;

    invoke-virtual {p1, v0, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 38
    invoke-virtual {p2, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerStorage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 31
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerStorage;

    invoke-direct {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerStorage;-><init>(Landroid/content/Context;)V

    .line 30
    :cond_0
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerStorage;)V

    return-void
.end method

.method private static final _init_$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;Lkotlin/Pair;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;

    invoke-direct {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;->writeToFile(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)V

    return-void
.end method

.method private static final _init_$lambda-1(Ljava/lang/Throwable;)V
    .locals 0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private final getFileName(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)Ljava/lang/String;
    .locals 2

    .line 86
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Accel;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Accel;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "log.txt"

    if-eqz v0, :cond_0

    goto :goto_0

    .line 87
    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Header;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Header;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 88
    :cond_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$HeartRate;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$HeartRate;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string v1, "hr.txt"

    :goto_0
    return-object v1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static synthetic lambda$EikWOAb9h-YzkmfoZyVLRiaZDPc(Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;->_init_$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$y3kuZn5j7fZQFWti3vq5ZKnPDT8(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;->_init_$lambda-1(Ljava/lang/Throwable;)V

    return-void
.end method

.method private final writeToFile(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)V
    .locals 3

    .line 68
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;->appContext:Landroid/content/Context;

    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;->getFileName(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)Ljava/lang/String;

    move-result-object p2

    const v1, 0x8000

    invoke-virtual {v0, p2, v1}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object p2

    const/4 v0, 0x0

    .line 72
    :try_start_0
    new-instance v1, Ljava/io/BufferedWriter;

    new-instance v2, Ljava/io/OutputStreamWriter;

    check-cast p2, Ljava/io/OutputStream;

    invoke-direct {v2, p2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    check-cast v2, Ljava/io/Writer;

    invoke-direct {v1, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 73
    :try_start_1
    invoke-virtual {v1, p1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 74
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V

    goto :goto_3

    :catchall_0
    move-exception p1

    move-object v0, v1

    goto :goto_0

    :catch_0
    move-object v0, v1

    goto :goto_2

    :catchall_1
    move-exception p1

    :goto_0
    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V

    :goto_1
    throw p1

    :catch_1
    nop

    :goto_2
    if-nez v0, :cond_1

    goto :goto_3

    :cond_1
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V

    :goto_3
    return-void
.end method


# virtual methods
.method public createFile(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)V
    .locals 1

    const-string v0, "logDataType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;->traceLoggerStorage:Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerStorage;

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;->getFileName(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerStorage;->createFile(Ljava/lang/String;)V

    return-void
.end method

.method public deleteFile(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)V
    .locals 1

    const-string v0, "logDataType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;->traceLoggerStorage:Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerStorage;

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;->getFileName(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerStorage;->deleteFile(Ljava/lang/String;)V

    return-void
.end method

.method public getStoredLogs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)Ljava/io/File;
    .locals 1

    const-string v0, "logDataType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;->appContext:Landroid/content/Context;

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;->getFileName(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    const-string v0, "appContext.getFileStreamPath(getFileName(logDataType))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public log(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)V
    .locals 2

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logDataType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/tracelogger/TraceLoggerImpl;->logSubject:Lio/reactivex/subjects/PublishSubject;

    new-instance v1, Lkotlin/Pair;

    invoke-direct {v1, p1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method
