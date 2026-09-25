.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender;
.source "UserAccount.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Female"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender;",
        "()V",
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


# static fields
.field public static final INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const-string v0, "female"

    const v1, 0x7f0f00d1

    const/4 v2, 0x0

    .line 13
    invoke-direct {p0, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
