.class public final Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "PermissionInfoRecyclerAdapter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B2\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012#\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\u000c\u0008\u0007\u0012\u0008\u0008\u0008\u0012\u0004\u0008\u0008(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u000bR\u0019\u0010\u000c\u001a\n \u000e*\u0004\u0018\u00010\r0\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\n \u000e*\u0004\u0018\u00010\u00160\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0014\u00a8\u0006\u001b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;",
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
        "checked",
        "Landroidx/appcompat/widget/AppCompatCheckBox;",
        "kotlin.jvm.PlatformType",
        "getChecked",
        "()Landroidx/appcompat/widget/AppCompatCheckBox;",
        "description",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;",
        "getDescription",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;",
        "icon",
        "Landroid/widget/ImageView;",
        "getIcon",
        "()Landroid/widget/ImageView;",
        "title",
        "getTitle",
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
.field private final checked:Landroidx/appcompat/widget/AppCompatCheckBox;

.field private final description:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

.field private final icon:Landroid/widget/ImageView;

.field private final title:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;


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

    .line 46
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 47
    sget v0, Lpowerwatch/matrix/com/pwgen2android/R$id;->permission_item_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;->title:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 48
    sget v0, Lpowerwatch/matrix/com/pwgen2android/R$id;->permission_item_description:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;->description:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    .line 49
    sget v0, Lpowerwatch/matrix/com/pwgen2android/R$id;->permission_item_icon:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;->icon:Landroid/widget/ImageView;

    .line 50
    sget v0, Lpowerwatch/matrix/com/pwgen2android/R$id;->permission_item_checkbox:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/AppCompatCheckBox;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;->checked:Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 53
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/-$$Lambda$PermissionInfoItemViewHolder$UkU_VOoxNYDiE2tzT7-_rSZ3i6c;

    invoke-direct {v0, p2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/-$$Lambda$PermissionInfoItemViewHolder$UkU_VOoxNYDiE2tzT7-_rSZ3i6c;-><init>(Lkotlin/jvm/functions/Function1;Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;)V

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/AppCompatCheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final _init_$lambda-0(Lkotlin/jvm/functions/Function1;Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;Landroid/view/View;)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;->getAdapterPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public static synthetic lambda$UkU_VOoxNYDiE2tzT7-_rSZ3i6c(Lkotlin/jvm/functions/Function1;Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;->_init_$lambda-0(Lkotlin/jvm/functions/Function1;Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final getChecked()Landroidx/appcompat/widget/AppCompatCheckBox;
    .locals 1

    .line 50
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;->checked:Landroidx/appcompat/widget/AppCompatCheckBox;

    return-object v0
.end method

.method public final getDescription()Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;
    .locals 1

    .line 48
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;->description:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    return-object v0
.end method

.method public final getIcon()Landroid/widget/ImageView;
    .locals 1

    .line 49
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;->icon:Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getTitle()Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;
    .locals 1

    .line 47
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoItemViewHolder;->title:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;

    return-object v0
.end method
