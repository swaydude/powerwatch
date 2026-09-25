package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class CLSUUID {
    private static java.lang.String _clsId;
    private static final java.util.concurrent.atomic.AtomicLong _sequenceNumber = new java.util.concurrent.atomic.AtomicLong(0);

    public CLSUUID(io.fabric.sdk.android.services.common.IdManager idManager) {
        byte[] bArr = new byte[10];
        populateTime(bArr);
        populateSequenceNumber(bArr);
        populatePID(bArr);
        java.lang.String strSha1 = io.fabric.sdk.android.services.common.CommonUtils.sha1(idManager.getAppInstallIdentifier());
        java.lang.String strHexify = io.fabric.sdk.android.services.common.CommonUtils.hexify(bArr);
        _clsId = java.lang.String.format(java.util.Locale.US, "%s-%s-%s-%s", strHexify.substring(0, 12), strHexify.substring(12, 16), strHexify.subSequence(16, 20), strSha1.substring(0, 12)).toUpperCase(java.util.Locale.US);
    }

    private void populateTime(byte[] bArr) {
        long time = new java.util.Date().getTime();
        byte[] bArrConvertLongToFourByteBuffer = convertLongToFourByteBuffer(time / 1000);
        bArr[0] = bArrConvertLongToFourByteBuffer[0];
        bArr[1] = bArrConvertLongToFourByteBuffer[1];
        bArr[2] = bArrConvertLongToFourByteBuffer[2];
        bArr[3] = bArrConvertLongToFourByteBuffer[3];
        byte[] bArrConvertLongToTwoByteBuffer = convertLongToTwoByteBuffer(time % 1000);
        bArr[4] = bArrConvertLongToTwoByteBuffer[0];
        bArr[5] = bArrConvertLongToTwoByteBuffer[1];
    }

    private void populateSequenceNumber(byte[] bArr) {
        byte[] bArrConvertLongToTwoByteBuffer = convertLongToTwoByteBuffer(_sequenceNumber.incrementAndGet());
        bArr[6] = bArrConvertLongToTwoByteBuffer[0];
        bArr[7] = bArrConvertLongToTwoByteBuffer[1];
    }

    private void populatePID(byte[] bArr) {
        byte[] bArrConvertLongToTwoByteBuffer = convertLongToTwoByteBuffer(java.lang.Integer.valueOf(android.os.Process.myPid()).shortValue());
        bArr[8] = bArrConvertLongToTwoByteBuffer[0];
        bArr[9] = bArrConvertLongToTwoByteBuffer[1];
    }

    private static byte[] convertLongToFourByteBuffer(long j) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) j);
        byteBufferAllocate.order(java.nio.ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    private static byte[] convertLongToTwoByteBuffer(long j) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j);
        byteBufferAllocate.order(java.nio.ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public java.lang.String toString() {
        return _clsId;
    }
}
