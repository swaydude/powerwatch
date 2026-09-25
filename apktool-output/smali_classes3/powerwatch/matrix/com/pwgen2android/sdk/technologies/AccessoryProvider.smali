.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;
.super Ljava/lang/Object;
.source "Technology.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H&J\u0010\u0010\u000c\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH&J\u0008\u0010\r\u001a\u00020\u0008H&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;",
        "",
        "accessoryChange",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;",
        "getAccessoryChange",
        "()Lio/reactivex/Observable;",
        "add",
        "",
        "accessoryID",
        "",
        "accessory",
        "clear",
        "clearAll",
        "contains",
        "",
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


# virtual methods
.method public abstract add(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V
.end method

.method public abstract clear(Ljava/lang/String;)V
.end method

.method public abstract clearAll()V
.end method

.method public abstract contains(Ljava/lang/String;)Z
.end method

.method public abstract getAccessoryChange()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;",
            ">;"
        }
    .end annotation
.end method
