package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PredefinedFunctionEnhancementInfo {
    private final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo> parametersInfo;
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo returnTypeInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public PredefinedFunctionEnhancementInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public PredefinedFunctionEnhancementInfo(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo typeEnhancementInfo, java.util.List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo> parametersInfo) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parametersInfo, "parametersInfo");
        this.returnTypeInfo = typeEnhancementInfo;
        this.parametersInfo = parametersInfo;
    }

    public /* synthetic */ PredefinedFunctionEnhancementInfo(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo typeEnhancementInfo, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo) null : typeEnhancementInfo, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo getReturnTypeInfo() {
        return this.returnTypeInfo;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo> getParametersInfo() {
        return this.parametersInfo;
    }
}
