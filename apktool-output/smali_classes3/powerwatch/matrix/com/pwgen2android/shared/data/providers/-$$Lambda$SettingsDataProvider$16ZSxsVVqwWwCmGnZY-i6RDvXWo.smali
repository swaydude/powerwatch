.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$16ZSxsVVqwWwCmGnZY-i6RDvXWo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$16ZSxsVVqwWwCmGnZY-i6RDvXWo;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$16ZSxsVVqwWwCmGnZY-i6RDvXWo;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->lambda$16ZSxsVVqwWwCmGnZY-i6RDvXWo(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    move-result-object p1

    return-object p1
.end method
