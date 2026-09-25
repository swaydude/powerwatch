package okio;

/* JADX INFO: loaded from: classes2.dex */
public final class Options extends java.util.AbstractList<okio.ByteString> implements java.util.RandomAccess {
    final okio.ByteString[] byteStrings;
    final int[] trie;

    private Options(okio.ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    public static okio.Options of(okio.ByteString... byteStringArr) {
        if (byteStringArr.length == 0) {
            return new okio.Options(new okio.ByteString[0], new int[]{0, -1});
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(byteStringArr));
        java.util.Collections.sort(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(-1);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.set(java.util.Collections.binarySearch(arrayList, byteStringArr[i2]), java.lang.Integer.valueOf(i2));
        }
        if (((okio.ByteString) arrayList.get(0)).size() == 0) {
            throw new java.lang.IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i3 = 0;
        while (i3 < arrayList.size()) {
            okio.ByteString byteString = (okio.ByteString) arrayList.get(i3);
            int i4 = i3 + 1;
            int i5 = i4;
            while (i5 < arrayList.size()) {
                okio.ByteString byteString2 = (okio.ByteString) arrayList.get(i5);
                if (!byteString2.startsWith(byteString)) {
                    break;
                }
                if (byteString2.size() == byteString.size()) {
                    throw new java.lang.IllegalArgumentException("duplicate option: " + byteString2);
                }
                if (((java.lang.Integer) arrayList2.get(i5)).intValue() > ((java.lang.Integer) arrayList2.get(i3)).intValue()) {
                    arrayList.remove(i5);
                    arrayList2.remove(i5);
                } else {
                    i5++;
                }
            }
            i3 = i4;
        }
        okio.Buffer buffer = new okio.Buffer();
        buildTrieRecursive(0L, buffer, 0, arrayList, 0, arrayList.size(), arrayList2);
        int iIntCount = intCount(buffer);
        int[] iArr = new int[iIntCount];
        for (int i6 = 0; i6 < iIntCount; i6++) {
            iArr[i6] = buffer.readInt();
        }
        if (!buffer.exhausted()) {
            throw new java.lang.AssertionError();
        }
        return new okio.Options((okio.ByteString[]) byteStringArr.clone(), iArr);
    }

    private static void buildTrieRecursive(long j, okio.Buffer buffer, int i, java.util.List<okio.ByteString> list, int i2, int i3, java.util.List<java.lang.Integer> list2) {
        int i4;
        int i5;
        int i6 = i2;
        if (i6 >= i3) {
            throw new java.lang.AssertionError();
        }
        for (int i7 = i6; i7 < i3; i7++) {
            if (list.get(i7).size() < i) {
                throw new java.lang.AssertionError();
            }
        }
        okio.ByteString byteString = list.get(i2);
        okio.ByteString byteString2 = list.get(i3 - 1);
        int iIntValue = -1;
        if (i == byteString.size()) {
            iIntValue = list2.get(i6).intValue();
            i6++;
            byteString = list.get(i6);
        }
        int i8 = i6;
        if (byteString.getByte(i) != byteString2.getByte(i)) {
            int i9 = 1;
            for (int i10 = i8 + 1; i10 < i3; i10++) {
                if (list.get(i10 - 1).getByte(i) != list.get(i10).getByte(i)) {
                    i9++;
                }
            }
            long jIntCount = j + ((long) intCount(buffer)) + 2 + ((long) (i9 * 2));
            buffer.writeInt(i9);
            buffer.writeInt(iIntValue);
            for (int i11 = i8; i11 < i3; i11++) {
                byte b = list.get(i11).getByte(i);
                if (i11 == i8 || b != list.get(i11 - 1).getByte(i)) {
                    buffer.writeInt(b & kotlin.UByte.MAX_VALUE);
                }
            }
            okio.Buffer buffer2 = new okio.Buffer();
            int i12 = i8;
            while (i12 < i3) {
                byte b2 = list.get(i12).getByte(i);
                int i13 = i12 + 1;
                int i14 = i13;
                while (true) {
                    if (i14 >= i3) {
                        i5 = i3;
                        break;
                    } else {
                        if (b2 != list.get(i14).getByte(i)) {
                            i5 = i14;
                            break;
                        }
                        i14++;
                    }
                }
                if (i13 == i5 && i + 1 == list.get(i12).size()) {
                    buffer.writeInt(list2.get(i12).intValue());
                } else {
                    buffer.writeInt((int) ((((long) intCount(buffer2)) + jIntCount) * (-1)));
                    buildTrieRecursive(jIntCount, buffer2, i + 1, list, i12, i5, list2);
                }
                buffer2 = buffer2;
                i12 = i5;
            }
            okio.Buffer buffer3 = buffer2;
            buffer.write(buffer3, buffer3.size());
            return;
        }
        int i15 = 0;
        int iMin = java.lang.Math.min(byteString.size(), byteString2.size());
        for (int i16 = i; i16 < iMin && byteString.getByte(i16) == byteString2.getByte(i16); i16++) {
            i15++;
        }
        long jIntCount2 = 1 + j + ((long) intCount(buffer)) + 2 + ((long) i15);
        buffer.writeInt(-i15);
        buffer.writeInt(iIntValue);
        int i17 = i;
        while (true) {
            i4 = i + i15;
            if (i17 >= i4) {
                break;
            }
            buffer.writeInt(byteString.getByte(i17) & kotlin.UByte.MAX_VALUE);
            i17++;
        }
        if (i8 + 1 == i3) {
            if (i4 != list.get(i8).size()) {
                throw new java.lang.AssertionError();
            }
            buffer.writeInt(list2.get(i8).intValue());
        } else {
            okio.Buffer buffer4 = new okio.Buffer();
            buffer.writeInt((int) ((((long) intCount(buffer4)) + jIntCount2) * (-1)));
            buildTrieRecursive(jIntCount2, buffer4, i4, list, i8, i3, list2);
            buffer.write(buffer4, buffer4.size());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public okio.ByteString get(int i) {
        return this.byteStrings[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.byteStrings.length;
    }

    private static int intCount(okio.Buffer buffer) {
        return (int) (buffer.size() / 4);
    }
}
