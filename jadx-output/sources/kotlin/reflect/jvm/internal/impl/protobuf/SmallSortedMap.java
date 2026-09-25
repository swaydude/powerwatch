package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes2.dex */
class SmallSortedMap<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {
    private java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<K, V>.Entry> entryList;
    private boolean isImmutable;
    private volatile kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<K, V>.EntrySet lazyEntrySet;
    private final int maxArraySize;
    private java.util.Map<K, V> overflowEntries;

    static <FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite<FieldDescriptorType>> kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object> newFieldMap(int i) {
        return (kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object>) new kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object>(i) { // from class: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.1
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
            public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
                return super.put((kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite) obj, obj2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap
            public void makeImmutable() {
                if (!isImmutable()) {
                    for (int i2 = 0; i2 < getNumArrayEntries(); i2++) {
                        java.util.Map.Entry<FieldDescriptorType, java.lang.Object> arrayEntryAt = getArrayEntryAt(i2);
                        if (((kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite) arrayEntryAt.getKey()).isRepeated()) {
                            arrayEntryAt.setValue(java.util.Collections.unmodifiableList((java.util.List) arrayEntryAt.getValue()));
                        }
                    }
                    for (java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entry : getOverflowEntries()) {
                        if (((kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                            entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                        }
                    }
                }
                super.makeImmutable();
            }
        };
    }

    private SmallSortedMap(int i) {
        this.maxArraySize = i;
        this.entryList = java.util.Collections.emptyList();
        this.overflowEntries = java.util.Collections.emptyMap();
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        this.overflowEntries = this.overflowEntries.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.overflowEntries);
        this.isImmutable = true;
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public int getNumArrayEntries() {
        return this.entryList.size();
    }

    public java.util.Map.Entry<K, V> getArrayEntryAt(int i) {
        return this.entryList.get(i);
    }

    public java.lang.Iterable<java.util.Map.Entry<K, V>> getOverflowEntries() {
        return this.overflowEntries.isEmpty() ? kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EmptySet.iterable() : this.overflowEntries.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.entryList.size() + this.overflowEntries.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return binarySearchInArray(comparable) >= 0 || this.overflowEntries.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iBinarySearchInArray = binarySearchInArray(comparable);
        if (iBinarySearchInArray >= 0) {
            return this.entryList.get(iBinarySearchInArray).getValue();
        }
        return this.overflowEntries.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        checkMutable();
        int iBinarySearchInArray = binarySearchInArray(k);
        if (iBinarySearchInArray >= 0) {
            return this.entryList.get(iBinarySearchInArray).setValue(v);
        }
        ensureEntryArrayMutable();
        int i = -(iBinarySearchInArray + 1);
        if (i >= this.maxArraySize) {
            return getOverflowEntriesMutable().put(k, v);
        }
        int size = this.entryList.size();
        int i2 = this.maxArraySize;
        if (size == i2) {
            kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<K, V>.Entry entryRemove = this.entryList.remove(i2 - 1);
            getOverflowEntriesMutable().put(entryRemove.getKey(), entryRemove.getValue());
        }
        this.entryList.add(i, new kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.Entry(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        checkMutable();
        if (!this.entryList.isEmpty()) {
            this.entryList.clear();
        }
        if (this.overflowEntries.isEmpty()) {
            return;
        }
        this.overflowEntries.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object obj) {
        checkMutable();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iBinarySearchInArray = binarySearchInArray(comparable);
        if (iBinarySearchInArray >= 0) {
            return removeArrayEntryAt(iBinarySearchInArray);
        }
        if (this.overflowEntries.isEmpty()) {
            return null;
        }
        return this.overflowEntries.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V removeArrayEntryAt(int i) {
        checkMutable();
        V value = this.entryList.remove(i).getValue();
        if (!this.overflowEntries.isEmpty()) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = getOverflowEntriesMutable().entrySet().iterator();
            this.entryList.add(new kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.Entry(this, it.next()));
            it.remove();
        }
        return value;
    }

    private int binarySearchInArray(K k) {
        int size = this.entryList.size() - 1;
        if (size >= 0) {
            int iCompareTo = k.compareTo(this.entryList.get(size).getKey());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int iCompareTo2 = k.compareTo(this.entryList.get(i2).getKey());
            if (iCompareTo2 < 0) {
                size = i2 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        if (this.lazyEntrySet == null) {
            this.lazyEntrySet = new kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EntrySet();
        }
        return this.lazyEntrySet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkMutable() {
        if (this.isImmutable) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private java.util.SortedMap<K, V> getOverflowEntriesMutable() {
        checkMutable();
        if (this.overflowEntries.isEmpty() && !(this.overflowEntries instanceof java.util.TreeMap)) {
            this.overflowEntries = new java.util.TreeMap();
        }
        return (java.util.SortedMap) this.overflowEntries;
    }

    private void ensureEntryArrayMutable() {
        checkMutable();
        if (!this.entryList.isEmpty() || (this.entryList instanceof java.util.ArrayList)) {
            return;
        }
        this.entryList = new java.util.ArrayList(this.maxArraySize);
    }

    private class Entry implements java.lang.Comparable<kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<K, V>.Entry>, java.util.Map.Entry<K, V> {
        private final K key;
        private V value;

        Entry(kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap smallSortedMap, java.util.Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        Entry(K k, V v) {
            this.key = k;
            this.value = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.lang.Comparable
        public int compareTo(kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<K, V>.Entry entry) {
            return getKey().compareTo(entry.getKey());
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.checkMutable();
            V v2 = this.value;
            this.value = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            return equals(this.key, entry.getKey()) && equals(this.value, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.key;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.value;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        public java.lang.String toString() {
            java.lang.String strValueOf = java.lang.String.valueOf(java.lang.String.valueOf(this.key));
            java.lang.String strValueOf2 = java.lang.String.valueOf(java.lang.String.valueOf(this.value));
            java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb.append(strValueOf);
            sb.append("=");
            sb.append(strValueOf2);
            return sb.toString();
        }

        private boolean equals(java.lang.Object obj, java.lang.Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }
    }

    private class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        private EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object obj2 = kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.get(entry.getKey());
            java.lang.Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(java.util.Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.put((java.lang.Comparable) entry.getKey(), (java.lang.Object) entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.clear();
        }
    }

    private class EntryIterator implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        private java.util.Iterator<java.util.Map.Entry<K, V>> lazyOverflowIterator;
        private boolean nextCalledBeforeRemove;
        private int pos;

        private EntryIterator() {
            this.pos = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.pos + 1 < kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.entryList.size() || getOverflowIterator().hasNext();
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
            this.nextCalledBeforeRemove = true;
            int i = this.pos + 1;
            this.pos = i;
            if (i < kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.entryList.size()) {
                return (java.util.Map.Entry) kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.entryList.get(this.pos);
            }
            return getOverflowIterator().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.nextCalledBeforeRemove) {
                throw new java.lang.IllegalStateException("remove() was called before next()");
            }
            this.nextCalledBeforeRemove = false;
            kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.checkMutable();
            if (this.pos < kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.entryList.size()) {
                kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap smallSortedMap = kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this;
                int i = this.pos;
                this.pos = i - 1;
                smallSortedMap.removeArrayEntryAt(i);
                return;
            }
            getOverflowIterator().remove();
        }

        private java.util.Iterator<java.util.Map.Entry<K, V>> getOverflowIterator() {
            if (this.lazyOverflowIterator == null) {
                this.lazyOverflowIterator = kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.this.overflowEntries.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }
    }

    private static class EmptySet {
        private static final java.util.Iterator<java.lang.Object> ITERATOR = new java.util.Iterator<java.lang.Object>() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EmptySet.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public java.lang.Object next() {
                throw new java.util.NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new java.lang.UnsupportedOperationException();
            }
        };
        private static final java.lang.Iterable<java.lang.Object> ITERABLE = new java.lang.Iterable<java.lang.Object>() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EmptySet.2
            @Override // java.lang.Iterable
            public java.util.Iterator<java.lang.Object> iterator() {
                return kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.EmptySet.ITERATOR;
            }
        };

        static <T> java.lang.Iterable<T> iterable() {
            return (java.lang.Iterable<T>) ITERABLE;
        }
    }
}
