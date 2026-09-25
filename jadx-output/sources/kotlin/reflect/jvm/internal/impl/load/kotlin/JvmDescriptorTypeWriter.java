package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* JADX INFO: compiled from: typeSignatureMapping.kt */
/* JADX INFO: loaded from: classes2.dex */
public class JvmDescriptorTypeWriter<T> {
    private T jvmCurrentType;
    private int jvmCurrentTypeArrayLevel;
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory<T> jvmTypeFactory;

    public void writeArrayEnd() {
    }

    public void writeArrayType() {
        if (this.jvmCurrentType == null) {
            this.jvmCurrentTypeArrayLevel++;
        }
    }

    public void writeClass(T objectType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(objectType, "objectType");
        writeJvmTypeAsIs(objectType);
    }

    protected final void writeJvmTypeAsIs(T type) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        if (this.jvmCurrentType == null) {
            if (this.jvmCurrentTypeArrayLevel > 0) {
                type = this.jvmTypeFactory.createFromString(kotlin.text.StringsKt.repeat("[", this.jvmCurrentTypeArrayLevel) + this.jvmTypeFactory.toString(type));
            }
            this.jvmCurrentType = type;
        }
    }

    public void writeTypeVariable(kotlin.reflect.jvm.internal.impl.name.Name name, T type) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        writeJvmTypeAsIs(type);
    }
}
