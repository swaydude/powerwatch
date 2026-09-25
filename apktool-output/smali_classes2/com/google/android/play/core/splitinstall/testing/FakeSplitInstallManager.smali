.class public Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/play/core/splitinstall/SplitInstallManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager$a;
    }
.end annotation


# static fields
.field private static final b:J

.field private static final k:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Landroid/os/Handler;

.field private final c:Landroid/content/Context;

.field private final d:Lcom/google/android/play/core/internal/ac;

.field private final e:Lcom/google/android/play/core/splitinstall/l;

.field private final f:Lcom/google/android/play/core/internal/bh;

.field private final g:Lcom/google/android/play/core/internal/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/play/core/internal/q<",
            "Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/util/concurrent/Executor;

.field private final i:Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager$a;

.field private final j:Ljava/io/File;

.field private final l:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final m:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->b:J

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    invoke-static/range {v1 .. v9}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->create(IIIJJLjava/util/List;Ljava/util/List;)Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->k:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/io/File;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Landroid/content/pm/PackageManager$NameNotFoundException;
        }
    .end annotation

    new-instance v3, Lcom/google/android/play/core/splitinstall/j;

    invoke-direct {v3}, Lcom/google/android/play/core/splitinstall/j;-><init>()V

    new-instance v4, Lcom/google/android/play/core/splitinstall/l;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, p1, v0}, Lcom/google/android/play/core/splitinstall/l;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v5, Lcom/google/android/play/core/internal/bh;

    invoke-direct {v5, p1}, Lcom/google/android/play/core/internal/bh;-><init>(Landroid/content/Context;)V

    new-instance v6, Lcom/google/android/play/core/internal/ba;

    new-instance v0, Lcom/google/android/play/core/splitcompat/c;

    invoke-direct {v0, p1}, Lcom/google/android/play/core/splitcompat/c;-><init>(Landroid/content/Context;)V

    new-instance v1, Lcom/google/android/play/core/internal/ag;

    invoke-direct {v1}, Lcom/google/android/play/core/internal/ag;-><init>()V

    invoke-direct {v6, p1, v0, v1}, Lcom/google/android/play/core/internal/ba;-><init>(Landroid/content/Context;Lcom/google/android/play/core/splitcompat/c;Lcom/google/android/play/core/internal/ag;)V

    new-instance v7, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager$a;

    invoke-direct {v7}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager$a;-><init>()V

    invoke-static {}, Lcom/google/android/play/core/splitcompat/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v8

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v8}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;-><init>(Landroid/content/Context;Ljava/io/File;Lcom/google/android/play/core/splitinstall/j;Lcom/google/android/play/core/splitinstall/l;Lcom/google/android/play/core/internal/bh;Lcom/google/android/play/core/internal/ba;Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager$a;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/io/File;Lcom/google/android/play/core/splitinstall/j;Lcom/google/android/play/core/splitinstall/l;Lcom/google/android/play/core/internal/bh;Lcom/google/android/play/core/internal/ba;Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager$a;Ljava/util/concurrent/Executor;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Landroid/content/pm/PackageManager$NameNotFoundException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a:Landroid/os/Handler;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->l:Ljava/util/Set;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->m:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p7, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->i:Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager$a;

    new-instance p7, Lcom/google/android/play/core/internal/q;

    invoke-direct {p7}, Lcom/google/android/play/core/internal/q;-><init>()V

    iput-object p7, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->g:Lcom/google/android/play/core/internal/q;

    iput-object p1, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->c:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->j:Ljava/io/File;

    iput-object p4, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->e:Lcom/google/android/play/core/splitinstall/l;

    iput-object p5, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->f:Lcom/google/android/play/core/internal/bh;

    new-instance v4, Lcom/google/android/play/core/splitcompat/c;

    invoke-direct {v4, p1}, Lcom/google/android/play/core/splitcompat/c;-><init>(Landroid/content/Context;)V

    iput-object p8, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->h:Ljava/util/concurrent/Executor;

    new-instance p2, Lcom/google/android/play/core/internal/ac;

    move-object v0, p2

    move-object v1, p1

    move-object v2, p8

    move-object v3, p6

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/play/core/internal/ac;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/play/core/internal/ba;Lcom/google/android/play/core/splitcompat/c;Lcom/google/android/play/core/splitinstall/j;)V

    iput-object p2, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->d:Lcom/google/android/play/core/internal/ac;

    return-void
