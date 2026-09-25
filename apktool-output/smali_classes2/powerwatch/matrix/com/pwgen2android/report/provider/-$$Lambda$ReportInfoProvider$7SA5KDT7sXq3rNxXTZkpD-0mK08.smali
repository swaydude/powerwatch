.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/report/provider/-$$Lambda$ReportInfoProvider$7SA5KDT7sXq3rNxXTZkpD-0mK08;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/report/provider/-$$Lambda$ReportInfoProvider$7SA5KDT7sXq3rNxXTZkpD-0mK08;->f$0:Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/report/provider/-$$Lambda$ReportInfoProvider$7SA5KDT7sXq3rNxXTZkpD-0mK08;->f$0:Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;->lambda$7SA5KDT7sXq3rNxXTZkpD-0mK08(Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
