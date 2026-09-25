package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* JADX INFO: compiled from: javaElements.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface JavaModifierListOwner extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement {
    kotlin.reflect.jvm.internal.impl.descriptors.Visibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isStatic();
}
