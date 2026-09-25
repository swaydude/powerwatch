.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$ReportIssueViewModel$80rD_uZixkvrk7X1F88h7ZSjiG0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$ReportIssueViewModel$80rD_uZixkvrk7X1F88h7ZSjiG0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$ReportIssueViewModel$80rD_uZixkvrk7X1F88h7ZSjiG0;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$ReportIssueViewModel$80rD_uZixkvrk7X1F88h7ZSjiG0;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$ReportIssueViewModel$80rD_uZixkvrk7X1F88h7ZSjiG0;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/-$$Lambda$ReportIssueViewModel$80rD_uZixkvrk7X1F88h7ZSjiG0;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadResponse;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueViewModel;->lambda$80rD_uZixkvrk7X1F88h7ZSjiG0(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadResponse;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
