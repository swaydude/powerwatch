.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$rIviZFiBhDjYtQNAvN4GsEscReM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$rIviZFiBhDjYtQNAvN4GsEscReM;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$rIviZFiBhDjYtQNAvN4GsEscReM;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->lambda$rIviZFiBhDjYtQNAvN4GsEscReM(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)Z

    move-result p1

    return p1
.end method
