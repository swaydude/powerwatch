.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$ReportIssueViewModel$5ujJ3S83GUymuYml1yFYCEsdrJA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueViewModel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$ReportIssueViewModel$5ujJ3S83GUymuYml1yFYCEsdrJA;->f$0:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueViewModel;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$ReportIssueViewModel$5ujJ3S83GUymuYml1yFYCEsdrJA;->f$0:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueViewModel;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueViewModel;->lambda$5ujJ3S83GUymuYml1yFYCEsdrJA(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueViewModel;Ljava/util/List;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
