.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$Mi0TyWDWhuxcvRoRNaBGINQ1D6U;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$Mi0TyWDWhuxcvRoRNaBGINQ1D6U;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$Mi0TyWDWhuxcvRoRNaBGINQ1D6U;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$Mi0TyWDWhuxcvRoRNaBGINQ1D6U;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$Mi0TyWDWhuxcvRoRNaBGINQ1D6U;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$Mi0TyWDWhuxcvRoRNaBGINQ1D6U;

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

    check-cast p1, Lio/reactivex/Observable;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->lambda$Mi0TyWDWhuxcvRoRNaBGINQ1D6U(Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
