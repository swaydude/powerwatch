.class public final Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider$register$1$1;
.super Lcom/google/android/gms/location/LocationCallback;
.source "LocationUpdateProvider.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->register$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Lio/reactivex/SingleEmitter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "powerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider$register$1$1",
        "Lcom/google/android/gms/location/LocationCallback;",
        "onLocationResult",
        "",
        "locationResult",
        "Lcom/google/android/gms/location/LocationResult;",
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


# instance fields
.field final synthetic $c:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/google/android/gms/location/LocationCallback;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/google/android/gms/location/LocationCallback;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider$register$1$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider$register$1$1;->$c:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 59
    invoke-direct {p0}, Lcom/google/android/gms/location/LocationCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationResult(Lcom/google/android/gms/location/LocationResult;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 62
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/location/LocationResult;->getLocations()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 63
    invoke-virtual {p1}, Lcom/google/android/gms/location/LocationResult;->getLocations()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/location/Location;

    if-eqz p1, :cond_1

    .line 64
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    .line 65
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider$register$1$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "altitude value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/location/Location;->hasAltitude()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/location/Location;->getAltitude()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 66
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider$register$1$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->access$getRemoveSubject$p(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;)Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    .line 67
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider$register$1$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->access$getLocationProvider$p(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;)Lcom/google/android/gms/location/FusedLocationProviderClient;

    move-result-object p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider$register$1$1;->$c:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/location/LocationCallback;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/location/FusedLocationProviderClient;->removeLocationUpdates(Lcom/google/android/gms/location/LocationCallback;)Lcom/google/android/gms/tasks/Task;

    :cond_1
    return-void
.end method
