.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;
.super Ljava/lang/Object;
.source "Device.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u00082\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bk\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000c\u00a2\u0006\u0002\u0010\u0011J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u000cH\u00c6\u0003J\t\u0010/\u001a\u00020\u000cH\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0008H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0002\u0010)J\t\u00106\u001a\u00020\u000cH\u00c6\u0003J\t\u00107\u001a\u00020\u000cH\u00c6\u0003J~\u00108\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000cH\u00c6\u0001\u00a2\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020\u000c2\u0008\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010<\u001a\u00020\u0008H\u00d6\u0001J\t\u0010=\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0010\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0013R\u0011\u0010\u0019\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0013R\u0011\u0010\u001b\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u0013R\u0011\u0010\u001d\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010 R\u0011\u0010\u000e\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010 R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\n\n\u0002\u0010*\u001a\u0004\u0008(\u0010)R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,\u00a8\u0006>"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        "",
        "uid",
        "",
        "serialNumber",
        "",
        "bluetoothAddress",
        "pid",
        "",
        "firmwareVersion",
        "productName",
        "shouldSync",
        "",
        "callNotification",
        "messageNotification",
        "activityGoalNotification",
        "alarmNotification",
        "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZ)V",
        "getActivityGoalNotification",
        "()Z",
        "getAlarmNotification",
        "areAlarmsNotificationsEnabled",
        "getAreAlarmsNotificationsEnabled",
        "areCallsNotificationEnabled",
        "getAreCallsNotificationEnabled",
        "areGoalsNotificationEnabled",
        "getAreGoalsNotificationEnabled",
        "areMessagesNotificationEnabled",
        "getAreMessagesNotificationEnabled",
        "areNotificationSupported",
        "getAreNotificationSupported",
        "getBluetoothAddress",
        "()Ljava/lang/String;",
        "getCallNotification",
        "getFirmwareVersion",
        "getMessageNotification",
        "getPid",
        "()I",
        "getProductName",
        "getSerialNumber",
        "getShouldSync",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getUid",
        "()J",
        "component1",
        "component10",
        "component11",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZ)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        "equals",
        "other",
        "hashCode",
        "toString",
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


# instance fields
.field private final activityGoalNotification:Z

.field private final alarmNotification:Z

.field private final bluetoothAddress:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "uuid"
    .end annotation
.end field

.field private final callNotification:Z

.field private final firmwareVersion:Ljava/lang/String;

.field private final messageNotification:Z

.field private final pid:I

.field private final productName:Ljava/lang/String;

.field private final serialNumber:Ljava/lang/String;

.field private final shouldSync:Ljava/lang/Boolean;

