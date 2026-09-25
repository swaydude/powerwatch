.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment$Companion;
.super Ljava/lang/Object;
.source "BarChartFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0007\u00a8\u0006\u0006"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment$Companion;",
        "",
        "()V",
        "newInstance",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;",
        "config",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 268
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment$Companion;-><init>()V

    return-void
.end method

.method public static synthetic newInstance$default(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment$Companion;Ljava/lang/Object;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 270
    :cond_0
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment$Companion;->newInstance(Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final newInstance(Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 270
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;-><init>()V

    .line 271
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 272
    instance-of v2, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    if-eqz v2, :cond_0

    .line 273
    check-cast p1, Landroid/os/Parcelable;

    const-string v2, "pedometerConfig"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 275
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 271
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method
