.class public final Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData$Creator;
.super Ljava/lang/Object;
.source "BiometricsViewModel.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><clinit>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;",
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

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData$Creator;->createFromParcel(Landroid/os/Parcel;)Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    move-result-object p1

    return-object p1
.end method

.method public final createFromParcel(Landroid/os/Parcel;)Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;
    .locals 7

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData$Creator;->newArray(I)[Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;
    .locals 0

    new-array p1, p1, [Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    return-object p1
.end method
