.class public final Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl;
.super Ljava/lang/Object;
.source "PWLoggerInput.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogger;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPWLoggerInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PWLoggerInput.kt\npowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,180:1\n18098#2,2:181\n*S KotlinDebug\n*F\n+ 1 PWLoggerInput.kt\npowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl\n*L\n170#1:181,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0018\u0010\u000c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\"\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\'\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00152\u0012\u0010\u0016\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018H\u0016\u00a2\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\"\u0010\u001b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogger;",
        "loggerConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;)V",
        "loggerSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;",
        "kotlin.jvm.PlatformType",
        "addLog",
        "",
        "pwLog",
        "debug",
        "message",
        "",
        "tag",
        "",
        "error",
        "",
        "info",
        "logOutput",
        "Lio/reactivex/Observable;",
        "logLevels",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;",
        "([Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;)Lio/reactivex/Observable;",
        "warn",
        "wtfError",
        "Companion",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl$Companion;


# instance fields
.field private final loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;

.field private final loggerSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl$Companion;

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;)V
    .locals 1

    const-string v0, "loggerConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl;->loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;

    .line 95
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    const-string v0, "create<PWLog>()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl;->loggerSubject:Lio/reactivex/subjects/PublishSubject;

    return-void
.end method

.method public static synthetic lambda$-Q9VlzpakbVqbRP5P2sw4016314([Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)Z
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl;->logOutput$lambda-1([Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)Z

    move-result p0

    return p0
.end method

.method private static final logOutput$lambda-1([Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)Z
    .locals 6

    const-string v0, "$logLevels"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pwLog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return v2

    .line 181
    :cond_1
    array-length v0, p0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v0, :cond_3

    aget-object v4, p0, v3

    .line 171
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;->getLogLevel()Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x1

    :goto_2
    xor-int/lit8 p0, v1, 0x1

    return p0
.end method


# virtual methods
.method public addLog(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
    .locals 1

    const-string v0, "pwLog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl;->loggerSubject:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public debug(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 8

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->createTag(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 155
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl;->loggerSubject:Lio/reactivex/subjects/PublishSubject;

    .line 158
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl;->loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;->getEnv()Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;

    move-result-object v6

    .line 159
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$DEBUG;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$DEBUG;

    .line 161
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toCalendar(J)Ljava/util/Calendar;

    move-result-object v1

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toDateString(Ljava/util/Calendar;)Ljava/lang/String;

    move-result-object v5

    .line 156
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;

    .line 159
    move-object v4, v0

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    move-object v1, v7

    move-object v2, p1

    .line 156
    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;)V

    .line 155
    invoke-virtual {p2, v7}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public error(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->createTag(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 124
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p1, ""

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, p3

    :goto_0
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 125
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl;->loggerSubject:Lio/reactivex/subjects/PublishSubject;

    .line 127
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl;->loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;->getEnv()Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;

    move-result-object v6

    .line 128
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$ERROR;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$ERROR;

    .line 130
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toCalendar(J)Ljava/util/Calendar;

    move-result-object p3

    invoke-static {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toDateString(Ljava/util/Calendar;)Ljava/lang/String;

    move-result-object v5

    .line 125
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;

    .line 128
    move-object v4, p2

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    move-object v1, p3

    .line 125
    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;)V

    invoke-virtual {p1, p3}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public info(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 8

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->createTag(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 100
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl;->loggerSubject:Lio/reactivex/subjects/PublishSubject;

    .line 102
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl;->loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;->getEnv()Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;

    move-result-object v6

    .line 103
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$INFO;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$INFO;

    .line 105
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toCalendar(J)Ljava/util/Calendar;

    move-result-object v1

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toDateString(Ljava/util/Calendar;)Ljava/lang/String;

    move-result-object v5

    .line 100
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;

    .line 103
    move-object v4, v0

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    move-object v1, v7

    move-object v2, p1

    .line 100
    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;)V

    invoke-virtual {p2, v7}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public varargs logOutput([Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;",
            ">;"
        }
    .end annotation

    const-string v0, "logLevels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl;->loggerSubject:Lio/reactivex/subjects/PublishSubject;

    .line 168
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerImpl$-Q9VlzpakbVqbRP5P2sw4016314;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerImpl$-Q9VlzpakbVqbRP5P2sw4016314;-><init>([Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;)V

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "loggerSubject\n                .filter { pwLog ->\n                    if (logLevels.isEmpty()) return@filter true\n                    !logLevels.none {\n                        it == pwLog.logLevel\n                    }\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public warn(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 8

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->createTag(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 113
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl;->loggerSubject:Lio/reactivex/subjects/PublishSubject;

    .line 115
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl;->loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;->getEnv()Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;

    move-result-object v6

    .line 116
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WARN;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WARN;

    .line 118
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toCalendar(J)Ljava/util/Calendar;

    move-result-object v1

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toDateString(Ljava/util/Calendar;)Ljava/lang/String;

    move-result-object v5

    .line 113
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;

    .line 116
    move-object v4, v0

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    move-object v1, v7

    move-object v2, p1

    .line 113
    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;)V

    invoke-virtual {p2, v7}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public wtfError(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->createTag(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 138
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p1, ""

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, p3

    :goto_0
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 139
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl;->loggerSubject:Lio/reactivex/subjects/PublishSubject;

    .line 141
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl;->loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;->getEnv()Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;

    move-result-object v6

    .line 142
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WTF;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WTF;

    .line 144
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toCalendar(J)Ljava/util/Calendar;

    move-result-object p3

    invoke-static {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->toDateString(Ljava/util/Calendar;)Ljava/lang/String;

    move-result-object v5

    .line 139
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;

    .line 142
    move-object v4, p2

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    move-object v1, p3

    .line 139
    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;-><init>(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;)V

    invoke-virtual {p1, p3}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method
