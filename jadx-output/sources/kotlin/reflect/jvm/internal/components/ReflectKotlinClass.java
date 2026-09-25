package kotlin.reflect.jvm.internal.components;

/* JADX INFO: compiled from: ReflectKotlinClass.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001b\b\u0002\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0016J\u001a\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020!2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006#"}, d2 = {"Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass;", "klass", "Ljava/lang/Class;", "classHeader", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader;", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader;)V", "getClassHeader", "()Lorg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "getKlass", "()Ljava/lang/Class;", com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION, "", "getLocation", "()Ljava/lang/String;", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "", "loadClassAnnotations", "", "visitor", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$AnnotationVisitor;", "cachedContents", "", "toString", "visitMembers", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$MemberVisitor;", "Factory", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
public final class ReflectKotlinClass implements kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass {

    /* JADX INFO: renamed from: Factory, reason: from kotlin metadata */
    public static final kotlin.reflect.jvm.internal.components.ReflectKotlinClass.Companion INSTANCE = new kotlin.reflect.jvm.internal.components.ReflectKotlinClass.Companion(null);
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader classHeader;
    private final java.lang.Class<?> klass;

    private ReflectKotlinClass(java.lang.Class<?> cls, kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader kotlinClassHeader) {
        this.klass = cls;
        this.classHeader = kotlinClassHeader;
    }

    public /* synthetic */ ReflectKotlinClass(java.lang.Class cls, kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader kotlinClassHeader, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, kotlinClassHeader);
    }

    public final java.lang.Class<?> getKlass() {
        return this.klass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader getClassHeader() {
        return this.classHeader;
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.components.ReflectKotlinClass$Factory, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ReflectKotlinClass.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass$Factory;", "", "()V", "create", "Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "klass", "Ljava/lang/Class;", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.reflect.jvm.internal.components.ReflectKotlinClass create(java.lang.Class<?> klass) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(klass, "klass");
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor();
            kotlin.reflect.jvm.internal.components.ReflectClassStructure.INSTANCE.loadClassAnnotations(klass, readKotlinClassHeaderAnnotationVisitor);
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader kotlinClassHeaderCreateHeader = readKotlinClassHeaderAnnotationVisitor.createHeader();
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            if (kotlinClassHeaderCreateHeader != null) {
                return new kotlin.reflect.jvm.internal.components.ReflectKotlinClass(klass, kotlinClassHeaderCreateHeader, defaultConstructorMarker);
            }
            return null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public java.lang.String getLocation() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String name = this.klass.getName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "klass.name");
        sb.append(kotlin.text.StringsKt.replace$default(name, '.', '/', false, 4, (java.lang.Object) null));
        sb.append(".class");
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public kotlin.reflect.jvm.internal.impl.name.ClassId getClassId() {
        return kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getClassId(this.klass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public void loadClassAnnotations(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor visitor, byte[] cachedContents) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(visitor, "visitor");
        kotlin.reflect.jvm.internal.components.ReflectClassStructure.INSTANCE.loadClassAnnotations(this.klass, visitor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public void visitMembers(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor visitor, byte[] cachedContents) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(visitor, "visitor");
        kotlin.reflect.jvm.internal.components.ReflectClassStructure.INSTANCE.visitMembers(this.klass, visitor);
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof kotlin.reflect.jvm.internal.components.ReflectKotlinClass) && kotlin.jvm.internal.Intrinsics.areEqual(this.klass, ((kotlin.reflect.jvm.internal.components.ReflectKotlinClass) other).klass);
    }

    public int hashCode() {
        return this.klass.hashCode();
    }

    public java.lang.String toString() {
        return getClass().getName() + ": " + this.klass;
    }
}
