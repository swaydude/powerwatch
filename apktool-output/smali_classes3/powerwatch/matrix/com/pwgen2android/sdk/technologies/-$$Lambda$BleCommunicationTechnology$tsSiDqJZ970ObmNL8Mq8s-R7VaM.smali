.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$tsSiDqJZ970ObmNL8Mq8s-R7VaM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$tsSiDqJZ970ObmNL8Mq8s-R7VaM;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$tsSiDqJZ970ObmNL8Mq8s-R7VaM;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->lambda$tsSiDqJZ970ObmNL8Mq8s-R7VaM(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Ljava/lang/String;)Lcom/polidea/rxandroidble2/RxBleDevice;

    move-result-object p1

    return-object p1
.end method
