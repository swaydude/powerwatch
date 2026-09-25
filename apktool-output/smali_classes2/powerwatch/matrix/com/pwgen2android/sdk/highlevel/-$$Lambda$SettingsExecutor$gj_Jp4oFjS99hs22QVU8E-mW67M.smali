.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$SettingsExecutor$gj_Jp4oFjS99hs22QVU8E-mW67M;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;

.field public final synthetic f$2:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>([Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$SettingsExecutor$gj_Jp4oFjS99hs22QVU8E-mW67M;->f$0:[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$SettingsExecutor$gj_Jp4oFjS99hs22QVU8E-mW67M;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$SettingsExecutor$gj_Jp4oFjS99hs22QVU8E-mW67M;->f$2:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$SettingsExecutor$gj_Jp4oFjS99hs22QVU8E-mW67M;->f$0:[Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$SettingsExecutor$gj_Jp4oFjS99hs22QVU8E-mW67M;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/-$$Lambda$SettingsExecutor$gj_Jp4oFjS99hs22QVU8E-mW67M;->f$2:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;->lambda$gj_Jp4oFjS99hs22QVU8E-mW67M([Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsExecutor;Ljava/lang/String;)Lio/reactivex/CompletableSource;

    move-result-object v0

    return-object v0
.end method
