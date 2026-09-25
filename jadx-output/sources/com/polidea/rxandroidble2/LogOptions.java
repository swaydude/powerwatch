package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public class LogOptions {
    private java.lang.Integer logLevel;
    private com.polidea.rxandroidble2.LogOptions.Logger logger;
    private java.lang.Integer macAddressLogSetting;
    private java.lang.Boolean shouldLogAttributeValues;
    private java.lang.Boolean shouldLogScannedPeripherals;
    private java.lang.Integer uuidLogSetting;

    public interface Logger {
        void log(int i, java.lang.String str, java.lang.String str2);
    }

    private LogOptions(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Boolean bool, java.lang.Boolean bool2, com.polidea.rxandroidble2.LogOptions.Logger logger) {
        this.logLevel = num;
        this.macAddressLogSetting = num2;
        this.uuidLogSetting = num3;
        this.shouldLogAttributeValues = bool;
        this.shouldLogScannedPeripherals = bool2;
        this.logger = logger;
    }

    public java.lang.Integer getLogLevel() {
        return this.logLevel;
    }

    public java.lang.Integer getMacAddressLogSetting() {
        return this.macAddressLogSetting;
    }

    public java.lang.Integer getUuidLogSetting() {
        return this.uuidLogSetting;
    }

    public java.lang.Boolean getShouldLogAttributeValues() {
        return this.shouldLogAttributeValues;
    }

    public java.lang.Boolean getShouldLogScannedPeripherals() {
        return this.shouldLogScannedPeripherals;
    }

    public com.polidea.rxandroidble2.LogOptions.Logger getLogger() {
        return this.logger;
    }

    public java.lang.String toString() {
        return "LogOptions{logLevel=" + this.logLevel + ", macAddressLogSetting=" + this.macAddressLogSetting + ", uuidLogSetting=" + this.uuidLogSetting + ", shouldLogAttributeValues=" + this.shouldLogAttributeValues + ", shouldLogScannedPeripherals=" + this.shouldLogScannedPeripherals + ", logger=" + this.logger + '}';
    }

    public static class Builder {
        private java.lang.Integer logLevel;
        private com.polidea.rxandroidble2.LogOptions.Logger logger;
        private java.lang.Integer macAddressLogSetting;
        private java.lang.Boolean shouldLogAttributeValues;
        private java.lang.Boolean shouldLogScannedPeripherals;
        private java.lang.Integer uuidsLogSetting;

        public com.polidea.rxandroidble2.LogOptions.Builder setLogLevel(java.lang.Integer num) {
            this.logLevel = num;
            return this;
        }

        public com.polidea.rxandroidble2.LogOptions.Builder setMacAddressLogSetting(java.lang.Integer num) {
            this.macAddressLogSetting = num;
            return this;
        }

        public com.polidea.rxandroidble2.LogOptions.Builder setUuidsLogSetting(java.lang.Integer num) {
            this.uuidsLogSetting = num;
            return this;
        }

        public com.polidea.rxandroidble2.LogOptions.Builder setShouldLogAttributeValues(java.lang.Boolean bool) {
            this.shouldLogAttributeValues = bool;
            return this;
        }

        public com.polidea.rxandroidble2.LogOptions.Builder setShouldLogScannedPeripherals(java.lang.Boolean bool) {
            this.shouldLogScannedPeripherals = bool;
            return this;
        }

        public com.polidea.rxandroidble2.LogOptions.Builder setLogger(com.polidea.rxandroidble2.LogOptions.Logger logger) {
            this.logger = logger;
            return this;
        }

        public com.polidea.rxandroidble2.LogOptions build() {
            return new com.polidea.rxandroidble2.LogOptions(this.logLevel, this.macAddressLogSetting, this.uuidsLogSetting, this.shouldLogAttributeValues, this.shouldLogScannedPeripherals, this.logger);
        }
    }
}
