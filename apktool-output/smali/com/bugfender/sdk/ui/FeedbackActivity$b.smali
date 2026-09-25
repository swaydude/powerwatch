.class Lcom/bugfender/sdk/ui/FeedbackActivity$b;
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

    iput-object p1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity$b;->a:Lcom/bugfender/sdk/ui/FeedbackActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity$b;->a:Lcom/bugfender/sdk/ui/FeedbackActivity;

    invoke-static {p1}, Lcom/bugfender/sdk/ui/FeedbackActivity;->a(Lcom/bugfender/sdk/ui/FeedbackActivity;)Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/bugfender/sdk/ui/FeedbackActivity$b;->a:Lcom/bugfender/sdk/ui/FeedbackActivity;

    invoke-static {v0}, Lcom/bugfender/sdk/ui/FeedbackActivity;->b(Lcom/bugfender/sdk/ui/FeedbackActivity;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/bugfender/sdk/Bugfender;->sendUserFeedback(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "result.feedback.url"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object p1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity$b;->a:Lcom/bugfender/sdk/ui/FeedbackActivity;

    const/4 v1, -0x1

    invoke-virtual {p1, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    :cond_0
    iget-object p1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity$b;->a:Lcom/bugfender/sdk/ui/FeedbackActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
