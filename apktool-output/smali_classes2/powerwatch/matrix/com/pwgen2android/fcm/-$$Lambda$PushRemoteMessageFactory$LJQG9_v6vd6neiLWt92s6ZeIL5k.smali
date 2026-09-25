.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/fcm/-$$Lambda$PushRemoteMessageFactory$LJQG9_v6vd6neiLWt92s6ZeIL5k;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/-$$Lambda$PushRemoteMessageFactory$LJQG9_v6vd6neiLWt92s6ZeIL5k;->f$0:Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/-$$Lambda$PushRemoteMessageFactory$LJQG9_v6vd6neiLWt92s6ZeIL5k;->f$1:Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/-$$Lambda$PushRemoteMessageFactory$LJQG9_v6vd6neiLWt92s6ZeIL5k;->f$0:Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/-$$Lambda$PushRemoteMessageFactory$LJQG9_v6vd6neiLWt92s6ZeIL5k;->f$1:Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;

    check-cast p1, Lio/reactivex/disposables/Disposable;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;->lambda$LJQG9_v6vd6neiLWt92s6ZeIL5k(Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;Lio/reactivex/disposables/Disposable;)V

    return-void
.end method
