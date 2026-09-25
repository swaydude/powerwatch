.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;
.super Ljava/lang/Object;
.source "TokenStorage.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0008\u0010\u0006\u001a\u00020\u0003H\'J\u0008\u0010\u0007\u001a\u00020\u0003H\'J\n\u0010\u0008\u001a\u0004\u0018\u00010\u0005H\'\u00a8\u0006\t"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;",
        "",
        "add",
        "",
        "passwordCredentials",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;",
        "delete",
        "deleteAll",
        "get",
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
.method public abstract add(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)V
.end method

.method public abstract delete()V
.end method

.method public abstract deleteAll()V
.end method

.method public abstract get()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;
.end method
