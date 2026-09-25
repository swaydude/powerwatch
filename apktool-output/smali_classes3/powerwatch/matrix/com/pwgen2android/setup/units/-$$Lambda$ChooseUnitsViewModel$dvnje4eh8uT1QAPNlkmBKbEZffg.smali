.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/setup/units/-$$Lambda$ChooseUnitsViewModel$dvnje4eh8uT1QAPNlkmBKbEZffg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/units/-$$Lambda$ChooseUnitsViewModel$dvnje4eh8uT1QAPNlkmBKbEZffg;->f$0:Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/units/-$$Lambda$ChooseUnitsViewModel$dvnje4eh8uT1QAPNlkmBKbEZffg;->f$0:Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;->lambda$dvnje4eh8uT1QAPNlkmBKbEZffg(Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
