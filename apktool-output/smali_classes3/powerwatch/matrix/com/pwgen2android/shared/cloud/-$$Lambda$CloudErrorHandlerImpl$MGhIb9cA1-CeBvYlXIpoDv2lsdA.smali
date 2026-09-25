.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$MGhIb9cA1-CeBvYlXIpoDv2lsdA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Ljava/lang/Throwable;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$MGhIb9cA1-CeBvYlXIpoDv2lsdA;->f$0:Ljava/lang/Throwable;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$MGhIb9cA1-CeBvYlXIpoDv2lsdA;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$MGhIb9cA1-CeBvYlXIpoDv2lsdA;->f$2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$MGhIb9cA1-CeBvYlXIpoDv2lsdA;->f$0:Ljava/lang/Throwable;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$MGhIb9cA1-CeBvYlXIpoDv2lsdA;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$MGhIb9cA1-CeBvYlXIpoDv2lsdA;->f$2:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;

    invoke-static {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->lambda$MGhIb9cA1-CeBvYlXIpoDv2lsdA(Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;)Lio/reactivex/SingleSource;

    move-result-object v0

    return-object v0
.end method
