.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/db/SleepTypeTypeConverter;
.super Ljava/lang/Object;
.source "TypeConverters.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/SleepTypeTypeConverter;",
        "",
        "()V",
        "fromSleepType",
        "",
        "sleepType",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;",
        "toSleepType",
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
.method public constructor <init>()V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromSleepType(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;)Ljava/lang/String;
    .locals 1

    const-string v0, "sleepType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->name()Ljava/lang/String;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type java.lang.String"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    const-string v0, "(this as java.lang.String).toUpperCase()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final toSleepType(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;
    .locals 1

    const-string v0, "sleepType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->valueOf(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    move-result-object p1

    return-object p1
.end method
