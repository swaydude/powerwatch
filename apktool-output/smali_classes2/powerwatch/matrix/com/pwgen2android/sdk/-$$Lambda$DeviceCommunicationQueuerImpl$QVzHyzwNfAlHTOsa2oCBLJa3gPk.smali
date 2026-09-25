.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$QVzHyzwNfAlHTOsa2oCBLJa3gPk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/ObservableOnSubscribe;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$QVzHyzwNfAlHTOsa2oCBLJa3gPk;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$QVzHyzwNfAlHTOsa2oCBLJa3gPk;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/ObservableEmitter;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$QVzHyzwNfAlHTOsa2oCBLJa3gPk;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$QVzHyzwNfAlHTOsa2oCBLJa3gPk;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->lambda$QVzHyzwNfAlHTOsa2oCBLJa3gPk(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;Lio/reactivex/ObservableEmitter;)V

    return-void
.end method
