.class final Lcom/google/android/play/core/splitcompat/g;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/play/core/splitcompat/i;


# instance fields
.field private final synthetic a:Ljava/util/Set;

.field private final synthetic b:Lcom/google/android/play/core/splitcompat/q;

.field private final synthetic c:Lcom/google/android/play/core/splitcompat/f;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/splitcompat/f;Ljava/util/Set;Lcom/google/android/play/core/splitcompat/q;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/splitcompat/g;->c:Lcom/google/android/play/core/splitcompat/f;

    iput-object p2, p0, Lcom/google/android/play/core/splitcompat/g;->a:Ljava/util/Set;

    iput-object p3, p0, Lcom/google/android/play/core/splitcompat/g;->b:Lcom/google/android/play/core/splitcompat/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/zip/ZipFile;Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/zip/ZipFile;",
            "Ljava/util/Set<",
            "Lcom/google/android/play/core/splitcompat/k;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/splitcompat/g;->a:Ljava/util/Set;

    iget-object v1, p0, Lcom/google/android/play/core/splitcompat/g;->c:Lcom/google/android/play/core/splitcompat/f;

    iget-object v2, p0, Lcom/google/android/play/core/splitcompat/g;->b:Lcom/google/android/play/core/splitcompat/q;

    invoke-static {v1, p2, v2, p1}, Lcom/google/android/play/core/splitcompat/f;->a(Lcom/google/android/play/core/splitcompat/f;Ljava/util/Set;Lcom/google/android/play/core/splitcompat/q;Ljava/util/zip/ZipFile;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method
