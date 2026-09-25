.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;
.super Ljava/lang/Object;
.source "SettingsDataParser.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008X\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00d7\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0018J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\t\u0010I\u001a\u00020\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\t\u0010O\u001a\u00020\u0003H\u00c6\u0003J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\u0003H\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J\t\u0010U\u001a\u00020\u0003H\u00c6\u0003J\t\u0010V\u001a\u00020\u0003H\u00c6\u0003J\t\u0010W\u001a\u00020\u0003H\u00c6\u0003J\t\u0010X\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\u00db\u0001\u0010Z\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010[\u001a\u00020\\2\u0008\u0010]\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010^\u001a\u00020\u0003H\u00d6\u0001J\t\u0010_\u001a\u00020`H\u00d6\u0001R\u001a\u0010\u0008\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u001a\"\u0004\u0008\u001e\u0010\u001cR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001f\u0010\u001a\"\u0004\u0008 \u0010\u001cR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008!\u0010\u001a\"\u0004\u0008\"\u0010\u001cR\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008#\u0010\u001a\"\u0004\u0008$\u0010\u001cR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008%\u0010\u001a\"\u0004\u0008&\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\'\u0010\u001a\"\u0004\u0008(\u0010\u001cR\u001a\u0010\u000c\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010\u001a\"\u0004\u0008*\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008+\u0010\u001a\"\u0004\u0008,\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008-\u0010\u001a\"\u0004\u0008.\u0010\u001cR\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008/\u0010\u001a\"\u0004\u00080\u0010\u001cR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00081\u0010\u001a\"\u0004\u00082\u0010\u001cR\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00083\u0010\u001a\"\u0004\u00084\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00085\u0010\u001a\"\u0004\u00086\u0010\u001cR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00087\u0010\u001a\"\u0004\u00088\u0010\u001cR\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00089\u0010\u001a\"\u0004\u0008:\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008;\u0010\u001a\"\u0004\u0008<\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008=\u0010\u001a\"\u0004\u0008>\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008?\u0010\u001a\"\u0004\u0008@\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008A\u0010\u001a\"\u0004\u0008B\u0010\u001cR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008C\u0010\u001a\"\u0004\u0008D\u0010\u001c\u00a8\u0006a"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;",
        "",
        "clockFormatSelection",
        "",
        "unitSelection",
        "languageSelection",
        "timeZone",
        "gender",
        "age",
        "weight",
        "height",
        "stepGoal",
        "distanceGoal",
        "caloriesGoal",
        "sleepGoal",
        "dnd",
        "backLight",
        "backLightDuration",
        "popupDuration",
        "gpsUpdateRate",
        "homeScreen",
        "bleDisconnect",
        "ringtone",
        "alert",
        "(IIIIIIIIIIIIIIIIIIIII)V",
        "getAge",
        "()I",
        "setAge",
        "(I)V",
        "getAlert",
        "setAlert",
        "getBackLight",
        "setBackLight",
        "getBackLightDuration",
        "setBackLightDuration",
        "getBleDisconnect",
        "setBleDisconnect",
        "getCaloriesGoal",
        "setCaloriesGoal",
        "getClockFormatSelection",
        "setClockFormatSelection",
        "getDistanceGoal",
        "setDistanceGoal",
        "getDnd",
        "setDnd",
        "getGender",
        "setGender",
        "getGpsUpdateRate",
        "setGpsUpdateRate",
        "getHeight",
        "setHeight",
        "getHomeScreen",
        "setHomeScreen",
        "getLanguageSelection",
        "setLanguageSelection",
        "getPopupDuration",
        "setPopupDuration",
        "getRingtone",
        "setRingtone",
        "getSleepGoal",
        "setSleepGoal",
        "getStepGoal",
        "setStepGoal",
        "getTimeZone",
        "setTimeZone",
        "getUnitSelection",
        "setUnitSelection",
        "getWeight",
        "setWeight",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component2",
        "component20",
        "component21",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
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
.field private age:I

.field private alert:I

.field private backLight:I

.field private backLightDuration:I

.field private bleDisconnect:I

.field private caloriesGoal:I

.field private clockFormatSelection:I

.field private distanceGoal:I

.field private dnd:I

.field private gender:I

.field private gpsUpdateRate:I

.field private height:I

.field private homeScreen:I

.field private languageSelection:I

.field private popupDuration:I

.field private ringtone:I

.field private sleepGoal:I

.field private stepGoal:I

.field private timeZone:I

