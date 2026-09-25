.class public final Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;
.super Ljava/lang/Object;
.source "ToolbarViewExtensions.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\r\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004\u001a\u0012\u0010\u000b\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u000c\u001a\u00020\r\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008\u001a\u0012\u0010\u000f\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008\u001a\n\u0010\u0010\u001a\u00020\u0001*\u00020\u0006\u001a\u0012\u0010\u0011\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u0012\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000c\u001a\u00020\r\u001a\n\u0010\u0015\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u0016\u001a\u00020\u0001*\u00020\u0006\u001a\u0014\u0010\u0017\u001a\u00020\u0001*\u00020\u00062\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0013\u001a\n\u0010\u0019\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u001a\u001a\u00020\u0001*\u00020\u0006\u001a\u0012\u0010\u001b\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008\u001a\u0012\u0010\u001c\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004\u001a\u0012\u0010\u001e\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u000c\u001a\u00020\r\u001a\u0012\u0010\u001f\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u001f\u001a\u00020\r\u00a8\u0006 "
    }
    d2 = {
        "backButtonBackground",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;",
        "resource",
        "",
        "backButtonClickListener",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;",
        "listener",
        "Landroid/view/View$OnClickListener;",
        "backButtonDrawable",
        "drawableId",
        "backButtonText",
        "text",
        "",
        "backButtonTextClickListener",
        "calendarClickListener",
        "changeBackButtonToCalendar",
        "displayCalendarIcon",
        "displayIcon",
        "",
        "enableBackButtonWithText",
        "hideBackButton",
        "hideRightButton",
        "removeBackButtonDrawable",
        "gone",
        "removeBackground",
        "resetRightButtonState",
        "rightButtonClickListener",
        "rightButtonIcon",
        "icon",
        "rightButtonText",
        "title",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final backButtonBackground(Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;I)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f080081

    .line 127
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    .line 128
    invoke-virtual {p0, p1}, Landroid/widget/Button;->setBackgroundResource(I)V

    return-void
.end method

.method public static final backButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f080081

    .line 110
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    .line 111
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static final backButtonDrawable(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;I)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f080081

    .line 21
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 22
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setBackgroundResource(I)V

    return-void
.end method

.method public static final backButtonText(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f080083

    .line 38
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    .line 39
    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static final backButtonTextClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f080083

    .line 68
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    .line 69
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static final calendarClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f08009e

    .line 54
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    .line 55
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static final changeBackButtonToCalendar(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f080081

    .line 60
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    const v0, 0x7f0c0005

    .line 61
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 62
    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v2, 0x7f0500ea

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    check-cast v0, Landroid/graphics/ColorFilter;

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public static final displayCalendarIcon(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Z)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f08009e

    .line 44
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    .line 46
    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v3, 0x7f0500ea

    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2, v3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    check-cast v1, Landroid/graphics/ColorFilter;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_0
    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eqz p1, :cond_1

    const/4 v3, 0x0

    goto :goto_0

    :cond_1
    const/16 v3, 0x8

    .line 48
    :goto_0
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    const v0, 0x7f080083

    .line 50
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    if-eqz p1, :cond_2

    const/16 v1, 0x8

    :cond_2
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public static final enableBackButtonWithText(Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;Ljava/lang/String;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f080082

    .line 133
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    .line 134
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    const v0, 0x7f080085

    .line 136
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    .line 137
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    const v0, 0x7f080084

    .line 139
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    .line 140
    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static final hideBackButton(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f080083

    .line 89
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/4 v1, 0x4

    .line 90
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    const v0, 0x7f080081

    .line 92
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    .line 93
    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public static final hideRightButton(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0801d7

    .line 98
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    const/4 v0, 0x4

    .line 99
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public static final removeBackButtonDrawable(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Z)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f080081

    .line 27
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatImageView;

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    .line 29
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setVisibility(I)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 31
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void
.end method

.method public static synthetic removeBackButtonDrawable$default(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;ZILjava/lang/Object;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    .line 26
    :cond_0
    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->removeBackButtonDrawable(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Z)V

    return-void
.end method

.method public static final removeBackground(Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 123
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;->setBackgroundResource(I)V

    return-void
.end method

.method public static final resetRightButtonState(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0801fe

    .line 82
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    const v0, 0x7f0700d0

    .line 83
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    const/16 v0, 0x8

    .line 84
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public static final rightButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0801d7

    .line 116
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    .line 117
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static final rightButtonIcon(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;I)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0801fe

    .line 74
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 75
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 76
    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result p1

    const/16 v1, 0x8

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_0
    const p1, 0x7f0801d7

    .line 78
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    const-string p1, ""

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static final rightButtonText(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0801d7

    .line 104
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    .line 105
    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static final title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f080262

    .line 15
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    .line 16
    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
