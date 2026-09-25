.class final Lcom/google/android/gms/measurement/internal/zzjg;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement-impl@@17.2.3"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/measurement/internal/zzm;

.field private final synthetic zzb:Z

.field private final synthetic zzc:Lcom/google/android/gms/measurement/internal/zzix;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzix;Lcom/google/android/gms/measurement/internal/zzm;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzjg;->zzc:Lcom/google/android/gms/measurement/internal/zzix;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzjg;->zza:Lcom/google/android/gms/measurement/internal/zzm;

    iput-boolean p3, p0, Lcom/google/android/gms/measurement/internal/zzjg;->zzb:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzjg;->zzc:Lcom/google/android/gms/measurement/internal/zzix;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzix;->zzd(Lcom/google/android/gms/measurement/internal/zzix;)Lcom/google/android/gms/measurement/internal/zzfc;

    move-result-object v0

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzjg;->zzc:Lcom/google/android/gms/measurement/internal/zzix;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzhf;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfk;->zzf()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object v0

    const-string v1, "Discarding data. Failed to send app launch"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;)V

    return-void

    .line 6
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzjg;->zza:Lcom/google/android/gms/measurement/internal/zzm;

    invoke-interface {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfc;->zza(Lcom/google/android/gms/measurement/internal/zzm;)V

    .line 7
    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/zzjg;->zzb:Z

    if-eqz v1, :cond_1

    .line 8
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzjg;->zzc:Lcom/google/android/gms/measurement/internal/zzix;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzf;->zzj()Lcom/google/android/gms/measurement/internal/zzfg;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzfg;->zzad()Z

    .line 9
    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzjg;->zzc:Lcom/google/android/gms/measurement/internal/zzix;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzjg;->zza:Lcom/google/android/gms/measurement/internal/zzm;

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/measurement/internal/zzix;->zza(Lcom/google/android/gms/measurement/internal/zzfc;Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Lcom/google/android/gms/measurement/internal/zzm;)V

    .line 10
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzjg;->zzc:Lcom/google/android/gms/measurement/internal/zzix;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzix;->zze(Lcom/google/android/gms/measurement/internal/zzix;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 13
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzjg;->zzc:Lcom/google/android/gms/measurement/internal/zzix;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzhf;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzfk;->zzf()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object v1

    const-string v2, "Failed to send app launch to the service"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
