.class public Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/mapapi/search/core/PoiInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ParentPoiInfo"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public parentPoiAddress:Ljava/lang/String;

.field public parentPoiDirection:Ljava/lang/String;

.field public parentPoiDistance:I

.field public parentPoiLocation:Lcom/baidu/mapapi/model/LatLng;

.field public parentPoiName:Ljava/lang/String;

.field public parentPoiTag:Ljava/lang/String;

.field public parentPoiUid:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/baidu/mapapi/search/core/h;

    invoke-direct {v0}, Lcom/baidu/mapapi/search/core/h;-><init>()V

    sput-object v0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiName:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiTag:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiAddress:Ljava/lang/String;

    const-class v0, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/model/LatLng;

    iput-object v0, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiLocation:Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiDirection:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiDistance:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiUid:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getParentPoiAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiAddress:Ljava/lang/String;

    return-object v0
.end method

.method public getParentPoiDirection()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiDirection:Ljava/lang/String;

    return-object v0
.end method

.method public getParentPoiDistance()I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiDistance:I

    return v0
.end method

.method public getParentPoiLocation()Lcom/baidu/mapapi/model/LatLng;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiLocation:Lcom/baidu/mapapi/model/LatLng;

    return-object v0
.end method

.method public getParentPoiName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiName:Ljava/lang/String;

    return-object v0
.end method

.method public getParentPoiTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiTag:Ljava/lang/String;

    return-object v0
.end method

.method public getParentPoiUid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiUid:Ljava/lang/String;

    return-object v0
.end method

.method public setParentPoiAddress(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiAddress:Ljava/lang/String;

    return-void
.end method

.method public setParentPoiDirection(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiDirection:Ljava/lang/String;

    return-void
.end method

.method public setParentPoiDistance(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiDistance:I

    return-void
.end method

.method public setParentPoiLocation(Lcom/baidu/mapapi/model/LatLng;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiLocation:Lcom/baidu/mapapi/model/LatLng;

    return-void
.end method

.method public setParentPoiName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiName:Ljava/lang/String;

    return-void
.end method

.method public setParentPoiTag(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiTag:Ljava/lang/String;

    return-void
.end method

.method public setParentPoiUid(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiUid:Ljava/lang/String;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiTag:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiAddress:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiLocation:Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiDirection:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiDistance:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/baidu/mapapi/search/core/PoiInfo$ParentPoiInfo;->parentPoiUid:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
