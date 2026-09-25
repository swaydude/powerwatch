.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$03jrsCNjk_5aoOyOTD21KZyvzGU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$03jrsCNjk_5aoOyOTD21KZyvzGU;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$03jrsCNjk_5aoOyOTD21KZyvzGU;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$03jrsCNjk_5aoOyOTD21KZyvzGU;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$03jrsCNjk_5aoOyOTD21KZyvzGU;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->lambda$03jrsCNjk_5aoOyOTD21KZyvzGU(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
