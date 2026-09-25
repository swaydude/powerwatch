package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* JADX INFO: compiled from: javaTypes.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface JavaClassifierType extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType {
    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier getClassifier();

    java.lang.String getClassifierQualifiedName();

    java.lang.String getPresentableText();

    java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType> getTypeArguments();

    boolean isRaw();
}
