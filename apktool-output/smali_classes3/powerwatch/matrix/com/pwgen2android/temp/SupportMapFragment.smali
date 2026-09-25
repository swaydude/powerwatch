.class public Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;
.super Landroidx/fragment/app/Fragment;
.source "SupportMapFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zza;,
        Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;
    }
.end annotation


# instance fields
.field private final zzcg:Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 49
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 35
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;-><init>(Landroidx/fragment/app/Fragment;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;->zzcg:Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;

    return-void
.end method

.method public static newInstance()Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;
    .locals 1

    .line 38
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;-><init>()V

    return-object v0
.end method

.method public static newInstance(Lcom/google/android/gms/maps/GoogleMapOptions;)Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "var0"
        }
    .end annotation

    .line 42
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;-><init>()V

    .line 44
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "MapOptions"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 45
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public getMapAsync(Lcom/google/android/gms/maps/OnMapReadyCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "var1"
        }
    .end annotation

    const-string v0, "getMapAsync must be called on the main thread."

    .line 156
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkMainThread(Ljava/lang/String;)V

    .line 157
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;->zzcg:Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;->getMapAsync(Lcom/google/android/gms/maps/OnMapReadyCallback;)V

    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "var1"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 122
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 125
    :cond_0
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "var1"
        }
    .end annotation

    .line 53
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 54
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;->zzcg:Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;->access$000(Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;Landroid/app/Activity;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "var1"
        }
    .end annotation

    .line 75
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 76
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;->zzcg:Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "var1",
            "var2",
            "var3"
        }
    .end annotation

    .line 81
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;->zzcg:Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;

    invoke-virtual {v0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/view/View;->setClickable(Z)V

    return-object p1
.end method

.method public onDestroy()V
    .locals 1

    .line 111
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;->zzcg:Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;->onDestroy()V

    .line 112
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 106
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;->zzcg:Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;->onDestroyView()V

    .line 107
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    return-void
.end method

.method public final onEnterAmbient(Landroid/os/Bundle;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "var1"
        }
    .end annotation

    const-string v0, "onEnterAmbient must be called on the main thread."

    .line 138
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkMainThread(Ljava/lang/String;)V

    .line 139
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;->zzcg:Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;

    .line 140
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;->getDelegate()Lcom/google/android/gms/dynamic/LifecycleDelegate;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 141
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;->getDelegate()Lcom/google/android/gms/dynamic/LifecycleDelegate;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zza;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zza;->onEnterAmbient(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final onExitAmbient()V
    .locals 2

    const-string v0, "onExitAmbient must be called on the main thread."

    .line 147
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkMainThread(Ljava/lang/String;)V

    .line 148
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;->zzcg:Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;

    .line 149
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;->getDelegate()Lcom/google/android/gms/dynamic/LifecycleDelegate;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 150
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;->getDelegate()Lcom/google/android/gms/dynamic/LifecycleDelegate;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zza;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zza;->onExitAmbient()V

    :cond_0
    return-void
.end method

.method public onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "var1",
            "var2",
            "var3"
        }
    .end annotation

    .line 58
    invoke-static {}, Landroid/os/StrictMode;->getThreadPolicy()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    .line 59
    new-instance v1, Landroid/os/StrictMode$ThreadPolicy$Builder;

    invoke-direct {v1, v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>(Landroid/os/StrictMode$ThreadPolicy;)V

    invoke-virtual {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->permitAll()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v1

    invoke-static {v1}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 62
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    .line 63
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;->zzcg:Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;

    invoke-static {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;->access$000(Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;Landroid/app/Activity;)V

    .line 64
    invoke-static {p1, p2}, Lcom/google/android/gms/maps/GoogleMapOptions;->createFromAttributes(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/google/android/gms/maps/GoogleMapOptions;

    move-result-object p2

    .line 66
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "MapOptions"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 67
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;->zzcg:Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;

    invoke-virtual {p2, p1, v1, p3}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;->onInflate(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 70
    throw p1
.end method

.method public onLowMemory()V
    .locals 1

    .line 116
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;->zzcg:Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;->onLowMemory()V

    .line 117
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onLowMemory()V

    return-void
.end method

.method public onPause()V
    .locals 1

    .line 91
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;->zzcg:Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;->onPause()V

    .line 92
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 1

    .line 86
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 87
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;->zzcg:Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;->onResume()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "var1"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 130
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 133
    :cond_0
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 134
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;->zzcg:Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    .line 96
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onStart()V

    .line 97
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;->zzcg:Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;->onStart()V

    return-void
.end method

.method public onStop()V
    .locals 1

    .line 101
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;->zzcg:Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment$zzb;->onStop()V

    .line 102
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onStop()V

    return-void
.end method

.method public setArguments(Landroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "var1"
        }
    .end annotation

    .line 161
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    return-void
.end method
