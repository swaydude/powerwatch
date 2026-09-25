package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: signatureEnhancement.kt */
/* JADX INFO: loaded from: classes2.dex */
final class SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$2<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<T, T, T> {
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$2 INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$2();

    SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final <T> T invoke(T t, T t2) {
        if (t == null || t2 == null || kotlin.jvm.internal.Intrinsics.areEqual(t, t2)) {
            return t != null ? t : t2;
        }
        return null;
    }
}
