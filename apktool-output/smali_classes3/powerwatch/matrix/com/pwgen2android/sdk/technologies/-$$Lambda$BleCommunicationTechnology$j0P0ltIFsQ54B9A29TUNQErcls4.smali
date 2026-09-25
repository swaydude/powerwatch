.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$j0P0ltIFsQ54B9A29TUNQErcls4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;

.field public final synthetic f$1:Lcom/polidea/rxandroidble2/RxBleDevice;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lcom/polidea/rxandroidble2/RxBleDevice;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$j0P0ltIFsQ54B9A29TUNQErcls4;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$j0P0ltIFsQ54B9A29TUNQErcls4;->f$1:Lcom/polidea/rxandroidble2/RxBleDevice;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$j0P0ltIFsQ54B9A29TUNQErcls4;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$j0P0ltIFsQ54B9A29TUNQErcls4;->f$1:Lcom/polidea/rxandroidble2/RxBleDevice;

    check-cast p1, Lcom/polidea/rxandroidble2/RxBleConnection;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->lambda$j0P0ltIFsQ54B9A29TUNQErcls4(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lcom/polidea/rxandroidble2/RxBleDevice;Lcom/polidea/rxandroidble2/RxBleConnection;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
