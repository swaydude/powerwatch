.class public Lcom/google/android/gms/measurement/internal/zzgo;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement-impl@@17.2.3"

# interfaces
.implements Lcom/google/android/gms/measurement/internal/zzhh;


# static fields
.field private static volatile zza:Lcom/google/android/gms/measurement/internal/zzgo;


# instance fields
.field private zzaa:J

.field private volatile zzab:Ljava/lang/Boolean;

.field private zzac:Ljava/lang/Boolean;

.field private zzad:Ljava/lang/Boolean;

.field private zzae:I

.field private zzaf:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final zzag:J

.field private final zzb:Landroid/content/Context;

.field private final zzc:Ljava/lang/String;

.field private final zzd:Ljava/lang/String;

.field private final zze:Ljava/lang/String;

.field private final zzf:Z

.field private final zzg:Lcom/google/android/gms/measurement/internal/zzw;

.field private final zzh:Lcom/google/android/gms/measurement/internal/zzx;

.field private final zzi:Lcom/google/android/gms/measurement/internal/zzft;

.field private final zzj:Lcom/google/android/gms/measurement/internal/zzfk;

.field private final zzk:Lcom/google/android/gms/measurement/internal/zzgh;

.field private final zzl:Lcom/google/android/gms/measurement/internal/zzkc;

.field private final zzm:Lcom/google/android/gms/measurement/internal/zzla;

.field private final zzn:Lcom/google/android/gms/measurement/internal/zzfi;

.field private final zzo:Lcom/google/android/gms/common/util/Clock;

.field private final zzp:Lcom/google/android/gms/measurement/internal/zziw;

.field private final zzq:Lcom/google/android/gms/measurement/internal/zzhp;

.field private final zzr:Lcom/google/android/gms/measurement/internal/zzb;

.field private final zzs:Lcom/google/android/gms/measurement/internal/zzin;

.field private zzt:Lcom/google/android/gms/measurement/internal/zzfg;

.field private zzu:Lcom/google/android/gms/measurement/internal/zzix;

.field private zzv:Lcom/google/android/gms/measurement/internal/zzah;

.field private zzw:Lcom/google/android/gms/measurement/internal/zzfd;

.field private zzx:Lcom/google/android/gms/measurement/internal/zzfz;

.field private zzy:Z

