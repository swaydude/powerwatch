package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* JADX INFO: compiled from: methodSignatureMapping.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class JvmType {
    private JvmType() {
    }

    public /* synthetic */ JvmType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: methodSignatureMapping.kt */
    public static final class Primitive extends kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType {
        private final kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType;

        public Primitive(kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType) {
            super(null);
            this.jvmPrimitiveType = jvmPrimitiveType;
        }

        public final kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType getJvmPrimitiveType() {
            return this.jvmPrimitiveType;
        }
    }

    /* JADX INFO: compiled from: methodSignatureMapping.kt */
    public static final class Object extends kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType {
        private final java.lang.String internalName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Object(java.lang.String internalName) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(internalName, "internalName");
            this.internalName = internalName;
        }

        public final java.lang.String getInternalName() {
            return this.internalName;
        }
    }

    /* JADX INFO: compiled from: methodSignatureMapping.kt */
    public static final class Array extends kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType {
        private final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType elementType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Array(kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType elementType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(elementType, "elementType");
            this.elementType = elementType;
        }

        public final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType getElementType() {
            return this.elementType;
        }
    }

    public java.lang.String toString() {
        return kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactoryImpl.INSTANCE.toString(this);
    }
}
