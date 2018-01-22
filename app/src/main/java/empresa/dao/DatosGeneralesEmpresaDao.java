package empresa.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import empresa.dao.DatosGeneralesEmpresa;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DATOS_GENERALES_EMPRESA".
*/
public class DatosGeneralesEmpresaDao extends AbstractDao<DatosGeneralesEmpresa, Long> {

    public static final String TABLENAME = "DATOS_GENERALES_EMPRESA";

    /**
     * Properties of entity DatosGeneralesEmpresa.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Iddatogeneral = new Property(0, Long.class, "iddatogeneral", true, "IDDATOGENERAL");
        public final static Property Campo = new Property(1, String.class, "campo", false, "CAMPO");
        public final static Property Dato = new Property(2, String.class, "dato", false, "DATO");
    };


    public DatosGeneralesEmpresaDao(DaoConfig config) {
        super(config);
    }

    public DatosGeneralesEmpresaDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'DATOS_GENERALES_EMPRESA' (" + //
                "'IDDATOGENERAL' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: iddatogeneral
                "'CAMPO' TEXT NOT NULL UNIQUE ," + // 1: campo
                "'DATO' TEXT);"); // 2: dato
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'DATOS_GENERALES_EMPRESA'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, DatosGeneralesEmpresa entity) {
        stmt.clearBindings();

        Long iddatogeneral = entity.getIddatogeneral();
        if (iddatogeneral != null) {
            stmt.bindLong(1, iddatogeneral);
        }
        stmt.bindString(2, entity.getCampo());

        String dato = entity.getDato();
        if (dato != null) {
            stmt.bindString(3, dato);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    /** @inheritdoc */
    @Override
    public DatosGeneralesEmpresa readEntity(Cursor cursor, int offset) {
        DatosGeneralesEmpresa entity = new DatosGeneralesEmpresa( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // iddatogeneral
                cursor.getString(offset + 1), // campo
                cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // dato
        );
        return entity;
    }

    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, DatosGeneralesEmpresa entity, int offset) {
        entity.setIddatogeneral(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCampo(cursor.getString(offset + 1));
        entity.setDato(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
    }

    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(DatosGeneralesEmpresa entity, long rowId) {
        entity.setIddatogeneral(rowId);
        return rowId;
    }

    /** @inheritdoc */
    @Override
    public Long getKey(DatosGeneralesEmpresa entity) {
        if(entity != null) {
            return entity.getIddatogeneral();
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
