.class public final Lkotlinx/coroutines/internal/StackTraceRecoveryKt;
.super Ljava/lang/Object;
.source "StackTraceRecovery.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStackTraceRecovery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 2 IntrinsicArrayConstructors.kt\norg/jetbrains/kotlin/codegen/intrinsics/IntrinsicArrayConstructorsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,216:1\n42#2,5:217\n37#3,2:222\n10029#4,2:224\n1416#4,6:230\n10029#4,2:236\n1416#4,6:238\n25#5,2:226\n25#5,2:228\n*E\n*S KotlinDebug\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n31#1,5:217\n93#1,2:222\n118#1,2:224\n128#1,6:230\n159#1,2:236\n200#1,6:238\n120#1,2:226\n122#1,2:228\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010\u0001\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a9\u0010\u0004\u001a\u0002H\u0005\"\u0008\u0008\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\u0008\u001a\u0002H\u00052\u0010\u0010\t\u001a\u000c\u0012\u0008\u0012\u00060\u0001j\u0002`\u000b0\nH\u0002\u00a2\u0006\u0002\u0010\u000c\u001a\u001e\u0010\r\u001a\u000c\u0012\u0008\u0012\u00060\u0001j\u0002`\u000b0\n2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010H\u0002\u001a1\u0010\u0011\u001a\u00020\u00122\u0010\u0010\u0013\u001a\u000c\u0012\u0008\u0012\u00060\u0001j\u0002`\u000b0\u00142\u0010\u0010\u0008\u001a\u000c\u0012\u0008\u0012\u00060\u0001j\u0002`\u000b0\nH\u0002\u00a2\u0006\u0002\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006H\u0080H\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019\u001a+\u0010\u001a\u001a\u0002H\u0005\"\u0008\u0008\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0018\u001a\u0002H\u00052\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010H\u0002\u00a2\u0006\u0002\u0010\u001b\u001a\u001f\u0010\u001c\u001a\u0002H\u0005\"\u0008\u0008\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0018\u001a\u0002H\u0005H\u0000\u00a2\u0006\u0002\u0010\u001d\u001a+\u0010\u001c\u001a\u0002H\u0005\"\u0008\u0008\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0018\u001a\u0002H\u00052\n\u0010\u000e\u001a\u0006\u0012\u0002\u0008\u00030\u001eH\u0000\u00a2\u0006\u0002\u0010\u001f\u001a\u001f\u0010 \u001a\u00020!\"\u0008\u0008\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0018\u001a\u0002H\u0005H\u0002\u00a2\u0006\u0002\u0010\"\u001a\u0018\u0010#\u001a\u00060\u0001j\u0002`\u000b2\n\u0010$\u001a\u00060\u0001j\u0002`\u000bH\u0007\u001a\u001f\u0010%\u001a\u0002H\u0005\"\u0008\u0008\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0018\u001a\u0002H\u0005H\u0000\u00a2\u0006\u0002\u0010\u001d\u001a1\u0010&\u001a\u0018\u0012\u0004\u0012\u0002H\u0005\u0012\u000e\u0012\u000c\u0012\u0008\u0012\u00060\u0001j\u0002`\u000b0\u00140\'\"\u0008\u0008\u0000\u0010\u0005*\u00020\u0006*\u0002H\u0005H\u0002\u00a2\u0006\u0002\u0010(\u001a\u001c\u0010)\u001a\u00020!*\u00060\u0001j\u0002`\u000b2\n\u0010*\u001a\u00060\u0001j\u0002`\u000bH\u0002\u001a#\u0010+\u001a\u00020,*\u000c\u0012\u0008\u0012\u00060\u0001j\u0002`\u000b0\u00142\u0006\u0010-\u001a\u00020\u0003H\u0002\u00a2\u0006\u0002\u0010.\u001a\u0010\u0010/\u001a\u00020!*\u00060\u0001j\u0002`\u000bH\u0000\u001a\u001b\u00100\u001a\u0002H\u0005\"\u0008\u0008\u0000\u0010\u0005*\u00020\u0006*\u0002H\u0005H\u0002\u00a2\u0006\u0002\u0010\u001d*\u000c\u0008\u0000\u00101\"\u00020\u000f2\u00020\u000f*\u000c\u0008\u0000\u00102\"\u00020\u00012\u00020\u0001\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u00063"
    }
    d2 = {
        "artificialFrame",
        "Ljava/lang/StackTraceElement;",
        "message",
        "",
        "createFinalException",
        "E",
        "",
        "cause",
        "result",
        "resultStackTrace",
        "Ljava/util/ArrayDeque;",
        "Lkotlinx/coroutines/internal/StackTraceElement;",
        "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;",
        "createStackTrace",
        "continuation",
        "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;",
        "Lkotlinx/coroutines/internal/CoroutineStackFrame;",
        "mergeRecoveredTraces",
        "",
        "recoveredStacktrace",
        "",
        "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V",
        "recoverAndThrow",
        "",
        "exception",
        "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "recoverFromStackFrame",
        "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;",
        "recoverStackTrace",
        "(Ljava/lang/Throwable;)Ljava/lang/Throwable;",
        "Lkotlin/coroutines/Continuation;",
        "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;",
        "recoveryDisabled",
        "",
        "(Ljava/lang/Throwable;)Z",
        "sanitize",
        "element",
        "unwrap",
        "causeAndStacktrace",
        "Lkotlin/Pair;",
        "(Ljava/lang/Throwable;)Lkotlin/Pair;",
        "elementWiseEquals",
        "e",
        "frameIndex",
        "",
        "methodName",
        "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I",
        "isArtificial",
        "sanitizeStackTrace",
        "CoroutineStackFrame",
        "StackTraceElement",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static synthetic CoroutineStackFrame$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic StackTraceElement$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic access$recoverFromStackFrame(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->recoverFromStackFrame(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$recoveryDisabled(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->recoveryDisabled(Ljava/lang/Throwable;)Z

    move-result p0

    return p0
.end method

.method public static final artificialFrame(Ljava/lang/String;)Ljava/lang/StackTraceElement;
    .locals 3

    const-string v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    new-instance v0, Ljava/lang/StackTraceElement;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u0008\u0008\u0008("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "\u0008"

    const/4 v2, -0x1

    invoke-direct {v0, p0, v1, v1, v2}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method private static final causeAndStacktrace(Ljava/lang/Throwable;)Lkotlin/Pair;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Throwable;",
            ">(TE;)",
            "Lkotlin/Pair<",
            "TE;[",
            "Ljava/lang/StackTraceElement;",
            ">;"
        }
    .end annotation

    .line 115
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 117
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v2

    const-string v3, "currentTrace"

    .line 118
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    const-string v6, "it"

    .line 118
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->isArtificial(Ljava/lang/StackTraceElement;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_2

    .line 119
    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    goto :goto_2

    :cond_2
    new-array v0, v1, [Ljava/lang/StackTraceElement;

    .line 120
    invoke-static {p0, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    goto :goto_2

    :cond_3
    new-array v0, v1, [Ljava/lang/StackTraceElement;

    .line 122
    invoke-static {p0, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    :goto_2
    return-object p0
.end method

.method private static final createFinalException(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Throwable;",
            ">(TE;TE;",
            "Ljava/util/ArrayDeque<",
            "Ljava/lang/StackTraceElement;",
            ">;)TE;"
        }
    .end annotation

    const-string v0, "Coroutine boundary"

    .line 89
    invoke-static {v0}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->artificialFrame(Ljava/lang/String;)Ljava/lang/StackTraceElement;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    .line 90
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p0

    const-string v0, "causeTrace"

    .line 91
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlin.coroutines.jvm.internal.BaseContinuationImpl"

    invoke-static {p0, v0}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->frameIndex([Ljava/lang/StackTraceElement;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_2

    .line 93
    check-cast p2, Ljava/util/Collection;

    if-eqz p2, :cond_1

    new-array p0, v1, [Ljava/lang/StackTraceElement;

    .line 223
    invoke-interface {p2, p0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    check-cast p0, [Ljava/lang/StackTraceElement;

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-object p1

    :cond_0
    new-instance p0, Lkotlin/TypeCastException;

    const-string p1, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-direct {p0, p1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 222
    :cond_1
    new-instance p0, Lkotlin/TypeCastException;

    const-string p1, "null cannot be cast to non-null type java.util.Collection<T>"

    invoke-direct {p0, p1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 97
    :cond_2
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->size()I

    move-result v2

    add-int/2addr v2, v0

    new-array v2, v2, [Ljava/lang/StackTraceElement;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_3

    .line 99
    aget-object v4, p0, v3

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 102
    :cond_3
    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/StackTraceElement;

    add-int v3, v0, v1

    .line 103
    aput-object p2, v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 106
    :cond_4
    invoke-virtual {p1, v2}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-object p1
.end method

.method private static final createStackTrace(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/util/ArrayDeque;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;",
            ")",
            "Ljava/util/ArrayDeque<",
            "Ljava/lang/StackTraceElement;",
            ">;"
        }
    .end annotation

    .line 171
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 172
    invoke-interface {p0}, Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;->getStackTraceElement()Ljava/lang/StackTraceElement;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->sanitize(Ljava/lang/StackTraceElement;)Ljava/lang/StackTraceElement;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 176
    :cond_0
    :goto_0
    instance-of v1, p0, Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;

    if-nez v1, :cond_1

    const/4 p0, 0x0

    :cond_1
    if-eqz p0, :cond_2

    invoke-interface {p0}, Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;->getCallerFrame()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 177
    invoke-interface {p0}, Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;->getStackTraceElement()Ljava/lang/StackTraceElement;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->sanitize(Ljava/lang/StackTraceElement;)Ljava/lang/StackTraceElement;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private static final elementWiseEquals(Ljava/lang/StackTraceElement;Ljava/lang/StackTraceElement;)Z
    .locals 2

    .line 208
    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final frameIndex([Ljava/lang/StackTraceElement;Ljava/lang/String;)I
    .locals 3

    .line 238
    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 239
    aget-object v2, p0, v1

    .line 200
    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :goto_1
    return v1
.end method

.method public static final isArtificial(Ljava/lang/StackTraceElement;)Z
    .locals 4

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "className"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "\u0008\u0008\u0008"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p0, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final mergeRecoveredTraces([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/StackTraceElement;",
            "Ljava/util/ArrayDeque<",
            "Ljava/lang/StackTraceElement;",
            ">;)V"
        }
    .end annotation

    .line 230
    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 231
    aget-object v2, p0, v1

    .line 128
    invoke-static {v2}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->isArtificial(Ljava/lang/StackTraceElement;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 129
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    if-lt v0, v1, :cond_3

    .line 131
    :goto_2
    aget-object v2, p0, v0

    .line 132
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "result.last"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/StackTraceElement;

    invoke-static {v2, v3}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->elementWiseEquals(Ljava/lang/StackTraceElement;Ljava/lang/StackTraceElement;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 133
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    .line 135
    :cond_2
    aget-object v2, p0, v0

    invoke-virtual {p1, v2}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    if-eq v0, v1, :cond_3

    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    :cond_3
    return-void
.end method

.method public static final recoverAndThrow(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 141
    invoke-static {p0}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->access$recoveryDisabled(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 143
    instance-of v0, p1, Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;

    if-nez v0, :cond_0

    throw p0

    .line 144
    :cond_0
    check-cast p1, Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;

    invoke-static {p0, p1}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->access$recoverFromStackFrame(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0

    .line 141
    :cond_1
    throw p0
.end method

.method private static final recoverAndThrow$$forInline(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1

    .line 141
    invoke-static {p0}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->access$recoveryDisabled(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 142
    invoke-static {v0}, Lkotlin/jvm/internal/InlineMarker;->mark(I)V

    .line 143
    instance-of v0, p1, Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;

    if-nez v0, :cond_0

    throw p0

    .line 144
    :cond_0
    check-cast p1, Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;

    invoke-static {p0, p1}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->access$recoverFromStackFrame(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0

    .line 141
    :cond_1
    throw p0
.end method

.method private static final recoverFromStackFrame(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Throwable;",
            ">(TE;",
            "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;",
            ")TE;"
        }
    .end annotation

    .line 56
    invoke-static {p0}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->causeAndStacktrace(Ljava/lang/Throwable;)Lkotlin/Pair;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/StackTraceElement;

    .line 59
    invoke-static {v1}, Lkotlinx/coroutines/internal/ExceptionsConstuctorKt;->tryCopyException(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 60
    invoke-static {p1}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->createStackTrace(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/util/ArrayDeque;

    move-result-object p1

    .line 61
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    return-object p0

    :cond_0
    if-eq v1, p0, :cond_1

    .line 65
    invoke-static {v0, p1}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->mergeRecoveredTraces([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V

    .line 69
    :cond_1
    invoke-static {v1, v2, p1}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->createFinalException(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method public static final recoverStackTrace(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Throwable;",
            ">(TE;)TE;"
        }
    .end annotation

    const-string v0, "exception"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-static {p0}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->recoveryDisabled(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 19
    :cond_0
    invoke-static {p0}, Lkotlinx/coroutines/internal/ExceptionsConstuctorKt;->tryCopyException(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 20
    invoke-static {v0}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->sanitizeStackTrace(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static final recoverStackTrace(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Throwable;",
            ">(TE;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)TE;"
        }
    .end annotation

    const-string v0, "exception"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "continuation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-static {p0}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->recoveryDisabled(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_1

    instance-of v0, p1, Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;

    if-nez v0, :cond_0

    goto :goto_0

    .line 48
    :cond_0
    check-cast p1, Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;

    invoke-static {p0, p1}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->recoverFromStackFrame(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;

    move-result-object p0

    :cond_1
    :goto_0
    return-object p0
.end method

.method private static final recoveryDisabled(Ljava/lang/Throwable;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Throwable;",
            ">(TE;)Z"
        }
    .end annotation

    .line 168
    sget-boolean v0, Lkotlinx/coroutines/DebugKt;->RECOVER_STACKTRACES:Z

    if-eqz v0, :cond_1

    sget-boolean v0, Lkotlinx/coroutines/DebugKt;->DEBUG:Z

    if-eqz v0, :cond_1

    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    if-nez v0, :cond_1

    instance-of p0, p0, Lkotlinx/coroutines/internal/NonRecoverableThrowable;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final sanitize(Ljava/lang/StackTraceElement;)Ljava/lang/StackTraceElement;
    .locals 8

    const-string v0, "element"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "element.className"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/CharSequence;

    const/16 v2, 0x2f

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v0, v2, v3, v4, v5}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 191
    :cond_0
    new-instance v0, Ljava/lang/StackTraceElement;

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x2f

    const/16 v4, 0x2e

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method private static final sanitizeStackTrace(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Throwable;",
            ">(TE;)TE;"
        }
    .end annotation

    .line 24
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    .line 25
    array-length v1, v0

    const-string v2, "stackTrace"

    .line 27
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "kotlinx.coroutines.internal.StackTraceRecoveryKt"

    invoke-static {v0, v2}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->frameIndex([Ljava/lang/StackTraceElement;Ljava/lang/String;)I

    move-result v2

    add-int/lit8 v3, v2, 0x1

    const-string v4, "kotlin.coroutines.jvm.internal.BaseContinuationImpl"

    .line 29
    invoke-static {v0, v4}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->frameIndex([Ljava/lang/StackTraceElement;Ljava/lang/String;)I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, -0x1

    if-ne v4, v6, :cond_0

    const/4 v4, 0x0

    goto :goto_0

    :cond_0
    sub-int v4, v1, v4

    :goto_0
    sub-int/2addr v1, v2

    sub-int/2addr v1, v4

    .line 217
    new-array v2, v1, [Ljava/lang/StackTraceElement;

    :goto_1
    if-ge v5, v1, :cond_2

    if-nez v5, :cond_1

    const-string v4, "Coroutine boundary"

    .line 33
    invoke-static {v4}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->artificialFrame(Ljava/lang/String;)Ljava/lang/StackTraceElement;

    move-result-object v4

    goto :goto_2

    :cond_1
    add-int v4, v3, v5

    add-int/lit8 v4, v4, -0x1

    .line 35
    aget-object v4, v0, v4

    .line 36
    :goto_2
    aput-object v4, v2, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 39
    :cond_2
    invoke-virtual {p0, v2}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-object p0
.end method

.method public static final unwrap(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Throwable;",
            ">(TE;)TE;"
        }
    .end annotation

    const-string v0, "exception"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    invoke-static {p0}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->recoveryDisabled(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 153
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    goto :goto_2

    .line 159
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    const-string v2, "exception.stackTrace"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_3

    aget-object v5, v0, v4

    const-string v6, "it"

    .line 159
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lkotlinx/coroutines/internal/StackTraceRecoveryKt;->isArtificial(Ljava/lang/StackTraceElement;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_5

    .line 161
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Throwable;

    if-nez v1, :cond_4

    const/4 v0, 0x0

    :cond_4
    if-eqz v0, :cond_5

    move-object p0, v0

    :cond_5
    :goto_2
    return-object p0
.end method
