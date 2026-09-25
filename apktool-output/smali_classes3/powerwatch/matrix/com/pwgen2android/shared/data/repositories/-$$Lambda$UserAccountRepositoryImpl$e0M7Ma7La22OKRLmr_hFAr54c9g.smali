.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserAccountRepositoryImpl$e0M7Ma7La22OKRLmr_hFAr54c9g;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserAccountRepositoryImpl$e0M7Ma7La22OKRLmr_hFAr54c9g;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserAccountRepositoryImpl$e0M7Ma7La22OKRLmr_hFAr54c9g;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserAccountRepositoryImpl$e0M7Ma7La22OKRLmr_hFAr54c9g;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserAccountRepositoryImpl$e0M7Ma7La22OKRLmr_hFAr54c9g;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;->lambda$e0M7Ma7La22OKRLmr_hFAr54c9g(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