.field private final uid:J


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZ)V
    .locals 1

    const-string v0, "serialNumber"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothAddress"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareVersion"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productName"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->uid:J

    .line 12
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->serialNumber:Ljava/lang/String;

    .line 13
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->bluetoothAddress:Ljava/lang/String;

    .line 15
    iput p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->pid:I

    .line 16
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->firmwareVersion:Ljava/lang/String;

    .line 17
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->productName:Ljava/lang/String;

    .line 18
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->shouldSync:Ljava/lang/Boolean;

    .line 19
    iput-boolean p9, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->callNotification:Z

    .line 20
    iput-boolean p10, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->messageNotification:Z

    .line 21
    iput-boolean p11, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->activityGoalNotification:Z

    .line 22
    iput-boolean p12, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->alarmNotification:Z

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const-wide/16 v1, 0x0

    move-wide v4, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    move-object v11, v1

    goto :goto_1

    :cond_1
    move-object/from16 v11, p8

    :goto_1
    and-int/lit16 v1, v0, 0x80

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    const/4 v12, 0x1

    goto :goto_2

    :cond_2
    move/from16 v12, p9

    :goto_2
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_3

    const/4 v13, 0x1

    goto :goto_3

    :cond_3
    move/from16 v13, p10

    :goto_3
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_4

    const/4 v14, 0x1

    goto :goto_4

    :cond_4
    move/from16 v14, p11

    :goto_4
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_5

    const/4 v15, 0x1

    goto :goto_5

    :cond_5
    move/from16 v15, p12

    :goto_5
    move-object/from16 v3, p0

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    .line 8
    invoke-direct/range {v3 .. v15}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;-><init>(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;
    .locals 13

    move-object v0, p0

    move/from16 v1, p13

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-wide v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->uid:J

    goto :goto_0

    :cond_0
    move-wide v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->serialNumber:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v4, p3

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->bluetoothAddress:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget v6, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->pid:I

    goto :goto_3

    :cond_3
    move/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->firmwareVersion:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->productName:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->shouldSync:Ljava/lang/Boolean;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-boolean v10, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->callNotification:Z

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-boolean v11, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->messageNotification:Z

    goto :goto_8

    :cond_8
    move/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-boolean v12, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->activityGoalNotification:Z

    goto :goto_9

    :cond_9
    move/from16 v12, p11

    :goto_9
    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_a

    iget-boolean v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->alarmNotification:Z

    goto :goto_a

    :cond_a
    move/from16 v1, p12

    :goto_a
    move-wide p1, v2

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v1

    invoke-virtual/range {p0 .. p12}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->copy(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZ)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->uid:J

    return-wide v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->activityGoalNotification:Z

    return v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->alarmNotification:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->serialNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->bluetoothAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->pid:I

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->firmwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->productName:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->shouldSync:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->callNotification:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->messageNotification:Z

    return v0
.end method

.method public final copy(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZ)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;
    .locals 14

    const-string v0, "serialNumber"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothAddress"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareVersion"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productName"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    move-object v1, v0

    move-wide v2, p1

    move/from16 v6, p5

    move-object/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;-><init>(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->uid:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->uid:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->serialNumber:Ljava/lang/String;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->serialNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->bluetoothAddress:Ljava/lang/String;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->bluetoothAddress:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->pid:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->pid:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->firmwareVersion:Ljava/lang/String;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->firmwareVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->productName:Ljava/lang/String;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->productName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->shouldSync:Ljava/lang/Boolean;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->shouldSync:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->callNotification:Z

    iget-boolean v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->callNotification:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->messageNotification:Z

    iget-boolean v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->messageNotification:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->activityGoalNotification:Z

    iget-boolean v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->activityGoalNotification:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->alarmNotification:Z

    iget-boolean p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->alarmNotification:Z

    if-eq v1, p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getActivityGoalNotification()Z
    .locals 1

    .line 21
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->activityGoalNotification:Z

    return v0
.end method

.method public final getAlarmNotification()Z
    .locals 1

    .line 22
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->alarmNotification:Z

    return v0
.end method

.method public final getAreAlarmsNotificationsEnabled()Z
    .locals 1

    .line 28
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->alarmNotification:Z

    return v0
.end method

.method public final getAreCallsNotificationEnabled()Z
    .locals 1

    .line 25
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->callNotification:Z

    return v0
.end method

.method public final getAreGoalsNotificationEnabled()Z
    .locals 1

    .line 27
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->activityGoalNotification:Z

    return v0
.end method

.method public final getAreMessagesNotificationEnabled()Z
    .locals 1

    .line 26
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->messageNotification:Z

    return v0
.end method

.method public final getAreNotificationSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final getBluetoothAddress()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->bluetoothAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallNotification()Z
    .locals 1

    .line 19
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->callNotification:Z

    return v0
.end method

.method public final getFirmwareVersion()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->firmwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getMessageNotification()Z
    .locals 1

    .line 20
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->messageNotification:Z

    return v0
.end method

.method public final getPid()I
    .locals 1

    .line 15
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->pid:I

    return v0
.end method

.method public final getProductName()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->productName:Ljava/lang/String;

    return-object v0
.end method

.method public final getSerialNumber()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->serialNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getShouldSync()Ljava/lang/Boolean;
    .locals 1

    .line 18
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->shouldSync:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getUid()J
    .locals 2

    .line 11
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->uid:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->uid:J

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->serialNumber:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->bluetoothAddress:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->pid:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->firmwareVersion:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->productName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->shouldSync:Ljava/lang/Boolean;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->callNotification:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->messageNotification:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    :cond_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->activityGoalNotification:Z

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    :cond_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->alarmNotification:Z

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Device(uid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->uid:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", serialNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->serialNumber:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bluetoothAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->bluetoothAddress:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->pid:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", firmwareVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->firmwareVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", productName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->productName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", shouldSync="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->shouldSync:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", callNotification="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->callNotification:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", messageNotification="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->messageNotification:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", activityGoalNotification="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->activityGoalNotification:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", alarmNotification="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->alarmNotification:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
