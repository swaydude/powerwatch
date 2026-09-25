.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$w6P_B-K0LZF8qLF7YxfC2WjOSlY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/CompletableOnSubscribe;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;

.field public final synthetic f$1:Ljava/util/UUID;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;Ljava/util/UUID;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$w6P_B-K0LZF8qLF7YxfC2WjOSlY;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$w6P_B-K0LZF8qLF7YxfC2WjOSlY;->f$1:Ljava/util/UUID;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/CompletableEmitter;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$w6P_B-K0LZF8qLF7YxfC2WjOSlY;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$w6P_B-K0LZF8qLF7YxfC2WjOSlY;->f$1:Ljava/util/UUID;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;->lambda$w6P_B-K0LZF8qLF7YxfC2WjOSlY(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;Ljava/util/UUID;Lio/reactivex/CompletableEmitter;)V

    return-void
.end method
