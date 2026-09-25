.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;
.source "EditUserActivityViewModel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEditUserActivityViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditUserActivityViewModel.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,154:1\n11328#2:155\n11663#2,3:156\n37#3,2:159\n*S KotlinDebug\n*F\n+ 1 EditUserActivityViewModel.kt\npowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel\n*L\n126#1:155\n126#1:156,3\n129#1:159,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0002\u0010\rJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016J\u0006\u0010#\u001a\u00020!J\u0008\u0010$\u001a\u00020!H\u0016J\u0008\u0010%\u001a\u00020!H\u0002J\u0008\u0010&\u001a\u00020!H\u0002J\n\u0010\'\u001a\u00020!*\u00020(J\n\u0010)\u001a\u00020!*\u00020(R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u000c\u0012\n \u0010*\u0004\u0018\u00010\n0\n0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0011\u001a\u0010\u0012\u000c\u0012\n \u0010*\u0004\u0018\u00010\u00130\u00130\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0014R\u001f\u0010\u0015\u001a\u0010\u0012\u000c\u0012\n \u0010*\u0004\u0018\u00010\u00160\u00160\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0014R\u001f\u0010\u0018\u001a\u0010\u0012\u000c\u0012\n \u0010*\u0004\u0018\u00010\u00160\u00160\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0014R\u001f\u0010\u001a\u001a\u0010\u0012\u000c\u0012\n \u0010*\u0004\u0018\u00010\u00160\u00160\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0014R\u001c\u0010\u001c\u001a\u0010\u0012\u000c\u0012\n \u0010*\u0004\u0018\u00010\u000c0\u000c0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u001e\u001a\u0010\u0012\u000c\u0012\n \u0010*\u0004\u0018\u00010\u00160\u00160\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "userActivitySessionDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;",
        "userActivitySessionRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;",
        "dialogManager",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;",
        "activity",
        "Landroid/app/Activity;",
        "parentFragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V",
        "contextWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "isProgressVisible",
        "Landroidx/databinding/ObservableField;",
        "",
        "()Landroidx/databinding/ObservableField;",
        "locationField",
        "",
        "getLocationField",
        "nameField",
        "getNameField",
        "notesField",
        "getNotesField",
        "parentFragmentManagerWeakReference",
        "sessionID",
        "typeField",
        "getTypeField",
        "loadActivitySession",
        "",
        "sessionId",
        "onBackButtonClicked",
        "onBackClicked",
        "onDeleteConfirmed",
        "onSaveChangesClicked",
        "onActivityTypeClicked",
        "Landroid/view/View;",
        "onDeleteClicked",
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
.field private final activity:Landroid/app/Activity;

.field private final contextWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private final dialogManager:Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;

.field private final isProgressVisible:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final locationField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final nameField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final notesField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final parentFragmentManagerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;"
        }
    .end annotation
.end field

.field private sessionID:Ljava/lang/String;

.field private final typeField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final userActivitySessionDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;

