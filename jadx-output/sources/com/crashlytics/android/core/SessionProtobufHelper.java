package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class SessionProtobufHelper {
    private static final java.lang.String SIGNAL_DEFAULT = "0";
    private static final com.crashlytics.android.core.ByteString SIGNAL_DEFAULT_BYTE_STRING = com.crashlytics.android.core.ByteString.copyFromUtf8(SIGNAL_DEFAULT);
    private static final com.crashlytics.android.core.ByteString UNITY_PLATFORM_BYTE_STRING = com.crashlytics.android.core.ByteString.copyFromUtf8("Unity");

    private SessionProtobufHelper() {
    }

    public static void writeBeginSession(com.crashlytics.android.core.CodedOutputStream codedOutputStream, java.lang.String str, java.lang.String str2, long j) throws java.lang.Exception {
        codedOutputStream.writeBytes(1, com.crashlytics.android.core.ByteString.copyFromUtf8(str2));
        codedOutputStream.writeBytes(2, com.crashlytics.android.core.ByteString.copyFromUtf8(str));
        codedOutputStream.writeUInt64(3, j);
    }

    public static void writeSessionApp(com.crashlytics.android.core.CodedOutputStream codedOutputStream, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.String str6) throws java.lang.Exception {
        com.crashlytics.android.core.ByteString byteStringCopyFromUtf8 = com.crashlytics.android.core.ByteString.copyFromUtf8(str);
        com.crashlytics.android.core.ByteString byteStringCopyFromUtf9 = com.crashlytics.android.core.ByteString.copyFromUtf8(str2);
        com.crashlytics.android.core.ByteString byteStringCopyFromUtf10 = com.crashlytics.android.core.ByteString.copyFromUtf8(str3);
        com.crashlytics.android.core.ByteString byteStringCopyFromUtf11 = com.crashlytics.android.core.ByteString.copyFromUtf8(str4);
        com.crashlytics.android.core.ByteString byteStringCopyFromUtf12 = com.crashlytics.android.core.ByteString.copyFromUtf8(str5);
        com.crashlytics.android.core.ByteString byteStringCopyFromUtf13 = str6 != null ? com.crashlytics.android.core.ByteString.copyFromUtf8(str6) : null;
        codedOutputStream.writeTag(7, 2);
        codedOutputStream.writeRawVarint32(getSessionAppSize(byteStringCopyFromUtf8, byteStringCopyFromUtf9, byteStringCopyFromUtf10, byteStringCopyFromUtf11, byteStringCopyFromUtf12, i, byteStringCopyFromUtf13));
        codedOutputStream.writeBytes(1, byteStringCopyFromUtf8);
        codedOutputStream.writeBytes(2, byteStringCopyFromUtf10);
        codedOutputStream.writeBytes(3, byteStringCopyFromUtf11);
        codedOutputStream.writeTag(5, 2);
        codedOutputStream.writeRawVarint32(getSessionAppOrgSize(byteStringCopyFromUtf9));
        codedOutputStream.writeBytes(1, byteStringCopyFromUtf9);
        codedOutputStream.writeBytes(6, byteStringCopyFromUtf12);
        if (byteStringCopyFromUtf13 != null) {
            codedOutputStream.writeBytes(8, UNITY_PLATFORM_BYTE_STRING);
            codedOutputStream.writeBytes(9, byteStringCopyFromUtf13);
        }
        codedOutputStream.writeEnum(10, i);
    }

    public static void writeSessionOS(com.crashlytics.android.core.CodedOutputStream codedOutputStream, java.lang.String str, java.lang.String str2, boolean z) throws java.lang.Exception {
        com.crashlytics.android.core.ByteString byteStringCopyFromUtf8 = com.crashlytics.android.core.ByteString.copyFromUtf8(str);
        com.crashlytics.android.core.ByteString byteStringCopyFromUtf9 = com.crashlytics.android.core.ByteString.copyFromUtf8(str2);
        codedOutputStream.writeTag(8, 2);
        codedOutputStream.writeRawVarint32(getSessionOSSize(byteStringCopyFromUtf8, byteStringCopyFromUtf9, z));
        codedOutputStream.writeEnum(1, 3);
        codedOutputStream.writeBytes(2, byteStringCopyFromUtf8);
        codedOutputStream.writeBytes(3, byteStringCopyFromUtf9);
        codedOutputStream.writeBool(4, z);
    }

    public static void writeSessionDevice(com.crashlytics.android.core.CodedOutputStream codedOutputStream, int i, java.lang.String str, int i2, long j, long j2, boolean z, java.util.Map<io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType, java.lang.String> map, int i3, java.lang.String str2, java.lang.String str3) throws java.lang.Exception {
        com.crashlytics.android.core.ByteString byteStringStringToByteString = stringToByteString(str);
        com.crashlytics.android.core.ByteString byteStringStringToByteString2 = stringToByteString(str3);
        com.crashlytics.android.core.ByteString byteStringStringToByteString3 = stringToByteString(str2);
        codedOutputStream.writeTag(9, 2);
        codedOutputStream.writeRawVarint32(getSessionDeviceSize(i, byteStringStringToByteString, i2, j, j2, z, map, i3, byteStringStringToByteString3, byteStringStringToByteString2));
        codedOutputStream.writeEnum(3, i);
        codedOutputStream.writeBytes(4, byteStringStringToByteString);
        codedOutputStream.writeUInt32(5, i2);
        codedOutputStream.writeUInt64(6, j);
        codedOutputStream.writeUInt64(7, j2);
        codedOutputStream.writeBool(10, z);
        for (java.util.Map.Entry<io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType, java.lang.String> entry : map.entrySet()) {
            codedOutputStream.writeTag(11, 2);
            codedOutputStream.writeRawVarint32(getDeviceIdentifierSize(entry.getKey(), entry.getValue()));
            codedOutputStream.writeEnum(1, entry.getKey().protobufIndex);
            codedOutputStream.writeBytes(2, com.crashlytics.android.core.ByteString.copyFromUtf8(entry.getValue()));
        }
        codedOutputStream.writeUInt32(12, i3);
        if (byteStringStringToByteString3 != null) {
            codedOutputStream.writeBytes(13, byteStringStringToByteString3);
        }
        if (byteStringStringToByteString2 != null) {
            codedOutputStream.writeBytes(14, byteStringStringToByteString2);
        }
    }

    public static void writeSessionUser(com.crashlytics.android.core.CodedOutputStream codedOutputStream, java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.Exception {
        if (str == null) {
            str = "";
        }
        com.crashlytics.android.core.ByteString byteStringCopyFromUtf8 = com.crashlytics.android.core.ByteString.copyFromUtf8(str);
        com.crashlytics.android.core.ByteString byteStringStringToByteString = stringToByteString(str2);
        com.crashlytics.android.core.ByteString byteStringStringToByteString2 = stringToByteString(str3);
        int iComputeBytesSize = com.crashlytics.android.core.CodedOutputStream.computeBytesSize(1, byteStringCopyFromUtf8) + 0;
        if (str2 != null) {
            iComputeBytesSize += com.crashlytics.android.core.CodedOutputStream.computeBytesSize(2, byteStringStringToByteString);
        }
        if (str3 != null) {
            iComputeBytesSize += com.crashlytics.android.core.CodedOutputStream.computeBytesSize(3, byteStringStringToByteString2);
        }
        codedOutputStream.writeTag(6, 2);
        codedOutputStream.writeRawVarint32(iComputeBytesSize);
        codedOutputStream.writeBytes(1, byteStringCopyFromUtf8);
        if (str2 != null) {
            codedOutputStream.writeBytes(2, byteStringStringToByteString);
        }
        if (str3 != null) {
            codedOutputStream.writeBytes(3, byteStringStringToByteString2);
        }
    }

    public static void writeSessionEvent(com.crashlytics.android.core.CodedOutputStream codedOutputStream, long j, java.lang.String str, com.crashlytics.android.core.TrimmedThrowableData trimmedThrowableData, java.lang.Thread thread, java.lang.StackTraceElement[] stackTraceElementArr, java.lang.Thread[] threadArr, java.util.List<java.lang.StackTraceElement[]> list, java.util.Map<java.lang.String, java.lang.String> map, com.crashlytics.android.core.LogFileManager logFileManager, android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i, java.lang.String str2, java.lang.String str3, java.lang.Float f, int i2, boolean z, long j2, long j3) throws java.lang.Exception {
        com.crashlytics.android.core.ByteString byteStringCopyFromUtf8 = com.crashlytics.android.core.ByteString.copyFromUtf8(str2);
        com.crashlytics.android.core.ByteString byteStringCopyFromUtf9 = str3 == null ? null : com.crashlytics.android.core.ByteString.copyFromUtf8(str3.replace("-", ""));
        com.crashlytics.android.core.ByteString byteStringForLog = logFileManager.getByteStringForLog();
        if (byteStringForLog == null) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "No log data to include with this event.");
        }
        logFileManager.clearLog();
        codedOutputStream.writeTag(10, 2);
        codedOutputStream.writeRawVarint32(getSessionEventSize(j, str, trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, 8, map, runningAppProcessInfo, i, byteStringCopyFromUtf8, byteStringCopyFromUtf9, f, i2, z, j2, j3, byteStringForLog));
        codedOutputStream.writeUInt64(1, j);
        codedOutputStream.writeBytes(2, com.crashlytics.android.core.ByteString.copyFromUtf8(str));
        writeSessionEventApp(codedOutputStream, trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, 8, byteStringCopyFromUtf8, byteStringCopyFromUtf9, map, runningAppProcessInfo, i);
        writeSessionEventDevice(codedOutputStream, f, i2, z, i, j2, j3);
        writeSessionEventLog(codedOutputStream, byteStringForLog);
    }

    private static void writeSessionEventApp(com.crashlytics.android.core.CodedOutputStream codedOutputStream, com.crashlytics.android.core.TrimmedThrowableData trimmedThrowableData, java.lang.Thread thread, java.lang.StackTraceElement[] stackTraceElementArr, java.lang.Thread[] threadArr, java.util.List<java.lang.StackTraceElement[]> list, int i, com.crashlytics.android.core.ByteString byteString, com.crashlytics.android.core.ByteString byteString2, java.util.Map<java.lang.String, java.lang.String> map, android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2) throws java.lang.Exception {
        codedOutputStream.writeTag(3, 2);
        codedOutputStream.writeRawVarint32(getEventAppSize(trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, i, byteString, byteString2, map, runningAppProcessInfo, i2));
        writeSessionEventAppExecution(codedOutputStream, trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, i, byteString, byteString2);
        if (map != null && !map.isEmpty()) {
            writeSessionEventAppCustomAttributes(codedOutputStream, map);
        }
        if (runningAppProcessInfo != null) {
            codedOutputStream.writeBool(3, runningAppProcessInfo.importance != 100);
        }
        codedOutputStream.writeUInt32(4, i2);
    }

    private static void writeSessionEventAppExecution(com.crashlytics.android.core.CodedOutputStream codedOutputStream, com.crashlytics.android.core.TrimmedThrowableData trimmedThrowableData, java.lang.Thread thread, java.lang.StackTraceElement[] stackTraceElementArr, java.lang.Thread[] threadArr, java.util.List<java.lang.StackTraceElement[]> list, int i, com.crashlytics.android.core.ByteString byteString, com.crashlytics.android.core.ByteString byteString2) throws java.lang.Exception {
        codedOutputStream.writeTag(1, 2);
        codedOutputStream.writeRawVarint32(getEventAppExecutionSize(trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, i, byteString, byteString2));
        writeThread(codedOutputStream, thread, stackTraceElementArr, 4, true);
        int length = threadArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            writeThread(codedOutputStream, threadArr[i2], list.get(i2), 0, false);
        }
        writeSessionEventAppExecutionException(codedOutputStream, trimmedThrowableData, 1, i, 2);
        codedOutputStream.writeTag(3, 2);
        codedOutputStream.writeRawVarint32(getEventAppExecutionSignalSize());
        com.crashlytics.android.core.ByteString byteString3 = SIGNAL_DEFAULT_BYTE_STRING;
        codedOutputStream.writeBytes(1, byteString3);
        codedOutputStream.writeBytes(2, byteString3);
        codedOutputStream.writeUInt64(3, 0L);
        codedOutputStream.writeTag(4, 2);
        codedOutputStream.writeRawVarint32(getBinaryImageSize(byteString, byteString2));
        codedOutputStream.writeUInt64(1, 0L);
        codedOutputStream.writeUInt64(2, 0L);
        codedOutputStream.writeBytes(3, byteString);
        if (byteString2 != null) {
            codedOutputStream.writeBytes(4, byteString2);
        }
    }

    private static void writeSessionEventAppCustomAttributes(com.crashlytics.android.core.CodedOutputStream codedOutputStream, java.util.Map<java.lang.String, java.lang.String> map) throws java.lang.Exception {
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            codedOutputStream.writeTag(2, 2);
            codedOutputStream.writeRawVarint32(getEventAppCustomAttributeSize(entry.getKey(), entry.getValue()));
            codedOutputStream.writeBytes(1, com.crashlytics.android.core.ByteString.copyFromUtf8(entry.getKey()));
            java.lang.String value = entry.getValue();
            if (value == null) {
                value = "";
            }
            codedOutputStream.writeBytes(2, com.crashlytics.android.core.ByteString.copyFromUtf8(value));
        }
    }

    private static void writeSessionEventAppExecutionException(com.crashlytics.android.core.CodedOutputStream codedOutputStream, com.crashlytics.android.core.TrimmedThrowableData trimmedThrowableData, int i, int i2, int i3) throws java.lang.Exception {
        codedOutputStream.writeTag(i3, 2);
        codedOutputStream.writeRawVarint32(getEventAppExecutionExceptionSize(trimmedThrowableData, 1, i2));
        codedOutputStream.writeBytes(1, com.crashlytics.android.core.ByteString.copyFromUtf8(trimmedThrowableData.className));
        java.lang.String str = trimmedThrowableData.localizedMessage;
        if (str != null) {
            codedOutputStream.writeBytes(3, com.crashlytics.android.core.ByteString.copyFromUtf8(str));
        }
        int i4 = 0;
        for (java.lang.StackTraceElement stackTraceElement : trimmedThrowableData.stacktrace) {
            writeFrame(codedOutputStream, 4, stackTraceElement, true);
        }
        com.crashlytics.android.core.TrimmedThrowableData trimmedThrowableData2 = trimmedThrowableData.cause;
        if (trimmedThrowableData2 != null) {
            if (i < i2) {
                writeSessionEventAppExecutionException(codedOutputStream, trimmedThrowableData2, i + 1, i2, 6);
                return;
            }
            while (trimmedThrowableData2 != null) {
                trimmedThrowableData2 = trimmedThrowableData2.cause;
                i4++;
            }
            codedOutputStream.writeUInt32(7, i4);
        }
    }

    private static void writeThread(com.crashlytics.android.core.CodedOutputStream codedOutputStream, java.lang.Thread thread, java.lang.StackTraceElement[] stackTraceElementArr, int i, boolean z) throws java.lang.Exception {
        codedOutputStream.writeTag(1, 2);
        codedOutputStream.writeRawVarint32(getThreadSize(thread, stackTraceElementArr, i, z));
        codedOutputStream.writeBytes(1, com.crashlytics.android.core.ByteString.copyFromUtf8(thread.getName()));
        codedOutputStream.writeUInt32(2, i);
        for (java.lang.StackTraceElement stackTraceElement : stackTraceElementArr) {
            writeFrame(codedOutputStream, 3, stackTraceElement, z);
        }
    }

    private static void writeFrame(com.crashlytics.android.core.CodedOutputStream codedOutputStream, int i, java.lang.StackTraceElement stackTraceElement, boolean z) throws java.lang.Exception {
        codedOutputStream.writeTag(i, 2);
        codedOutputStream.writeRawVarint32(getFrameSize(stackTraceElement, z));
        if (stackTraceElement.isNativeMethod()) {
            codedOutputStream.writeUInt64(1, java.lang.Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            codedOutputStream.writeUInt64(1, 0L);
        }
        codedOutputStream.writeBytes(2, com.crashlytics.android.core.ByteString.copyFromUtf8(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            codedOutputStream.writeBytes(3, com.crashlytics.android.core.ByteString.copyFromUtf8(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            codedOutputStream.writeUInt64(4, stackTraceElement.getLineNumber());
        }
        codedOutputStream.writeUInt32(5, z ? 4 : 0);
    }

    private static void writeSessionEventDevice(com.crashlytics.android.core.CodedOutputStream codedOutputStream, java.lang.Float f, int i, boolean z, int i2, long j, long j2) throws java.lang.Exception {
        codedOutputStream.writeTag(5, 2);
        codedOutputStream.writeRawVarint32(getEventDeviceSize(f, i, z, i2, j, j2));
        if (f != null) {
            codedOutputStream.writeFloat(1, f.floatValue());
        }
        codedOutputStream.writeSInt32(2, i);
        codedOutputStream.writeBool(3, z);
        codedOutputStream.writeUInt32(4, i2);
        codedOutputStream.writeUInt64(5, j);
        codedOutputStream.writeUInt64(6, j2);
    }

    private static void writeSessionEventLog(com.crashlytics.android.core.CodedOutputStream codedOutputStream, com.crashlytics.android.core.ByteString byteString) throws java.lang.Exception {
        if (byteString != null) {
            codedOutputStream.writeTag(6, 2);
            codedOutputStream.writeRawVarint32(getEventLogSize(byteString));
            codedOutputStream.writeBytes(1, byteString);
        }
    }

    private static int getSessionAppSize(com.crashlytics.android.core.ByteString byteString, com.crashlytics.android.core.ByteString byteString2, com.crashlytics.android.core.ByteString byteString3, com.crashlytics.android.core.ByteString byteString4, com.crashlytics.android.core.ByteString byteString5, int i, com.crashlytics.android.core.ByteString byteString6) {
        int iComputeBytesSize = com.crashlytics.android.core.CodedOutputStream.computeBytesSize(1, byteString) + 0 + com.crashlytics.android.core.CodedOutputStream.computeBytesSize(2, byteString3) + com.crashlytics.android.core.CodedOutputStream.computeBytesSize(3, byteString4);
        int sessionAppOrgSize = getSessionAppOrgSize(byteString2);
        int iComputeTagSize = iComputeBytesSize + com.crashlytics.android.core.CodedOutputStream.computeTagSize(5) + com.crashlytics.android.core.CodedOutputStream.computeRawVarint32Size(sessionAppOrgSize) + sessionAppOrgSize + com.crashlytics.android.core.CodedOutputStream.computeBytesSize(6, byteString5);
        if (byteString6 != null) {
            iComputeTagSize = iComputeTagSize + com.crashlytics.android.core.CodedOutputStream.computeBytesSize(8, UNITY_PLATFORM_BYTE_STRING) + com.crashlytics.android.core.CodedOutputStream.computeBytesSize(9, byteString6);
        }
        return iComputeTagSize + com.crashlytics.android.core.CodedOutputStream.computeEnumSize(10, i);
    }

    private static int getSessionAppOrgSize(com.crashlytics.android.core.ByteString byteString) {
        return com.crashlytics.android.core.CodedOutputStream.computeBytesSize(1, byteString) + 0;
    }

    private static int getSessionOSSize(com.crashlytics.android.core.ByteString byteString, com.crashlytics.android.core.ByteString byteString2, boolean z) {
        return com.crashlytics.android.core.CodedOutputStream.computeEnumSize(1, 3) + 0 + com.crashlytics.android.core.CodedOutputStream.computeBytesSize(2, byteString) + com.crashlytics.android.core.CodedOutputStream.computeBytesSize(3, byteString2) + com.crashlytics.android.core.CodedOutputStream.computeBoolSize(4, z);
    }

    private static int getDeviceIdentifierSize(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType deviceIdentifierType, java.lang.String str) {
        return com.crashlytics.android.core.CodedOutputStream.computeEnumSize(1, deviceIdentifierType.protobufIndex) + com.crashlytics.android.core.CodedOutputStream.computeBytesSize(2, com.crashlytics.android.core.ByteString.copyFromUtf8(str));
    }

    private static int getSessionDeviceSize(int i, com.crashlytics.android.core.ByteString byteString, int i2, long j, long j2, boolean z, java.util.Map<io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType, java.lang.String> map, int i3, com.crashlytics.android.core.ByteString byteString2, com.crashlytics.android.core.ByteString byteString3) {
        int iComputeEnumSize = com.crashlytics.android.core.CodedOutputStream.computeEnumSize(3, i) + 0 + (byteString == null ? 0 : com.crashlytics.android.core.CodedOutputStream.computeBytesSize(4, byteString)) + com.crashlytics.android.core.CodedOutputStream.computeUInt32Size(5, i2) + com.crashlytics.android.core.CodedOutputStream.computeUInt64Size(6, j) + com.crashlytics.android.core.CodedOutputStream.computeUInt64Size(7, j2) + com.crashlytics.android.core.CodedOutputStream.computeBoolSize(10, z);
        if (map != null) {
            for (java.util.Map.Entry<io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType, java.lang.String> entry : map.entrySet()) {
                int deviceIdentifierSize = getDeviceIdentifierSize(entry.getKey(), entry.getValue());
                iComputeEnumSize += com.crashlytics.android.core.CodedOutputStream.computeTagSize(11) + com.crashlytics.android.core.CodedOutputStream.computeRawVarint32Size(deviceIdentifierSize) + deviceIdentifierSize;
            }
        }
        return iComputeEnumSize + com.crashlytics.android.core.CodedOutputStream.computeUInt32Size(12, i3) + (byteString2 == null ? 0 : com.crashlytics.android.core.CodedOutputStream.computeBytesSize(13, byteString2)) + (byteString3 != null ? com.crashlytics.android.core.CodedOutputStream.computeBytesSize(14, byteString3) : 0);
    }

    private static int getBinaryImageSize(com.crashlytics.android.core.ByteString byteString, com.crashlytics.android.core.ByteString byteString2) {
        int iComputeUInt64Size = com.crashlytics.android.core.CodedOutputStream.computeUInt64Size(1, 0L) + 0 + com.crashlytics.android.core.CodedOutputStream.computeUInt64Size(2, 0L) + com.crashlytics.android.core.CodedOutputStream.computeBytesSize(3, byteString);
        return byteString2 != null ? iComputeUInt64Size + com.crashlytics.android.core.CodedOutputStream.computeBytesSize(4, byteString2) : iComputeUInt64Size;
    }

    private static int getSessionEventSize(long j, java.lang.String str, com.crashlytics.android.core.TrimmedThrowableData trimmedThrowableData, java.lang.Thread thread, java.lang.StackTraceElement[] stackTraceElementArr, java.lang.Thread[] threadArr, java.util.List<java.lang.StackTraceElement[]> list, int i, java.util.Map<java.lang.String, java.lang.String> map, android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2, com.crashlytics.android.core.ByteString byteString, com.crashlytics.android.core.ByteString byteString2, java.lang.Float f, int i3, boolean z, long j2, long j3, com.crashlytics.android.core.ByteString byteString3) {
        int iComputeUInt64Size = com.crashlytics.android.core.CodedOutputStream.computeUInt64Size(1, j) + 0 + com.crashlytics.android.core.CodedOutputStream.computeBytesSize(2, com.crashlytics.android.core.ByteString.copyFromUtf8(str));
        int eventAppSize = getEventAppSize(trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, i, byteString, byteString2, map, runningAppProcessInfo, i2);
        int iComputeTagSize = iComputeUInt64Size + com.crashlytics.android.core.CodedOutputStream.computeTagSize(3) + com.crashlytics.android.core.CodedOutputStream.computeRawVarint32Size(eventAppSize) + eventAppSize;
        int eventDeviceSize = getEventDeviceSize(f, i3, z, i2, j2, j3);
        int iComputeTagSize2 = iComputeTagSize + com.crashlytics.android.core.CodedOutputStream.computeTagSize(5) + com.crashlytics.android.core.CodedOutputStream.computeRawVarint32Size(eventDeviceSize) + eventDeviceSize;
        if (byteString3 == null) {
            return iComputeTagSize2;
        }
        int eventLogSize = getEventLogSize(byteString3);
        return iComputeTagSize2 + com.crashlytics.android.core.CodedOutputStream.computeTagSize(6) + com.crashlytics.android.core.CodedOutputStream.computeRawVarint32Size(eventLogSize) + eventLogSize;
    }

    private static int getEventAppSize(com.crashlytics.android.core.TrimmedThrowableData trimmedThrowableData, java.lang.Thread thread, java.lang.StackTraceElement[] stackTraceElementArr, java.lang.Thread[] threadArr, java.util.List<java.lang.StackTraceElement[]> list, int i, com.crashlytics.android.core.ByteString byteString, com.crashlytics.android.core.ByteString byteString2, java.util.Map<java.lang.String, java.lang.String> map, android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2) {
        int eventAppExecutionSize = getEventAppExecutionSize(trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, i, byteString, byteString2);
        int iComputeTagSize = com.crashlytics.android.core.CodedOutputStream.computeTagSize(1) + com.crashlytics.android.core.CodedOutputStream.computeRawVarint32Size(eventAppExecutionSize) + eventAppExecutionSize + 0;
        if (map != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                int eventAppCustomAttributeSize = getEventAppCustomAttributeSize(entry.getKey(), entry.getValue());
                iComputeTagSize += com.crashlytics.android.core.CodedOutputStream.computeTagSize(2) + com.crashlytics.android.core.CodedOutputStream.computeRawVarint32Size(eventAppCustomAttributeSize) + eventAppCustomAttributeSize;
            }
        }
        if (runningAppProcessInfo != null) {
            iComputeTagSize += com.crashlytics.android.core.CodedOutputStream.computeBoolSize(3, runningAppProcessInfo.importance != 100);
        }
        return iComputeTagSize + com.crashlytics.android.core.CodedOutputStream.computeUInt32Size(4, i2);
    }

    private static int getEventAppExecutionSize(com.crashlytics.android.core.TrimmedThrowableData trimmedThrowableData, java.lang.Thread thread, java.lang.StackTraceElement[] stackTraceElementArr, java.lang.Thread[] threadArr, java.util.List<java.lang.StackTraceElement[]> list, int i, com.crashlytics.android.core.ByteString byteString, com.crashlytics.android.core.ByteString byteString2) {
        int threadSize = getThreadSize(thread, stackTraceElementArr, 4, true);
        int iComputeTagSize = com.crashlytics.android.core.CodedOutputStream.computeTagSize(1) + com.crashlytics.android.core.CodedOutputStream.computeRawVarint32Size(threadSize) + threadSize + 0;
        int length = threadArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int threadSize2 = getThreadSize(threadArr[i2], list.get(i2), 0, false);
            iComputeTagSize += com.crashlytics.android.core.CodedOutputStream.computeTagSize(1) + com.crashlytics.android.core.CodedOutputStream.computeRawVarint32Size(threadSize2) + threadSize2;
        }
        int eventAppExecutionExceptionSize = getEventAppExecutionExceptionSize(trimmedThrowableData, 1, i);
        int iComputeTagSize2 = iComputeTagSize + com.crashlytics.android.core.CodedOutputStream.computeTagSize(2) + com.crashlytics.android.core.CodedOutputStream.computeRawVarint32Size(eventAppExecutionExceptionSize) + eventAppExecutionExceptionSize;
        int eventAppExecutionSignalSize = getEventAppExecutionSignalSize();
        int iComputeTagSize3 = iComputeTagSize2 + com.crashlytics.android.core.CodedOutputStream.computeTagSize(3) + com.crashlytics.android.core.CodedOutputStream.computeRawVarint32Size(eventAppExecutionSignalSize) + eventAppExecutionSignalSize;
        int binaryImageSize = getBinaryImageSize(byteString, byteString2);
        return iComputeTagSize3 + com.crashlytics.android.core.CodedOutputStream.computeTagSize(3) + com.crashlytics.android.core.CodedOutputStream.computeRawVarint32Size(binaryImageSize) + binaryImageSize;
    }

    private static int getEventAppCustomAttributeSize(java.lang.String str, java.lang.String str2) {
        int iComputeBytesSize = com.crashlytics.android.core.CodedOutputStream.computeBytesSize(1, com.crashlytics.android.core.ByteString.copyFromUtf8(str));
        if (str2 == null) {
            str2 = "";
        }
        return iComputeBytesSize + com.crashlytics.android.core.CodedOutputStream.computeBytesSize(2, com.crashlytics.android.core.ByteString.copyFromUtf8(str2));
    }

    private static int getEventDeviceSize(java.lang.Float f, int i, boolean z, int i2, long j, long j2) {
        return (f != null ? 0 + com.crashlytics.android.core.CodedOutputStream.computeFloatSize(1, f.floatValue()) : 0) + com.crashlytics.android.core.CodedOutputStream.computeSInt32Size(2, i) + com.crashlytics.android.core.CodedOutputStream.computeBoolSize(3, z) + com.crashlytics.android.core.CodedOutputStream.computeUInt32Size(4, i2) + com.crashlytics.android.core.CodedOutputStream.computeUInt64Size(5, j) + com.crashlytics.android.core.CodedOutputStream.computeUInt64Size(6, j2);
    }

    private static int getEventLogSize(com.crashlytics.android.core.ByteString byteString) {
        return com.crashlytics.android.core.CodedOutputStream.computeBytesSize(1, byteString);
    }

    private static int getEventAppExecutionExceptionSize(com.crashlytics.android.core.TrimmedThrowableData trimmedThrowableData, int i, int i2) {
        int i3 = 0;
        int iComputeBytesSize = com.crashlytics.android.core.CodedOutputStream.computeBytesSize(1, com.crashlytics.android.core.ByteString.copyFromUtf8(trimmedThrowableData.className)) + 0;
        java.lang.String str = trimmedThrowableData.localizedMessage;
        if (str != null) {
            iComputeBytesSize += com.crashlytics.android.core.CodedOutputStream.computeBytesSize(3, com.crashlytics.android.core.ByteString.copyFromUtf8(str));
        }
        for (java.lang.StackTraceElement stackTraceElement : trimmedThrowableData.stacktrace) {
            int frameSize = getFrameSize(stackTraceElement, true);
            iComputeBytesSize += com.crashlytics.android.core.CodedOutputStream.computeTagSize(4) + com.crashlytics.android.core.CodedOutputStream.computeRawVarint32Size(frameSize) + frameSize;
        }
        com.crashlytics.android.core.TrimmedThrowableData trimmedThrowableData2 = trimmedThrowableData.cause;
        if (trimmedThrowableData2 == null) {
            return iComputeBytesSize;
        }
        if (i < i2) {
            int eventAppExecutionExceptionSize = getEventAppExecutionExceptionSize(trimmedThrowableData2, i + 1, i2);
            return iComputeBytesSize + com.crashlytics.android.core.CodedOutputStream.computeTagSize(6) + com.crashlytics.android.core.CodedOutputStream.computeRawVarint32Size(eventAppExecutionExceptionSize) + eventAppExecutionExceptionSize;
        }
        while (trimmedThrowableData2 != null) {
            trimmedThrowableData2 = trimmedThrowableData2.cause;
            i3++;
        }
        return iComputeBytesSize + com.crashlytics.android.core.CodedOutputStream.computeUInt32Size(7, i3);
    }

    private static int getEventAppExecutionSignalSize() {
        com.crashlytics.android.core.ByteString byteString = SIGNAL_DEFAULT_BYTE_STRING;
        return com.crashlytics.android.core.CodedOutputStream.computeBytesSize(1, byteString) + 0 + com.crashlytics.android.core.CodedOutputStream.computeBytesSize(2, byteString) + com.crashlytics.android.core.CodedOutputStream.computeUInt64Size(3, 0L);
    }

    private static int getFrameSize(java.lang.StackTraceElement stackTraceElement, boolean z) {
        int iComputeUInt64Size;
        if (stackTraceElement.isNativeMethod()) {
            iComputeUInt64Size = com.crashlytics.android.core.CodedOutputStream.computeUInt64Size(1, java.lang.Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            iComputeUInt64Size = com.crashlytics.android.core.CodedOutputStream.computeUInt64Size(1, 0L);
        }
        int iComputeBytesSize = iComputeUInt64Size + 0 + com.crashlytics.android.core.CodedOutputStream.computeBytesSize(2, com.crashlytics.android.core.ByteString.copyFromUtf8(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            iComputeBytesSize += com.crashlytics.android.core.CodedOutputStream.computeBytesSize(3, com.crashlytics.android.core.ByteString.copyFromUtf8(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            iComputeBytesSize += com.crashlytics.android.core.CodedOutputStream.computeUInt64Size(4, stackTraceElement.getLineNumber());
        }
        return iComputeBytesSize + com.crashlytics.android.core.CodedOutputStream.computeUInt32Size(5, z ? 2 : 0);
    }

    private static int getThreadSize(java.lang.Thread thread, java.lang.StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        int iComputeBytesSize = com.crashlytics.android.core.CodedOutputStream.computeBytesSize(1, com.crashlytics.android.core.ByteString.copyFromUtf8(thread.getName())) + com.crashlytics.android.core.CodedOutputStream.computeUInt32Size(2, i);
        for (java.lang.StackTraceElement stackTraceElement : stackTraceElementArr) {
            int frameSize = getFrameSize(stackTraceElement, z);
            iComputeBytesSize += com.crashlytics.android.core.CodedOutputStream.computeTagSize(3) + com.crashlytics.android.core.CodedOutputStream.computeRawVarint32Size(frameSize) + frameSize;
        }
        return iComputeBytesSize;
    }

    private static com.crashlytics.android.core.ByteString stringToByteString(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return com.crashlytics.android.core.ByteString.copyFromUtf8(str);
    }
}
