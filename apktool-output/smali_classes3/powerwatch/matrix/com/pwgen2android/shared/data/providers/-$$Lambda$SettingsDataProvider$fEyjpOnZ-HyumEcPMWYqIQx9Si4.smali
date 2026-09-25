.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$fEyjpOnZ-HyumEcPMWYqIQx9Si4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;

.field public final synthetic f$1:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$fEyjpOnZ-HyumEcPMWYqIQx9Si4;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$fEyjpOnZ-HyumEcPMWYqIQx9Si4;->f$1:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$fEyjpOnZ-HyumEcPMWYqIQx9Si4;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$fEyjpOnZ-HyumEcPMWYqIQx9Si4;->f$1:Ljava/lang/String;

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->lambda$fEyjpOnZ-HyumEcPMWYqIQx9Si4(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Ljava/lang/String;)Lio/reactivex/ObservableSource;

    move-result-object v0

    return-object v0
.end method
