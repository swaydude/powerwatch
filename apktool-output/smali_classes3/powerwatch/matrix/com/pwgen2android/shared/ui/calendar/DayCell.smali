.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;
.super Ljava/lang/Object;
.source "CalendarView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u001c\u0008\u0086\u0008\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\t\u0010!\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\"\u001a\u00020\u000bH\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003Je\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001J\u0013\u0010&\u001a\u00020\u00032\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020\u0006H\u00d6\u0001J\t\u0010)\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0011\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0013\u00a8\u0006*"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;",
        "",
        "isCurrentDay",
        "",
        "isToday",
        "dayOfWeek",
        "",
        "dayOfMonth",
        "month",
        "year",
        "date",
        "Ljava/util/Date;",
        "goalAchieved",
        "label",
        "",
        "(ZZIIIILjava/util/Date;ZLjava/lang/String;)V",
        "getDate",
        "()Ljava/util/Date;",
        "getDayOfMonth",
        "()I",
        "getDayOfWeek",
        "getGoalAchieved",
        "()Z",
        "isDayOfWeekend",
        "getLabel",
        "()Ljava/lang/String;",
        "getMonth",
        "getYear",
        "component1",
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
.field private final date:Ljava/util/Date;

.field private final dayOfMonth:I

.field private final dayOfWeek:I

.field private final goalAchieved:Z

.field private final isCurrentDay:Z

.field private final isToday:Z

.field private final label:Ljava/lang/String;

.field private final month:I

.field private final year:I


# direct methods
.method public constructor <init>(ZZIIIILjava/util/Date;ZLjava/lang/String;)V
    .locals 1

    const-string v0, "date"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 336
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->isCurrentDay:Z

    .line 337
    iput-boolean p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->isToday:Z

    .line 338
    iput p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->dayOfWeek:I

    .line 339
    iput p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->dayOfMonth:I

    .line 340
    iput p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->month:I

    .line 341
    iput p6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->year:I

    .line 342
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->date:Ljava/util/Date;

    .line 343
    iput-boolean p8, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->goalAchieved:Z

    .line 344
    iput-object p9, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->label:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ZZIIIILjava/util/Date;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p10

    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    const/4 v10, 0x0

    goto :goto_0

    :cond_0
    move/from16 v10, p8

    :goto_0
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    move-object v11, v0

    goto :goto_1

    :cond_1
    move-object/from16 v11, p9

    :goto_1
    move-object v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move-object/from16 v9, p7

    .line 336
    invoke-direct/range {v2 .. v11}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;-><init>(ZZIIIILjava/util/Date;ZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;ZZIIIILjava/util/Date;ZLjava/lang/String;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;
    .locals 10

    move-object v0, p0

    move/from16 v1, p10

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->isCurrentDay:Z

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->isToday:Z

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->dayOfWeek:I

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->dayOfMonth:I

    goto :goto_3

    :cond_3
    move v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->month:I

    goto :goto_4

    :cond_4
    move v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->year:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->date:Ljava/util/Date;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->goalAchieved:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->label:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v1, p9

    :goto_8
    move p1, v2

    move p2, v3

    move p3, v4

    move p4, v5

    move p5, v6

    move/from16 p6, v7

    move-object/from16 p7, v8

    move/from16 p8, v9

    move-object/from16 p9, v1

    invoke-virtual/range {p0 .. p9}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->copy(ZZIIIILjava/util/Date;ZLjava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->isCurrentDay:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->isToday:Z

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->dayOfWeek:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->dayOfMonth:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->month:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->year:I

    return v0
.end method

.method public final component7()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->date:Ljava/util/Date;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->goalAchieved:Z

    return v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ZZIIIILjava/util/Date;ZLjava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;
    .locals 11

    const-string v0, "date"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;

    move-object v1, v0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;-><init>(ZZIIIILjava/util/Date;ZLjava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->isCurrentDay:Z

    iget-boolean v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->isCurrentDay:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->isToday:Z

    iget-boolean v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->isToday:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->dayOfWeek:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->dayOfWeek:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->dayOfMonth:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->dayOfMonth:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->month:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->month:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->year:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->year:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->date:Ljava/util/Date;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->date:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->goalAchieved:Z

    iget-boolean v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->goalAchieved:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->label:Ljava/lang/String;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->label:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getDate()Ljava/util/Date;
    .locals 1

    .line 342
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->date:Ljava/util/Date;

    return-object v0
.end method

.method public final getDayOfMonth()I
    .locals 1

    .line 339
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->dayOfMonth:I

    return v0
.end method

.method public final getDayOfWeek()I
    .locals 1

    .line 338
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->dayOfWeek:I

    return v0
.end method

.method public final getGoalAchieved()Z
    .locals 1

    .line 343
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->goalAchieved:Z

    return v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    .line 344
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getMonth()I
    .locals 1

    .line 340
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->month:I

    return v0
.end method

.method public final getYear()I
    .locals 1

    .line 341
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->year:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->isCurrentDay:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->isToday:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->dayOfWeek:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->dayOfMonth:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->month:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->year:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->date:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->goalAchieved:Z

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->label:Ljava/lang/String;

    if-nez v1, :cond_3

    const/4 v1, 0x0

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final isCurrentDay()Z
    .locals 1

    .line 336
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->isCurrentDay:Z

    return v0
.end method

.method public final isDayOfWeekend()Z
    .locals 3

    .line 348
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->dayOfWeek:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x7

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method public final isToday()Z
    .locals 1

    .line 337
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->isToday:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DayCell(isCurrentDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->isCurrentDay:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isToday="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->isToday:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", dayOfWeek="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->dayOfWeek:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", dayOfMonth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->dayOfMonth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", month="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->month:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", year="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->year:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", date="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->date:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", goalAchieved="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->goalAchieved:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", label="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;->label:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
