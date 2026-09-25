package androidx.room;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Repeatable(androidx.room.RenameTable.Entries.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface RenameTable {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface Entries {
        androidx.room.RenameTable[] value();
    }

    java.lang.String fromTableName();

    java.lang.String toTableName();
}
