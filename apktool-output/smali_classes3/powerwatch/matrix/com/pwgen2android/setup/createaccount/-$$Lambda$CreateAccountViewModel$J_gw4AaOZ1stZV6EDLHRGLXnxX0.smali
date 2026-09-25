.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/-$$Lambda$CreateAccountViewModel$J_gw4AaOZ1stZV6EDLHRGLXnxX0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Action;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/-$$Lambda$CreateAccountViewModel$J_gw4AaOZ1stZV6EDLHRGLXnxX0;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/-$$Lambda$CreateAccountViewModel$J_gw4AaOZ1stZV6EDLHRGLXnxX0;->f$1:Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/-$$Lambda$CreateAccountViewModel$J_gw4AaOZ1stZV6EDLHRGLXnxX0;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/-$$Lambda$CreateAccountViewModel$J_gw4AaOZ1stZV6EDLHRGLXnxX0;->f$1:Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->lambda$J_gw4AaOZ1stZV6EDLHRGLXnxX0(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;)V

    return-void
.end method
