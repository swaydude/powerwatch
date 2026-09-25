.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$gFNZJrPr9mIKXUFNd47aWyetOY4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$gFNZJrPr9mIKXUFNd47aWyetOY4;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$gFNZJrPr9mIKXUFNd47aWyetOY4;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$gFNZJrPr9mIKXUFNd47aWyetOY4;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$gFNZJrPr9mIKXUFNd47aWyetOY4;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->lambda$gFNZJrPr9mIKXUFNd47aWyetOY4(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
