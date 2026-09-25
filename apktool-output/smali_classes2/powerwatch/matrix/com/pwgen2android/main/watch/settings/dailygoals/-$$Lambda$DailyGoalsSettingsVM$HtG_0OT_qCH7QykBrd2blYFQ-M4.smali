.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/-$$Lambda$DailyGoalsSettingsVM$HtG_0OT_qCH7QykBrd2blYFQ-M4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/-$$Lambda$DailyGoalsSettingsVM$HtG_0OT_qCH7QykBrd2blYFQ-M4;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/-$$Lambda$DailyGoalsSettingsVM$HtG_0OT_qCH7QykBrd2blYFQ-M4;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;->lambda$HtG_0OT_qCH7QykBrd2blYFQ-M4(Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)V

    return-void
.end method
