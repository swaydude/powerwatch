.class public final Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
.source "BiometricsViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBiometricsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BiometricsViewModel.kt\npowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,204:1\n1547#2:205\n1618#2,3:206\n1547#2:211\n1618#2,3:212\n1547#2:217\n1618#2,3:218\n37#3,2:209\n37#3,2:215\n37#3,2:221\n*S KotlinDebug\n*F\n+ 1 BiometricsViewModel.kt\npowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel\n*L\n48#1:205\n48#1:206,3\n51#1:211\n51#1:212,3\n57#1:217\n57#1:218,3\n48#1:209,2\n51#1:215,2\n57#1:221,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010,\u001a\u00020\u000fJ\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000fJ\n\u00100\u001a\u00020.*\u000201J\n\u00102\u001a\u00020.*\u000201J\n\u00103\u001a\u00020.*\u000201J\n\u00104\u001a\u00020.*\u000201J\n\u00105\u001a\u00020.*\u000201R\u001f\u0010\u0005\u001a\u0010\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0010\u001a\u0010\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\nR\u0017\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\nR\u001f\u0010\u0015\u001a\u0010\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\nR\u001f\u0010\u0017\u001a\u0010\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\nR\u0017\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\nR\u001f\u0010\u001b\u001a\u0010\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\nR\u0017\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\nR\u001f\u0010\u001f\u001a\u0010\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010 0 0\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\nR\u001f\u0010\"\u001a\u0010\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010#0#0\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\nR\u001f\u0010%\u001a\u0010\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\nR\u0017\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\nR\u001f\u0010)\u001a\u0010\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010*0*0\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010\n\u00a8\u00066"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;",
        "appContext",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "age",
        "Landroidx/databinding/ObservableField;",
        "",
        "kotlin.jvm.PlatformType",
        "getAge",
        "()Landroidx/databinding/ObservableField;",
        "agePicker",
        "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;",
        "getAgePicker",
        "currentBiometrics",
        "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;",
        "gender",
        "getGender",
        "genderAdapter",
        "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;",
        "getGenderAdapter",
        "genderPicker",
        "getGenderPicker",
        "height",
        "getHeight",
        "heightPicker",
        "getHeightPicker",
        "language",
        "getLanguage",
        "languageAdapter",
        "getLanguageAdapter",
        "languageShown",
        "",
        "getLanguageShown",
        "textColor",
        "",
        "getTextColor",
        "weight",
        "getWeight",
        "weightPicker",
        "getWeightPicker",
        "wheelConfig",
        "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;",
        "getWheelConfig",
        "getBiometrics",
        "setBiometrics",
        "",
        "biometrics",
        "onAgeClicked",
        "Landroid/view/View;",
        "onGenderClicked",
        "onHeightClicked",
        "onLanguageClicked",
        "onWeightClicked",
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
.field private final age:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final agePicker:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;",
            ">;"
        }
    .end annotation
.end field

.field private final appContext:Landroid/content/Context;

.field private currentBiometrics:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;

.field private final gender:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final genderAdapter:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;",
            ">;"
        }
    .end annotation
.end field

.field private final genderPicker:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final height:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final heightPicker:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;",
            ">;"
        }
    .end annotation
.end field

.field private final language:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final languageAdapter:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;",
            ">;"
        }
    .end annotation
.end field

.field private final languageShown:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final textColor:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final weight:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final weightPicker:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;",
            ">;"
        }
    .end annotation
.end field

