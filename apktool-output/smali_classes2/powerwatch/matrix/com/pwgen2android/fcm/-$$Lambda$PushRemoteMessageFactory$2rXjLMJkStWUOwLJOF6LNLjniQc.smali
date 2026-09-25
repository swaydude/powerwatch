.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/fcm/-$$Lambda$PushRemoteMessageFactory$2rXjLMJkStWUOwLJOF6LNLjniQc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/-$$Lambda$PushRemoteMessageFactory$2rXjLMJkStWUOwLJOF6LNLjniQc;->f$0:Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/-$$Lambda$PushRemoteMessageFactory$2rXjLMJkStWUOwLJOF6LNLjniQc;->f$1:Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/-$$Lambda$PushRemoteMessageFactory$2rXjLMJkStWUOwLJOF6LNLjniQc;->f$0:Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/-$$Lambda$PushRemoteMessageFactory$2rXjLMJkStWUOwLJOF6LNLjniQc;->f$1:Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;

    check-cast p1, Lcom/google/firebase/messaging/RemoteMessage;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;->lambda$2rXjLMJkStWUOwLJOF6LNLjniQc(Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;Lcom/google/firebase/messaging/RemoteMessage;)Z

    move-result p1

    return p1
.end method