.end method

.method static synthetic a()J
    .locals 2

    sget-wide v0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->b:J

    return-wide v0
.end method

.method static synthetic a(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;)Lcom/google/android/play/core/internal/q;
    .locals 0

    iget-object p0, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->g:Lcom/google/android/play/core/internal/q;

    return-object p0
.end method

.method private static a(Ljava/io/File;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, ".apk"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 p0, p0, -0x4

    invoke-virtual {v0, v1, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "base-"

    const-string v1, "config."

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "-"

    const-string v1, ".config."

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string v0, ".config.master"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Non-apk found in splits directory."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "\\.config\\."

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    aget-object p0, p0, v0

    return-object p0
.end method

.method private final a(II)V
    .locals 7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v6}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(IILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;)V

    return-void
.end method

.method private final a(IILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    sget-object v0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->k:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    if-nez p3, :cond_0

    invoke-virtual {v1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->bytesDownloaded()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object/from16 v2, p3

    :goto_0
    if-nez p4, :cond_1

    invoke-virtual {v1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->totalBytesToDownload()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object/from16 v3, p4

    :goto_1
    if-nez p5, :cond_2

    invoke-virtual {v1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->moduleNames()Ljava/util/List;

    move-result-object v4

    move-object v12, v4

    goto :goto_2

    :cond_2
    move-object/from16 v12, p5

    :goto_2
    if-nez p6, :cond_3

    invoke-virtual {v1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->sessionId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_3

    :cond_3
    move-object/from16 v1, p6

    :goto_3
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    new-instance v13, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->getInstalledModules()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v13, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move v6, p1

    move/from16 v7, p2

    invoke-static/range {v5 .. v13}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->create(IIIJJLjava/util/List;Ljava/util/List;)Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;II)V
    .locals 0

    const/4 p1, 0x6

    invoke-direct {p0, p1, p2}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->b(II)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;IILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;)V
    .locals 7

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move-object v3, p3

    invoke-direct/range {v0 .. v6}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->b(IILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(Ljava/util/List;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;Ljava/util/List;Ljava/util/List;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(Ljava/util/List;Ljava/util/List;J)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;Ljava/util/List;Ljava/util/List;JZ)V
    .locals 6

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(Ljava/util/List;Ljava/util/List;JZ)V

    return-void
.end method

.method private final a(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-static {v0}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    new-instance v3, Landroid/content/Intent;

    const-string v6, "android.intent.action.VIEW"

    invoke-direct {v3, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v6, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->c:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    invoke-virtual {v6, v2}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v2, v6}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v2, 0x1

    invoke-virtual {v3, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-static {v1}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v6, "module_name"

    invoke-virtual {v3, v6, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "split_id"

    invoke-virtual {v3, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->k:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    invoke-virtual {p1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->totalBytesToDownload()J

    move-result-wide v2

    iget-object p1, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->h:Ljava/util/concurrent/Executor;

    new-instance v6, Lcom/google/android/play/core/splitinstall/testing/d;

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/play/core/splitinstall/testing/d;-><init>(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;JLjava/util/List;Ljava/util/List;)V

    invoke-interface {p1, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private final a(Ljava/util/List;Ljava/util/List;J)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/content/Intent;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;J)V"
        }
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(Ljava/util/List;Ljava/util/List;JZ)V

    return-void
.end method

.method private final a(Ljava/util/List;Ljava/util/List;JZ)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/content/Intent;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;JZ)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->d:Lcom/google/android/play/core/internal/ac;

    new-instance v8, Lcom/google/android/play/core/splitinstall/testing/c;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p2

    move-wide v4, p3

    move v6, p5

    move-object v7, p1

    invoke-direct/range {v1 .. v7}, Lcom/google/android/play/core/splitinstall/testing/c;-><init>(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;Ljava/util/List;JZLjava/util/List;)V

    invoke-virtual {v0, p1, v8}, Lcom/google/android/play/core/internal/ac;->b(Ljava/util/List;Lcom/google/android/play/core/splitinstall/d;)V

    return-void
.end method

.method static synthetic b(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;)Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager$a;
    .locals 0

    iget-object p0, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->i:Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager$a;

    return-object p0
.end method

.method static synthetic b()Ljava/util/concurrent/atomic/AtomicReference;
    .locals 1

    sget-object v0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->k:Ljava/util/concurrent/atomic/AtomicReference;

    return-object v0
.end method

.method private final b(II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(II)V

    invoke-direct {p0}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->c()V

    return-void
.end method

.method private final b(IILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    invoke-direct/range {p0 .. p6}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(IILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;)V

    invoke-direct {p0}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->c()V

    return-void
.end method

.method static synthetic c(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method private final c()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/play/core/splitinstall/testing/a;

    invoke-direct {v1, p0}, Lcom/google/android/play/core/splitinstall/testing/a;-><init>(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method static synthetic d(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->l:Ljava/util/Set;

    return-object p0
.end method


# virtual methods
.method public cancelInstall(I)Lcom/google/android/play/core/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/android/play/core/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->k:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    invoke-virtual {v1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->status()I

    move-result v1

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    invoke-virtual {v2}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->sessionId()I

    move-result v2

    if-ne p1, v2, :cond_0

    const/4 p1, 0x1

    if-ne v1, p1, :cond_0

    const/4 p1, 0x7

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    invoke-virtual {v0}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->errorCode()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->b(II)V

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/play/core/tasks/Tasks;->a(Ljava/lang/Object;)Lcom/google/android/play/core/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/android/play/core/splitinstall/SplitInstallException;

    const/4 v0, -0x3

    invoke-direct {p1, v0}, Lcom/google/android/play/core/splitinstall/SplitInstallException;-><init>(I)V

    invoke-static {p1}, Lcom/google/android/play/core/tasks/Tasks;->a(Ljava/lang/Exception;)Lcom/google/android/play/core/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public deferredInstall(Ljava/util/List;)Lcom/google/android/play/core/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/play/core/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/google/android/play/core/splitinstall/SplitInstallException;

    const/4 v0, -0x5

    invoke-direct {p1, v0}, Lcom/google/android/play/core/splitinstall/SplitInstallException;-><init>(I)V

    invoke-static {p1}, Lcom/google/android/play/core/tasks/Tasks;->a(Ljava/lang/Exception;)Lcom/google/android/play/core/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public deferredLanguageInstall(Ljava/util/List;)Lcom/google/android/play/core/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/Locale;",
            ">;)",
            "Lcom/google/android/play/core/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/google/android/play/core/splitinstall/SplitInstallException;

    const/4 v0, -0x5

    invoke-direct {p1, v0}, Lcom/google/android/play/core/splitinstall/SplitInstallException;-><init>(I)V

    invoke-static {p1}, Lcom/google/android/play/core/tasks/Tasks;->a(Ljava/lang/Exception;)Lcom/google/android/play/core/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public deferredLanguageUninstall(Ljava/util/List;)Lcom/google/android/play/core/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/Locale;",
            ">;)",
            "Lcom/google/android/play/core/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/google/android/play/core/splitinstall/SplitInstallException;

    const/4 v0, -0x5

    invoke-direct {p1, v0}, Lcom/google/android/play/core/splitinstall/SplitInstallException;-><init>(I)V

    invoke-static {p1}, Lcom/google/android/play/core/tasks/Tasks;->a(Ljava/lang/Exception;)Lcom/google/android/play/core/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public deferredUninstall(Ljava/util/List;)Lcom/google/android/play/core/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/play/core/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/google/android/play/core/splitinstall/SplitInstallException;

    const/4 v0, -0x5

    invoke-direct {p1, v0}, Lcom/google/android/play/core/splitinstall/SplitInstallException;-><init>(I)V

    invoke-static {p1}, Lcom/google/android/play/core/tasks/Tasks;->a(Ljava/lang/Exception;)Lcom/google/android/play/core/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public getInstalledLanguages()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->m:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getInstalledModules()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->l:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getSessionState(I)Lcom/google/android/play/core/tasks/Task;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/android/play/core/tasks/Task<",
            "Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;",
            ">;"
        }
    .end annotation

    sget-object p1, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->k:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    invoke-static {p1}, Lcom/google/android/play/core/tasks/Tasks;->a(Ljava/lang/Object;)Lcom/google/android/play/core/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public getSessionStates()Lcom/google/android/play/core/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/play/core/tasks/Task<",
            "Ljava/util/List<",
            "Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;",
            ">;>;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    sget-object v1, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->k:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/play/core/tasks/Tasks;->a(Ljava/lang/Object;)Lcom/google/android/play/core/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public registerListener(Lcom/google/android/play/core/splitinstall/SplitInstallStateUpdatedListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->g:Lcom/google/android/play/core/internal/q;

    invoke-virtual {v0, p1}, Lcom/google/android/play/core/internal/q;->a(Lcom/google/android/play/core/listener/StateUpdatedListener;)V

    return-void
.end method

.method public setShouldNetworkError(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public startConfirmationDialogForResult(Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;Landroid/app/Activity;I)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/IntentSender$SendIntentException;
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public startInstall(Lcom/google/android/play/core/splitinstall/SplitInstallRequest;)Lcom/google/android/play/core/tasks/Task;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/play/core/splitinstall/SplitInstallRequest;",
            ")",
            "Lcom/google/android/play/core/tasks/Task<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    move-object/from16 v7, p0

    sget-object v0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->k:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    invoke-virtual {v1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->hasTerminalStatus()Z

    move-result v1

    const/4 v8, -0x1

    const/4 v9, 0x6

    if-nez v1, :cond_0

    invoke-direct {v7, v9, v8}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(II)V

    new-instance v0, Lcom/google/android/play/core/splitinstall/SplitInstallException;

    invoke-direct {v0, v8}, Lcom/google/android/play/core/splitinstall/SplitInstallException;-><init>(I)V

    invoke-static {v0}, Lcom/google/android/play/core/tasks/Tasks;->a(Ljava/lang/Exception;)Lcom/google/android/play/core/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    invoke-virtual {v0}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->sessionId()I

    move-result v0

    const/4 v10, 0x1

    add-int/lit8 v11, v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v12, 0x0

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->b(IILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;)V

    const/4 v1, 0x1

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/play/core/splitinstall/SplitInstallRequest;->getModuleNames()Ljava/util/List;

    move-result-object v5

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->b(IILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;)V

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/play/core/splitinstall/SplitInstallRequest;->getLanguages()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Locale;

    iget-object v2, v7, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->m:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, v7, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->j:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    const-string v2, "FakeSplitInstallManager"

    if-nez v1, :cond_2

    const-string v0, "Specified splits directory does not exist."

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, -0x5

    invoke-direct {v7, v9, v0}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->b(II)V

    new-instance v1, Lcom/google/android/play/core/splitinstall/SplitInstallException;

    invoke-direct {v1, v0}, Lcom/google/android/play/core/splitinstall/SplitInstallException;-><init>(I)V

    invoke-static {v1}, Lcom/google/android/play/core/tasks/Tasks;->a(Ljava/lang/Exception;)Lcom/google/android/play/core/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_2
    array-length v3, v1

    const/4 v4, 0x0

    move-wide v15, v12

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v3, :cond_10

    aget-object v6, v1, v5

    invoke-static {v6}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/play/core/splitinstall/SplitInstallRequest;->getModuleNames()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-static {v12}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-instance v13, Ljava/util/HashSet;

    iget-object v8, v7, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->f:Lcom/google/android/play/core/internal/bh;

    invoke-virtual {v8}, Lcom/google/android/play/core/internal/bh;->a()Ljava/util/List;

    move-result-object v8

    invoke-direct {v13, v8}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iget-object v8, v7, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->e:Lcom/google/android/play/core/splitinstall/l;

    invoke-virtual {v8}, Lcom/google/android/play/core/splitinstall/l;->c()Lcom/google/android/play/core/splitinstall/f;

    move-result-object v8

    move-object/from16 v18, v1

    new-array v1, v10, [Ljava/lang/String;

    aput-object v9, v1, v4

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v8, v1}, Lcom/google/android/play/core/splitinstall/f;->a(Ljava/util/Collection;)Ljava/util/Map;

    move-result-object v1

    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v10, v19

    check-cast v10, Ljava/util/Set;

    invoke-interface {v8, v10}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    const/4 v10, 0x1

    goto :goto_2

    :cond_3
    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v13}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    const-string v4, "_"

    invoke-virtual {v13, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v20

    if-eqz v20, :cond_4

    move/from16 v20, v3

    const/4 v3, -0x1

    invoke-virtual {v13, v4, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v4

    const/16 v17, 0x0

    aget-object v13, v4, v17

    goto :goto_4

    :cond_4
    move/from16 v20, v3

    const/4 v3, -0x1

    const/16 v17, 0x0

    :goto_4
    invoke-virtual {v9, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move/from16 v3, v20

    const/4 v4, 0x0

    goto :goto_3

    :cond_5
    move/from16 v20, v3

    const/4 v3, -0x1

    const/16 v17, 0x0

    iget-object v4, v7, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->m:Ljava/util/Set;

    invoke-interface {v9, v4}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    invoke-interface {v9, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v4, v10}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_5

    :cond_7
    invoke-interface {v8, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v4, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_6

    :cond_8
    const/4 v1, 0x0

    goto :goto_7

    :cond_9
    :goto_6
    const/4 v1, 0x1

    :goto_7
    if-eqz v1, :cond_b

    const/4 v1, 0x1

    goto :goto_8

    :cond_a
    move-object/from16 v18, v1

    move/from16 v20, v3

    const/4 v3, -0x1

    const/16 v17, 0x0

    :cond_b
    const/4 v1, 0x0

    :goto_8
    if-nez v1, :cond_e

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/play/core/splitinstall/SplitInstallRequest;->getLanguages()Ljava/util/List;

    move-result-object v1

    new-instance v4, Ljava/util/ArrayList;

    iget-object v8, v7, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->l:Ljava/util/Set;

    invoke-direct {v4, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v8, ""

    const-string v9, "base"

    filled-new-array {v8, v9}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v8, v7, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->e:Lcom/google/android/play/core/splitinstall/l;

    invoke-virtual {v8}, Lcom/google/android/play/core/splitinstall/l;->c()Lcom/google/android/play/core/splitinstall/f;

    move-result-object v8

    invoke-virtual {v8, v4}, Lcom/google/android/play/core/splitinstall/f;->a(Ljava/util/Collection;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Locale;

    invoke-virtual {v8}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v4, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-virtual {v8}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Set;

    invoke-interface {v8, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_c

    const/4 v1, 0x1

    goto :goto_9

    :cond_d
    const/4 v1, 0x0

    :goto_9
    if-eqz v1, :cond_f

    :cond_e
    invoke-virtual {v6}, Ljava/io/File;->getTotalSpace()J

    move-result-wide v8

    add-long/2addr v15, v8

    invoke-static {v6}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v14, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_f
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v1, v18

    move/from16 v3, v20

    const/4 v4, 0x0

    const/4 v8, -0x1

    const/4 v9, 0x6

    const/4 v10, 0x1

    const-wide/16 v12, 0x0

    goto/16 :goto_1

    :cond_10
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/play/core/splitinstall/SplitInstallRequest;->getModuleNames()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x15

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "availableSplits"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " want "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, Ljava/util/HashSet;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/play/core/splitinstall/SplitInstallRequest;->getModuleNames()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0, v1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_11

    const/4 v0, -0x2

    const/4 v1, 0x6

    invoke-direct {v7, v1, v0}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->b(II)V

    new-instance v1, Lcom/google/android/play/core/splitinstall/SplitInstallException;

    invoke-direct {v1, v0}, Lcom/google/android/play/core/splitinstall/SplitInstallException;-><init>(I)V

    invoke-static {v1}, Lcom/google/android/play/core/tasks/Tasks;->a(Ljava/lang/Exception;)Lcom/google/android/play/core/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_11
    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/play/core/splitinstall/SplitInstallRequest;->getModuleNames()Ljava/util/List;

    move-result-object v5

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->b(IILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;)V

    iget-object v0, v7, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->h:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/play/core/splitinstall/testing/b;

    invoke-direct {v1, v7, v14}, Lcom/google/android/play/core/splitinstall/testing/b;-><init>(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/play/core/tasks/Tasks;->a(Ljava/lang/Object;)Lcom/google/android/play/core/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public unregisterListener(Lcom/google/android/play/core/splitinstall/SplitInstallStateUpdatedListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->g:Lcom/google/android/play/core/internal/q;

    invoke-virtual {v0, p1}, Lcom/google/android/play/core/internal/q;->b(Lcom/google/android/play/core/listener/StateUpdatedListener;)V

    return-void
.end method
