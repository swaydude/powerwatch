package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: compiled from: NameResolverUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NameResolverUtilKt {
    public static final kotlin.reflect.jvm.internal.impl.name.ClassId getClassId(kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver getClassId, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getClassId, "$this$getClassId");
        kotlin.reflect.jvm.internal.impl.name.ClassId classIdFromString = kotlin.reflect.jvm.internal.impl.name.ClassId.fromString(getClassId.getQualifiedClassName(i), getClassId.isLocalClassName(i));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classIdFromString, "ClassId.fromString(getQu… isLocalClassName(index))");
        return classIdFromString;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.Name getName(kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver getName, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getName, "$this$getName");
        kotlin.reflect.jvm.internal.impl.name.Name nameGuessByFirstCharacter = kotlin.reflect.jvm.internal.impl.name.Name.guessByFirstCharacter(getName.getString(i));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameGuessByFirstCharacter, "Name.guessByFirstCharacter(getString(index))");
        return nameGuessByFirstCharacter;
    }
}
