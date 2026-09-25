.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
.super Ljava/lang/Object;
.source "Entities.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEntities.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Entities.kt\npowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n1741#2,3:78\n1741#2,3:81\n*S KotlinDebug\n*F\n+ 1 Entities.kt\npowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo\n*L\n46#1:78,3\n54#1:81,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008#\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0014\u0008\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0002\u0010\u0012J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0008H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u000bH\u00c6\u0003J\u000f\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003J\u0015\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0003Jr\u00109\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0014\u0008\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010:J\t\u0010;\u001a\u00020\u0008H\u00d6\u0001J\u0013\u0010<\u001a\u00020\u001a2\u0008\u0010=\u001a\u0004\u0018\u00010>H\u00d6\u0003J\t\u0010?\u001a\u00020\u0008H\u00d6\u0001J\u000e\u0010@\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020BJ\t\u0010C\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u0008H\u00d6\u0001R\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u001a8F\u00a2\u0006\u000c\u0012\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u0019\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001a8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001a8F\u00a2\u0006\u000c\u0012\u0004\u0008 \u0010\u001c\u001a\u0004\u0008\u001f\u0010\u001dR\u0017\u0010!\u001a\u00020\u001a8F\u00a2\u0006\u000c\u0012\u0004\u0008\"\u0010\u001c\u001a\u0004\u0008!\u0010\u001dR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010%\u001a\u0004\u0008#\u0010$R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u001a\u0010\u0007\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008,\u0010-\"\u0004\u0008.\u0010/R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010\u0016\u00a8\u0006I"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "Landroid/os/Parcelable;",
        "uid",
        "",
        "pairingCode",
        "",
        "protocolVersion",
        "time",
        "",
        "deviceName",
        "extendedDeviceInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;",
        "connectionInfos",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;",
        "sectionInfoMap",
        "",
        "",
        "(Ljava/lang/String;Ljava/lang/Short;SILjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;Ljava/util/List;Ljava/util/Map;)V",
        "getConnectionInfos",
        "()Ljava/util/List;",
        "getDeviceName",
        "()Ljava/lang/String;",
        "getExtendedDeviceInfo",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;",
        "isConnected",
        "",
        "isConnected$annotations",
        "()V",
        "()Z",
        "isDefault",
        "isGen2",
        "isGen2$annotations",
        "isGen2NewVersion",
        "isGen2NewVersion$annotations",
        "getPairingCode",
        "()Ljava/lang/Short;",
        "Ljava/lang/Short;",
        "getProtocolVersion",
        "()S",
        "setProtocolVersion",
        "(S)V",
        "getSectionInfoMap",
        "()Ljava/util/Map;",
        "getTime",
        "()I",
        "setTime",
        "(I)V",
        "getUid",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "(Ljava/lang/String;Ljava/lang/Short;SILjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;Ljava/util/List;Ljava/util/Map;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "isProtocolSupported",
        "protocolType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
        "toString",
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
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final connectionInfos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final deviceName:Ljava/lang/String;

.field private final extendedDeviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;

.field private final pairingCode:Ljava/lang/Short;

.field private protocolVersion:S

.field private final sectionInfoMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private time:I

