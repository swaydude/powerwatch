package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* JADX INFO: compiled from: javaElements.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface JavaPackage extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement {
    java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass> getClasses(kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1);

    kotlin.reflect.jvm.internal.impl.name.FqName getFqName();

    java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage> getSubPackages();
}
