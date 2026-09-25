package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public class ViewUtils {
    private ViewUtils() {
    }

    public static java.lang.String getXmlAttributeString(java.lang.String str, java.lang.String str2, android.content.Context context, android.util.AttributeSet attributeSet, boolean z, boolean z2, java.lang.String str3) {
        java.lang.String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue != null && attributeValue.startsWith("@string/") && z) {
            java.lang.String strSubstring = attributeValue.substring(8);
            java.lang.String packageName = context.getPackageName();
            android.util.TypedValue typedValue = new android.util.TypedValue();
            try {
                android.content.res.Resources resources = context.getResources();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(packageName).length() + 8 + java.lang.String.valueOf(strSubstring).length());
                sb.append(packageName);
                sb.append(":string/");
                sb.append(strSubstring);
                resources.getValue(sb.toString(), typedValue, true);
            } catch (android.content.res.Resources.NotFoundException unused) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 30 + java.lang.String.valueOf(attributeValue).length());
                sb2.append("Could not find resource for ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(attributeValue);
                android.util.Log.w(str3, sb2.toString());
            }
            if (typedValue.string != null) {
                attributeValue = typedValue.string.toString();
            } else {
                java.lang.String strValueOf = java.lang.String.valueOf(typedValue);
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 28 + java.lang.String.valueOf(strValueOf).length());
                sb3.append("Resource ");
                sb3.append(str2);
                sb3.append(" was not a string: ");
                sb3.append(strValueOf);
                android.util.Log.w(str3, sb3.toString());
            }
        }
        if (z2 && attributeValue == null) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 33);
            sb4.append("Required XML attribute \"");
            sb4.append(str2);
            sb4.append("\" missing");
            android.util.Log.w(str3, sb4.toString());
        }
        return attributeValue;
    }
}
