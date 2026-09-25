package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: compiled from: LocalClassifierTypeSettings.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface LocalClassifierTypeSettings {
    kotlin.reflect.jvm.internal.impl.types.SimpleType getReplacementTypeForLocalClassifiers();

    /* JADX INFO: compiled from: LocalClassifierTypeSettings.kt */
    public static final class Default implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings {
        public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings.Default INSTANCE = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings.Default();

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings
        public kotlin.reflect.jvm.internal.impl.types.SimpleType getReplacementTypeForLocalClassifiers() {
            return null;
        }

        private Default() {
        }
    }
}
