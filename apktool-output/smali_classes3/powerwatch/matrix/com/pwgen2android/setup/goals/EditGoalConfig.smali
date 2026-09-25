.class public final Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;
.super Ljava/lang/Object;
.source "SingleGoalEditFragment.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006 "
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;",
        "Landroid/os/Parcelable;",
        "type",
        "Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;",
        "value",
        "",
        "unit",
        "",
        "(Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;Ljava/lang/Number;Ljava/lang/String;)V",
        "getType",
        "()Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;",
        "getUnit",
        "()Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/Number;",
        "component1",
        "component2",
        "component3",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
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
            "Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final type:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;

.field private final unit:Ljava/lang/String;

.field private final value:Ljava/lang/Number;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig$Creator;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;Ljava/lang/Number;Ljava/lang/String;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->type:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->value:Ljava/lang/Number;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->unit:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;Ljava/lang/Number;Ljava/lang/String;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->type:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->value:Ljava/lang/Number;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->unit:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->copy(Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;Ljava/lang/Number;Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->type:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;

    return-object v0
.end method

.method public final component2()Ljava/lang/Number;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->value:Ljava/lang/Number;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->unit:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;Ljava/lang/Number;Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;

    invoke-direct {v0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;Ljava/lang/Number;Ljava/lang/String;)V

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
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->type:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->type:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->value:Ljava/lang/Number;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->value:Ljava/lang/Number;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->unit:Ljava/lang/String;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->unit:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getType()Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;
    .locals 1

    .line 46
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->type:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;

    return-object v0
.end method

.method public final getUnit()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->unit:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Number;
    .locals 1

    .line 46
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->value:Ljava/lang/Number;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->type:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->value:Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->unit:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EditGoalConfig(type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->type:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->value:Ljava/lang/Number;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", unit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->unit:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->type:Lpowerwatch/matrix/com/pwgen2android/setup/goals/GoalType;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->value:Ljava/lang/Number;

    check-cast p2, Ljava/io/Serializable;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;->unit:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
