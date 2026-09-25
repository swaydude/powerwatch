package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* JADX INFO: compiled from: javaElements.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface JavaClass extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner {
    java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor> getConstructors();

    java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField> getFields();

    kotlin.reflect.jvm.internal.impl.name.FqName getFqName();

    java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name> getInnerClassNames();

    kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind getLightClassOriginKind();

    java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod> getMethods();

    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass getOuterClass();

    java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType> getSupertypes();

    boolean isAnnotationType();

    boolean isEnum();

    boolean isInterface();
}
