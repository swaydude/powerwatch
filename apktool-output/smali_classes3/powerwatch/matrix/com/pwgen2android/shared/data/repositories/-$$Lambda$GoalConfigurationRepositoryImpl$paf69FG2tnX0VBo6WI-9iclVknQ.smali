.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$GoalConfigurationRepositoryImpl$paf69FG2tnX0VBo6WI-9iclVknQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$GoalConfigurationRepositoryImpl$paf69FG2tnX0VBo6WI-9iclVknQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$GoalConfigurationRepositoryImpl$paf69FG2tnX0VBo6WI-9iclVknQ;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$GoalConfigurationRepositoryImpl$paf69FG2tnX0VBo6WI-9iclVknQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$GoalConfigurationRepositoryImpl$paf69FG2tnX0VBo6WI-9iclVknQ;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;->lambda$paf69FG2tnX0VBo6WI-9iclVknQ(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
