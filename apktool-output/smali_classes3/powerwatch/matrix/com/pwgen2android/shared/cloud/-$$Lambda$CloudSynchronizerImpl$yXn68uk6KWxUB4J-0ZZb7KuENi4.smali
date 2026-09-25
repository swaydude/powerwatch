.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$yXn68uk6KWxUB4J-0ZZb7KuENi4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$yXn68uk6KWxUB4J-0ZZb7KuENi4;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$yXn68uk6KWxUB4J-0ZZb7KuENi4;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->lambda$yXn68uk6KWxUB4J-0ZZb7KuENi4(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;)V

    return-void
.end method
