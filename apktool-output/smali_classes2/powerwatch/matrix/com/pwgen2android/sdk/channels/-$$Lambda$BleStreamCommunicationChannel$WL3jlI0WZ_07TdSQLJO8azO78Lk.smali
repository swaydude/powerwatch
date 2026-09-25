.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$WL3jlI0WZ_07TdSQLJO8azO78Lk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$WL3jlI0WZ_07TdSQLJO8azO78Lk;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$BleStreamCommunicationChannel$WL3jlI0WZ_07TdSQLJO8azO78Lk;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;

    check-cast p1, [B

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;->lambda$WL3jlI0WZ_07TdSQLJO8azO78Lk(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;[B)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