.field private zzz:Ljava/lang/Boolean;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/measurement/internal/zzhq;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzy:Z

    .line 3
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzaf:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 4
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzhq;->zza:Landroid/content/Context;

    .line 6
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzw;

    invoke-direct {v2, v1}, Lcom/google/android/gms/measurement/internal/zzw;-><init>(Landroid/content/Context;)V

    .line 7
    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzg:Lcom/google/android/gms/measurement/internal/zzw;

    .line 9
    sput-object v2, Lcom/google/android/gms/measurement/internal/zzfa;->zza:Lcom/google/android/gms/measurement/internal/zzw;

    .line 10
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/zzhq;->zza:Landroid/content/Context;

    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzb:Landroid/content/Context;

    .line 11
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzhq;->zzb:Ljava/lang/String;

    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzc:Ljava/lang/String;

    .line 12
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzhq;->zzc:Ljava/lang/String;

    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzd:Ljava/lang/String;

    .line 13
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzhq;->zzd:Ljava/lang/String;

    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zze:Ljava/lang/String;

    .line 14
    iget-boolean v2, p1, Lcom/google/android/gms/measurement/internal/zzhq;->zzh:Z

    iput-boolean v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzf:Z

    .line 15
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzhq;->zze:Ljava/lang/Boolean;

    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzab:Ljava/lang/Boolean;

    .line 16
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/zzhq;->zzg:Lcom/google/android/gms/internal/measurement/zzv;

    if-eqz v2, :cond_1

    .line 17
    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzv;->zzg:Landroid/os/Bundle;

    if-eqz v3, :cond_1

    .line 18
    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/zzv;->zzg:Landroid/os/Bundle;

    const-string v4, "measurementEnabled"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 19
    instance-of v4, v3, Ljava/lang/Boolean;

    if-eqz v4, :cond_0

    .line 20
    check-cast v3, Ljava/lang/Boolean;

    iput-object v3, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzac:Ljava/lang/Boolean;

    .line 21
    :cond_0
    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/zzv;->zzg:Landroid/os/Bundle;

    const-string v3, "measurementDeactivated"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 22
    instance-of v3, v2, Ljava/lang/Boolean;

    if-eqz v3, :cond_1

    .line 23
    check-cast v2, Ljava/lang/Boolean;

    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzad:Ljava/lang/Boolean;

    .line 24
    :cond_1
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzcl;->zza(Landroid/content/Context;)V

    .line 26
    invoke-static {}, Lcom/google/android/gms/common/util/DefaultClock;->getInstance()Lcom/google/android/gms/common/util/Clock;

    move-result-object v2

    .line 27
    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzo:Lcom/google/android/gms/common/util/Clock;

    .line 28
    invoke-interface {v2}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzag:J

    .line 30
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzx;

    invoke-direct {v2, p0}, Lcom/google/android/gms/measurement/internal/zzx;-><init>(Lcom/google/android/gms/measurement/internal/zzgo;)V

    .line 31
    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzh:Lcom/google/android/gms/measurement/internal/zzx;

    .line 33
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzft;

    invoke-direct {v2, p0}, Lcom/google/android/gms/measurement/internal/zzft;-><init>(Lcom/google/android/gms/measurement/internal/zzgo;)V

    .line 35
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzhi;->zzab()V

    .line 36
    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzi:Lcom/google/android/gms/measurement/internal/zzft;

    .line 38
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzfk;

    invoke-direct {v2, p0}, Lcom/google/android/gms/measurement/internal/zzfk;-><init>(Lcom/google/android/gms/measurement/internal/zzgo;)V

    .line 40
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzhi;->zzab()V

    .line 41
    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzj:Lcom/google/android/gms/measurement/internal/zzfk;

    .line 43
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzla;

    invoke-direct {v2, p0}, Lcom/google/android/gms/measurement/internal/zzla;-><init>(Lcom/google/android/gms/measurement/internal/zzgo;)V

    .line 45
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzhi;->zzab()V

    .line 46
    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzm:Lcom/google/android/gms/measurement/internal/zzla;

    .line 48
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzfi;

    invoke-direct {v2, p0}, Lcom/google/android/gms/measurement/internal/zzfi;-><init>(Lcom/google/android/gms/measurement/internal/zzgo;)V

    .line 50
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzhi;->zzab()V

    .line 51
    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzn:Lcom/google/android/gms/measurement/internal/zzfi;

    .line 53
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzb;

    invoke-direct {v2, p0}, Lcom/google/android/gms/measurement/internal/zzb;-><init>(Lcom/google/android/gms/measurement/internal/zzgo;)V

    .line 54
    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzr:Lcom/google/android/gms/measurement/internal/zzb;

    .line 56
    new-instance v2, Lcom/google/android/gms/measurement/internal/zziw;

    invoke-direct {v2, p0}, Lcom/google/android/gms/measurement/internal/zziw;-><init>(Lcom/google/android/gms/measurement/internal/zzgo;)V

    .line 58
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zze;->zzx()V

    .line 59
    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzp:Lcom/google/android/gms/measurement/internal/zziw;

    .line 61
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzhp;

    invoke-direct {v2, p0}, Lcom/google/android/gms/measurement/internal/zzhp;-><init>(Lcom/google/android/gms/measurement/internal/zzgo;)V

    .line 63
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zze;->zzx()V

    .line 64
    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzq:Lcom/google/android/gms/measurement/internal/zzhp;

    .line 66
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzkc;

    invoke-direct {v2, p0}, Lcom/google/android/gms/measurement/internal/zzkc;-><init>(Lcom/google/android/gms/measurement/internal/zzgo;)V

    .line 68
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zze;->zzx()V

    .line 69
    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzl:Lcom/google/android/gms/measurement/internal/zzkc;

    .line 71
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzin;

    invoke-direct {v2, p0}, Lcom/google/android/gms/measurement/internal/zzin;-><init>(Lcom/google/android/gms/measurement/internal/zzgo;)V

    .line 73
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzhi;->zzab()V

    .line 74
    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzs:Lcom/google/android/gms/measurement/internal/zzin;

    .line 76
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzgh;

    invoke-direct {v2, p0}, Lcom/google/android/gms/measurement/internal/zzgh;-><init>(Lcom/google/android/gms/measurement/internal/zzgo;)V

    .line 78
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzhi;->zzab()V

    .line 79
    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzk:Lcom/google/android/gms/measurement/internal/zzgh;

    .line 80
    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzhq;->zzg:Lcom/google/android/gms/internal/measurement/zzv;

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/zzhq;->zzg:Lcom/google/android/gms/internal/measurement/zzv;

    iget-wide v5, v3, Lcom/google/android/gms/internal/measurement/zzv;->zzb:J

    const-wide/16 v7, 0x0

    cmp-long v3, v5, v7

    if-eqz v3, :cond_2

    const/4 v0, 0x1

    :cond_2
    xor-int/2addr v0, v4

    .line 85
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Landroid/app/Application;

    if-eqz v1, :cond_4

    .line 86
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzh()Lcom/google/android/gms/measurement/internal/zzhp;

    move-result-object v1

    .line 87
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzhf;->zzn()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    instance-of v3, v3, Landroid/app/Application;

    if-eqz v3, :cond_5

    .line 88
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzhf;->zzn()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    check-cast v3, Landroid/app/Application;

    .line 89
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/zzhp;->zza:Lcom/google/android/gms/measurement/internal/zzim;

    if-nez v4, :cond_3

    .line 90
    new-instance v4, Lcom/google/android/gms/measurement/internal/zzim;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v5}, Lcom/google/android/gms/measurement/internal/zzim;-><init>(Lcom/google/android/gms/measurement/internal/zzhp;Lcom/google/android/gms/measurement/internal/zzhr;)V

    iput-object v4, v1, Lcom/google/android/gms/measurement/internal/zzhp;->zza:Lcom/google/android/gms/measurement/internal/zzim;

    :cond_3
    if-eqz v0, :cond_5

    .line 92
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzhp;->zza:Lcom/google/android/gms/measurement/internal/zzim;

    .line 93
    invoke-virtual {v3, v0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 94
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzhp;->zza:Lcom/google/android/gms/measurement/internal/zzim;

    .line 95
    invoke-virtual {v3, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 96
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzhf;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfk;->zzx()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object v0

    const-string v1, "Registered activity lifecycle callback"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;)V

    goto :goto_0

    .line 98
    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfk;->zzi()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object v0

    const-string v1, "Application context is not an Application"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;)V

    .line 99
    :cond_5
    :goto_0
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzgq;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/measurement/internal/zzgq;-><init>(Lcom/google/android/gms/measurement/internal/zzgo;Lcom/google/android/gms/measurement/internal/zzhq;)V

    invoke-virtual {v2, v0}, Lcom/google/android/gms/measurement/internal/zzgh;->zza(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static zza(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzv;)Lcom/google/android/gms/measurement/internal/zzgo;
    .locals 11

    if-eqz p1, :cond_1

    .line 283
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzv;->zze:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzv;->zzf:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 284
    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzv;

    iget-wide v2, p1, Lcom/google/android/gms/internal/measurement/zzv;->zza:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/measurement/zzv;->zzb:J

    iget-boolean v6, p1, Lcom/google/android/gms/internal/measurement/zzv;->zzc:Z

    iget-object v7, p1, Lcom/google/android/gms/internal/measurement/zzv;->zzd:Ljava/lang/String;

    const/4 v8, 0x0

    const/4 v9, 0x0

    iget-object v10, p1, Lcom/google/android/gms/internal/measurement/zzv;->zzg:Landroid/os/Bundle;

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/internal/measurement/zzv;-><init>(JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    move-object p1, v0

    .line 285
    :cond_1
    invoke-static {p0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    sget-object v0, Lcom/google/android/gms/measurement/internal/zzgo;->zza:Lcom/google/android/gms/measurement/internal/zzgo;

    if-nez v0, :cond_3

    .line 288
    const-class v0, Lcom/google/android/gms/measurement/internal/zzgo;

    monitor-enter v0

    .line 289
    :try_start_0
    sget-object v1, Lcom/google/android/gms/measurement/internal/zzgo;->zza:Lcom/google/android/gms/measurement/internal/zzgo;

    if-nez v1, :cond_2

    .line 291
    new-instance v1, Lcom/google/android/gms/measurement/internal/zzhq;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/measurement/internal/zzhq;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzv;)V

    .line 293
    new-instance p0, Lcom/google/android/gms/measurement/internal/zzgo;

    invoke-direct {p0, v1}, Lcom/google/android/gms/measurement/internal/zzgo;-><init>(Lcom/google/android/gms/measurement/internal/zzhq;)V

    .line 294
    sput-object p0, Lcom/google/android/gms/measurement/internal/zzgo;->zza:Lcom/google/android/gms/measurement/internal/zzgo;

    .line 295
    :cond_2
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_3
    if-eqz p1, :cond_4

    .line 296
    iget-object p0, p1, Lcom/google/android/gms/internal/measurement/zzv;->zzg:Landroid/os/Bundle;

    if-eqz p0, :cond_4

    iget-object p0, p1, Lcom/google/android/gms/internal/measurement/zzv;->zzg:Landroid/os/Bundle;

    const-string v0, "dataCollectionDefaultEnabled"

    .line 297
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_4

    .line 298
    sget-object p0, Lcom/google/android/gms/measurement/internal/zzgo;->zza:Lcom/google/android/gms/measurement/internal/zzgo;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzv;->zzg:Landroid/os/Bundle;

    const-string v0, "dataCollectionDefaultEnabled"

    .line 299
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    .line 300
    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/zzgo;->zza(Z)V

    .line 301
    :cond_4
    :goto_0
    sget-object p0, Lcom/google/android/gms/measurement/internal/zzgo;->zza:Lcom/google/android/gms/measurement/internal/zzgo;

    return-object p0
.end method

.method public static zza(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/google/android/gms/measurement/internal/zzgo;
    .locals 10

    .line 282
    new-instance p1, Lcom/google/android/gms/internal/measurement/zzv;

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p1

    move-object v9, p3

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/measurement/zzv;-><init>(JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-static {p0, p1}, Lcom/google/android/gms/measurement/internal/zzgo;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzv;)Lcom/google/android/gms/measurement/internal/zzgo;

    move-result-object p0

    return-object p0
.end method

.method static synthetic zza(Lcom/google/android/gms/measurement/internal/zzgo;Lcom/google/android/gms/measurement/internal/zzhq;)V
    .locals 0

    .line 523
    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/zzgo;->zza(Lcom/google/android/gms/measurement/internal/zzhq;)V

    return-void
.end method

.method private static zza(Lcom/google/android/gms/measurement/internal/zzhf;)V
    .locals 1

    if-eqz p0, :cond_0

    return-void

    .line 316
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final zza(Lcom/google/android/gms/measurement/internal/zzhq;)V
    .locals 4

    .line 102
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzq()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzhf;->zzd()V

    .line 104
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzah;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/zzah;-><init>(Lcom/google/android/gms/measurement/internal/zzgo;)V

    .line 106
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzhi;->zzab()V

    .line 107
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzv:Lcom/google/android/gms/measurement/internal/zzah;

    .line 109
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzfd;

    iget-wide v1, p1, Lcom/google/android/gms/measurement/internal/zzhq;->zzf:J

    invoke-direct {v0, p0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzfd;-><init>(Lcom/google/android/gms/measurement/internal/zzgo;J)V

    .line 111
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zze;->zzx()V

    .line 112
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzw:Lcom/google/android/gms/measurement/internal/zzfd;

    .line 114
    new-instance p1, Lcom/google/android/gms/measurement/internal/zzfg;

    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/zzfg;-><init>(Lcom/google/android/gms/measurement/internal/zzgo;)V

    .line 116
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zze;->zzx()V

    .line 117
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzt:Lcom/google/android/gms/measurement/internal/zzfg;

    .line 119
    new-instance p1, Lcom/google/android/gms/measurement/internal/zzix;

    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/zzix;-><init>(Lcom/google/android/gms/measurement/internal/zzgo;)V

    .line 121
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zze;->zzx()V

    .line 122
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzu:Lcom/google/android/gms/measurement/internal/zzix;

    .line 123
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzm:Lcom/google/android/gms/measurement/internal/zzla;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzhi;->zzac()V

    .line 124
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzi:Lcom/google/android/gms/measurement/internal/zzft;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzhi;->zzac()V

    .line 126
    new-instance p1, Lcom/google/android/gms/measurement/internal/zzfz;

    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/zzfz;-><init>(Lcom/google/android/gms/measurement/internal/zzgo;)V

    .line 127
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzx:Lcom/google/android/gms/measurement/internal/zzfz;

    .line 128
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzw:Lcom/google/android/gms/measurement/internal/zzfd;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zze;->zzy()V

    .line 129
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzfk;->zzv()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object p1

    .line 130
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzh:Lcom/google/android/gms/measurement/internal/zzx;

    .line 131
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzx;->zze()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "App measurement initialized, version"

    invoke-virtual {p1, v2, v1}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;Ljava/lang/Object;)V

    .line 135
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzfk;->zzv()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object p1

    const-string v1, "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"

    invoke-virtual {p1, v1}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;)V

    .line 139
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfd;->zzab()Ljava/lang/String;

    move-result-object p1

    .line 141
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzc:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 143
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzi()Lcom/google/android/gms/measurement/internal/zzla;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/zzla;->zzf(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 144
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object p1

    .line 145
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzfk;->zzv()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object p1

    const-string v0, "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."

    goto :goto_1

    .line 147
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object v0

    .line 148
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfk;->zzv()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object v0

    const-string v1, "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    move-object v3, v0

    move-object v0, p1

    move-object p1, v3

    .line 149
    :goto_1
    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;)V

    .line 150
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzfk;->zzw()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object p1

    const-string v0, "Debug-level message logging enabled"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;)V

    .line 151
    iget p1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzae:I

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzaf:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-eq p1, v0, :cond_3

    .line 152
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object p1

    .line 153
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzfk;->zzf()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object p1

    iget v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzae:I

    .line 154
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzaf:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Not all components initialized"

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3
    const/4 p1, 0x1

    .line 155
    iput-boolean p1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzy:Z

    return-void
.end method

.method private final zzaj()Lcom/google/android/gms/measurement/internal/zzin;
    .locals 1

    .line 261
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzs:Lcom/google/android/gms/measurement/internal/zzin;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzb(Lcom/google/android/gms/measurement/internal/zzhi;)V

    .line 262
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzs:Lcom/google/android/gms/measurement/internal/zzin;

    return-object v0
.end method

.method private final zzak()V
    .locals 2

    .line 302
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzy:Z

    if-eqz v0, :cond_0

    return-void

    .line 303
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "AppMeasurement is not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static zzb(Lcom/google/android/gms/measurement/internal/zze;)V
    .locals 3

    if-eqz p0, :cond_1

    .line 312
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zze;->zzv()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 313
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1b

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Component not initialized: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 311
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static zzb(Lcom/google/android/gms/measurement/internal/zzhi;)V
    .locals 3

    if-eqz p0, :cond_1

    .line 307
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzhi;->zzz()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 308
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1b

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Component not initialized: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 306
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method protected final zza()V
    .locals 6

    .line 158
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzq()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzhf;->zzd()V

    .line 159
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzft;->zzc:Lcom/google/android/gms/measurement/internal/zzfy;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfy;->zza()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 160
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzft;->zzc:Lcom/google/android/gms/measurement/internal/zzfy;

    .line 161
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzo:Lcom/google/android/gms/common/util/Clock;

    .line 162
    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/measurement/internal/zzfy;->zza(J)V

    .line 163
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzft;->zzh:Lcom/google/android/gms/measurement/internal/zzfy;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfy;->zza()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 164
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    .line 165
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfk;->zzx()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object v0

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzag:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "Persisting first open"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;Ljava/lang/Object;)V

    .line 166
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzft;->zzh:Lcom/google/android/gms/measurement/internal/zzfy;

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzag:J

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzfy;->zza(J)V

    .line 167
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzah()Z

    move-result v0

    if-nez v0, :cond_6

    .line 168
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzab()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 169
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzi()Lcom/google/android/gms/measurement/internal/zzla;

    move-result-object v0

    const-string v1, "android.permission.INTERNET"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzla;->zzd(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 170
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfk;->zzf()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object v0

    const-string v1, "App is missing INTERNET permission"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;)V

    .line 171
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzi()Lcom/google/android/gms/measurement/internal/zzla;

    move-result-object v0

    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzla;->zzd(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 172
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfk;->zzf()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object v0

    const-string v1, "App is missing ACCESS_NETWORK_STATE permission"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;)V

    .line 177
    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzb:Landroid/content/Context;

    .line 178
    invoke-static {v0}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->isCallerInstantApp()Z

    move-result v0

    if-nez v0, :cond_5

    .line 179
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzh:Lcom/google/android/gms/measurement/internal/zzx;

    .line 180
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzx;->zzx()Z

    move-result v0

    if-nez v0, :cond_5

    .line 182
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzb:Landroid/content/Context;

    .line 183
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzge;->zza(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 184
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfk;->zzf()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object v0

    const-string v1, "AppMeasurementReceiver not registered/enabled"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;)V

    .line 186
    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzb:Landroid/content/Context;

    const/4 v1, 0x0

    .line 187
    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/zzla;->zza(Landroid/content/Context;Z)Z

    move-result v0

    if-nez v0, :cond_5

    .line 188
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfk;->zzf()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object v0

    const-string v1, "AppMeasurementService not registered/enabled"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;)V

    .line 189
    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfk;->zzf()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object v0

    const-string v1, "Uploading is not possible. App measurement disabled"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 194
    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzy()Lcom/google/android/gms/measurement/internal/zzfd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfd;->zzac()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    .line 195
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzy()Lcom/google/android/gms/measurement/internal/zzfd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfd;->zzad()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 196
    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzi()Lcom/google/android/gms/measurement/internal/zzla;

    .line 197
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzy()Lcom/google/android/gms/measurement/internal/zzfd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfd;->zzac()Ljava/lang/String;

    move-result-object v0

    .line 198
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzft;->zzh()Ljava/lang/String;

    move-result-object v2

    .line 199
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzy()Lcom/google/android/gms/measurement/internal/zzfd;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzfd;->zzad()Ljava/lang/String;

    move-result-object v3

    .line 200
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzft;->zzi()Ljava/lang/String;

    move-result-object v4

    .line 201
    invoke-static {v0, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/zzla;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 202
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfk;->zzv()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object v0

    const-string v2, "Rechecking which service to use due to a GMP App Id change"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;)V

    .line 203
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzft;->zzk()V

    .line 204
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzk()Lcom/google/android/gms/measurement/internal/zzfg;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfg;->zzab()V

    .line 205
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzu:Lcom/google/android/gms/measurement/internal/zzix;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzix;->zzah()V

    .line 206
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzu:Lcom/google/android/gms/measurement/internal/zzix;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzix;->zzaf()V

    .line 207
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzft;->zzh:Lcom/google/android/gms/measurement/internal/zzfy;

    iget-wide v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzag:J

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/zzfy;->zza(J)V

    .line 208
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzft;->zzj:Lcom/google/android/gms/measurement/internal/zzga;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzga;->zza(Ljava/lang/String;)V

    .line 209
    :cond_8
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzy()Lcom/google/android/gms/measurement/internal/zzfd;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzfd;->zzac()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzft;->zzc(Ljava/lang/String;)V

    .line 210
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzy()Lcom/google/android/gms/measurement/internal/zzfd;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzfd;->zzad()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzft;->zzd(Ljava/lang/String;)V

    .line 211
    :cond_9
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzh()Lcom/google/android/gms/measurement/internal/zzhp;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzft;->zzj:Lcom/google/android/gms/measurement/internal/zzga;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzga;->zza()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzhp;->zza(Ljava/lang/String;)V

    .line 215
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzka;->zzb()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 216
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzh:Lcom/google/android/gms/measurement/internal/zzx;

    .line 217
    sget-object v2, Lcom/google/android/gms/measurement/internal/zzap;->zzcq:Lcom/google/android/gms/measurement/internal/zzez;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzx;->zza(Lcom/google/android/gms/measurement/internal/zzez;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 218
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzi()Lcom/google/android/gms/measurement/internal/zzla;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzla;->zzv()Z

    move-result v0

    if-nez v0, :cond_a

    .line 219
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzft;->zzw:Lcom/google/android/gms/measurement/internal/zzga;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzga;->zza()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 220
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfk;->zzi()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object v0

    const-string v2, "Remote config removed with active feature rollouts"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;)V

    .line 221
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzft;->zzw:Lcom/google/android/gms/measurement/internal/zzga;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzga;->zza(Ljava/lang/String;)V

    .line 222
    :cond_a
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzy()Lcom/google/android/gms/measurement/internal/zzfd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfd;->zzac()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 223
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzy()Lcom/google/android/gms/measurement/internal/zzfd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfd;->zzad()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 224
    :cond_b
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzab()Z

    move-result v0

    .line 225
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzft;->zzx()Z

    move-result v1

    if-nez v1, :cond_c

    .line 226
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzh:Lcom/google/android/gms/measurement/internal/zzx;

    .line 227
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzx;->zzg()Z

    move-result v1

    if-nez v1, :cond_c

    .line 228
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v1

    xor-int/lit8 v2, v0, 0x1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/zzft;->zzc(Z)V

    :cond_c
    if-eqz v0, :cond_d

    .line 230
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzh()Lcom/google/android/gms/measurement/internal/zzhp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzhp;->zzai()V

    .line 231
    :cond_d
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zze()Lcom/google/android/gms/measurement/internal/zzkc;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzkc;->zza:Lcom/google/android/gms/measurement/internal/zzkm;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzkm;->zza()V

    .line 232
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzw()Lcom/google/android/gms/measurement/internal/zzix;

    move-result-object v0

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzix;->zza(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 233
    :cond_e
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzft;->zzo:Lcom/google/android/gms/measurement/internal/zzfv;

    .line 234
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzh:Lcom/google/android/gms/measurement/internal/zzx;

    .line 235
    sget-object v2, Lcom/google/android/gms/measurement/internal/zzap;->zzbi:Lcom/google/android/gms/measurement/internal/zzez;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/zzx;->zza(Lcom/google/android/gms/measurement/internal/zzez;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfv;->zza(Z)V

    .line 236
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzft;->zzp:Lcom/google/android/gms/measurement/internal/zzfv;

    .line 237
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzh:Lcom/google/android/gms/measurement/internal/zzx;

    .line 238
    sget-object v2, Lcom/google/android/gms/measurement/internal/zzap;->zzbj:Lcom/google/android/gms/measurement/internal/zzez;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/zzx;->zza(Lcom/google/android/gms/measurement/internal/zzez;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfv;->zza(Z)V

    return-void
.end method

.method final zza(Lcom/google/android/gms/measurement/internal/zze;)V
    .locals 0

    .line 403
    iget p1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzae:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzae:I

    return-void
.end method

.method final zza(Lcom/google/android/gms/measurement/internal/zzhi;)V
    .locals 0

    .line 401
    iget p1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzae:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzae:I

    return-void
.end method

.method final synthetic zza(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 6

    const-string p1, "gclid"

    const-string p5, ""

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/16 v2, 0xc8

    if-eq p2, v2, :cond_0

    const/16 v2, 0xcc

    if-eq p2, v2, :cond_0

    const/16 v2, 0x130

    if-ne p2, v2, :cond_1

    :cond_0
    if-nez p3, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_2

    .line 478
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object p1

    .line 479
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzfk;->zzi()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object p1

    .line 480
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string p4, "Network Request for Deferred Deep Link failed. response, exception"

    .line 481
    invoke-virtual {p1, p4, p2, p3}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 483
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object p2

    iget-object p2, p2, Lcom/google/android/gms/measurement/internal/zzft;->zzu:Lcom/google/android/gms/measurement/internal/zzfv;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/measurement/internal/zzfv;->zza(Z)V

    .line 484
    array-length p2, p4

    if-nez p2, :cond_3

    .line 485
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzfk;->zzw()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object p1

    const-string p2, "Deferred Deep Link response empty."

    invoke-virtual {p1, p2}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;)V

    return-void

    .line 487
    :cond_3
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, p4}, Ljava/lang/String;-><init>([B)V

    .line 488
    :try_start_0
    new-instance p3, Lorg/json/JSONObject;

    invoke-direct {p3, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p2, "deeplink"

    .line 490
    invoke-virtual {p3, p2, p5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 491
    invoke-virtual {p3, p1, p5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    const-string p5, "timestamp"

    const-wide/16 v2, 0x0

    .line 493
    invoke-virtual {p3, p5, v2, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v2

    .line 494
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-eqz p3, :cond_4

    .line 495
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzfk;->zzw()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object p1

    const-string p2, "Deferred Deep Link is empty."

    invoke-virtual {p1, p2}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;)V

    return-void

    .line 497
    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzi()Lcom/google/android/gms/measurement/internal/zzla;

    move-result-object p3

    .line 498
    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/zzhf;->zzb()V

    .line 499
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p5

    if-nez p5, :cond_5

    .line 501
    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/zzhf;->zzn()Landroid/content/Context;

    move-result-object p3

    .line 502
    invoke-virtual {p3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p3

    new-instance p5, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    .line 503
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-direct {p5, v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p3, p5, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p3

    if-eqz p3, :cond_5

    .line 504
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_5

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_6

    .line 506
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object p1

    .line 507
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzfk;->zzi()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object p1

    const-string p3, "Deferred Deep Link validation failed. gclid, deep link"

    .line 508
    invoke-virtual {p1, p3, p4, p2}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 510
    :cond_6
    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 511
    invoke-virtual {p3, p1, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "_cis"

    const-string p4, "ddp"

    .line 512
    invoke-virtual {p3, p1, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 513
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzq:Lcom/google/android/gms/measurement/internal/zzhp;

    const-string p4, "auto"

    const-string p5, "_cmp"

    invoke-virtual {p1, p4, p5, p3}, Lcom/google/android/gms/measurement/internal/zzhp;->zza(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 514
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzi()Lcom/google/android/gms/measurement/internal/zzla;

    move-result-object p1

    .line 515
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_7

    .line 516
    invoke-virtual {p1, p2, v2, v3}, Lcom/google/android/gms/measurement/internal/zzla;->zza(Ljava/lang/String;D)Z

    move-result p2

    if-eqz p2, :cond_7

    .line 517
    new-instance p2, Landroid/content/Intent;

    const-string p3, "android.google.analytics.action.DEEPLINK_ACTION"

    invoke-direct {p2, p3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 518
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/zzhf;->zzn()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_7
    return-void

    :catch_0
    move-exception p1

    .line 521
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/zzfk;->zzf()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object p2

    const-string p3, "Failed to parse the Deferred Deep Link response. exception"

    invoke-virtual {p2, p3, p1}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method final zza(Z)V
    .locals 0

    .line 318
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzab:Ljava/lang/Boolean;

    return-void
.end method

.method public final zzaa()Z
    .locals 1

    .line 320
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzab:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzab:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzab()Z
    .locals 4

    .line 321
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzkt;->zzb()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 322
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzh:Lcom/google/android/gms/measurement/internal/zzx;

    .line 323
    sget-object v3, Lcom/google/android/gms/measurement/internal/zzap;->zzcy:Lcom/google/android/gms/measurement/internal/zzez;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/measurement/internal/zzx;->zza(Lcom/google/android/gms/measurement/internal/zzez;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 324
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzac()I

    move-result v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    return v2

    .line 327
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzq()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzhf;->zzd()V

    .line 328
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzak()V

    .line 330
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzh:Lcom/google/android/gms/measurement/internal/zzx;

    .line 331
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzx;->zzg()Z

    move-result v0

    if-eqz v0, :cond_2

    return v2

    .line 333
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzad:Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    .line 334
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    return v2

    .line 336
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzft;->zzv()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 338
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 340
    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzh:Lcom/google/android/gms/measurement/internal/zzx;

    .line 341
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzx;->zzh()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 343
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 344
    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzac:Ljava/lang/Boolean;

    if-eqz v0, :cond_6

    .line 345
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 346
    :cond_6
    invoke-static {}, Lcom/google/android/gms/common/api/internal/GoogleServices;->isMeasurementExplicitlyDisabled()Z

    move-result v0

    if-eqz v0, :cond_7

    return v2

    .line 350
    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzh:Lcom/google/android/gms/measurement/internal/zzx;

    .line 351
    sget-object v2, Lcom/google/android/gms/measurement/internal/zzap;->zzaz:Lcom/google/android/gms/measurement/internal/zzez;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzx;->zza(Lcom/google/android/gms/measurement/internal/zzez;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzab:Ljava/lang/Boolean;

    if-eqz v0, :cond_8

    .line 352
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzab:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_8
    return v1
.end method

.method public final zzac()I
    .locals 3

    .line 356
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzq()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzhf;->zzd()V

    .line 358
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzh:Lcom/google/android/gms/measurement/internal/zzx;

    .line 359
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzx;->zzg()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 361
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzad:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    .line 362
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    return v0

    .line 364
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzft;->zzv()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 366
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    const/4 v0, 0x3

    return v0

    .line 368
    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzh:Lcom/google/android/gms/measurement/internal/zzx;

    .line 369
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzx;->zzh()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 371
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    return v1

    :cond_4
    const/4 v0, 0x4

    return v0

    .line 372
    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzac:Ljava/lang/Boolean;

    if-eqz v0, :cond_7

    .line 373
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_6

    return v1

    :cond_6
    const/4 v0, 0x5

    return v0

    .line 377
    :cond_7
    invoke-static {}, Lcom/google/android/gms/common/api/internal/GoogleServices;->isMeasurementExplicitlyDisabled()Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v0, 0x6

    return v0

    .line 381
    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzh:Lcom/google/android/gms/measurement/internal/zzx;

    .line 382
    sget-object v2, Lcom/google/android/gms/measurement/internal/zzap;->zzaz:Lcom/google/android/gms/measurement/internal/zzez;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/zzx;->zza(Lcom/google/android/gms/measurement/internal/zzez;)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzab:Ljava/lang/Boolean;

    if-eqz v0, :cond_a

    .line 383
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzab:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_9

    return v1

    :cond_9
    const/4 v0, 0x7

    return v0

    :cond_a
    return v1
.end method

.method final zzad()J
    .locals 6

    .line 388
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzft;->zzh:Lcom/google/android/gms/measurement/internal/zzfy;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfy;->zza()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 389
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    .line 390
    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzag:J

    return-wide v0

    .line 391
    :cond_0
    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzag:J

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method final zzae()V
    .locals 0

    return-void
.end method

.method final zzaf()V
    .locals 2

    .line 400
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected call on client side"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method final zzag()V
    .locals 1

    .line 405
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzaf:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method protected final zzah()Z
    .locals 6

    .line 407
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzak()V

    .line 409
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzq()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzhf;->zzd()V

    .line 410
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzz:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzaa:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    if-eqz v0, :cond_5

    .line 411
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_5

    .line 412
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzo:Lcom/google/android/gms/common/util/Clock;

    .line 413
    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzaa:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    cmp-long v4, v0, v2

    if-lez v4, :cond_5

    .line 415
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzo:Lcom/google/android/gms/common/util/Clock;

    .line 416
    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzaa:J

    .line 422
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzi()Lcom/google/android/gms/measurement/internal/zzla;

    move-result-object v0

    const-string v1, "android.permission.INTERNET"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzla;->zzd(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 423
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzi()Lcom/google/android/gms/measurement/internal/zzla;

    move-result-object v0

    const-string v3, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/measurement/internal/zzla;->zzd(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 424
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzb:Landroid/content/Context;

    .line 425
    invoke-static {v0}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->isCallerInstantApp()Z

    move-result v0

    if-nez v0, :cond_1

    .line 426
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzh:Lcom/google/android/gms/measurement/internal/zzx;

    .line 427
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzx;->zzx()Z

    move-result v0

    if-nez v0, :cond_1

    .line 428
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzb:Landroid/content/Context;

    .line 429
    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzge;->zza(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 430
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzb:Landroid/content/Context;

    .line 431
    invoke-static {v0, v2}, Lcom/google/android/gms/measurement/internal/zzla;->zza(Landroid/content/Context;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 432
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzz:Ljava/lang/Boolean;

    .line 433
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 435
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzi()Lcom/google/android/gms/measurement/internal/zzla;

    move-result-object v0

    .line 436
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzy()Lcom/google/android/gms/measurement/internal/zzfd;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzfd;->zzac()Ljava/lang/String;

    move-result-object v3

    .line 437
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzy()Lcom/google/android/gms/measurement/internal/zzfd;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzfd;->zzad()Ljava/lang/String;

    move-result-object v4

    .line 438
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzy()Lcom/google/android/gms/measurement/internal/zzfd;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/zzfd;->zzae()Ljava/lang/String;

    move-result-object v5

    .line 439
    invoke-virtual {v0, v3, v4, v5}, Lcom/google/android/gms/measurement/internal/zzla;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 440
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzy()Lcom/google/android/gms/measurement/internal/zzfd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfd;->zzad()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    .line 441
    :cond_4
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzz:Ljava/lang/Boolean;

    .line 442
    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzz:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zzai()V
    .locals 10

    .line 444
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzq()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzhf;->zzd()V

    .line 445
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzaj()Lcom/google/android/gms/measurement/internal/zzin;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzb(Lcom/google/android/gms/measurement/internal/zzhi;)V

    .line 446
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzy()Lcom/google/android/gms/measurement/internal/zzfd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfd;->zzab()Ljava/lang/String;

    move-result-object v0

    .line 448
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/measurement/internal/zzft;->zza(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v1

    .line 450
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzh:Lcom/google/android/gms/measurement/internal/zzx;

    .line 451
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzx;->zzi()Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    .line 452
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/CharSequence;

    .line 453
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 456
    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzaj()Lcom/google/android/gms/measurement/internal/zzin;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzin;->zzg()Z

    move-result v2

    if-nez v2, :cond_1

    .line 457
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfk;->zzi()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object v0

    const-string v1, "Network is not available for Deferred Deep Link request. Skipping"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;)V

    return-void

    .line 460
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzi()Lcom/google/android/gms/measurement/internal/zzla;

    move-result-object v2

    .line 461
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzy()Lcom/google/android/gms/measurement/internal/zzfd;

    move-result-object v3

    .line 462
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzhf;->zzt()Lcom/google/android/gms/measurement/internal/zzx;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzx;->zze()J

    move-result-wide v3

    .line 463
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    .line 464
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzc()Lcom/google/android/gms/measurement/internal/zzft;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzft;->zzv:Lcom/google/android/gms/measurement/internal/zzfy;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzfy;->zza()J

    move-result-wide v6

    const-wide/16 v8, 0x1

    sub-long/2addr v6, v8

    move-object v1, v2

    move-wide v2, v3

    move-object v4, v0

    .line 465
    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/measurement/internal/zzla;->zza(JLjava/lang/String;Ljava/lang/String;J)Ljava/net/URL;

    move-result-object v4

    .line 466
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzaj()Lcom/google/android/gms/measurement/internal/zzin;

    move-result-object v2

    new-instance v7, Lcom/google/android/gms/measurement/internal/zzgn;

    invoke-direct {v7, p0}, Lcom/google/android/gms/measurement/internal/zzgn;-><init>(Lcom/google/android/gms/measurement/internal/zzgo;)V

    .line 468
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzhf;->zzd()V

    .line 469
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzhi;->zzaa()V

    .line 470
    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    invoke-static {v7}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzhf;->zzq()Lcom/google/android/gms/measurement/internal/zzgh;

    move-result-object v8

    new-instance v9, Lcom/google/android/gms/measurement/internal/zzip;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v9

    move-object v3, v0

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/measurement/internal/zzip;-><init>(Lcom/google/android/gms/measurement/internal/zzin;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lcom/google/android/gms/measurement/internal/zziq;)V

    .line 473
    invoke-virtual {v8, v9}, Lcom/google/android/gms/measurement/internal/zzgh;->zzb(Ljava/lang/Runnable;)V

    return-void

    .line 454
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzr()Lcom/google/android/gms/measurement/internal/zzfk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfk;->zzw()Lcom/google/android/gms/measurement/internal/zzfm;

    move-result-object v0

    const-string v1, "ADID unavailable to retrieve Deferred Deep Link. Skipping"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfm;->zza(Ljava/lang/String;)V

    return-void
.end method

.method public final zzb()Lcom/google/android/gms/measurement/internal/zzx;
    .locals 1

    .line 241
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzh:Lcom/google/android/gms/measurement/internal/zzx;

    return-object v0
.end method

.method public final zzc()Lcom/google/android/gms/measurement/internal/zzft;
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzi:Lcom/google/android/gms/measurement/internal/zzft;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzgo;->zza(Lcom/google/android/gms/measurement/internal/zzhf;)V

    .line 243
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzi:Lcom/google/android/gms/measurement/internal/zzft;

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/measurement/internal/zzfk;
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzj:Lcom/google/android/gms/measurement/internal/zzfk;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzhi;->zzz()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzj:Lcom/google/android/gms/measurement/internal/zzfk;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zze()Lcom/google/android/gms/measurement/internal/zzkc;
    .locals 1

    .line 249
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzl:Lcom/google/android/gms/measurement/internal/zzkc;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzb(Lcom/google/android/gms/measurement/internal/zze;)V

    .line 250
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzl:Lcom/google/android/gms/measurement/internal/zzkc;

    return-object v0
.end method

.method public final zzf()Lcom/google/android/gms/measurement/internal/zzfz;
    .locals 1

    .line 251
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzx:Lcom/google/android/gms/measurement/internal/zzfz;

    return-object v0
.end method

.method final zzg()Lcom/google/android/gms/measurement/internal/zzgh;
    .locals 1

    .line 252
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzk:Lcom/google/android/gms/measurement/internal/zzgh;

    return-object v0
.end method

.method public final zzh()Lcom/google/android/gms/measurement/internal/zzhp;
    .locals 1

    .line 253
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzq:Lcom/google/android/gms/measurement/internal/zzhp;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzb(Lcom/google/android/gms/measurement/internal/zze;)V

    .line 254
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzq:Lcom/google/android/gms/measurement/internal/zzhp;

    return-object v0
.end method

.method public final zzi()Lcom/google/android/gms/measurement/internal/zzla;
    .locals 1

    .line 255
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzm:Lcom/google/android/gms/measurement/internal/zzla;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzgo;->zza(Lcom/google/android/gms/measurement/internal/zzhf;)V

    .line 256
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzm:Lcom/google/android/gms/measurement/internal/zzla;

    return-object v0
.end method

.method public final zzj()Lcom/google/android/gms/measurement/internal/zzfi;
    .locals 1

    .line 257
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzn:Lcom/google/android/gms/measurement/internal/zzfi;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzgo;->zza(Lcom/google/android/gms/measurement/internal/zzhf;)V

    .line 258
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzn:Lcom/google/android/gms/measurement/internal/zzfi;

    return-object v0
.end method

.method public final zzk()Lcom/google/android/gms/measurement/internal/zzfg;
    .locals 1

    .line 259
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzt:Lcom/google/android/gms/measurement/internal/zzfg;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzb(Lcom/google/android/gms/measurement/internal/zze;)V

    .line 260
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzt:Lcom/google/android/gms/measurement/internal/zzfg;

    return-object v0
.end method

.method public final zzl()Z
    .locals 1

    .line 264
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzc:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method public final zzm()Lcom/google/android/gms/common/util/Clock;
    .locals 1

    .line 269
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzo:Lcom/google/android/gms/common/util/Clock;

    return-object v0
.end method

.method public final zzn()Landroid/content/Context;
    .locals 1

    .line 263
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzb:Landroid/content/Context;

    return-object v0
.end method

.method public final zzo()Ljava/lang/String;
    .locals 1

    .line 265
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzc:Ljava/lang/String;

    return-object v0
.end method

.method public final zzp()Ljava/lang/String;
    .locals 1

    .line 266
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzd:Ljava/lang/String;

    return-object v0
.end method

.method public final zzq()Lcom/google/android/gms/measurement/internal/zzgh;
    .locals 1

    .line 247
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzk:Lcom/google/android/gms/measurement/internal/zzgh;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzb(Lcom/google/android/gms/measurement/internal/zzhi;)V

    .line 248
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzk:Lcom/google/android/gms/measurement/internal/zzgh;

    return-object v0
.end method

.method public final zzr()Lcom/google/android/gms/measurement/internal/zzfk;
    .locals 1

    .line 244
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzj:Lcom/google/android/gms/measurement/internal/zzfk;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzb(Lcom/google/android/gms/measurement/internal/zzhi;)V

    .line 245
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzj:Lcom/google/android/gms/measurement/internal/zzfk;

    return-object v0
.end method

.method public final zzs()Ljava/lang/String;
    .locals 1

    .line 267
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zze:Ljava/lang/String;

    return-object v0
.end method

.method public final zzt()Z
    .locals 1

    .line 268
    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzf:Z

    return v0
.end method

.method public final zzu()Lcom/google/android/gms/measurement/internal/zzw;
    .locals 1

    .line 240
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzg:Lcom/google/android/gms/measurement/internal/zzw;

    return-object v0
.end method

.method public final zzv()Lcom/google/android/gms/measurement/internal/zziw;
    .locals 1

    .line 270
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzp:Lcom/google/android/gms/measurement/internal/zziw;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzb(Lcom/google/android/gms/measurement/internal/zze;)V

    .line 271
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzp:Lcom/google/android/gms/measurement/internal/zziw;

    return-object v0
.end method

.method public final zzw()Lcom/google/android/gms/measurement/internal/zzix;
    .locals 1

    .line 272
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzu:Lcom/google/android/gms/measurement/internal/zzix;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzb(Lcom/google/android/gms/measurement/internal/zze;)V

    .line 273
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzu:Lcom/google/android/gms/measurement/internal/zzix;

    return-object v0
.end method

.method public final zzx()Lcom/google/android/gms/measurement/internal/zzah;
    .locals 1

    .line 274
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzv:Lcom/google/android/gms/measurement/internal/zzah;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzb(Lcom/google/android/gms/measurement/internal/zzhi;)V

    .line 275
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzv:Lcom/google/android/gms/measurement/internal/zzah;

    return-object v0
.end method

.method public final zzy()Lcom/google/android/gms/measurement/internal/zzfd;
    .locals 1

    .line 276
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzw:Lcom/google/android/gms/measurement/internal/zzfd;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzgo;->zzb(Lcom/google/android/gms/measurement/internal/zze;)V

    .line 277
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzw:Lcom/google/android/gms/measurement/internal/zzfd;

    return-object v0
.end method

.method public final zzz()Lcom/google/android/gms/measurement/internal/zzb;
    .locals 2

    .line 278
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzgo;->zzr:Lcom/google/android/gms/measurement/internal/zzb;

    if-eqz v0, :cond_0

    return-object v0

    .line 280
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Component not created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
