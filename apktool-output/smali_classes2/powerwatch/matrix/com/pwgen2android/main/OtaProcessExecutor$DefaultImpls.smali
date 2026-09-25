.class public final Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor$DefaultImpls;
.super Ljava/lang/Object;
.source "OtaProcessExecutorImpl.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic startOTA$default(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 12

    if-nez p6, :cond_4

    and-int/lit8 v0, p5, 0x1

    const-string v1, ""

    if-eqz v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_1

    .line 39
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/16 v10, 0x2f

    const/4 v11, 0x0

    move-object v3, v2

    invoke-direct/range {v3 .. v11}, Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    move-object v2, p2

    :goto_1
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, p3

    :goto_2
    and-int/lit8 v3, p5, 0x8

    if-eqz v3, :cond_3

    const/4 v3, 0x1

    move-object v4, p0

    goto :goto_3

    :cond_3
    move-object v4, p0

    move/from16 v3, p4

    :goto_3
    invoke-interface {p0, v0, v2, v1, v3}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;->startOTA(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Ljava/lang/String;Z)V

    return-void

    :cond_4
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: startOTA"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
