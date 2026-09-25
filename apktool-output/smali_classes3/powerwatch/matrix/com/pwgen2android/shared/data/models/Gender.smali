.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender;
.super Ljava/lang/Object;
.source "UserAccount.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;,
        Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0002\u000b\u000cB\u0017\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u0082\u0001\u0002\r\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender;",
        "",
        "description",
        "",
        "displayResource",
        "",
        "(Ljava/lang/String;I)V",
        "getDescription",
        "()Ljava/lang/String;",
        "getDisplayResource",
        "()I",
        "Female",
        "Male",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;",
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
.field private final description:Ljava/lang/String;

.field private final displayResource:I


# direct methods
.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender;->description:Ljava/lang/String;

    iput p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender;->displayResource:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final getDescription()Ljava/lang/String;
    .locals 1

    .line 11
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisplayResource()I
    .locals 1

    .line 11
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender;->displayResource:I

    return v0
.end method
