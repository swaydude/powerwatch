.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager$DefaultImpls;
.super Ljava/lang/Object;
.source "DialogManager.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
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


# direct methods
.method public static synthetic openAlertDialog$default(Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Landroid/content/Context;IIIIILjava/lang/Object;)Lio/reactivex/Single;
    .locals 6

    if-nez p7, :cond_2

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    const p4, 0x7f0f005f

    const v4, 0x7f0f005f

    goto :goto_0

    :cond_0
    move v4, p4

    :goto_0
    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    const p5, 0x7f0f005c

    const v5, 0x7f0f005c

    goto :goto_1

    :cond_1
    move v5, p5

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    .line 14
    invoke-interface/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;->openAlertDialog(Landroid/content/Context;IIII)Lio/reactivex/Single;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: openAlertDialog"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
