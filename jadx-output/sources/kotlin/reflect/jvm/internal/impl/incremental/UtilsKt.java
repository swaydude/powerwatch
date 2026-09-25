package kotlin.reflect.jvm.internal.impl.incremental;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UtilsKt {
    public static final void record(kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker record, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation from, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor scopeOwner, kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.reflect.jvm.internal.impl.incremental.components.LocationInfo location;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(record, "$this$record");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(from, "from");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scopeOwner, "scopeOwner");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        if (record == kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING.INSTANCE || (location = from.getLocation()) == null) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.incremental.components.Position position = record.getRequiresPosition() ? location.getPosition() : kotlin.reflect.jvm.internal.impl.incremental.components.Position.Companion.getNO_POSITION();
        java.lang.String filePath = location.getFilePath();
        java.lang.String strAsString = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(scopeOwner).asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "DescriptorUtils.getFqName(scopeOwner).asString()");
        kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind scopeKind = kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind.CLASSIFIER;
        java.lang.String strAsString2 = name.asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString2, "name.asString()");
        record.record(filePath, position, strAsString, scopeKind, strAsString2);
    }

    public static final void record(kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker record, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation from, kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor scopeOwner, kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(record, "$this$record");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(from, "from");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scopeOwner, "scopeOwner");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        java.lang.String strAsString = scopeOwner.getFqName().asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "scopeOwner.fqName.asString()");
        java.lang.String strAsString2 = name.asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString2, "name.asString()");
        recordPackageLookup(record, from, strAsString, strAsString2);
    }

    public static final void recordPackageLookup(kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker recordPackageLookup, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation from, java.lang.String packageFqName, java.lang.String name) {
        kotlin.reflect.jvm.internal.impl.incremental.components.LocationInfo location;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(recordPackageLookup, "$this$recordPackageLookup");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(from, "from");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(packageFqName, "packageFqName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        if (recordPackageLookup == kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING.INSTANCE || (location = from.getLocation()) == null) {
            return;
        }
        recordPackageLookup.record(location.getFilePath(), recordPackageLookup.getRequiresPosition() ? location.getPosition() : kotlin.reflect.jvm.internal.impl.incremental.components.Position.Companion.getNO_POSITION(), packageFqName, kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind.PACKAGE, name);
    }
}
