.class public abstract Lpowerwatch/matrix/com/pwgen2android/fcm/messages/MessageEnvelope;
.super Ljava/lang/Object;
.source "MessageEnvelope.java"

# interfaces
.implements Landroid/os/Parcelable;


# instance fields
.field protected mMessageType:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getMessageType()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/messages/MessageEnvelope;->mMessageType:Ljava/lang/String;

    return-object v0
.end method

.method public setMessageType(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "mMessageType"
        }
    .end annotation

    .line 18
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/messages/MessageEnvelope;->mMessageType:Ljava/lang/String;

    return-void
.end method
