package com.google.android.gms.common.internal.safeparcel;

/* JADX INFO: loaded from: classes.dex */
public final class SafeParcelableSerializer {
    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> byte[] serializeToBytes(T t) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        t.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> T deserializeFromBytes(byte[] bArr, android.os.Parcelable.Creator<T> creator) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(creator);
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        T tCreateFromParcel = creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return tCreateFromParcel;
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void serializeIterableToBundle(java.lang.Iterable<T> iterable, android.os.Bundle bundle, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(serializeToBytes(it.next()));
        }
        bundle.putSerializable(str, arrayList);
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.util.ArrayList<T> deserializeIterableFromBundle(android.os.Bundle bundle, java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        java.util.ArrayList arrayList = (java.util.ArrayList) bundle.getSerializable(str);
        if (arrayList == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.types.model.ArgumentList argumentList = (java.util.ArrayList<T>) new java.util.ArrayList(arrayList.size());
        java.util.ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList2.get(i);
            i++;
            argumentList.add(deserializeFromBytes((byte[]) obj, creator));
        }
        return argumentList;
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.lang.String serializeToString(T t) {
        return com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(serializeToBytes(t));
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> T deserializeFromString(java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        return (T) deserializeFromBytes(com.google.android.gms.common.util.Base64Utils.decodeUrlSafe(str), creator);
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void serializeToIntentExtra(T t, android.content.Intent intent, java.lang.String str) {
        intent.putExtra(str, serializeToBytes(t));
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> T deserializeFromIntentExtra(android.content.Intent intent, java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) deserializeFromBytes(byteArrayExtra, creator);
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void serializeIterableToIntentExtra(java.lang.Iterable<T> iterable, android.content.Intent intent, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(serializeToBytes(it.next()));
        }
        intent.putExtra(str, arrayList);
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.util.ArrayList<T> deserializeIterableFromIntentExtra(android.content.Intent intent, java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        java.util.ArrayList arrayList = (java.util.ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.types.model.ArgumentList argumentList = (java.util.ArrayList<T>) new java.util.ArrayList(arrayList.size());
        java.util.ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList2.get(i);
            i++;
            argumentList.add(deserializeFromBytes((byte[]) obj, creator));
        }
        return argumentList;
    }
}
