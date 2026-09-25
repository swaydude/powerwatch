package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* JADX INFO: compiled from: javaElements.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface JavaAnnotation extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement {

    /* JADX INFO: compiled from: javaElements.kt */
    public static final class DefaultImpls {
        public static boolean isIdeExternalAnnotation(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation javaAnnotation) {
            return false;
        }
    }

    java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument> getArguments();

    kotlin.reflect.jvm.internal.impl.name.ClassId getClassId();

    boolean isIdeExternalAnnotation();

    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass resolve();
}
