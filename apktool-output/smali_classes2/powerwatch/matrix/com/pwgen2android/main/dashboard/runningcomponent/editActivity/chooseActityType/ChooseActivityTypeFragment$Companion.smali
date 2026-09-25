.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseActivityTypeFragment$Companion;
.super Ljava/lang/Object;
.source "ChooseActivityTypeFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseActivityTypeFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0008j\u0008\u0012\u0004\u0012\u00020\t`\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseActivityTypeFragment$Companion;",
        "",
        "()V",
        "ACTIVITY_TYPES_DATA",
        "",
        "newInstance",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseActivityTypeFragment;",
        "activityTypes",
        "Ljava/util/ArrayList;",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/UIChooseItemView;",
        "Lkotlin/collections/ArrayList;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseActivityTypeFragment$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final newInstance(Ljava/util/ArrayList;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseActivityTypeFragment;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/UIChooseItemView;",
            ">;)",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseActivityTypeFragment;"
        }
    .end annotation

    const-string v0, "activityTypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseActivityTypeFragment;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseActivityTypeFragment;-><init>()V

    .line 74
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 75
    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 76
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 74
    invoke-virtual {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseActivityTypeFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v1
.end method
