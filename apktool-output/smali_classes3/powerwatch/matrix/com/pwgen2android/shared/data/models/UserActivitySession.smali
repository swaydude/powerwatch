.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;
.super Ljava/lang/Object;
.source "ActivityPeriodsModels.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SaveSync;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/UserSpecificData;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008F\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u0002B\u00c1\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000c\u0012\u000e\u0008\u0003\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u000e\u0008\u0003\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0014\u0012\u000e\u0008\u0003\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0014\u0012\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001c\u0012\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u001eJ\t\u0010O\u001a\u00020\u0004H\u00c6\u0003J\t\u0010P\u001a\u00020\u000cH\u00c6\u0003J\t\u0010Q\u001a\u00020\u000cH\u00c6\u0003J\u000f\u0010R\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014H\u00c6\u0003J\u000f\u0010S\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0014H\u00c6\u0003J\u000f\u0010T\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0014H\u00c6\u0003J\t\u0010U\u001a\u00020\u0004H\u00c6\u0003J\t\u0010V\u001a\u00020\u001cH\u00c6\u0003J\t\u0010W\u001a\u00020\u0004H\u00c6\u0003J\t\u0010X\u001a\u00020\u0004H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0007H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0004H\u00c6\u0003J\t\u0010[\u001a\u00020\nH\u00c6\u0003J\t\u0010\\\u001a\u00020\u000cH\u00c6\u0003J\t\u0010]\u001a\u00020\u000eH\u00c6\u0003J\t\u0010^\u001a\u00020\u000eH\u00c6\u0003J\t\u0010_\u001a\u00020\nH\u00c6\u0003J\u00c5\u0001\u0010`\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000c2\u000e\u0008\u0003\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u000e\u0008\u0003\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00142\u000e\u0008\u0003\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00142\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001c2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010a\u001a\u00020\u001c2\u0008\u0010b\u001a\u0004\u0018\u00010cH\u00d6\u0003J\t\u0010d\u001a\u00020\u000cH\u00d6\u0001J\t\u0010e\u001a\u00020\u0004H\u00d6\u0001R\u001a\u0010\u0011\u001a\u00020\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&R\u001a\u0010\u0012\u001a\u00020\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\'\u0010 \"\u0004\u0008(\u0010\"R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R\u001e\u0010\u001d\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008-\u0010.\"\u0004\u0008/\u00100R\u001a\u0010\u000f\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00081\u00102\"\u0004\u00083\u00104R \u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00085\u00106\"\u0004\u00087\u00108R \u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00089\u00106\"\u0004\u0008:\u00108R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008;\u0010.\"\u0004\u0008<\u00100R\u001a\u0010\u0008\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008=\u0010.\"\u0004\u0008>\u00100R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008?\u0010.\"\u0004\u0008@\u00100R\u001a\u0010\u001a\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008A\u0010.\"\u0004\u0008B\u00100R\u001a\u0010\u0010\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008C\u0010*\"\u0004\u0008D\u0010,R\u001a\u0010\u001b\u001a\u00020\u001cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008E\u0010F\"\u0004\u0008G\u0010HR \u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008I\u00106\"\u0004\u0008J\u00108R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008K\u00102\"\u0004\u0008L\u00104R\u001a\u0010\u000b\u001a\u00020\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008M\u0010 \"\u0004\u0008N\u0010\"\u00a8\u0006f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SaveSync;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/UserSpecificData;",
        "id",
        "",
        "name",
        "activityType",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;",
        "locationName",
        "distance",
        "",
        "steps",
        "",
        "startTime",
        "",
        "endTime",
        "pace",
        "activeCalories",
        "bmrCalories",
        "splits",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;",
        "gpsPositions",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;",
        "heartRates",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;",
        "notes",
        "shouldSend",
        "",
        "email",
        "(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;Ljava/lang/String;FIJJFIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)V",
        "getActiveCalories",
        "()I",
        "setActiveCalories",
        "(I)V",
        "getActivityType",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;",
        "setActivityType",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;)V",
        "getBmrCalories",
        "setBmrCalories",
        "getDistance",
        "()F",
        "setDistance",
        "(F)V",
        "getEmail",
        "()Ljava/lang/String;",
        "setEmail",
        "(Ljava/lang/String;)V",
        "getEndTime",
        "()J",
        "setEndTime",
        "(J)V",
        "getGpsPositions",
        "()Ljava/util/List;",
        "setGpsPositions",
        "(Ljava/util/List;)V",
        "getHeartRates",
        "setHeartRates",
        "getId",
        "setId",
        "getLocationName",
        "setLocationName",
        "getName",
        "setName",
        "getNotes",
        "setNotes",
        "getPace",
        "setPace",
        "getShouldSend",
        "()Z",
        "setShouldSend",
        "(Z)V",
        "getSplits",
        "setSplits",
        "getStartTime",
        "setStartTime",
        "getSteps",
        "setSteps",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "other",
        "",
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
.field private activeCalories:I

