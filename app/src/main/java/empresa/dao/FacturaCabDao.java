package empresa.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import empresa.dao.FacturaCab;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "FACTURA_CAB".
*/
public class FacturaCabDao extends AbstractDao<FacturaCab, Long> {

    public static final String TABLENAME = "FACTURA_CAB";

    /**
     * Properties of entity FacturaCab.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Idfacturacab = new Property(0, long.class, "idfacturacab", true, "IDFACTURACAB");
        public final static Property Idventacab = new Property(1, long.class, "idventacab", false, "IDVENTACAB");
        public final static Property Establecimiento = new Property(2, long.class, "establecimiento", false, "ESTABLECIMIENTO");
        public final static Property Puntoexpedicion = new Property(3, long.class, "puntoexpedicion", false, "PUNTOEXPEDICION");
        public final static Property Nrofactura = new Property(4, long.class, "nrofactura", false, "NROFACTURA");
        public final static Property Importe = new Property(5, double.class, "importe", false, "IMPORTE");
        public final static Property Saldo = new Property(6, double.class, "saldo", false, "SALDO");
    };


    public FacturaCabDao(DaoConfig config) {
        super(config);
    }

    public FacturaCabDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'FACTURA_CAB' (" + //
                "'IDFACTURACAB' INTEGER PRIMARY KEY NOT NULL ," + // 0: idfacturacab
                "'IDVENTACAB' INTEGER NOT NULL ," + // 1: idventacab
                "'ESTABLECIMIENTO' INTEGER NOT NULL ," + // 2: establecimiento
                "'PUNTOEXPEDICION' INTEGER NOT NULL ," + // 3: puntoexpedicion
                "'NROFACTURA' INTEGER NOT NULL ," + // 4: nrofactura
                "'IMPORTE' REAL NOT NULL ," + // 5: importe
                "'SALDO' REAL NOT NULL );"); // 6: saldo
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'FACTURA_CAB'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, FacturaCab entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getIdfacturacab());
        stmt.bindLong(2, entity.getIdventacab());
        stmt.bindLong(3, entity.getEstablecimiento());
        stmt.bindLong(4, entity.getPuntoexpedicion());
        stmt.bindLong(5, entity.getNrofactura());
        stmt.bindDouble(6, entity.getImporte());
        stmt.bindDouble(7, entity.getSaldo());
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }

    /** @inheritdoc */
    @Override
    public FacturaCab readEntity(Cursor cursor, int offset) {
        FacturaCab entity = new FacturaCab( //
                cursor.getLong(offset + 0), // idfacturacab
                cursor.getLong(offset + 1), // idventacab
                cursor.getLong(offset + 2), // establecimiento
                cursor.getLong(offset + 3), // puntoexpedicion
                cursor.getLong(offset + 4), // nrofactura
                cursor.getDouble(offset + 5), // importe
                cursor.getDouble(offset + 6) // saldo
        );
        return entity;
    }

    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, FacturaCab entity, int offset) {
        entity.setIdfacturacab(cursor.getLong(offset + 0));
        entity.setIdventacab(cursor.getLong(offset + 1));
        entity.setEstablecimiento(cursor.getLong(offset + 2));
        entity.setPuntoexpedicion(cursor.getLong(offset + 3));
        entity.setNrofactura(cursor.getLong(offset + 4));
        entity.setImporte(cursor.getDouble(offset + 5));
        entity.setSaldo(cursor.getDouble(offset + 6));
    }

    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(FacturaCab entity, long rowId) {
        entity.setIdfacturacab(rowId);
        return rowId;
    }

    /** @inheritdoc */
    @Override
    public Long getKey(FacturaCab entity) {
        if(entity != null) {
            return entity.getIdfacturacab();
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
