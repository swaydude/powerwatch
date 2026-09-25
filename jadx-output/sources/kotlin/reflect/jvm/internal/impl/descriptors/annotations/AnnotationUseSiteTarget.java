package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* JADX INFO: compiled from: AnnotationUseSiteTarget.kt */
/* JADX INFO: loaded from: classes2.dex */
public enum AnnotationUseSiteTarget {
    FIELD(null, 1, null),
    FILE(null, 1, null),
    PROPERTY(0 == true ? 1 : 0, 1, null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(0 == true ? 1 : 0, 1, null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");

    private final java.lang.String renderName;

    AnnotationUseSiteTarget(java.lang.String str) {
        if (str == null) {
            java.lang.String strName = name();
            if (strName == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            str = strName.toLowerCase();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(str, "(this as java.lang.String).toLowerCase()");
        }
        this.renderName = str;
    }

    /* synthetic */ AnnotationUseSiteTarget(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? (java.lang.String) null : str);
    }

    public final java.lang.String getRenderName() {
        return this.renderName;
    }
}
