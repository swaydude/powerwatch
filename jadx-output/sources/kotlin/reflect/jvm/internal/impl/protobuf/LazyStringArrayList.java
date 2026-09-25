package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public class LazyStringArrayList extends java.util.AbstractList<java.lang.String> implements java.util.RandomAccess, kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList {
    public static final kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList EMPTY = new kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList().getUnmodifiableView();
    private final java.util.List<java.lang.Object> list;

    public LazyStringArrayList() {
        this.list = new java.util.ArrayList();
    }

    public LazyStringArrayList(kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList lazyStringList) {
        this.list = new java.util.ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String get(int i) {
        java.lang.Object obj = this.list.get(i);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.ByteString) {
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString = (kotlin.reflect.jvm.internal.impl.protobuf.ByteString) obj;
            java.lang.String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.list.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        java.lang.String stringUtf9 = kotlin.reflect.jvm.internal.impl.protobuf.Internal.toStringUtf8(bArr);
        if (kotlin.reflect.jvm.internal.impl.protobuf.Internal.isValidUtf8(bArr)) {
            this.list.set(i, stringUtf9);
        }
        return stringUtf9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String set(int i, java.lang.String str) {
        return asString(this.list.set(i, str));
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, java.lang.String str) {
        this.list.add(i, str);
        this.modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, java.util.Collection<? extends java.lang.String> collection) {
        if (collection instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList) {
            collection = ((kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.list.addAll(i, collection);
        this.modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.String remove(int i) {
        java.lang.Object objRemove = this.list.remove(i);
        this.modCount++;
        return asString(objRemove);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.list.clear();
        this.modCount++;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public void add(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
        this.list.add(byteString);
        this.modCount++;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public kotlin.reflect.jvm.internal.impl.protobuf.ByteString getByteString(int i) {
        java.lang.Object obj = this.list.get(i);
        kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteStringAsByteString = asByteString(obj);
        if (byteStringAsByteString != obj) {
            this.list.set(i, byteStringAsByteString);
        }
        return byteStringAsByteString;
    }

    private static java.lang.String asString(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.ByteString) {
            return ((kotlin.reflect.jvm.internal.impl.protobuf.ByteString) obj).toStringUtf8();
        }
        return kotlin.reflect.jvm.internal.impl.protobuf.Internal.toStringUtf8((byte[]) obj);
    }

    private static kotlin.reflect.jvm.internal.impl.protobuf.ByteString asByteString(java.lang.Object obj) {
        if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.ByteString) {
            return (kotlin.reflect.jvm.internal.impl.protobuf.ByteString) obj;
        }
        if (obj instanceof java.lang.String) {
            return kotlin.reflect.jvm.internal.impl.protobuf.ByteString.copyFromUtf8((java.lang.String) obj);
        }
        return kotlin.reflect.jvm.internal.impl.protobuf.ByteString.copyFrom((byte[]) obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public java.util.List<?> getUnderlyingElements() {
        return java.util.Collections.unmodifiableList(this.list);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList getUnmodifiableView() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList(this);
    }
}
