.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$hVn-S4RibNV_dc2LPQII0hBB9Ls;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Ljava/util/Map;

.field public final synthetic f$3:Lokhttp3/MultipartBody$Part;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;Lokhttp3/MultipartBody$Part;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$hVn-S4RibNV_dc2LPQII0hBB9Ls;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$hVn-S4RibNV_dc2LPQII0hBB9Ls;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$hVn-S4RibNV_dc2LPQII0hBB9Ls;->f$2:Ljava/util/Map;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$hVn-S4RibNV_dc2LPQII0hBB9Ls;->f$3:Lokhttp3/MultipartBody$Part;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$hVn-S4RibNV_dc2LPQII0hBB9Ls;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$hVn-S4RibNV_dc2LPQII0hBB9Ls;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$hVn-S4RibNV_dc2LPQII0hBB9Ls;->f$2:Ljava/util/Map;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$hVn-S4RibNV_dc2LPQII0hBB9Ls;->f$3:Lokhttp3/MultipartBody$Part;

    check-cast p1, Ljava/util/Map;

    invoke-static {v0, v1, v2, v3, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->lambda$hVn-S4RibNV_dc2LPQII0hBB9Ls(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/String;Ljava/util/Map;Lokhttp3/MultipartBody$Part;Ljava/util/Map;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
