package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: KProperty1Impl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001\u001cB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u001d\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001bR4\u0010\u0010\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u0013*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00120\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "T", "R", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "Lkotlin/reflect/KMutableProperty1;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "_setter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", "kotlin.jvm.PlatformType", "setter", "getSetter", "()Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", "set", "", "receiver", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Setter", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
public final class KMutableProperty1Impl<T, R> extends kotlin.reflect.jvm.internal.KProperty1Impl<T, R> implements kotlin.reflect.KMutableProperty1<T, R> {
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazyVal<kotlin.reflect.jvm.internal.KMutableProperty1Impl.Setter<T, R>> _setter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(kotlin.reflect.jvm.internal.KDeclarationContainerImpl container, java.lang.String name, java.lang.String signature, java.lang.Object obj) {
        super(container, name, signature, obj);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(signature, "signature");
        kotlin.reflect.jvm.internal.ReflectProperties.LazyVal<kotlin.reflect.jvm.internal.KMutableProperty1Impl.Setter<T, R>> lazyValLazy = kotlin.reflect.jvm.internal.ReflectProperties.lazy(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.KMutableProperty1Impl.Setter<T, R>>() { // from class: kotlin.reflect.jvm.internal.KMutableProperty1Impl$_setter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.KMutableProperty1Impl.Setter<T, R> invoke() {
                return new kotlin.reflect.jvm.internal.KMutableProperty1Impl.Setter<>(this.this$0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lazyValLazy, "ReflectProperties.lazy { Setter(this) }");
        this._setter = lazyValLazy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(kotlin.reflect.jvm.internal.KDeclarationContainerImpl container, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
        kotlin.reflect.jvm.internal.ReflectProperties.LazyVal<kotlin.reflect.jvm.internal.KMutableProperty1Impl.Setter<T, R>> lazyValLazy = kotlin.reflect.jvm.internal.ReflectProperties.lazy(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.KMutableProperty1Impl.Setter<T, R>>() { // from class: kotlin.reflect.jvm.internal.KMutableProperty1Impl$_setter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.KMutableProperty1Impl.Setter<T, R> invoke() {
                return new kotlin.reflect.jvm.internal.KMutableProperty1Impl.Setter<>(this.this$0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lazyValLazy, "ReflectProperties.lazy { Setter(this) }");
        this._setter = lazyValLazy;
    }

    @Override // kotlin.reflect.KMutableProperty1, kotlin.reflect.KMutableProperty
    public kotlin.reflect.jvm.internal.KMutableProperty1Impl.Setter<T, R> getSetter() {
        kotlin.reflect.jvm.internal.KMutableProperty1Impl.Setter<T, R> setterInvoke = this._setter.invoke();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(setterInvoke, "_setter()");
        return setterInvoke;
    }

    @Override // kotlin.reflect.KMutableProperty1
    public void set(T receiver, R value) {
        getSetter().call(receiver, value);
    }

    /* JADX INFO: compiled from: KProperty1Impl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u00022\u0006\u0010\r\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0002\u0010\u000eR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", "T", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "Lkotlin/reflect/KMutableProperty1$Setter;", "property", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "(Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;)V", "getProperty", "()Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "invoke", "", "receiver", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static final class Setter<T, R> extends kotlin.reflect.jvm.internal.KPropertyImpl.Setter<R> implements kotlin.reflect.KMutableProperty1.Setter<T, R> {
        private final kotlin.reflect.jvm.internal.KMutableProperty1Impl<T, R> property;

        public Setter(kotlin.reflect.jvm.internal.KMutableProperty1Impl<T, R> property) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(property, "property");
            this.property = property;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor, kotlin.reflect.KProperty.Accessor
        public kotlin.reflect.jvm.internal.KMutableProperty1Impl<T, R> getProperty() {
            return this.property;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, java.lang.Object obj2) {
            invoke2(obj, obj2);
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(T receiver, R value) {
            getProperty().set(receiver, value);
        }
    }
}
