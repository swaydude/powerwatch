.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;
.super Ljava/lang/Object;
.source "PWLoggerInput.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0001H&J$\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0018\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0001H&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0001H&J$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;",
        "",
        "addLog",
        "",
        "pwLog",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;",
        "debug",
        "message",
        "",
        "tag",
        "error",
        "",
        "info",
        "warn",
        "wtfError",
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
.method public abstract addLog(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;)V
.end method

.method public abstract debug(Ljava/lang/String;Ljava/lang/Object;)V
.end method

.method public abstract error(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V
.end method

.method public abstract info(Ljava/lang/String;Ljava/lang/Object;)V
.end method

.method public abstract warn(Ljava/lang/String;Ljava/lang/Object;)V
.end method

.method public abstract wtfError(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V
.end method
