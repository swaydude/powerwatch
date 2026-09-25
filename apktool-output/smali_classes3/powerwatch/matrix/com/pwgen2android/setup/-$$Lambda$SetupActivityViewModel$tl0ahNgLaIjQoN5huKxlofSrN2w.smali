.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/setup/-$$Lambda$SetupActivityViewModel$tl0ahNgLaIjQoN5huKxlofSrN2w;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Landroidx/fragment/app/FragmentManager;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/FragmentManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/-$$Lambda$SetupActivityViewModel$tl0ahNgLaIjQoN5huKxlofSrN2w;->f$0:Landroidx/fragment/app/FragmentManager;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/-$$Lambda$SetupActivityViewModel$tl0ahNgLaIjQoN5huKxlofSrN2w;->f$0:Landroidx/fragment/app/FragmentManager;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/SetupActivityViewModel;->lambda$tl0ahNgLaIjQoN5huKxlofSrN2w(Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V

    return-void
.end method
