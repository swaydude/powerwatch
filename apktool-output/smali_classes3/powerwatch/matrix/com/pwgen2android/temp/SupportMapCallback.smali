.class final Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapCallback;
.super Lcom/google/android/gms/maps/internal/zzaq;
.source "SupportMapCallback.java"


# instance fields
.field private mMapCallback:Lcom/google/android/gms/maps/OnMapReadyCallback;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zza;Lcom/google/android/gms/maps/OnMapReadyCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "var1",
            "var2"
        }
    .end annotation

    .line 13
    invoke-direct {p0}, Lcom/google/android/gms/maps/internal/zzaq;-><init>()V

    .line 14
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapCallback;->mMapCallback:Lcom/google/android/gms/maps/OnMapReadyCallback;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "var1"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapCallback;->mMapCallback:Lcom/google/android/gms/maps/OnMapReadyCallback;

    new-instance v1, Lcom/google/android/gms/maps/GoogleMap;

    invoke-direct {v1, p1}, Lcom/google/android/gms/maps/GoogleMap;-><init>(Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/OnMapReadyCallback;->onMapReady(Lcom/google/android/gms/maps/GoogleMap;)V

    return-void
.end method
