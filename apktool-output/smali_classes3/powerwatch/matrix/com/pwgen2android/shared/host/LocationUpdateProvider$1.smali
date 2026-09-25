.class public final Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider$1;
.super Lcom/google/android/gms/location/LocationCallback;
.source "LocationUpdateProvider.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;-><init>(Landroid/content/Context;)V
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
        "powerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider$1",
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
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;

    .line 39
    invoke-direct {p0}, Lcom/google/android/gms/location/LocationCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationResult(Lcom/google/android/gms/location/LocationResult;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 42
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/location/LocationResult;->getLocations()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 43
    invoke-virtual {p1}, Lcom/google/android/gms/location/LocationResult;->getLocations()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/location/Location;

    if-eqz p1, :cond_1

    .line 44
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "altitude value: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/location/Location;->hasAltitude()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/location/Location;->getAltitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 46
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->access$getRemoveSubject$p(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;)Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    .line 47
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->access$getLocationProvider$p(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;)Lcom/google/android/gms/location/FusedLocationProviderClient;

    move-result-object p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->getCallback()Lcom/google/android/gms/location/LocationCallback;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/location/FusedLocationProviderClient;->removeLocationUpdates(Lcom/google/android/gms/location/LocationCallback;)Lcom/google/android/gms/tasks/Task;

    :cond_1
    return-void
.end method