.field private unitSelection:I

.field private weight:I


# direct methods
.method public constructor <init>()V
    .locals 24

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v22, 0x1fffff

    const/16 v23, 0x0

    invoke-direct/range {v0 .. v23}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;-><init>(IIIIIIIIIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIIIIIIIIIIIIIII)V
    .locals 2

    move-object v0, p0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v1, p1

    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->clockFormatSelection:I

    move v1, p2

    .line 48
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->unitSelection:I

    move v1, p3

    .line 49
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->languageSelection:I

    move v1, p4

    .line 50
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->timeZone:I

    move v1, p5

    .line 51
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->gender:I

    move v1, p6

    .line 52
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->age:I

    move v1, p7

    .line 53
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->weight:I

    move v1, p8

    .line 54
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->height:I

    move v1, p9

    .line 55
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->stepGoal:I

    move v1, p10

    .line 56
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->distanceGoal:I

    move v1, p11

    .line 57
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->caloriesGoal:I

    move v1, p12

    .line 58
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->sleepGoal:I

    move v1, p13

    .line 59
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->dnd:I

    move/from16 v1, p14

    .line 60
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->backLight:I

    move/from16 v1, p15

    .line 61
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->backLightDuration:I

    move/from16 v1, p16

    .line 62
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->popupDuration:I

    move/from16 v1, p17

    .line 63
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->gpsUpdateRate:I

    move/from16 v1, p18

    .line 64
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->homeScreen:I

    move/from16 v1, p19

    .line 65
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->bleDisconnect:I

    move/from16 v1, p20

    .line 66
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->ringtone:I

    move/from16 v1, p21

    .line 67
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->alert:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 22

    move/from16 v0, p22

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    const/4 v5, 0x0

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    const/4 v6, 0x0

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    const/4 v7, 0x0

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    const/4 v8, 0x0

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    const/4 v9, 0x0

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    const/4 v10, 0x0

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    const/4 v11, 0x0

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    const/4 v12, 0x0

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    const/4 v13, 0x0

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    const/4 v14, 0x0

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v0, 0x2000

    if-eqz v15, :cond_d

    const/4 v15, 0x0

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    and-int/lit16 v2, v0, 0x4000

    if-eqz v2, :cond_e

    const/4 v2, 0x0

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    const/16 v16, 0x0

    goto :goto_f

    :cond_f
    move/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    const/16 v17, 0x0

    goto :goto_10

    :cond_10
    move/from16 v17, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    const/16 v18, 0x0

    goto :goto_11

    :cond_11
    move/from16 v18, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v19, v0, v19

    if-eqz v19, :cond_12

    const/16 v19, 0x0

    goto :goto_12

    :cond_12
    move/from16 v19, p19

    :goto_12
    const/high16 v20, 0x80000

    and-int v20, v0, v20

    if-eqz v20, :cond_13

    const/16 v20, 0x0

    goto :goto_13

    :cond_13
    move/from16 v20, p20

    :goto_13
    const/high16 v21, 0x100000

    and-int v0, v0, v21

    if-eqz v0, :cond_14

    const/4 v0, 0x0

    goto :goto_14

    :cond_14
    move/from16 v0, p21

    :goto_14
    move-object/from16 p1, p0

    move/from16 p2, v1

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move/from16 p16, v2

    move/from16 p17, v16

    move/from16 p18, v17

    move/from16 p19, v18

    move/from16 p20, v19

    move/from16 p21, v20

    move/from16 p22, v0

    .line 47
    invoke-direct/range {p1 .. p22}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;-><init>(IIIIIIIIIIIIIIIIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;IIIIIIIIIIIIIIIIIIIIIILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p22

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->clockFormatSelection:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->unitSelection:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->languageSelection:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->timeZone:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->gender:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->age:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->weight:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->height:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget v10, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->stepGoal:I

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget v11, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->distanceGoal:I

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->caloriesGoal:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget v13, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->sleepGoal:I

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget v14, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->dnd:I

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget v15, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->backLight:I

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget v15, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->backLightDuration:I

    goto :goto_e

    :cond_e
    move/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move/from16 p15, v15

    if-eqz v16, :cond_f

    iget v15, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->popupDuration:I

    goto :goto_f

    :cond_f
    move/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move/from16 p16, v15

    if-eqz v16, :cond_10

    iget v15, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->gpsUpdateRate:I

    goto :goto_10

    :cond_10
    move/from16 v15, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, v1, v16

    move/from16 p17, v15

    if-eqz v16, :cond_11

    iget v15, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->homeScreen:I

    goto :goto_11

    :cond_11
    move/from16 v15, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, v1, v16

    move/from16 p18, v15

    if-eqz v16, :cond_12

    iget v15, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->bleDisconnect:I

    goto :goto_12

    :cond_12
    move/from16 v15, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, v1, v16

    move/from16 p19, v15

    if-eqz v16, :cond_13

    iget v15, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->ringtone:I

    goto :goto_13

    :cond_13
    move/from16 v15, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v1, v1, v16

    if-eqz v1, :cond_14

    iget v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->alert:I

    goto :goto_14

    :cond_14
    move/from16 v1, p21

    :goto_14
    move/from16 p1, v2

    move/from16 p2, v3

    move/from16 p3, v4

    move/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v14

    move/from16 p20, v15

    move/from16 p21, v1

    invoke-virtual/range {p0 .. p21}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->copy(IIIIIIIIIIIIIIIIIIIII)Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->clockFormatSelection:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->distanceGoal:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->caloriesGoal:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->sleepGoal:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->dnd:I

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->backLight:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->backLightDuration:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->popupDuration:I

    return v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->gpsUpdateRate:I

    return v0
.end method

.method public final component18()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->homeScreen:I

    return v0
.end method

.method public final component19()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->bleDisconnect:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->unitSelection:I

    return v0
.end method

.method public final component20()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->ringtone:I

    return v0
.end method

.method public final component21()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->alert:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->languageSelection:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->timeZone:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->gender:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->age:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->weight:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->height:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->stepGoal:I

    return v0
.end method

.method public final copy(IIIIIIIIIIIIIIIIIIIII)Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;
    .locals 23

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    move/from16 v20, p20

    move/from16 v21, p21

    new-instance v22, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    move-object/from16 v0, v22

    invoke-direct/range {v0 .. v21}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;-><init>(IIIIIIIIIIIIIIIIIIIII)V

    return-object v22
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->clockFormatSelection:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->clockFormatSelection:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->unitSelection:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->unitSelection:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->languageSelection:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->languageSelection:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->timeZone:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->timeZone:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->gender:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->gender:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->age:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->age:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->weight:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->weight:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->height:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->height:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->stepGoal:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->stepGoal:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->distanceGoal:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->distanceGoal:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->caloriesGoal:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->caloriesGoal:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->sleepGoal:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->sleepGoal:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->dnd:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->dnd:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->backLight:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->backLight:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->backLightDuration:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->backLightDuration:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->popupDuration:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->popupDuration:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->gpsUpdateRate:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->gpsUpdateRate:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->homeScreen:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->homeScreen:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->bleDisconnect:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->bleDisconnect:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->ringtone:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->ringtone:I

    if-eq v1, v3, :cond_15

    return v2

    :cond_15
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->alert:I

    iget p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->alert:I

    if-eq v1, p1, :cond_16

    return v2

    :cond_16
    return v0
.end method

.method public final getAge()I
    .locals 1

    .line 52
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->age:I

    return v0
.end method

.method public final getAlert()I
    .locals 1

    .line 67
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->alert:I

    return v0
.end method

.method public final getBackLight()I
    .locals 1

    .line 60
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->backLight:I

    return v0
.end method

.method public final getBackLightDuration()I
    .locals 1

    .line 61
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->backLightDuration:I

    return v0
.end method

.method public final getBleDisconnect()I
    .locals 1

    .line 65
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->bleDisconnect:I

    return v0
.end method

.method public final getCaloriesGoal()I
    .locals 1

    .line 57
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->caloriesGoal:I

    return v0
.end method

.method public final getClockFormatSelection()I
    .locals 1

    .line 47
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->clockFormatSelection:I

    return v0
.end method

.method public final getDistanceGoal()I
    .locals 1

    .line 56
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->distanceGoal:I

    return v0
.end method

.method public final getDnd()I
    .locals 1

    .line 59
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->dnd:I

    return v0
.end method

.method public final getGender()I
    .locals 1

    .line 51
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->gender:I

    return v0
.end method

.method public final getGpsUpdateRate()I
    .locals 1

    .line 63
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->gpsUpdateRate:I

    return v0
.end method

.method public final getHeight()I
    .locals 1

    .line 54
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->height:I

    return v0
.end method

.method public final getHomeScreen()I
    .locals 1

    .line 64
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->homeScreen:I

    return v0
.end method

.method public final getLanguageSelection()I
    .locals 1

    .line 49
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->languageSelection:I

    return v0
.end method

.method public final getPopupDuration()I
    .locals 1

    .line 62
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->popupDuration:I

    return v0
.end method

.method public final getRingtone()I
    .locals 1

    .line 66
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->ringtone:I

    return v0
.end method

.method public final getSleepGoal()I
    .locals 1

    .line 58
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->sleepGoal:I

    return v0
.end method

.method public final getStepGoal()I
    .locals 1

    .line 55
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->stepGoal:I

    return v0
.end method

.method public final getTimeZone()I
    .locals 1

    .line 50
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->timeZone:I

    return v0
.end method

.method public final getUnitSelection()I
    .locals 1

    .line 48
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->unitSelection:I

    return v0
.end method

.method public final getWeight()I
    .locals 1

    .line 53
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->weight:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->clockFormatSelection:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->unitSelection:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->languageSelection:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->timeZone:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->gender:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->age:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->weight:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->height:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->stepGoal:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->distanceGoal:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->caloriesGoal:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->sleepGoal:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->dnd:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->backLight:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->backLightDuration:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->popupDuration:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->gpsUpdateRate:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->homeScreen:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->bleDisconnect:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->ringtone:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->alert:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final setAge(I)V
    .locals 0

    .line 52
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->age:I

    return-void
.end method

.method public final setAlert(I)V
    .locals 0

    .line 67
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->alert:I

    return-void
.end method

.method public final setBackLight(I)V
    .locals 0

    .line 60
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->backLight:I

    return-void
.end method

.method public final setBackLightDuration(I)V
    .locals 0

    .line 61
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->backLightDuration:I

    return-void
.end method

.method public final setBleDisconnect(I)V
    .locals 0

    .line 65
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->bleDisconnect:I

    return-void
.end method

.method public final setCaloriesGoal(I)V
    .locals 0

    .line 57
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->caloriesGoal:I

    return-void
.end method

.method public final setClockFormatSelection(I)V
    .locals 0

    .line 47
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->clockFormatSelection:I

    return-void
.end method

.method public final setDistanceGoal(I)V
    .locals 0

    .line 56
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->distanceGoal:I

    return-void
.end method

.method public final setDnd(I)V
    .locals 0

    .line 59
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->dnd:I

    return-void
.end method

.method public final setGender(I)V
    .locals 0

    .line 51
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->gender:I

    return-void
.end method

.method public final setGpsUpdateRate(I)V
    .locals 0

    .line 63
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->gpsUpdateRate:I

    return-void
.end method

.method public final setHeight(I)V
    .locals 0

    .line 54
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->height:I

    return-void
.end method

.method public final setHomeScreen(I)V
    .locals 0

    .line 64
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->homeScreen:I

    return-void
.end method

.method public final setLanguageSelection(I)V
    .locals 0

    .line 49
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->languageSelection:I

    return-void
.end method

.method public final setPopupDuration(I)V
    .locals 0

    .line 62
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->popupDuration:I

    return-void
.end method

.method public final setRingtone(I)V
    .locals 0

    .line 66
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->ringtone:I

    return-void
.end method

.method public final setSleepGoal(I)V
    .locals 0

    .line 58
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->sleepGoal:I

    return-void
.end method

.method public final setStepGoal(I)V
    .locals 0

    .line 55
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->stepGoal:I

    return-void
.end method

.method public final setTimeZone(I)V
    .locals 0

    .line 50
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->timeZone:I

    return-void
.end method

.method public final setUnitSelection(I)V
    .locals 0

    .line 48
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->unitSelection:I

    return-void
.end method

.method public final setWeight(I)V
    .locals 0

    .line 53
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->weight:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SettingsData(clockFormatSelection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->clockFormatSelection:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", unitSelection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->unitSelection:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", languageSelection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->languageSelection:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", timeZone="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->timeZone:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", gender="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->gender:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", age="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->age:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", weight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->weight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->height:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", stepGoal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->stepGoal:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", distanceGoal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->distanceGoal:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", caloriesGoal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->caloriesGoal:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sleepGoal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->sleepGoal:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", dnd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->dnd:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", backLight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->backLight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", backLightDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->backLightDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", popupDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->popupDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", gpsUpdateRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->gpsUpdateRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", homeScreen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->homeScreen:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bleDisconnect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->bleDisconnect:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", ringtone="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->ringtone:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", alert="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->alert:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
