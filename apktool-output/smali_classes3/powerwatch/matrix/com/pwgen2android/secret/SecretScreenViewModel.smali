.class public final Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
.source "SecretScreenViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSecretScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecretScreenViewModel.kt\npowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,224:1\n13536#2,2:225\n13536#2,2:227\n13536#2,2:229\n*S KotlinDebug\n*F\n+ 1 SecretScreenViewModel.kt\npowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel\n*L\n150#1:225,2\n166#1:227,2\n175#1:229,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0018\u0000 82\u00020\u0001:\u00018B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010 \u001a\u00020!2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0006\u0010\"\u001a\u00020!J(\u0010#\u001a\u00020!2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'H\u0002J\n\u0010)\u001a\u00020!*\u00020*J\n\u0010+\u001a\u00020!*\u00020*J\n\u0010,\u001a\u00020!*\u00020*J\n\u0010-\u001a\u00020!*\u00020*J\n\u0010.\u001a\u00020!*\u00020*J\n\u0010/\u001a\u00020!*\u00020*J\n\u00100\u001a\u00020!*\u00020*J\u000c\u00101\u001a\u00020!*\u00020*H\u0007J\n\u00102\u001a\u00020!*\u00020*J\n\u00103\u001a\u00020!*\u00020*J\n\u00104\u001a\u00020!*\u00020*J\n\u00105\u001a\u00020!*\u00020*J\n\u00106\u001a\u00020!*\u00020*J\u000c\u00107\u001a\u00020!*\u00020*H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0018\u001a\u0010\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u001a\u001a\u0010\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\u0010\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\t0\t0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u001e\u001a\u0010\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0019R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00069"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;",
        "dbManager",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "deviceManager",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;",
        "parentFragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "context",
        "Landroid/content/Context;",
        "traceLogger",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;",
        "mockDataExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2MockDataExecutor;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2MockDataExecutor;)V",
        "deleteAllDataChecked",
        "Landroidx/databinding/ObservableField;",
        "",
        "kotlin.jvm.PlatformType",
        "deleteDevicesChecked",
        "deleteGoalsChecked",
        "deleteLogsChecked",
        "isDebugBuild",
        "()Landroidx/databinding/ObservableField;",
        "mockLogDataEnabled",
        "getMockLogDataEnabled",
        "parentFragmentManagerWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "prodEnabled",
        "getProdEnabled",
        "deleteLogFiles",
        "",
        "onBackClicked",
        "shareFiles",
        "logDataType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;",
        "sharingTitle",
        "",
        "fileTitle",
        "deleteLogs",
        "Landroid/view/View;",
        "exportAccelLog",
        "onDeleteAllDataClicked",
        "onDeleteDevicesClicked",
        "onDeleteGoalsClicked",
        "onDeleteLogsClicked",
        "onDevRadioClicked",
        "onMockDataChecked",
        "onOpenDBDebugClicked",
        "onOpenInternalLoggerClicked",
        "onOpenNotificationLoggerClicked",
        "onOpenNotificationServiceSettings",
        "onProdRadioClicked",
        "onSaveClicked",
        "Companion",
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


# static fields
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel$Companion;

.field private static final DB_DEBUG_URL:Ljava/lang/String;


# instance fields
.field private final dbManager:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;

.field private final deleteAllDataChecked:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final deleteDevicesChecked:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final deleteGoalsChecked:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final deleteLogsChecked:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

.field private final isDebugBuild:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final mockDataExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2MockDataExecutor;

.field private final mockLogDataEnabled:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
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