.field private final wheelConfig:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 14

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x3

    .line 23
    invoke-direct {p0, v0, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->appContext:Landroid/content/Context;

    .line 28
    new-instance v1, Landroidx/databinding/ObservableField;

    const-string v2, "25"

    invoke-direct {v1, v2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->age:Landroidx/databinding/ObservableField;

    .line 29
    new-instance v1, Landroidx/databinding/ObservableField;

    const-string v2, "180"

    invoke-direct {v1, v2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->height:Landroidx/databinding/ObservableField;

    .line 30
    new-instance v1, Landroidx/databinding/ObservableField;

    const-string v2, "80"

    invoke-direct {v1, v2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->weight:Landroidx/databinding/ObservableField;

    .line 31
    new-instance v1, Landroidx/databinding/ObservableField;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->gender:Landroidx/databinding/ObservableField;

    .line 32
    new-instance v1, Landroidx/databinding/ObservableField;

    const-string v2, "English"

    invoke-direct {v1, v2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->language:Landroidx/databinding/ObservableField;

    .line 33
    new-instance v1, Landroidx/databinding/ObservableField;

    const v2, 0x7f050105

    invoke-static {p1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v1, p1}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->textColor:Landroidx/databinding/ObservableField;

    .line 40
    new-instance p1, Landroidx/databinding/ObservableField;

    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Weight;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Weight;

    move-object v2, v1

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x3e

    const/4 v9, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v10}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->wheelConfig:Landroidx/databinding/ObservableField;

    .line 44
    new-instance p1, Landroidx/databinding/ObservableField;

    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    const-string v2, "45"

    const/16 v4, 0x78

    const/16 v5, 0xd

    const/4 v6, 0x0

    const/16 v7, 0x12

    const/4 v8, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v9}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->agePicker:Landroidx/databinding/ObservableField;

    .line 48
    new-instance p1, Lkotlin/ranges/IntRange;

    const/16 v1, 0x64

    const/16 v2, 0x10e

    invoke-direct {p1, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    check-cast p1, Ljava/lang/Iterable;

    .line 205
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 206
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v3, p1

    check-cast v3, Lkotlin/collections/IntIterator;

    invoke-virtual {v3}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v3

    .line 48
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 208
    :cond_0
    check-cast v1, Ljava/util/List;

    .line 205
    check-cast v1, Ljava/util/Collection;

    const/4 p1, 0x0

    new-array v3, p1, [Ljava/lang/String;

    .line 210
    invoke-interface {v1, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-static {v1, v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 48
    move-object v6, v1

    check-cast v6, [Ljava/lang/String;

    .line 47
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    const/16 v7, 0x10e

    const/16 v8, 0x64

    const/4 v9, 0x0

    const/16 v10, 0x10

    const/4 v11, 0x0

    const-string v5, "180"

    move-object v4, v1

    invoke-direct/range {v4 .. v11}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Landroidx/databinding/ObservableField;

    invoke-direct {v4, v1}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->heightPicker:Landroidx/databinding/ObservableField;

    .line 51
    new-instance v1, Lkotlin/ranges/IntRange;

    const/16 v4, 0x14

    const/16 v5, 0x12c

    invoke-direct {v1, v4, v5}, Lkotlin/ranges/IntRange;-><init>(II)V

    check-cast v1, Ljava/lang/Iterable;

    .line 211
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .line 212
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    move-object v5, v1

    check-cast v5, Lkotlin/collections/IntIterator;

    invoke-virtual {v5}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v5

    .line 51
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 214
    :cond_1
    check-cast v4, Ljava/util/List;

    .line 211
    check-cast v4, Ljava/util/Collection;

    new-array v1, p1, [Ljava/lang/String;

    .line 216
    invoke-interface {v4, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    move-object v6, v1

    check-cast v6, [Ljava/lang/String;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    const/16 v7, 0x12c

    const/16 v8, 0x14

    const/4 v9, 0x0

    const/16 v10, 0x10

    const/4 v11, 0x0

    const-string v5, "80"

    move-object v4, v1

    invoke-direct/range {v4 .. v11}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Landroidx/databinding/ObservableField;

    invoke-direct {v4, v1}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->weightPicker:Landroidx/databinding/ObservableField;

    .line 53
    new-instance v1, Landroidx/databinding/ObservableField;

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->getDescription()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->genderPicker:Landroidx/databinding/ObservableField;

    const/4 v6, 0x0

    .line 57
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;->getLanguageInfos()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 217
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .line 218
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 219
    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    .line 57
    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->appContext:Landroid/content/Context;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLanguageDisplay()I

    move-result v2

    invoke-virtual {v5, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 220
    :cond_2
    check-cast v4, Ljava/util/List;

    .line 217
    check-cast v4, Ljava/util/Collection;

    new-array v1, p1, [Ljava/lang/String;

    .line 222
    invoke-interface {v4, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, [Ljava/lang/String;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x1d

    const/4 v12, 0x0

    .line 56
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    move-object v5, v1

    invoke-direct/range {v5 .. v12}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    const/4 v3, 0x2

    invoke-direct {v2, v1, v0, v3, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Landroidx/databinding/ObservableField;

    invoke-direct {v1, v2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->languageAdapter:Landroidx/databinding/ObservableField;

    .line 60
    new-instance v1, Landroidx/databinding/ObservableField;

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    const/4 v5, 0x0

    new-array v6, v3, [Ljava/lang/String;

    .line 62
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Male;->getDescription()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v6, p1

    .line 63
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Gender$Female;->getDescription()Ljava/lang/String;

    move-result-object p1

    const/4 v13, 0x1

    aput-object p1, v6, v13

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x1d

    const/4 v11, 0x0

    move-object v4, v12

    .line 60
    invoke-direct/range {v4 .. v11}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;-><init>(Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v2, v12, v0, v3, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->genderAdapter:Landroidx/databinding/ObservableField;

    .line 65
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p1, v0}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->languageShown:Landroidx/databinding/ObservableField;

    return-void
.end method


# virtual methods
.method public final getAge()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->age:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getAgePicker()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;",
            ">;"
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->agePicker:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getBiometrics()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;
    .locals 11

    const-string v0, "currentBiometrics"

    .line 88
    :try_start_0
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->age:Landroidx/databinding/ObservableField;

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v3, v1

    goto :goto_0

    :catch_0
    const/16 v1, 0x19

    const/16 v3, 0x19

    :goto_0
    const/4 v1, 0x0

    .line 94
    :try_start_1
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->height:Landroidx/databinding/ObservableField;

    invoke-virtual {v2}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->currentBiometrics:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->getHeight()Lkotlin/Pair;

    move-result-object v2

    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    const-string v6, ""

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    goto :goto_1

    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    const/16 v2, 0xb4

    .line 99
    :goto_1
    :try_start_2
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->weight:Landroidx/databinding/ObservableField;

    invoke-virtual {v4}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->currentBiometrics:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->getWeight()Lkotlin/Pair;

    move-result-object v4

    invoke-virtual {v4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Ljava/lang/String;

    const-string v7, ""

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    goto :goto_2

    :cond_1
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    const/high16 v4, 0x42a00000    # 80.0f

    .line 104
    :goto_2
    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->language:Landroidx/databinding/ObservableField;

    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 106
    sget-object v6, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;->getLanguageInfos()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    invoke-interface {v6, v7}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v6

    :cond_2
    invoke-interface {v6}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    .line 107
    iget-object v9, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->appContext:Landroid/content/Context;

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLanguageDisplay()I

    move-result v8

    invoke-virtual {v9, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_3

    :cond_3
    move-object v7, v1

    .line 106
    :goto_3
    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    if-nez v7, :cond_4

    .line 108
    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageControllerImpl$Companion;->getDefaultLanguageInfo()Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    move-result-object v5

    move-object v7, v5

    .line 110
    :cond_4
    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->currentBiometrics:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;

    if-eqz v5, :cond_7

    .line 112
    new-instance v6, Lkotlin/Pair;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v8, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->currentBiometrics:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;

    if-eqz v8, :cond_6

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->getHeight()Lkotlin/Pair;

    move-result-object v8

    invoke-virtual {v8}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v8

    invoke-direct {v6, v2, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 113
    new-instance v8, Lkotlin/Pair;

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->currentBiometrics:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->getWeight()Lkotlin/Pair;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v8, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->gender:Landroidx/databinding/ObservableField;

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v1, 0x0

    const/16 v9, 0x20

    const/4 v10, 0x0

    move-object v2, v5

    move-object v4, v6

    move-object v5, v8

    move-object v6, v0

    move v8, v1

    .line 110
    invoke-static/range {v2 .. v10}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->copy$default(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;ILkotlin/Pair;Lkotlin/Pair;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;ZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;

    move-result-object v0

    return-object v0

    .line 113
    :cond_5
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1

    .line 112
    :cond_6
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1

    .line 110
    :cond_7
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v1
.end method

.method public final getGender()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 31
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->gender:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getGenderAdapter()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;",
            ">;"
        }
    .end annotation

    .line 59
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->genderAdapter:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getGenderPicker()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 53
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->genderPicker:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getHeight()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->height:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getHeightPicker()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;",
            ">;"
        }
    .end annotation

    .line 46
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->heightPicker:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getLanguage()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->language:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getLanguageAdapter()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;",
            ">;"
        }
    .end annotation

    .line 55
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->languageAdapter:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getLanguageShown()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->languageShown:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getTextColor()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->textColor:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getWeight()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->weight:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getWeightPicker()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;",
            ">;"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->weightPicker:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getWheelConfig()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;",
            ">;"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->wheelConfig:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final onAgeClicked(Landroid/view/View;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->wheelConfig:Landroidx/databinding/ObservableField;

    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Age;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Age;

    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->agePicker:Landroidx/databinding/ObservableField;

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;->getValue()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->agePicker:Landroidx/databinding/ObservableField;

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;->getMax()I

    move-result v4

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->agePicker:Landroidx/databinding/ObservableField;

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;->getMin()I

    move-result v5

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x24

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v9}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final onGenderClicked(Landroid/view/View;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->wheelConfig:Landroidx/databinding/ObservableField;

    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Gender;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Gender;

    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->gender:Landroidx/databinding/ObservableField;

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->genderAdapter:Landroidx/databinding/ObservableField;

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/16 v7, 0x18

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v9}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final onHeightClicked(Landroid/view/View;)V
    .locals 11

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->wheelConfig:Landroidx/databinding/ObservableField;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Height;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Height;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->height:Landroidx/databinding/ObservableField;

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->heightPicker:Landroidx/databinding/ObservableField;

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;->getMax()I

    move-result v6

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->heightPicker:Landroidx/databinding/ObservableField;

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;->getMin()I

    move-result v7

    .line 139
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->heightPicker:Landroidx/databinding/ObservableField;

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->currentBiometrics:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->getHeight()Lkotlin/Pair;

    move-result-object v2

    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v5, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;)V

    .line 138
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    move-object v3, v0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    const/4 v8, 0x0

    const/16 v9, 0x20

    const/4 v10, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v10}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string p1, "currentBiometrics"

    .line 139
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final onLanguageClicked(Landroid/view/View;)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->wheelConfig:Landroidx/databinding/ObservableField;

    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Language;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Language;

    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->language:Landroidx/databinding/ObservableField;

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->languageAdapter:Landroidx/databinding/ObservableField;

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->languageAdapter:Landroidx/databinding/ObservableField;

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;->getMaxIndex()I

    move-result v0

    add-int/lit8 v6, v0, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v7, 0x18

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v9}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final onWeightClicked(Landroid/view/View;)V
    .locals 11

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->wheelConfig:Landroidx/databinding/ObservableField;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Weight;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Weight;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->weight:Landroidx/databinding/ObservableField;

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->weightPicker:Landroidx/databinding/ObservableField;

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;->getMax()I

    move-result v6

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->weightPicker:Landroidx/databinding/ObservableField;

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;->getMin()I

    move-result v7

    .line 134
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->weightPicker:Landroidx/databinding/ObservableField;

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->currentBiometrics:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->getWeight()Lkotlin/Pair;

    move-result-object v2

    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v5, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;)V

    .line 133
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    move-object v3, v0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    const/4 v8, 0x0

    const/16 v9, 0x20

    const/4 v10, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v10}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string p1, "currentBiometrics"

    .line 134
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final setBiometrics(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;)V
    .locals 12

    const-string v0, "biometrics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->currentBiometrics:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;

    .line 71
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->getAge()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->getHeight()Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->getHeight()Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 73
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->getWeight()Lkotlin/Pair;

    move-result-object v3

    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->getWeight()Lkotlin/Pair;

    move-result-object v3

    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 74
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/Biometrics;->getGender()Ljava/lang/String;

    move-result-object p1

    .line 76
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->age:Landroidx/databinding/ObservableField;

    invoke-virtual {v1, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 77
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->height:Landroidx/databinding/ObservableField;

    invoke-virtual {v1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 78
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->weight:Landroidx/databinding/ObservableField;

    invoke-virtual {v1, v11}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 79
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->gender:Landroidx/databinding/ObservableField;

    invoke-virtual {v1, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 80
    iget-object v9, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->agePicker:Landroidx/databinding/ObservableField;

    invoke-virtual {v9}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x1e

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;->copy$default(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    move-result-object v1

    invoke-virtual {v9, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 81
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->heightPicker:Landroidx/databinding/ObservableField;

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v9, 0x1e

    const/4 v10, 0x0

    move-object v4, v0

    invoke-static/range {v3 .. v10}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;->copy$default(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 82
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->weightPicker:Landroidx/databinding/ObservableField;

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x1e

    const/4 v1, 0x0

    move-object v5, v11

    move-object v11, v1

    invoke-static/range {v4 .. v11}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;->copy$default(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;Ljava/lang/String;[Ljava/lang/String;II[Ljava/lang/String;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/PickedData;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 83
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->genderPicker:Landroidx/databinding/ObservableField;

    invoke-virtual {v0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method
