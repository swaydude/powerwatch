.class final Lcom/google/android/gms/internal/fitness/zzix;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-fitness@@18.0.0"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private zzzf:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final synthetic zzzg:Lcom/google/android/gms/internal/fitness/zziv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/fitness/zziv;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/fitness/zzix;->zzzg:Lcom/google/android/gms/internal/fitness/zziv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/internal/fitness/zziv;->zza(Lcom/google/android/gms/internal/fitness/zziv;)Lcom/google/android/gms/internal/fitness/zzgv;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/fitness/zzgv;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/fitness/zzix;->zzzf:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/fitness/zzix;->zzzf:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final synthetic next()Ljava/lang/Object;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/fitness/zzix;->zzzf:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final remove()V
    .locals 1

    .line 4
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
