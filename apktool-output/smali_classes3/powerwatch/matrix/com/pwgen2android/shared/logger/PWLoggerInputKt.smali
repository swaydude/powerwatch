.class public final Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;
.super Ljava/lang/Object;
.source "PWLoggerInput.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPWLoggerInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PWLoggerInput.kt\npowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt\n+ 2 KoinComponent.kt\norg/koin/core/KoinComponentKt\n+ 3 Koin.kt\norg/koin/core/Koin\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,180:1\n52#2,4:181\n52#2,4:187\n52#2,4:193\n52#2,4:199\n52#2,4:205\n52#3:185\n52#3:191\n52#3:197\n52#3:203\n52#3:209\n55#4:186\n55#4:192\n55#4:198\n55#4:204\n55#4:210\n*S KotlinDebug\n*F\n+ 1 PWLoggerInput.kt\npowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt\n*L\n16#1:181,4\n21#1:187,4\n26#1:193,4\n31#1:199,4\n36#1:205,4\n16#1:185\n21#1:191\n26#1:197\n31#1:203\n36#1:209\n16#1:186\n21#1:192\n26#1:198\n31#1:204\n36#1:210\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0005\n\u0002\u0018\u0002\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001c\u0010\u0007\u001a\u00020\u0008*\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u001a&\u0010\u000b\u001a\u00020\u0008*\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u001c\u0010\r\u001a\u00020\u0008*\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u001c\u0010\u000e\u001a\u00020\u0008*\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u001e\u0010\u000f\u001a\u00020\u0008*\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0010\u00b2\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"
    }
    d2 = {
        "INTERNAL_TAG",
        "",
        "getINTERNAL_TAG",
        "()Ljava/lang/String;",
        "createTag",
        "tag",
        "",
        "debug",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "message",
        "error",
        "",
        "info",
        "warn",
        "wtfError",
        "app_release",
        "logger",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;"
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
.field private static final INTERNAL_TAG:Ljava/lang/String; = "INTERNAL"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final createTag(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const-string v0, "tag"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static final debug(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    check-cast p0, Lorg/koin/core/KoinComponent;

    const/4 v0, 0x0

    .line 193
    move-object v1, v0

    check-cast v1, Lorg/koin/core/qualifier/Qualifier;

    .line 194
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 196
    invoke-interface {p0}, Lorg/koin/core/KoinComponent;->getKoin()Lorg/koin/core/Koin;

    move-result-object p0

    .line 197
    invoke-virtual {p0}, Lorg/koin/core/Koin;->getRootScope()Lorg/koin/core/scope/Scope;

    move-result-object p0

    .line 198
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt$debug$$inlined$inject$default$1;

    invoke-direct {v2, p0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt$debug$$inlined$inject$default$1;-><init>(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-static {v2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p0

    .line 27
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$lambda-2(Lkotlin/Lazy;)Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    move-result-object p0

    invoke-interface {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;->debug(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    move-object p2, p0

    .line 25
    :cond_0
    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static final debug$lambda-2(Lkotlin/Lazy;)Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "+",
            "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;",
            ">;)",
            "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;"
        }
    .end annotation

    .line 26
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    return-object p0
.end method

.method public static final error(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    check-cast p0, Lorg/koin/core/KoinComponent;

    const/4 v0, 0x0

    .line 199
    move-object v1, v0

    check-cast v1, Lorg/koin/core/qualifier/Qualifier;

    .line 200
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 202
    invoke-interface {p0}, Lorg/koin/core/KoinComponent;->getKoin()Lorg/koin/core/Koin;

    move-result-object p0

    .line 203
    invoke-virtual {p0}, Lorg/koin/core/Koin;->getRootScope()Lorg/koin/core/scope/Scope;

    move-result-object p0

    .line 204
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt$error$$inlined$inject$default$1;

    invoke-direct {v2, p0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt$error$$inlined$inject$default$1;-><init>(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-static {v2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p0

    .line 32
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$lambda-3(Lkotlin/Lazy;)Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    move-result-object p0

    invoke-interface {p0, p1, p3, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;->error(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    move-object p3, p0

    .line 30
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method private static final error$lambda-3(Lkotlin/Lazy;)Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "+",
            "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;",
            ">;)",
            "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;"
        }
    .end annotation

    .line 31
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    return-object p0
.end method

.method public static final getINTERNAL_TAG()Ljava/lang/String;
    .locals 1

    .line 13
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->INTERNAL_TAG:Ljava/lang/String;

    return-object v0
.end method

.method public static final info(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    check-cast p0, Lorg/koin/core/KoinComponent;

    const/4 v0, 0x0

    .line 181
    move-object v1, v0

    check-cast v1, Lorg/koin/core/qualifier/Qualifier;

    .line 182
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 184
    invoke-interface {p0}, Lorg/koin/core/KoinComponent;->getKoin()Lorg/koin/core/Koin;

    move-result-object p0

    .line 185
    invoke-virtual {p0}, Lorg/koin/core/Koin;->getRootScope()Lorg/koin/core/scope/Scope;

    move-result-object p0

    .line 186
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt$info$$inlined$inject$default$1;

    invoke-direct {v2, p0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt$info$$inlined$inject$default$1;-><init>(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-static {v2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p0

    .line 17
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->info$lambda-0(Lkotlin/Lazy;)Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    move-result-object p0

    invoke-interface {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;->info(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic info$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    move-object p2, p0

    .line 15
    :cond_0
    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->info(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static final info$lambda-0(Lkotlin/Lazy;)Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "+",
            "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;",
            ">;)",
            "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;"
        }
    .end annotation

    .line 16
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    return-object p0
.end method

.method public static final warn(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    check-cast p0, Lorg/koin/core/KoinComponent;

    const/4 v0, 0x0

    .line 187
    move-object v1, v0

    check-cast v1, Lorg/koin/core/qualifier/Qualifier;

    .line 188
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 190
    invoke-interface {p0}, Lorg/koin/core/KoinComponent;->getKoin()Lorg/koin/core/Koin;

    move-result-object p0

    .line 191
    invoke-virtual {p0}, Lorg/koin/core/Koin;->getRootScope()Lorg/koin/core/scope/Scope;

    move-result-object p0

    .line 192
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt$warn$$inlined$inject$default$1;

    invoke-direct {v2, p0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt$warn$$inlined$inject$default$1;-><init>(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-static {v2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p0

    .line 22
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->warn$lambda-1(Lkotlin/Lazy;)Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    move-result-object p0

    invoke-interface {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;->warn(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic warn$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    move-object p2, p0

    .line 20
    :cond_0
    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->warn(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static final warn$lambda-1(Lkotlin/Lazy;)Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "+",
            "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;",
            ">;)",
            "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;"
        }
    .end annotation

    .line 21
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    return-object p0
.end method

.method public static final wtfError(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    move-object v0, p0

    check-cast v0, Lorg/koin/core/KoinComponent;

    const/4 v1, 0x0

    .line 205
    move-object v2, v1

    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 206
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 208
    invoke-interface {v0}, Lorg/koin/core/KoinComponent;->getKoin()Lorg/koin/core/Koin;

    move-result-object v0

    .line 209
    invoke-virtual {v0}, Lorg/koin/core/Koin;->getRootScope()Lorg/koin/core/scope/Scope;

    move-result-object v0

    .line 210
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt$wtfError$$inlined$inject$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt$wtfError$$inlined$inject$default$1;-><init>(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 37
    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->wtfError$lambda-4(Lkotlin/Lazy;)Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    move-result-object v0

    invoke-interface {v0, p1, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;->wtfError(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic wtfError$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 35
    :cond_0
    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->wtfError(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final wtfError$lambda-4(Lkotlin/Lazy;)Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "+",
            "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;",
            ">;)",
            "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;"
        }
    .end annotation

    .line 36
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    return-object p0
.end method
