package org.koin.core.definition;

/* JADX INFO: compiled from: BeanDefinition.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010C\u001a\u00020!J\u0006\u0010D\u001a\u00020!J\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0006\u0010H\u001a\u00020FJ\b\u0010I\u001a\u00020JH\u0016J\u0019\u0010K\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010L\u001a\u00020M¢\u0006\u0002\u0010NJ\b\u0010O\u001a\u00020PH\u0016R;\u0010\t\u001a#\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\r¢\u0006\u0002\b\u000eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR6\u0010\u001f\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020!\u0018\u00010 j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R6\u0010'\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020!\u0018\u00010 j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u001a\u0010+\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0015\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001a\u00103\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R2\u0010<\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070=j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007`>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006Q"}, d2 = {"Lorg/koin/core/definition/BeanDefinition;", "T", "", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "scopeName", "primaryType", "Lkotlin/reflect/KClass;", "(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V", "definition", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "getDefinition", "()Lkotlin/jvm/functions/Function2;", "setDefinition", "(Lkotlin/jvm/functions/Function2;)V", "instance", "Lorg/koin/core/instance/DefinitionInstance;", "getInstance", "()Lorg/koin/core/instance/DefinitionInstance;", "setInstance", "(Lorg/koin/core/instance/DefinitionInstance;)V", "kind", "Lorg/koin/core/definition/Kind;", "getKind", "()Lorg/koin/core/definition/Kind;", "setKind", "(Lorg/koin/core/definition/Kind;)V", "onClose", "Lkotlin/Function1;", "", "Lorg/koin/core/definition/OnCloseCallback;", "getOnClose", "()Lkotlin/jvm/functions/Function1;", "setOnClose", "(Lkotlin/jvm/functions/Function1;)V", "onRelease", "Lorg/koin/core/definition/OnReleaseCallback;", "getOnRelease", "setOnRelease", "options", "Lorg/koin/core/definition/Options;", "getOptions", "()Lorg/koin/core/definition/Options;", "setOptions", "(Lorg/koin/core/definition/Options;)V", "getPrimaryType", "()Lkotlin/reflect/KClass;", "properties", "Lorg/koin/core/definition/Properties;", "getProperties", "()Lorg/koin/core/definition/Properties;", "setProperties", "(Lorg/koin/core/definition/Properties;)V", "getQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "getScopeName", "secondaryTypes", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getSecondaryTypes", "()Ljava/util/ArrayList;", "setSecondaryTypes", "(Ljava/util/ArrayList;)V", "close", "createInstanceHolder", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hasScopeSet", "hashCode", "", "resolveInstance", "context", "Lorg/koin/core/instance/InstanceContext;", "(Lorg/koin/core/instance/InstanceContext;)Ljava/lang/Object;", "toString", "", "koin-core"}, k = 1, mv = {1, 1, 15})
public final class BeanDefinition<T> {
    public kotlin.jvm.functions.Function2<? super org.koin.core.scope.Scope, ? super org.koin.core.parameter.DefinitionParameters, ? extends T> definition;
    private org.koin.core.instance.DefinitionInstance<T> instance;
    public org.koin.core.definition.Kind kind;
    private kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onClose;
    private kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onRelease;
    private org.koin.core.definition.Options options;
    private final kotlin.reflect.KClass<?> primaryType;
    private org.koin.core.definition.Properties properties;
    private final org.koin.core.qualifier.Qualifier qualifier;
    private final org.koin.core.qualifier.Qualifier scopeName;
    private java.util.ArrayList<kotlin.reflect.KClass<?>> secondaryTypes;

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[org.koin.core.definition.Kind.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[org.koin.core.definition.Kind.Single.ordinal()] = 1;
            iArr[org.koin.core.definition.Kind.Factory.ordinal()] = 2;
            iArr[org.koin.core.definition.Kind.Scoped.ordinal()] = 3;
        }
    }

    public BeanDefinition(org.koin.core.qualifier.Qualifier qualifier, org.koin.core.qualifier.Qualifier qualifier2, kotlin.reflect.KClass<?> primaryType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(primaryType, "primaryType");
        this.qualifier = qualifier;
        this.scopeName = qualifier2;
        this.primaryType = primaryType;
        this.secondaryTypes = new java.util.ArrayList<>();
        this.options = new org.koin.core.definition.Options(false, false, 3, null);
        this.properties = new org.koin.core.definition.Properties(null, 1, null);
    }

    public /* synthetic */ BeanDefinition(org.koin.core.qualifier.Qualifier qualifier, org.koin.core.qualifier.Qualifier qualifier2, kotlin.reflect.KClass kClass, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? (org.koin.core.qualifier.Qualifier) null : qualifier, (i & 2) != 0 ? (org.koin.core.qualifier.Qualifier) null : qualifier2, kClass);
    }

    public final org.koin.core.qualifier.Qualifier getQualifier() {
        return this.qualifier;
    }

    public final org.koin.core.qualifier.Qualifier getScopeName() {
        return this.scopeName;
    }

    public final kotlin.reflect.KClass<?> getPrimaryType() {
        return this.primaryType;
    }

    public final java.util.ArrayList<kotlin.reflect.KClass<?>> getSecondaryTypes() {
        return this.secondaryTypes;
    }

    public final void setSecondaryTypes(java.util.ArrayList<kotlin.reflect.KClass<?>> arrayList) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.secondaryTypes = arrayList;
    }

    public final org.koin.core.instance.DefinitionInstance<T> getInstance() {
        return this.instance;
    }

    public final void setInstance(org.koin.core.instance.DefinitionInstance<T> definitionInstance) {
        this.instance = definitionInstance;
    }

    public final kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, T> getDefinition() {
        kotlin.jvm.functions.Function2<? super org.koin.core.scope.Scope, ? super org.koin.core.parameter.DefinitionParameters, ? extends T> function2 = this.definition;
        if (function2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("definition");
        }
        return function2;
    }

    public final void setDefinition(kotlin.jvm.functions.Function2<? super org.koin.core.scope.Scope, ? super org.koin.core.parameter.DefinitionParameters, ? extends T> function2) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function2, "<set-?>");
        this.definition = function2;
    }

    public final org.koin.core.definition.Options getOptions() {
        return this.options;
    }

    public final void setOptions(org.koin.core.definition.Options options) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(options, "<set-?>");
        this.options = options;
    }

    public final org.koin.core.definition.Properties getProperties() {
        return this.properties;
    }

    public final void setProperties(org.koin.core.definition.Properties properties) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(properties, "<set-?>");
        this.properties = properties;
    }

    public final org.koin.core.definition.Kind getKind() {
        org.koin.core.definition.Kind kind = this.kind;
        if (kind == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("kind");
        }
        return kind;
    }

    public final void setKind(org.koin.core.definition.Kind kind) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kind, "<set-?>");
        this.kind = kind;
    }

    public final kotlin.jvm.functions.Function1<T, kotlin.Unit> getOnRelease() {
        return this.onRelease;
    }

    public final void setOnRelease(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        this.onRelease = function1;
    }

    public final kotlin.jvm.functions.Function1<T, kotlin.Unit> getOnClose() {
        return this.onClose;
    }

    public final void setOnClose(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        this.onClose = function1;
    }

    public final boolean hasScopeSet() {
        return this.scopeName != null;
    }

    public final void createInstanceHolder() {
        org.koin.core.instance.SingleDefinitionInstance singleDefinitionInstance;
        org.koin.core.definition.Kind kind = this.kind;
        if (kind == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("kind");
        }
        int i = org.koin.core.definition.BeanDefinition.WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i == 1) {
            singleDefinitionInstance = new org.koin.core.instance.SingleDefinitionInstance(this);
        } else if (i == 2) {
            singleDefinitionInstance = new org.koin.core.instance.FactoryDefinitionInstance(this);
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            singleDefinitionInstance = new org.koin.core.instance.ScopeDefinitionInstance(this);
        }
        this.instance = singleDefinitionInstance;
    }

    public final <T> T resolveInstance(org.koin.core.instance.InstanceContext context) {
        T t;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        org.koin.core.instance.DefinitionInstance<T> definitionInstance = this.instance;
        if (definitionInstance != null && (t = definitionInstance.get(context)) != null) {
            return t;
        }
        throw new java.lang.IllegalStateException(("Definition without any InstanceContext - " + this).toString());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    public java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        org.koin.core.definition.Kind kind = this.kind;
        if (kind == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("kind");
        }
        java.lang.String string = kind.toString();
        java.lang.String str3 = "";
        if (this.qualifier != null) {
            str = "name:'" + this.qualifier + "', ";
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        if (this.scopeName != null) {
            str2 = "scope:'" + this.scopeName + "', ";
            if (str2 == null) {
                str2 = "";
            }
        } else {
            str2 = "";
        }
        java.lang.String str4 = "primary_type:'" + org.koin.ext.KClassExtKt.getFullName(this.primaryType) + '\'';
        if (!this.secondaryTypes.isEmpty()) {
            str3 = ", secondary_type:" + kotlin.collections.CollectionsKt.joinToString$default(this.secondaryTypes, ",", null, null, 0, null, new kotlin.jvm.functions.Function1<kotlin.reflect.KClass<?>, java.lang.String>() { // from class: org.koin.core.definition.BeanDefinition$toString$defOtherTypes$typesAsString$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.String invoke(kotlin.reflect.KClass<?> it) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                    return org.koin.ext.KClassExtKt.getFullName(it);
                }
            }, 30, null);
        }
        return "[type:" + string + ',' + str2 + str + str4 + str3 + ']';
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        if (other != null) {
            org.koin.core.definition.BeanDefinition beanDefinition = (org.koin.core.definition.BeanDefinition) other;
            return ((kotlin.jvm.internal.Intrinsics.areEqual(this.qualifier, beanDefinition.qualifier) ^ true) || (kotlin.jvm.internal.Intrinsics.areEqual(this.primaryType, beanDefinition.primaryType) ^ true)) ? false : true;
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
    }

    public int hashCode() {
        org.koin.core.qualifier.Qualifier qualifier = this.qualifier;
        return ((qualifier != null ? qualifier.hashCode() : 0) * 31) + this.primaryType.hashCode();
    }

    public final void close() {
        org.koin.core.instance.DefinitionInstance<T> definitionInstance = this.instance;
        if (definitionInstance != null) {
            definitionInstance.close();
        }
        this.instance = (org.koin.core.instance.DefinitionInstance) null;
    }
}
