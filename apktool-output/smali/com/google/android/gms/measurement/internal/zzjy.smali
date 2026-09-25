.class final synthetic Lcom/google/android/gms/measurement/internal/zzjy;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement@@17.2.3"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zza:Lcom/google/android/gms/measurement/internal/zzjv;

.field private final zzb:I

.field private final zzc:Lcom/google/android/gms/measurement/internal/zzfk;

.field private final zzd:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzjv;ILcom/google/android/gms/measurement/internal/zzfk;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzjy;->zza:Lcom/google/android/gms/measurement/internal/zzjv;

    iput p2, p0, Lcom/google/android/gms/measurement/internal/zzjy;->zzb:I

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzjy;->zzc:Lcom/google/android/gms/measurement/internal/zzfk;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/zzjy;->zzd:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzjy;->zza:Lcom/google/android/gms/measurement/internal/zzjv;

    iget v1, p0, Lcom/google/android/gms/measurement/internal/zzjy;->zzb:I

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzjy;->zzc:Lcom/google/android/gms/measurement/internal/zzfk;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzjy;->zzd:Landroid/content/Intent;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/zzjv;->zza(ILcom/google/android/gms/measurement/internal/zzfk;Landroid/content/Intent;)V

    return-void
.end method
