package kotlin.reflect.jvm.internal.impl.types.model;

/* JADX INFO: compiled from: TypeSystemContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface TypeSystemOptimizationContext {

    /* JADX INFO: compiled from: TypeSystemContext.kt */
    public static final class DefaultImpls {
        public static boolean identicalArguments(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext typeSystemOptimizationContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker a, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker b) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(a, "a");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(b, "b");
            return false;
        }
    }

    boolean identicalArguments(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker2);
}
