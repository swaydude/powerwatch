package androidx.core.content.pm;

/* JADX INFO: loaded from: classes.dex */
public class ShortcutInfoCompat {
    private static final java.lang.String EXTRA_LONG_LIVED = "extraLongLived";
    private static final java.lang.String EXTRA_PERSON_ = "extraPerson_";
    private static final java.lang.String EXTRA_PERSON_COUNT = "extraPersonCount";
    android.content.ComponentName mActivity;
    java.util.Set<java.lang.String> mCategories;
    android.content.Context mContext;
    java.lang.CharSequence mDisabledMessage;
    androidx.core.graphics.drawable.IconCompat mIcon;
    java.lang.String mId;
    android.content.Intent[] mIntents;
    boolean mIsAlwaysBadged;
    boolean mIsLongLived;
    java.lang.CharSequence mLabel;
    java.lang.CharSequence mLongLabel;
    androidx.core.app.Person[] mPersons;

    ShortcutInfoCompat() {
    }

    public android.content.pm.ShortcutInfo toShortcutInfo() {
        android.content.pm.ShortcutInfo.Builder intents = new android.content.pm.ShortcutInfo.Builder(this.mContext, this.mId).setShortLabel(this.mLabel).setIntents(this.mIntents);
        androidx.core.graphics.drawable.IconCompat iconCompat = this.mIcon;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.toIcon());
        }
        if (!android.text.TextUtils.isEmpty(this.mLongLabel)) {
            intents.setLongLabel(this.mLongLabel);
        }
        if (!android.text.TextUtils.isEmpty(this.mDisabledMessage)) {
            intents.setDisabledMessage(this.mDisabledMessage);
        }
        android.content.ComponentName componentName = this.mActivity;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        java.util.Set<java.lang.String> set = this.mCategories;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setExtras(buildExtrasBundle());
        return intents.build();
    }

    private android.os.PersistableBundle buildExtrasBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        androidx.core.app.Person[] personArr = this.mPersons;
        if (personArr != null && personArr.length > 0) {
            persistableBundle.putInt(EXTRA_PERSON_COUNT, personArr.length);
            int i = 0;
            while (i < this.mPersons.length) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(EXTRA_PERSON_);
                int i2 = i + 1;
                sb.append(i2);
                persistableBundle.putPersistableBundle(sb.toString(), this.mPersons[i].toPersistableBundle());
                i = i2;
            }
        }
        persistableBundle.putBoolean(EXTRA_LONG_LIVED, this.mIsLongLived);
        return persistableBundle;
    }

    android.content.Intent addToIntent(android.content.Intent intent) {
        android.content.Intent[] intentArr = this.mIntents;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.mLabel.toString());
        if (this.mIcon != null) {
            android.graphics.drawable.Drawable activityIcon = null;
            if (this.mIsAlwaysBadged) {
                android.content.pm.PackageManager packageManager = this.mContext.getPackageManager();
                android.content.ComponentName componentName = this.mActivity;
                if (componentName != null) {
                    try {
                        activityIcon = packageManager.getActivityIcon(componentName);
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    }
                }
                if (activityIcon == null) {
                    activityIcon = this.mContext.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.mIcon.addToShortcutIntent(intent, activityIcon, this.mContext);
        }
        return intent;
    }

    public java.lang.String getId() {
        return this.mId;
    }

    public android.content.ComponentName getActivity() {
        return this.mActivity;
    }

    public java.lang.CharSequence getShortLabel() {
        return this.mLabel;
    }

    public java.lang.CharSequence getLongLabel() {
        return this.mLongLabel;
    }

    public java.lang.CharSequence getDisabledMessage() {
        return this.mDisabledMessage;
    }

    public android.content.Intent getIntent() {
        android.content.Intent[] intentArr = this.mIntents;
        return intentArr[intentArr.length - 1];
    }

    public android.content.Intent[] getIntents() {
        android.content.Intent[] intentArr = this.mIntents;
        return (android.content.Intent[]) java.util.Arrays.copyOf(intentArr, intentArr.length);
    }

    public java.util.Set<java.lang.String> getCategories() {
        return this.mCategories;
    }

    public androidx.core.graphics.drawable.IconCompat getIcon() {
        return this.mIcon;
    }

    static androidx.core.app.Person[] getPersonsFromExtra(android.os.PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(EXTRA_PERSON_COUNT)) {
            return null;
        }
        int i = persistableBundle.getInt(EXTRA_PERSON_COUNT);
        androidx.core.app.Person[] personArr = new androidx.core.app.Person[i];
        int i2 = 0;
        while (i2 < i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(EXTRA_PERSON_);
            int i3 = i2 + 1;
            sb.append(i3);
            personArr[i2] = androidx.core.app.Person.fromPersistableBundle(persistableBundle.getPersistableBundle(sb.toString()));
            i2 = i3;
        }
        return personArr;
    }

    static boolean getLongLivedFromExtra(android.os.PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(EXTRA_LONG_LIVED)) {
            return false;
        }
        return persistableBundle.getBoolean(EXTRA_LONG_LIVED);
    }

    public static class Builder {
        private final androidx.core.content.pm.ShortcutInfoCompat mInfo;

        public Builder(android.content.Context context, java.lang.String str) {
            androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat = new androidx.core.content.pm.ShortcutInfoCompat();
            this.mInfo = shortcutInfoCompat;
            shortcutInfoCompat.mContext = context;
            shortcutInfoCompat.mId = str;
        }

        public Builder(androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat) {
            androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat2 = new androidx.core.content.pm.ShortcutInfoCompat();
            this.mInfo = shortcutInfoCompat2;
            shortcutInfoCompat2.mContext = shortcutInfoCompat.mContext;
            shortcutInfoCompat2.mId = shortcutInfoCompat.mId;
            shortcutInfoCompat2.mIntents = (android.content.Intent[]) java.util.Arrays.copyOf(shortcutInfoCompat.mIntents, shortcutInfoCompat.mIntents.length);
            shortcutInfoCompat2.mActivity = shortcutInfoCompat.mActivity;
            shortcutInfoCompat2.mLabel = shortcutInfoCompat.mLabel;
            shortcutInfoCompat2.mLongLabel = shortcutInfoCompat.mLongLabel;
            shortcutInfoCompat2.mDisabledMessage = shortcutInfoCompat.mDisabledMessage;
            shortcutInfoCompat2.mIcon = shortcutInfoCompat.mIcon;
            shortcutInfoCompat2.mIsAlwaysBadged = shortcutInfoCompat.mIsAlwaysBadged;
            shortcutInfoCompat2.mIsLongLived = shortcutInfoCompat.mIsLongLived;
            if (shortcutInfoCompat.mPersons != null) {
                shortcutInfoCompat2.mPersons = (androidx.core.app.Person[]) java.util.Arrays.copyOf(shortcutInfoCompat.mPersons, shortcutInfoCompat.mPersons.length);
            }
            if (shortcutInfoCompat.mCategories != null) {
                shortcutInfoCompat2.mCategories = new java.util.HashSet(shortcutInfoCompat.mCategories);
            }
        }

        public Builder(android.content.Context context, android.content.pm.ShortcutInfo shortcutInfo) {
            androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat = new androidx.core.content.pm.ShortcutInfoCompat();
            this.mInfo = shortcutInfoCompat;
            shortcutInfoCompat.mContext = context;
            shortcutInfoCompat.mId = shortcutInfo.getId();
            android.content.Intent[] intents = shortcutInfo.getIntents();
            shortcutInfoCompat.mIntents = (android.content.Intent[]) java.util.Arrays.copyOf(intents, intents.length);
            shortcutInfoCompat.mActivity = shortcutInfo.getActivity();
            shortcutInfoCompat.mLabel = shortcutInfo.getShortLabel();
            shortcutInfoCompat.mLongLabel = shortcutInfo.getLongLabel();
            shortcutInfoCompat.mDisabledMessage = shortcutInfo.getDisabledMessage();
            shortcutInfoCompat.mCategories = shortcutInfo.getCategories();
            shortcutInfoCompat.mPersons = androidx.core.content.pm.ShortcutInfoCompat.getPersonsFromExtra(shortcutInfo.getExtras());
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setShortLabel(java.lang.CharSequence charSequence) {
            this.mInfo.mLabel = charSequence;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLongLabel(java.lang.CharSequence charSequence) {
            this.mInfo.mLongLabel = charSequence;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setDisabledMessage(java.lang.CharSequence charSequence) {
            this.mInfo.mDisabledMessage = charSequence;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIntent(android.content.Intent intent) {
            return setIntents(new android.content.Intent[]{intent});
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIntents(android.content.Intent[] intentArr) {
            this.mInfo.mIntents = intentArr;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIcon(androidx.core.graphics.drawable.IconCompat iconCompat) {
            this.mInfo.mIcon = iconCompat;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setActivity(android.content.ComponentName componentName) {
            this.mInfo.mActivity = componentName;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setAlwaysBadged() {
            this.mInfo.mIsAlwaysBadged = true;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setPerson(androidx.core.app.Person person) {
            return setPersons(new androidx.core.app.Person[]{person});
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setPersons(androidx.core.app.Person[] personArr) {
            this.mInfo.mPersons = personArr;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setCategories(java.util.Set<java.lang.String> set) {
            this.mInfo.mCategories = set;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLongLived() {
            this.mInfo.mIsLongLived = true;
            return this;
        }

        public androidx.core.content.pm.ShortcutInfoCompat build() {
            if (android.text.TextUtils.isEmpty(this.mInfo.mLabel)) {
                throw new java.lang.IllegalArgumentException("Shortcut must have a non-empty label");
            }
            if (this.mInfo.mIntents == null || this.mInfo.mIntents.length == 0) {
                throw new java.lang.IllegalArgumentException("Shortcut must have an intent");
            }
            return this.mInfo;
        }
    }
}
