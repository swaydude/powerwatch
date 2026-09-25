.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$yMdkwxE7pJAG_T__VG_9-u-0a7E;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$yMdkwxE7pJAG_T__VG_9-u-0a7E;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$yMdkwxE7pJAG_T__VG_9-u-0a7E;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->lambda$yMdkwxE7pJAG_T__VG_9-u-0a7E(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
