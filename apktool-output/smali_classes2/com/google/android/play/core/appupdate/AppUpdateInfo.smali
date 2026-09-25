.class public abstract Lcom/google/android/play/core/appupdate/AppUpdateInfo;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;IIIIJJLandroid/app/PendingIntent;Landroid/app/PendingIntent;)Lcom/google/android/play/core/appupdate/AppUpdateInfo;
    .locals 13

    new-instance v12, Lcom/google/android/play/core/appupdate/k;

    move-object v0, v12

    move-object v1, p0

    move v2, p1

    move v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v11}, Lcom/google/android/play/core/appupdate/k;-><init>(Ljava/lang/String;IIIIJJLandroid/app/PendingIntent;Landroid/app/PendingIntent;)V

    return-object v12
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract availableVersionCode()I
.end method

.method public abstract b()J
.end method

.method public abstract c()J
.end method

.method abstract d()Landroid/app/PendingIntent;
.end method

.method abstract e()Landroid/app/PendingIntent;
.end method

.method public abstract installStatus()I
.end method

.method public isUpdateTypeAllowed(I)Z
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/play/core/appupdate/AppUpdateInfo;->e()Landroid/app/PendingIntent;

    move-result-object p1

    if-eqz p1, :cond_0

    return v1

    :cond_0
    return v0

    :cond_1
    if-ne p1, v1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/play/core/appupdate/AppUpdateInfo;->d()Landroid/app/PendingIntent;

    move-result-object p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    return v0
.end method

.method public abstract packageName()Ljava/lang/String;
.end method

.method public abstract updateAvailability()I
.end method
