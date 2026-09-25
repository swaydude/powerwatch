package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: loaded from: classes2.dex */
public interface VariableDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor {
    /* JADX INFO: renamed from: getCompileTimeInitializer */
    kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> mo1264getCompileTimeInitializer();

    boolean isConst();

    boolean isLateInit();

    boolean isVar();
}
