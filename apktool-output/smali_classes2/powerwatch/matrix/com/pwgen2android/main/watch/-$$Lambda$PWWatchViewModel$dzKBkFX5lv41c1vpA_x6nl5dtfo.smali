.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$dzKBkFX5lv41c1vpA_x6nl5dtfo;
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

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$dzKBkFX5lv41c1vpA_x6nl5dtfo;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$PWWatchViewModel$dzKBkFX5lv41c1vpA_x6nl5dtfo;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->lambda$dzKBkFX5lv41c1vpA_x6nl5dtfo(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;Ljava/lang/Boolean;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