.field private final prodEnabled:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final traceLogger:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->Companion:Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel$Companion;

    const-string v0, "http://localhost:8080"

    .line 220
    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->DB_DEBUG_URL:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2MockDataExecutor;)V
    .locals 1

    const-string v0, "dbManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communicator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "deviceManager"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "parentFragmentManager"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "context"

    invoke-static {p5, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "traceLogger"

    invoke-static {p6, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "mockDataExecutor"

    invoke-static {p7, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 v0, 0x3

    .line 45
    invoke-direct {p0, p2, p2, v0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 39
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->dbManager:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;

    .line 41
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    .line 44
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->traceLogger:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;

    .line 45
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->mockDataExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2MockDataExecutor;

    .line 47
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->parentFragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    .line 49
    new-instance p1, Landroidx/databinding/ObservableField;

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;->Companion:Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;

    invoke-virtual {p2, p5}, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;->getProdEnabledFlag(Landroid/content/Context;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->prodEnabled:Landroidx/databinding/ObservableField;

    .line 51
    new-instance p1, Landroidx/databinding/ObservableField;

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->deleteLogsChecked:Landroidx/databinding/ObservableField;

    .line 52
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->deleteDevicesChecked:Landroidx/databinding/ObservableField;

    .line 53
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->deleteGoalsChecked:Landroidx/databinding/ObservableField;

    .line 54
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->deleteAllDataChecked:Landroidx/databinding/ObservableField;

    .line 55
    new-instance p1, Landroidx/databinding/ObservableField;

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;->Companion:Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;

    invoke-virtual {p3, p5}, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;->getMockDataEnabled(Landroid/content/Context;)Z

    move-result p3

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-direct {p1, p3}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->mockLogDataEnabled:Landroidx/databinding/ObservableField;

    .line 56
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->isDebugBuild:Landroidx/databinding/ObservableField;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2MockDataExecutor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    .line 45
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2MockDataExecutor;

    move-object v3, p2

    invoke-direct {v0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2MockDataExecutor;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V

    move-object v8, v0

    goto :goto_0

    :cond_0
    move-object v3, p2

    move-object/from16 v8, p7

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    .line 39
    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2MockDataExecutor;)V

    return-void
.end method

.method private final deleteLogFiles(Landroid/content/Context;)V
    .locals 7

    .line 166
    invoke-virtual {p1}, Landroid/content/Context;->fileList()[Ljava/lang/String;

    move-result-object v0

    const-string v1, "context.fileList()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ljava/lang/Object;

    .line 227
    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v0, v4

    check-cast v5, Ljava/lang/String;

    const-string v6, "file internal: "

    .line 167
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v6, v5}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 169
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->traceLogger:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Accel;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Accel;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;

    invoke-interface {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;->getStoredLogs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)Ljava/io/File;

    move-result-object v0

    .line 170
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->traceLogger:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$HeartRate;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$HeartRate;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;

    invoke-interface {v2, v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;->getStoredLogs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)Ljava/io/File;

    move-result-object v2

    .line 172
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 173
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 175
    invoke-virtual {p1}, Landroid/content/Context;->fileList()[Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, [Ljava/lang/Object;

    .line 229
    array-length v0, p1

    :goto_1
    if-ge v3, v0, :cond_1

    aget-object v1, p1, v3

    check-cast v1, Ljava/lang/String;

    const-string v2, "file internal after delete: "

    .line 176
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public static synthetic lambda$Qe8WgN0OvSmn5vl0f1vpFM1TNOc(Landroid/view/View;ZLpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->onSaveClicked$lambda-8(Landroid/view/View;ZLpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;)V

    return-void
.end method

.method public static synthetic lambda$T-TgKOiGKLcNMbqyjZl46WQhy-c(Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;Landroid/view/View;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->onMockDataChecked$lambda-4(Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;Landroid/view/View;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$WoJJbiVCSHFVm2n4doC7wGsvZW4(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->onMockDataChecked$lambda-2$lambda-1(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$Z889AxdMSxwW_aCGTjz5GQydx6k()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->onSaveClicked$lambda-9()V

    return-void
.end method

.method public static synthetic lambda$l2X5XhIBUylgsBH_bJyYburen-o(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->onMockDataChecked$lambda-2$lambda-0(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$v1hgl4kzTva3Uy8ozNRZe-f52tQ(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->onMockDataChecked$lambda-3(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$yrLe3EqeRoSpLtchCwCDC9auOSU(Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->onMockDataChecked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final onMockDataChecked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;Landroid/view/View;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/CompletableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$this_onMockDataChecked"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->getMockLogDataEnabled()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 90
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    .line 92
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->mockDataExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2MockDataExecutor;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2MockDataExecutor;->enableMock(Ljava/lang/String;)Lio/reactivex/Completable;

    move-result-object p0

    .line 93
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/secret/-$$Lambda$SecretScreenViewModel$l2X5XhIBUylgsBH_bJyYburen-o;

    invoke-direct {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/secret/-$$Lambda$SecretScreenViewModel$l2X5XhIBUylgsBH_bJyYburen-o;-><init>(Landroid/view/View;)V

    invoke-virtual {p0, p2}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0

    .line 97
    :cond_0
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->mockDataExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2MockDataExecutor;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2MockDataExecutor;->disableMock(Ljava/lang/String;)Lio/reactivex/Completable;

    move-result-object p0

    .line 98
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/secret/-$$Lambda$SecretScreenViewModel$WoJJbiVCSHFVm2n4doC7wGsvZW4;

    invoke-direct {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/secret/-$$Lambda$SecretScreenViewModel$WoJJbiVCSHFVm2n4doC7wGsvZW4;-><init>(Landroid/view/View;)V

    invoke-virtual {p0, p2}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0

    .line 103
    :cond_1
    new-instance p0, Ljava/lang/Throwable;

    const-string p1, "Watch is not connected"

    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lio/reactivex/Completable;->error(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final onMockDataChecked$lambda-2$lambda-0(Landroid/view/View;)V
    .locals 2

    const-string v0, "$this_onMockDataChecked"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;->Companion:Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const-string v1, "context"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p0}, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;->setMockDataEnabled(ZLandroid/content/Context;)V

    return-void
.end method

.method private static final onMockDataChecked$lambda-2$lambda-1(Landroid/view/View;)V
    .locals 2

    const-string v0, "$this_onMockDataChecked"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;->Companion:Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const-string v1, "context"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p0}, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;->setMockDataEnabled(ZLandroid/content/Context;)V

    return-void
.end method

.method private static final onMockDataChecked$lambda-3(Landroid/view/View;)V
    .locals 2

    const-string v0, "$this_onMockDataChecked"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "Mock data successfully enabled."

    check-cast v0, Ljava/lang/CharSequence;

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method private static final onMockDataChecked$lambda-4(Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;Landroid/view/View;Ljava/lang/Throwable;)V
    .locals 1

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$this_onMockDataChecked"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->getMockLogDataEnabled()Landroidx/databinding/ObservableField;

    move-result-object p2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->getMockLogDataEnabled()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 110
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->getMockLogDataEnabled()Landroidx/databinding/ObservableField;

    move-result-object p2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->getMockLogDataEnabled()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p2, p0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 111
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const-string p1, "Watch is not connected."

    check-cast p1, Ljava/lang/CharSequence;

    const/4 p2, 0x0

    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method private static final onSaveClicked$lambda-8(Landroid/view/View;ZLpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;)V
    .locals 3

    const-string v0, "$this_onSaveClicked"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;->Companion:Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;->getProdEnabledFlag(Landroid/content/Context;)Z

    move-result v0

    if-eq v0, p1, :cond_0

    .line 189
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;->Companion:Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;->setProdEnabledFlag(ZLandroid/content/Context;)V

    .line 190
    iget-object p1, p2, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->dbManager:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;->clearAllData()V

    goto :goto_0

    .line 192
    :cond_0
    iget-object p1, p2, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->deleteLogsChecked:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 193
    iget-object p1, p2, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->dbManager:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;->clearBackgroundAndActivityLogs()V

    .line 195
    :cond_1
    iget-object p1, p2, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->deleteGoalsChecked:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 196
    iget-object p1, p2, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->dbManager:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;->clearGoalConfigurations()V

    .line 199
    :cond_2
    iget-object p1, p2, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->deleteDevicesChecked:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 200
    iget-object p1, p2, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->dbManager:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;->clearDevices()V

    .line 203
    :cond_3
    iget-object p1, p2, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->deleteAllDataChecked:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 204
    iget-object p1, p2, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->dbManager:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;->clearAllData()V

    .line 207
    :cond_4
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const-string p1, "New configuration saved, app will be closed, open it again."

    check-cast p1, Ljava/lang/CharSequence;

    const/4 p2, 0x0

    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method private static final onSaveClicked$lambda-9()V
    .locals 2

    const/4 v0, 0x0

    .line 211
    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "System.exit returned normally, while it was supposed to halt JVM."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method private final shareFiles(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 150
    invoke-virtual {p1}, Landroid/content/Context;->fileList()[Ljava/lang/String;

    move-result-object p2

    const-string v0, "context.fileList()"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, [Ljava/lang/Object;

    .line 225
    array-length v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v3, p2, v2

    check-cast v3, Ljava/lang/String;

    const-string v4, "file internal: "

    .line 151
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v4, v3}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 154
    :cond_0
    new-instance p2, Landroid/content/Intent;

    const-string v0, "android.intent.action.SEND_MULTIPLE"

    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "android.intent.extra.SUBJECT"

    .line 155
    invoke-virtual {p2, v0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p4, "*/txt"

    .line 156
    invoke-virtual {p2, p4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 158
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p4

    invoke-virtual {p4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p4

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->traceLogger:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Accel;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Accel;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;

    invoke-interface {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;->getStoredLogs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)Ljava/io/File;

    move-result-object v0

    invoke-static {p1, p4, v0}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p4

    .line 159
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->traceLogger:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$HeartRate;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$HeartRate;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;

    invoke-interface {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;->getStoredLogs(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;)Ljava/io/File;

    move-result-object v2

    invoke-static {p1, v0, v2}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    const/4 v2, 0x2

    new-array v2, v2, [Landroid/net/Uri;

    const-string v3, "accelFileURI"

    .line 161
    invoke-static {p4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object p4, v2, v1

    const-string p4, "hrFileURI"

    invoke-static {v0, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p4, 0x1

    aput-object v0, v2, p4

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p4

    const-string v0, "android.intent.extra.STREAM"

    invoke-virtual {p2, v0, p4}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 162
    check-cast p3, Ljava/lang/CharSequence;

    invoke-static {p2, p3}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public final deleteLogs(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->deleteLogFiles(Landroid/content/Context;)V

    return-void
.end method

.method public final exportAccelLog(Landroid/view/View;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Accel;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Accel;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;

    const-string v1, "Share accelerometer logs"

    const-string v2, "Accelerometer logs"

    invoke-direct {p0, p1, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->shareFiles(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final getMockLogDataEnabled()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 55
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->mockLogDataEnabled:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getProdEnabled()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->prodEnabled:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final isDebugBuild()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 56
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->isDebugBuild:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final onBackClicked()V
    .locals 1

    .line 75
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->parentFragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

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

.method public final onDeleteAllDataClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->deleteAllDataChecked:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final onDeleteDevicesClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->deleteDevicesChecked:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final onDeleteGoalsClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->deleteGoalsChecked:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final onDeleteLogsClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->deleteLogsChecked:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final onDevRadioClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->prodEnabled:Landroidx/databinding/ObservableField;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final onMockDataChecked(Landroid/view/View;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager$DefaultImpls;->connect$default(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    .line 87
    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object v0

    .line 88
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/secret/-$$Lambda$SecretScreenViewModel$yrLe3EqeRoSpLtchCwCDC9auOSU;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/secret/-$$Lambda$SecretScreenViewModel$yrLe3EqeRoSpLtchCwCDC9auOSU;-><init>(Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v0

    .line 105
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Completable;

    move-result-object v0

    .line 106
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/secret/-$$Lambda$SecretScreenViewModel$v1hgl4kzTva3Uy8ozNRZe-f52tQ;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/secret/-$$Lambda$SecretScreenViewModel$v1hgl4kzTva3Uy8ozNRZe-f52tQ;-><init>(Landroid/view/View;)V

    .line 108
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/secret/-$$Lambda$SecretScreenViewModel$T-TgKOiGKLcNMbqyjZl46WQhy-c;

    invoke-direct {v2, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/secret/-$$Lambda$SecretScreenViewModel$T-TgKOiGKLcNMbqyjZl46WQhy-c;-><init>(Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;Landroid/view/View;)V

    .line 106
    invoke-virtual {v0, v1, v2}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    return-void
.end method

.method public final onOpenDBDebugClicked(Landroid/view/View;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment$Companion;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->DB_DEBUG_URL:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment$Companion;->newInstance(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment;

    move-result-object p1

    .line 61
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->parentFragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f080280

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final onOpenInternalLoggerClicked(Landroid/view/View;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/shared/ui/internalLogger/InternalLoggerFragment;

    move-result-object p1

    .line 66
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->parentFragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f080280

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final onOpenNotificationLoggerClicked(Landroid/view/View;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;

    move-result-object p1

    .line 71
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->parentFragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f080280

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final onOpenNotificationServiceSettings(Landroid/view/View;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final onProdRadioClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->prodEnabled:Landroidx/databinding/ObservableField;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final onSaveClicked(Landroid/view/View;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;->prodEnabled:Landroidx/databinding/ObservableField;

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 187
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/secret/-$$Lambda$SecretScreenViewModel$Qe8WgN0OvSmn5vl0f1vpFM1TNOc;

    invoke-direct {v1, p1, v0, p0}, Lpowerwatch/matrix/com/pwgen2android/secret/-$$Lambda$SecretScreenViewModel$Qe8WgN0OvSmn5vl0f1vpFM1TNOc;-><init>(Landroid/view/View;ZLpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;)V

    invoke-static {v1}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    .line 209
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x7d0

    invoke-virtual {p1, v1, v2, v0}, Lio/reactivex/Completable;->delay(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Completable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/secret/-$$Lambda$SecretScreenViewModel$Z889AxdMSxwW_aCGTjz5GQydx6k;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/secret/-$$Lambda$SecretScreenViewModel$Z889AxdMSxwW_aCGTjz5GQydx6k;

    .line 210
    invoke-virtual {p1, v0}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;)Lio/reactivex/disposables/Disposable;

    return-void
.end method
