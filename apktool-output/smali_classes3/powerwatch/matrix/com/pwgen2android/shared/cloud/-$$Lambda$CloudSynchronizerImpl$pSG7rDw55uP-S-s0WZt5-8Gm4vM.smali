.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$pSG7rDw55uP-S-s0WZt5-8Gm4vM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$pSG7rDw55uP-S-s0WZt5-8Gm4vM;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$pSG7rDw55uP-S-s0WZt5-8Gm4vM;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->lambda$pSG7rDw55uP-S-s0WZt5-8Gm4vM(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;Ljava/lang/Integer;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
