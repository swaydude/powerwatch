.class public Lcom/bugfender/sdk/z2$a;
.super Lcom/bugfender/sdk/z2$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bugfender/sdk/z2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/bugfender/sdk/z2$c;


# direct methods
.method public constructor <init>(Lcom/bugfender/sdk/z2$c;)V
    .locals 0

    invoke-direct {p0}, Lcom/bugfender/sdk/z2$c;-><init>()V

    iput-object p1, p0, Lcom/bugfender/sdk/z2$a;->a:Lcom/bugfender/sdk/z2$c;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lcom/bugfender/sdk/z2$a;->a:Lcom/bugfender/sdk/z2$c;

    invoke-virtual {v0}, Lcom/bugfender/sdk/z2$c;->a()V

    return-void
.end method

.method public a(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/z2$a;->a:Lcom/bugfender/sdk/z2$c;

    invoke-virtual {v0, p1}, Lcom/bugfender/sdk/z2$c;->a(Ljava/lang/Exception;)V

    return-void
.end method
