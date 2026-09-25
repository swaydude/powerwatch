package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* JADX INFO: compiled from: javaElements.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface JavaMethod extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner {
    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument getAnnotationParameterDefaultValue();

    boolean getHasAnnotationParameterDefaultValue();

    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType getReturnType();

    java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter> getValueParameters();

    /* JADX INFO: compiled from: javaElements.kt */
    public static final class DefaultImpls {
        public static boolean getHasAnnotationParameterDefaultValue(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod) {
            return javaMethod.getAnnotationParameterDefaultValue() != null;
        }
    }
}
