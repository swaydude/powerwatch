.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$RealTimeViewModel$ya6Fo_v72uOqrydQoAIIQXEbn-Y;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$RealTimeViewModel$ya6Fo_v72uOqrydQoAIIQXEbn-Y;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$RealTimeViewModel$ya6Fo_v72uOqrydQoAIIQXEbn-Y;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;

    check-cast p1, Lkotlin/Pair;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->lambda$ya6Fo_v72uOqrydQoAIIQXEbn-Y(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
