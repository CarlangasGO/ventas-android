package empresa.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import empresa.dao.PromedioPorColeccion;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PROMEDIO_POR_COLECCION".
*/
public class PromedioPorColeccionDao extends AbstractDao<PromedioPorColeccion, Long> {

    public static final String TABLENAME = "PROMEDIO_POR_COLECCION";

    /**
     * Properties of entity PromedioPorColeccion.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Idpromedioporcoleccion = new Property(0, Long.class, "idpromedioporcoleccion", true, "IDPROMEDIOPORCOLECCION");
        public final static Property Promedioprecio = new Property(1, double.class, "promedioprecio", false, "PROMEDIOPRECIO");
        public final static Property Idcoleccion = new Property(2, Long.class, "idcoleccion", false, "IDCOLECCION");
        public final static Property Idusuario = new Property(3, long.class, "idusuario", false, "IDUSUARIO");
    };


    public PromedioPorColeccionDao(DaoConfig config) {
        super(config);
    }

    public PromedioPorColeccionDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'PROMEDIO_POR_COLECCION' (" + //
                "'IDPROMEDIOPORCOLECCION' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: idpromedioporcoleccion
                "'PROMEDIOPRECIO' REAL NOT NULL ," + // 1: promedioprecio
                "'IDCOLECCION' INTEGER," + // 2: idcoleccion
                "'IDUSUARIO' INTEGER NOT NULL );"); // 3: idusuario
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'PROMEDIO_POR_COLECCION'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, PromedioPorColeccion entity) {
        stmt.clearBindings();

        Long idpromedioporcoleccion = entity.getIdpromedioporcoleccion();
        if (idpromedioporcoleccion != null) {
            stmt.bindLong(1, idpromedioporcoleccion);
        }
        stmt.bindDouble(2, entity.getPromedioprecio());

        Long idcoleccion = entity.getIdcoleccion();
        if (idcoleccion != null) {
            stmt.bindLong(3, idcoleccion);
        }
        stmt.bindLong(4, entity.getIdusuario());
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    /** @inheritdoc */
    @Override
    public PromedioPorColeccion readEntity(Cursor cursor, int offset) {
        PromedioPorColeccion entity = new PromedioPorColeccion( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // idpromedioporcoleccion
                cursor.getDouble(offset + 1), // promedioprecio
                cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2), // idcoleccion
                cursor.getLong(offset + 3) // idusuario
        );
        return entity;
    }

    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, PromedioPorColeccion entity, int offset) {
        entity.setIdpromedioporcoleccion(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPromedioprecio(cursor.getDouble(offset + 1));
        entity.setIdcoleccion(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
        entity.setIdusuario(cursor.getLong(offset + 3));
    }

    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(PromedioPorColeccion entity, long rowId) {
        entity.setIdpromedioporcoleccion(rowId);
        return rowId;
    }

    /** @inheritdoc */
    @Override
    public Long getKey(PromedioPorColeccion entity) {
        if(entity != null) {
            return entity.getIdpromedioporcoleccion();
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
