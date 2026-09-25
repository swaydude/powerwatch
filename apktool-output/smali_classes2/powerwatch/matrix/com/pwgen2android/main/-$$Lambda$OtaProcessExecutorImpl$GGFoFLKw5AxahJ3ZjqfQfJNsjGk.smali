.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OtaProcessExecutorImpl$GGFoFLKw5AxahJ3ZjqfQfJNsjGk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OtaProcessExecutorImpl$GGFoFLKw5AxahJ3ZjqfQfJNsjGk;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OtaProcessExecutorImpl$GGFoFLKw5AxahJ3ZjqfQfJNsjGk;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OtaProcessExecutorImpl$GGFoFLKw5AxahJ3ZjqfQfJNsjGk;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OtaProcessExecutorImpl$GGFoFLKw5AxahJ3ZjqfQfJNsjGk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OtaProcessExecutorImpl$GGFoFLKw5AxahJ3ZjqfQfJNsjGk;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->lambda$GGFoFLKw5AxahJ3ZjqfQfJNsjGk(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
