.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;
.super Ljava/lang/Object;
.source "Executors.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;",
        "",
        "unitsInfoData",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;",
        "userInfoData",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;",
        "goalInfoData",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;",
        "languageInfoData",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;)V",
        "getGoalInfoData",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;",
        "getLanguageInfoData",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;",
        "getUnitsInfoData",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;",
        "getUserInfoData",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
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
.field private final goalInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;

.field private final languageInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;

.field private final unitsInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;

.field private final userInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;)V
    .locals 1

    const-string v0, "unitsInfoData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userInfoData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalInfoData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "languageInfoData"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->unitsInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;

    .line 31
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->userInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    .line 32
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->goalInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;

    .line 33
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->languageInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->unitsInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->userInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->goalInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->languageInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->copy(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->unitsInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;

    return-object v0
.end method

.method public final component2()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->userInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    return-object v0
.end method

.method public final component3()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->goalInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;

    return-object v0
.end method

.method public final component4()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->languageInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;

    return-object v0
.end method

.method public final copy(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;
    .locals 1

    const-string v0, "unitsInfoData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userInfoData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalInfoData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "languageInfoData"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    invoke-direct {v0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->unitsInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->unitsInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->userInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->userInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->goalInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->goalInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->languageInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->languageInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getGoalInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;
    .locals 1

    .line 32
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->goalInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;

    return-object v0
.end method

.method public final getLanguageInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;
    .locals 1

    .line 33
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->languageInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;

    return-object v0
.end method

.method public final getUnitsInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;
    .locals 1

    .line 30
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->unitsInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;

    return-object v0
.end method

.method public final getUserInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;
    .locals 1

    .line 31
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->userInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->unitsInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->userInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->goalInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->languageInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PairingConfig(unitsInfoData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->unitsInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", userInfoData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->userInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", goalInfoData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->goalInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", languageInfoData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->languageInfoData:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
