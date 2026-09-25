.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$YE9tdqElS3H82qYlNt0QZHQeGSs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$YE9tdqElS3H82qYlNt0QZHQeGSs;->f$0:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$YE9tdqElS3H82qYlNt0QZHQeGSs;->f$0:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;

    check-cast p1, Lkotlin/Pair;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->lambda$YE9tdqElS3H82qYlNt0QZHQeGSs(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
