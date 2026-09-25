.class final Lcom/google/android/gms/measurement/internal/zzii;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement-impl@@17.2.3"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Z

.field private final synthetic zzb:Lcom/google/android/gms/measurement/internal/zzhp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzhp;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzii;->zzb:Lcom/google/android/gms/measurement/internal/zzhp;

    iput-boolean p2, p0, Lcom/google/android/gms/measurement/internal/zzii;->zza:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzii;->zzb:Lcom/google/android/gms/measurement/internal/zzhp;

    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/zzii;->zza:Z

    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/zzhp;->zza(Lcom/google/android/gms/measurement/internal/zzhp;Z)V

    return-void
.end method
