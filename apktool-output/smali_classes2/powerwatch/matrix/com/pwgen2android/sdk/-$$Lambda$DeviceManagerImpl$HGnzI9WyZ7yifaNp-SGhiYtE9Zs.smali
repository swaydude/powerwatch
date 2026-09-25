.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$HGnzI9WyZ7yifaNp-SGhiYtE9Zs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$HGnzI9WyZ7yifaNp-SGhiYtE9Zs;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$HGnzI9WyZ7yifaNp-SGhiYtE9Zs;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$HGnzI9WyZ7yifaNp-SGhiYtE9Zs;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$HGnzI9WyZ7yifaNp-SGhiYtE9Zs;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->lambda$HGnzI9WyZ7yifaNp-SGhiYtE9Zs(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
