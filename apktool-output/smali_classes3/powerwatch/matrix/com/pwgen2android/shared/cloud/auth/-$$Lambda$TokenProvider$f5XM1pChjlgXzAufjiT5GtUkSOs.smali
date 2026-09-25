.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$TokenProvider$f5XM1pChjlgXzAufjiT5GtUkSOs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Action;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$TokenProvider$f5XM1pChjlgXzAufjiT5GtUkSOs;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$TokenProvider$f5XM1pChjlgXzAufjiT5GtUkSOs;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$TokenProvider$f5XM1pChjlgXzAufjiT5GtUkSOs;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/-$$Lambda$TokenProvider$f5XM1pChjlgXzAufjiT5GtUkSOs;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->lambda$f5XM1pChjlgXzAufjiT5GtUkSOs(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;)V

    return-void
.end method
