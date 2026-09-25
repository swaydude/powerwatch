.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;
.super Ljava/lang/Object;
.source "CalendarView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u00c6\u0003JC\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0019\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0011\u00a8\u0006 "
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;",
        "",
        "weekOfMonth",
        "",
        "weekOfYear",
        "year",
        "date",
        "Ljava/util/Date;",
        "days",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;",
        "(IIILjava/util/Date;Ljava/util/List;)V",
        "getDate",
        "()Ljava/util/Date;",
        "getDays",
        "()Ljava/util/List;",
        "getWeekOfMonth",
        "()I",
        "getWeekOfYear",
        "getYear",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
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
.field private final date:Ljava/util/Date;

.field private final days:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;",
            ">;"
        }
    .end annotation
.end field

.field private final weekOfMonth:I

.field private final weekOfYear:I

.field private final year:I


# direct methods
.method public constructor <init>(IIILjava/util/Date;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Ljava/util/Date;",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;",
            ">;)V"
        }
    .end annotation

    const-string v0, "date"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "days"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 353
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->weekOfMonth:I

    .line 354
    iput p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->weekOfYear:I

    .line 355
    iput p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->year:I

    .line 356
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->date:Ljava/util/Date;

    .line 357
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->days:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;IIILjava/util/Date;Ljava/util/List;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->weekOfMonth:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->weekOfYear:I

    :cond_1
    move p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->year:I

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->date:Ljava/util/Date;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->days:Ljava/util/List;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move p3, p1

    move p4, p7

    move p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->copy(IIILjava/util/Date;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->weekOfMonth:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->weekOfYear:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->year:I

    return v0
.end method

.method public final component4()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->date:Ljava/util/Date;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->days:Ljava/util/List;

    return-object v0
.end method

.method public final copy(IIILjava/util/Date;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Ljava/util/Date;",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;",
            ">;)",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;"
        }
    .end annotation

    const-string v0, "date"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "days"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;

    move-object v1, v0

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;-><init>(IIILjava/util/Date;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->weekOfMonth:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->weekOfMonth:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->weekOfYear:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->weekOfYear:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->year:I

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->year:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->date:Ljava/util/Date;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->date:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->days:Ljava/util/List;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->days:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getDate()Ljava/util/Date;
    .locals 1

    .line 356
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->date:Ljava/util/Date;

    return-object v0
.end method

.method public final getDays()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/DayCell;",
            ">;"
        }
    .end annotation

    .line 357
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->days:Ljava/util/List;

    return-object v0
.end method

.method public final getWeekOfMonth()I
    .locals 1

    .line 353
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->weekOfMonth:I

    return v0
.end method

.method public final getWeekOfYear()I
    .locals 1

    .line 354
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->weekOfYear:I

    return v0
.end method

.method public final getYear()I
    .locals 1

    .line 355
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->year:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->weekOfMonth:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->weekOfYear:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->year:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->date:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->days:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WeekRow(weekOfMonth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->weekOfMonth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", weekOfYear="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->weekOfYear:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", year="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->year:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", date="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->date:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", days="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/calendar/WeekRow;->days:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
