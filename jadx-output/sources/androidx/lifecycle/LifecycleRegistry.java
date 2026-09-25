package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class LifecycleRegistry extends androidx.lifecycle.Lifecycle {
    private final java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> mLifecycleOwner;
    private androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState> mObserverMap = new androidx.arch.core.internal.FastSafeIterableMap<>();
    private int mAddingObserverCounter = 0;
    private boolean mHandlingEvent = false;
    private boolean mNewEventOccurred = false;
    private java.util.ArrayList<androidx.lifecycle.Lifecycle.State> mParentStates = new java.util.ArrayList<>();
    private androidx.lifecycle.Lifecycle.State mState = androidx.lifecycle.Lifecycle.State.INITIALIZED;

    public LifecycleRegistry(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        this.mLifecycleOwner = new java.lang.ref.WeakReference<>(lifecycleOwner);
    }

    @java.lang.Deprecated
    public void markState(androidx.lifecycle.Lifecycle.State state) {
        setCurrentState(state);
    }

    public void setCurrentState(androidx.lifecycle.Lifecycle.State state) {
        moveToState(state);
    }

    public void handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event event) {
        moveToState(getStateAfter(event));
    }

    private void moveToState(androidx.lifecycle.Lifecycle.State state) {
        if (this.mState == state) {
            return;
        }
        this.mState = state;
        if (this.mHandlingEvent || this.mAddingObserverCounter != 0) {
            this.mNewEventOccurred = true;
            return;
        }
        this.mHandlingEvent = true;
        sync();
        this.mHandlingEvent = false;
    }

    private boolean isSynced() {
        if (this.mObserverMap.size() == 0) {
            return true;
        }
        androidx.lifecycle.Lifecycle.State state = this.mObserverMap.eldest().getValue().mState;
        androidx.lifecycle.Lifecycle.State state2 = this.mObserverMap.newest().getValue().mState;
        return state == state2 && this.mState == state2;
    }

    private androidx.lifecycle.Lifecycle.State calculateTargetState(androidx.lifecycle.LifecycleObserver lifecycleObserver) {
        java.util.Map.Entry<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState> entryCeil = this.mObserverMap.ceil(lifecycleObserver);
        androidx.lifecycle.Lifecycle.State state = null;
        androidx.lifecycle.Lifecycle.State state2 = entryCeil != null ? entryCeil.getValue().mState : null;
        if (!this.mParentStates.isEmpty()) {
            java.util.ArrayList<androidx.lifecycle.Lifecycle.State> arrayList = this.mParentStates;
            state = arrayList.get(arrayList.size() - 1);
        }
        return min(min(this.mState, state2), state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(androidx.lifecycle.LifecycleObserver lifecycleObserver) {
        androidx.lifecycle.LifecycleOwner lifecycleOwner;
        androidx.lifecycle.LifecycleRegistry.ObserverWithState observerWithState = new androidx.lifecycle.LifecycleRegistry.ObserverWithState(lifecycleObserver, this.mState == androidx.lifecycle.Lifecycle.State.DESTROYED ? androidx.lifecycle.Lifecycle.State.DESTROYED : androidx.lifecycle.Lifecycle.State.INITIALIZED);
        if (this.mObserverMap.putIfAbsent(lifecycleObserver, observerWithState) == null && (lifecycleOwner = this.mLifecycleOwner.get()) != null) {
            boolean z = this.mAddingObserverCounter != 0 || this.mHandlingEvent;
            androidx.lifecycle.Lifecycle.State stateCalculateTargetState = calculateTargetState(lifecycleObserver);
            this.mAddingObserverCounter++;
            while (observerWithState.mState.compareTo(stateCalculateTargetState) < 0 && this.mObserverMap.contains(lifecycleObserver)) {
                pushParentState(observerWithState.mState);
                observerWithState.dispatchEvent(lifecycleOwner, upEvent(observerWithState.mState));
                popParentState();
                stateCalculateTargetState = calculateTargetState(lifecycleObserver);
            }
            if (!z) {
                sync();
            }
            this.mAddingObserverCounter--;
        }
    }

    private void popParentState() {
        java.util.ArrayList<androidx.lifecycle.Lifecycle.State> arrayList = this.mParentStates;
        arrayList.remove(arrayList.size() - 1);
    }

    private void pushParentState(androidx.lifecycle.Lifecycle.State state) {
        this.mParentStates.add(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(androidx.lifecycle.LifecycleObserver lifecycleObserver) {
        this.mObserverMap.remove(lifecycleObserver);
    }

    public int getObserverCount() {
        return this.mObserverMap.size();
    }

    @Override // androidx.lifecycle.Lifecycle
    public androidx.lifecycle.Lifecycle.State getCurrentState() {
        return this.mState;
    }

    static androidx.lifecycle.Lifecycle.State getStateAfter(androidx.lifecycle.Lifecycle.Event event) {
        switch (androidx.lifecycle.LifecycleRegistry.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[event.ordinal()]) {
            case 1:
            case 2:
                return androidx.lifecycle.Lifecycle.State.CREATED;
            case 3:
            case 4:
                return androidx.lifecycle.Lifecycle.State.STARTED;
            case 5:
                return androidx.lifecycle.Lifecycle.State.RESUMED;
            case 6:
                return androidx.lifecycle.Lifecycle.State.DESTROYED;
            default:
                throw new java.lang.IllegalArgumentException("Unexpected event value " + event);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleRegistry$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$Event;
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$State;

        static {
            int[] iArr = new int[androidx.lifecycle.Lifecycle.State.values().length];
            $SwitchMap$androidx$lifecycle$Lifecycle$State = iArr;
            try {
                iArr[androidx.lifecycle.Lifecycle.State.INITIALIZED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$State[androidx.lifecycle.Lifecycle.State.CREATED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$State[androidx.lifecycle.Lifecycle.State.STARTED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$State[androidx.lifecycle.Lifecycle.State.RESUMED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$State[androidx.lifecycle.Lifecycle.State.DESTROYED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[androidx.lifecycle.Lifecycle.Event.values().length];
            $SwitchMap$androidx$lifecycle$Lifecycle$Event = iArr2;
            try {
                iArr2[androidx.lifecycle.Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$Event[androidx.lifecycle.Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$Event[androidx.lifecycle.Lifecycle.Event.ON_START.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$Event[androidx.lifecycle.Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$Event[androidx.lifecycle.Lifecycle.Event.ON_RESUME.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$Event[androidx.lifecycle.Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$Event[androidx.lifecycle.Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }

    private static androidx.lifecycle.Lifecycle.Event downEvent(androidx.lifecycle.Lifecycle.State state) {
        int i = androidx.lifecycle.LifecycleRegistry.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$State[state.ordinal()];
        if (i == 1) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i == 2) {
            return androidx.lifecycle.Lifecycle.Event.ON_DESTROY;
        }
        if (i == 3) {
            return androidx.lifecycle.Lifecycle.Event.ON_STOP;
        }
        if (i == 4) {
            return androidx.lifecycle.Lifecycle.Event.ON_PAUSE;
        }
        if (i == 5) {
            throw new java.lang.IllegalArgumentException();
        }
        throw new java.lang.IllegalArgumentException("Unexpected state value " + state);
    }

    private static androidx.lifecycle.Lifecycle.Event upEvent(androidx.lifecycle.Lifecycle.State state) {
        int i = androidx.lifecycle.LifecycleRegistry.AnonymousClass1.$SwitchMap$androidx$lifecycle$Lifecycle$State[state.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return androidx.lifecycle.Lifecycle.Event.ON_START;
            }
            if (i == 3) {
                return androidx.lifecycle.Lifecycle.Event.ON_RESUME;
            }
            if (i == 4) {
                throw new java.lang.IllegalArgumentException();
            }
            if (i != 5) {
                throw new java.lang.IllegalArgumentException("Unexpected state value " + state);
            }
        }
        return androidx.lifecycle.Lifecycle.Event.ON_CREATE;
    }

    private void forwardPass(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState>.IteratorWithAdditions iteratorWithAdditions = this.mObserverMap.iteratorWithAdditions();
        while (iteratorWithAdditions.hasNext() && !this.mNewEventOccurred) {
            java.util.Map.Entry next = iteratorWithAdditions.next();
            androidx.lifecycle.LifecycleRegistry.ObserverWithState observerWithState = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) next.getValue();
            while (observerWithState.mState.compareTo(this.mState) < 0 && !this.mNewEventOccurred && this.mObserverMap.contains((androidx.lifecycle.LifecycleObserver) next.getKey())) {
                pushParentState(observerWithState.mState);
                observerWithState.dispatchEvent(lifecycleOwner, upEvent(observerWithState.mState));
                popParentState();
            }
        }
    }

    private void backwardPass(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        java.util.Iterator<java.util.Map.Entry<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState>> itDescendingIterator = this.mObserverMap.descendingIterator();
        while (itDescendingIterator.hasNext() && !this.mNewEventOccurred) {
            java.util.Map.Entry<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState> next = itDescendingIterator.next();
            androidx.lifecycle.LifecycleRegistry.ObserverWithState value = next.getValue();
            while (value.mState.compareTo(this.mState) > 0 && !this.mNewEventOccurred && this.mObserverMap.contains(next.getKey())) {
                androidx.lifecycle.Lifecycle.Event eventDownEvent = downEvent(value.mState);
                pushParentState(getStateAfter(eventDownEvent));
                value.dispatchEvent(lifecycleOwner, eventDownEvent);
                popParentState();
            }
        }
    }

    private void sync() {
        androidx.lifecycle.LifecycleOwner lifecycleOwner = this.mLifecycleOwner.get();
        if (lifecycleOwner == null) {
            throw new java.lang.IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (!isSynced()) {
            this.mNewEventOccurred = false;
            if (this.mState.compareTo(this.mObserverMap.eldest().getValue().mState) < 0) {
                backwardPass(lifecycleOwner);
            }
            java.util.Map.Entry<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState> entryNewest = this.mObserverMap.newest();
            if (!this.mNewEventOccurred && entryNewest != null && this.mState.compareTo(entryNewest.getValue().mState) > 0) {
                forwardPass(lifecycleOwner);
            }
        }
        this.mNewEventOccurred = false;
    }

    static androidx.lifecycle.Lifecycle.State min(androidx.lifecycle.Lifecycle.State state, androidx.lifecycle.Lifecycle.State state2) {
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    static class ObserverWithState {
        androidx.lifecycle.LifecycleEventObserver mLifecycleObserver;
        androidx.lifecycle.Lifecycle.State mState;

        ObserverWithState(androidx.lifecycle.LifecycleObserver lifecycleObserver, androidx.lifecycle.Lifecycle.State state) {
            this.mLifecycleObserver = androidx.lifecycle.Lifecycling.lifecycleEventObserver(lifecycleObserver);
            this.mState = state;
        }

        void dispatchEvent(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
            androidx.lifecycle.Lifecycle.State stateAfter = androidx.lifecycle.LifecycleRegistry.getStateAfter(event);
            this.mState = androidx.lifecycle.LifecycleRegistry.min(this.mState, stateAfter);
            this.mLifecycleObserver.onStateChanged(lifecycleOwner, event);
            this.mState = stateAfter;
        }
    }
}
