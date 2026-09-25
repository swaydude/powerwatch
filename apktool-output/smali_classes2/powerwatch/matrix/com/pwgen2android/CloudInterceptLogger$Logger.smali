.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;
.super Ljava/lang/Object;
.source "CloudInterceptLogger.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Logger"
.end annotation


# static fields
.field public static final DEFAULT:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 95
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger$1;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger$1;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->DEFAULT:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    return-void
.end method


# virtual methods
.method public abstract log(Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "message"
        }
    .end annotation
.end method
