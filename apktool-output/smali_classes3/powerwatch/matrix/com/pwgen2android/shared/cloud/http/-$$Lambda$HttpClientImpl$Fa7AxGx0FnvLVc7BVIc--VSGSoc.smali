.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$Fa7AxGx0FnvLVc7BVIc--VSGSoc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;

.field public final synthetic f$1:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$Fa7AxGx0FnvLVc7BVIc--VSGSoc;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$Fa7AxGx0FnvLVc7BVIc--VSGSoc;->f$1:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$Fa7AxGx0FnvLVc7BVIc--VSGSoc;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/-$$Lambda$HttpClientImpl$Fa7AxGx0FnvLVc7BVIc--VSGSoc;->f$1:Ljava/lang/Class;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;->lambda$Fa7AxGx0FnvLVc7BVIc--VSGSoc(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
