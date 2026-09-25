.class final Lcom/google/android/gms/measurement/internal/zzgq;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement-impl@@17.2.3"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/measurement/internal/zzhq;

.field private final synthetic zzb:Lcom/google/android/gms/measurement/internal/zzgo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzgo;Lcom/google/android/gms/measurement/internal/zzhq;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzgq;->zzb:Lcom/google/android/gms/measurement/internal/zzgo;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzgq;->zza:Lcom/google/android/gms/measurement/internal/zzhq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgq;->zzb:Lcom/google/android/gms/measurement/internal/zzgo;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzgq;->zza:Lcom/google/android/gms/measurement/internal/zzhq;

    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/zzgo;->zza(Lcom/google/android/gms/measurement/internal/zzgo;Lcom/google/android/gms/measurement/internal/zzhq;)V

    .line 3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgq;->zzb:Lcom/google/android/gms/measurement/internal/zzgo;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgo;->zza()V

    return-void
.end method
