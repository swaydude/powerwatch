package kotlin.reflect.jvm.internal.impl.types.model;

/* JADX INFO: compiled from: TypeSystemContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface TypeSystemInferenceExtensionContext extends kotlin.reflect.jvm.internal.impl.types.model.TypeSystemCommonSuperTypesContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext {

    /* JADX INFO: compiled from: TypeSystemContext.kt */
    public static final class DefaultImpls {
        public static kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker get(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext typeSystemInferenceExtensionContext, kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker get, int i) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(get, "$this$get");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.get(typeSystemInferenceExtensionContext, get, i);
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker getArgumentOrNull(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext typeSystemInferenceExtensionContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker getArgumentOrNull, int i) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getArgumentOrNull, "$this$getArgumentOrNull");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.getArgumentOrNull(typeSystemInferenceExtensionContext, getArgumentOrNull, i);
        }

        public static boolean hasFlexibleNullability(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext typeSystemInferenceExtensionContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker hasFlexibleNullability) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(hasFlexibleNullability, "$this$hasFlexibleNullability");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.hasFlexibleNullability(typeSystemInferenceExtensionContext, hasFlexibleNullability);
        }

        public static boolean isClassType(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext typeSystemInferenceExtensionContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker isClassType) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isClassType, "$this$isClassType");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.isClassType(typeSystemInferenceExtensionContext, isClassType);
        }

        public static boolean isDefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext typeSystemInferenceExtensionContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker isDefinitelyNotNullType) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isDefinitelyNotNullType, "$this$isDefinitelyNotNullType");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.isDefinitelyNotNullType(typeSystemInferenceExtensionContext, isDefinitelyNotNullType);
        }

        public static boolean isDynamic(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext typeSystemInferenceExtensionContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker isDynamic) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isDynamic, "$this$isDynamic");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.isDynamic(typeSystemInferenceExtensionContext, isDynamic);
        }

        public static boolean isIntegerLiteralType(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext typeSystemInferenceExtensionContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker isIntegerLiteralType) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isIntegerLiteralType, "$this$isIntegerLiteralType");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.isIntegerLiteralType(typeSystemInferenceExtensionContext, isIntegerLiteralType);
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker lowerBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext typeSystemInferenceExtensionContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker lowerBoundIfFlexible) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lowerBoundIfFlexible, "$this$lowerBoundIfFlexible");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.lowerBoundIfFlexible(typeSystemInferenceExtensionContext, lowerBoundIfFlexible);
        }

        public static int size(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext typeSystemInferenceExtensionContext, kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker size) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(size, "$this$size");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.size(typeSystemInferenceExtensionContext, size);
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext typeSystemInferenceExtensionContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker typeConstructor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeConstructor, "$this$typeConstructor");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.typeConstructor(typeSystemInferenceExtensionContext, typeConstructor);
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker upperBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext typeSystemInferenceExtensionContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker upperBoundIfFlexible) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(upperBoundIfFlexible, "$this$upperBoundIfFlexible");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext.DefaultImpls.upperBoundIfFlexible(typeSystemInferenceExtensionContext, upperBoundIfFlexible);
        }
    }
}
