package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public enum FieldNamingPolicy implements com.google.gson.FieldNamingStrategy {
    IDENTITY { // from class: com.google.gson.FieldNamingPolicy.1
        @Override // com.google.gson.FieldNamingStrategy
        public java.lang.String translateName(java.lang.reflect.Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE { // from class: com.google.gson.FieldNamingPolicy.2
        @Override // com.google.gson.FieldNamingStrategy
        public java.lang.String translateName(java.lang.reflect.Field field) {
            return upperCaseFirstLetter(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: com.google.gson.FieldNamingPolicy.3
        @Override // com.google.gson.FieldNamingStrategy
        public java.lang.String translateName(java.lang.reflect.Field field) {
            return upperCaseFirstLetter(separateCamelCase(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES { // from class: com.google.gson.FieldNamingPolicy.4
        @Override // com.google.gson.FieldNamingStrategy
        public java.lang.String translateName(java.lang.reflect.Field field) {
            return separateCamelCase(field.getName(), io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR).toLowerCase(java.util.Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES { // from class: com.google.gson.FieldNamingPolicy.5
        @Override // com.google.gson.FieldNamingStrategy
        public java.lang.String translateName(java.lang.reflect.Field field) {
            return separateCamelCase(field.getName(), "-").toLowerCase(java.util.Locale.ENGLISH);
        }
    };

    static java.lang.String separateCamelCase(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (java.lang.Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    static java.lang.String upperCaseFirstLetter(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        char cCharAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !java.lang.Character.isLetter(cCharAt)) {
            sb.append(cCharAt);
            i++;
            cCharAt = str.charAt(i);
        }
        if (java.lang.Character.isUpperCase(cCharAt)) {
            return str;
        }
        sb.append(modifyString(java.lang.Character.toUpperCase(cCharAt), str, i + 1));
        return sb.toString();
    }

    private static java.lang.String modifyString(char c, java.lang.String str, int i) {
        if (i < str.length()) {
            return c + str.substring(i);
        }
        return java.lang.String.valueOf(c);
    }
}
