.class public Lcom/bugfender/sdk/logcat/InterceptedLog;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private file:Ljava/lang/String;

.field private level:Lcom/bugfender/sdk/LogLevel;

.field private lineNumber:I

.field private message:Ljava/lang/String;

.field private method:Ljava/lang/String;

.field private tag:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/bugfender/sdk/LogLevel;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/bugfender/sdk/logcat/InterceptedLog;->lineNumber:I

    iput-object p2, p0, Lcom/bugfender/sdk/logcat/InterceptedLog;->method:Ljava/lang/String;

    iput-object p3, p0, Lcom/bugfender/sdk/logcat/InterceptedLog;->file:Ljava/lang/String;

    iput-object p4, p0, Lcom/bugfender/sdk/logcat/InterceptedLog;->level:Lcom/bugfender/sdk/LogLevel;

    iput-object p5, p0, Lcom/bugfender/sdk/logcat/InterceptedLog;->tag:Ljava/lang/String;

    iput-object p6, p0, Lcom/bugfender/sdk/logcat/InterceptedLog;->message:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getFile()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/logcat/InterceptedLog;->file:Ljava/lang/String;

    return-object v0
.end method

.method public getLevel()Lcom/bugfender/sdk/LogLevel;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/logcat/InterceptedLog;->level:Lcom/bugfender/sdk/LogLevel;

    return-object v0
.end method

.method public getLineNumber()I
    .locals 1

    iget v0, p0, Lcom/bugfender/sdk/logcat/InterceptedLog;->lineNumber:I

    return v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/logcat/InterceptedLog;->message:Ljava/lang/String;

    return-object v0
.end method

.method public getMethod()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/logcat/InterceptedLog;->method:Ljava/lang/String;

    return-object v0
.end method

.method public getTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/logcat/InterceptedLog;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public setFile(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/logcat/InterceptedLog;->file:Ljava/lang/String;

    return-void
.end method

.method public setLevel(Lcom/bugfender/sdk/LogLevel;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/logcat/InterceptedLog;->level:Lcom/bugfender/sdk/LogLevel;

    return-void
.end method

.method public setLineNumber(I)V
    .locals 0

    iput p1, p0, Lcom/bugfender/sdk/logcat/InterceptedLog;->lineNumber:I

    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/logcat/InterceptedLog;->message:Ljava/lang/String;

    return-void
.end method

.method public setMethod(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/logcat/InterceptedLog;->method:Ljava/lang/String;

    return-void
.end method

.method public setTag(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/logcat/InterceptedLog;->tag:Ljava/lang/String;

    return-void
.end method
