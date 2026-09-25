package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: KClassImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005:\u0001`B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010O\u001a\u00020%2\b\u0010P\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0016\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\u00132\u0006\u0010S\u001a\u00020TH\u0016J\u0012\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010W\u001a\u00020XH\u0016J\u0016\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0\u00132\u0006\u0010S\u001a\u00020TH\u0016J\b\u0010Z\u001a\u00020XH\u0016J\u0012\u0010[\u001a\u00020%2\b\u0010\\\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010]\u001a\u00020^H\u0002J\b\u0010_\u001a\u00020<H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R3\u0010\u001a\u001a$\u0012 \u0012\u001e \u001d*\u000e\u0018\u00010\u001cR\b\u0012\u0004\u0012\u00028\u00000\u00000\u001cR\b\u0012\u0004\u0012\u00028\u00000\u00000\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010&R\u0014\u0010'\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010&R\u0014\u0010,\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010&R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001e\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0016R\u001e\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0016R\u0016\u00108\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0016\u0010;\u001a\u0004\u0018\u00010<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\"\u0010?\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00040\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\rR\u0016\u0010A\u001a\u0004\u0018\u00010<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010>R\u0014\u0010C\u001a\u0002008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u00102R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\rR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\rR\u0016\u0010K\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006a"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "constructors", "Lkotlin/reflect/KFunction;", "getConstructors", "data", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "kotlin.jvm.PlatformType", "getData", "()Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "isAbstract", "", "()Z", "isCompanion", "isData", "isFinal", "isInner", "isOpen", "isSealed", "getJClass", "()Ljava/lang/Class;", "memberScope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "nestedClasses", "getNestedClasses", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "sealedSubclasses", "getSealedSubclasses", "simpleName", "getSimpleName", "staticScope", "getStaticScope$kotlin_reflection", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "getProperties", "hashCode", "isInstance", "value", "reportUnresolvedClass", "", "toString", "Data", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
public final class KClassImpl<T> extends kotlin.reflect.jvm.internal.KDeclarationContainerImpl implements kotlin.reflect.KClass<T>, kotlin.reflect.jvm.internal.KClassifierImpl {
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazyVal<kotlin.reflect.jvm.internal.KClassImpl<T>.Data> data;
    private final java.lang.Class<T> jClass;

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 1;
            iArr[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS.ordinal()] = 2;
            iArr[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
            iArr[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.SYNTHETIC_CLASS.ordinal()] = 4;
            iArr[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.UNKNOWN.ordinal()] = 5;
            iArr[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.CLASS.ordinal()] = 6;
        }
    }

    /* JADX INFO: compiled from: KClassImpl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010N\u001a\u00020<2\n\u0010O\u001a\u0006\u0012\u0002\b\u00030PH\u0002R%\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR%\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR%\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\bR!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015R-\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u00058FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\n\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\bR%\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001e\u0010\bR%\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b!\u0010\bR%\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b$\u0010\bR\u001b\u0010&\u001a\u00020'8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b(\u0010)R%\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b,\u0010\bR%\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\n\u001a\u0004\b/\u0010\bR%\u00101\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\n\u001a\u0004\b3\u0010\bR#\u00105\u001a\u0004\u0018\u00018\u00008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b6\u0010\u001a\u001a\u0004\b7\u00108R\u001d\u0010;\u001a\u0004\u0018\u00010<8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\n\u001a\u0004\b=\u0010>R)\u0010@\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u0000020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\n\u001a\u0004\bA\u0010\u0015R\u001d\u0010C\u001a\u0004\u0018\u00010<8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\n\u001a\u0004\bD\u0010>R!\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bI\u0010\n\u001a\u0004\bH\u0010\u0015R!\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010\n\u001a\u0004\bL\u0010\u0015¨\u0006Q"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "(Lkotlin/reflect/jvm/internal/KClassImpl;)V", "allMembers", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getAllMembers", "()Ljava/util/Collection;", "allMembers$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "allNonStaticMembers", "getAllNonStaticMembers", "allNonStaticMembers$delegate", "allStaticMembers", "getAllStaticMembers", "allStaticMembers$delegate", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "annotations$delegate", "constructors", "Lkotlin/reflect/KFunction;", "constructors$annotations", "()V", "getConstructors", "constructors$delegate", "declaredMembers", "getDeclaredMembers", "declaredMembers$delegate", "declaredNonStaticMembers", "getDeclaredNonStaticMembers", "declaredNonStaticMembers$delegate", "declaredStaticMembers", "getDeclaredStaticMembers", "declaredStaticMembers$delegate", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor$delegate", "inheritedNonStaticMembers", "getInheritedNonStaticMembers", "inheritedNonStaticMembers$delegate", "inheritedStaticMembers", "getInheritedStaticMembers", "inheritedStaticMembers$delegate", "nestedClasses", "Lkotlin/reflect/KClass;", "getNestedClasses", "nestedClasses$delegate", "objectInstance", "objectInstance$annotations", "getObjectInstance", "()Ljava/lang/Object;", "objectInstance$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "qualifiedName$delegate", "sealedSubclasses", "getSealedSubclasses", "sealedSubclasses$delegate", "simpleName", "getSimpleName", "simpleName$delegate", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "supertypes$delegate", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters$delegate", "calculateLocalClassName", "jClass", "Ljava/lang/Class;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public final class Data extends kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Data {
        static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KClassImpl.Data.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KClassImpl.Data.class), "annotations", "getAnnotations()Ljava/util/List;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KClassImpl.Data.class), "simpleName", "getSimpleName()Ljava/lang/String;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KClassImpl.Data.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KClassImpl.Data.class), "constructors", "getConstructors()Ljava/util/Collection;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KClassImpl.Data.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KClassImpl.Data.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KClassImpl.Data.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KClassImpl.Data.class), "supertypes", "getSupertypes()Ljava/util/List;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KClassImpl.Data.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KClassImpl.Data.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KClassImpl.Data.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KClassImpl.Data.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KClassImpl.Data.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KClassImpl.Data.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KClassImpl.Data.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KClassImpl.Data.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KClassImpl.Data.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* JADX INFO: renamed from: allMembers$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal allMembers;

        /* JADX INFO: renamed from: allNonStaticMembers$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal allNonStaticMembers;

        /* JADX INFO: renamed from: allStaticMembers$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal allStaticMembers;

        /* JADX INFO: renamed from: annotations$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal annotations;

        /* JADX INFO: renamed from: constructors$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal constructors;

        /* JADX INFO: renamed from: declaredMembers$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal declaredMembers;

        /* JADX INFO: renamed from: declaredNonStaticMembers$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal declaredNonStaticMembers;

        /* JADX INFO: renamed from: declaredStaticMembers$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal declaredStaticMembers;

        /* JADX INFO: renamed from: descriptor$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal descriptor;

        /* JADX INFO: renamed from: inheritedNonStaticMembers$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal inheritedNonStaticMembers;

        /* JADX INFO: renamed from: inheritedStaticMembers$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal inheritedStaticMembers;

        /* JADX INFO: renamed from: nestedClasses$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal nestedClasses;

        /* JADX INFO: renamed from: objectInstance$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazyVal objectInstance;

        /* JADX INFO: renamed from: qualifiedName$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal qualifiedName;

        /* JADX INFO: renamed from: sealedSubclasses$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal sealedSubclasses;

        /* JADX INFO: renamed from: simpleName$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal simpleName;

        /* JADX INFO: renamed from: supertypes$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal supertypes;

        /* JADX INFO: renamed from: typeParameters$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal typeParameters;

        /* JADX INFO: Access modifiers changed from: private */
        public final java.util.Collection<kotlin.reflect.jvm.internal.KCallableImpl<?>> getDeclaredStaticMembers() {
            return (java.util.Collection) this.declaredStaticMembers.getValue(this, $$delegatedProperties[11]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.util.Collection<kotlin.reflect.jvm.internal.KCallableImpl<?>> getInheritedNonStaticMembers() {
            return (java.util.Collection) this.inheritedNonStaticMembers.getValue(this, $$delegatedProperties[12]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.util.Collection<kotlin.reflect.jvm.internal.KCallableImpl<?>> getInheritedStaticMembers() {
            return (java.util.Collection) this.inheritedStaticMembers.getValue(this, $$delegatedProperties[13]);
        }

        public final java.util.Collection<kotlin.reflect.jvm.internal.KCallableImpl<?>> getAllMembers() {
            return (java.util.Collection) this.allMembers.getValue(this, $$delegatedProperties[17]);
        }

        public final java.util.Collection<kotlin.reflect.jvm.internal.KCallableImpl<?>> getAllNonStaticMembers() {
            return (java.util.Collection) this.allNonStaticMembers.getValue(this, $$delegatedProperties[14]);
        }

        public final java.util.Collection<kotlin.reflect.jvm.internal.KCallableImpl<?>> getAllStaticMembers() {
            return (java.util.Collection) this.allStaticMembers.getValue(this, $$delegatedProperties[15]);
        }

        public final java.util.List<java.lang.annotation.Annotation> getAnnotations() {
            return (java.util.List) this.annotations.getValue(this, $$delegatedProperties[1]);
        }

        public final java.util.Collection<kotlin.reflect.KFunction<T>> getConstructors() {
            return (java.util.Collection) this.constructors.getValue(this, $$delegatedProperties[4]);
        }

        public final java.util.Collection<kotlin.reflect.jvm.internal.KCallableImpl<?>> getDeclaredMembers() {
            return (java.util.Collection) this.declaredMembers.getValue(this, $$delegatedProperties[16]);
        }

        public final java.util.Collection<kotlin.reflect.jvm.internal.KCallableImpl<?>> getDeclaredNonStaticMembers() {
            return (java.util.Collection) this.declaredNonStaticMembers.getValue(this, $$delegatedProperties[10]);
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getDescriptor() {
            return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) this.descriptor.getValue(this, $$delegatedProperties[0]);
        }

        public final java.util.Collection<kotlin.reflect.KClass<?>> getNestedClasses() {
            return (java.util.Collection) this.nestedClasses.getValue(this, $$delegatedProperties[5]);
        }

        public final T getObjectInstance() {
            return this.objectInstance.getValue(this, $$delegatedProperties[6]);
        }

        public final java.lang.String getQualifiedName() {
            return (java.lang.String) this.qualifiedName.getValue(this, $$delegatedProperties[3]);
        }

        public final java.util.List<kotlin.reflect.KClass<? extends T>> getSealedSubclasses() {
            return (java.util.List) this.sealedSubclasses.getValue(this, $$delegatedProperties[9]);
        }

        public final java.lang.String getSimpleName() {
            return (java.lang.String) this.simpleName.getValue(this, $$delegatedProperties[2]);
        }

        public final java.util.List<kotlin.reflect.KType> getSupertypes() {
            return (java.util.List) this.supertypes.getValue(this, $$delegatedProperties[8]);
        }

        public final java.util.List<kotlin.reflect.KTypeParameter> getTypeParameters() {
            return (java.util.List) this.typeParameters.getValue(this, $$delegatedProperties[7]);
        }

        public Data() {
            super();
            this.descriptor = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$descriptor$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor invoke() {
                    kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.KClassImpl.this.getClassId();
                    kotlin.reflect.jvm.internal.components.RuntimeModuleData moduleData = ((kotlin.reflect.jvm.internal.KClassImpl.Data) kotlin.reflect.jvm.internal.KClassImpl.this.getData().invoke()).getModuleData();
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorDeserializeClass = classId.isLocal() ? moduleData.getDeserialization().deserializeClass(classId) : kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findClassAcrossModuleDependencies(moduleData.getModule(), classId);
                    if (classDescriptorDeserializeClass != null) {
                        return classDescriptorDeserializeClass;
                    }
                    kotlin.reflect.jvm.internal.KClassImpl.this.reportUnresolvedClass();
                    throw null;
                }
            });
            this.annotations = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<java.util.List<? extends java.lang.annotation.Annotation>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$annotations$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.List<? extends java.lang.annotation.Annotation> invoke() {
                    return kotlin.reflect.jvm.internal.UtilKt.computeAnnotations(this.this$0.getDescriptor());
                }
            });
            this.simpleName = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$simpleName$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.lang.String invoke() {
                    if (kotlin.reflect.jvm.internal.KClassImpl.this.getJClass().isAnonymousClass()) {
                        return null;
                    }
                    kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.KClassImpl.this.getClassId();
                    if (classId.isLocal()) {
                        kotlin.reflect.jvm.internal.KClassImpl.Data data = this.this$0;
                        return data.calculateLocalClassName(kotlin.reflect.jvm.internal.KClassImpl.this.getJClass());
                    }
                    java.lang.String strAsString = classId.getShortClassName().asString();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "classId.shortClassName.asString()");
                    return strAsString;
                }
            });
            this.qualifiedName = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$qualifiedName$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.lang.String invoke() {
                    if (kotlin.reflect.jvm.internal.KClassImpl.this.getJClass().isAnonymousClass()) {
                        return null;
                    }
                    kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.KClassImpl.this.getClassId();
                    if (classId.isLocal()) {
                        return null;
                    }
                    return classId.asSingleFqName().asString();
                }
            });
            this.constructors = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.KFunction<? extends T>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$constructors$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.List<kotlin.reflect.KFunction<T>> invoke() {
                    java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor> constructorDescriptors = kotlin.reflect.jvm.internal.KClassImpl.this.getConstructorDescriptors();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(constructorDescriptors, 10));
                    java.util.Iterator<T> it = constructorDescriptors.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new kotlin.reflect.jvm.internal.KFunctionImpl(kotlin.reflect.jvm.internal.KClassImpl.this, (kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) it.next()));
                    }
                    return arrayList;
                }
            });
            this.nestedClasses = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.KClassImpl<? extends java.lang.Object>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$nestedClasses$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.List<? extends kotlin.reflect.jvm.internal.KClassImpl<? extends java.lang.Object>> invoke() {
                    java.util.Collection contributedDescriptors$default = kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls.getContributedDescriptors$default(this.this$0.getDescriptor().getUnsubstitutedInnerClassesScope(), null, null, 3, null);
                    java.util.ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : contributedDescriptors$default) {
                        if (!kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isEnumEntry((kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor : arrayList) {
                        if (declarationDescriptor != null) {
                            java.lang.Class<?> javaClass = kotlin.reflect.jvm.internal.UtilKt.toJavaClass((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor);
                            kotlin.reflect.jvm.internal.KClassImpl kClassImpl = javaClass != null ? new kotlin.reflect.jvm.internal.KClassImpl(javaClass) : null;
                            if (kClassImpl != null) {
                                arrayList2.add(kClassImpl);
                            }
                        } else {
                            throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        }
                    }
                    return arrayList2;
                }
            });
            this.objectInstance = kotlin.reflect.jvm.internal.ReflectProperties.lazy(new kotlin.jvm.functions.Function0<T>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$objectInstance$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final T invoke() throws java.lang.NoSuchFieldException {
                    java.lang.reflect.Field declaredField;
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor descriptor = this.this$0.getDescriptor();
                    if (descriptor.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.OBJECT) {
                        return null;
                    }
                    if (descriptor.isCompanionObject() && !kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping.INSTANCE.isMappedIntrinsicCompanionObject(descriptor)) {
                        declaredField = kotlin.reflect.jvm.internal.KClassImpl.this.getJClass().getEnclosingClass().getDeclaredField(descriptor.getName().asString());
                    } else {
                        declaredField = kotlin.reflect.jvm.internal.KClassImpl.this.getJClass().getDeclaredField("INSTANCE");
                    }
                    T t = (T) declaredField.get(null);
                    if (t != null) {
                        return t;
                    }
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type T");
                }
            });
            this.typeParameters = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.KTypeParameterImpl>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$typeParameters$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.List<? extends kotlin.reflect.jvm.internal.KTypeParameterImpl> invoke() {
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters = this.this$0.getDescriptor().getDeclaredTypeParameters();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaredTypeParameters, "descriptor.declaredTypeParameters");
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = declaredTypeParameters;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new kotlin.reflect.jvm.internal.KTypeParameterImpl((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) it.next()));
                    }
                    return arrayList;
                }
            });
            this.supertypes = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2(this));
            this.sealedSubclasses = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.KClassImpl<? extends T>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$sealedSubclasses$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.List<kotlin.reflect.jvm.internal.KClassImpl<? extends T>> invoke() {
                    java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> sealedSubclasses = this.this$0.getDescriptor().getSealedSubclasses();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(sealedSubclasses, "descriptor.sealedSubclasses");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor : sealedSubclasses) {
                        if (classDescriptor != null) {
                            java.lang.Class<?> javaClass = kotlin.reflect.jvm.internal.UtilKt.toJavaClass(classDescriptor);
                            kotlin.reflect.jvm.internal.KClassImpl kClassImpl = javaClass != null ? new kotlin.reflect.jvm.internal.KClassImpl(javaClass) : null;
                            if (kClassImpl != null) {
                                arrayList.add(kClassImpl);
                            }
                        } else {
                            throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        }
                    }
                    return arrayList;
                }
            });
            this.declaredNonStaticMembers = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<java.util.Collection<? extends kotlin.reflect.jvm.internal.KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$declaredNonStaticMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.Collection<? extends kotlin.reflect.jvm.internal.KCallableImpl<?>> invoke() {
                    return kotlin.reflect.jvm.internal.KClassImpl.this.getMembers(kotlin.reflect.jvm.internal.KClassImpl.this.getMemberScope$kotlin_reflection(), kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess.DECLARED);
                }
            });
            this.declaredStaticMembers = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<java.util.Collection<? extends kotlin.reflect.jvm.internal.KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$declaredStaticMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.Collection<? extends kotlin.reflect.jvm.internal.KCallableImpl<?>> invoke() {
                    return kotlin.reflect.jvm.internal.KClassImpl.this.getMembers(kotlin.reflect.jvm.internal.KClassImpl.this.getStaticScope$kotlin_reflection(), kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess.DECLARED);
                }
            });
            this.inheritedNonStaticMembers = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<java.util.Collection<? extends kotlin.reflect.jvm.internal.KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$inheritedNonStaticMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.Collection<? extends kotlin.reflect.jvm.internal.KCallableImpl<?>> invoke() {
                    return kotlin.reflect.jvm.internal.KClassImpl.this.getMembers(kotlin.reflect.jvm.internal.KClassImpl.this.getMemberScope$kotlin_reflection(), kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess.INHERITED);
                }
            });
            this.inheritedStaticMembers = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<java.util.Collection<? extends kotlin.reflect.jvm.internal.KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$inheritedStaticMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.Collection<? extends kotlin.reflect.jvm.internal.KCallableImpl<?>> invoke() {
                    return kotlin.reflect.jvm.internal.KClassImpl.this.getMembers(kotlin.reflect.jvm.internal.KClassImpl.this.getStaticScope$kotlin_reflection(), kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess.INHERITED);
                }
            });
            this.allNonStaticMembers = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$allNonStaticMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.List<? extends kotlin.reflect.jvm.internal.KCallableImpl<?>> invoke() {
                    return kotlin.collections.CollectionsKt.plus((java.util.Collection) this.this$0.getDeclaredNonStaticMembers(), (java.lang.Iterable) this.this$0.getInheritedNonStaticMembers());
                }
            });
            this.allStaticMembers = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$allStaticMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.List<? extends kotlin.reflect.jvm.internal.KCallableImpl<?>> invoke() {
                    return kotlin.collections.CollectionsKt.plus(this.this$0.getDeclaredStaticMembers(), (java.lang.Iterable) this.this$0.getInheritedStaticMembers());
                }
            });
            this.declaredMembers = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$declaredMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.List<? extends kotlin.reflect.jvm.internal.KCallableImpl<?>> invoke() {
                    return kotlin.collections.CollectionsKt.plus((java.util.Collection) this.this$0.getDeclaredNonStaticMembers(), (java.lang.Iterable) this.this$0.getDeclaredStaticMembers());
                }
            });
            this.allMembers = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$allMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.util.List<? extends kotlin.reflect.jvm.internal.KCallableImpl<?>> invoke() {
                    return kotlin.collections.CollectionsKt.plus((java.util.Collection) this.this$0.getAllNonStaticMembers(), (java.lang.Iterable) this.this$0.getAllStaticMembers());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.String calculateLocalClassName(java.lang.Class<?> jClass) {
            java.lang.String name = jClass.getSimpleName();
            java.lang.reflect.Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "name");
                return kotlin.text.StringsKt.substringAfter$default(name, enclosingMethod.getName() + "$", (java.lang.String) null, 2, (java.lang.Object) null);
            }
            java.lang.reflect.Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "name");
                return kotlin.text.StringsKt.substringAfter$default(name, enclosingConstructor.getName() + "$", (java.lang.String) null, 2, (java.lang.Object) null);
            }
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "name");
            return kotlin.text.StringsKt.substringAfter$default(name, kotlin.text.Typography.dollar, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public KClassImpl(java.lang.Class<T> jClass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(jClass, "jClass");
        this.jClass = jClass;
        kotlin.reflect.jvm.internal.ReflectProperties.LazyVal<kotlin.reflect.jvm.internal.KClassImpl<T>.Data> lazyValLazy = kotlin.reflect.jvm.internal.ReflectProperties.lazy(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.KClassImpl<T>.Data>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$data$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.KClassImpl<T>.Data invoke() {
                return new kotlin.reflect.jvm.internal.KClassImpl.Data();
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lazyValLazy, "ReflectProperties.lazy { Data() }");
        this.data = lazyValLazy;
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public java.lang.Class<T> getJClass() {
        return this.jClass;
    }

    public final kotlin.reflect.jvm.internal.ReflectProperties.LazyVal<kotlin.reflect.jvm.internal.KClassImpl<T>.Data> getData() {
        return this.data;
    }

    @Override // kotlin.reflect.jvm.internal.KClassifierImpl
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getDescriptor() {
        return this.data.invoke().getDescriptor();
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return this.data.invoke().getAnnotations();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.name.ClassId getClassId() {
        return kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapJvmClassToKotlinClassId(getJClass());
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope$kotlin_reflection() {
        return getDescriptor().getDefaultType().getMemberScope();
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getStaticScope$kotlin_reflection() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope staticScope = getDescriptor().getStaticScope();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(staticScope, "descriptor.staticScope");
        return staticScope;
    }

    @Override // kotlin.reflect.KDeclarationContainer
    public java.util.Collection<kotlin.reflect.KCallable<?>> getMembers() {
        return this.data.invoke().getAllMembers();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor> getConstructorDescriptors() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor descriptor = getDescriptor();
        if (descriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE || descriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.OBJECT) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> constructors = descriptor.getConstructors();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(constructors, "descriptor.constructors");
        return constructors;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getProperties(kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) getMemberScope$kotlin_reflection().getContributedVariables(name, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_REFLECTION), (java.lang.Iterable) getStaticScope$kotlin_reflection().getContributedVariables(name, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_REFLECTION));
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> getFunctions(kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) getMemberScope$kotlin_reflection().getContributedFunctions(name, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_REFLECTION), (java.lang.Iterable) getStaticScope$kotlin_reflection().getContributedFunctions(name, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_REFLECTION));
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor getLocalProperty(int index) {
        java.lang.Class<?> declaringClass;
        if (kotlin.jvm.internal.Intrinsics.areEqual(getJClass().getSimpleName(), "DefaultImpls") && (declaringClass = getJClass().getDeclaringClass()) != null && declaringClass.isInterface()) {
            kotlin.reflect.KClass kotlinClass = kotlin.jvm.JvmClassMappingKt.getKotlinClass(declaringClass);
            if (kotlinClass != null) {
                return ((kotlin.reflect.jvm.internal.KClassImpl) kotlinClass).getLocalProperty(index);
            }
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor descriptor = getDescriptor();
        if (!(descriptor instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor)) {
            descriptor = null;
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor deserializedClassDescriptor = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) descriptor;
        if (deserializedClassDescriptor == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class classProto = deserializedClassDescriptor.getClassProto();
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property>> generatedExtension = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.classLocalVariable;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(generatedExtension, "JvmProtoBuf.classLocalVariable");
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(classProto, generatedExtension, index);
        if (property != null) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) kotlin.reflect.jvm.internal.UtilKt.deserializeToDescriptor(getJClass(), property, deserializedClassDescriptor.getC().getNameResolver(), deserializedClassDescriptor.getC().getTypeTable(), deserializedClassDescriptor.getMetadataVersion(), kotlin.reflect.jvm.internal.KClassImpl$getLocalProperty$2$1$1.INSTANCE);
        }
        return null;
    }

    @Override // kotlin.reflect.KClass
    public java.lang.String getSimpleName() {
        return this.data.invoke().getSimpleName();
    }

    @Override // kotlin.reflect.KClass
    public java.lang.String getQualifiedName() {
        return this.data.invoke().getQualifiedName();
    }

    @Override // kotlin.reflect.KClass
    public java.util.Collection<kotlin.reflect.KFunction<T>> getConstructors() {
        return this.data.invoke().getConstructors();
    }

    @Override // kotlin.reflect.KClass
    public java.util.Collection<kotlin.reflect.KClass<?>> getNestedClasses() {
        return this.data.invoke().getNestedClasses();
    }

    @Override // kotlin.reflect.KClass
    public T getObjectInstance() {
        return this.data.invoke().getObjectInstance();
    }

    @Override // kotlin.reflect.KClass
    public boolean isInstance(java.lang.Object value) {
        java.lang.Integer functionClassArity = kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getFunctionClassArity(getJClass());
        if (functionClassArity != null) {
            return kotlin.jvm.internal.TypeIntrinsics.isFunctionOfArity(value, functionClassArity.intValue());
        }
        java.lang.Class wrapperByPrimitive = kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getWrapperByPrimitive(getJClass());
        if (wrapperByPrimitive == null) {
            wrapperByPrimitive = getJClass();
        }
        return wrapperByPrimitive.isInstance(value);
    }

    @Override // kotlin.reflect.KClass
    public java.util.List<kotlin.reflect.KTypeParameter> getTypeParameters() {
        return this.data.invoke().getTypeParameters();
    }

    @Override // kotlin.reflect.KClass
    public java.util.List<kotlin.reflect.KType> getSupertypes() {
        return this.data.invoke().getSupertypes();
    }

    @Override // kotlin.reflect.KClass
    public java.util.List<kotlin.reflect.KClass<? extends T>> getSealedSubclasses() {
        return this.data.invoke().getSealedSubclasses();
    }

    @Override // kotlin.reflect.KClass
    public kotlin.reflect.KVisibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = getDescriptor().getVisibility();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(visibility, "descriptor.visibility");
        return kotlin.reflect.jvm.internal.UtilKt.toKVisibility(visibility);
    }

    @Override // kotlin.reflect.KClass
    public boolean isFinal() {
        return getDescriptor().getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
    }

    @Override // kotlin.reflect.KClass
    public boolean isOpen() {
        return getDescriptor().getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN;
    }

    @Override // kotlin.reflect.KClass
    public boolean isAbstract() {
        return getDescriptor().getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.KClass
    public boolean isSealed() {
        return getDescriptor().getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED;
    }

    @Override // kotlin.reflect.KClass
    public boolean isData() {
        return getDescriptor().isData();
    }

    @Override // kotlin.reflect.KClass
    public boolean isInner() {
        return getDescriptor().isInner();
    }

    @Override // kotlin.reflect.KClass
    public boolean isCompanion() {
        return getDescriptor().isCompanionObject();
    }

    @Override // kotlin.reflect.KClass
    public boolean equals(java.lang.Object other) {
        return (other instanceof kotlin.reflect.jvm.internal.KClassImpl) && kotlin.jvm.internal.Intrinsics.areEqual(kotlin.jvm.JvmClassMappingKt.getJavaObjectType(this), kotlin.jvm.JvmClassMappingKt.getJavaObjectType((kotlin.reflect.KClass) other));
    }

    @Override // kotlin.reflect.KClass
    public int hashCode() {
        return kotlin.jvm.JvmClassMappingKt.getJavaObjectType(this).hashCode();
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("class ");
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = getClassId();
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName = classId.getPackageFqName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(packageFqName, "classId.packageFqName");
        if (packageFqName.isRoot()) {
            str = "";
        } else {
            str = packageFqName.asString() + ".";
        }
        java.lang.String strAsString = classId.getRelativeClassName().asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "classId.relativeClassName.asString()");
        sb.append(str + kotlin.text.StringsKt.replace$default(strAsString, '.', kotlin.text.Typography.dollar, false, 4, (java.lang.Object) null));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Void reportUnresolvedClass() {
        kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader classHeader;
        kotlin.reflect.jvm.internal.components.ReflectKotlinClass reflectKotlinClassCreate = kotlin.reflect.jvm.internal.components.ReflectKotlinClass.INSTANCE.create(getJClass());
        kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind kind = (reflectKotlinClassCreate == null || (classHeader = reflectKotlinClassCreate.getClassHeader()) == null) ? null : classHeader.getKind();
        if (kind != null) {
            switch (kotlin.reflect.jvm.internal.KClassImpl.WhenMappings.$EnumSwitchMapping$0[kind.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new java.lang.UnsupportedOperationException("Packages and file facades are not yet supported in Kotlin reflection. Meanwhile please use Java reflection to inspect this class: " + getJClass());
                case 4:
                    throw new java.lang.UnsupportedOperationException("This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection library has no idea what declarations does it have. Please use Java reflection to inspect this class: " + getJClass());
                case 5:
                    throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Unknown class: " + getJClass() + " (kind = " + kind + ')');
                case 6:
                    break;
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Unresolved class: " + getJClass());
    }
}
