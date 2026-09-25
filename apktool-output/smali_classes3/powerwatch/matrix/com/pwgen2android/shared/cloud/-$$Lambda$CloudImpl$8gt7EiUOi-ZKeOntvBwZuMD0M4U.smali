.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$8gt7EiUOi-ZKeOntvBwZuMD0M4U;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$8gt7EiUOi-ZKeOntvBwZuMD0M4U;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$8gt7EiUOi-ZKeOntvBwZuMD0M4U;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$8gt7EiUOi-ZKeOntvBwZuMD0M4U;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudImpl$8gt7EiUOi-ZKeOntvBwZuMD0M4U;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    check-cast p1, Lkotlin/Unit;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;->lambda$8gt7EiUOi-ZKeOntvBwZuMD0M4U(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lkotlin/Unit;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
