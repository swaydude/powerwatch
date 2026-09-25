package okhttp3.internal.http2;

/* JADX INFO: loaded from: classes2.dex */
final class Hpack {
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    static final okhttp3.internal.http2.Header[] STATIC_HEADER_TABLE = {new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_AUTHORITY, ""), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_METHOD, io.fabric.sdk.android.services.network.HttpRequest.METHOD_GET), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_METHOD, io.fabric.sdk.android.services.network.HttpRequest.METHOD_POST), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_PATH, "/"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_PATH, "/index.html"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_SCHEME, "http"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_SCHEME, "https"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "200"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "204"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "206"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "304"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "400"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "404"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "500"), new okhttp3.internal.http2.Header("accept-charset", ""), new okhttp3.internal.http2.Header("accept-encoding", "gzip, deflate"), new okhttp3.internal.http2.Header("accept-language", ""), new okhttp3.internal.http2.Header("accept-ranges", ""), new okhttp3.internal.http2.Header("accept", ""), new okhttp3.internal.http2.Header("access-control-allow-origin", ""), new okhttp3.internal.http2.Header("age", ""), new okhttp3.internal.http2.Header("allow", ""), new okhttp3.internal.http2.Header("authorization", ""), new okhttp3.internal.http2.Header("cache-control", ""), new okhttp3.internal.http2.Header("content-disposition", ""), new okhttp3.internal.http2.Header("content-encoding", ""), new okhttp3.internal.http2.Header("content-language", ""), new okhttp3.internal.http2.Header("content-length", ""), new okhttp3.internal.http2.Header("content-location", ""), new okhttp3.internal.http2.Header("content-range", ""), new okhttp3.internal.http2.Header("content-type", ""), new okhttp3.internal.http2.Header("cookie", ""), new okhttp3.internal.http2.Header("date", ""), new okhttp3.internal.http2.Header("etag", ""), new okhttp3.internal.http2.Header("expect", ""), new okhttp3.internal.http2.Header("expires", ""), new okhttp3.internal.http2.Header("from", ""), new okhttp3.internal.http2.Header("host", ""), new okhttp3.internal.http2.Header("if-match", ""), new okhttp3.internal.http2.Header("if-modified-since", ""), new okhttp3.internal.http2.Header("if-none-match", ""), new okhttp3.internal.http2.Header("if-range", ""), new okhttp3.internal.http2.Header("if-unmodified-since", ""), new okhttp3.internal.http2.Header("last-modified", ""), new okhttp3.internal.http2.Header("link", ""), new okhttp3.internal.http2.Header(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION, ""), new okhttp3.internal.http2.Header("max-forwards", ""), new okhttp3.internal.http2.Header("proxy-authenticate", ""), new okhttp3.internal.http2.Header("proxy-authorization", ""), new okhttp3.internal.http2.Header("range", ""), new okhttp3.internal.http2.Header("referer", ""), new okhttp3.internal.http2.Header("refresh", ""), new okhttp3.internal.http2.Header("retry-after", ""), new okhttp3.internal.http2.Header("server", ""), new okhttp3.internal.http2.Header("set-cookie", ""), new okhttp3.internal.http2.Header("strict-transport-security", ""), new okhttp3.internal.http2.Header("transfer-encoding", ""), new okhttp3.internal.http2.Header("user-agent", ""), new okhttp3.internal.http2.Header("vary", ""), new okhttp3.internal.http2.Header("via", ""), new okhttp3.internal.http2.Header("www-authenticate", "")};
    static final java.util.Map<okio.ByteString, java.lang.Integer> NAME_TO_FIRST_INDEX = nameToFirstIndex();

    private Hpack() {
    }

    static final class Reader {
        okhttp3.internal.http2.Header[] dynamicTable;
        int dynamicTableByteCount;
        int headerCount;
        private final java.util.List<okhttp3.internal.http2.Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        int nextHeaderIndex;
        private final okio.BufferedSource source;

        Reader(int i, okio.Source source) {
            this(i, i, source);
        }

        Reader(int i, int i2, okio.Source source) {
            this.headerList = new java.util.ArrayList();
            okhttp3.internal.http2.Header[] headerArr = new okhttp3.internal.http2.Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i2;
            this.source = okio.Okio.buffer(source);
        }

        int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        private void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }

        private void clearDynamicTable() {
            java.util.Arrays.fill(this.dynamicTable, (java.lang.Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private int evictToRecoverBytes(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    i -= this.dynamicTable[length].hpackSize;
                    this.dynamicTableByteCount -= this.dynamicTable[length].hpackSize;
                    this.headerCount--;
                    i3++;
                }
                okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
                java.lang.System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.headerCount);
                this.nextHeaderIndex += i3;
            }
            return i3;
        }

        void readHeaders() throws java.io.IOException {
            while (!this.source.exhausted()) {
                int i = this.source.readByte() & kotlin.UByte.MAX_VALUE;
                if (i == 128) {
                    throw new java.io.IOException("index == 0");
                }
                if ((i & 128) == 128) {
                    readIndexedHeader(readInt(i, 127) - 1);
                } else if (i == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((i & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(i, 63) - 1);
                } else if ((i & 32) == 32) {
                    int i2 = readInt(i, 31);
                    this.maxDynamicTableByteCount = i2;
                    if (i2 < 0 || i2 > this.headerTableSizeSetting) {
                        throw new java.io.IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    adjustDynamicTableByteCount();
                } else if (i == 16 || i == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(i, 15) - 1);
                }
            }
        }

        public java.util.List<okhttp3.internal.http2.Header> getAndResetHeaderList() {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.headerList);
            this.headerList.clear();
            return arrayList;
        }

        private void readIndexedHeader(int i) throws java.io.IOException {
            if (isStaticHeader(i)) {
                this.headerList.add(okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE[i]);
                return;
            }
            int iDynamicTableIndex = dynamicTableIndex(i - okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE.length);
            if (iDynamicTableIndex >= 0) {
                okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    this.headerList.add(headerArr[iDynamicTableIndex]);
                    return;
                }
            }
            throw new java.io.IOException("Header index too large " + (i + 1));
        }

        private int dynamicTableIndex(int i) {
            return this.nextHeaderIndex + 1 + i;
        }

        private void readLiteralHeaderWithoutIndexingIndexedName(int i) throws java.io.IOException {
            this.headerList.add(new okhttp3.internal.http2.Header(getName(i), readByteString()));
        }

        private void readLiteralHeaderWithoutIndexingNewName() throws java.io.IOException {
            this.headerList.add(new okhttp3.internal.http2.Header(okhttp3.internal.http2.Hpack.checkLowercase(readByteString()), readByteString()));
        }

        private void readLiteralHeaderWithIncrementalIndexingIndexedName(int i) throws java.io.IOException {
            insertIntoDynamicTable(-1, new okhttp3.internal.http2.Header(getName(i), readByteString()));
        }

        private void readLiteralHeaderWithIncrementalIndexingNewName() throws java.io.IOException {
            insertIntoDynamicTable(-1, new okhttp3.internal.http2.Header(okhttp3.internal.http2.Hpack.checkLowercase(readByteString()), readByteString()));
        }

        private okio.ByteString getName(int i) throws java.io.IOException {
            if (isStaticHeader(i)) {
                return okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE[i].name;
            }
            int iDynamicTableIndex = dynamicTableIndex(i - okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE.length);
            if (iDynamicTableIndex >= 0) {
                okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    return headerArr[iDynamicTableIndex].name;
                }
            }
            throw new java.io.IOException("Header index too large " + (i + 1));
        }

        private boolean isStaticHeader(int i) {
            return i >= 0 && i <= okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE.length - 1;
        }

        private void insertIntoDynamicTable(int i, okhttp3.internal.http2.Header header) {
            this.headerList.add(header);
            int i2 = header.hpackSize;
            if (i != -1) {
                i2 -= this.dynamicTable[dynamicTableIndex(i)].hpackSize;
            }
            int i3 = this.maxDynamicTableByteCount;
            if (i2 > i3) {
                clearDynamicTable();
                return;
            }
            int iEvictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i2) - i3);
            if (i == -1) {
                int i4 = this.headerCount + 1;
                okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
                if (i4 > headerArr.length) {
                    okhttp3.internal.http2.Header[] headerArr2 = new okhttp3.internal.http2.Header[headerArr.length * 2];
                    java.lang.System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i5 = this.nextHeaderIndex;
                this.nextHeaderIndex = i5 - 1;
                this.dynamicTable[i5] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[i + dynamicTableIndex(i) + iEvictToRecoverBytes] = header;
            }
            this.dynamicTableByteCount += i2;
        }

        private int readByte() throws java.io.IOException {
            return this.source.readByte() & kotlin.UByte.MAX_VALUE;
        }

        int readInt(int i, int i2) throws java.io.IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = readByte();
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }

        okio.ByteString readByteString() throws java.io.IOException {
            int i = readByte();
            boolean z = (i & 128) == 128;
            int i2 = readInt(i, 127);
            if (z) {
                return okio.ByteString.of(okhttp3.internal.http2.Huffman.get().decode(this.source.readByteArray(i2)));
            }
            return this.source.readByteString(i2);
        }
    }

    private static java.util.Map<okio.ByteString, java.lang.Integer> nameToFirstIndex() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(STATIC_HEADER_TABLE.length);
        int i = 0;
        while (true) {
            okhttp3.internal.http2.Header[] headerArr = STATIC_HEADER_TABLE;
            if (i < headerArr.length) {
                if (!linkedHashMap.containsKey(headerArr[i].name)) {
                    linkedHashMap.put(headerArr[i].name, java.lang.Integer.valueOf(i));
                }
                i++;
            } else {
                return java.util.Collections.unmodifiableMap(linkedHashMap);
            }
        }
    }

    static final class Writer {
        private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
        private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
        okhttp3.internal.http2.Header[] dynamicTable;
        int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        int headerCount;
        int headerTableSizeSetting;
        int maxDynamicTableByteCount;
        int nextHeaderIndex;
        private final okio.Buffer out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        Writer(okio.Buffer buffer) {
            this(4096, true, buffer);
        }

        Writer(int i, boolean z, okio.Buffer buffer) {
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            okhttp3.internal.http2.Header[] headerArr = new okhttp3.internal.http2.Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i;
            this.useCompression = z;
            this.out = buffer;
        }

        private void clearDynamicTable() {
            java.util.Arrays.fill(this.dynamicTable, (java.lang.Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private int evictToRecoverBytes(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    i -= this.dynamicTable[length].hpackSize;
                    this.dynamicTableByteCount -= this.dynamicTable[length].hpackSize;
                    this.headerCount--;
                    i3++;
                }
                okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
                java.lang.System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.headerCount);
                okhttp3.internal.http2.Header[] headerArr2 = this.dynamicTable;
                int i4 = this.nextHeaderIndex;
                java.util.Arrays.fill(headerArr2, i4 + 1, i4 + 1 + i3, (java.lang.Object) null);
                this.nextHeaderIndex += i3;
            }
            return i3;
        }

        private void insertIntoDynamicTable(okhttp3.internal.http2.Header header) {
            int i = header.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount + 1;
            okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
            if (i3 > headerArr.length) {
                okhttp3.internal.http2.Header[] headerArr2 = new okhttp3.internal.http2.Header[headerArr.length * 2];
                java.lang.System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            this.dynamicTable[i4] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006c  */
        void writeHeaders(java.util.List<okhttp3.internal.http2.Header> list) throws java.io.IOException {
            int length;
            int length2;
            if (this.emitDynamicTableSizeUpdate) {
                int i = this.smallestHeaderTableSizeSetting;
                if (i < this.maxDynamicTableByteCount) {
                    writeInt(i, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                okhttp3.internal.http2.Header header = list.get(i2);
                okio.ByteString asciiLowercase = header.name.toAsciiLowercase();
                okio.ByteString byteString = header.value;
                java.lang.Integer num = okhttp3.internal.http2.Hpack.NAME_TO_FIRST_INDEX.get(asciiLowercase);
                if (num != null) {
                    length = num.intValue() + 1;
                    if (length <= 1 || length >= 8) {
                        length2 = length;
                        length = -1;
                    } else if (okhttp3.internal.Util.equal(okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE[length - 1].value, byteString)) {
                        length2 = length;
                    } else if (okhttp3.internal.Util.equal(okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE[length].value, byteString)) {
                        length2 = length;
                        length++;
                    } else {
                        length2 = length;
                        length = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length == -1) {
                    int length3 = this.dynamicTable.length;
                    for (int i3 = this.nextHeaderIndex + 1; i3 < length3; i3++) {
                        if (okhttp3.internal.Util.equal(this.dynamicTable[i3].name, asciiLowercase)) {
                            if (okhttp3.internal.Util.equal(this.dynamicTable[i3].value, byteString)) {
                                length = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE.length + (i3 - this.nextHeaderIndex);
                                break;
                            } else if (length2 == -1) {
                                length2 = (i3 - this.nextHeaderIndex) + okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE.length;
                            }
                        }
                    }
                }
                if (length != -1) {
                    writeInt(length, 127, 128);
                } else if (length2 == -1) {
                    this.out.writeByte(64);
                    writeByteString(asciiLowercase);
                    writeByteString(byteString);
                    insertIntoDynamicTable(header);
                } else if (asciiLowercase.startsWith(okhttp3.internal.http2.Header.PSEUDO_PREFIX) && !okhttp3.internal.http2.Header.TARGET_AUTHORITY.equals(asciiLowercase)) {
                    writeInt(length2, 15, 0);
                    writeByteString(byteString);
                } else {
                    writeInt(length2, 63, 64);
                    writeByteString(byteString);
                    insertIntoDynamicTable(header);
                }
            }
        }

        void writeInt(int i, int i2, int i3) {
            if (i < i2) {
                this.out.writeByte(i | i3);
                return;
            }
            this.out.writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.out.writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.out.writeByte(i4);
        }

        void writeByteString(okio.ByteString byteString) throws java.io.IOException {
            if (this.useCompression && okhttp3.internal.http2.Huffman.get().encodedLength(byteString) < byteString.size()) {
                okio.Buffer buffer = new okio.Buffer();
                okhttp3.internal.http2.Huffman.get().encode(byteString, buffer);
                okio.ByteString byteString2 = buffer.readByteString();
                writeInt(byteString2.size(), 127, 128);
                this.out.write(byteString2);
                return;
            }
            writeInt(byteString.size(), 127, 0);
            this.out.write(byteString);
        }

        void setHeaderTableSizeSetting(int i) {
            this.headerTableSizeSetting = i;
            int iMin = java.lang.Math.min(i, 16384);
            int i2 = this.maxDynamicTableByteCount;
            if (i2 == iMin) {
                return;
            }
            if (iMin < i2) {
                this.smallestHeaderTableSizeSetting = java.lang.Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            adjustDynamicTableByteCount();
        }

        private void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }
    }

    static okio.ByteString checkLowercase(okio.ByteString byteString) throws java.io.IOException {
        int size = byteString.size();
        for (int i = 0; i < size; i++) {
            byte b = byteString.getByte(i);
            if (b >= 65 && b <= 90) {
                throw new java.io.IOException("PROTOCOL_ERROR response malformed: mixed case name: " + byteString.utf8());
            }
        }
        return byteString;
    }
}
