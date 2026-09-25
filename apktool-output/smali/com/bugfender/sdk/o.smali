.class public Lcom/bugfender/sdk/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# static fields
.field private static final c:Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field private final a:Lcom/bugfender/sdk/s;

.field private final b:Ljava/lang/Thread$UncaughtExceptionHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/bugfender/sdk/o$a;

    invoke-direct {v0}, Lcom/bugfender/sdk/o$a;-><init>()V

    sput-object v0, Lcom/bugfender/sdk/o;->c:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-void
.end method

.method public constructor <init>(Lcom/bugfender/sdk/s;Ljava/lang/Thread$UncaughtExceptionHandler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bugfender/sdk/o;->a:Lcom/bugfender/sdk/s;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/bugfender/sdk/o;->c:Ljava/lang/Thread$UncaughtExceptionHandler;

    :goto_0
    iput-object p2, p0, Lcom/bugfender/sdk/o;->b:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-void
.end method


# virtual methods
.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 2

    invoke-static {p1, p2}, Lcom/bugfender/sdk/t;->a(Ljava/lang/Thread;Ljava/lang/Throwable;)Lcom/bugfender/sdk/t;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/o;->a:Lcom/bugfender/sdk/s;

    invoke-virtual {v1, v0}, Lcom/bugfender/sdk/s;->a(Lcom/bugfender/sdk/t;)V

    iget-object v0, p0, Lcom/bugfender/sdk/o;->b:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method
