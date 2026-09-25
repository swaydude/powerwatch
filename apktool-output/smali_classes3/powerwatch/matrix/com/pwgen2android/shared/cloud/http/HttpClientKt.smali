.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientKt;
.super Ljava/lang/Object;
.source "HttpClient.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010$\n\u0000\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0003\u0010\u0004\"\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0004\"\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0004*\"\u0010\t\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\"\u0010\n\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "acceptTypeJSON",
        "Lkotlin/Pair;",
        "",
        "getAcceptTypeJSON",
        "()Lkotlin/Pair;",
        "contentTypeJSON",
        "getContentTypeJSON",
        "mimeType",
        "getMimeType",
        "Header",
        "Headers",
        "",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static final acceptTypeJSON:Lkotlin/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final contentTypeJSON:Lkotlin/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final mimeType:Lkotlin/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 25
    new-instance v0, Lkotlin/Pair;

    const-string v1, "Content-Type"

    const-string v2, "application/json"

    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientKt;->contentTypeJSON:Lkotlin/Pair;

    .line 26
    new-instance v0, Lkotlin/Pair;

    const-string v1, "Accept"

    const-string v2, "application/json;charset=UTF-8"

    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientKt;->acceptTypeJSON:Lkotlin/Pair;

    .line 27
    new-instance v0, Lkotlin/Pair;

    const-string v1, "mimeType"

    const-string v2, "application/octet-stream"

    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientKt;->mimeType:Lkotlin/Pair;

    return-void
.end method

.method public static final getAcceptTypeJSON()Lkotlin/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 26
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientKt;->acceptTypeJSON:Lkotlin/Pair;

    return-object v0
.end method

.method public static final getContentTypeJSON()Lkotlin/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 25
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientKt;->contentTypeJSON:Lkotlin/Pair;

    return-object v0
.end method

.method public static final getMimeType()Lkotlin/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 27
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientKt;->mimeType:Lkotlin/Pair;

    return-object v0
.end method
