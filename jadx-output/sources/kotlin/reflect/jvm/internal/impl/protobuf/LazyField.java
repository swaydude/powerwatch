package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public class LazyField extends kotlin.reflect.jvm.internal.impl.protobuf.LazyFieldLite {
    private final kotlin.reflect.jvm.internal.impl.protobuf.MessageLite defaultInstance;

    public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite getValue() {
        return getValue(this.defaultInstance);
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        return getValue().equals(obj);
    }

    public java.lang.String toString() {
        return getValue().toString();
    }

    static class LazyEntry<K> implements java.util.Map.Entry<K, java.lang.Object> {
        private java.util.Map.Entry<K, kotlin.reflect.jvm.internal.impl.protobuf.LazyField> entry;

        private LazyEntry(java.util.Map.Entry<K, kotlin.reflect.jvm.internal.impl.protobuf.LazyField> entry) {
            this.entry = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.entry.getKey();
        }

        @Override // java.util.Map.Entry
        public java.lang.Object getValue() {
            kotlin.reflect.jvm.internal.impl.protobuf.LazyField value = this.entry.getValue();
            if (value == null) {
                return null;
            }
            return value.getValue();
        }

        @Override // java.util.Map.Entry
        public java.lang.Object setValue(java.lang.Object obj) {
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.MessageLite)) {
                throw new java.lang.IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            return this.entry.getValue().setValue((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) obj);
        }
    }

    static class LazyIterator<K> implements java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> {
        private java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> iterator;

        public LazyIterator(java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> it) {
            this.iterator = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, java.lang.Object> next() {
            java.util.Map.Entry<K, java.lang.Object> next = this.iterator.next();
            return next.getValue() instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField ? new kotlin.reflect.jvm.internal.impl.protobuf.LazyField.LazyEntry(next) : next;
        }

        @Override // java.util.Iterator
        public void remove() {
            this.iterator.remove();
        }
    }
}
