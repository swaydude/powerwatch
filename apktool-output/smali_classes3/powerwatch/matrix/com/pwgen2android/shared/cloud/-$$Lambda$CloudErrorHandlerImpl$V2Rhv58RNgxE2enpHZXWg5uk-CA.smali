.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$V2Rhv58RNgxE2enpHZXWg5uk-CA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$V2Rhv58RNgxE2enpHZXWg5uk-CA;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$V2Rhv58RNgxE2enpHZXWg5uk-CA;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->lambda$V2Rhv58RNgxE2enpHZXWg5uk-CA(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
