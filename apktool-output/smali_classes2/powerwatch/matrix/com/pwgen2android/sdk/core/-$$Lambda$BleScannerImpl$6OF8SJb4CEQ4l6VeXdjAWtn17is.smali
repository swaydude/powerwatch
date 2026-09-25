.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BleScannerImpl$6OF8SJb4CEQ4l6VeXdjAWtn17is;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BleScannerImpl$6OF8SJb4CEQ4l6VeXdjAWtn17is;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BleScannerImpl$6OF8SJb4CEQ4l6VeXdjAWtn17is;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerImpl;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BleScannerImpl$6OF8SJb4CEQ4l6VeXdjAWtn17is;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BleScannerImpl$6OF8SJb4CEQ4l6VeXdjAWtn17is;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerImpl;

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerImpl;->lambda$6OF8SJb4CEQ4l6VeXdjAWtn17is(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerImpl;)Lio/reactivex/ObservableSource;

    move-result-object v0

    return-object v0
.end method
