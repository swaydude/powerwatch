.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$XbR2SFA1SnwomFZOdHmsl8z3O4Y;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

.field public final synthetic f$1:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$XbR2SFA1SnwomFZOdHmsl8z3O4Y;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$XbR2SFA1SnwomFZOdHmsl8z3O4Y;->f$1:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$XbR2SFA1SnwomFZOdHmsl8z3O4Y;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$XbR2SFA1SnwomFZOdHmsl8z3O4Y;->f$1:Landroid/content/Context;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->lambda$XbR2SFA1SnwomFZOdHmsl8z3O4Y(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V

    return-void
.end method
