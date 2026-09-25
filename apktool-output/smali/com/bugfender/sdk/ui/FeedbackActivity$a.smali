.class Lcom/bugfender/sdk/ui/FeedbackActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bugfender/sdk/ui/FeedbackActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bugfender/sdk/ui/FeedbackActivity;


# direct methods
.method constructor <init>(Lcom/bugfender/sdk/ui/FeedbackActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity$a;->a:Lcom/bugfender/sdk/ui/FeedbackActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity$a;->a:Lcom/bugfender/sdk/ui/FeedbackActivity;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/app/Activity;->setResult(I)V

    iget-object p1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity$a;->a:Lcom/bugfender/sdk/ui/FeedbackActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
