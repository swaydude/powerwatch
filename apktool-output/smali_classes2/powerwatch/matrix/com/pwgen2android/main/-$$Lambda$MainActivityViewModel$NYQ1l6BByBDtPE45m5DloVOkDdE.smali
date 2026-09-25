.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$NYQ1l6BByBDtPE45m5DloVOkDdE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$NYQ1l6BByBDtPE45m5DloVOkDdE;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$NYQ1l6BByBDtPE45m5DloVOkDdE;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->lambda$NYQ1l6BByBDtPE45m5DloVOkDdE(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
