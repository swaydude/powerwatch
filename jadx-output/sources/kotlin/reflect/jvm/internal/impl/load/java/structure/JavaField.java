package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* JADX INFO: compiled from: javaElements.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface JavaField extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember {
    boolean getHasConstantNotNullInitializer();

    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType getType();

    boolean isEnumEntry();
}
