.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$RealTimeViewModel$m5ZnE_5OBnObst2ZpgkllyCvFV4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Ljava/util/Calendar;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Calendar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$RealTimeViewModel$m5ZnE_5OBnObst2ZpgkllyCvFV4;->f$0:Ljava/util/Calendar;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/-$$Lambda$RealTimeViewModel$m5ZnE_5OBnObst2ZpgkllyCvFV4;->f$0:Ljava/util/Calendar;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->lambda$m5ZnE_5OBnObst2ZpgkllyCvFV4(Ljava/util/Calendar;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
