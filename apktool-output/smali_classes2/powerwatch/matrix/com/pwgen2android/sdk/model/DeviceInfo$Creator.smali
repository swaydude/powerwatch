.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo$Creator;
.super Ljava/lang/Object;
.source "Entities.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;-><clinit>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
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

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo$Creator;->createFromParcel(Landroid/os/Parcel;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object p1

    return-object p1
.end method

.method public final createFromParcel(Landroid/os/Parcel;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
    .locals 13

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    int-to-short v0, v0

    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    :goto_0
    move-object v3, v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    int-to-short v4, v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_1
    if-eq v9, v0, :cond_1

    sget-object v10, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v10, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    :goto_2
    if-eq v8, v1, :cond_2

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v9, v10, v11}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_2
    check-cast v9, Ljava/util/Map;

    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-object v1, p1

    move-object v8, v0

    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;-><init>(Ljava/lang/String;Ljava/lang/Short;SILjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;Ljava/util/List;Ljava/util/Map;)V

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo$Creator;->newArray(I)[Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
    .locals 0

    new-array p1, p1, [Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    return-object p1
.end method
