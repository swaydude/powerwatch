.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;
.super Ljava/lang/Object;
.source "LoggerModule.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$INFO;,
        Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$DEBUG;,
        Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WARN;,
        Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$ERROR;,
        Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WTF;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0005\u0007\u0008\t\n\u000bB\u000f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0005\u000c\r\u000e\u000f\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;",
        "",
        "levelTag",
        "",
        "(Ljava/lang/String;)V",
        "getLevelTag",
        "()Ljava/lang/String;",
        "DEBUG",
        "ERROR",
        "INFO",
        "WARN",
        "WTF",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$INFO;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$DEBUG;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WARN;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$ERROR;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WTF;",
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
.field private final levelTag:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;->levelTag:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getLevelTag()Ljava/lang/String;
    .locals 1

    .line 5
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;->levelTag:Ljava/lang/String;

    return-object v0
.end method
