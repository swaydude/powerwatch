.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter$WhenMappings;
.super Ljava/lang/Object;
.source "GoogleFitSessionWriter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;
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

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->values()[Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_RUNNING:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_INDOOR_RUNNING:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_JOGGING:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_INDOOR_JOGGING:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_BIKING:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_INDOOR_BIKING:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_DRIVING:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ACTIVITY_HIIT:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter$WhenMappings;->$EnumSwitchMapping$0:[I

    return-void
.end method
