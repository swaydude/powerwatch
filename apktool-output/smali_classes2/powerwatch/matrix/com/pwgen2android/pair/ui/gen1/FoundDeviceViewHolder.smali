.class public final Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/FoundDeviceViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "FoundDevicesRecyclerAdapter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\t\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\u0002\u0010\u000bR\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/FoundDeviceViewHolder;",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        "view",
        "Landroid/view/View;",
        "clickListener",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "position",
        "",
        "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V",
        "deviceName",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;",
        "getDeviceName",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;",
        "pairButton",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;",
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


# instance fields
.field private final deviceName:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final pairButton:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;


# direct methods
.method public constructor <init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clickListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 47
    sget v0, Lpowerwatch/matrix/com/pwgen2android/R$id;->device_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/FoundDeviceViewHolder;->deviceName:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 48
    sget v0, Lpowerwatch/matrix/com/pwgen2android/R$id;->pair_button:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/FoundDeviceViewHolder;->pairButton:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;

    .line 51
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$FoundDeviceViewHolder$S2BZb6GlIC45nGTrUw0TVnElM6g;

    invoke-direct {v0, p2, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$FoundDeviceViewHolder$S2BZb6GlIC45nGTrUw0TVnElM6g;-><init>(Lkotlin/jvm/functions/Function1;Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/FoundDeviceViewHolder;)V

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final _init_$lambda-0(Lkotlin/jvm/functions/Function1;Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/FoundDeviceViewHolder;Landroid/view/View;)V
    .locals 0

    const-string p2, "$clickListener"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "this$0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/FoundDeviceViewHolder;->getAdapterPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic lambda$S2BZb6GlIC45nGTrUw0TVnElM6g(Lkotlin/jvm/functions/Function1;Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/FoundDeviceViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/FoundDeviceViewHolder;->_init_$lambda-0(Lkotlin/jvm/functions/Function1;Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/FoundDeviceViewHolder;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final getDeviceName()Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;
    .locals 1

    .line 47
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/FoundDeviceViewHolder;->deviceName:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    return-object v0
.end method
