.class public Lcom/bugfender/sdk/ui/FeedbackStyle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x2aL


# instance fields
.field appBarActionButtonColor:I

.field appBarBackgroundColor:I

.field appBarCloseButtonColor:I

.field appBarTitleColor:I

.field backgroundColor:I

.field inputBackgroundColor:I

.field inputHintColor:I

.field inputTextColor:I

.field textColor:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lcom/bugfender/android/R$color;->feedback_appbar_background:I

    iput v0, p0, Lcom/bugfender/sdk/ui/FeedbackStyle;->appBarBackgroundColor:I

    sget v0, Lcom/bugfender/android/R$color;->feedback_appbar_title:I

    iput v0, p0, Lcom/bugfender/sdk/ui/FeedbackStyle;->appBarTitleColor:I

    sget v0, Lcom/bugfender/android/R$color;->feedback_appbar_close_button:I

    iput v0, p0, Lcom/bugfender/sdk/ui/FeedbackStyle;->appBarCloseButtonColor:I

    sget v0, Lcom/bugfender/android/R$color;->feedback_appbar_action_button:I

    iput v0, p0, Lcom/bugfender/sdk/ui/FeedbackStyle;->appBarActionButtonColor:I

    sget v0, Lcom/bugfender/android/R$color;->feedback_background:I

    iput v0, p0, Lcom/bugfender/sdk/ui/FeedbackStyle;->backgroundColor:I

    sget v0, Lcom/bugfender/android/R$color;->feedback_text:I

    iput v0, p0, Lcom/bugfender/sdk/ui/FeedbackStyle;->textColor:I

    sget v0, Lcom/bugfender/android/R$color;->feedback_input_background:I

    iput v0, p0, Lcom/bugfender/sdk/ui/FeedbackStyle;->inputBackgroundColor:I

    sget v0, Lcom/bugfender/android/R$color;->feedback_input_text:I

    iput v0, p0, Lcom/bugfender/sdk/ui/FeedbackStyle;->inputTextColor:I

    sget v0, Lcom/bugfender/android/R$color;->feedback_input_hint:I

    iput v0, p0, Lcom/bugfender/sdk/ui/FeedbackStyle;->inputHintColor:I

    return-void
.end method


# virtual methods
.method public setAppBarColors(IIII)Lcom/bugfender/sdk/ui/FeedbackStyle;
    .locals 0

    iput p1, p0, Lcom/bugfender/sdk/ui/FeedbackStyle;->appBarBackgroundColor:I

    iput p2, p0, Lcom/bugfender/sdk/ui/FeedbackStyle;->appBarTitleColor:I

    iput p3, p0, Lcom/bugfender/sdk/ui/FeedbackStyle;->appBarCloseButtonColor:I

    iput p4, p0, Lcom/bugfender/sdk/ui/FeedbackStyle;->appBarActionButtonColor:I

    return-object p0
.end method

.method public setInputColors(III)Lcom/bugfender/sdk/ui/FeedbackStyle;
    .locals 0

    iput p1, p0, Lcom/bugfender/sdk/ui/FeedbackStyle;->inputBackgroundColor:I

    iput p2, p0, Lcom/bugfender/sdk/ui/FeedbackStyle;->inputTextColor:I

    iput p3, p0, Lcom/bugfender/sdk/ui/FeedbackStyle;->inputHintColor:I

    return-object p0
.end method

.method public setScreenColors(II)Lcom/bugfender/sdk/ui/FeedbackStyle;
    .locals 0

    iput p1, p0, Lcom/bugfender/sdk/ui/FeedbackStyle;->backgroundColor:I

    iput p2, p0, Lcom/bugfender/sdk/ui/FeedbackStyle;->textColor:I

    return-object p0
.end method
