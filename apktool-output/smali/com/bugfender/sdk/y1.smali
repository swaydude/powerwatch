.class public Lcom/bugfender/sdk/y1;
.super Ljava/text/DateFormat;
.source "SourceFile"


# static fields
.field private static final a:J = 0x1L

.field private static b:Ljava/util/Calendar;

.field private static c:Ljava/text/NumberFormat;

.field private static d:Lcom/bugfender/sdk/y1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/GregorianCalendar;

    invoke-direct {v0}, Ljava/util/GregorianCalendar;-><init>()V

    sput-object v0, Lcom/bugfender/sdk/y1;->b:Ljava/util/Calendar;

    new-instance v0, Ljava/text/DecimalFormat;

    invoke-direct {v0}, Ljava/text/DecimalFormat;-><init>()V

    sput-object v0, Lcom/bugfender/sdk/y1;->c:Ljava/text/NumberFormat;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/text/DateFormat;-><init>()V

    sget-object v0, Lcom/bugfender/sdk/y1;->c:Ljava/text/NumberFormat;

    iput-object v0, p0, Ljava/text/DateFormat;->numberFormat:Ljava/text/NumberFormat;

    sget-object v0, Lcom/bugfender/sdk/y1;->b:Ljava/util/Calendar;

    iput-object v0, p0, Ljava/text/DateFormat;->calendar:Ljava/util/Calendar;

    return-void
.end method

.method public static a()Lcom/bugfender/sdk/y1;
    .locals 2

    sget-object v0, Lcom/bugfender/sdk/y1;->d:Lcom/bugfender/sdk/y1;

    if-nez v0, :cond_1

    const-class v0, Lcom/bugfender/sdk/y1;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/bugfender/sdk/y1;->d:Lcom/bugfender/sdk/y1;

    if-nez v1, :cond_0

    new-instance v1, Lcom/bugfender/sdk/y1;

    invoke-direct {v1}, Lcom/bugfender/sdk/y1;-><init>()V

    sput-object v1, Lcom/bugfender/sdk/y1;->d:Lcom/bugfender/sdk/y1;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lcom/bugfender/sdk/y1;->d:Lcom/bugfender/sdk/y1;

    return-object v0
.end method


# virtual methods
.method public format(Ljava/util/Date;Ljava/lang/StringBuffer;Ljava/text/FieldPosition;)Ljava/lang/StringBuffer;
    .locals 0

    const/4 p3, 0x1

    invoke-static {p1, p3}, Lcom/bugfender/sdk/r0;->a(Ljava/util/Date;Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    return-object p2
.end method

.method public parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/text/ParsePosition;->setIndex(I)V

    invoke-static {p1}, Lcom/bugfender/sdk/r0;->a(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    return-object p1
.end method
