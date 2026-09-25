.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$UserPrefsUtils$UYGITP34DCg6504oOpdc-bNxQKM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$UserPrefsUtils$UYGITP34DCg6504oOpdc-bNxQKM;->f$0:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/utils/-$$Lambda$UserPrefsUtils$UYGITP34DCg6504oOpdc-bNxQKM;->f$0:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->lambda$UYGITP34DCg6504oOpdc-bNxQKM(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
