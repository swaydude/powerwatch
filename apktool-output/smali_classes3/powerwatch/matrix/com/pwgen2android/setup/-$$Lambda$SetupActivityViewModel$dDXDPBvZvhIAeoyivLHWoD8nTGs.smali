.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/setup/-$$Lambda$SetupActivityViewModel$dDXDPBvZvhIAeoyivLHWoD8nTGs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Landroidx/fragment/app/FragmentManager;

.field public final synthetic f$1:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/FragmentManager;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/-$$Lambda$SetupActivityViewModel$dDXDPBvZvhIAeoyivLHWoD8nTGs;->f$0:Landroidx/fragment/app/FragmentManager;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/-$$Lambda$SetupActivityViewModel$dDXDPBvZvhIAeoyivLHWoD8nTGs;->f$1:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/-$$Lambda$SetupActivityViewModel$dDXDPBvZvhIAeoyivLHWoD8nTGs;->f$0:Landroidx/fragment/app/FragmentManager;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/-$$Lambda$SetupActivityViewModel$dDXDPBvZvhIAeoyivLHWoD8nTGs;->f$1:Landroid/content/Intent;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/SetupActivityViewModel;->lambda$dDXDPBvZvhIAeoyivLHWoD8nTGs(Landroidx/fragment/app/FragmentManager;Landroid/content/Intent;Ljava/lang/Throwable;)V

    return-void
.end method
