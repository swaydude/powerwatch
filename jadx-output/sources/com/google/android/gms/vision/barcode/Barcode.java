package com.google.android.gms.vision.barcode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class Barcode extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int ALL_FORMATS = 0;
    public static final int AZTEC = 4096;
    public static final int CALENDAR_EVENT = 11;
    public static final int CODABAR = 8;
    public static final int CODE_128 = 1;
    public static final int CODE_39 = 2;
    public static final int CODE_93 = 4;
    public static final int CONTACT_INFO = 1;
    public static final android.os.Parcelable.Creator<com.google.android.gms.vision.barcode.Barcode> CREATOR = new com.google.android.gms.vision.barcode.zzb();
    public static final int DATA_MATRIX = 16;
    public static final int DRIVER_LICENSE = 12;
    public static final int EAN_13 = 32;
    public static final int EAN_8 = 64;
    public static final int EMAIL = 2;
    public static final int GEO = 10;
    public static final int ISBN = 3;
    public static final int ITF = 128;
    public static final int PDF417 = 2048;
    public static final int PHONE = 4;
    public static final int PRODUCT = 5;
    public static final int QR_CODE = 256;
    public static final int SMS = 6;
    public static final int TEXT = 7;
    public static final int UPC_A = 512;
    public static final int UPC_E = 1024;
    public static final int URL = 8;
    public static final int WIFI = 9;
    public com.google.android.gms.vision.barcode.Barcode.CalendarEvent calendarEvent;
    public com.google.android.gms.vision.barcode.Barcode.ContactInfo contactInfo;
    public android.graphics.Point[] cornerPoints;
    public java.lang.String displayValue;
    public com.google.android.gms.vision.barcode.Barcode.DriverLicense driverLicense;
    public com.google.android.gms.vision.barcode.Barcode.Email email;
    public int format;
    public com.google.android.gms.vision.barcode.Barcode.GeoPoint geoPoint;
    public com.google.android.gms.vision.barcode.Barcode.Phone phone;
    public byte[] rawBytes;
    public java.lang.String rawValue;
    public com.google.android.gms.vision.barcode.Barcode.Sms sms;
    public com.google.android.gms.vision.barcode.Barcode.UrlBookmark url;
    public int valueFormat;
    public com.google.android.gms.vision.barcode.Barcode.WiFi wifi;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
    public static class Address extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.vision.barcode.Barcode.Address> CREATOR = new com.google.android.gms.vision.barcode.zza();
        public static final int HOME = 2;
        public static final int UNKNOWN = 0;
        public static final int WORK = 1;
        public java.lang.String[] addressLines;
        public int type;

        public Address() {
        }

        public Address(int i, java.lang.String[] strArr) {
            this.type = i;
            this.addressLines = strArr;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.type);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(parcel, 3, this.addressLines, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
    public static class CalendarDateTime extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.vision.barcode.Barcode.CalendarDateTime> CREATOR = new com.google.android.gms.vision.barcode.zzd();
        public int day;
        public int hours;
        public boolean isUtc;
        public int minutes;
        public int month;
        public java.lang.String rawValue;
        public int seconds;
        public int year;

        public CalendarDateTime() {
        }

        public CalendarDateTime(int i, int i2, int i3, int i4, int i5, int i6, boolean z, java.lang.String str) {
            this.year = i;
            this.month = i2;
            this.day = i3;
            this.hours = i4;
            this.minutes = i5;
            this.seconds = i6;
            this.isUtc = z;
            this.rawValue = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.year);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.month);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.day);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.hours);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.minutes);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, this.seconds);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.isUtc);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 9, this.rawValue, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
    public static class CalendarEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.vision.barcode.Barcode.CalendarEvent> CREATOR = new com.google.android.gms.vision.barcode.zzf();
        public java.lang.String description;
        public com.google.android.gms.vision.barcode.Barcode.CalendarDateTime end;
        public java.lang.String location;
        public java.lang.String organizer;
        public com.google.android.gms.vision.barcode.Barcode.CalendarDateTime start;
        public java.lang.String status;
        public java.lang.String summary;

        public CalendarEvent() {
        }

        public CalendarEvent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.google.android.gms.vision.barcode.Barcode.CalendarDateTime calendarDateTime, com.google.android.gms.vision.barcode.Barcode.CalendarDateTime calendarDateTime2) {
            this.summary = str;
            this.description = str2;
            this.location = str3;
            this.organizer = str4;
            this.status = str5;
            this.start = calendarDateTime;
            this.end = calendarDateTime2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.summary, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.description, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.location, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.organizer, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.status, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, this.start, i, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.end, i, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
    public static class ContactInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.vision.barcode.Barcode.ContactInfo> CREATOR = new com.google.android.gms.vision.barcode.zze();
        public com.google.android.gms.vision.barcode.Barcode.Address[] addresses;
        public com.google.android.gms.vision.barcode.Barcode.Email[] emails;
        public com.google.android.gms.vision.barcode.Barcode.PersonName name;
        public java.lang.String organization;
        public com.google.android.gms.vision.barcode.Barcode.Phone[] phones;
        public java.lang.String title;
        public java.lang.String[] urls;

        public ContactInfo() {
        }

        public ContactInfo(com.google.android.gms.vision.barcode.Barcode.PersonName personName, java.lang.String str, java.lang.String str2, com.google.android.gms.vision.barcode.Barcode.Phone[] phoneArr, com.google.android.gms.vision.barcode.Barcode.Email[] emailArr, java.lang.String[] strArr, com.google.android.gms.vision.barcode.Barcode.Address[] addressArr) {
            this.name = personName;
            this.organization = str;
            this.title = str2;
            this.phones = phoneArr;
            this.emails = emailArr;
            this.urls = strArr;
            this.addresses = addressArr;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.name, i, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.organization, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.title, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 5, this.phones, i, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 6, this.emails, i, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(parcel, 7, this.urls, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 8, this.addresses, i, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
    public static class DriverLicense extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.vision.barcode.Barcode.DriverLicense> CREATOR = new com.google.android.gms.vision.barcode.zzh();
        public java.lang.String addressCity;
        public java.lang.String addressState;
        public java.lang.String addressStreet;
        public java.lang.String addressZip;
        public java.lang.String birthDate;
        public java.lang.String documentType;
        public java.lang.String expiryDate;
        public java.lang.String firstName;
        public java.lang.String gender;
        public java.lang.String issueDate;
        public java.lang.String issuingCountry;
        public java.lang.String lastName;
        public java.lang.String licenseNumber;
        public java.lang.String middleName;

        public DriverLicense() {
        }

        public DriverLicense(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14) {
            this.documentType = str;
            this.firstName = str2;
            this.middleName = str3;
            this.lastName = str4;
            this.gender = str5;
            this.addressStreet = str6;
            this.addressCity = str7;
            this.addressState = str8;
            this.addressZip = str9;
            this.licenseNumber = str10;
            this.issueDate = str11;
            this.expiryDate = str12;
            this.birthDate = str13;
            this.issuingCountry = str14;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.documentType, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.firstName, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.middleName, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.lastName, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.gender, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.addressStreet, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.addressCity, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 9, this.addressState, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 10, this.addressZip, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 11, this.licenseNumber, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 12, this.issueDate, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 13, this.expiryDate, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 14, this.birthDate, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 15, this.issuingCountry, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
    public static class Email extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.vision.barcode.Barcode.Email> CREATOR = new com.google.android.gms.vision.barcode.zzg();
        public static final int HOME = 2;
        public static final int UNKNOWN = 0;
        public static final int WORK = 1;
        public java.lang.String address;
        public java.lang.String body;
        public java.lang.String subject;
        public int type;

        public Email() {
        }

        public Email(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.type = i;
            this.address = str;
            this.subject = str2;
            this.body = str3;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.type);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.address, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.subject, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.body, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
    public static class GeoPoint extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.vision.barcode.Barcode.GeoPoint> CREATOR = new com.google.android.gms.vision.barcode.zzj();
        public double lat;
        public double lng;

        public GeoPoint() {
        }

        public GeoPoint(double d, double d2) {
            this.lat = d;
            this.lng = d2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 2, this.lat);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 3, this.lng);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
    public static class PersonName extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.vision.barcode.Barcode.PersonName> CREATOR = new com.google.android.gms.vision.barcode.zzi();
        public java.lang.String first;
        public java.lang.String formattedName;
        public java.lang.String last;
        public java.lang.String middle;
        public java.lang.String prefix;
        public java.lang.String pronunciation;
        public java.lang.String suffix;

        public PersonName() {
        }

        public PersonName(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
            this.formattedName = str;
            this.pronunciation = str2;
            this.prefix = str3;
            this.first = str4;
            this.middle = str5;
            this.last = str6;
            this.suffix = str7;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.formattedName, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.pronunciation, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.prefix, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.first, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.middle, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.last, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.suffix, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
    public static class Phone extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.vision.barcode.Barcode.Phone> CREATOR = new com.google.android.gms.vision.barcode.zzl();
        public static final int FAX = 3;
        public static final int HOME = 2;
        public static final int MOBILE = 4;
        public static final int UNKNOWN = 0;
        public static final int WORK = 1;
        public java.lang.String number;
        public int type;

        public Phone() {
        }

        public Phone(int i, java.lang.String str) {
            this.type = i;
            this.number = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.type);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.number, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
    public static class Sms extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.vision.barcode.Barcode.Sms> CREATOR = new com.google.android.gms.vision.barcode.zzk();
        public java.lang.String message;
        public java.lang.String phoneNumber;

        public Sms() {
        }

        public Sms(java.lang.String str, java.lang.String str2) {
            this.message = str;
            this.phoneNumber = str2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.message, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.phoneNumber, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
    public static class UrlBookmark extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.vision.barcode.Barcode.UrlBookmark> CREATOR = new com.google.android.gms.vision.barcode.zzn();
        public java.lang.String title;
        public java.lang.String url;

        public UrlBookmark() {
        }

        public UrlBookmark(java.lang.String str, java.lang.String str2) {
            this.title = str;
            this.url = str2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.title, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.url, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
    public static class WiFi extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.vision.barcode.Barcode.WiFi> CREATOR = new com.google.android.gms.vision.barcode.zzm();
        public static final int OPEN = 1;
        public static final int WEP = 3;
        public static final int WPA = 2;
        public int encryptionType;
        public java.lang.String password;
        public java.lang.String ssid;

        public WiFi() {
        }

        public WiFi(java.lang.String str, java.lang.String str2, int i) {
            this.ssid = str;
            this.password = str2;
            this.encryptionType = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.ssid, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.password, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.encryptionType);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    public Barcode() {
    }

    public Barcode(int i, java.lang.String str, java.lang.String str2, int i2, android.graphics.Point[] pointArr, com.google.android.gms.vision.barcode.Barcode.Email email, com.google.android.gms.vision.barcode.Barcode.Phone phone, com.google.android.gms.vision.barcode.Barcode.Sms sms, com.google.android.gms.vision.barcode.Barcode.WiFi wiFi, com.google.android.gms.vision.barcode.Barcode.UrlBookmark urlBookmark, com.google.android.gms.vision.barcode.Barcode.GeoPoint geoPoint, com.google.android.gms.vision.barcode.Barcode.CalendarEvent calendarEvent, com.google.android.gms.vision.barcode.Barcode.ContactInfo contactInfo, com.google.android.gms.vision.barcode.Barcode.DriverLicense driverLicense, byte[] bArr) {
        this.format = i;
        this.rawValue = str;
        this.rawBytes = bArr;
        this.displayValue = str2;
        this.valueFormat = i2;
        this.cornerPoints = pointArr;
        this.email = email;
        this.phone = phone;
        this.sms = sms;
        this.wifi = wiFi;
        this.url = urlBookmark;
        this.geoPoint = geoPoint;
        this.calendarEvent = calendarEvent;
        this.contactInfo = contactInfo;
        this.driverLicense = driverLicense;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.format);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.rawValue, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.displayValue, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.valueFormat);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 6, this.cornerPoints, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, this.email, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.phone, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, this.sms, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 10, this.wifi, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 11, this.url, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 12, this.geoPoint, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 13, this.calendarEvent, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 14, this.contactInfo, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 15, this.driverLicense, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 16, this.rawBytes, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public android.graphics.Rect getBoundingBox() {
        int iMax = Integer.MIN_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int i = 0;
        while (true) {
            android.graphics.Point[] pointArr = this.cornerPoints;
            if (i < pointArr.length) {
                android.graphics.Point point = pointArr[i];
                iMin = java.lang.Math.min(iMin, point.x);
                iMax = java.lang.Math.max(iMax, point.x);
                iMin2 = java.lang.Math.min(iMin2, point.y);
                iMax2 = java.lang.Math.max(iMax2, point.y);
                i++;
            } else {
                return new android.graphics.Rect(iMin, iMin2, iMax, iMax2);
            }
        }
    }
}
