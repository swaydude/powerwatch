package kotlin.time;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087@\u0018\u0000 ¥\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002¥\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010K\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010OJ\u001b\u0010P\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u001e\u0010T\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bV\u0010WJ\u001e\u0010T\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\tH\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bV\u0010XJ\u001b\u0010T\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ\u001a\u0010[\u001a\u00020\\2\b\u0010Q\u001a\u0004\u0018\u00010]HÖ\u0003¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\tHÖ\u0001¢\u0006\u0004\ba\u0010\rJ\r\u0010b\u001a\u00020\\¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\\H\u0002¢\u0006\u0004\bf\u0010dJ\u000f\u0010g\u001a\u00020\\H\u0002¢\u0006\u0004\bh\u0010dJ\r\u0010i\u001a\u00020\\¢\u0006\u0004\bj\u0010dJ\r\u0010k\u001a\u00020\\¢\u0006\u0004\bl\u0010dJ\r\u0010m\u001a\u00020\\¢\u0006\u0004\bn\u0010dJ\u001b\u0010o\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bp\u0010qJ\u001b\u0010r\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bs\u0010qJ\u0017\u0010t\u001a\u00020\t2\u0006\u0010I\u001a\u00020\u000fH\u0002¢\u0006\u0004\bu\u0010vJ\u001e\u0010w\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bx\u0010WJ\u001e\u0010w\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\tH\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bx\u0010XJ£\u0001\u0010y\u001a\u0002Hz\"\u0004\b\u0000\u0010z2y\u0010{\u001au\u0012\u0013\u0012\u00110\t¢\u0006\f\b}\u0012\b\b~\u0012\u0004\b\b(\u007f\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0080\u0001\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0081\u0001\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0082\u0001\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0083\u0001\u0012\u0004\u0012\u0002Hz0|H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u008f\u0001\u0010y\u001a\u0002Hz\"\u0004\b\u0000\u0010z2e\u0010{\u001aa\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0080\u0001\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0081\u0001\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0082\u0001\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0083\u0001\u0012\u0004\u0012\u0002Hz0\u0086\u0001H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0087\u0001Jy\u0010y\u001a\u0002Hz\"\u0004\b\u0000\u0010z2O\u0010{\u001aK\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0081\u0001\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0082\u0001\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0083\u0001\u0012\u0004\u0012\u0002Hz0\u0088\u0001H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0089\u0001Jc\u0010y\u001a\u0002Hz\"\u0004\b\u0000\u0010z29\u0010{\u001a5\u0012\u0014\u0012\u00120\u0003¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0082\u0001\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0083\u0001\u0012\u0004\u0012\u0002Hz0\u008a\u0001H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0006\b\u0084\u0001\u0010\u008b\u0001J\u001e\u0010\u008c\u0001\u001a\u00020\u000f2\f\u0010\u008d\u0001\u001a\u00070Dj\u0003`\u008e\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001e\u0010\u0091\u0001\u001a\u00020\t2\f\u0010\u008d\u0001\u001a\u00070Dj\u0003`\u008e\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0011\u0010\u0094\u0001\u001a\u00030\u0095\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001e\u0010\u0098\u0001\u001a\u00020\u00032\f\u0010\u008d\u0001\u001a\u00070Dj\u0003`\u008e\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0011\u0010\u009b\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u009c\u0001\u0010\u0005J\u0011\u0010\u009d\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u009e\u0001\u0010\u0005J\u0013\u0010\u009f\u0001\u001a\u00030\u0095\u0001H\u0016¢\u0006\u0006\b \u0001\u0010\u0097\u0001J*\u0010\u009f\u0001\u001a\u00030\u0095\u00012\f\u0010\u008d\u0001\u001a\u00070Dj\u0003`\u008e\u00012\t\b\u0002\u0010¡\u0001\u001a\u00020\t¢\u0006\u0006\b \u0001\u0010¢\u0001J\u0018\u0010£\u0001\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b¤\u0001\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00008Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\u0012R\u001a\u0010%\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b&\u0010\u000b\u001a\u0004\b'\u0010\u0005R\u001a\u0010(\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010\u000b\u001a\u0004\b*\u0010\u0005R\u001a\u0010+\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u000b\u001a\u0004\b-\u0010\u0005R\u001a\u0010.\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010\u000b\u001a\u0004\b0\u0010\u0005R\u001a\u00101\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u0010\u000b\u001a\u0004\b3\u0010\u0005R\u001a\u00104\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010\u000b\u001a\u0004\b6\u0010\u0005R\u001a\u00107\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u0010\u000b\u001a\u0004\b9\u0010\u0005R\u001a\u0010:\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b;\u0010\u000b\u001a\u0004\b<\u0010\rR\u001a\u0010=\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b>\u0010\u000b\u001a\u0004\b?\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010@\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bA\u0010\u000b\u001a\u0004\bB\u0010\rR\u0014\u0010C\u001a\u00020D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0015\u0010G\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\rR\u0014\u0010I\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006¦\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "absoluteValue", "getAbsoluteValue-UwyO8pc", "hoursComponent", "", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "(J)I", "inDays", "", "getInDays$annotations", "getInDays-impl", "(J)D", "inHours", "getInHours$annotations", "getInHours-impl", "inMicroseconds", "getInMicroseconds$annotations", "getInMicroseconds-impl", "inMilliseconds", "getInMilliseconds$annotations", "getInMilliseconds-impl", "inMinutes", "getInMinutes$annotations", "getInMinutes-impl", "inNanoseconds", "getInNanoseconds$annotations", "getInNanoseconds-impl", "inSeconds", "getInSeconds$annotations", "getInSeconds-impl", "inWholeDays", "getInWholeDays$annotations", "getInWholeDays-impl", "inWholeHours", "getInWholeHours$annotations", "getInWholeHours-impl", "inWholeMicroseconds", "getInWholeMicroseconds$annotations", "getInWholeMicroseconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds$annotations", "getInWholeMilliseconds-impl", "inWholeMinutes", "getInWholeMinutes$annotations", "getInWholeMinutes-impl", "inWholeNanoseconds", "getInWholeNanoseconds$annotations", "getInWholeNanoseconds-impl", "inWholeSeconds", "getInWholeSeconds$annotations", "getInWholeSeconds-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "storageUnit", "Ljava/util/concurrent/TimeUnit;", "getStorageUnit-impl", "(J)Ljava/util/concurrent/TimeUnit;", "unitDiscriminator", "getUnitDiscriminator-impl", "value", "getValue-impl", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "compareTo", com.google.android.gms.fitness.FitnessActivities.OTHER, "compareTo-LRDsOJo", "(JJ)I", "div", "scale", "div-UwyO8pc", "(JD)J", "(JI)J", "div-LRDsOJo", "(JJ)D", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(J)Z", "isInMillis", "isInMillis-impl", "isInNanos", "isInNanos-impl", "isInfinite", "isInfinite-impl", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "minus", "minus-LRDsOJo", "(JJ)J", "plus", "plus-LRDsOJo", "precision", "precision-impl", "(JD)I", "times", "times-UwyO8pc", "toComponents", "T", "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble", "unit", "Lkotlin/time/DurationUnit;", "toDouble-impl", "(JLjava/util/concurrent/TimeUnit;)D", "toInt", "toInt-impl", "(JLjava/util/concurrent/TimeUnit;)I", "toIsoString", "", "toIsoString-impl", "(J)Ljava/lang/String;", "toLong", "toLong-impl", "(JLjava/util/concurrent/TimeUnit;)J", "toLongMilliseconds", "toLongMilliseconds-impl", "toLongNanoseconds", "toLongNanoseconds-impl", "toString", "toString-impl", "decimals", "(JLjava/util/concurrent/TimeUnit;I)Ljava/lang/String;", "unaryMinus", "unaryMinus-UwyO8pc", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
@kotlin.jvm.JvmInline
public final class Duration implements java.lang.Comparable<kotlin.time.Duration> {
    private final long rawValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.time.Duration.Companion INSTANCE = new kotlin.time.Duration.Companion(null);
    private static final long ZERO = m1311constructorimpl(0);
    private static final long INFINITE = kotlin.time.DurationKt.durationOfMillis(kotlin.time.DurationKt.MAX_MILLIS);
    private static final long NEG_INFINITE = kotlin.time.DurationKt.durationOfMillis(-4611686018427387903L);

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.time.Duration m1309boximpl(long j) {
        return new kotlin.time.Duration(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1315equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof kotlin.time.Duration) && j == ((kotlin.time.Duration) obj).getRawValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1316equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    @kotlin.Deprecated(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    public static /* synthetic */ void getInDays$annotations() {
    }

    @kotlin.Deprecated(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    public static /* synthetic */ void getInHours$annotations() {
    }

    @kotlin.Deprecated(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    public static /* synthetic */ void getInMicroseconds$annotations() {
    }

    @kotlin.Deprecated(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    public static /* synthetic */ void getInMilliseconds$annotations() {
    }

    @kotlin.Deprecated(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    public static /* synthetic */ void getInMinutes$annotations() {
    }

    @kotlin.Deprecated(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    public static /* synthetic */ void getInNanoseconds$annotations() {
    }

    @kotlin.Deprecated(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    public static /* synthetic */ void getInSeconds$annotations() {
    }

    public static /* synthetic */ void getInWholeDays$annotations() {
    }

    public static /* synthetic */ void getInWholeHours$annotations() {
    }

    public static /* synthetic */ void getInWholeMicroseconds$annotations() {
    }

    public static /* synthetic */ void getInWholeMilliseconds$annotations() {
    }

    public static /* synthetic */ void getInWholeMinutes$annotations() {
    }

    public static /* synthetic */ void getInWholeNanoseconds$annotations() {
    }

    public static /* synthetic */ void getInWholeSeconds$annotations() {
    }

    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* JADX INFO: renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m1337getUnitDiscriminatorimpl(long j) {
        return ((int) j) & 1;
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    private static final long m1338getValueimpl(long j) {
        return j >> 1;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1339hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m1341isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    /* JADX INFO: renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m1342isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    /* JADX INFO: renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m1344isNegativeimpl(long j) {
        return j < 0;
    }

    /* JADX INFO: renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m1345isPositiveimpl(long j) {
        return j > 0;
    }

    /* JADX INFO: renamed from: precision-impl, reason: not valid java name */
    private static final int m1348precisionimpl(long j, double d) {
        if (d < 1) {
            return 3;
        }
        if (d < 10) {
            return 2;
        }
        return d < ((double) 100) ? 1 : 0;
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m1365compareToLRDsOJo(long j) {
        return m1310compareToLRDsOJo(this.rawValue, j);
    }

    public boolean equals(java.lang.Object obj) {
        return m1315equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m1339hashCodeimpl(this.rawValue);
    }

    public java.lang.String toString() {
        return m1361toStringimpl(this.rawValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    private /* synthetic */ Duration(long j) {
        this.rawValue = j;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kotlin.time.Duration duration) {
        return m1365compareToLRDsOJo(duration.getRawValue());
    }

    /* JADX INFO: renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final java.util.concurrent.TimeUnit m1336getStorageUnitimpl(long j) {
        return m1342isInNanosimpl(j) ? java.util.concurrent.TimeUnit.NANOSECONDS : java.util.concurrent.TimeUnit.MILLISECONDS;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1311constructorimpl(long j) {
        if (m1342isInNanosimpl(j)) {
            long jM1338getValueimpl = m1338getValueimpl(j);
            if (-4611686018426999999L > jM1338getValueimpl || kotlin.time.DurationKt.MAX_NANOS < jM1338getValueimpl) {
                throw new java.lang.AssertionError(m1338getValueimpl(j) + " ns is out of nanoseconds range");
            }
        } else {
            long jM1338getValueimpl2 = m1338getValueimpl(j);
            if (-4611686018427387903L > jM1338getValueimpl2 || kotlin.time.DurationKt.MAX_MILLIS < jM1338getValueimpl2) {
                throw new java.lang.AssertionError(m1338getValueimpl(j) + " ms is out of milliseconds range");
            }
            long jM1338getValueimpl3 = m1338getValueimpl(j);
            if (-4611686018426L <= jM1338getValueimpl3 && 4611686018426L >= jM1338getValueimpl3) {
                throw new java.lang.AssertionError(m1338getValueimpl(j) + " ms is denormalized");
            }
        }
        return j;
    }

    /* JADX INFO: compiled from: Duration.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u000f\u001a\u00060\u0010j\u0002`\u00112\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011J\u001d\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0017J\u001d\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u001d\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0015J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u001d\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u0015J\u001d\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u0017J\u001d\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u0019J\u001d\u0010\"\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u0015J\u001d\u0010\"\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u0017J\u001d\u0010\"\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u0019J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u0015J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u0017J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u0019R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006&"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "()V", "INFINITE", "Lkotlin/time/Duration;", "getINFINITE-UwyO8pc", "()J", "J", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "ZERO", "getZERO-UwyO8pc", "convert", "", "value", "sourceUnit", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "targetUnit", "days", "days-UwyO8pc", "(D)J", "", "(I)J", "", "(J)J", "hours", "hours-UwyO8pc", "microseconds", "microseconds-UwyO8pc", "milliseconds", "milliseconds-UwyO8pc", "minutes", "minutes-UwyO8pc", "nanoseconds", "nanoseconds-UwyO8pc", "seconds", "seconds-UwyO8pc", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m1372getZEROUwyO8pc() {
            return kotlin.time.Duration.ZERO;
        }

        /* JADX INFO: renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m1370getINFINITEUwyO8pc() {
            return kotlin.time.Duration.INFINITE;
        }

        /* JADX INFO: renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m1371getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return kotlin.time.Duration.NEG_INFINITE;
        }

        public final double convert(double value, java.util.concurrent.TimeUnit sourceUnit, java.util.concurrent.TimeUnit targetUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return kotlin.time.DurationUnitKt.convertDurationUnit(value, sourceUnit, targetUnit);
        }

        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final long m1386nanosecondsUwyO8pc(int value) {
            return kotlin.time.DurationKt.toDuration(value, java.util.concurrent.TimeUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final long m1387nanosecondsUwyO8pc(long value) {
            return kotlin.time.DurationKt.toDuration(value, java.util.concurrent.TimeUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final long m1385nanosecondsUwyO8pc(double value) {
            return kotlin.time.DurationKt.toDuration(value, java.util.concurrent.TimeUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final long m1377microsecondsUwyO8pc(int value) {
            return kotlin.time.DurationKt.toDuration(value, java.util.concurrent.TimeUnit.MICROSECONDS);
        }

        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final long m1378microsecondsUwyO8pc(long value) {
            return kotlin.time.DurationKt.toDuration(value, java.util.concurrent.TimeUnit.MICROSECONDS);
        }

        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final long m1376microsecondsUwyO8pc(double value) {
            return kotlin.time.DurationKt.toDuration(value, java.util.concurrent.TimeUnit.MICROSECONDS);
        }

        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final long m1380millisecondsUwyO8pc(int value) {
            return kotlin.time.DurationKt.toDuration(value, java.util.concurrent.TimeUnit.MILLISECONDS);
        }

        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final long m1381millisecondsUwyO8pc(long value) {
            return kotlin.time.DurationKt.toDuration(value, java.util.concurrent.TimeUnit.MILLISECONDS);
        }

        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final long m1379millisecondsUwyO8pc(double value) {
            return kotlin.time.DurationKt.toDuration(value, java.util.concurrent.TimeUnit.MILLISECONDS);
        }

        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final long m1389secondsUwyO8pc(int value) {
            return kotlin.time.DurationKt.toDuration(value, java.util.concurrent.TimeUnit.SECONDS);
        }

        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final long m1390secondsUwyO8pc(long value) {
            return kotlin.time.DurationKt.toDuration(value, java.util.concurrent.TimeUnit.SECONDS);
        }

        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final long m1388secondsUwyO8pc(double value) {
            return kotlin.time.DurationKt.toDuration(value, java.util.concurrent.TimeUnit.SECONDS);
        }

        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final long m1383minutesUwyO8pc(int value) {
            return kotlin.time.DurationKt.toDuration(value, java.util.concurrent.TimeUnit.MINUTES);
        }

        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final long m1384minutesUwyO8pc(long value) {
            return kotlin.time.DurationKt.toDuration(value, java.util.concurrent.TimeUnit.MINUTES);
        }

        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final long m1382minutesUwyO8pc(double value) {
            return kotlin.time.DurationKt.toDuration(value, java.util.concurrent.TimeUnit.MINUTES);
        }

        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final long m1374hoursUwyO8pc(int value) {
            return kotlin.time.DurationKt.toDuration(value, java.util.concurrent.TimeUnit.HOURS);
        }

        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final long m1375hoursUwyO8pc(long value) {
            return kotlin.time.DurationKt.toDuration(value, java.util.concurrent.TimeUnit.HOURS);
        }

        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final long m1373hoursUwyO8pc(double value) {
            return kotlin.time.DurationKt.toDuration(value, java.util.concurrent.TimeUnit.HOURS);
        }

        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final long m1368daysUwyO8pc(int value) {
            return kotlin.time.DurationKt.toDuration(value, java.util.concurrent.TimeUnit.DAYS);
        }

        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final long m1369daysUwyO8pc(long value) {
            return kotlin.time.DurationKt.toDuration(value, java.util.concurrent.TimeUnit.DAYS);
        }

        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final long m1367daysUwyO8pc(double value) {
            return kotlin.time.DurationKt.toDuration(value, java.util.concurrent.TimeUnit.DAYS);
        }
    }

    /* JADX INFO: renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m1364unaryMinusUwyO8pc(long j) {
        return kotlin.time.DurationKt.durationOf(-m1338getValueimpl(j), ((int) j) & 1);
    }

    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m1347plusLRDsOJo(long j, long j2) {
        if (m1343isInfiniteimpl(j)) {
            if (m1340isFiniteimpl(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new java.lang.IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m1343isInfiniteimpl(j2)) {
            return j2;
        }
        if ((((int) j) & 1) == (((int) j2) & 1)) {
            long jM1338getValueimpl = m1338getValueimpl(j) + m1338getValueimpl(j2);
            return m1342isInNanosimpl(j) ? kotlin.time.DurationKt.durationOfNanosNormalized(jM1338getValueimpl) : kotlin.time.DurationKt.durationOfMillisNormalized(jM1338getValueimpl);
        }
        if (m1341isInMillisimpl(j)) {
            return m1308addValuesMixedRangesUwyO8pc(j, m1338getValueimpl(j), m1338getValueimpl(j2));
        }
        return m1308addValuesMixedRangesUwyO8pc(j, m1338getValueimpl(j2), m1338getValueimpl(j));
    }

    /* JADX INFO: renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m1308addValuesMixedRangesUwyO8pc(long j, long j2, long j3) {
        long jNanosToMillis = kotlin.time.DurationKt.nanosToMillis(j3);
        long j4 = j2 + jNanosToMillis;
        if (-4611686018426L <= j4 && 4611686018426L >= j4) {
            return kotlin.time.DurationKt.durationOfNanos(kotlin.time.DurationKt.millisToNanos(j4) + (j3 - kotlin.time.DurationKt.millisToNanos(jNanosToMillis)));
        }
        return kotlin.time.DurationKt.durationOfMillis(kotlin.ranges.RangesKt.coerceIn(j4, -4611686018427387903L, kotlin.time.DurationKt.MAX_MILLIS));
    }

    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m1346minusLRDsOJo(long j, long j2) {
        return m1347plusLRDsOJo(j, m1364unaryMinusUwyO8pc(j2));
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m1350timesUwyO8pc(long j, int i) {
        if (m1343isInfiniteimpl(j)) {
            if (i != 0) {
                return i > 0 ? j : m1364unaryMinusUwyO8pc(j);
            }
            throw new java.lang.IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i == 0) {
            return ZERO;
        }
        long jM1338getValueimpl = m1338getValueimpl(j);
        long j2 = i;
        long j3 = jM1338getValueimpl * j2;
        if (!m1342isInNanosimpl(j)) {
            if (j3 / j2 == jM1338getValueimpl) {
                return kotlin.time.DurationKt.durationOfMillis(kotlin.ranges.RangesKt.coerceIn(j3, new kotlin.ranges.LongRange(-4611686018427387903L, kotlin.time.DurationKt.MAX_MILLIS)));
            }
            return kotlin.math.MathKt.getSign(jM1338getValueimpl) * kotlin.math.MathKt.getSign(i) > 0 ? INFINITE : NEG_INFINITE;
        }
        if (-2147483647L <= jM1338getValueimpl && 2147483647L >= jM1338getValueimpl) {
            return kotlin.time.DurationKt.durationOfNanos(j3);
        }
        if (j3 / j2 == jM1338getValueimpl) {
            return kotlin.time.DurationKt.durationOfNanosNormalized(j3);
        }
        long jNanosToMillis = kotlin.time.DurationKt.nanosToMillis(jM1338getValueimpl);
        long j4 = jNanosToMillis * j2;
        long jNanosToMillis2 = kotlin.time.DurationKt.nanosToMillis((jM1338getValueimpl - kotlin.time.DurationKt.millisToNanos(jNanosToMillis)) * j2) + j4;
        if (j4 / j2 != jNanosToMillis || (jNanosToMillis2 ^ j4) < 0) {
            return kotlin.math.MathKt.getSign(jM1338getValueimpl) * kotlin.math.MathKt.getSign(i) > 0 ? INFINITE : NEG_INFINITE;
        }
        return kotlin.time.DurationKt.durationOfMillis(kotlin.ranges.RangesKt.coerceIn(jNanosToMillis2, new kotlin.ranges.LongRange(-4611686018427387903L, kotlin.time.DurationKt.MAX_MILLIS)));
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m1349timesUwyO8pc(long j, double d) {
        int iRoundToInt = kotlin.math.MathKt.roundToInt(d);
        if (iRoundToInt == d) {
            return m1350timesUwyO8pc(j, iRoundToInt);
        }
        java.util.concurrent.TimeUnit timeUnitM1336getStorageUnitimpl = m1336getStorageUnitimpl(j);
        return kotlin.time.DurationKt.toDuration(m1355toDoubleimpl(j, timeUnitM1336getStorageUnitimpl) * d, timeUnitM1336getStorageUnitimpl);
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m1314divUwyO8pc(long j, int i) {
        if (i == 0) {
            if (m1345isPositiveimpl(j)) {
                return INFINITE;
            }
            if (m1344isNegativeimpl(j)) {
                return NEG_INFINITE;
            }
            throw new java.lang.IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m1342isInNanosimpl(j)) {
            return kotlin.time.DurationKt.durationOfNanos(m1338getValueimpl(j) / ((long) i));
        }
        if (m1343isInfiniteimpl(j)) {
            return m1350timesUwyO8pc(j, kotlin.math.MathKt.getSign(i));
        }
        long j2 = i;
        long jM1338getValueimpl = m1338getValueimpl(j) / j2;
        if (-4611686018426L <= jM1338getValueimpl && 4611686018426L >= jM1338getValueimpl) {
            return kotlin.time.DurationKt.durationOfNanos(kotlin.time.DurationKt.millisToNanos(jM1338getValueimpl) + (kotlin.time.DurationKt.millisToNanos(m1338getValueimpl(j) - (jM1338getValueimpl * j2)) / j2));
        }
        return kotlin.time.DurationKt.durationOfMillis(jM1338getValueimpl);
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m1313divUwyO8pc(long j, double d) {
        int iRoundToInt = kotlin.math.MathKt.roundToInt(d);
        if (iRoundToInt == d && iRoundToInt != 0) {
            return m1314divUwyO8pc(j, iRoundToInt);
        }
        java.util.concurrent.TimeUnit timeUnitM1336getStorageUnitimpl = m1336getStorageUnitimpl(j);
        return kotlin.time.DurationKt.toDuration(m1355toDoubleimpl(j, timeUnitM1336getStorageUnitimpl) / d, timeUnitM1336getStorageUnitimpl);
    }

    /* JADX INFO: renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m1312divLRDsOJo(long j, long j2) {
        java.util.concurrent.TimeUnit timeUnit = (java.util.concurrent.TimeUnit) kotlin.comparisons.ComparisonsKt.maxOf(m1336getStorageUnitimpl(j), m1336getStorageUnitimpl(j2));
        return m1355toDoubleimpl(j, timeUnit) / m1355toDoubleimpl(j2, timeUnit);
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m1343isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m1340isFiniteimpl(long j) {
        return !m1343isInfiniteimpl(j);
    }

    /* JADX INFO: renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m1317getAbsoluteValueUwyO8pc(long j) {
        return m1344isNegativeimpl(j) ? m1364unaryMinusUwyO8pc(j) : j;
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m1310compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return (j > j2 ? 1 : (j == j2 ? 0 : -1));
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m1344isNegativeimpl(j) ? -i : i;
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1354toComponentsimpl(long j, kotlin.jvm.functions.Function5<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(java.lang.Integer.valueOf(m1356toIntimpl(j, java.util.concurrent.TimeUnit.DAYS)), java.lang.Integer.valueOf(m1318getHoursComponentimpl(j)), java.lang.Integer.valueOf(m1333getMinutesComponentimpl(j)), java.lang.Integer.valueOf(m1335getSecondsComponentimpl(j)), java.lang.Integer.valueOf(m1334getNanosecondsComponentimpl(j)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1353toComponentsimpl(long j, kotlin.jvm.functions.Function4<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(java.lang.Integer.valueOf(m1356toIntimpl(j, java.util.concurrent.TimeUnit.HOURS)), java.lang.Integer.valueOf(m1333getMinutesComponentimpl(j)), java.lang.Integer.valueOf(m1335getSecondsComponentimpl(j)), java.lang.Integer.valueOf(m1334getNanosecondsComponentimpl(j)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1352toComponentsimpl(long j, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(java.lang.Integer.valueOf(m1356toIntimpl(j, java.util.concurrent.TimeUnit.MINUTES)), java.lang.Integer.valueOf(m1335getSecondsComponentimpl(j)), java.lang.Integer.valueOf(m1334getNanosecondsComponentimpl(j)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1351toComponentsimpl(long j, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Integer, ? extends T> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(java.lang.Long.valueOf(m1332getInWholeSecondsimpl(j)), java.lang.Integer.valueOf(m1334getNanosecondsComponentimpl(j)));
    }

    /* JADX INFO: renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m1318getHoursComponentimpl(long j) {
        if (m1343isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m1327getInWholeHoursimpl(j) % ((long) 24));
    }

    /* JADX INFO: renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m1333getMinutesComponentimpl(long j) {
        if (m1343isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m1330getInWholeMinutesimpl(j) % ((long) 60));
    }

    /* JADX INFO: renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m1335getSecondsComponentimpl(long j) {
        if (m1343isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m1332getInWholeSecondsimpl(j) % ((long) 60));
    }

    /* JADX INFO: renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m1334getNanosecondsComponentimpl(long j) {
        long jM1338getValueimpl;
        if (m1343isInfiniteimpl(j)) {
            return 0;
        }
        if (m1341isInMillisimpl(j)) {
            jM1338getValueimpl = kotlin.time.DurationKt.millisToNanos(m1338getValueimpl(j) % ((long) 1000));
        } else {
            jM1338getValueimpl = m1338getValueimpl(j) % ((long) 1000000000);
        }
        return (int) jM1338getValueimpl;
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m1355toDoubleimpl(long j, java.util.concurrent.TimeUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return kotlin.time.DurationUnitKt.convertDurationUnit(m1338getValueimpl(j), m1336getStorageUnitimpl(j), unit);
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m1358toLongimpl(long j, java.util.concurrent.TimeUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return kotlin.time.DurationUnitKt.convertDurationUnit(m1338getValueimpl(j), m1336getStorageUnitimpl(j), unit);
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m1356toIntimpl(long j, java.util.concurrent.TimeUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) kotlin.ranges.RangesKt.coerceIn(m1358toLongimpl(j, unit), Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: getInDays-impl, reason: not valid java name */
    public static final double m1319getInDaysimpl(long j) {
        return m1355toDoubleimpl(j, java.util.concurrent.TimeUnit.DAYS);
    }

    /* JADX INFO: renamed from: getInHours-impl, reason: not valid java name */
    public static final double m1320getInHoursimpl(long j) {
        return m1355toDoubleimpl(j, java.util.concurrent.TimeUnit.HOURS);
    }

    /* JADX INFO: renamed from: getInMinutes-impl, reason: not valid java name */
    public static final double m1323getInMinutesimpl(long j) {
        return m1355toDoubleimpl(j, java.util.concurrent.TimeUnit.MINUTES);
    }

    /* JADX INFO: renamed from: getInSeconds-impl, reason: not valid java name */
    public static final double m1325getInSecondsimpl(long j) {
        return m1355toDoubleimpl(j, java.util.concurrent.TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: getInMilliseconds-impl, reason: not valid java name */
    public static final double m1322getInMillisecondsimpl(long j) {
        return m1355toDoubleimpl(j, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: getInMicroseconds-impl, reason: not valid java name */
    public static final double m1321getInMicrosecondsimpl(long j) {
        return m1355toDoubleimpl(j, java.util.concurrent.TimeUnit.MICROSECONDS);
    }

    /* JADX INFO: renamed from: getInNanoseconds-impl, reason: not valid java name */
    public static final double m1324getInNanosecondsimpl(long j) {
        return m1355toDoubleimpl(j, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m1326getInWholeDaysimpl(long j) {
        return m1358toLongimpl(j, java.util.concurrent.TimeUnit.DAYS);
    }

    /* JADX INFO: renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m1327getInWholeHoursimpl(long j) {
        return m1358toLongimpl(j, java.util.concurrent.TimeUnit.HOURS);
    }

    /* JADX INFO: renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m1330getInWholeMinutesimpl(long j) {
        return m1358toLongimpl(j, java.util.concurrent.TimeUnit.MINUTES);
    }

    /* JADX INFO: renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m1332getInWholeSecondsimpl(long j) {
        return m1358toLongimpl(j, java.util.concurrent.TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m1329getInWholeMillisecondsimpl(long j) {
        return (m1341isInMillisimpl(j) && m1340isFiniteimpl(j)) ? m1338getValueimpl(j) : m1358toLongimpl(j, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m1328getInWholeMicrosecondsimpl(long j) {
        return m1358toLongimpl(j, java.util.concurrent.TimeUnit.MICROSECONDS);
    }

    /* JADX INFO: renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m1331getInWholeNanosecondsimpl(long j) {
        long jM1338getValueimpl = m1338getValueimpl(j);
        if (m1342isInNanosimpl(j)) {
            return jM1338getValueimpl;
        }
        if (jM1338getValueimpl > 9223372036854L) {
            return kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
        }
        if (jM1338getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return kotlin.time.DurationKt.millisToNanos(jM1338getValueimpl);
    }

    @kotlin.Deprecated(message = "Use inWholeNanoseconds property instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.inWholeNanoseconds", imports = {}))
    /* JADX INFO: renamed from: toLongNanoseconds-impl, reason: not valid java name */
    public static final long m1360toLongNanosecondsimpl(long j) {
        return m1331getInWholeNanosecondsimpl(j);
    }

    @kotlin.Deprecated(message = "Use inWholeMilliseconds property instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.inWholeMilliseconds", imports = {}))
    /* JADX INFO: renamed from: toLongMilliseconds-impl, reason: not valid java name */
    public static final long m1359toLongMillisecondsimpl(long j) {
        return m1329getInWholeMillisecondsimpl(j);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b0  */
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1361toStringimpl(long j) {
        java.util.concurrent.TimeUnit timeUnit;
        int i;
        double dM1355toDoubleimpl;
        java.lang.String toExactDecimals;
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        double dM1355toDoubleimpl2 = m1355toDoubleimpl(m1317getAbsoluteValueUwyO8pc(j), java.util.concurrent.TimeUnit.NANOSECONDS);
        boolean z = false;
        if (dM1355toDoubleimpl2 < 1.0E-6d) {
            timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        } else {
            if (dM1355toDoubleimpl2 < 1) {
                timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
                i = 7;
            } else {
                if (dM1355toDoubleimpl2 < 1000.0d) {
                    timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
                } else if (dM1355toDoubleimpl2 < 1000000.0d) {
                    timeUnit = java.util.concurrent.TimeUnit.MICROSECONDS;
                } else if (dM1355toDoubleimpl2 < 1.0E9d) {
                    timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                } else if (dM1355toDoubleimpl2 < 1.0E12d) {
                    timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                } else if (dM1355toDoubleimpl2 < 6.0E13d) {
                    timeUnit = java.util.concurrent.TimeUnit.MINUTES;
                } else if (dM1355toDoubleimpl2 < 3.6E15d) {
                    timeUnit = java.util.concurrent.TimeUnit.HOURS;
                } else if (dM1355toDoubleimpl2 < 8.64E20d) {
                    timeUnit = java.util.concurrent.TimeUnit.DAYS;
                } else {
                    timeUnit = java.util.concurrent.TimeUnit.DAYS;
                }
                i = 0;
            }
            dM1355toDoubleimpl = m1355toDoubleimpl(j, timeUnit);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (z) {
                toExactDecimals = kotlin.time.FormatToDecimalsKt.formatScientific(dM1355toDoubleimpl);
            } else if (i > 0) {
                toExactDecimals = kotlin.time.FormatToDecimalsKt.formatUpToDecimals(dM1355toDoubleimpl, i);
            } else {
                toExactDecimals = kotlin.time.FormatToDecimalsKt.formatToExactDecimals(dM1355toDoubleimpl, m1348precisionimpl(j, java.lang.Math.abs(dM1355toDoubleimpl)));
            }
            sb.append(toExactDecimals);
            sb.append(kotlin.time.DurationUnitKt.shortName(timeUnit));
            return sb.toString();
        }
        i = 0;
        z = true;
        dM1355toDoubleimpl = m1355toDoubleimpl(j, timeUnit);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        if (z) {
            toExactDecimals = kotlin.time.FormatToDecimalsKt.formatScientific(dM1355toDoubleimpl);
        } else if (i > 0) {
            toExactDecimals = kotlin.time.FormatToDecimalsKt.formatUpToDecimals(dM1355toDoubleimpl, i);
        } else {
            toExactDecimals = kotlin.time.FormatToDecimalsKt.formatToExactDecimals(dM1355toDoubleimpl, m1348precisionimpl(j, java.lang.Math.abs(dM1355toDoubleimpl)));
        }
        sb2.append(toExactDecimals);
        sb2.append(kotlin.time.DurationUnitKt.shortName(timeUnit));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m1363toStringimpl$default(long j, java.util.concurrent.TimeUnit timeUnit, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m1362toStringimpl(j, timeUnit, i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static final java.lang.String m1362toStringimpl(long j, java.util.concurrent.TimeUnit unit, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        if (!(i >= 0)) {
            throw new java.lang.IllegalArgumentException(("decimals must be not negative, but was " + i).toString());
        }
        double dM1355toDoubleimpl = m1355toDoubleimpl(j, unit);
        if (java.lang.Double.isInfinite(dM1355toDoubleimpl)) {
            return java.lang.String.valueOf(dM1355toDoubleimpl);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.Math.abs(dM1355toDoubleimpl) < 1.0E14d ? kotlin.time.FormatToDecimalsKt.formatToExactDecimals(dM1355toDoubleimpl, kotlin.ranges.RangesKt.coerceAtMost(i, 12)) : kotlin.time.FormatToDecimalsKt.formatScientific(dM1355toDoubleimpl));
        sb.append(kotlin.time.DurationUnitKt.shortName(unit));
        return sb.toString();
    }

    /* JADX INFO: renamed from: toIsoString-impl, reason: not valid java name */
    public static final java.lang.String m1357toIsoStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (m1344isNegativeimpl(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long jM1317getAbsoluteValueUwyO8pc = m1317getAbsoluteValueUwyO8pc(j);
        int iM1356toIntimpl = m1356toIntimpl(jM1317getAbsoluteValueUwyO8pc, java.util.concurrent.TimeUnit.HOURS);
        int iM1333getMinutesComponentimpl = m1333getMinutesComponentimpl(jM1317getAbsoluteValueUwyO8pc);
        int iM1335getSecondsComponentimpl = m1335getSecondsComponentimpl(jM1317getAbsoluteValueUwyO8pc);
        int iM1334getNanosecondsComponentimpl = m1334getNanosecondsComponentimpl(jM1317getAbsoluteValueUwyO8pc);
        boolean z = true;
        boolean z2 = iM1356toIntimpl != 0;
        boolean z3 = (iM1335getSecondsComponentimpl == 0 && iM1334getNanosecondsComponentimpl == 0) ? false : true;
        if (iM1333getMinutesComponentimpl == 0 && (!z3 || !z2)) {
            z = false;
        }
        if (z2) {
            sb.append(iM1356toIntimpl);
            sb.append('H');
        }
        if (z) {
            sb.append(iM1333getMinutesComponentimpl);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            sb.append(iM1335getSecondsComponentimpl);
            if (iM1334getNanosecondsComponentimpl != 0) {
                sb.append('.');
                java.lang.String strPadStart = kotlin.text.StringsKt.padStart(java.lang.String.valueOf(iM1334getNanosecondsComponentimpl), 9, '0');
                if (iM1334getNanosecondsComponentimpl % kotlin.time.DurationKt.NANOS_IN_MILLIS == 0) {
                    sb.append((java.lang.CharSequence) strPadStart, 0, 3);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
                } else if (iM1334getNanosecondsComponentimpl % 1000 == 0) {
                    sb.append((java.lang.CharSequence) strPadStart, 0, 6);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
                } else {
                    sb.append(strPadStart);
                }
            }
            sb.append('S');
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
