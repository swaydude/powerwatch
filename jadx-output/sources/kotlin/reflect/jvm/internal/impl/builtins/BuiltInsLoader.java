package kotlin.reflect.jvm.internal.impl.builtins;

/* JADX INFO: compiled from: BuiltInsLoader.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface BuiltInsLoader {
    public static final kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader.Companion Companion = kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader.Companion.$$INSTANCE;

    kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider createPackageFragmentProvider(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> iterable, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter platformDependentDeclarationFilter, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider additionalClassPartsProvider, boolean z);

    /* JADX INFO: compiled from: BuiltInsLoader.kt */
    public static final class Companion {
        static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader.Companion.class), "Instance", "getInstance()Lorg/jetbrains/kotlin/builtins/BuiltInsLoader;"))};
        static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader.Companion $$INSTANCE = new kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader.Companion();
        private static final kotlin.Lazy Instance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader$Companion$Instance$2
            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader invoke() {
                java.util.ServiceLoader implementations = java.util.ServiceLoader.load(kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader.class, kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader.class.getClassLoader());
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(implementations, "implementations");
                kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader builtInsLoader = (kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader) kotlin.collections.CollectionsKt.firstOrNull(implementations);
                if (builtInsLoader != null) {
                    return builtInsLoader;
                }
                throw new java.lang.IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        });

        public final kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader getInstance() {
            kotlin.Lazy lazy = Instance$delegate;
            kotlin.reflect.KProperty kProperty = $$delegatedProperties[0];
            return (kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader) lazy.getValue();
        }

        private Companion() {
        }
    }
}
