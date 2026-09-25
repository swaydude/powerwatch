package kotlin.reflect.jvm.internal.impl.types.checker;

/* JADX INFO: compiled from: ClassicTypeCheckerContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ClassicTypeCheckerContextKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String errorMessage(java.lang.Object obj) {
        return "ClassicTypeCheckerContext couldn't handle " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass()) + ' ' + obj;
    }
}
