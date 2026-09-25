package kotlin.internal.jdk8;

/* JADX INFO: compiled from: JDK8PlatformImplementations.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations;", "Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "()V", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 1, 13})
public class JDK8PlatformImplementations extends kotlin.internal.jdk7.JDK7PlatformImplementations {
    @Override // kotlin.internal.PlatformImplementations
    public kotlin.text.MatchGroup getMatchResultNamedGroup(java.util.regex.MatchResult matchResult, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(matchResult, "matchResult");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        if (!(matchResult instanceof java.util.regex.Matcher)) {
            matchResult = null;
        }
        java.util.regex.Matcher matcher = (java.util.regex.Matcher) matchResult;
        if (matcher == null) {
            throw new java.lang.UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(matcher.start(name), matcher.end(name) - 1);
        if (intRange.getStart().intValue() < 0) {
            return null;
        }
        java.lang.String strGroup = matcher.group(name);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strGroup, "matcher.group(name)");
        return new kotlin.text.MatchGroup(strGroup, intRange);
    }

    @Override // kotlin.internal.PlatformImplementations
    public kotlin.random.Random defaultPlatformRandom() {
        return new kotlin.random.jdk8.PlatformThreadLocalRandom();
    }
}
