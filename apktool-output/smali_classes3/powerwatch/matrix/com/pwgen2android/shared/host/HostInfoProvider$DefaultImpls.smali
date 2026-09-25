.class public final Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider$DefaultImpls;
.super Ljava/lang/Object;
.source "HostInfoProvider.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;
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
.method public static synthetic hostInfo$default(Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;ZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;
    .locals 0

    if-nez p3, :cond_1

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    .line 24
    :cond_0
    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;->hostInfo(Z)Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: hostInfo"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
