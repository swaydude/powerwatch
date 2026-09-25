package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes2.dex */
class RopeByteString extends kotlin.reflect.jvm.internal.impl.protobuf.ByteString {
    private static final int[] minLengthByDepth;
    private int hash;
    private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString left;
    private final int leftLength;
    private final kotlin.reflect.jvm.internal.impl.protobuf.ByteString right;
    private final int totalLength;
    private final int treeDepth;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(java.lang.Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        minLengthByDepth = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = minLengthByDepth;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((java.lang.Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    private RopeByteString(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString2) {
        this.hash = 0;
        this.left = byteString;
        this.right = byteString2;
        int size = byteString.size();
        this.leftLength = size;
        this.totalLength = size + byteString2.size();
        this.treeDepth = java.lang.Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.ByteString concatenate(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString2) {
        kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString ropeByteString = byteString instanceof kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString ? (kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString) byteString : null;
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() != 0) {
            int size = byteString.size() + byteString2.size();
            if (size < 128) {
                return concatenateBytes(byteString, byteString2);
            }
            if (ropeByteString != null && ropeByteString.right.size() + byteString2.size() < 128) {
                byteString2 = new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString(ropeByteString.left, concatenateBytes(ropeByteString.right, byteString2));
            } else if (ropeByteString != null && ropeByteString.left.getTreeDepth() > ropeByteString.right.getTreeDepth() && ropeByteString.getTreeDepth() > byteString2.getTreeDepth()) {
                byteString2 = new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString(ropeByteString.left, new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString(ropeByteString.right, byteString2));
            } else {
                if (size >= minLengthByDepth[java.lang.Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1]) {
                    return new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString(byteString, byteString2);
                }
                return new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.Balancer().balance(byteString, byteString2);
            }
        }
        return byteString2;
    }

    private static kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString concatenateBytes(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return new kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString(bArr);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.totalLength;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected boolean isBalanced() {
        return this.totalLength >= minLengthByDepth[this.treeDepth];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            this.left.copyToInternal(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.right.copyToInternal(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.left.copyToInternal(bArr, i, i2, i6);
            this.right.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    void writeToInternal(java.io.OutputStream outputStream, int i, int i2) throws java.io.IOException {
        int i3 = i + i2;
        int i4 = this.leftLength;
        if (i3 <= i4) {
            this.left.writeToInternal(outputStream, i, i2);
        } else {
            if (i >= i4) {
                this.right.writeToInternal(outputStream, i - i4, i2);
                return;
            }
            int i5 = i4 - i;
            this.left.writeToInternal(outputStream, i, i5);
            this.right.writeToInternal(outputStream, 0, i2 - i5);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public java.lang.String toString(java.lang.String str) throws java.io.UnsupportedEncodingException {
        return new java.lang.String(toByteArray(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString = this.right;
        return byteString.partialIsValidUtf8(iPartialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    public boolean equals(java.lang.Object obj) {
        int iPeekCachedHashCode;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.ByteString)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString = (kotlin.reflect.jvm.internal.impl.protobuf.ByteString) obj;
        if (this.totalLength != byteString.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        if (this.hash == 0 || (iPeekCachedHashCode = byteString.peekCachedHashCode()) == 0 || this.hash == iPeekCachedHashCode) {
            return equalsFragments(byteString);
        }
        return false;
    }

    private boolean equalsFragments(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
        kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator pieceIterator = new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator(this);
        kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString next = pieceIterator.next();
        kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator pieceIterator2 = new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator(byteString);
        kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString next2 = pieceIterator2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next.size() - i;
            int size2 = next2.size() - i2;
            int iMin = java.lang.Math.min(size, size2);
            if (!(i == 0 ? next.equalsRange(next2, i2, iMin) : next2.equalsRange(next, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.totalLength;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new java.lang.IllegalStateException();
            }
            if (iMin == size) {
                next = pieceIterator.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == size2) {
                next2 = pieceIterator2.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
        }
    }

    public int hashCode() {
        int iPartialHash = this.hash;
        if (iPartialHash == 0) {
            int i = this.totalLength;
            iPartialHash = partialHash(i, 0, i);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.hash = iPartialHash;
        }
        return iPartialHash;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int peekCachedHashCode() {
        return this.hash;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialHash(this.left.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream newCodedInput() {
        return kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.newInstance(new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.RopeInputStream());
    }

    private static class Balancer {
        private final java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.ByteString> prefixesStack;

        private Balancer() {
            this.prefixesStack = new java.util.Stack<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public kotlin.reflect.jvm.internal.impl.protobuf.ByteString balance(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString2) {
            doBalance(byteString);
            doBalance(byteString2);
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteStringPop = this.prefixesStack.pop();
            while (!this.prefixesStack.isEmpty()) {
                byteStringPop = new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString(this.prefixesStack.pop(), byteStringPop);
            }
            return byteStringPop;
        }

        private void doBalance(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
            if (byteString.isBalanced()) {
                insert(byteString);
                return;
            }
            if (byteString instanceof kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString) {
                kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString ropeByteString = (kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString) byteString;
                doBalance(ropeByteString.left);
                doBalance(ropeByteString.right);
            } else {
                java.lang.String strValueOf = java.lang.String.valueOf(java.lang.String.valueOf(byteString.getClass()));
                java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(strValueOf);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }

        private void insert(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
            int depthBinForLength = getDepthBinForLength(byteString.size());
            int i = kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.minLengthByDepth[depthBinForLength + 1];
            if (!this.prefixesStack.isEmpty() && this.prefixesStack.peek().size() < i) {
                int i2 = kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.minLengthByDepth[depthBinForLength];
                kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteStringPop = this.prefixesStack.pop();
                while (true) {
                    if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= i2) {
                        break;
                    } else {
                        byteStringPop = new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString(this.prefixesStack.pop(), byteStringPop);
                    }
                }
                kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString ropeByteString = new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString(byteStringPop, byteString);
                while (!this.prefixesStack.isEmpty()) {
                    if (this.prefixesStack.peek().size() >= kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.minLengthByDepth[getDepthBinForLength(ropeByteString.size()) + 1]) {
                        break;
                    } else {
                        ropeByteString = new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString(this.prefixesStack.pop(), ropeByteString);
                    }
                }
                this.prefixesStack.push(ropeByteString);
                return;
            }
            this.prefixesStack.push(byteString);
        }

        private int getDepthBinForLength(int i) {
            int iBinarySearch = java.util.Arrays.binarySearch(kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.minLengthByDepth, i);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }
    }

    private static class PieceIterator implements java.util.Iterator<kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString> {
        private final java.util.Stack<kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString> breadCrumbs;
        private kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString next;

        private PieceIterator(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
            this.breadCrumbs = new java.util.Stack<>();
            this.next = getLeafByLeft(byteString);
        }

        private kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString getLeafByLeft(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString) {
            while (byteString instanceof kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString) {
                kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString ropeByteString = (kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString) byteString;
                this.breadCrumbs.push(ropeByteString);
                byteString = ropeByteString.left;
            }
            return (kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString) byteString;
        }

        private kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString getNextNonEmptyLeaf() {
            while (!this.breadCrumbs.isEmpty()) {
                kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString leafByLeft = getLeafByLeft(this.breadCrumbs.pop().right);
                if (!leafByLeft.isEmpty()) {
                    return leafByLeft;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.next != null;
        }

        @Override // java.util.Iterator
        public kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString next() {
            kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString literalByteString = this.next;
            if (literalByteString == null) {
                throw new java.util.NoSuchElementException();
            }
            this.next = getNextNonEmptyLeaf();
            return literalByteString;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public java.util.Iterator<java.lang.Byte> iterator() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.RopeByteIterator();
    }

    private class RopeByteIterator implements kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator {
        private kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator bytes;
        int bytesRemaining;
        private final kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator pieces;

        /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.reflect.jvm.internal.impl.protobuf.ByteString$ByteIterator] */
        private RopeByteIterator() {
            kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator pieceIterator = new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator(kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.this);
            this.pieces = pieceIterator;
            this.bytes = pieceIterator.next().iterator();
            this.bytesRemaining = kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.bytesRemaining > 0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public java.lang.Byte next() {
            return java.lang.Byte.valueOf(nextByte());
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.reflect.jvm.internal.impl.protobuf.ByteString$ByteIterator] */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            if (!this.bytes.hasNext()) {
                this.bytes = this.pieces.next().iterator();
            }
            this.bytesRemaining--;
            return this.bytes.nextByte();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private class RopeInputStream extends java.io.InputStream {
        private kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString currentPiece;
        private int currentPieceIndex;
        private int currentPieceOffsetInRope;
        private int currentPieceSize;
        private int mark;
        private kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator pieceIterator;

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        public RopeInputStream() {
            initialize();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            java.util.Objects.requireNonNull(bArr);
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            return readSkipInternal(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j < 0) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return readSkipInternal(null, 0, (int) j);
        }

        private int readSkipInternal(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (i3 > 0) {
                advanceIfCurrentPieceFullyRead();
                if (this.currentPiece == null) {
                    if (i3 != i2) {
                        break;
                    }
                    return -1;
                }
                int iMin = java.lang.Math.min(this.currentPieceSize - this.currentPieceIndex, i3);
                if (bArr != null) {
                    this.currentPiece.copyTo(bArr, this.currentPieceIndex, i, iMin);
                    i += iMin;
                }
                this.currentPieceIndex += iMin;
                i3 -= iMin;
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
            advanceIfCurrentPieceFullyRead();
            kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString literalByteString = this.currentPiece;
            if (literalByteString == null) {
                return -1;
            }
            int i = this.currentPieceIndex;
            this.currentPieceIndex = i + 1;
            return literalByteString.byteAt(i) & kotlin.UByte.MAX_VALUE;
        }

        @Override // java.io.InputStream
        public int available() throws java.io.IOException {
            return kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.this.size() - (this.currentPieceOffsetInRope + this.currentPieceIndex);
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            initialize();
            readSkipInternal(null, 0, this.mark);
        }

        private void initialize() {
            kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator pieceIterator = new kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.PieceIterator(kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString.this);
            this.pieceIterator = pieceIterator;
            kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString next = pieceIterator.next();
            this.currentPiece = next;
            this.currentPieceSize = next.size();
            this.currentPieceIndex = 0;
            this.currentPieceOffsetInRope = 0;
        }

        private void advanceIfCurrentPieceFullyRead() {
            if (this.currentPiece != null) {
                int i = this.currentPieceIndex;
                int i2 = this.currentPieceSize;
                if (i == i2) {
                    this.currentPieceOffsetInRope += i2;
                    this.currentPieceIndex = 0;
                    if (this.pieceIterator.hasNext()) {
                        kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString next = this.pieceIterator.next();
                        this.currentPiece = next;
                        this.currentPieceSize = next.size();
                    } else {
                        this.currentPiece = null;
                        this.currentPieceSize = 0;
                    }
                }
            }
        }
    }
}
