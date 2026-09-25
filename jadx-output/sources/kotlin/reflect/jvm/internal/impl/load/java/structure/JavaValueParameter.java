package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* JADX INFO: compiled from: javaElements.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface JavaValueParameter extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner {
    kotlin.reflect.jvm.internal.impl.name.Name getName();

    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType getType();

    boolean isVararg();
}
