.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$uLA_hMNZQv4JtoH-0OyoICSUUVE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;

.field public final synthetic f$1:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$uLA_hMNZQv4JtoH-0OyoICSUUVE;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$uLA_hMNZQv4JtoH-0OyoICSUUVE;->f$1:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$uLA_hMNZQv4JtoH-0OyoICSUUVE;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudErrorHandlerImpl$uLA_hMNZQv4JtoH-0OyoICSUUVE;->f$1:Ljava/lang/Throwable;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;->lambda$uLA_hMNZQv4JtoH-0OyoICSUUVE(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    return-void
.end method
