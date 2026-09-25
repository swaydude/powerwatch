.class public Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;
.super Lcom/baidu/mapapi/search/core/RouteStep;

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/mapapi/search/route/MassTransitRouteLine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TransitStep"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$StepVehicleInfoType;,
        Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$TrafficCondition;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$TrafficCondition;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/baidu/mapapi/model/LatLng;

.field private f:Lcom/baidu/mapapi/model/LatLng;

.field private g:Lcom/baidu/mapapi/search/core/n;

.field private h:Lcom/baidu/mapapi/search/core/PlaneInfo;

.field private i:Lcom/baidu/mapapi/search/core/CoachInfo;

.field private j:Lcom/baidu/mapapi/search/core/BusInfo;

.field private k:Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$StepVehicleInfoType;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/baidu/mapapi/search/route/j;

    invoke-direct {v0}, Lcom/baidu/mapapi/search/route/j;-><init>()V

    sput-object v0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/mapapi/search/core/RouteStep;-><init>()V

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/baidu/mapapi/search/core/RouteStep;-><init>(Landroid/os/Parcel;)V

    sget-object v0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$TrafficCondition;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->d:Ljava/util/List;

    const-class v0, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/model/LatLng;

    iput-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->e:Lcom/baidu/mapapi/model/LatLng;

    const-class v0, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/model/LatLng;

    iput-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->f:Lcom/baidu/mapapi/model/LatLng;

    const-class v0, Lcom/baidu/mapapi/search/core/n;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/search/core/n;

    iput-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->g:Lcom/baidu/mapapi/search/core/n;

    const-class v0, Lcom/baidu/mapapi/search/core/PlaneInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/search/core/PlaneInfo;

    iput-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->h:Lcom/baidu/mapapi/search/core/PlaneInfo;

    const-class v0, Lcom/baidu/mapapi/search/core/CoachInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/search/core/CoachInfo;

    iput-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->i:Lcom/baidu/mapapi/search/core/CoachInfo;

    const-class v0, Lcom/baidu/mapapi/search/core/BusInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/search/core/BusInfo;

    iput-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->j:Lcom/baidu/mapapi/search/core/BusInfo;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    sget-object v0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$StepVehicleInfoType;->ESTEP_COACH:Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$StepVehicleInfoType;

    goto :goto_0

    :pswitch_1
    sget-object v0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$StepVehicleInfoType;->ESTEP_WALK:Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$StepVehicleInfoType;

    goto :goto_0

    :pswitch_2
    sget-object v0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$StepVehicleInfoType;->ESTEP_DRIVING:Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$StepVehicleInfoType;

    goto :goto_0

    :pswitch_3
    sget-object v0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$StepVehicleInfoType;->ESTEP_BUS:Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$StepVehicleInfoType;

    goto :goto_0

    :pswitch_4
    sget-object v0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$StepVehicleInfoType;->ESTEP_PLANE:Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$StepVehicleInfoType;

    goto :goto_0

    :pswitch_5
    sget-object v0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$StepVehicleInfoType;->ESTEP_TRAIN:Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$StepVehicleInfoType;

    :goto_0
    iput-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->k:Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$StepVehicleInfoType;

    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->l:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->m:Ljava/lang/String;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private a(Ljava/lang/String;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/model/LatLng;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, ";"

    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_2

    aget-object v3, p1, v2

    if-eqz v3, :cond_1

    aget-object v3, p1, v2

    const-string v4, ""

    if-eq v3, v4, :cond_1

    aget-object v3, p1, v2

    const-string v5, ","

    invoke-virtual {v3, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    const/4 v5, 0x1

    aget-object v6, v3, v5

    if-eq v6, v4, :cond_1

    aget-object v6, v3, v1

    if-eq v6, v4, :cond_1

    new-instance v4, Lcom/baidu/mapapi/model/LatLng;

    aget-object v5, v3, v5

    invoke-static {v5}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v5

    aget-object v3, v3, v1

    invoke-static {v3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v7

    invoke-direct {v4, v5, v6, v7, v8}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-static {}, Lcom/baidu/mapapi/SDKInitializer;->getCoordType()Lcom/baidu/mapapi/CoordType;

    move-result-object v3

    sget-object v5, Lcom/baidu/mapapi/CoordType;->GCJ02:Lcom/baidu/mapapi/CoordType;

    if-ne v3, v5, :cond_0

    invoke-static {v4}, Lcom/baidu/mapsdkplatform/comapi/util/CoordTrans;->baiduToGcj(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/model/LatLng;

    move-result-object v4

    :cond_0
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getBusInfo()Lcom/baidu/mapapi/search/core/BusInfo;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->j:Lcom/baidu/mapapi/search/core/BusInfo;

    return-object v0
.end method

.method public getCoachInfo()Lcom/baidu/mapapi/search/core/CoachInfo;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->i:Lcom/baidu/mapapi/search/core/CoachInfo;

    return-object v0
.end method

.method public getEndLocation()Lcom/baidu/mapapi/model/LatLng;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->f:Lcom/baidu/mapapi/model/LatLng;

    return-object v0
.end method

.method public getInstructions()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->l:Ljava/lang/String;

    return-object v0
.end method

.method public getPlaneInfo()Lcom/baidu/mapapi/search/core/PlaneInfo;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->h:Lcom/baidu/mapapi/search/core/PlaneInfo;

    return-object v0
.end method

.method public getStartLocation()Lcom/baidu/mapapi/model/LatLng;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->e:Lcom/baidu/mapapi/model/LatLng;

    return-object v0
.end method

.method public getTrafficConditions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$TrafficCondition;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->d:Ljava/util/List;

    return-object v0
.end method

.method public getTrainInfo()Lcom/baidu/mapapi/search/core/n;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->g:Lcom/baidu/mapapi/search/core/n;

    return-object v0
.end method

.method public getVehileType()Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$StepVehicleInfoType;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->k:Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$StepVehicleInfoType;

    return-object v0
.end method

.method public getWayPoints()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/model/LatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->mWayPoints:Ljava/util/List;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->m:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->mWayPoints:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->mWayPoints:Ljava/util/List;

    return-object v0
.end method

.method public setBusInfo(Lcom/baidu/mapapi/search/core/BusInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->j:Lcom/baidu/mapapi/search/core/BusInfo;

    return-void
.end method

.method public setCoachInfo(Lcom/baidu/mapapi/search/core/CoachInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->i:Lcom/baidu/mapapi/search/core/CoachInfo;

    return-void
.end method

.method public setEndLocation(Lcom/baidu/mapapi/model/LatLng;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->f:Lcom/baidu/mapapi/model/LatLng;

    return-void
.end method

.method public setInstructions(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->l:Ljava/lang/String;

    return-void
.end method

.method public setPathString(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->m:Ljava/lang/String;

    return-void
.end method

.method public setPlaneInfo(Lcom/baidu/mapapi/search/core/PlaneInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->h:Lcom/baidu/mapapi/search/core/PlaneInfo;

    return-void
.end method

.method public setStartLocation(Lcom/baidu/mapapi/model/LatLng;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->e:Lcom/baidu/mapapi/model/LatLng;

    return-void
.end method

.method public setTrafficConditions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$TrafficCondition;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->d:Ljava/util/List;

    return-void
.end method

.method public setTrainInfo(Lcom/baidu/mapapi/search/core/n;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->g:Lcom/baidu/mapapi/search/core/n;

    return-void
.end method

.method public setVehileType(Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$StepVehicleInfoType;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->k:Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$StepVehicleInfoType;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/baidu/mapapi/search/core/RouteStep;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->d:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    iget-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->e:Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->f:Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->g:Lcom/baidu/mapapi/search/core/n;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->h:Lcom/baidu/mapapi/search/core/PlaneInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->i:Lcom/baidu/mapapi/search/core/CoachInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->j:Lcom/baidu/mapapi/search/core/BusInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->k:Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$StepVehicleInfoType;

    invoke-virtual {p2}, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep$StepVehicleInfoType;->getInt()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->l:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/baidu/mapapi/search/route/MassTransitRouteLine$TransitStep;->m:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
