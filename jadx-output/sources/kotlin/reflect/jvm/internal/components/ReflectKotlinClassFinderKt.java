package kotlin.reflect.jvm.internal.components;

/* JADX INFO: compiled from: ReflectKotlinClassFinder.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toRuntimeFqName", "", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "descriptors.runtime"}, k = 2, mv = {1, 1, 15})
public final class ReflectKotlinClassFinderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String toRuntimeFqName(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        java.lang.String strAsString = classId.getRelativeClassName().asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "relativeClassName.asString()");
        java.lang.String strReplace$default = kotlin.text.StringsKt.replace$default(strAsString, '.', kotlin.text.Typography.dollar, false, 4, (java.lang.Object) null);
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName = classId.getPackageFqName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(packageFqName, "packageFqName");
        if (packageFqName.isRoot()) {
            return strReplace$default;
        }
        return classId.getPackageFqName() + '.' + strReplace$default;
    }
}
