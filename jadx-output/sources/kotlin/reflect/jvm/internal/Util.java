package kotlin.reflect.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
class Util {
    public static java.lang.Object getEnumConstantByName(java.lang.Class<? extends java.lang.Enum<?>> cls, java.lang.String str) {
        return java.lang.Enum.valueOf(cls, str);
    }
}
