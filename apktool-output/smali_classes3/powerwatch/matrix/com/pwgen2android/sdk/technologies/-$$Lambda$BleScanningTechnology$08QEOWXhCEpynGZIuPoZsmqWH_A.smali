.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$08QEOWXhCEpynGZIuPoZsmqWH_A;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$08QEOWXhCEpynGZIuPoZsmqWH_A;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$08QEOWXhCEpynGZIuPoZsmqWH_A;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;

    check-cast p1, Lcom/polidea/rxandroidble2/scan/ScanResult;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->lambda$08QEOWXhCEpynGZIuPoZsmqWH_A(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;Lcom/polidea/rxandroidble2/scan/ScanResult;)V

    return-void
.end method
