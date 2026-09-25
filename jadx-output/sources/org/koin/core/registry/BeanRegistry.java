package org.koin.core.registry;

/* JADX INFO: compiled from: BeanRegistry.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J,\u0010\u0012\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\rj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005`\u000e2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u0017\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0015H\u0000¢\u0006\u0002\b\u0016J$\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u000bJ\u0016\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\tH\u0002J\u001a\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u001a\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u0010\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0015J\u0018\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u000bJ\u001c\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050#2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u000bJ\u0014\u0010$\u001a\u00020\u00112\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&J\u0014\u0010(\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u0014\u0010*\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J \u0010+\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u00052\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u0014\u0010,\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u0014\u0010-\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u0010\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u00020'H\u0002J\u0012\u00100\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005J\u0014\u00101\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J \u00102\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u00052\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u0014\u00103\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u0014\u00104\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J \u00105\u001a\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000b2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u0014\u00106\u001a\u00020\u00112\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u0010\u00107\u001a\u00020\u00112\u0006\u0010/\u001a\u00020'H\u0002J\u0006\u00108\u001a\u000209J\u001b\u0010:\u001a\u00020\u00112\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0000¢\u0006\u0002\b;J0\u0010<\u001a\u00020\u0011*\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005`\u00062\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002R&\u0010\u0003\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\f\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u001c\u0012\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\rj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005`\u000e0\bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000f\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lorg/koin/core/registry/BeanRegistry;", "", "()V", "definitions", "Ljava/util/HashSet;", "Lorg/koin/core/definition/BeanDefinition;", "Lkotlin/collections/HashSet;", "definitionsNames", "", "", "definitionsPrimaryTypes", "Lkotlin/reflect/KClass;", "definitionsSecondaryTypes", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "definitionsToCreate", "close", "", "createSecondaryType", "type", "findAllCreatedAtStartDefinition", "", "findAllCreatedAtStartDefinition$koin_core", "findDefinition", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "clazz", "findDefinitionByName", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "findDefinitionBySecondaryType", "kClass", "findDefinitionByType", "getAllDefinitions", "getDefinition", "getDefinitionsForClass", "", "loadModules", "modules", "", "Lorg/koin/core/module/Module;", "removeDefinition", "definition", "removeDefinitionForName", "removeDefinitionForSecondaryType", "removeDefinitionForSecondaryTypes", "removeDefinitionForTypes", "removeDefinitions", "module", "saveDefinition", "saveDefinitionForName", "saveDefinitionForSecondaryType", "saveDefinitionForSecondaryTypes", "saveDefinitionForStart", "saveDefinitionForType", "saveDefinitionForTypes", "saveDefinitions", "size", "", "unloadModules", "unloadModules$koin_core", "addDefinition", "koin-core"}, k = 1, mv = {1, 1, 15})
public final class BeanRegistry {
    private final java.util.HashSet<org.koin.core.definition.BeanDefinition<?>> definitions = new java.util.HashSet<>();
    private final java.util.Map<java.lang.String, org.koin.core.definition.BeanDefinition<?>> definitionsNames = new java.util.concurrent.ConcurrentHashMap();
    private final java.util.Map<kotlin.reflect.KClass<?>, org.koin.core.definition.BeanDefinition<?>> definitionsPrimaryTypes = new java.util.concurrent.ConcurrentHashMap();
    private final java.util.Map<kotlin.reflect.KClass<?>, java.util.ArrayList<org.koin.core.definition.BeanDefinition<?>>> definitionsSecondaryTypes = new java.util.concurrent.ConcurrentHashMap();
    private final java.util.HashSet<org.koin.core.definition.BeanDefinition<?>> definitionsToCreate = new java.util.HashSet<>();

    private final void removeDefinitions(org.koin.core.module.Module module) {
        java.util.Iterator<T> it = module.getDefinitions$koin_core().iterator();
        while (it.hasNext()) {
            removeDefinition((org.koin.core.definition.BeanDefinition) it.next());
        }
    }

    private final void saveDefinitions(org.koin.core.module.Module module) {
        java.util.Iterator<T> it = module.getDefinitions$koin_core().iterator();
        while (it.hasNext()) {
            saveDefinition((org.koin.core.definition.BeanDefinition) it.next());
        }
    }

    public final java.util.Set<org.koin.core.definition.BeanDefinition<?>> getAllDefinitions() {
        return this.definitions;
    }

    private final void removeDefinition(org.koin.core.definition.BeanDefinition<?> definition) {
        org.koin.core.instance.DefinitionInstance<?> beanDefinition = definition.getInstance();
        if (beanDefinition != null) {
            beanDefinition.close();
        }
        this.definitions.remove(definition);
        if (definition.getQualifier() != null) {
            removeDefinitionForName(definition);
        } else {
            removeDefinitionForTypes(definition);
        }
        removeDefinitionForSecondaryTypes(definition);
    }

    public final void saveDefinition(org.koin.core.definition.BeanDefinition<?> definition) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(definition, "definition");
        addDefinition(this.definitions, definition);
        definition.createInstanceHolder();
        if (definition.getQualifier() != null) {
            saveDefinitionForName(definition);
        } else {
            saveDefinitionForTypes(definition);
        }
        if (!definition.getSecondaryTypes().isEmpty()) {
            saveDefinitionForSecondaryTypes(definition);
        }
        if (definition.getOptions().isCreatedAtStart()) {
            saveDefinitionForStart(definition);
        }
    }

    private final void saveDefinitionForSecondaryTypes(org.koin.core.definition.BeanDefinition<?> definition) {
        java.util.Iterator<T> it = definition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            saveDefinitionForSecondaryType(definition, (kotlin.reflect.KClass) it.next());
        }
    }

    private final void saveDefinitionForSecondaryType(org.koin.core.definition.BeanDefinition<?> definition, kotlin.reflect.KClass<?> type) {
        java.util.ArrayList<org.koin.core.definition.BeanDefinition<?>> arrayListCreateSecondaryType = this.definitionsSecondaryTypes.get(type);
        if (arrayListCreateSecondaryType == null) {
            arrayListCreateSecondaryType = createSecondaryType(type);
        }
        arrayListCreateSecondaryType.add(definition);
        if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.INFO)) {
            org.koin.core.KoinApplication.INSTANCE.getLogger().info("bind secondary type:'" + org.koin.ext.KClassExtKt.getFullName(type) + "' ~ " + definition);
        }
    }

    private final java.util.ArrayList<org.koin.core.definition.BeanDefinition<?>> createSecondaryType(kotlin.reflect.KClass<?> type) {
        this.definitionsSecondaryTypes.put(type, new java.util.ArrayList<>());
        java.util.ArrayList<org.koin.core.definition.BeanDefinition<?>> arrayList = this.definitionsSecondaryTypes.get(type);
        if (arrayList == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        return arrayList;
    }

    private final void saveDefinitionForStart(org.koin.core.definition.BeanDefinition<?> definition) {
        this.definitionsToCreate.add(definition);
    }

    private final void addDefinition(java.util.HashSet<org.koin.core.definition.BeanDefinition<?>> hashSet, org.koin.core.definition.BeanDefinition<?> beanDefinition) throws org.koin.core.error.DefinitionOverrideException {
        if (hashSet.add(beanDefinition) || beanDefinition.getOptions().getOverride()) {
            return;
        }
        throw new org.koin.core.error.DefinitionOverrideException("Already existing definition or try to override an existing one: " + beanDefinition);
    }

    private final void saveDefinitionForTypes(org.koin.core.definition.BeanDefinition<?> definition) throws org.koin.core.error.DefinitionOverrideException {
        saveDefinitionForType(definition.getPrimaryType(), definition);
    }

    private final void removeDefinitionForSecondaryTypes(org.koin.core.definition.BeanDefinition<?> definition) {
        java.util.Iterator<T> it = definition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            removeDefinitionForSecondaryType(definition, (kotlin.reflect.KClass) it.next());
        }
    }

    private final void removeDefinitionForSecondaryType(org.koin.core.definition.BeanDefinition<?> definition, kotlin.reflect.KClass<?> type) {
        java.util.ArrayList<org.koin.core.definition.BeanDefinition<?>> arrayList = this.definitionsSecondaryTypes.get(type);
        boolean zRemove = arrayList != null ? arrayList.remove(definition) : false;
        if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.DEBUG) && zRemove) {
            org.koin.core.KoinApplication.INSTANCE.getLogger().info("unbind secondary type:'" + org.koin.ext.KClassExtKt.getFullName(type) + "' ~ " + definition);
        }
    }

    private final void removeDefinitionForTypes(org.koin.core.definition.BeanDefinition<?> definition) {
        kotlin.reflect.KClass<?> primaryType = definition.getPrimaryType();
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.definitionsPrimaryTypes.get(primaryType), definition)) {
            this.definitionsPrimaryTypes.remove(primaryType);
            if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.DEBUG)) {
                org.koin.core.KoinApplication.INSTANCE.getLogger().info("unbind type:'" + org.koin.ext.KClassExtKt.getFullName(primaryType) + "' ~ " + definition);
            }
        }
    }

    private final void saveDefinitionForType(kotlin.reflect.KClass<?> type, org.koin.core.definition.BeanDefinition<?> definition) throws org.koin.core.error.DefinitionOverrideException {
        if (this.definitionsPrimaryTypes.get(type) != null && !definition.getOptions().getOverride()) {
            throw new org.koin.core.error.DefinitionOverrideException("Already existing definition or try to override an existing one with type '" + type + "' and " + definition + " but has already registered " + this.definitionsPrimaryTypes.get(type));
        }
        this.definitionsPrimaryTypes.put(type, definition);
        if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.INFO)) {
            org.koin.core.KoinApplication.INSTANCE.getLogger().info("bind type:'" + org.koin.ext.KClassExtKt.getFullName(type) + "' ~ " + definition);
        }
    }

    private final void removeDefinitionForName(org.koin.core.definition.BeanDefinition<?> definition) {
        org.koin.core.qualifier.Qualifier qualifier = definition.getQualifier();
        if (qualifier != null) {
            java.lang.String string = qualifier.toString();
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.definitionsNames.get(string), definition)) {
                this.definitionsNames.remove(string);
                if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.DEBUG)) {
                    org.koin.core.KoinApplication.INSTANCE.getLogger().info("unbind qualifier:'" + string + "' ~ " + definition);
                }
            }
        }
    }

    private final void saveDefinitionForName(org.koin.core.definition.BeanDefinition<?> definition) throws org.koin.core.error.DefinitionOverrideException {
        org.koin.core.qualifier.Qualifier qualifier = definition.getQualifier();
        if (qualifier != null) {
            if (this.definitionsNames.get(qualifier.toString()) != null && !definition.getOptions().getOverride()) {
                throw new org.koin.core.error.DefinitionOverrideException("Already existing definition or try to override an existing one with qualifier '" + qualifier + "' with " + definition + " but has already registered " + this.definitionsNames.get(qualifier.toString()));
            }
            this.definitionsNames.put(qualifier.toString(), definition);
            if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.INFO)) {
                org.koin.core.KoinApplication.INSTANCE.getLogger().info("bind qualifier:'" + definition.getQualifier() + "' ~ " + definition);
            }
        }
    }

    public static /* synthetic */ org.koin.core.definition.BeanDefinition findDefinition$default(org.koin.core.registry.BeanRegistry beanRegistry, org.koin.core.qualifier.Qualifier qualifier, kotlin.reflect.KClass kClass, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = (org.koin.core.qualifier.Qualifier) null;
        }
        return beanRegistry.findDefinition(qualifier, kClass);
    }

    public final org.koin.core.definition.BeanDefinition<?> findDefinition(org.koin.core.qualifier.Qualifier qualifier, kotlin.reflect.KClass<?> clazz) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(clazz, "clazz");
        if (qualifier != null) {
            return findDefinitionByName(qualifier.toString());
        }
        org.koin.core.definition.BeanDefinition<?> beanDefinitionFindDefinitionByType = findDefinitionByType(clazz);
        return beanDefinitionFindDefinitionByType != null ? beanDefinitionFindDefinitionByType : findDefinitionBySecondaryType(clazz);
    }

    private final org.koin.core.definition.BeanDefinition<?> findDefinitionByType(kotlin.reflect.KClass<?> kClass) {
        return this.definitionsPrimaryTypes.get(kClass);
    }

    private final org.koin.core.definition.BeanDefinition<?> findDefinitionBySecondaryType(kotlin.reflect.KClass<?> kClass) throws org.koin.core.error.NoBeanDefFoundException {
        java.util.ArrayList<org.koin.core.definition.BeanDefinition<?>> arrayList = this.definitionsSecondaryTypes.get(kClass);
        if (arrayList != null && arrayList.size() == 1) {
            return arrayList.get(0);
        }
        if (arrayList == null || arrayList.size() <= 1) {
            return null;
        }
        throw new org.koin.core.error.NoBeanDefFoundException("Found multiple definitions for type '" + org.koin.ext.KClassExtKt.getFullName(kClass) + "': " + arrayList + ". Please use the 'bind<P,S>()' function to bind your instance from primary and secondary types.");
    }

    private final org.koin.core.definition.BeanDefinition<?> findDefinitionByName(java.lang.String name) {
        return this.definitionsNames.get(name);
    }

    public final java.util.Set<org.koin.core.definition.BeanDefinition<?>> findAllCreatedAtStartDefinition$koin_core() {
        return this.definitionsToCreate;
    }

    public final int size() {
        return this.definitions.size();
    }

    public final org.koin.core.definition.BeanDefinition<?> getDefinition(kotlin.reflect.KClass<?> clazz) {
        java.lang.Object next;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(clazz, "clazz");
        java.util.Iterator<T> it = this.definitions.iterator();
        while (it.hasNext()) {
            next = it.next();
            org.koin.core.definition.BeanDefinition beanDefinition = (org.koin.core.definition.BeanDefinition) next;
            if (kotlin.jvm.internal.Intrinsics.areEqual(beanDefinition.getPrimaryType(), clazz) || beanDefinition.getSecondaryTypes().contains(clazz)) {
                return (org.koin.core.definition.BeanDefinition) next;
            }
        }
        next = null;
        return (org.koin.core.definition.BeanDefinition) next;
    }

    public final void close() {
        java.util.Iterator<T> it = this.definitions.iterator();
        while (it.hasNext()) {
            ((org.koin.core.definition.BeanDefinition) it.next()).close();
        }
        this.definitions.clear();
        this.definitionsNames.clear();
        this.definitionsPrimaryTypes.clear();
        this.definitionsToCreate.clear();
    }

    public final java.util.List<org.koin.core.definition.BeanDefinition<?>> getDefinitionsForClass(kotlin.reflect.KClass<?> clazz) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(clazz, "clazz");
        java.util.Set<org.koin.core.definition.BeanDefinition<?>> allDefinitions = getAllDefinitions();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : allDefinitions) {
            org.koin.core.definition.BeanDefinition beanDefinition = (org.koin.core.definition.BeanDefinition) obj;
            if (kotlin.jvm.internal.Intrinsics.areEqual(beanDefinition.getPrimaryType(), clazz) || (beanDefinition.getSecondaryTypes().contains(clazz) && !beanDefinition.hasScopeSet())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void loadModules(java.lang.Iterable<org.koin.core.module.Module> modules) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(modules, "modules");
        java.util.Iterator<org.koin.core.module.Module> it = modules.iterator();
        while (it.hasNext()) {
            saveDefinitions(it.next());
        }
    }

    public final void unloadModules$koin_core(java.lang.Iterable<org.koin.core.module.Module> modules) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(modules, "modules");
        java.util.Iterator<org.koin.core.module.Module> it = modules.iterator();
        while (it.hasNext()) {
            removeDefinitions(it.next());
        }
    }
}
