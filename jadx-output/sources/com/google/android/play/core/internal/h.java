package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public class h implements com.google.android.play.core.internal.b {
    private final java.nio.ByteBuffer a;

    public h(java.nio.ByteBuffer byteBuffer) {
        this.a = byteBuffer.slice();
    }

    private static int a(int i, int i2) {
        return b(b(i), b(i2));
    }

    private static long a(long j) {
        return ((j + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) - 1) / android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    private static long a(java.nio.ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }

    private static long a(java.nio.ByteBuffer byteBuffer, long j) throws com.google.android.play.core.internal.c {
        a(byteBuffer);
        long jA = a(byteBuffer, byteBuffer.position() + 16);
        if (jA < j) {
            a(byteBuffer);
            if (a(byteBuffer, byteBuffer.position() + 12) + jA == j) {
                return jA;
            }
            throw new com.google.android.play.core.internal.c("ZIP Central Directory is not immediately followed by End of Central Directory");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(122);
        sb.append("ZIP Central Directory offset out of range: ");
        sb.append(jA);
        sb.append(". ZIP End of Central Directory offset: ");
        sb.append(j);
        throw new com.google.android.play.core.internal.c(sb.toString());
    }

    private static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> a(java.io.RandomAccessFile randomAccessFile, int i) throws java.io.IOException {
        int i2;
        if (i < 0 || i > 65535) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(27);
            sb.append("maxCommentSize: ");
            sb.append(i);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(((int) java.lang.Math.min(i, length - 22)) + 22);
        byteBufferAllocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        a(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i2 = -1;
            break;
        }
        int i3 = iCapacity - 22;
        int iMin = java.lang.Math.min(i3, androidx.core.internal.view.SupportMenu.USER_MASK);
        int i4 = 0;
        while (true) {
            if (i4 >= iMin) {
                i2 = -1;
                break;
            }
            i2 = i3 - i4;
            if (byteBufferAllocate.getInt(i2) == 101010256 && (byteBufferAllocate.getShort(i2 + 20) & kotlin.UShort.MAX_VALUE) == i4) {
                break;
            }
            i4++;
        }
        if (i2 == -1) {
            return null;
        }
        byteBufferAllocate.position(i2);
        java.nio.ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return android.util.Pair.create(byteBufferSlice, java.lang.Long.valueOf(jCapacity + ((long) i2)));
    }

    private static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> a(java.io.RandomAccessFile randomAccessFile, long j) throws com.google.android.play.core.internal.c, java.io.IOException {
        if (j < 32) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(87);
            sb.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
            sb.append(j);
            throw new com.google.android.play.core.internal.c(sb.toString());
        }
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(24);
        byteBufferAllocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        randomAccessFile.seek(j - ((long) byteBufferAllocate.capacity()));
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
            throw new com.google.android.play.core.internal.c("No APK Signing Block before ZIP Central Directory");
        }
        long j2 = byteBufferAllocate.getLong(0);
        if (j2 < byteBufferAllocate.capacity() || j2 > 2147483639) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(57);
            sb2.append("APK Signing Block size out of range: ");
            sb2.append(j2);
            throw new com.google.android.play.core.internal.c(sb2.toString());
        }
        int i = (int) (8 + j2);
        long j3 = j - ((long) i);
        if (j3 < 0) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(59);
            sb3.append("APK Signing Block offset out of range: ");
            sb3.append(j3);
            throw new com.google.android.play.core.internal.c(sb3.toString());
        }
        java.nio.ByteBuffer byteBufferAllocate2 = java.nio.ByteBuffer.allocate(i);
        byteBufferAllocate2.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        randomAccessFile.seek(j3);
        randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
        long j4 = byteBufferAllocate2.getLong(0);
        if (j4 == j2) {
            return android.util.Pair.create(byteBufferAllocate2, java.lang.Long.valueOf(j3));
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder(103);
        sb4.append("APK Signing Block sizes in header and footer do not match: ");
        sb4.append(j4);
        sb4.append(" vs ");
        sb4.append(j2);
        throw new com.google.android.play.core.internal.c(sb4.toString());
    }

    private static java.nio.ByteBuffer a(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        if (i2 < 8) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(38);
            sb.append("end < start: ");
            sb.append(i2);
            sb.append(" < 8");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int iCapacity = byteBuffer.capacity();
        if (i2 > byteBuffer.capacity()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(41);
            sb2.append("end > capacity: ");
            sb2.append(i2);
            sb2.append(" > ");
            sb2.append(iCapacity);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i2);
            byteBuffer.position(8);
            java.nio.ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            return byteBufferSlice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(iLimit);
            byteBuffer.position(iPosition);
        }
    }

    private static void a(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) i;
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 16);
        bArr[4] = (byte) (i >>> 24);
    }

    private static void a(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.order() != java.nio.ByteOrder.LITTLE_ENDIAN) {
            throw new java.lang.IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static void a(java.util.Map<java.lang.Integer, byte[]> map, java.nio.channels.FileChannel fileChannel, long j, long j2, long j3, java.nio.ByteBuffer byteBuffer) throws java.lang.SecurityException {
        if (map.isEmpty()) {
            throw new java.lang.SecurityException("No digests provided");
        }
        com.google.android.play.core.internal.a aVar = new com.google.android.play.core.internal.a(fileChannel, 0L, j);
        com.google.android.play.core.internal.a aVar2 = new com.google.android.play.core.internal.a(fileChannel, j2, j3 - j2);
        java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        a(byteBufferDuplicate);
        int iPosition = byteBufferDuplicate.position() + 16;
        if (j < 0 || j > 4294967295L) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(47);
            sb.append("uint32 value of out range: ");
            sb.append(j);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j);
        com.google.android.play.core.internal.h hVar = new com.google.android.play.core.internal.h(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        java.util.Iterator<java.lang.Integer> it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        try {
            byte[][] bArrA = a(iArr, new com.google.android.play.core.internal.b[]{aVar, aVar2, hVar});
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (!java.security.MessageDigest.isEqual(map.get(java.lang.Integer.valueOf(i3)), bArrA[i2])) {
                    throw new java.lang.SecurityException(java.lang.String.valueOf(c(i3)).concat(" digest of contents did not verify"));
                }
            }
        } catch (java.security.DigestException e) {
            throw new java.lang.SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    private static boolean a(int i) {
        if (i == 513 || i == 514 || i == 769) {
            return true;
        }
        switch (i) {
            case androidx.core.view.InputDeviceCompat.SOURCE_KEYBOARD /* 257 */:
            case 258:
            case 259:
            case 260:
                return true;
            default:
                return false;
        }
    }

    private static java.security.cert.X509Certificate[] a(java.nio.ByteBuffer byteBuffer, java.util.Map<java.lang.Integer, byte[]> map, java.security.cert.CertificateFactory certificateFactory) throws java.io.IOException, java.lang.SecurityException {
        java.nio.ByteBuffer byteBufferB = b(byteBuffer);
        java.nio.ByteBuffer byteBufferB2 = b(byteBuffer);
        byte[] bArrC = c(byteBuffer);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        byte[] bArrC2 = null;
        byte[] bArrC3 = null;
        int i = -1;
        int i2 = 0;
        while (byteBufferB2.hasRemaining()) {
            i2++;
            try {
                java.nio.ByteBuffer byteBufferB3 = b(byteBufferB2);
                if (byteBufferB3.remaining() < 8) {
                    throw new java.lang.SecurityException("Signature record too short");
                }
                int i3 = byteBufferB3.getInt();
                arrayList.add(java.lang.Integer.valueOf(i3));
                if (a(i3) && (i == -1 || a(i3, i) > 0)) {
                    bArrC3 = c(byteBufferB3);
                    i = i3;
                }
            } catch (java.io.IOException | java.nio.BufferUnderflowException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(45);
                sb.append("Failed to parse signature record #");
                sb.append(i2);
                throw new java.lang.SecurityException(sb.toString(), e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new java.lang.SecurityException("No signatures found");
            }
            throw new java.lang.SecurityException("No supported signatures found");
        }
        java.lang.String strE = e(i);
        android.util.Pair<java.lang.String, ? extends java.security.spec.AlgorithmParameterSpec> pairF = f(i);
        java.lang.String str = (java.lang.String) pairF.first;
        java.security.spec.AlgorithmParameterSpec algorithmParameterSpec = (java.security.spec.AlgorithmParameterSpec) pairF.second;
        try {
            java.security.PublicKey publicKeyGeneratePublic = java.security.KeyFactory.getInstance(strE).generatePublic(new java.security.spec.X509EncodedKeySpec(bArrC));
            java.security.Signature signature = java.security.Signature.getInstance(str);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferB);
            if (!signature.verify(bArrC3)) {
                throw new java.lang.SecurityException(java.lang.String.valueOf(str).concat(" signature did not verify"));
            }
            byteBufferB.clear();
            java.nio.ByteBuffer byteBufferB4 = b(byteBufferB);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i4 = 0;
            while (byteBufferB4.hasRemaining()) {
                i4++;
                try {
                    java.nio.ByteBuffer byteBufferB5 = b(byteBufferB4);
                    if (byteBufferB5.remaining() < 8) {
                        throw new java.io.IOException("Record too short");
                    }
                    int i5 = byteBufferB5.getInt();
                    arrayList2.add(java.lang.Integer.valueOf(i5));
                    if (i5 == i) {
                        bArrC2 = c(byteBufferB5);
                    }
                } catch (java.io.IOException | java.nio.BufferUnderflowException e2) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(42);
                    sb2.append("Failed to parse digest record #");
                    sb2.append(i4);
                    throw new java.io.IOException(sb2.toString(), e2);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new java.lang.SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iB = b(i);
            byte[] bArrPut = map.put(java.lang.Integer.valueOf(iB), bArrC2);
            if (bArrPut != null && !java.security.MessageDigest.isEqual(bArrPut, bArrC2)) {
                throw new java.lang.SecurityException(java.lang.String.valueOf(c(iB)).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            java.nio.ByteBuffer byteBufferB6 = b(byteBufferB);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            int i6 = 0;
            while (byteBufferB6.hasRemaining()) {
                i6++;
                byte[] bArrC4 = c(byteBufferB6);
                try {
                    arrayList3.add(new com.google.android.play.core.internal.f((java.security.cert.X509Certificate) certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(bArrC4)), bArrC4));
                } catch (java.security.cert.CertificateException e3) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(41);
                    sb3.append("Failed to decode certificate #");
                    sb3.append(i6);
                    throw new java.lang.SecurityException(sb3.toString(), e3);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new java.lang.SecurityException("No certificates listed");
            }
            if (java.util.Arrays.equals(bArrC, ((java.security.cert.X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (java.security.cert.X509Certificate[]) arrayList3.toArray(new java.security.cert.X509Certificate[arrayList3.size()]);
            }
            throw new java.lang.SecurityException("Public key mismatch between certificate and signature record");
        } catch (java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | java.security.SignatureException | java.security.spec.InvalidKeySpecException e4) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 27);
            sb4.append("Failed to verify ");
            sb4.append(str);
            sb4.append(" signature");
            throw new java.lang.SecurityException(sb4.toString(), e4);
        }
    }

    private static byte[][] a(int[] iArr, com.google.android.play.core.internal.b[] bVarArr) throws java.security.DigestException {
        com.google.android.play.core.internal.b[] bVarArr2 = bVarArr;
        long j = 0;
        long jA = 0;
        for (com.google.android.play.core.internal.b bVar : bVarArr2) {
            jA += a(bVar.a());
        }
        if (jA >= 2097151) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(37);
            sb.append("Too many chunks: ");
            sb.append(jA);
            throw new java.security.DigestException(sb.toString());
        }
        int i = (int) jA;
        byte[][] bArr = new byte[iArr.length][];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            byte[] bArr2 = new byte[(d(iArr[i2]) * i) + 5];
            bArr2[0] = 90;
            a(i, bArr2, 1);
            bArr[i2] = bArr2;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        int length = iArr.length;
        java.security.MessageDigest[] messageDigestArr = new java.security.MessageDigest[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            java.lang.String strC = c(iArr[i3]);
            try {
                messageDigestArr[i3] = java.security.MessageDigest.getInstance(strC);
            } catch (java.security.NoSuchAlgorithmException e) {
                throw new java.lang.RuntimeException(java.lang.String.valueOf(strC).concat(" digest not supported"), e);
            }
        }
        int length2 = bVarArr2.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length2) {
            com.google.android.play.core.internal.b bVar2 = bVarArr2[i4];
            int i7 = length2;
            int i8 = i4;
            long jA2 = bVar2.a();
            long j2 = j;
            while (jA2 > j) {
                int iMin = (int) java.lang.Math.min(jA2, android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
                a(iMin, bArr3, 1);
                for (int i9 = 0; i9 < length; i9++) {
                    messageDigestArr[i9].update(bArr3);
                }
                try {
                    bVar2.a(messageDigestArr, j2, iMin);
                    int i10 = 0;
                    while (i10 < iArr.length) {
                        int i11 = iArr[i10];
                        byte[] bArr4 = bArr3;
                        byte[] bArr5 = bArr[i10];
                        int iD = d(i11);
                        com.google.android.play.core.internal.b bVar3 = bVar2;
                        java.security.MessageDigest messageDigest = messageDigestArr[i10];
                        int i12 = length;
                        int iDigest = messageDigest.digest(bArr5, (i5 * iD) + 5, iD);
                        if (iDigest != iD) {
                            java.lang.String algorithm = messageDigest.getAlgorithm();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(algorithm).length() + 46);
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(iDigest);
                            throw new java.lang.RuntimeException(sb2.toString());
                        }
                        i10++;
                        bArr3 = bArr4;
                        bVar2 = bVar3;
                        length = i12;
                    }
                    long j3 = iMin;
                    j2 += j3;
                    jA2 -= j3;
                    i5++;
                    bArr3 = bArr3;
                    j = 0;
                } catch (java.io.IOException e2) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(59);
                    sb3.append("Failed to digest chunk #");
                    sb3.append(i5);
                    sb3.append(" of section #");
                    sb3.append(i6);
                    throw new java.security.DigestException(sb3.toString(), e2);
                }
            }
            i6++;
            i4 = i8 + 1;
            bVarArr2 = bVarArr;
            length2 = i7;
            j = 0;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            byte[] bArr7 = bArr[i13];
            java.lang.String strC2 = c(i14);
            try {
                bArr6[i13] = java.security.MessageDigest.getInstance(strC2).digest(bArr7);
            } catch (java.security.NoSuchAlgorithmException e3) {
                throw new java.lang.RuntimeException(java.lang.String.valueOf(strC2).concat(" digest not supported"), e3);
            }
        }
        return bArr6;
    }

    private static java.security.cert.X509Certificate[][] a(java.io.RandomAccessFile randomAccessFile) throws com.google.android.play.core.internal.c, java.io.IOException, java.lang.SecurityException {
        return a(randomAccessFile.getChannel(), b(randomAccessFile));
    }

    public static java.security.cert.X509Certificate[][] a(java.lang.String str) throws com.google.android.play.core.internal.c, java.lang.SecurityException, java.io.IOException {
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(str, "r");
        try {
            java.security.cert.X509Certificate[][] x509CertificateArrA = a(randomAccessFile);
            randomAccessFile.close();
            return x509CertificateArrA;
        } finally {
            try {
                randomAccessFile.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    private static java.security.cert.X509Certificate[][] a(java.nio.channels.FileChannel fileChannel, com.google.android.play.core.internal.d dVar) throws java.lang.SecurityException {
        java.util.HashMap map = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance("X.509");
            try {
                java.nio.ByteBuffer byteBufferB = b(dVar.a);
                int i = 0;
                while (byteBufferB.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(a(b(byteBufferB), map, certificateFactory));
                    } catch (java.io.IOException | java.lang.SecurityException | java.nio.BufferUnderflowException e) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new java.lang.SecurityException(sb.toString(), e);
                    }
                }
                if (i <= 0) {
                    throw new java.lang.SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new java.lang.SecurityException("No content digests found");
                }
                a(map, fileChannel, dVar.b, dVar.c, dVar.d, dVar.e);
                return (java.security.cert.X509Certificate[][]) arrayList.toArray(new java.security.cert.X509Certificate[arrayList.size()][]);
            } catch (java.io.IOException e2) {
                throw new java.lang.SecurityException("Failed to read list of signers", e2);
            }
        } catch (java.security.cert.CertificateException e3) {
            throw new java.lang.RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    private static int b(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case androidx.core.view.InputDeviceCompat.SOURCE_KEYBOARD /* 257 */:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                java.lang.String strValueOf = java.lang.String.valueOf(java.lang.Long.toHexString(i));
                throw new java.lang.IllegalArgumentException(strValueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(strValueOf) : new java.lang.String("Unknown signature algorithm: 0x"));
        }
    }

    private static int b(int i, int i2) {
        if (i == 1) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2) {
                return -1;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(37);
            sb.append("Unknown digestAlgorithm2: ");
            sb.append(i2);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i != 2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(37);
            sb2.append("Unknown digestAlgorithm1: ");
            sb2.append(i);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 0;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(37);
        sb3.append("Unknown digestAlgorithm2: ");
        sb3.append(i2);
        throw new java.lang.IllegalArgumentException(sb3.toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    private static com.google.android.play.core.internal.d b(java.io.RandomAccessFile randomAccessFile) throws com.google.android.play.core.internal.c, java.io.IOException {
        boolean z;
        android.util.Pair<java.nio.ByteBuffer, java.lang.Long> pairC = c(randomAccessFile);
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) pairC.first;
        long jLongValue = ((java.lang.Long) pairC.second).longValue();
        long j = jLongValue - 20;
        if (j >= 0) {
            randomAccessFile.seek(j);
            if (randomAccessFile.readInt() == 1347094023) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            throw new com.google.android.play.core.internal.c("ZIP64 APK not supported");
        }
        long jA = a(byteBuffer, jLongValue);
        android.util.Pair<java.nio.ByteBuffer, java.lang.Long> pairA = a(randomAccessFile, jA);
        java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) pairA.first;
        return new com.google.android.play.core.internal.d(d(byteBuffer2), ((java.lang.Long) pairA.second).longValue(), jA, jLongValue, byteBuffer, (byte) 0);
    }

    private static java.nio.ByteBuffer b(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        if (byteBuffer.remaining() < 4) {
            int iRemaining = byteBuffer.remaining();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(93);
            sb.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb.append(iRemaining);
            throw new java.io.IOException(sb.toString());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return b(byteBuffer, i);
        }
        int iRemaining2 = byteBuffer.remaining();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(101);
        sb2.append("Length-prefixed field longer than remaining buffer. Field length: ");
        sb2.append(i);
        sb2.append(", remaining: ");
        sb2.append(iRemaining2);
        throw new java.io.IOException(sb2.toString());
    }

    private static java.nio.ByteBuffer b(java.nio.ByteBuffer byteBuffer, int i) throws java.nio.BufferUnderflowException {
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(17);
            sb.append("size: ");
            sb.append(i);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new java.nio.BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            java.nio.ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static android.util.Pair<java.nio.ByteBuffer, java.lang.Long> c(java.io.RandomAccessFile randomAccessFile) throws com.google.android.play.core.internal.c, java.io.IOException {
        android.util.Pair<java.nio.ByteBuffer, java.lang.Long> pairA;
        if (randomAccessFile.length() < 22) {
            pairA = null;
        } else {
            pairA = a(randomAccessFile, 0);
            if (pairA == null) {
                pairA = a(randomAccessFile, androidx.core.internal.view.SupportMenu.USER_MASK);
            }
        }
        if (pairA != null) {
            return pairA;
        }
        long length = randomAccessFile.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(102);
        sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
        sb.append(length);
        sb.append(" bytes");
        throw new com.google.android.play.core.internal.c(sb.toString());
    }

    private static java.lang.String c(int i) {
        if (i == 1) {
            return io.fabric.sdk.android.services.common.CommonUtils.SHA256_INSTANCE;
        }
        if (i == 2) {
            return "SHA-512";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private static byte[] c(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new java.io.IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        int iRemaining = byteBuffer.remaining();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(90);
        sb.append("Underflow while reading length-prefixed value. Length: ");
        sb.append(i);
        sb.append(", available: ");
        sb.append(iRemaining);
        throw new java.io.IOException(sb.toString());
    }

    private static int d(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private static java.nio.ByteBuffer d(java.nio.ByteBuffer byteBuffer) throws com.google.android.play.core.internal.c {
        e(byteBuffer);
        java.nio.ByteBuffer byteBufferA = a(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i = 0;
        while (byteBufferA.hasRemaining()) {
            i++;
            if (byteBufferA.remaining() < 8) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(70);
                sb.append("Insufficient data to read size of APK Signing Block entry #");
                sb.append(i);
                throw new com.google.android.play.core.internal.c(sb.toString());
            }
            long j = byteBufferA.getLong();
            if (j < 4 || j > 2147483647L) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(76);
                sb2.append("APK Signing Block entry #");
                sb2.append(i);
                sb2.append(" size out of range: ");
                sb2.append(j);
                throw new com.google.android.play.core.internal.c(sb2.toString());
            }
            int i2 = (int) j;
            int iPosition = byteBufferA.position() + i2;
            if (i2 > byteBufferA.remaining()) {
                int iRemaining = byteBufferA.remaining();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(91);
                sb3.append("APK Signing Block entry #");
                sb3.append(i);
                sb3.append(" size out of range: ");
                sb3.append(i2);
                sb3.append(", available: ");
                sb3.append(iRemaining);
                throw new com.google.android.play.core.internal.c(sb3.toString());
            }
            if (byteBufferA.getInt() == 1896449818) {
                return b(byteBufferA, i2 - 4);
            }
            byteBufferA.position(iPosition);
        }
        throw new com.google.android.play.core.internal.c("No APK Signature Scheme v2 block in APK Signing Block");
    }

    private static java.lang.String e(int i) {
        if (i == 513 || i == 514) {
            return "EC";
        }
        if (i == 769) {
            return "DSA";
        }
        switch (i) {
            case androidx.core.view.InputDeviceCompat.SOURCE_KEYBOARD /* 257 */:
            case 258:
            case 259:
            case 260:
                return "RSA";
            default:
                java.lang.String strValueOf = java.lang.String.valueOf(java.lang.Long.toHexString(i));
                throw new java.lang.IllegalArgumentException(strValueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(strValueOf) : new java.lang.String("Unknown signature algorithm: 0x"));
        }
    }

    private static void e(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.order() != java.nio.ByteOrder.LITTLE_ENDIAN) {
            throw new java.lang.IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static android.util.Pair<java.lang.String, ? extends java.security.spec.AlgorithmParameterSpec> f(int i) {
        if (i == 513) {
            return android.util.Pair.create("SHA256withECDSA", null);
        }
        if (i == 514) {
            return android.util.Pair.create("SHA512withECDSA", null);
        }
        if (i == 769) {
            return android.util.Pair.create("SHA256withDSA", null);
        }
        switch (i) {
            case androidx.core.view.InputDeviceCompat.SOURCE_KEYBOARD /* 257 */:
                return android.util.Pair.create("SHA256withRSA/PSS", new java.security.spec.PSSParameterSpec(io.fabric.sdk.android.services.common.CommonUtils.SHA256_INSTANCE, "MGF1", java.security.spec.MGF1ParameterSpec.SHA256, 32, 1));
            case 258:
                return android.util.Pair.create("SHA512withRSA/PSS", new java.security.spec.PSSParameterSpec("SHA-512", "MGF1", java.security.spec.MGF1ParameterSpec.SHA512, 64, 1));
            case 259:
                return android.util.Pair.create("SHA256withRSA", null);
            case 260:
                return android.util.Pair.create("SHA512withRSA", null);
            default:
                java.lang.String strValueOf = java.lang.String.valueOf(java.lang.Long.toHexString(i));
                throw new java.lang.IllegalArgumentException(strValueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(strValueOf) : new java.lang.String("Unknown signature algorithm: 0x"));
        }
    }

    @Override // com.google.android.play.core.internal.b
    public long a() {
        return this.a.capacity();
    }

    @Override // com.google.android.play.core.internal.b
    public void a(java.security.MessageDigest[] messageDigestArr, long j, int i) throws java.io.IOException {
        java.nio.ByteBuffer byteBufferSlice;
        synchronized (this.a) {
            int i2 = (int) j;
            this.a.position(i2);
            this.a.limit(i2 + i);
            byteBufferSlice = this.a.slice();
        }
        for (java.security.MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }
}
