.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendLanguageCommand;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;
.source "UserInfoCommands.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendLanguageCommand;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;",
        "locale",
        "Ljava/util/Locale;",
        "(Ljava/util/Locale;)V",
        "createPayload",
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
.field private final locale:Ljava/util/Locale;


# direct methods
.method public constructor <init>(Ljava/util/Locale;)V
    .locals 1

    const-string v0, "locale"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2SendLanguageCommandId;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs$Gen2SendLanguageCommandId;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2AbstractCommand;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2CommandIDs;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendLanguageCommand;->locale:Ljava/util/Locale;

    return-void
.end method


# virtual methods
.method public createPayload()[B
    .locals 3

    .line 86
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SendLanguageCommand;->locale:Ljava/util/Locale;

    .line 87
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$English;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$English;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$English;->getLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$English;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$English;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto/16 :goto_0

    .line 88
    :cond_0
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$French;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$French;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$French;->getLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$French;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$French;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto/16 :goto_0

    .line 89
    :cond_1
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$German;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$German;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$German;->getLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$German;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$German;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto/16 :goto_0

    .line 90
    :cond_2
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Japanese;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Japanese;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Japanese;->getLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Japanese;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Japanese;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto/16 :goto_0

    .line 91
    :cond_3
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Korean;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Korean;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Korean;->getLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Korean;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Korean;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto/16 :goto_0

    .line 92
    :cond_4
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$SimplifiedChinese;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$SimplifiedChinese;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$SimplifiedChinese;->getLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$SimplifiedChinese;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$SimplifiedChinese;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto/16 :goto_0

    .line 93
    :cond_5
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$TraditionalChinese;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$TraditionalChinese;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$TraditionalChinese;->getLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$TraditionalChinese;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$TraditionalChinese;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto :goto_0

    .line 94
    :cond_6
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Italian;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Italian;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Italian;->getLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Italian;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Italian;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto :goto_0

    .line 95
    :cond_7
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Spanish;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Spanish;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Spanish;->getLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Spanish;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Spanish;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto :goto_0

    .line 96
    :cond_8
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Portugal;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Portugal;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Portugal;->getLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Portugal;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Portugal;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto :goto_0

    .line 97
    :cond_9
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Russian;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Russian;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Russian;->getLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Russian;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Russian;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto :goto_0

    .line 98
    :cond_a
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Czech;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Czech;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Czech;->getLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Czech;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Czech;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto :goto_0

    .line 99
    :cond_b
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Polish;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Polish;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion$LanguageLocale$Polish;->getLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Polish;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$Polish;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    goto :goto_0

    .line 100
    :cond_c
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$English;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue$English;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;

    :goto_0
    const/4 v1, 0x1

    .line 103
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 104
    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 105
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LocaleCommandValue;->getValue()I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 108
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const-string v1, "dataBuffer.array()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
