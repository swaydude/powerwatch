package com.google.firebase.components;

/* JADX INFO: compiled from: com.google.firebase:firebase-components@@16.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class ComponentRuntime extends com.google.firebase.components.AbstractComponentContainer {
    private static final com.google.firebase.inject.Provider<java.util.Set<java.lang.Object>> EMPTY_PROVIDER = com.google.firebase.components.ComponentRuntime$$Lambda$5.instance;
    private final com.google.firebase.components.EventBus eventBus;
    private final java.util.Map<com.google.firebase.components.Component<?>, com.google.firebase.components.Lazy<?>> components = new java.util.HashMap();
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.components.Lazy<?>> lazyInstanceMap = new java.util.HashMap();
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.components.Lazy<java.util.Set<?>>> lazySetMap = new java.util.HashMap();

    @Override // com.google.firebase.components.AbstractComponentContainer, com.google.firebase.components.ComponentContainer
    public /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Class cls) {
        return super.get(cls);
    }

    @Override // com.google.firebase.components.AbstractComponentContainer, com.google.firebase.components.ComponentContainer
    public /* bridge */ /* synthetic */ java.util.Set setOf(java.lang.Class cls) {
        return super.setOf(cls);
    }

    public ComponentRuntime(java.util.concurrent.Executor executor, java.lang.Iterable<com.google.firebase.components.ComponentRegistrar> iterable, com.google.firebase.components.Component<?>... componentArr) {
        com.google.firebase.components.EventBus eventBus = new com.google.firebase.components.EventBus(executor);
        this.eventBus = eventBus;
        java.util.ArrayList<com.google.firebase.components.Component<?>> arrayList = new java.util.ArrayList();
        arrayList.add(com.google.firebase.components.Component.of(eventBus, com.google.firebase.components.EventBus.class, com.google.firebase.events.Subscriber.class, com.google.firebase.events.Publisher.class));
        java.util.Iterator<com.google.firebase.components.ComponentRegistrar> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getComponents());
        }
        for (com.google.firebase.components.Component<?> component : componentArr) {
            if (component != null) {
                arrayList.add(component);
            }
        }
        com.google.firebase.components.CycleDetector.detect(arrayList);
        for (com.google.firebase.components.Component<?> component2 : arrayList) {
            this.components.put(component2, new com.google.firebase.components.Lazy<>(com.google.firebase.components.ComponentRuntime$$Lambda$1.lambdaFactory$(this, component2)));
        }
        processInstanceComponents();
        processSetComponents();
    }

    static /* synthetic */ java.lang.Object lambda$new$0(com.google.firebase.components.ComponentRuntime componentRuntime, com.google.firebase.components.Component component) {
        return component.getFactory().create(new com.google.firebase.components.RestrictedComponentContainer(component, componentRuntime));
    }

    private void processInstanceComponents() {
        for (java.util.Map.Entry<com.google.firebase.components.Component<?>, com.google.firebase.components.Lazy<?>> entry : this.components.entrySet()) {
            com.google.firebase.components.Component<?> key = entry.getKey();
            if (key.isValue()) {
                com.google.firebase.components.Lazy<?> value = entry.getValue();
                java.util.Iterator<java.lang.Class<? super java.lang.Object>> it = key.getProvidedInterfaces().iterator();
                while (it.hasNext()) {
                    this.lazyInstanceMap.put(it.next(), value);
                }
            }
        }
        validateDependencies();
    }

    private void processSetComponents() {
        java.util.HashMap map = new java.util.HashMap();
        for (java.util.Map.Entry<com.google.firebase.components.Component<?>, com.google.firebase.components.Lazy<?>> entry : this.components.entrySet()) {
            com.google.firebase.components.Component<?> key = entry.getKey();
            if (!key.isValue()) {
                com.google.firebase.components.Lazy<?> value = entry.getValue();
                for (java.lang.Class<? super java.lang.Object> cls : key.getProvidedInterfaces()) {
                    if (!map.containsKey(cls)) {
                        map.put(cls, new java.util.HashSet());
                    }
                    ((java.util.Set) map.get(cls)).add(value);
                }
            }
        }
        for (java.util.Map.Entry entry2 : map.entrySet()) {
            this.lazySetMap.put((java.lang.Class) entry2.getKey(), new com.google.firebase.components.Lazy<>(com.google.firebase.components.ComponentRuntime$$Lambda$4.lambdaFactory$((java.util.Set) entry2.getValue())));
        }
    }

    static /* synthetic */ java.util.Set lambda$processSetComponents$1(java.util.Set set) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.firebase.components.Lazy) it.next()).get());
        }
        return java.util.Collections.unmodifiableSet(hashSet);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> com.google.firebase.inject.Provider<T> getProvider(java.lang.Class<T> cls) {
        com.google.firebase.components.Preconditions.checkNotNull(cls, "Null interface requested.");
        return this.lazyInstanceMap.get(cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> com.google.firebase.inject.Provider<java.util.Set<T>> setOfProvider(java.lang.Class<T> cls) {
        com.google.firebase.components.Lazy<java.util.Set<?>> lazy = this.lazySetMap.get(cls);
        return lazy != null ? lazy : (com.google.firebase.inject.Provider<java.util.Set<T>>) EMPTY_PROVIDER;
    }

    public void initializeEagerComponents(boolean z) {
        for (java.util.Map.Entry<com.google.firebase.components.Component<?>, com.google.firebase.components.Lazy<?>> entry : this.components.entrySet()) {
            com.google.firebase.components.Component<?> key = entry.getKey();
            com.google.firebase.components.Lazy<?> value = entry.getValue();
            if (key.isAlwaysEager() || (key.isEagerInDefaultApp() && z)) {
                value.get();
            }
        }
        this.eventBus.enablePublishingAndFlushPending();
    }

    private void validateDependencies() {
        for (com.google.firebase.components.Component<?> component : this.components.keySet()) {
            for (com.google.firebase.components.Dependency dependency : component.getDependencies()) {
                if (dependency.isRequired() && !this.lazyInstanceMap.containsKey(dependency.getInterface())) {
                    throw new com.google.firebase.components.MissingDependencyException(java.lang.String.format("Unsatisfied dependency for component %s: %s", component, dependency.getInterface()));
                }
            }
        }
    }
}
