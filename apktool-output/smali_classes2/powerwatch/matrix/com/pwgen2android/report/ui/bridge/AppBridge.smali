.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge;
.super Ljava/lang/Object;
.source "AppBridge.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0008\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0006H&\u00a8\u0006\u000b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge;",
        "",
        "destroy",
        "",
        "messageOutput",
        "Lio/reactivex/Observable;",
        "",
        "sendMessage",
        "Lio/reactivex/Completable;",
        "data",
        "Companion",
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


# static fields
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge$Companion;

.field public static final INJECTED_VARIABLE:Ljava/lang/String; = "android"

.field public static final NATIVE_INTERFACE:Ljava/lang/String; = "androidWrapper"

.field public static final UI_INTERFACE:Ljava/lang/String; = "bridge"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge$Companion;->$$INSTANCE:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge$Companion;

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge;->Companion:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge$Companion;

    return-void
.end method


# virtual methods
.method public abstract destroy()V
.end method

.method public abstract messageOutput()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract sendMessage(Ljava/lang/String;)Lio/reactivex/Completable;
.end method
