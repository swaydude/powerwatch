.class public final enum Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;
.super Ljava/lang/Enum;
.source "CloudInterceptLogger.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Level"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

.field public static final enum BASIC:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

.field public static final enum BODY:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

.field public static final enum HEADERS:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

.field public static final enum NONE:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 37
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;->NONE:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    .line 48
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    const-string v3, "BASIC"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;->BASIC:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    .line 66
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    const-string v5, "HEADERS"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;->HEADERS:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    .line 88
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    const-string v7, "BODY"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;->BODY:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    const/4 v7, 0x4

    new-array v7, v7, [Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 35
    sput-object v7, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;->$VALUES:[Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            "$enum$name",
            "$enum$ordinal"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 35
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8000
        }
        names = {
            "name"
        }
    .end annotation

    .line 35
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    return-object p0
.end method

.method public static values()[Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;
    .locals 1

    .line 35
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;->$VALUES:[Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    invoke-virtual {v0}, [Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    return-object v0
.end method
