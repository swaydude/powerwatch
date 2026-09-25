.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$O41941bYPn_IzgH4JYu9RgstWEk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;

.field public final synthetic f$1:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$O41941bYPn_IzgH4JYu9RgstWEk;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$O41941bYPn_IzgH4JYu9RgstWEk;->f$1:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$O41941bYPn_IzgH4JYu9RgstWEk;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$O41941bYPn_IzgH4JYu9RgstWEk;->f$1:Ljava/lang/String;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->lambda$O41941bYPn_IzgH4JYu9RgstWEk(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V

    return-void
.end method
