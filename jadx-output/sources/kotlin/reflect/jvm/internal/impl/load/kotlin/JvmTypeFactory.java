package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* JADX INFO: compiled from: typeSignatureMapping.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface JvmTypeFactory<T> {
    T boxType(T t);

    T createFromString(java.lang.String str);

    T createObjectType(java.lang.String str);

    T getJavaLangClassType();

    java.lang.String toString(T t);
}
