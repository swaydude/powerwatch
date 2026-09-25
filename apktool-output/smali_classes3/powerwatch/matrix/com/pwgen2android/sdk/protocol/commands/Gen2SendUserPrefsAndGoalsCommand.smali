.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;
.source "UserInfoCommands.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0008H\u0002J\u0018\u0010\u000c\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0008H\u0002J\u0018\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0008H\u0002J\u0018\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0008H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;",
        "pairingConfig",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)V",
        "createPayload",
        "",
        "packGoals",
        "Ljava/nio/ByteBuffer;",
        "goalsInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;",
        "dataBuffer",
        "packLanguageInfo",
        "locale",
        "Ljava/util/Locale;",
        "packUserPrefs",
        "userInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;",
        "packWatchData",
        "unitsInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;",
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
.field private final pairingConfig:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)V
    .locals 1

    const-string v0, "pairingConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2SendUserPrefsAndGoalsCommandId;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2SendUserPrefsAndGoalsCommandId;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;->pairingConfig:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    return-void
.end method

.method private final packGoals(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 1

    .line 164
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p2

    .line 165
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;->getStepsGoal()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    .line 166
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;->getDistanceGoal()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    .line 167
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;->getCaloriesGoal()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    .line 168
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;->getSleepGoal()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string p2, "dataBuffer.order(ByteOrder.BIG_ENDIAN)\n                .putInt(goalsInfo.stepsGoal)\n                .putInt(goalsInfo.distanceGoal.toInt())\n                .putInt(goalsInfo.caloriesGoal)\n                .putInt(goalsInfo.sleepGoal)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final packLanguageInfo(Ljava/util/Locale;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 1

    .line 174
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$English;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$English;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$English;->getLocale()Ljava/util/Locale;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$English;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$English;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto/16 :goto_0

    .line 175
    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$French;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$French;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$French;->getLocale()Ljava/util/Locale;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$French;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$French;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto/16 :goto_0

    .line 176
    :cond_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$German;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$German;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$German;->getLocale()Ljava/util/Locale;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$German;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$German;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto/16 :goto_0

    .line 177
    :cond_2
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Japanese;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Japanese;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Japanese;->getLocale()Ljava/util/Locale;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Japanese;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Japanese;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto/16 :goto_0

    .line 178
    :cond_3
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Korean;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Korean;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Korean;->getLocale()Ljava/util/Locale;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Korean;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Korean;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto/16 :goto_0

    .line 179
    :cond_4
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$SimplifiedChinese;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$SimplifiedChinese;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$SimplifiedChinese;->getLocale()Ljava/util/Locale;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$SimplifiedChinese;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$SimplifiedChinese;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto/16 :goto_0

    .line 180
    :cond_5
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$TraditionalChinese;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$TraditionalChinese;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$TraditionalChinese;->getLocale()Ljava/util/Locale;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$TraditionalChinese;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$TraditionalChinese;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto :goto_0

    .line 181
    :cond_6
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Italian;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Italian;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Italian;->getLocale()Ljava/util/Locale;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Italian;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Italian;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto :goto_0

    .line 182
    :cond_7
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Spanish;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Spanish;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Spanish;->getLocale()Ljava/util/Locale;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Spanish;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Spanish;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto :goto_0

    .line 183
    :cond_8
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Portugal;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Portugal;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Portugal;->getLocale()Ljava/util/Locale;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Portugal;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Portugal;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto :goto_0

    .line 184
    :cond_9
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Russian;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Russian;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Russian;->getLocale()Ljava/util/Locale;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Russian;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Russian;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto :goto_0

    .line 185
    :cond_a
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Czech;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Czech;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Czech;->getLocale()Ljava/util/Locale;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Czech;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Czech;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto :goto_0

    .line 186
    :cond_b
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Polish;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Polish;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Polish;->getLocale()Ljava/util/Locale;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Polish;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Polish;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto :goto_0

    .line 187
    :cond_c
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$English;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$English;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    .line 191
    :goto_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;->getValue()I

    move-result p1

    int-to-byte p1, p1

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string p2, "dataBuffer\n                .put(languageCommandValue.value.toByte())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final packUserPrefs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 3

    .line 152
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;->getGenderMale()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 153
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;->getAge()I

    move-result v1

    int-to-byte v1, v1

    .line 154
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;->getWeight()F

    move-result v2

    float-to-int v2, v2

    int-to-short v2, v2

    .line 155
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;->getHeight()I

    move-result p1

    int-to-short p1, p1

    mul-int/lit8 p1, p1, 0xa

    .line 157
    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object p2

    .line 158
    invoke-virtual {p2, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object p2

    .line 159
    invoke-virtual {p2, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-result-object p2

    int-to-short p1, p1

    .line 160
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string p2, "dataBuffer.put(maleVal)\n                .put(age)\n                .putShort(weight)\n                .putShort(height.toShort())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final packWatchData(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 6

    .line 137
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;->getTwelveHourFormat()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 138
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;->getMetricsFormat()Z

    move-result p1

    .line 139
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/16 v3, 0x3e8

    int-to-long v3, v3

    .line 140
    div-long v3, v1, v3

    .line 141
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v5

    invoke-virtual {v5, v1, v2}, Ljava/util/TimeZone;->getOffset(J)I

    move-result v1

    const v2, 0xea60

    div-int/2addr v1, v2

    .line 144
    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object p2

    .line 145
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object p1

    long-to-int p2, v3

    .line 146
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    int-to-short p2, v1

    .line 147
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string p2, "dataBuffer\n                .put(twelveHour)\n                .put(metrics)\n                .putInt(currentTimeSec.toInt())\n                .putShort(zoneOffset.toShort())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public createPayload()[B
    .locals 3

    const/16 v0, 0x1f

    .line 196
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 198
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;->pairingConfig:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getUnitsInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;

    move-result-object v1

    const-string v2, "dataBuffer"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;->packWatchData(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 199
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;->pairingConfig:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getUserInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;->packUserPrefs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 200
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;->pairingConfig:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getGoalInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;->packGoals(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 201
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;->pairingConfig:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getLanguageInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LanguageInfoData;->getLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendUserPrefsAndGoalsCommand;->packLanguageInfo(Ljava/util/Locale;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 203
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const-string v1, "dataBuffer.array()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