.field private activityType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

.field private bmrCalories:I

.field private distance:F

.field private email:Ljava/lang/String;
    .annotation runtime Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/GsonExclude;
    .end annotation
.end field

.field private endTime:J

.field private gpsPositions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;",
            ">;"
        }
    .end annotation
.end field

.field private heartRates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;",
            ">;"
        }
    .end annotation
.end field

.field private id:Ljava/lang/String;

.field private locationName:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private notes:Ljava/lang/String;

.field private pace:F

.field private shouldSend:Z

.field private splits:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;",
            ">;"
        }
    .end annotation
.end field

.field private startTime:J

.field private steps:I


# direct methods
.method public constructor <init>()V
    .locals 22

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v20, 0x1ffff

    const/16 v21, 0x0

    invoke-direct/range {v0 .. v21}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;Ljava/lang/String;FIJJFIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;Ljava/lang/String;FIJJFIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;",
            "Ljava/lang/String;",
            "FIJJFII",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;",
            ">;",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;",
            ">;",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;",
            ">;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p14

    move-object/from16 v6, p15

    move-object/from16 v7, p16

    move-object/from16 v8, p17

    move-object/from16 v9, p19

    const-string v10, "id"

    invoke-static {p1, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "name"

    invoke-static {p2, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "activityType"

    invoke-static {p3, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "locationName"

    invoke-static {p4, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "splits"

    invoke-static {v5, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "gpsPositions"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "heartRates"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "notes"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "email"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 429
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 431
    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->id:Ljava/lang/String;

    .line 432
    iput-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->name:Ljava/lang/String;

    .line 433
    iput-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->activityType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    .line 435
    iput-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->locationName:Ljava/lang/String;

    move/from16 v1, p5

    .line 436
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->distance:F

    move/from16 v1, p6

    .line 437
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->steps:I

    move-wide/from16 v1, p7

    .line 438
    iput-wide v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->startTime:J

    move-wide/from16 v1, p9

    .line 439
    iput-wide v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->endTime:J

    move/from16 v1, p11

    .line 440
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->pace:F

    move/from16 v1, p12

    .line 441
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->activeCalories:I

    move/from16 v1, p13

    .line 442
    iput v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->bmrCalories:I

    .line 443
    iput-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->splits:Ljava/util/List;

    .line 445
    iput-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->gpsPositions:Ljava/util/List;

    .line 447
    iput-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->heartRates:Ljava/util/List;

    .line 449
    iput-object v8, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->notes:Ljava/lang/String;

    move/from16 v1, p18

    .line 450
    iput-boolean v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->shouldSend:Z

    .line 451
    iput-object v9, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->email:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;Ljava/lang/String;FIJJFIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    move/from16 v0, p20

    and-int/lit8 v1, v0, 0x1

    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    .line 434
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_RUNNING:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move-object v5, v2

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    const/4 v7, 0x0

    if-eqz v6, :cond_4

    const/4 v6, 0x0

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    const/4 v8, 0x0

    goto :goto_5

    :cond_5
    move/from16 v8, p6

    :goto_5
    and-int/lit8 v10, v0, 0x40

    const-wide/16 v11, 0x0

    if-eqz v10, :cond_6

    move-wide v13, v11

    goto :goto_6

    :cond_6
    move-wide/from16 v13, p7

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    goto :goto_7

    :cond_7
    move-wide/from16 v11, p9

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    goto :goto_8

    :cond_8
    move/from16 v7, p11

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    const/4 v10, 0x0

    goto :goto_9

    :cond_9
    move/from16 v10, p12

    :goto_9
    and-int/lit16 v15, v0, 0x400

    if-eqz v15, :cond_a

    const/4 v15, 0x0

    goto :goto_a

    :cond_a
    move/from16 v15, p13

    :goto_a
    and-int/lit16 v9, v0, 0x800

    if-eqz v9, :cond_b

    .line 444
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v9

    goto :goto_b

    :cond_b
    move-object/from16 v9, p14

    :goto_b
    move-object/from16 p21, v2

    and-int/lit16 v2, v0, 0x1000

    if-eqz v2, :cond_c

    .line 446
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    goto :goto_c

    :cond_c
    move-object/from16 v2, p15

    :goto_c
    move-object/from16 v16, v2

    and-int/lit16 v2, v0, 0x2000

    if-eqz v2, :cond_d

    .line 448
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    goto :goto_d

    :cond_d
    move-object/from16 v2, p16

    :goto_d
    move-object/from16 v17, v2

    and-int/lit16 v2, v0, 0x4000

    if-eqz v2, :cond_e

    move-object/from16 v2, p21

    goto :goto_e

    :cond_e
    move-object/from16 v2, p17

    :goto_e
    const v18, 0x8000

    and-int v18, v0, v18

    if-eqz v18, :cond_f

    const/16 v18, 0x0

    goto :goto_f

    :cond_f
    move/from16 v18, p18

    :goto_f
    const/high16 v19, 0x10000

    and-int v0, v0, v19

    if-eqz v0, :cond_10

    move-object/from16 v0, p21

    goto :goto_10

    :cond_10
    move-object/from16 v0, p19

    :goto_10
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v8

    move-wide/from16 p8, v13

    move-wide/from16 p10, v11

    move/from16 p12, v7

    move/from16 p13, v10

    move/from16 p14, v15

    move-object/from16 p15, v9

    move-object/from16 p16, v16

    move-object/from16 p17, v17

    move-object/from16 p18, v2

    move/from16 p19, v18

    move-object/from16 p20, v0

    .line 430
    invoke-direct/range {p1 .. p20}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;Ljava/lang/String;FIJJFIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;Ljava/lang/String;FIJJFIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p20

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->name:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->activityType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->locationName:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->distance:F

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->steps:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-wide v8, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->startTime:J

    goto :goto_6

    :cond_6
    move-wide/from16 v8, p7

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-wide v10, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->endTime:J

    goto :goto_7

    :cond_7
    move-wide/from16 v10, p9

    :goto_7
    and-int/lit16 v12, v1, 0x100

    if-eqz v12, :cond_8

    iget v12, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->pace:F

    goto :goto_8

    :cond_8
    move/from16 v12, p11

    :goto_8
    and-int/lit16 v13, v1, 0x200

    if-eqz v13, :cond_9

    iget v13, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->activeCalories:I

    goto :goto_9

    :cond_9
    move/from16 v13, p12

    :goto_9
    and-int/lit16 v14, v1, 0x400

    if-eqz v14, :cond_a

    iget v14, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->bmrCalories:I

    goto :goto_a

    :cond_a
    move/from16 v14, p13

    :goto_a
    and-int/lit16 v15, v1, 0x800

    if-eqz v15, :cond_b

    iget-object v15, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->splits:Ljava/util/List;

    goto :goto_b

    :cond_b
    move-object/from16 v15, p14

    :goto_b
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-object v15, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->gpsPositions:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p15

    :goto_c
    move-object/from16 p15, v15

    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->heartRates:Ljava/util/List;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p16

    :goto_d
    move-object/from16 p16, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->notes:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p17

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getShouldSend()Z

    move-result v16

    goto :goto_f

    :cond_f
    move/from16 v16, p18

    :goto_f
    const/high16 v17, 0x10000

    and-int v1, v1, v17

    if-eqz v1, :cond_10

    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getEmail()Ljava/lang/String;

    move-result-object v1

    goto :goto_10

    :cond_10
    move-object/from16 v1, p19

    :goto_10
    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move-wide/from16 p7, v8

    move-wide/from16 p9, v10

    move/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v14

    move-object/from16 p17, v15

    move/from16 p18, v16

    move-object/from16 p19, v1

    invoke-virtual/range {p0 .. p19}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->copy(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;Ljava/lang/String;FIJJFIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->activeCalories:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->bmrCalories:I

    return v0
.end method

.method public final component12()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->splits:Ljava/util/List;

    return-object v0
.end method

.method public final component13()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->gpsPositions:Ljava/util/List;

    return-object v0
.end method

.method public final component14()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->heartRates:Ljava/util/List;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Z
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getShouldSend()Z

    move-result v0

    return v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getEmail()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->activityType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->locationName:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()F
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->distance:F

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->steps:I

    return v0
.end method

.method public final component7()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->startTime:J

    return-wide v0
.end method

.method public final component8()J
    .locals 2

    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->endTime:J

    return-wide v0
.end method

.method public final component9()F
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->pace:F

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;Ljava/lang/String;FIJJFIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;",
            "Ljava/lang/String;",
            "FIJJFII",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;",
            ">;",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;",
            ">;",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;",
            ">;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            ")",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-wide/from16 v7, p7

    move-wide/from16 v9, p9

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v19, p19

    const-string v0, "id"

    move-object/from16 v20, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityType"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationName"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "splits"

    move-object/from16 v1, p14

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gpsPositions"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heartRates"

    move-object/from16 v1, p16

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notes"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "email"

    move-object/from16 v1, p19

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v21, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    move-object/from16 v0, v21

    move-object/from16 v1, v20

    invoke-direct/range {v0 .. v19}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;Ljava/lang/String;FIJJFIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)V

    return-object v21
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->id:Ljava/lang/String;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->name:Ljava/lang/String;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->activityType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->activityType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->locationName:Ljava/lang/String;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->locationName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->distance:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->distance:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->steps:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->steps:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->startTime:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->startTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->endTime:J

    iget-wide v5, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->endTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->pace:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->pace:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->activeCalories:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->activeCalories:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->bmrCalories:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->bmrCalories:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->splits:Ljava/util/List;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->splits:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->gpsPositions:Ljava/util/List;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->gpsPositions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->heartRates:Ljava/util/List;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->heartRates:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->notes:Ljava/lang/String;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->notes:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getShouldSend()Z

    move-result v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getShouldSend()Z

    move-result v3

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getEmail()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    return v2

    :cond_12
    return v0
.end method

.method public final getActiveCalories()I
    .locals 1

    .line 441
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->activeCalories:I

    return v0
.end method

.method public final getActivityType()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;
    .locals 1

    .line 434
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->activityType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    return-object v0
.end method

.method public final getBmrCalories()I
    .locals 1

    .line 442
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->bmrCalories:I

    return v0
.end method

.method public final getDistance()F
    .locals 1

    .line 436
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->distance:F

    return v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    .line 451
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final getEndTime()J
    .locals 2

    .line 439
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->endTime:J

    return-wide v0
.end method

.method public final getGpsPositions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;",
            ">;"
        }
    .end annotation

    .line 446
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->gpsPositions:Ljava/util/List;

    return-object v0
.end method

.method public final getHeartRates()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;",
            ">;"
        }
    .end annotation

    .line 448
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->heartRates:Ljava/util/List;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    .line 431
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLocationName()Ljava/lang/String;
    .locals 1

    .line 435
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->locationName:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 432
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getNotes()Ljava/lang/String;
    .locals 1

    .line 449
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public final getPace()F
    .locals 1

    .line 440
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->pace:F

    return v0
.end method

.method public getShouldSend()Z
    .locals 1

    .line 450
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->shouldSend:Z

    return v0
.end method

.method public final getSplits()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;",
            ">;"
        }
    .end annotation

    .line 444
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->splits:Ljava/util/List;

    return-object v0
.end method

.method public final getStartTime()J
    .locals 2

    .line 438
    iget-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->startTime:J

    return-wide v0
.end method

.method public final getSteps()I
    .locals 1

    .line 437
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->steps:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->activityType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->locationName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->distance:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->steps:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->startTime:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->endTime:J

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession-$$ExternalSynthetic0;->m0(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->pace:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->activeCalories:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->bmrCalories:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->splits:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->gpsPositions:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->heartRates:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->notes:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getShouldSend()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setActiveCalories(I)V
    .locals 0

    .line 441
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->activeCalories:I

    return-void
.end method

.method public final setActivityType(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 434
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->activityType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    return-void
.end method

.method public final setBmrCalories(I)V
    .locals 0

    .line 442
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->bmrCalories:I

    return-void
.end method

.method public final setDistance(F)V
    .locals 0

    .line 436
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->distance:F

    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 451
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->email:Ljava/lang/String;

    return-void
.end method

.method public final setEndTime(J)V
    .locals 0

    .line 439
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->endTime:J

    return-void
.end method

.method public final setGpsPositions(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 446
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->gpsPositions:Ljava/util/List;

    return-void
.end method

.method public final setHeartRates(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 448
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->heartRates:Ljava/util/List;

    return-void
.end method

.method public final setId(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 431
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->id:Ljava/lang/String;

    return-void
.end method

.method public final setLocationName(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 435
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->locationName:Ljava/lang/String;

    return-void
.end method

.method public final setName(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 432
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->name:Ljava/lang/String;

    return-void
.end method

.method public final setNotes(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 449
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->notes:Ljava/lang/String;

    return-void
.end method

.method public final setPace(F)V
    .locals 0

    .line 440
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->pace:F

    return-void
.end method

.method public setShouldSend(Z)V
    .locals 0

    .line 450
    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->shouldSend:Z

    return-void
.end method

.method public final setSplits(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 444
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->splits:Ljava/util/List;

    return-void
.end method

.method public final setStartTime(J)V
    .locals 0

    .line 438
    iput-wide p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->startTime:J

    return-void
.end method

.method public final setSteps(I)V
    .locals 0

    .line 437
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->steps:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UserActivitySession(id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", activityType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->activityType:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", locationName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->locationName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->distance:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", steps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->steps:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->startTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->endTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", pace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->pace:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", activeCalories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->activeCalories:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bmrCalories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->bmrCalories:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", splits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->splits:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", gpsPositions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->gpsPositions:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", heartRates="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->heartRates:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", notes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->notes:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", shouldSend="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getShouldSend()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", email="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
