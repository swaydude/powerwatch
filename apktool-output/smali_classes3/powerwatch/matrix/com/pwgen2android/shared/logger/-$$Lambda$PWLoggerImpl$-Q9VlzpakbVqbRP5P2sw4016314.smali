.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerImpl$-Q9VlzpakbVqbRP5P2sw4016314;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# instance fields
.field public final synthetic f$0:[Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;


# direct methods
.method public synthetic constructor <init>([Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerImpl$-Q9VlzpakbVqbRP5P2sw4016314;->f$0:[Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerImpl$-Q9VlzpakbVqbRP5P2sw4016314;->f$0:[Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl;->lambda$-Q9VlzpakbVqbRP5P2sw4016314([Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)Z

    move-result p1

    return p1
.end method
