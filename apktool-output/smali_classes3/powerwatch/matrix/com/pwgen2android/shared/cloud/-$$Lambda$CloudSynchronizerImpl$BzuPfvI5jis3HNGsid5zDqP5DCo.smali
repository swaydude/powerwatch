.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$BzuPfvI5jis3HNGsid5zDqP5DCo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$BzuPfvI5jis3HNGsid5zDqP5DCo;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$BzuPfvI5jis3HNGsid5zDqP5DCo;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;

    check-cast p1, Lkotlin/ranges/IntRange;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->lambda$BzuPfvI5jis3HNGsid5zDqP5DCo(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;Lkotlin/ranges/IntRange;)Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;

    move-result-object p1

    return-object p1
.end method
