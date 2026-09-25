.class public final Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "NotificationsRecyclerViewAdapter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        "itemView",
        "Landroid/view/View;",
        "viewType",
        "",
        "(Landroid/view/View;I)V",
        "appName",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;",
        "getAppName",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;",
        "setAppName",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;)V",
        "appToggle",
        "Landroidx/appcompat/widget/SwitchCompat;",
        "getAppToggle",
        "()Landroidx/appcompat/widget/SwitchCompat;",
        "setAppToggle",
        "(Landroidx/appcompat/widget/SwitchCompat;)V",
        "arrow",
        "Landroid/widget/ImageView;",
        "getArrow",
        "()Landroid/widget/ImageView;",
        "setArrow",
        "(Landroid/widget/ImageView;)V",
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
.field private appName:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field public appToggle:Landroidx/appcompat/widget/SwitchCompat;

.field private arrow:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/view/View;I)V
    .locals 2

    const-string v0, "itemView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 197
    sget v0, Lpowerwatch/matrix/com/pwgen2android/R$id;->app_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    const-string v1, "itemView.app_name"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;->appName:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 203
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$SimpleItem;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$SimpleItem;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$SimpleItem;->getType()I

    move-result v0

    if-eq p2, v0, :cond_0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;->getType()I

    move-result v0

    if-ne p2, v0, :cond_1

    .line 204
    :cond_0
    sget v0, Lpowerwatch/matrix/com/pwgen2android/R$id;->app_toggle:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/SwitchCompat;

    const-string v1, "itemView.app_toggle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;->setAppToggle(Landroidx/appcompat/widget/SwitchCompat;)V

    .line 206
    :cond_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$Header;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$Header;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$Header;->getType()I

    move-result v0

    if-ne p2, v0, :cond_2

    .line 207
    sget v0, Lpowerwatch/matrix/com/pwgen2android/R$id;->header_arrow:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;->arrow:Landroid/widget/ImageView;

    .line 209
    :cond_2
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/ItemType$HeaderWithAction;->getType()I

    move-result v0

    if-ne p2, v0, :cond_3

    .line 210
    sget p2, Lpowerwatch/matrix/com/pwgen2android/R$id;->header_arrow:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;->arrow:Landroid/widget/ImageView;

    :cond_3
    return-void
.end method


# virtual methods
.method public final getAppName()Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;
    .locals 1

    .line 197
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;->appName:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    return-object v0
.end method

.method public final getAppToggle()Landroidx/appcompat/widget/SwitchCompat;
    .locals 1

    .line 198
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;->appToggle:Landroidx/appcompat/widget/SwitchCompat;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "appToggle"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getArrow()Landroid/widget/ImageView;
    .locals 1

    .line 199
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;->arrow:Landroid/widget/ImageView;

    return-object v0
.end method

.method public final setAppName(Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;->appName:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    return-void
.end method

.method public final setAppToggle(Landroidx/appcompat/widget/SwitchCompat;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;->appToggle:Landroidx/appcompat/widget/SwitchCompat;

    return-void
.end method

.method public final setArrow(Landroid/widget/ImageView;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationViewHolder;->arrow:Landroid/widget/ImageView;

    return-void
.end method
