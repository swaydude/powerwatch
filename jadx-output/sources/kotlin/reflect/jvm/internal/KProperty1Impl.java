package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: KProperty1Impl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001\u001fB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001cR4\u0010\u0010\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u0013*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00120\u00120\u0011X\u0088\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty1Impl;", "T", "R", "Lkotlin/reflect/KProperty1;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "_getter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "kotlin.jvm.PlatformType", "delegateField", "Lkotlin/Lazy;", "Ljava/lang/reflect/Field;", "getter", "getGetter", "()Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "get", "receiver", "(Ljava/lang/Object;)Ljava/lang/Object;", "getDelegate", "invoke", "Getter", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
public class KProperty1Impl<T, R> extends kotlin.reflect.jvm.internal.KPropertyImpl<R> implements kotlin.reflect.KProperty1<T, R> {
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazyVal<kotlin.reflect.jvm.internal.KProperty1Impl.Getter<T, R>> _getter;
    private final kotlin.Lazy<java.lang.reflect.Field> delegateField;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(kotlin.reflect.jvm.internal.KDeclarationContainerImpl container, java.lang.String name, java.lang.String signature, java.lang.Object obj) {
        super(container, name, signature, obj);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(signature, "signature");
        kotlin.reflect.jvm.internal.ReflectProperties.LazyVal<kotlin.reflect.jvm.internal.KProperty1Impl.Getter<T, R>> lazyValLazy = kotlin.reflect.jvm.internal.ReflectProperties.lazy(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.KProperty1Impl.Getter<T, ? extends R>>() { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$_getter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.KProperty1Impl.Getter<T, R> invoke() {
                return new kotlin.reflect.jvm.internal.KProperty1Impl.Getter<>(this.this$0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lazyValLazy, "ReflectProperties.lazy { Getter(this) }");
        this._getter = lazyValLazy;
        this.delegateField = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.reflect.Field>() { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$delegateField$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.reflect.Field invoke() {
                return this.this$0.computeDelegateField();
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(kotlin.reflect.jvm.internal.KDeclarationContainerImpl container, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
        kotlin.reflect.jvm.internal.ReflectProperties.LazyVal<kotlin.reflect.jvm.internal.KProperty1Impl.Getter<T, R>> lazyValLazy = kotlin.reflect.jvm.internal.ReflectProperties.lazy(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.KProperty1Impl.Getter<T, ? extends R>>() { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$_getter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.KProperty1Impl.Getter<T, R> invoke() {
                return new kotlin.reflect.jvm.internal.KProperty1Impl.Getter<>(this.this$0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lazyValLazy, "ReflectProperties.lazy { Getter(this) }");
        this._getter = lazyValLazy;
        this.delegateField = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.reflect.Field>() { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$delegateField$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.reflect.Field invoke() {
                return this.this$0.computeDelegateField();
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.KPropertyImpl, kotlin.reflect.KProperty
    public kotlin.reflect.jvm.internal.KProperty1Impl.Getter<T, R> getGetter() {
        kotlin.reflect.jvm.internal.KProperty1Impl.Getter<T, R> getterInvoke = this._getter.invoke();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(getterInvoke, "_getter()");
        return getterInvoke;
    }

    @Override // kotlin.reflect.KProperty1
    public R get(T receiver) {
        return getGetter().call(receiver);
    }

    @Override // kotlin.reflect.KProperty1
    public java.lang.Object getDelegate(T receiver) {
        return getDelegate(this.delegateField.getValue(), receiver);
    }

    @Override // kotlin.jvm.functions.Function1
    public R invoke(T receiver) {
        return get(receiver);
    }

    /* JADX INFO: compiled from: KProperty1Impl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u0002H\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "T", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty1$Getter;", "property", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "(Lkotlin/reflect/jvm/internal/KProperty1Impl;)V", "getProperty", "()Lkotlin/reflect/jvm/internal/KProperty1Impl;", "invoke", "receiver", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static final class Getter<T, R> extends kotlin.reflect.jvm.internal.KPropertyImpl.Getter<R> implements kotlin.reflect.KProperty1.Getter<T, R> {
        private final kotlin.reflect.jvm.internal.KProperty1Impl<T, R> property;

        /* JADX WARN: Multi-variable type inference failed */
        public Getter(kotlin.reflect.jvm.internal.KProperty1Impl<T, ? extends R> property) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(property, "property");
            this.property = property;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor, kotlin.reflect.KProperty.Accessor
        public kotlin.reflect.jvm.internal.KProperty1Impl<T, R> getProperty() {
            return this.property;
        }

        @Override // kotlin.jvm.functions.Function1
        public R invoke(T receiver) {
            return getProperty().get(receiver);
        }
    }
}
