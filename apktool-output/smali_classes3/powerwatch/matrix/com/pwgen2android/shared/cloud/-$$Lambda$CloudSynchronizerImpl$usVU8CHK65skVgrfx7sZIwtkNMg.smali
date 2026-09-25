.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$usVU8CHK65skVgrfx7sZIwtkNMg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$usVU8CHK65skVgrfx7sZIwtkNMg;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$usVU8CHK65skVgrfx7sZIwtkNMg;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->lambda$usVU8CHK65skVgrfx7sZIwtkNMg(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;)Lio/reactivex/CompletableSource;

    move-result-object v0

    return-object v0
.end method
