.class Lcom/bugfender/sdk/ui/FeedbackActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bugfender/sdk/ui/FeedbackActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# static fields
.field private static final f:J = 0x29L


# instance fields
.field final a:Ljava/lang/String;

.field final b:Ljava/lang/String;

.field final c:Ljava/lang/String;

.field final d:Ljava/lang/String;

.field final e:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Feedback"

    iput-object v0, p0, Lcom/bugfender/sdk/ui/FeedbackActivity$c;->a:Ljava/lang/String;

    const-string v0, "Please insert your feedback here and click send"

    iput-object v0, p0, Lcom/bugfender/sdk/ui/FeedbackActivity$c;->b:Ljava/lang/String;

    const-string v0, "Feedback subject"

    iput-object v0, p0, Lcom/bugfender/sdk/ui/FeedbackActivity$c;->c:Ljava/lang/String;

    const-string v0, "Feedback message"

    iput-object v0, p0, Lcom/bugfender/sdk/ui/FeedbackActivity$c;->d:Ljava/lang/String;

    const-string v0, "Send"

    iput-object v0, p0, Lcom/bugfender/sdk/ui/FeedbackActivity$c;->e:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/bugfender/sdk/ui/FeedbackActivity$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/bugfender/sdk/ui/FeedbackActivity$c;-><init>()V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity$c;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/bugfender/sdk/ui/FeedbackActivity$c;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/bugfender/sdk/ui/FeedbackActivity$c;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/bugfender/sdk/ui/FeedbackActivity$c;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/bugfender/sdk/ui/FeedbackActivity$c;->e:Ljava/lang/String;

    return-void
.end method
