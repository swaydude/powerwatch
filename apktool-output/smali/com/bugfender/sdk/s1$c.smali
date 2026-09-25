.class Lcom/bugfender/sdk/s1$c;
.super Lcom/bugfender/sdk/h0$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bugfender/sdk/s1;->a()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/bugfender/sdk/s1;


# direct methods
.method constructor <init>(Lcom/bugfender/sdk/s1;[Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/s1$c;->b:Lcom/bugfender/sdk/s1;

    invoke-direct {p0, p2}, Lcom/bugfender/sdk/h0$a;-><init>([Ljava/io/File;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;Ljava/lang/Long;Ljava/io/File;Ljava/lang/Long;)I
    .locals 0

    invoke-virtual {p2, p4}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    move-result p1

    return p1
.end method
