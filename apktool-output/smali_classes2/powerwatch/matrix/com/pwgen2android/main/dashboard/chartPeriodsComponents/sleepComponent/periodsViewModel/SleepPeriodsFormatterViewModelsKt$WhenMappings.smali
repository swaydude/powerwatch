.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepPeriodsFormatterViewModelsKt$WhenMappings;
.super Ljava/lang/Object;
.source "SleepPeriodsFormatterViewModels.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepPeriodsFormatterViewModelsKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "WhenMappings"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->values()[Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->RESTLESS:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->DEEP:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->LIGHT:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->SLEEP_AWAKE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepPeriodsFormatterViewModelsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    return-void
.end method
