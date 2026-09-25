package kotlin.text.jdk8;

/* JADX INFO: compiled from: RegexExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0002¨\u0006\u0005"}, d2 = {"get", "Lkotlin/text/MatchGroup;", "Lkotlin/text/MatchGroupCollection;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 1, 13}, pn = "kotlin.text")
public final class RegexExtensionsJDK8Kt {
    public static final kotlin.text.MatchGroup get(kotlin.text.MatchGroupCollection receiver$0, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        if (!(receiver$0 instanceof kotlin.text.MatchNamedGroupCollection)) {
            receiver$0 = null;
        }
        kotlin.text.MatchNamedGroupCollection matchNamedGroupCollection = (kotlin.text.MatchNamedGroupCollection) receiver$0;
        if (matchNamedGroupCollection == null) {
            throw new java.lang.UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        return matchNamedGroupCollection.get(name);
    }
}
