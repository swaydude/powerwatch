.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$MockProvider$N2vB96qz5S1pLrsB9_2YekdyI4E;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$MockProvider$N2vB96qz5S1pLrsB9_2YekdyI4E;->f$0:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$MockProvider$N2vB96qz5S1pLrsB9_2YekdyI4E;->f$0:Ljava/lang/Integer;

    check-cast p1, Ljava/lang/Long;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/MockProvider;->lambda$N2vB96qz5S1pLrsB9_2YekdyI4E(Ljava/lang/Integer;Ljava/lang/Long;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    move-result-object p1

    return-object p1
.end method
