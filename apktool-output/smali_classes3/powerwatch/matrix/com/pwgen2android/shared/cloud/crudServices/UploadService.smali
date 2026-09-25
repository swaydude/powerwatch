.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UploadService;
.super Ljava/lang/Object;
.source "CrudServices.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<RESPONSE_TYPE:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\u0008f\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002J2\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\nH&\u00a8\u0006\u000b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UploadService;",
        "RESPONSE_TYPE",
        "",
        "uploadFile",
        "Lio/reactivex/Single;",
        "binaryStream",
        "",
        "filename",
        "",
        "queryMap",
        "",
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
.method public abstract uploadFile([BLjava/lang/String;Ljava/util/Map;)Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Single<",
            "TRESPONSE_TYPE;>;"
        }
    .end annotation
.end method