.field private final userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V
    .locals 2

    const-string v0, "userActivitySessionDataProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userActivitySessionRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dialogManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parentFragmentManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 35
    invoke-direct {p0, v0, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 31
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->userActivitySessionDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;

    .line 32
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

    .line 33
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->dialogManager:Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;

    .line 34
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->activity:Landroid/app/Activity;

    .line 38
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->parentFragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    .line 39
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    .line 41
    new-instance p1, Landroidx/databinding/ObservableField;

    const-string p2, ""

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->nameField:Landroidx/databinding/ObservableField;

    .line 42
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->typeField:Landroidx/databinding/ObservableField;

    .line 43
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->locationField:Landroidx/databinding/ObservableField;

    .line 44
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->notesField:Landroidx/databinding/ObservableField;

    .line 45
    new-instance p1, Landroidx/databinding/ObservableField;

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->isProgressVisible:Landroidx/databinding/ObservableField;

    return-void
.end method

.method public static synthetic lambda$1VM_h2HCaQdybRhO6-0PGuACfYc(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditActivityView;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->loadActivitySession$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditActivityView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$4lm3toCIyx1CjaGubBu-Iox6bcU(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->onSaveChangesClicked$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$5XXHt9BflEUQ7TNOOi9FTqX5oHE(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->onSaveChangesClicked$lambda-5(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)V

    return-void
.end method

.method public static synthetic lambda$E4vqwDI9hvq6w1dkjwboBfyaceA(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->loadActivitySession$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$JIPoRs9bkHB-aNQiVUYbD1uB650(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->onDeleteConfirmed$lambda-11(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)V

    return-void
.end method

.method public static synthetic lambda$JcEjGwLaXYUpc6B9odaUOn0NqS4(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->onDeleteConfirmed$lambda-12(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$Miz2kLbNcZdaoF-ScObviuaiaps(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->onDeleteConfirmed$lambda-10(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$NmC0g6QNYvBjv5qtwUXBlj8gHB8(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->onSaveChangesClicked$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$VbVdP-ipOLR9-jtrbkGYLbfNTrk(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->onSaveChangesClicked$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$nInWuYGopGBSNtVKa6IDBg3RgTk(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->onDeleteClicked$lambda-7(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic lambda$opeyawYZMtGZFru8gwVhPCaQYgA(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->onDeleteClicked$lambda-8(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$uQYuCpRRdmcVHoCA0n4Su5TYgkI(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditActivityView;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->loadActivitySession$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditActivityView;)V

    return-void
.end method

.method private static final loadActivitySession$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditActivityView;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getName()Ljava/lang/String;

    move-result-object v0

    .line 57
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getLocationName()Ljava/lang/String;

    move-result-object v1

    .line 58
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getNotes()Ljava/lang/String;

    move-result-object v2

    .line 59
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getActivityType()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    move-result-object p1

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->activity:Landroid/app/Activity;

    check-cast p0, Landroid/content/Context;

    invoke-static {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->mapActivityTypeToName(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    .line 55
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditActivityView;

    invoke-direct {p1, v0, p0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditActivityView;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final loadActivitySession$lambda-1(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditActivityView;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "Edit Activity data retrieved: "

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->info$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 64
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->getNameField()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditActivityView;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 65
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->getNotesField()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditActivityView;->getNotes()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 66
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->getLocationField()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditActivityView;->getLocation()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 67
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->getTypeField()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    .line 68
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->getTypeField()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditActivityView;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method private static final loadActivitySession$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "Error while retrieving user activity from cache."

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final onDeleteClicked$lambda-7(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 115
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 116
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->onDeleteConfirmed()V

    :cond_0
    return-void
.end method

.method private static final onDeleteClicked$lambda-8(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private final onDeleteConfirmed()V
    .locals 6

    .line 136
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->sessionID:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 137
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->isProgressVisible:Landroidx/databinding/ObservableField;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 138
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->sessionID:Ljava/lang/String;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v1, v2, v3, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository$DefaultImpls;->getOne$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository;Ljava/lang/Object;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    .line 139
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$Miz2kLbNcZdaoF-ScObviuaiaps;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$Miz2kLbNcZdaoF-ScObviuaiaps;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v1

    .line 142
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$JIPoRs9bkHB-aNQiVUYbD1uB650;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$JIPoRs9bkHB-aNQiVUYbD1uB650;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)V

    .line 146
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$JcEjGwLaXYUpc6B9odaUOn0NqS4;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$JcEjGwLaXYUpc6B9odaUOn0NqS4;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)V

    .line 142
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 138
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    :cond_0
    return-void
.end method

.method private static final onDeleteConfirmed$lambda-10(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;->delete(Ljava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final onDeleteConfirmed$lambda-11(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "Activity successfully saved."

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->info$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 144
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->parentFragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->popBackStack()V

    .line 145
    :goto_0
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->parentFragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/fragment/app/FragmentManager;

    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->popBackStack()V

    :goto_1
    return-void
.end method

.method private static final onDeleteConfirmed$lambda-12(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Ljava/lang/Throwable;)V
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->isProgressVisible()Landroidx/databinding/ObservableField;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 148
    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v3, "Activity deleting failed."

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v4, p1

    invoke-static/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private final onSaveChangesClicked()V
    .locals 6

    .line 77
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->sessionID:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 78
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->isProgressVisible:Landroidx/databinding/ObservableField;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 79
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->sessionID:Ljava/lang/String;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v1, v2, v3, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository$DefaultImpls;->getOne$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository;Ljava/lang/Object;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    .line 80
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$NmC0g6QNYvBjv5qtwUXBlj8gHB8;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$NmC0g6QNYvBjv5qtwUXBlj8gHB8;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    .line 87
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$4lm3toCIyx1CjaGubBu-Iox6bcU;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$4lm3toCIyx1CjaGubBu-Iox6bcU;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v1

    .line 90
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$5XXHt9BflEUQ7TNOOi9FTqX5oHE;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$5XXHt9BflEUQ7TNOOi9FTqX5oHE;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)V

    .line 93
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$VbVdP-ipOLR9-jtrbkGYLbfNTrk;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$VbVdP-ipOLR9-jtrbkGYLbfNTrk;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)V

    .line 90
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 79
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    :cond_0
    return-void
.end method

.method private static final onSaveChangesClicked$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "it"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->getNameField()Landroidx/databinding/ObservableField;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object v3, v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 83
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->getLocationField()Landroidx/databinding/ObservableField;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object v5, v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 84
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->getTypeField()Landroidx/databinding/ObservableField;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/Activity;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v4, Landroid/content/Context;

    invoke-static {v2, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->mapActivityNameToActivityType(Ljava/lang/String;Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    move-result-object v4

    .line 85
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->getNotesField()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object/from16 v18, v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v21, 0x1bff1

    const/16 v22, 0x0

    .line 81
    invoke-static/range {v1 .. v22}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;Ljava/lang/String;FIJJFIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    move-result-object v0

    return-object v0
.end method

.method private static final onSaveChangesClicked$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->userActivitySessionRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepository;->update(Ljava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final onSaveChangesClicked$lambda-5(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "Activity successfully saved."

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->info$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 92
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->parentFragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/fragment/app/FragmentManager;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->popBackStack()V

    :goto_0
    return-void
.end method

.method private static final onSaveChangesClicked$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;Ljava/lang/Throwable;)V
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->isProgressVisible()Landroidx/databinding/ObservableField;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 95
    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v3, "Activity saving failed."

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v4, p1

    invoke-static/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 31
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final getLocationField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->locationField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getNameField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 41
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->nameField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getNotesField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 44
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->notesField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getTypeField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->typeField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final isProgressVisible()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->isProgressVisible:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final loadActivitySession(Ljava/lang/String;)V
    .locals 3

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->sessionID:Ljava/lang/String;

    .line 51
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    .line 52
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->userActivitySessionDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;

    invoke-interface {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;->loadSessionById(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    .line 53
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$1VM_h2HCaQdybRhO6-0PGuACfYc;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$1VM_h2HCaQdybRhO6-0PGuACfYc;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 62
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$uQYuCpRRdmcVHoCA0n4Su5TYgkI;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$uQYuCpRRdmcVHoCA0n4Su5TYgkI;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)V

    .line 70
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$E4vqwDI9hvq6w1dkjwboBfyaceA;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$E4vqwDI9hvq6w1dkjwboBfyaceA;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)V

    .line 62
    invoke-virtual {p1, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 52
    invoke-virtual {v0, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public final onActivityTypeClicked(Landroid/view/View;)V
    .locals 9

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->typeField:Landroidx/databinding/ObservableField;

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 125
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->values()[Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    move-result-object v1

    .line 155
    new-instance v2, Ljava/util/ArrayList;

    array-length v3, v1

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 156
    array-length v3, v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_0

    aget-object v6, v1, v5

    .line 127
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    const-string v8, "context"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ActivityPeriodsExtensionsKt;->mapActivityTypeToName(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 128
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/UIChooseItemView;

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    invoke-direct {v7, v6, v8}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/UIChooseItemView;-><init>(Ljava/lang/String;Z)V

    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 158
    :cond_0
    check-cast v2, Ljava/util/List;

    .line 155
    check-cast v2, Ljava/util/Collection;

    new-array p1, v4, [Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/UIChooseItemView;

    .line 160
    invoke-interface {v2, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 129
    check-cast p1, [Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/UIChooseItemView;

    .line 131
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->parentFragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseActivityTypeFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseActivityTypeFragment$Companion;

    array-length v2, p1

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseActivityTypeFragment$Companion;->newInstance(Ljava/util/ArrayList;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseActivityTypeFragment;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f0800db

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public final onBackButtonClicked()V
    .locals 1

    .line 101
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->parentFragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->popBackStack()V

    :goto_0
    return-void
.end method

.method public onBackClicked()V
    .locals 0

    .line 105
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onBackClicked()V

    .line 106
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->onSaveChangesClicked()V

    return-void
.end method

.method public final onDeleteClicked(Landroid/view/View;)V
    .locals 9

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    .line 112
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;->dialogManager:Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;

    .line 113
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string p1, "context"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x7f0f00fb

    const v4, 0x7f0f00a3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x18

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager$DefaultImpls;->openAlertDialog$default(Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Landroid/content/Context;IIIIILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object p1

    .line 114
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$nInWuYGopGBSNtVKa6IDBg3RgTk;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$nInWuYGopGBSNtVKa6IDBg3RgTk;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;)V

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$opeyawYZMtGZFru8gwVhPCaQYgA;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/-$$Lambda$EditUserActivityViewModel$opeyawYZMtGZFru8gwVhPCaQYgA;

    invoke-virtual {p1, v1, v2}, Lio/reactivex/Single;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 111
    invoke-virtual {v0, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method
