.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$lG2UX_eJlTRdkra2tCUTJAuvYic;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Ljava/lang/Object;

.field public final synthetic f$3:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$lG2UX_eJlTRdkra2tCUTJAuvYic;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$lG2UX_eJlTRdkra2tCUTJAuvYic;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$lG2UX_eJlTRdkra2tCUTJAuvYic;->f$2:Ljava/lang/Object;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$lG2UX_eJlTRdkra2tCUTJAuvYic;->f$3:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$lG2UX_eJlTRdkra2tCUTJAuvYic;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$lG2UX_eJlTRdkra2tCUTJAuvYic;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$lG2UX_eJlTRdkra2tCUTJAuvYic;->f$2:Ljava/lang/Object;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$lG2UX_eJlTRdkra2tCUTJAuvYic;->f$3:Ljava/util/Map;

    check-cast p1, Ljava/util/Map;

    invoke-static {v0, v1, v2, v3, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->lambda$lG2UX_eJlTRdkra2tCUTJAuvYic(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
