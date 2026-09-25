package androidx.room;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Repeatable(androidx.room.DeleteTable.Entries.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface DeleteTable {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface Entries {
        androidx.room.DeleteTable[] value();
    }

    java.lang.String tableName();
}
