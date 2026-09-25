.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriterKt;
.super Ljava/lang/Object;
.source "TCXWriter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriterKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "getTCXType",
        "",
        "type",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getTCXType(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;)Ljava/lang/String;
    .locals 1

    const-string v0, "type"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriterKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    const-string p0, "walking"

    goto :goto_0

    :pswitch_0
    const-string p0, "biking"

    goto :goto_0

    :pswitch_1
    const-string p0, "running"

    :goto_0
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
