package androidx.room;

/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Repeatable(androidx.room.DeleteColumn.Entries.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface DeleteColumn {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface Entries {
        androidx.room.DeleteColumn[] value();
    }

    java.lang.String columnName();

    java.lang.String tableName();
}
