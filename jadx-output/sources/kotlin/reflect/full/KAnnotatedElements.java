package kotlin.reflect.full;

/* JADX INFO: compiled from: KAnnotatedElements.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a \u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0087\b¢\u0006\u0002\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0087\b¨\u0006\u0007"}, d2 = {"findAnnotation", "T", "", "Lkotlin/reflect/KAnnotatedElement;", "(Lkotlin/reflect/KAnnotatedElement;)Ljava/lang/annotation/Annotation;", "hasAnnotation", "", "kotlin-reflection"}, k = 2, mv = {1, 1, 15})
public final class KAnnotatedElements {
    private static final <T extends java.lang.annotation.Annotation> T findAnnotation(kotlin.reflect.KAnnotatedElement kAnnotatedElement) {
        for (java.lang.Object obj : kAnnotatedElement.getAnnotations()) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (((java.lang.annotation.Annotation) obj) instanceof java.lang.annotation.Annotation) {
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T?");
                return (T) obj;
            }
        }
        obj = null;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T?");
        return (T) obj;
    }

    private static final <T extends java.lang.annotation.Annotation> boolean hasAnnotation(kotlin.reflect.KAnnotatedElement kAnnotatedElement) {
        java.lang.Object next;
        java.util.Iterator<T> it = kAnnotatedElement.getAnnotations().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
        } while (!(((java.lang.annotation.Annotation) next) instanceof java.lang.annotation.Annotation));
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T?");
        return ((java.lang.annotation.Annotation) next) != null;
    }
}
