package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: compiled from: DeserializationConfiguration.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface DeserializationConfiguration {

    /* JADX INFO: compiled from: DeserializationConfiguration.kt */
    public static final class DefaultImpls {
        public static boolean getReleaseCoroutines(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration deserializationConfiguration) {
            return false;
        }

        public static boolean getReportErrorsOnPreReleaseDependencies(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration deserializationConfiguration) {
            return false;
        }

        public static boolean getSkipMetadataVersionCheck(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration deserializationConfiguration) {
            return false;
        }

        public static boolean getTypeAliasesAllowed(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration deserializationConfiguration) {
            return true;
        }
    }

    boolean getReleaseCoroutines();

    boolean getReportErrorsOnPreReleaseDependencies();

    boolean getSkipMetadataVersionCheck();

    boolean getTypeAliasesAllowed();

    /* JADX INFO: compiled from: DeserializationConfiguration.kt */
    public static final class Default implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration {
        public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration.Default INSTANCE = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration.Default();

        private Default() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean getReleaseCoroutines() {
            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration.DefaultImpls.getReleaseCoroutines(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean getReportErrorsOnPreReleaseDependencies() {
            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration.DefaultImpls.getReportErrorsOnPreReleaseDependencies(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean getSkipMetadataVersionCheck() {
            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration.DefaultImpls.getSkipMetadataVersionCheck(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean getTypeAliasesAllowed() {
            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration.DefaultImpls.getTypeAliasesAllowed(this);
        }
    }
}
