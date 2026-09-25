.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;
.super Ljava/lang/Object;
.source "HttpClient.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J$\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\u0003\"\u0004\u0008\u0000\u0010\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH&JX\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\u0003\"\u0004\u0008\u0000\u0010\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u001c\u0008\u0002\u0010\u000c\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0014\u0008\u0003\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\t\u001a\u00020\nH&JD\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u001c\u0008\u0002\u0010\u000c\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0014\u0008\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\rH&J[\u0010\u0012\u001a\u00020\u0011\"\u0004\u0008\u0000\u0010\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u001c\u0008\u0002\u0010\u000c\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u0001H\u00132\u0014\u0008\u0003\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\rH&\u00a2\u0006\u0002\u0010\u0015JN\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u001c\u0008\u0002\u0010\u000c\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0014\u0008\u0003\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\r2\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0018H&Jh\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\u0003\"\u0004\u0008\u0000\u0010\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u001c\u0008\u0002\u0010\u000c\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0014\u0008\u0003\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\r2\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u00182\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\u001aH&Ju\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\u0003\"\u0004\u0008\u0000\u0010\u0013\"\u0004\u0008\u0001\u0010\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u001c\u0008\u0002\u0010\u000c\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u0001H\u00132\u0014\u0008\u0003\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\r2\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\u001aH&\u00a2\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u00020\u001f2\u0008\u0010 \u001a\u0004\u0018\u00010!H&J4\u0010\"\u001a\u00020\u001f2\u001c\u0010#\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u000e0$2\u000c\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u001f0&H&\u00a8\u0006\'"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;",
        "",
        "download",
        "Lio/reactivex/Single;",
        "Lokhttp3/ResponseBody;",
        "endpoint",
        "",
        "downloadJSON",
        "RESPONSE_BODY",
        "type",
        "Ljava/lang/reflect/Type;",
        "get",
        "headers",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;",
        "queries",
        "getCompletable",
        "Lio/reactivex/Completable;",
        "postCompletable",
        "REQUEST_BODY",
        "body",
        "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;",
        "postMultiPart",
        "dataPart",
        "Lokhttp3/MultipartBody$Part;",
        "postMultiPartWithResponse",
        "Ljava/lang/Class;",
        "postSingle",
        "clazz",
        "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Class;)Lio/reactivex/Single;",
        "setErrorHandler",
        "",
        "apiErrorHandler",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;",
        "setHeadersProvider",
        "headerProvider",
        "Lio/reactivex/Observable;",
        "tokenRequest",
        "Lkotlin/Function0;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract download(Ljava/lang/String;)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Single<",
            "Lokhttp3/ResponseBody;",
            ">;"
        }
    .end annotation
.end method

.method public abstract downloadJSON(Ljava/lang/String;Ljava/lang/reflect/Type;)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RESPONSE_BODY:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lio/reactivex/Single<",
            "TRESPONSE_BODY;>;"
        }
    .end annotation
.end method

.method public abstract get(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/reflect/Type;)Lio/reactivex/Single;
    .param p3    # Ljava/util/Map;
        .annotation runtime Lretrofit2/http/QueryMap;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RESPONSE_BODY:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lio/reactivex/Single<",
            "TRESPONSE_BODY;>;"
        }
    .end annotation
.end method

.method public abstract getCompletable(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/Completable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation
.end method

.method public abstract postCompletable(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;
    .param p4    # Ljava/util/Map;
        .annotation runtime Lretrofit2/http/QueryMap;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<REQUEST_BODY:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;TREQUEST_BODY;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Completable;"
        }
    .end annotation
.end method

.method public abstract postMultiPart(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lokhttp3/MultipartBody$Part;)Lio/reactivex/Completable;
    .param p3    # Ljava/util/Map;
        .annotation runtime Lretrofit2/http/QueryMap;
        .end annotation
    .end param
    .param p4    # Lokhttp3/MultipartBody$Part;
        .annotation runtime Lretrofit2/http/Part;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lokhttp3/MultipartBody$Part;",
            ")",
            "Lio/reactivex/Completable;"
        }
    .end annotation
.end method

.method public abstract postMultiPartWithResponse(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lokhttp3/MultipartBody$Part;Ljava/lang/Class;)Lio/reactivex/Single;
    .param p3    # Ljava/util/Map;
        .annotation runtime Lretrofit2/http/QueryMap;
        .end annotation
    .end param
    .param p4    # Lokhttp3/MultipartBody$Part;
        .annotation runtime Lretrofit2/http/Part;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RESPONSE_BODY:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lokhttp3/MultipartBody$Part;",
            "Ljava/lang/Class<",
            "TRESPONSE_BODY;>;)",
            "Lio/reactivex/Single<",
            "TRESPONSE_BODY;>;"
        }
    .end annotation
.end method

.method public abstract postSingle(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Class;)Lio/reactivex/Single;
    .param p4    # Ljava/util/Map;
        .annotation runtime Lretrofit2/http/QueryMap;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<REQUEST_BODY:",
            "Ljava/lang/Object;",
            "RESPONSE_BODY:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;TREQUEST_BODY;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Class<",
            "TRESPONSE_BODY;>;)",
            "Lio/reactivex/Single<",
            "TRESPONSE_BODY;>;"
        }
    .end annotation
.end method

.method public abstract setErrorHandler(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;)V
.end method

.method public abstract setHeadersProvider(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function0;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method
