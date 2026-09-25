package com.google.android.gms.common;

/* JADX INFO: loaded from: classes.dex */
public final class AccountPicker {
    private AccountPicker() {
    }

    public static android.content.Intent newChooseAccountIntent(android.accounts.Account account, java.util.ArrayList<android.accounts.Account> arrayList, java.lang.String[] strArr, boolean z, java.lang.String str, java.lang.String str2, java.lang.String[] strArr2, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        com.google.android.gms.common.internal.Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", str2);
        intent.putExtra("addAccountRequiredFeatures", strArr2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (java.lang.String) null);
        return intent;
    }
}
