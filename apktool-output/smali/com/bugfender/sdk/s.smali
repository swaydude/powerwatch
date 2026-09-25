.class public Lcom/bugfender/sdk/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/bugfender/sdk/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/t1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bugfender/sdk/t1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bugfender/sdk/t1<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/bugfender/sdk/s;->a(Lcom/bugfender/sdk/s;Ljava/lang/Thread$UncaughtExceptionHandler;)Lcom/bugfender/sdk/o;

    move-result-object v0

    iput-object p1, p0, Lcom/bugfender/sdk/s;->a:Lcom/bugfender/sdk/t1;

    invoke-static {v0}, Lcom/bugfender/sdk/s;->a(Lcom/bugfender/sdk/o;)V

    return-void
.end method

.method private static a(Lcom/bugfender/sdk/s;Ljava/lang/Thread$UncaughtExceptionHandler;)Lcom/bugfender/sdk/o;
    .locals 1

    new-instance v0, Lcom/bugfender/sdk/o;

    invoke-direct {v0, p0, p1}, Lcom/bugfender/sdk/o;-><init>(Lcom/bugfender/sdk/s;Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-object v0
.end method

.method public static a(Lcom/bugfender/sdk/t1;)Lcom/bugfender/sdk/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bugfender/sdk/t1<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/bugfender/sdk/s;"
        }
    .end annotation

    new-instance v0, Lcom/bugfender/sdk/s;

    invoke-direct {v0, p0}, Lcom/bugfender/sdk/s;-><init>(Lcom/bugfender/sdk/t1;)V

    return-object v0
.end method

.method private static a(Lcom/bugfender/sdk/o;)V
    .locals 0

    invoke-static {p0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/bugfender/sdk/t;)V
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/s;->a:Lcom/bugfender/sdk/t1;

    invoke-virtual {p1}, Lcom/bugfender/sdk/t;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/bugfender/sdk/t1;->a(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/bugfender/sdk/s;->a:Lcom/bugfender/sdk/t1;

    invoke-virtual {p1}, Lcom/bugfender/sdk/t1;->d()Z

    return-void
.end method
