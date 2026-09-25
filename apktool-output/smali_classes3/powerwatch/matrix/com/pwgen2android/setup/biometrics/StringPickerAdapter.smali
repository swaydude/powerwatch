.class public final Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;
.super Ljava/lang/Object;
.source "BiometricsViewModel.kt"

# interfaces
.implements Lcom/super_rabbit/wheel_picker/WheelAdapter;
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBiometricsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BiometricsViewModel.kt\npowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,204:1\n11328#2:205\n11663#2,3:206\n1849#3,2:209\n*S KotlinDebug\n*F\n+ 1 BiometricsViewModel.kt\npowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter\n*L\n178#1:205\n178#1:206,3\n183#1:209,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u000c\u001a\u00020\rH\u00d6\u0001J\u0008\u0010\u000e\u001a\u00020\rH\u0016J\u0008\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0008\u0010\u0012\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u001a"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;",
        "Lcom/super_rabbit/wheel_picker/WheelAdapter;",
        "Landroid/os/Parcelable;",
        "pickedData",
        "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;",
        "unit",
        "",
        "(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;)V",
        "getPickedData",
        "()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;",
        "getUnit",
        "()Ljava/lang/String;",
        "describeContents",
        "",
        "getMaxIndex",
        "getMinIndex",
        "getPosition",
        "vale",
        "getTextWithMaximumLength",
        "getValue",
        "position",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final pickedData:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

.field private final unit:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter$Creator;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;)V
    .locals 1

    const-string v0, "pickedData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unit"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 158
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->pickedData:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->unit:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, ""

    .line 158
    :cond_0
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getMaxIndex()I
    .locals 1

    .line 191
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->pickedData:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;->getDisplayedValuesLocalized()[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public getMinIndex()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getPickedData()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;
    .locals 1

    .line 158
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->pickedData:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    return-object v0
.end method

.method public getPosition(Ljava/lang/String;)I
    .locals 7

    const-string v0, "vale"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->unit:Ljava/lang/String;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->unit:Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v3, ""

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 171
    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->pickedData:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;->getDisplayedValuesLocalized()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/collections/ArraysKt;->indexOf([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public getTextWithMaximumLength()Ljava/lang/String;
    .locals 7

    .line 176
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->pickedData:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;->getDisplayedValuesLocalized()[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v2, ""

    if-eqz v0, :cond_1

    return-object v2

    .line 177
    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->pickedData:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;->getDisplayedValuesLocalized()[Ljava/lang/String;

    move-result-object v0

    .line 205
    new-instance v3, Ljava/util/ArrayList;

    array-length v4, v0

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 206
    array-length v4, v0

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_2

    aget-object v6, v0, v5

    .line 179
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 208
    :cond_2
    check-cast v3, Ljava/util/List;

    .line 205
    check-cast v3, Ljava/lang/Iterable;

    .line 181
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->maxOrNull(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 183
    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 209
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    move-object v1, v0

    check-cast v1, Lkotlin/collections/IntIterator;

    invoke-virtual {v1}, Lkotlin/collections/IntIterator;->nextInt()I

    const-string v1, "a"

    .line 184
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_3
    return-object v2
.end method

.method public final getUnit()Ljava/lang/String;
    .locals 1

    .line 158
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->unit:Ljava/lang/String;

    return-object v0
.end method

.method public getValue(I)Ljava/lang/String;
    .locals 1

    if-ltz p1, :cond_0

    .line 161
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->pickedData:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;->getDisplayedValuesLocalized()[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    if-ge p1, v0, :cond_0

    .line 162
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->pickedData:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;->getDisplayedValuesLocalized()[Ljava/lang/String;

    move-result-object v0

    aget-object p1, v0, p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->unit:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->pickedData:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    invoke-virtual {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->unit:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
