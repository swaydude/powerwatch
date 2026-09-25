.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$R6z-TUx1WxflLnpR3LqNjpVwf_c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$R6z-TUx1WxflLnpR3LqNjpVwf_c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$R6z-TUx1WxflLnpR3LqNjpVwf_c;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$R6z-TUx1WxflLnpR3LqNjpVwf_c;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$R6z-TUx1WxflLnpR3LqNjpVwf_c;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$SettingsDataProvider$R6z-TUx1WxflLnpR3LqNjpVwf_c;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;->lambda$R6z-TUx1WxflLnpR3LqNjpVwf_c(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V

    return-void
.end method
