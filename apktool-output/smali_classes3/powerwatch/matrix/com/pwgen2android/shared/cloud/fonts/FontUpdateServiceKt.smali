.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateServiceKt;
.super Ljava/lang/Object;
.source "FontUpdateService.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "url",
        "",
        "getUrl",
        "()Ljava/lang/String;",
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


# static fields
.field private static final url:Ljava/lang/String; = "https://powerwatch-fonts.s3-us-west-1.amazonaws.com/font_update.json"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getUrl()Ljava/lang/String;
    .locals 1

    .line 11
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateServiceKt;->url:Ljava/lang/String;

    return-object v0
.end method
