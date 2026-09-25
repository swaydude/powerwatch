.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;
.super Landroid/widget/Spinner;
.source "MultiSelectionSpinner.kt"

# interfaces
.implements Landroid/content/DialogInterface$OnMultiChoiceClickListener;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMultiSelectionSpinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiSelectionSpinner.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,197:1\n37#2,2:198\n*S KotlinDebug\n*F\n+ 1 MultiSelectionSpinner.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner\n*L\n117#1:198,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0015\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0017\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0008\u0010&\u001a\u00020\u0012H\u0002J \u0010\'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020,H\u0016J\u0008\u0010-\u001a\u00020,H\u0016J\u0010\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u000200H\u0016J\u0019\u00101\u001a\u00020\u000b2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\u0002\u00102J\u0014\u00101\u001a\u00020\u000b2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0015J\u0019\u00103\u001a\u00020\u000b2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\u0002\u00102J\u0010\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u0016H\u0016J\u000e\u00103\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u000205J\u0014\u00103\u001a\u00020\u000b2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0015R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0013R\u0017\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00158F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00158F\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u0018R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00120!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008#\u0010\u001b\"\u0004\u0008$\u0010%\u00a8\u00066"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;",
        "Landroid/widget/Spinner;",
        "Landroid/content/DialogInterface$OnMultiChoiceClickListener;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "closeSpinnerListener",
        "Lkotlin/Function0;",
        "",
        "getCloseSpinnerListener",
        "()Lkotlin/jvm/functions/Function0;",
        "setCloseSpinnerListener",
        "(Lkotlin/jvm/functions/Function0;)V",
        "items",
        "",
        "",
        "[Ljava/lang/String;",
        "selectedIndices",
        "",
        "",
        "getSelectedIndices",
        "()Ljava/util/List;",
        "selectedItemsAsString",
        "getSelectedItemsAsString",
        "()Ljava/lang/String;",
        "selectedStrings",
        "getSelectedStrings",
        "selection",
        "",
        "simpleAdapter",
        "Landroid/widget/ArrayAdapter;",
        "title",
        "getTitle",
        "setTitle",
        "(Ljava/lang/String;)V",
        "buildSelectedItemString",
        "onClick",
        "dialog",
        "Landroid/content/DialogInterface;",
        "which",
        "isChecked",
        "",
        "performClick",
        "setAdapter",
        "adapter",
        "Landroid/widget/SpinnerAdapter;",
        "setItems",
        "([Ljava/lang/String;)V",
        "setSelection",
        "index",
        "",
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
.field private closeSpinnerListener:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private items:[Ljava/lang/String;

.field private selection:[Z

.field private simpleAdapter:Landroid/widget/ArrayAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/widget/ArrayAdapter<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-direct {p0, p1}, Landroid/widget/Spinner;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/String;

    .line 14
    iput-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->items:[Ljava/lang/String;

    new-array v0, v0, [Z

    .line 15
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    const-string v0, ""

    .line 60
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->title:Ljava/lang/String;

    .line 64
    new-instance v0, Landroid/widget/ArrayAdapter;

    const v1, 0x1090008

    invoke-direct {v0, p1, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->simpleAdapter:Landroid/widget/ArrayAdapter;

    .line 66
    check-cast v0, Landroid/widget/SpinnerAdapter;

    invoke-super {p0, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    invoke-direct {p0, p1, p2}, Landroid/widget/Spinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    new-array v0, p2, [Ljava/lang/String;

    .line 14
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->items:[Ljava/lang/String;

    new-array p2, p2, [Z

    .line 15
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    const-string p2, ""

    .line 60
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->title:Ljava/lang/String;

    .line 71
    new-instance p2, Landroid/widget/ArrayAdapter;

    const v0, 0x1090008

    invoke-direct {p2, p1, v0}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->simpleAdapter:Landroid/widget/ArrayAdapter;

    .line 73
    check-cast p2, Landroid/widget/SpinnerAdapter;

    invoke-super {p0, p2}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    return-void
.end method

.method private final buildSelectedItemString()Ljava/lang/String;
    .locals 6

    .line 182
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->items:[Ljava/lang/String;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_3

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    add-int/lit8 v4, v2, 0x1

    .line 186
    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    aget-boolean v5, v5, v2

    if-eqz v5, :cond_1

    if-eqz v3, :cond_0

    const-string v3, ", "

    .line 188
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    :cond_0
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->items:[Ljava/lang/String;

    aget-object v2, v3, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x1

    const/4 v3, 0x1

    :cond_1
    if-le v4, v1, :cond_2

    goto :goto_1

    :cond_2
    move v2, v4

    goto :goto_0

    .line 195
    :cond_3
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sb.toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic lambda$jvoidrf2Pn52tw66KahZTDtV4bA(Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->performClick$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method private static final performClick$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;Landroid/content/DialogInterface;I)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->getCloseSpinnerListener()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :goto_0
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method public final getCloseSpinnerListener()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 20
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->closeSpinnerListener:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getSelectedIndices()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 35
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 36
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->items:[Ljava/lang/String;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_2

    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v3, v2, 0x1

    .line 37
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    aget-boolean v4, v4, v2

    if-eqz v4, :cond_0

    .line 38
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_0
    if-le v3, v1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    goto :goto_0

    .line 41
    :cond_2
    :goto_1
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getSelectedItemsAsString()Ljava/lang/String;
    .locals 6

    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->items:[Ljava/lang/String;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_3

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    add-int/lit8 v4, v2, 0x1

    .line 50
    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    aget-boolean v5, v5, v2

    if-eqz v5, :cond_1

    if-eqz v3, :cond_0

    const-string v3, ", "

    .line 52
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    :cond_0
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->items:[Ljava/lang/String;

    aget-object v2, v3, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x1

    const/4 v3, 0x1

    :cond_1
    if-le v4, v1, :cond_2

    goto :goto_1

    :cond_2
    move v2, v4

    goto :goto_0

    .line 58
    :cond_3
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sb.toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getSelectedStrings()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 24
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 25
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->items:[Ljava/lang/String;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_2

    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v3, v2, 0x1

    .line 26
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    aget-boolean v4, v4, v2

    if-eqz v4, :cond_0

    .line 27
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->items:[Ljava/lang/String;

    aget-object v2, v4, v2

    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_0
    if-le v3, v1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    goto :goto_0

    .line 30
    :cond_2
    :goto_1
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->title:Ljava/lang/String;

    return-object v0
.end method

.method public onClick(Landroid/content/DialogInterface;IZ)V
    .locals 1

    const-string v0, "dialog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    array-length v0, p1

    if-ge p2, v0, :cond_0

    .line 79
    aput-boolean p3, p1, p2

    .line 81
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->simpleAdapter:Landroid/widget/ArrayAdapter;

    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->clear()V

    .line 82
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->simpleAdapter:Landroid/widget/ArrayAdapter;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->buildSelectedItemString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    return-void

    .line 84
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Argument \'which\' is out of bounds."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public performClick()Z
    .locals 4

    .line 90
    new-instance v0, Landroidx/appcompat/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 91
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->items:[Ljava/lang/String;

    check-cast v1, [Ljava/lang/CharSequence;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    move-object v3, p0

    check-cast v3, Landroid/content/DialogInterface$OnMultiChoiceClickListener;

    invoke-virtual {v0, v1, v2, v3}, Landroidx/appcompat/app/AlertDialog$Builder;->setMultiChoiceItems([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    const/4 v1, 0x0

    .line 92
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setCancelable(Z)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 93
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->title:Ljava/lang/String;

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroidx/appcompat/app/AlertDialog$Builder;

    const-string v1, "Ok"

    .line 94
    check-cast v1, Ljava/lang/CharSequence;

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/-$$Lambda$MultiSelectionSpinner$jvoidrf2Pn52tw66KahZTDtV4bA;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/-$$Lambda$MultiSelectionSpinner$jvoidrf2Pn52tw66KahZTDtV4bA;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 99
    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog$Builder;->show()Landroidx/appcompat/app/AlertDialog;

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 0

    .line 13
    check-cast p1, Landroid/widget/SpinnerAdapter;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    return-void
.end method

.method public setAdapter(Landroid/widget/SpinnerAdapter;)V
    .locals 1

    const-string v0, "adapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "setAdapter is not supported by MultiSelectSpinner."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setCloseSpinnerListener(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 20
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->closeSpinnerListener:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public final setItems(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    check-cast p1, Ljava/util/Collection;

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/String;

    .line 199
    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-static {p1, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, [Ljava/lang/String;

    .line 117
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->items:[Ljava/lang/String;

    .line 118
    array-length p1, p1

    new-array p1, p1, [Z

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    .line 119
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->simpleAdapter:Landroid/widget/ArrayAdapter;

    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->clear()V

    .line 120
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->items:[Ljava/lang/String;

    array-length v1, p1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    .line 121
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->simpleAdapter:Landroid/widget/ArrayAdapter;

    invoke-static {p1}, Lkotlin/collections/ArraysKt;->first([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    .line 122
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    invoke-static {p1, v0}, Ljava/util/Arrays;->fill([ZZ)V

    :cond_1
    return-void
.end method

.method public final setItems([Ljava/lang/String;)V
    .locals 2

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->items:[Ljava/lang/String;

    .line 110
    array-length p1, p1

    new-array p1, p1, [Z

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    .line 111
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->simpleAdapter:Landroid/widget/ArrayAdapter;

    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->clear()V

    .line 112
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->simpleAdapter:Landroid/widget/ArrayAdapter;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->items:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    .line 113
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    invoke-static {p1, v1}, Ljava/util/Arrays;->fill([ZZ)V

    return-void
.end method

.method public setSelection(I)V
    .locals 5

    .line 152
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v3, v2, 0x1

    .line 153
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    aput-boolean v1, v4, v2

    if-le v3, v0, :cond_0

    goto :goto_1

    :cond_0
    move v2, v3

    goto :goto_0

    :cond_1
    :goto_1
    if-ltz p1, :cond_2

    .line 155
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    array-length v1, v0

    if-ge p1, v1, :cond_2

    const/4 v1, 0x1

    .line 156
    aput-boolean v1, v0, p1

    .line 161
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->simpleAdapter:Landroid/widget/ArrayAdapter;

    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->clear()V

    .line 162
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->simpleAdapter:Landroid/widget/ArrayAdapter;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->buildSelectedItemString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    return-void

    .line 158
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is out of bounds."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final setSelection(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "selection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    if-ltz v0, :cond_1

    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v3, v2, 0x1

    .line 138
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    aput-boolean v1, v4, v2

    if-le v3, v0, :cond_0

    goto :goto_1

    :cond_0
    move v2, v3

    goto :goto_0

    .line 140
    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 141
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->items:[Ljava/lang/String;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_2

    const/4 v3, 0x0

    :goto_3
    add-int/lit8 v4, v3, 0x1

    .line 142
    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->items:[Ljava/lang/String;

    aget-object v5, v5, v3

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 143
    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    const/4 v6, 0x1

    aput-boolean v6, v5, v3

    :cond_3
    if-le v4, v2, :cond_4

    goto :goto_2

    :cond_4
    move v3, v4

    goto :goto_3

    .line 147
    :cond_5
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->simpleAdapter:Landroid/widget/ArrayAdapter;

    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->clear()V

    .line 148
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->simpleAdapter:Landroid/widget/ArrayAdapter;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->buildSelectedItemString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    return-void
.end method

.method public final setSelection([I)V
    .locals 5

    const-string v0, "selectedIndices"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    if-ltz v0, :cond_1

    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v3, v2, 0x1

    .line 167
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    aput-boolean v1, v4, v2

    if-le v3, v0, :cond_0

    goto :goto_1

    :cond_0
    move v2, v3

    goto :goto_0

    .line 169
    :cond_1
    :goto_1
    array-length v0, p1

    :goto_2
    if-ge v1, v0, :cond_3

    aget v2, p1, v1

    add-int/lit8 v1, v1, 0x1

    if-ltz v2, :cond_2

    .line 170
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    array-length v4, v3

    if-ge v2, v4, :cond_2

    const/4 v4, 0x1

    .line 171
    aput-boolean v4, v3, v2

    goto :goto_2

    .line 173
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " is out of bounds."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 177
    :cond_3
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->simpleAdapter:Landroid/widget/ArrayAdapter;

    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->clear()V

    .line 178
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->simpleAdapter:Landroid/widget/ArrayAdapter;

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->buildSelectedItemString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    return-void
.end method

.method public final setSelection([Ljava/lang/String;)V
    .locals 9

    const-string v0, "selection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    :goto_0
    if-ge v2, v0, :cond_3

    aget-object v3, p1, v2

    add-int/lit8 v2, v2, 0x1

    .line 128
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->items:[Ljava/lang/String;

    array-length v4, v4

    add-int/lit8 v4, v4, -0x1

    if-ltz v4, :cond_0

    const/4 v5, 0x0

    :goto_1
    add-int/lit8 v6, v5, 0x1

    .line 129
    iget-object v7, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->items:[Ljava/lang/String;

    aget-object v7, v7, v5

    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 130
    iget-object v7, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->selection:[Z

    const/4 v8, 0x1

    aput-boolean v8, v7, v5

    :cond_1
    if-le v6, v4, :cond_2

    goto :goto_0

    :cond_2
    move v5, v6

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;->title:Ljava/lang/String;

    return-void
.end method
