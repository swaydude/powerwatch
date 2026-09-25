.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;
.super Ljava/lang/Object;
.source "TraceLogger.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000c"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;",
        "",
        "createFile",
        "",
        "logDataType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;",
        "deleteFile",
        "getStoredLogs",
        "Ljava/io/File;",
        "log",
        "data",
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
.method public abstract createFile(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)V
.end method

.method public abstract deleteFile(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)V
.end method

.method public abstract getStoredLogs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)Ljava/io/File;
.end method

.method public abstract log(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)V
.end method
