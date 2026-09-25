.class public Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;
.super Ljava/lang/Object;
.source "PushRemoteMessageFactory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010#\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0016\u0018\u00002\u00020\u0001B\u0013\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000eR\u001a\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;",
        "",
        "messageSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "Lcom/google/firebase/messaging/RemoteMessage;",
        "(Lio/reactivex/subjects/PublishSubject;)V",
        "getMessageSubject",
        "()Lio/reactivex/subjects/PublishSubject;",
        "priorityList",
        "",
        "",
        "getMessage",
        "Lio/reactivex/Observable;",
        "priority",
        "Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;",
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
.field private final messageSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lcom/google/firebase/messaging/RemoteMessage;",
            ">;"
        }
    .end annotation
.end field

.field private final priorityList:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/subjects/PublishSubject;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/subjects/PublishSubject<",
            "Lcom/google/firebase/messaging/RemoteMessage;",
            ">;)V"
        }
    .end annotation

    const-string v0, "messageSubject"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;->messageSubject:Lio/reactivex/subjects/PublishSubject;

    .line 16
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast p1, Ljava/util/Set;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;->priorityList:Ljava/util/Set;

    return-void
.end method

.method public static synthetic getMessage$default(Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;ILjava/lang/Object;)Lio/reactivex/Observable;
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 20
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority$Medium;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority$Medium;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;

    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;->getMessage(Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getMessage"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final getMessage$lambda-0(Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;Lio/reactivex/disposables/Disposable;)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$priority"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;->priorityList:Ljava/util/Set;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;->getValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static final getMessage$lambda-1(Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$priority"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;->priorityList:Ljava/util/Set;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;->getValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method private static final getMessage$lambda-2(Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;Lcom/google/firebase/messaging/RemoteMessage;)Z
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$priority"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;->priorityList:Ljava/util/Set;

    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;->priorityList:Ljava/util/Set;

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->maxOrNull(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;->getValue()I

    move-result p1

    if-gt p0, p1, :cond_0

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

.method public static synthetic lambda$2rXjLMJkStWUOwLJOF6LNLjniQc(Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;Lcom/google/firebase/messaging/RemoteMessage;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;->getMessage$lambda-2(Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;Lcom/google/firebase/messaging/RemoteMessage;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$LJQG9_v6vd6neiLWt92s6ZeIL5k(Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;Lio/reactivex/disposables/Disposable;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;->getMessage$lambda-0(Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;Lio/reactivex/disposables/Disposable;)V

    return-void
.end method

.method public static synthetic lambda$Z3VvId8MbQh3yeUAx6WXtj_nYzc(Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;->getMessage$lambda-1(Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;)V

    return-void
.end method


# virtual methods
.method public final getMessage(Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;",
            ")",
            "Lio/reactivex/Observable<",
            "Lcom/google/firebase/messaging/RemoteMessage;",
            ">;"
        }
    .end annotation

    const-string v0, "priority"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;->messageSubject:Lio/reactivex/subjects/PublishSubject;

    .line 23
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/fcm/-$$Lambda$PushRemoteMessageFactory$LJQG9_v6vd6neiLWt92s6ZeIL5k;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/fcm/-$$Lambda$PushRemoteMessageFactory$LJQG9_v6vd6neiLWt92s6ZeIL5k;-><init>(Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;)V

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->doOnSubscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    .line 26
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/fcm/-$$Lambda$PushRemoteMessageFactory$Z3VvId8MbQh3yeUAx6WXtj_nYzc;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/fcm/-$$Lambda$PushRemoteMessageFactory$Z3VvId8MbQh3yeUAx6WXtj_nYzc;-><init>(Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnDispose(Lio/reactivex/functions/Action;)Lio/reactivex/Observable;

    move-result-object v0

    .line 29
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/fcm/-$$Lambda$PushRemoteMessageFactory$2rXjLMJkStWUOwLJOF6LNLjniQc;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/fcm/-$$Lambda$PushRemoteMessageFactory$2rXjLMJkStWUOwLJOF6LNLjniQc;-><init>(Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "messageSubject\n            .doOnSubscribe {\n                priorityList.add(priority.value)\n            }\n            .doOnDispose {\n                priorityList.remove(priority.value)\n            }\n            .filter {\n                priorityList.isEmpty() || priorityList.maxOrNull()!! <= priority.value\n            }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method protected final getMessageSubject()Lio/reactivex/subjects/PublishSubject;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/subjects/PublishSubject<",
            "Lcom/google/firebase/messaging/RemoteMessage;",
            ">;"
        }
    .end annotation

    .line 14
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;->messageSubject:Lio/reactivex/subjects/PublishSubject;

    return-object v0
.end method
