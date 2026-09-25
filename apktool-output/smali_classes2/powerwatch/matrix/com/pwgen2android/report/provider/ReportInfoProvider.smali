.class public final Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;
.super Ljava/lang/Object;
.source "ReportInfoProvider.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u0014\u0010\r\u001a\u00020\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;",
        "",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "hostInfoProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;",
        "deviceRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "tokenProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;",
        "httpConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;",
        "(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;)V",
        "loadCountryCode",
        "",
        "context",
        "Landroid/content/Context;",
        "provideUserEnvironment",
        "Lio/reactivex/Maybe;",
        "Lpowerwatch/matrix/com/pwgen2android/report/model/UserEnvironment;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

.field private final hostInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;

.field private final httpConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;

.field private final tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

.field private final userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;)V
    .locals 1

    const-string v0, "userPrefsUtils"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hostInfoProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tokenProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "httpConfig"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    .line 21
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;->hostInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;

    .line 22
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    .line 23
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;->tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

    .line 24
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;->httpConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;

    return-void
.end method

.method public static synthetic lambda$6c7JLNyhexjVcoIBQ13XUDvC5aw(Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;)Lpowerwatch/matrix/com/pwgen2android/report/model/UserEnvironment;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;->provideUserEnvironment$lambda-1$lambda-0(Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;)Lpowerwatch/matrix/com/pwgen2android/report/model/UserEnvironment;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$7SA5KDT7sXq3rNxXTZkpD-0mK08(Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;->provideUserEnvironment$lambda-1(Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method private final loadCountryCode(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    const-string v0, "getDefault().id"

    if-nez p1, :cond_0

    .line 27
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    const-string v1, "phone"

    .line 28
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type android.telephony.TelephonyManager"

    invoke-static {p1, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Landroid/telephony/TelephonyManager;

    .line 29
    invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;

    move-result-object p1

    .line 32
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method static synthetic loadCountryCode$default(Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;Landroid/content/Context;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 26
    :cond_0
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;->loadCountryCode(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final provideUserEnvironment$lambda-1(Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/ObservableSource;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->userPrefs()Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    .line 43
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;->tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->get()Lio/reactivex/Observable;

    move-result-object v1

    check-cast v1, Lio/reactivex/ObservableSource;

    .line 44
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/report/provider/-$$Lambda$ReportInfoProvider$6c7JLNyhexjVcoIBQ13XUDvC5aw;

    invoke-direct {v2, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/report/provider/-$$Lambda$ReportInfoProvider$6c7JLNyhexjVcoIBQ13XUDvC5aw;-><init>(Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V

    .line 41
    invoke-static {v0, v1, v2}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final provideUserEnvironment$lambda-1$lambda-0(Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;)Lpowerwatch/matrix/com/pwgen2android/report/model/UserEnvironment;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userPrefs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "token"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/report/model/UserEnvironment;

    .line 47
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getEmail()Ljava/lang/String;

    move-result-object v2

    .line 48
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;->hostInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;

    const/4 v3, 0x0

    invoke-interface {v1, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;->hostInfo(Z)Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;->getUuid()Ljava/lang/String;

    move-result-object v3

    .line 49
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getAccountSettings()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;->getLanguage()Ljava/lang/String;

    move-result-object v4

    .line 50
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object v5

    const/4 p1, 0x0

    .line 51
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;->loadCountryCode(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 52
    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/Optional;->getElement()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    const-string p2, "null"

    if-nez p1, :cond_0

    :goto_0
    move-object v7, p2

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getAccessToken()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v7, p1

    .line 53
    :goto_1
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;->httpConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;->getBaseURL()Ljava/lang/String;

    move-result-object v8

    move-object v1, v0

    .line 46
    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/report/model/UserEnvironment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final provideUserEnvironment()Lio/reactivex/Maybe;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Maybe<",
            "Lpowerwatch/matrix/com/pwgen2android/report/model/UserEnvironment;",
            ">;"
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    .line 38
    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;->defaultDevice()Lio/reactivex/Single;

    move-result-object v0

    .line 39
    invoke-virtual {v0}, Lio/reactivex/Single;->toMaybe()Lio/reactivex/Maybe;

    move-result-object v0

    .line 40
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/report/provider/-$$Lambda$ReportInfoProvider$7SA5KDT7sXq3rNxXTZkpD-0mK08;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/report/provider/-$$Lambda$ReportInfoProvider$7SA5KDT7sXq3rNxXTZkpD-0mK08;-><init>(Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Maybe;->flatMapObservable(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 57
    invoke-virtual {v0}, Lio/reactivex/Observable;->firstElement()Lio/reactivex/Maybe;

    move-result-object v0

    const-string v1, "deviceRepository\n                .defaultDevice()\n                .toMaybe()\n                .flatMapObservable {device ->\n                    Observable.combineLatest(\n                            userPrefsUtils.userPrefs(),\n                            tokenProvider.get(), BiFunction <User, Optional<PasswordCredentials>, UserEnvironment>\n                    { userPrefs, token ->\n\n                        UserEnvironment(\n                                userPrefs.email,\n                                hostInfoProvider.hostInfo(false).uuid,\n                                userPrefs.accountSettings.language,\n                                device.bluetoothAddress,\n                                loadCountryCode(null),\n                                token.element?.accessToken ?: \"null\",\n                                httpConfig.baseURL\n                        )\n                    })\n                }\n                .firstElement()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
