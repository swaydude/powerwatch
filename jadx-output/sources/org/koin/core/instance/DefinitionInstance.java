package org.koin.core.instance;

/* JADX INFO: compiled from: DefinitionInstance.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0012B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH&J\u001b\u0010\n\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rJ\u001b\u0010\u000e\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH&R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lorg/koin/core/instance/DefinitionInstance;", "T", "", "beanDefinition", "Lorg/koin/core/definition/BeanDefinition;", "(Lorg/koin/core/definition/BeanDefinition;)V", "getBeanDefinition", "()Lorg/koin/core/definition/BeanDefinition;", "close", "", "create", "context", "Lorg/koin/core/instance/InstanceContext;", "(Lorg/koin/core/instance/InstanceContext;)Ljava/lang/Object;", "get", "isCreated", "", "release", "Companion", "koin-core"}, k = 1, mv = {1, 1, 15})
public abstract class DefinitionInstance<T> {
    public static final java.lang.String ERROR_SEPARATOR = "\n\t";
    private final org.koin.core.definition.BeanDefinition<T> beanDefinition;

    public abstract void close();

    public abstract <T> T get(org.koin.core.instance.InstanceContext context);

    public abstract boolean isCreated(org.koin.core.instance.InstanceContext context);

    public abstract void release(org.koin.core.instance.InstanceContext context);

    public DefinitionInstance(org.koin.core.definition.BeanDefinition<T> beanDefinition) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(beanDefinition, "beanDefinition");
        this.beanDefinition = beanDefinition;
    }

    public final org.koin.core.definition.BeanDefinition<T> getBeanDefinition() {
        return this.beanDefinition;
    }

    public <T> T create(org.koin.core.instance.InstanceContext context) throws org.koin.core.error.InstanceCreationException {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.DEBUG)) {
            org.koin.core.KoinApplication.INSTANCE.getLogger().debug("| create instance for " + this.beanDefinition);
        }
        try {
            org.koin.core.parameter.DefinitionParameters parameters = context.getParameters();
            kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, T> definition = this.beanDefinition.getDefinition();
            org.koin.core.scope.Scope scope = context.getScope();
            if (scope != null) {
                return definition.invoke(scope, parameters);
            }
            throw new java.lang.IllegalStateException("Can't execute definition instance while this context is not registered against any Koin instance".toString());
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(e.toString());
            sb.append(ERROR_SEPARATOR);
            java.lang.StackTraceElement[] stackTrace = e.getStackTrace();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(stackTrace, "e.stackTrace");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.StackTraceElement it : stackTrace) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                java.lang.String className = it.getClassName();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(className, "it.className");
                if (!(!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) className, (java.lang.CharSequence) "sun.reflect", false, 2, (java.lang.Object) null))) {
                    break;
                }
                arrayList.add(it);
            }
            sb.append(kotlin.collections.CollectionsKt.joinToString$default(arrayList, ERROR_SEPARATOR, null, null, 0, null, null, 62, null));
            org.koin.core.KoinApplication.INSTANCE.getLogger().error("Instance creation error : could not create instance for " + this.beanDefinition + ": " + sb.toString());
            throw new org.koin.core.error.InstanceCreationException("Could not create instance for " + this.beanDefinition, e);
        }
    }
}
