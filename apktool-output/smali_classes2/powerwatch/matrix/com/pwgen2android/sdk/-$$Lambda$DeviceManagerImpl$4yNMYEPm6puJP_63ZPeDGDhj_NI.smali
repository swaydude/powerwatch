.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$4yNMYEPm6puJP_63ZPeDGDhj_NI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$4yNMYEPm6puJP_63ZPeDGDhj_NI;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$4yNMYEPm6puJP_63ZPeDGDhj_NI;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$4yNMYEPm6puJP_63ZPeDGDhj_NI;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$4yNMYEPm6puJP_63ZPeDGDhj_NI;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$4yNMYEPm6puJP_63ZPeDGDhj_NI;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Ljava/lang/Integer;

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->lambda$4yNMYEPm6puJP_63ZPeDGDhj_NI(Ljava/lang/Throwable;Ljava/lang/Integer;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
