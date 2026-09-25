package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ANNOTATION_CLASS' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: KotlinTarget.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class KotlinTarget {
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget[] $VALUES;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget> ALL_TARGET_SET;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget ANNOTATION_CLASS;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget ANONYMOUS_FUNCTION;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget CLASS;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget CLASS_ONLY;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget COMPANION_OBJECT;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget CONSTRUCTOR;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.Companion Companion;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget> DEFAULT_TARGET_SET;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget DESTRUCTURING_DECLARATION;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget ENUM_CLASS;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget ENUM_ENTRY;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget EXPRESSION;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget FIELD;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget FILE;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget FUNCTION;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget INITIALIZER;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget INTERFACE;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget LAMBDA_EXPRESSION;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget LOCAL_CLASS;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget LOCAL_FUNCTION;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget LOCAL_VARIABLE;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget MEMBER_FUNCTION;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget MEMBER_PROPERTY;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget MEMBER_PROPERTY_WITH_BACKING_FIELD;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget MEMBER_PROPERTY_WITH_DELEGATE;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget OBJECT;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget OBJECT_LITERAL;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget PROPERTY;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget PROPERTY_GETTER;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget PROPERTY_PARAMETER;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget PROPERTY_SETTER;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget STAR_PROJECTION;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget TOP_LEVEL_FUNCTION;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget TOP_LEVEL_PROPERTY;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget TOP_LEVEL_PROPERTY_WITH_DELEGATE;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget TYPE;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget TYPEALIAS;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget TYPE_PARAMETER;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget TYPE_PROJECTION;
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget, kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget> USE_SITE_MAPPING;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget VALUE_PARAMETER;
    private static final java.util.HashMap<java.lang.String, kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget> map;
    private final java.lang.String description;
    private final boolean isDefault;

    public static kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.class, str);
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget[] values() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget[]) $VALUES.clone();
    }

    private KotlinTarget(java.lang.String str, int i, java.lang.String str2, boolean z) {
        super(str, i);
        this.description = str2;
        this.isDefault = z;
    }

    /* synthetic */ KotlinTarget(java.lang.String str, int i, java.lang.String str2, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? true : z);
    }

    static {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("CLASS", 0, "class", false, 2, null);
        CLASS = kotlinTarget;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget2 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("ANNOTATION_CLASS", 1, "annotation class", false, 2, defaultConstructorMarker);
        ANNOTATION_CLASS = kotlinTarget2;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget3 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("TYPE_PARAMETER", 2, "type parameter", false);
        TYPE_PARAMETER = kotlinTarget3;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker2 = null;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget4 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("PROPERTY", 3, "property", false, 2, defaultConstructorMarker2);
        PROPERTY = kotlinTarget4;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget5 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("FIELD", 4, "field", false, 2, null);
        FIELD = kotlinTarget5;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget6 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("LOCAL_VARIABLE", 5, "local variable", false, 2, defaultConstructorMarker2);
        LOCAL_VARIABLE = kotlinTarget6;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget7 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("VALUE_PARAMETER", 6, "value parameter", false, 2, null);
        VALUE_PARAMETER = kotlinTarget7;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget8 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("CONSTRUCTOR", 7, "constructor", false, 2, defaultConstructorMarker);
        CONSTRUCTOR = kotlinTarget8;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget9 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("FUNCTION", 8, "function", false, 2, null);
        FUNCTION = kotlinTarget9;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget10 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("PROPERTY_GETTER", 9, "getter", false, 2, null);
        PROPERTY_GETTER = kotlinTarget10;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget11 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("PROPERTY_SETTER", 10, "setter", false, 2, null);
        PROPERTY_SETTER = kotlinTarget11;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget12 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("TYPE", 11, "type usage", false);
        TYPE = kotlinTarget12;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget13 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("EXPRESSION", 12, "expression", false);
        EXPRESSION = kotlinTarget13;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget14 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("FILE", 13, "file", false);
        FILE = kotlinTarget14;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget15 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("TYPEALIAS", 14, "typealias", false);
        TYPEALIAS = kotlinTarget15;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget16 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("TYPE_PROJECTION", 15, "type projection", false);
        TYPE_PROJECTION = kotlinTarget16;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget17 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("STAR_PROJECTION", 16, "star projection", false);
        STAR_PROJECTION = kotlinTarget17;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget18 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("PROPERTY_PARAMETER", 17, "property constructor parameter", false);
        PROPERTY_PARAMETER = kotlinTarget18;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget19 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("CLASS_ONLY", 18, "class", false);
        CLASS_ONLY = kotlinTarget19;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget20 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("OBJECT", 19, "object", false);
        OBJECT = kotlinTarget20;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget21 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("COMPANION_OBJECT", 20, "companion object", false);
        COMPANION_OBJECT = kotlinTarget21;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget22 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("INTERFACE", 21, "interface", false);
        INTERFACE = kotlinTarget22;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget23 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("ENUM_CLASS", 22, "enum class", false);
        ENUM_CLASS = kotlinTarget23;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget24 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("ENUM_ENTRY", 23, "enum entry", false);
        ENUM_ENTRY = kotlinTarget24;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget25 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("LOCAL_CLASS", 24, "local class", false);
        LOCAL_CLASS = kotlinTarget25;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget26 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("LOCAL_FUNCTION", 25, "local function", false);
        LOCAL_FUNCTION = kotlinTarget26;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget27 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("MEMBER_FUNCTION", 26, "member function", false);
        MEMBER_FUNCTION = kotlinTarget27;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget28 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("TOP_LEVEL_FUNCTION", 27, "top level function", false);
        TOP_LEVEL_FUNCTION = kotlinTarget28;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget29 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("MEMBER_PROPERTY", 28, "member property", false);
        MEMBER_PROPERTY = kotlinTarget29;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget30 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("MEMBER_PROPERTY_WITH_BACKING_FIELD", 29, "member property with backing field", false);
        MEMBER_PROPERTY_WITH_BACKING_FIELD = kotlinTarget30;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget31 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("MEMBER_PROPERTY_WITH_DELEGATE", 30, "member property with delegate", false);
        MEMBER_PROPERTY_WITH_DELEGATE = kotlinTarget31;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget32 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 31, "member property without backing field or delegate", false);
        MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = kotlinTarget32;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget33 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("TOP_LEVEL_PROPERTY", 32, "top level property", false);
        TOP_LEVEL_PROPERTY = kotlinTarget33;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget34 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 33, "top level property with backing field", false);
        TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD = kotlinTarget34;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget35 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 34, "top level property with delegate", false);
        TOP_LEVEL_PROPERTY_WITH_DELEGATE = kotlinTarget35;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget36 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 35, "top level property without backing field or delegate", false);
        TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = kotlinTarget36;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget37 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("INITIALIZER", 36, "initializer", false);
        INITIALIZER = kotlinTarget37;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget38 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("DESTRUCTURING_DECLARATION", 37, "destructuring declaration", false);
        DESTRUCTURING_DECLARATION = kotlinTarget38;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget39 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("LAMBDA_EXPRESSION", 38, "lambda expression", false);
        LAMBDA_EXPRESSION = kotlinTarget39;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget40 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("ANONYMOUS_FUNCTION", 39, "anonymous function", false);
        ANONYMOUS_FUNCTION = kotlinTarget40;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget41 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget("OBJECT_LITERAL", 40, "object literal", false);
        OBJECT_LITERAL = kotlinTarget41;
        $VALUES = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget[]{kotlinTarget, kotlinTarget2, kotlinTarget3, kotlinTarget4, kotlinTarget5, kotlinTarget6, kotlinTarget7, kotlinTarget8, kotlinTarget9, kotlinTarget10, kotlinTarget11, kotlinTarget12, kotlinTarget13, kotlinTarget14, kotlinTarget15, kotlinTarget16, kotlinTarget17, kotlinTarget18, kotlinTarget19, kotlinTarget20, kotlinTarget21, kotlinTarget22, kotlinTarget23, kotlinTarget24, kotlinTarget25, kotlinTarget26, kotlinTarget27, kotlinTarget28, kotlinTarget29, kotlinTarget30, kotlinTarget31, kotlinTarget32, kotlinTarget33, kotlinTarget34, kotlinTarget35, kotlinTarget36, kotlinTarget37, kotlinTarget38, kotlinTarget39, kotlinTarget40, kotlinTarget41};
        Companion = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.Companion(null);
        map = new java.util.HashMap<>();
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget42 : values()) {
            map.put(kotlinTarget42.name(), kotlinTarget42);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget[] kotlinTargetArrValues = values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget43 : kotlinTargetArrValues) {
            if (kotlinTarget43.isDefault) {
                arrayList.add(kotlinTarget43);
            }
        }
        DEFAULT_TARGET_SET = kotlin.collections.CollectionsKt.toSet(arrayList);
        ALL_TARGET_SET = kotlin.collections.ArraysKt.toSet(values());
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget annotationUseSiteTarget = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget44 = VALUE_PARAMETER;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget annotationUseSiteTarget2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.FIELD;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget kotlinTarget45 = FIELD;
        USE_SITE_MAPPING = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(annotationUseSiteTarget, kotlinTarget44), kotlin.TuplesKt.to(annotationUseSiteTarget2, kotlinTarget45), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.PROPERTY, PROPERTY), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.FILE, FILE), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.PROPERTY_GETTER, PROPERTY_GETTER), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.PROPERTY_SETTER, PROPERTY_SETTER), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.RECEIVER, kotlinTarget44), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.SETTER_PARAMETER, kotlinTarget44), kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD, kotlinTarget45));
    }

    /* JADX INFO: compiled from: KotlinTarget.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
