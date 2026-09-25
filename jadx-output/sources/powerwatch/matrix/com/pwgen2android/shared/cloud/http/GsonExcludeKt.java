package powerwatch.matrix.com.pwgen2android.shared.cloud.http;

/* JADX INFO: compiled from: GsonExclude.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"strategy", "Lcom/google/gson/ExclusionStrategy;", "getStrategy", "()Lcom/google/gson/ExclusionStrategy;", "setStrategy", "(Lcom/google/gson/ExclusionStrategy;)V", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class GsonExcludeKt {
    private static com.google.gson.ExclusionStrategy strategy = new com.google.gson.ExclusionStrategy() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.GsonExcludeKt$strategy$1
        @Override // com.google.gson.ExclusionStrategy
        public boolean shouldSkipClass(java.lang.Class<?> clazz) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "clazz");
            return false;
        }

        @Override // com.google.gson.ExclusionStrategy
        public boolean shouldSkipField(com.google.gson.FieldAttributes field) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "field");
            return field.getAnnotation(powerwatch.matrix.com.pwgen2android.shared.cloud.http.GsonExclude.class) != null;
        }
    };

    public static final com.google.gson.ExclusionStrategy getStrategy() {
        return strategy;
    }

    public static final void setStrategy(com.google.gson.ExclusionStrategy exclusionStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exclusionStrategy, "<set-?>");
        strategy = exclusionStrategy;
    }
}
