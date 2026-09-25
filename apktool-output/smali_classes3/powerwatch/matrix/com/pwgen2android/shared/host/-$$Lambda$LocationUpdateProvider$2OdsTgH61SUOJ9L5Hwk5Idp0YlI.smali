.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$2OdsTgH61SUOJ9L5Hwk5Idp0YlI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$2OdsTgH61SUOJ9L5Hwk5Idp0YlI;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$2OdsTgH61SUOJ9L5Hwk5Idp0YlI;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->lambda$2OdsTgH61SUOJ9L5Hwk5Idp0YlI(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
