.class final Lcom/google/android/gms/measurement/internal/zzji;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement-impl@@17.2.3"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/measurement/internal/zzan;

.field private final synthetic zzb:Ljava/lang/String;

.field private final synthetic zzc:Lcom/google/android/gms/internal/measurement/zzn;

.field private final synthetic zzd:Lcom/google/android/gms/measurement/internal/zzix;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzix;Lcom/google/android/gms/measurement/internal/zzan;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzn;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzji;->zzd:Lcom/google/android/gms/measurement/internal/zzix;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzji;->zza:Lcom/google/android/gms/measurement/internal/zzan;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzji;->zzb:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/zzji;->zzc:Lcom/google/android/gms/internal/measurement/zzn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const/4 v0, 0x0

    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzji;->zzd:Lcom/google/android/gms/measurement/internal/zzix;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/zzix;->zzd(Lcom/google/android/gms/measurement/internal/zzix;)Lcom/google/android/gms/measurement/internal/zzfc;

    move-result-object v1

    if-nez v1, :cond_0

    .line 5
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzji;->zzd:Lcom/google/android/gms/measurement/internal/zzix;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzhf;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object v1

    .line 6
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzfk;->zzf()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object v1

    const-string v2, "Discarding data. Failed to send event to service to bundle"

    .line 7
    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzji;->zzd:Lcom/google/android/gms/measurement/internal/zzix;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzhf;->zzp()Lcom/google/android/gms/measurement/internal/zzla;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzji;->zzc:Lcom/google/android/gms/internal/measurement/zzn;

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/zzla;->zza(Lcom/google/android/gms/internal/measurement/zzn;[B)V

    return-void

    .line 10
    :cond_0
    :try_start_1
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzji;->zza:Lcom/google/android/gms/measurement/internal/zzan;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzji;->zzb:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/zzfc;->zza(Lcom/google/android/gms/measurement/internal/zzan;Ljava/lang/String;)[B

    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzji;->zzd:Lcom/google/android/gms/measurement/internal/zzix;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/zzix;->zze(Lcom/google/android/gms/measurement/internal/zzix;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzji;->zzd:Lcom/google/android/gms/measurement/internal/zzix;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzhf;->zzp()Lcom/google/android/gms/measurement/internal/zzla;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzji;->zzc:Lcom/google/android/gms/internal/measurement/zzn;

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/zzla;->zza(Lcom/google/android/gms/internal/measurement/zzn;[B)V

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 15
    :try_start_2
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzji;->zzd:Lcom/google/android/gms/measurement/internal/zzix;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzhf;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzfk;->zzf()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object v2

    const-string v3, "Failed to send event to the service to bundle"

    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 16
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzji;->zzd:Lcom/google/android/gms/measurement/internal/zzix;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzhf;->zzp()Lcom/google/android/gms/measurement/internal/zzla;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzji;->zzc:Lcom/google/android/gms/internal/measurement/zzn;

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/zzla;->zza(Lcom/google/android/gms/internal/measurement/zzn;[B)V

    return-void

    .line 18
    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzji;->zzd:Lcom/google/android/gms/measurement/internal/zzix;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzhf;->zzp()Lcom/google/android/gms/measurement/internal/zzla;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzji;->zzc:Lcom/google/android/gms/internal/measurement/zzn;

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/measurement/internal/zzla;->zza(Lcom/google/android/gms/internal/measurement/zzn;[B)V

    .line 19
    throw v1
.end method
