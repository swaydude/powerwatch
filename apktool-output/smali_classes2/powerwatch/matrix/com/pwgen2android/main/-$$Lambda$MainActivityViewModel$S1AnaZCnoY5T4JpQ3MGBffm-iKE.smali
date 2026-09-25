.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$S1AnaZCnoY5T4JpQ3MGBffm-iKE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(ZLandroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$S1AnaZCnoY5T4JpQ3MGBffm-iKE;->f$0:Z

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$S1AnaZCnoY5T4JpQ3MGBffm-iKE;->f$1:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$S1AnaZCnoY5T4JpQ3MGBffm-iKE;->f$0:Z

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$S1AnaZCnoY5T4JpQ3MGBffm-iKE;->f$1:Landroid/app/Activity;

    check-cast p1, Ljava/lang/Long;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->lambda$S1AnaZCnoY5T4JpQ3MGBffm-iKE(ZLandroid/app/Activity;Ljava/lang/Long;)V

    return-void
.end method
