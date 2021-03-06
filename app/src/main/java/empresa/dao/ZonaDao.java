package empresa.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import empresa.dao.Zona;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ZONA".
*/
public class ZonaDao extends AbstractDao<Zona, Long> {

    public static final String TABLENAME = "ZONA";

    /**
     * Properties of entity Zona.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Idzona = new Property(0, Long.class, "idzona", true, "IDZONA");
        public final static Property Descripcion = new Property(1, String.class, "descripcion", false, "DESCRIPCION");
    };


    public ZonaDao(DaoConfig config) {
        super(config);
    }

    public ZonaDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'ZONA' (" + //
                "'IDZONA' INTEGER PRIMARY KEY ," + // 0: idzona
                "'DESCRIPCION' TEXT NOT NULL );"); // 1: descripcion
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'ZONA'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Zona entity) {
        stmt.clearBindings();

        Long idzona = entity.getIdzona();
        if (idzona != null) {
            stmt.bindLong(1, idzona);
        }
        stmt.bindString(2, entity.getDescripcion());
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    /** @inheritdoc */
    @Override
    public Zona readEntity(Cursor cursor, int offset) {
        Zona entity = new Zona( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // idzona
                cursor.getString(offset + 1) // descripcion
        );
        return entity;
    }

    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Zona entity, int offset) {
        entity.setIdzona(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setDescripcion(cursor.getString(offset + 1));
    }

    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Zona entity, long rowId) {
        entity.setIdzona(rowId);
        return rowId;
    }

    /** @inheritdoc */
    @Override
    public Long getKey(Zona entity) {
        if(entity != null) {
            return entity.getIdzona();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }

}
