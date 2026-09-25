.class public final Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig$Creator;
.super Ljava/lang/Object;
.source "BiometricsScreenFragment.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;-><clinit>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;",
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

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig$Creator;->createFromParcel(Landroid/os/Parcel;)Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    move-result-object p1

    return-object p1
.end method

.method public final createFromParcel(Landroid/os/Parcel;)Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;
    .locals 8

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    const-class v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    move-object v4, v1

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;III)V

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig$Creator;->newArray(I)[Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;
    .locals 0

    new-array p1, p1, [Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    return-object p1
.end method
