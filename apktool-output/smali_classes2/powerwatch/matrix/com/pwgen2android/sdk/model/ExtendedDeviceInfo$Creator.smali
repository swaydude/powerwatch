.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo$Creator;
.super Ljava/lang/Object;
.source "Entities.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;-><clinit>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;",
        ">;"
    }
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo$Creator;->createFromParcel(Landroid/os/Parcel;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;

    move-result-object p1

    return-object p1
.end method

.method public final createFromParcel(Landroid/os/Parcel;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;
    .locals 1

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo$Creator;->newArray(I)[Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;
    .locals 0

    new-array p1, p1, [Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;

    return-object p1
.end method
