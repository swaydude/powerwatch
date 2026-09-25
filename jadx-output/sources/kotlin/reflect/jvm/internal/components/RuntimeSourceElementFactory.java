package kotlin.reflect.jvm.internal.components;

/* JADX INFO: compiled from: RuntimeSourceElementFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lkotlin/reflect/jvm/internal/components/RuntimeSourceElementFactory;", "Lkotlin/reflect/jvm/internal/impl/load/java/sources/JavaSourceElementFactory;", "()V", com.google.firebase.analytics.FirebaseAnalytics.Param.SOURCE, "Lkotlin/reflect/jvm/internal/impl/load/java/sources/JavaSourceElement;", "javaElement", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaElement;", "RuntimeSourceElement", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
public final class RuntimeSourceElementFactory implements kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory {
    public static final kotlin.reflect.jvm.internal.components.RuntimeSourceElementFactory INSTANCE = new kotlin.reflect.jvm.internal.components.RuntimeSourceElementFactory();

    /* JADX INFO: compiled from: RuntimeSourceElementFactory.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/components/RuntimeSourceElementFactory$RuntimeSourceElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/sources/JavaSourceElement;", "javaElement", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "(Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;)V", "getJavaElement", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "getContainingFile", "Lkotlin/reflect/jvm/internal/impl/descriptors/SourceFile;", "toString", "", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
    public static final class RuntimeSourceElement implements kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement {
        private final kotlin.reflect.jvm.internal.structure.ReflectJavaElement javaElement;

        public RuntimeSourceElement(kotlin.reflect.jvm.internal.structure.ReflectJavaElement javaElement) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaElement, "javaElement");
            this.javaElement = javaElement;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement
        public kotlin.reflect.jvm.internal.structure.ReflectJavaElement getJavaElement() {
            return this.javaElement;
        }

        public java.lang.String toString() {
            return getClass().getName() + ": " + getJavaElement().toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
        public kotlin.reflect.jvm.internal.impl.descriptors.SourceFile getContainingFile() {
            kotlin.reflect.jvm.internal.impl.descriptors.SourceFile sourceFile = kotlin.reflect.jvm.internal.impl.descriptors.SourceFile.NO_SOURCE_FILE;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(sourceFile, "SourceFile.NO_SOURCE_FILE");
            return sourceFile;
        }
    }

    private RuntimeSourceElementFactory() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory
    public kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement source(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement javaElement) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaElement, "javaElement");
        return new kotlin.reflect.jvm.internal.components.RuntimeSourceElementFactory.RuntimeSourceElement((kotlin.reflect.jvm.internal.structure.ReflectJavaElement) javaElement);
    }
}
