.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$jC9t_pmxKqVhf4LZrZXIRRoKzq0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$jC9t_pmxKqVhf4LZrZXIRRoKzq0;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$jC9t_pmxKqVhf4LZrZXIRRoKzq0;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;

    check-cast p1, Lcom/google/firebase/messaging/RemoteMessage;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->lambda$jC9t_pmxKqVhf4LZrZXIRRoKzq0(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Lcom/google/firebase/messaging/RemoteMessage;)V

    return-void
.end method
