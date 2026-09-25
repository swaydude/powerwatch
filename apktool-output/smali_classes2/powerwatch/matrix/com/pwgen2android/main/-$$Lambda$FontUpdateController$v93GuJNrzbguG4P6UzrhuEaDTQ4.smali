.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$v93GuJNrzbguG4P6UzrhuEaDTQ4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$v93GuJNrzbguG4P6UzrhuEaDTQ4;->f$0:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FontUpdateController$v93GuJNrzbguG4P6UzrhuEaDTQ4;->f$0:Ljava/util/Map;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/FontUpdateController;->lambda$v93GuJNrzbguG4P6UzrhuEaDTQ4(Ljava/util/Map;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;

    move-result-object p1

    return-object p1
.end method