.field private final uid:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo$Creator;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Short;SILjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;Ljava/util/List;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Short;",
            "SI",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    const-string v0, "uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceName"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extendedDeviceInfo"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionInfos"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sectionInfoMap"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->uid:Ljava/lang/String;

    .line 29
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->pairingCode:Ljava/lang/Short;

    .line 30
    iput-short p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->protocolVersion:S

    .line 31
    iput p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->time:I

    .line 32
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->deviceName:Ljava/lang/String;

    .line 33
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->extendedDeviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;

    .line 34
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->connectionInfos:Ljava/util/List;

    .line 35
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->sectionInfoMap:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Short;SILjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;Ljava/util/List;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object v4, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    move v5, p3

    :goto_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const/4 v6, -0x1

    goto :goto_2

    :cond_2
    move v6, p4

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    .line 33
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;

    const-string v2, ""

    invoke-direct {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;-><init>(Ljava/lang/String;)V

    move-object v8, v1

    goto :goto_3

    :cond_3
    move-object/from16 v8, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    .line 34
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    move-object v9, v1

    goto :goto_4

    :cond_4
    move-object/from16 v9, p7

    :goto_4
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_5

    .line 35
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/util/Map;

    move-object v10, v0

    goto :goto_5

    :cond_5
    move-object/from16 v10, p8

    :goto_5
    move-object v2, p0

    move-object v3, p1

    move-object/from16 v7, p5

    .line 28
    invoke-direct/range {v2 .. v10}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;-><init>(Ljava/lang/String;Ljava/lang/Short;SILjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;Ljava/util/List;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/lang/String;Ljava/lang/Short;SILjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;Ljava/util/List;Ljava/util/Map;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
    .locals 9

    move-object v0, p0

    move/from16 v1, p9

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->uid:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->pairingCode:Ljava/lang/Short;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-short v4, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->protocolVersion:S

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->time:I

    goto :goto_3

    :cond_3
    move v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->deviceName:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->extendedDeviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;

    goto :goto_5

    :cond_5
    move-object v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->connectionInfos:Ljava/util/List;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->sectionInfoMap:Ljava/util/Map;

    goto :goto_7

    :cond_7
    move-object/from16 v1, p8

    :goto_7
    move-object p1, v2

    move-object p2, v3

    move p3, v4

    move p4, v5

    move-object p5, v6

    move-object p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v1

    invoke-virtual/range {p0 .. p8}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->copy(Ljava/lang/String;Ljava/lang/Short;SILjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;Ljava/util/List;Ljava/util/Map;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic isConnected$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic isGen2$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic isGen2NewVersion$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->uid:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/Short;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->pairingCode:Ljava/lang/Short;

    return-object v0
.end method

.method public final component3()S
    .locals 1

    iget-short v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->protocolVersion:S

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->time:I

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->deviceName:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->extendedDeviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->connectionInfos:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->sectionInfoMap:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/Short;SILjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;Ljava/util/List;Ljava/util/Map;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Short;",
            "SI",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;)",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;"
        }
    .end annotation

    const-string v0, "uid"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceName"

    move-object v6, p5

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extendedDeviceInfo"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionInfos"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sectionInfoMap"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-object v1, v0

    move-object v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;-><init>(Ljava/lang/String;Ljava/lang/Short;SILjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;Ljava/util/List;Ljava/util/Map;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->uid:Ljava/lang/String;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->uid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->pairingCode:Ljava/lang/Short;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->pairingCode:Ljava/lang/Short;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-short v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->protocolVersion:S

    iget-short v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->protocolVersion:S

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->time:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->time:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->deviceName:Ljava/lang/String;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->deviceName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->extendedDeviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->extendedDeviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->connectionInfos:Ljava/util/List;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->connectionInfos:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->sectionInfoMap:Ljava/util/Map;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->sectionInfoMap:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getConnectionInfos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;",
            ">;"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->connectionInfos:Ljava/util/List;

    return-object v0
.end method

.method public final getDeviceName()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->deviceName:Ljava/lang/String;

    return-object v0
.end method

.method public final getExtendedDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;
    .locals 1

    .line 33
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->extendedDeviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;

    return-object v0
.end method

.method public final getPairingCode()Ljava/lang/Short;
    .locals 1

    .line 29
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->pairingCode:Ljava/lang/Short;

    return-object v0
.end method

.method public final getProtocolVersion()S
    .locals 1

    .line 30
    iget-short v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->protocolVersion:S

    return v0
.end method

.method public final getSectionInfoMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->sectionInfoMap:Ljava/util/Map;

    return-object v0
.end method

.method public final getTime()I
    .locals 1

    .line 31
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->time:I

    return v0
.end method

.method public final getUid()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->uid:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->uid:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->pairingCode:Ljava/lang/Short;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-short v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->protocolVersion:S

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->time:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->deviceName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->extendedDeviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->connectionInfos:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->sectionInfoMap:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isConnected()Z
    .locals 1

    .line 39
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->connectionInfos:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final isDefault()Z
    .locals 2

    .line 42
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->uid:Ljava/lang/String;

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->deviceName:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isGen2()Z
    .locals 5

    .line 46
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->connectionInfos:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 78
    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    .line 79
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    .line 47
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object v1

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_STANDARD_BASICS:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    if-ne v1, v4, :cond_3

    const/4 v1, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    :goto_1
    return v2
.end method

.method public final isGen2NewVersion()Z
    .locals 2

    .line 51
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isGen2()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-short v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->protocolVersion:S

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isProtocolSupported(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Z
    .locals 4

    const-string v0, "protocolType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->connectionInfos:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 81
    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    .line 82
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    .line 54
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object v1

    if-ne v1, p1, :cond_3

    const/4 v1, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    :goto_1
    return v2
.end method

.method public final setProtocolVersion(S)V
    .locals 0

    .line 30
    iput-short p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->protocolVersion:S

    return-void
.end method

.method public final setTime(I)V
    .locals 0

    .line 31
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->time:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DeviceInfo(uid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->uid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pairingCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->pairingCode:Ljava/lang/Short;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", protocolVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->protocolVersion:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->time:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", deviceName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->deviceName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", extendedDeviceInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->extendedDeviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", connectionInfos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->connectionInfos:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sectionInfoMap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->sectionInfoMap:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->uid:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->pairingCode:Ljava/lang/Short;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    move-result v0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-short v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->protocolVersion:S

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->time:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->deviceName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->extendedDeviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;

    invoke-virtual {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->connectionInfos:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    invoke-virtual {v1, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->sectionInfoMap:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    goto :goto_2

    :cond_2
    return-void
.end method
