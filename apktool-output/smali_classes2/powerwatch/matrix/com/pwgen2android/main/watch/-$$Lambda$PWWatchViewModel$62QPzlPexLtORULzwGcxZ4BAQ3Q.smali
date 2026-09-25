.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$62QPzlPexLtORULzwGcxZ4BAQ3Q;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$62QPzlPexLtORULzwGcxZ4BAQ3Q;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$62QPzlPexLtORULzwGcxZ4BAQ3Q;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->lambda$62QPzlPexLtORULzwGcxZ4BAQ3Q(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
