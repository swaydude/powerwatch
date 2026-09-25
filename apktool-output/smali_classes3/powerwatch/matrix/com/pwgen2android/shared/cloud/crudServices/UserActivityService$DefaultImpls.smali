.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService$DefaultImpls;
.super Ljava/lang/Object;
.source "UserActivityServices.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic getAllUserActivityDates$default(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;Ljava/util/Map;ILjava/lang/Object;)Lio/reactivex/Single;
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 12
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    :cond_0
    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;->getAllUserActivityDates(Ljava/util/Map;)Lio/reactivex/Single;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getAllUserActivityDates"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
