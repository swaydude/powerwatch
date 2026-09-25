.class public Lcom/bugfender/sdk/ui/FeedbackActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bugfender/sdk/ui/FeedbackActivity$c;
    }
.end annotation


# static fields
.field public static final REQUEST_CODE:I = 0x8ae

.field public static final RESULT_FEEDBACK_URL:Ljava/lang/String; = "result.feedback.url"

.field private static final g:Ljava/lang/String; = "FeedbackActivity"

.field private static final h:Ljava/lang/String; = "extra.texts"

.field private static final i:Ljava/lang/String; = "extra.style"


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/EditText;

.field private f:Landroid/widget/EditText;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/bugfender/sdk/ui/FeedbackActivity;)Landroid/widget/EditText;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->e:Landroid/widget/EditText;

    return-object p0
.end method

.method private a()V
    .locals 5

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "extra.style"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/bugfender/sdk/ui/FeedbackStyle;

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/bugfender/sdk/ui/FeedbackStyle;

    invoke-direct {v0}, Lcom/bugfender/sdk/ui/FeedbackStyle;-><init>()V

    :goto_0
    sget v1, Lcom/bugfender/android/R$id;->appbar_rl:I

    invoke-virtual {p0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iget v2, v0, Lcom/bugfender/sdk/ui/FeedbackStyle;->appBarBackgroundColor:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->a:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget v3, v0, Lcom/bugfender/sdk/ui/FeedbackStyle;->appBarCloseButtonColor:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v1, v2, v3}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    iget-object v1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->b:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget v3, v0, Lcom/bugfender/sdk/ui/FeedbackStyle;->appBarTitleColor:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget v3, v0, Lcom/bugfender/sdk/ui/FeedbackStyle;->appBarActionButtonColor:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    sget v1, Lcom/bugfender/android/R$id;->root_vg:I

    invoke-virtual {p0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iget v2, v0, Lcom/bugfender/sdk/ui/FeedbackStyle;->backgroundColor:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget v3, v0, Lcom/bugfender/sdk/ui/FeedbackStyle;->textColor:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    sget v1, Lcom/bugfender/android/R$id;->bugfender_tv:I

    invoke-virtual {p0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/bugfender/android/R$drawable;->bf_bugfender_logo:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    iget v4, v0, Lcom/bugfender/sdk/ui/FeedbackStyle;->textColor:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v2, v3, v4}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget v3, v0, Lcom/bugfender/sdk/ui/FeedbackStyle;->textColor:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->e:Landroid/widget/EditText;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget v3, v0, Lcom/bugfender/sdk/ui/FeedbackStyle;->inputTextColor:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->e:Landroid/widget/EditText;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget v3, v0, Lcom/bugfender/sdk/ui/FeedbackStyle;->inputHintColor:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setHintTextColor(I)V

    iget-object v1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->e:Landroid/widget/EditText;

    iget v2, v0, Lcom/bugfender/sdk/ui/FeedbackStyle;->inputBackgroundColor:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->f:Landroid/widget/EditText;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget v3, v0, Lcom/bugfender/sdk/ui/FeedbackStyle;->inputTextColor:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->f:Landroid/widget/EditText;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget v3, v0, Lcom/bugfender/sdk/ui/FeedbackStyle;->inputHintColor:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setHintTextColor(I)V

    iget-object v1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->f:Landroid/widget/EditText;

    iget v0, v0, Lcom/bugfender/sdk/ui/FeedbackStyle;->inputBackgroundColor:I

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    return-void
.end method

.method static synthetic b(Lcom/bugfender/sdk/ui/FeedbackActivity;)Landroid/widget/EditText;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->f:Landroid/widget/EditText;

    return-object p0
.end method

.method private b()V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "extra.texts"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/bugfender/sdk/ui/FeedbackActivity$c;

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/bugfender/sdk/ui/FeedbackActivity$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/bugfender/sdk/ui/FeedbackActivity$c;-><init>(Lcom/bugfender/sdk/ui/FeedbackActivity$a;)V

    :goto_0
    iget-object v1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->b:Landroid/widget/TextView;

    iget-object v2, v0, Lcom/bugfender/sdk/ui/FeedbackActivity$c;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->c:Landroid/widget/TextView;

    iget-object v2, v0, Lcom/bugfender/sdk/ui/FeedbackActivity$c;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->d:Landroid/widget/TextView;

    iget-object v2, v0, Lcom/bugfender/sdk/ui/FeedbackActivity$c;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->e:Landroid/widget/EditText;

    iget-object v2, v0, Lcom/bugfender/sdk/ui/FeedbackActivity$c;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->f:Landroid/widget/EditText;

    iget-object v0, v0, Lcom/bugfender/sdk/ui/FeedbackActivity$c;->d:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static getIntent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bugfender/sdk/ui/FeedbackStyle;)Landroid/content/Intent;
    .locals 8

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/bugfender/sdk/ui/FeedbackActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance p0, Lcom/bugfender/sdk/ui/FeedbackActivity$c;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v2 .. v7}, Lcom/bugfender/sdk/ui/FeedbackActivity$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "extra.texts"

    invoke-virtual {v0, p1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    if-nez p6, :cond_0

    new-instance p6, Lcom/bugfender/sdk/ui/FeedbackStyle;

    invoke-direct {p6}, Lcom/bugfender/sdk/ui/FeedbackStyle;-><init>()V

    :cond_0
    const-string p0, "extra.style"

    invoke-virtual {v0, p0, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    return-object v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    :try_start_0
    sget p1, Lcom/bugfender/android/R$layout;->bf_feedback_screen:I

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    sget p1, Lcom/bugfender/android/R$id;->close_iv:I

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->a:Landroid/widget/ImageView;

    sget p1, Lcom/bugfender/android/R$id;->title_tv:I

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->b:Landroid/widget/TextView;

    sget p1, Lcom/bugfender/android/R$id;->positive_action_tv:I

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->c:Landroid/widget/TextView;

    sget p1, Lcom/bugfender/android/R$id;->message_tv:I

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->d:Landroid/widget/TextView;

    sget p1, Lcom/bugfender/android/R$id;->feedback_title_et:I

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->e:Landroid/widget/EditText;

    sget p1, Lcom/bugfender/android/R$id;->feedback_message_et:I

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->f:Landroid/widget/EditText;

    invoke-direct {p0}, Lcom/bugfender/sdk/ui/FeedbackActivity;->b()V

    invoke-direct {p0}, Lcom/bugfender/sdk/ui/FeedbackActivity;->a()V

    iget-object p1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->a:Landroid/widget/ImageView;

    new-instance v0, Lcom/bugfender/sdk/ui/FeedbackActivity$a;

    invoke-direct {v0, p0}, Lcom/bugfender/sdk/ui/FeedbackActivity$a;-><init>(Lcom/bugfender/sdk/ui/FeedbackActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/bugfender/sdk/ui/FeedbackActivity;->c:Landroid/widget/TextView;

    new-instance v0, Lcom/bugfender/sdk/ui/FeedbackActivity$b;

    invoke-direct {v0, p0}, Lcom/bugfender/sdk/ui/FeedbackActivity$b;-><init>(Lcom/bugfender/sdk/ui/FeedbackActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :catch_0
    move-exception p1

    const-string v0, "FeedbackActivity"

    const-string v1, "Error inflating view. This is known to happen when performing Google Play pre-launch tests but it doesn\'t occur during app real usage"

    invoke-static {v0, v1, p1}, Lcom/bugfender/sdk/d1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
