package empresa.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import empresa.dao.Usuario;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USUARIO".
*/
public class UsuarioDao extends AbstractDao<Usuario, Long> {

    public static final String TABLENAME = "USUARIO";

    /**
     * Properties of entity Usuario.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Idusuario = new Property(0, Long.class, "idusuario", true, "IDUSUARIO");
        public final static Property Idpersona = new Property(1, long.class, "idpersona", false, "IDPERSONA");
        public final static Property Nombres = new Property(2, String.class, "nombres", false, "NOMBRES");
        public final static Property Apellidos = new Property(3, String.class, "apellidos", false, "APELLIDOS");
        public final static Property Usuario = new Property(4, String.class, "usuario", false, "USUARIO");
        public final static Property Clave = new Property(5, String.class, "clave", false, "CLAVE");
        public final static Property Nrodocumento = new Property(6, String.class, "nrodocumento", false, "NRODOCUMENTO");
        public final static Property Estado = new Property(7, Boolean.class, "estado", false, "ESTADO");
    };


    public UsuarioDao(DaoConfig config) {
        super(config);
    }

    public UsuarioDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'USUARIO' (" + //
                "'IDUSUARIO' INTEGER PRIMARY KEY ," + // 0: idusuario
                "'IDPERSONA' INTEGER NOT NULL ," + // 1: idpersona
                "'NOMBRES' TEXT NOT NULL ," + // 2: nombres
                "'APELLIDOS' TEXT NOT NULL ," + // 3: apellidos
                "'USUARIO' TEXT NOT NULL ," + // 4: usuario
                "'CLAVE' TEXT NOT NULL ," + // 5: clave
                "'NRODOCUMENTO' TEXT NOT NULL ," + // 6: nrodocumento
                "'ESTADO' INTEGER);"); // 7: estado
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'USUARIO'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Usuario entity) {
        stmt.clearBindings();

        Long idusuario = entity.getIdusuario();
        if (idusuario != null) {
            stmt.bindLong(1, idusuario);
        }
        stmt.bindLong(2, entity.getIdpersona());
        stmt.bindString(3, entity.getNombres());
        stmt.bindString(4, entity.getApellidos());
        stmt.bindString(5, entity.getUsuario());
        stmt.bindString(6, entity.getClave());
        stmt.bindString(7, entity.getNrodocumento());

        Boolean estado = entity.getEstado();
        if (estado != null) {
            stmt.bindLong(8, estado ? 1l: 0l);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    /** @inheritdoc */
    @Override
    public Usuario readEntity(Cursor cursor, int offset) {
        Usuario entity = new Usuario( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // idusuario
                cursor.getLong(offset + 1), // idpersona
                cursor.getString(offset + 2), // nombres
                cursor.getString(offset + 3), // apellidos
                cursor.getString(offset + 4), // usuario
                cursor.getString(offset + 5), // clave
                cursor.getString(offset + 6), // nrodocumento
                cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0 // estado
        );
        return entity;
    }

    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Usuario entity, int offset) {
        entity.setIdusuario(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setIdpersona(cursor.getLong(offset + 1));
        entity.setNombres(cursor.getString(offset + 2));
        entity.setApellidos(cursor.getString(offset + 3));
        entity.setUsuario(cursor.getString(offset + 4));
        entity.setClave(cursor.getString(offset + 5));
        entity.setNrodocumento(cursor.getString(offset + 6));
        entity.setEstado(cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0);
    }

    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Usuario entity, long rowId) {
        entity.setIdusuario(rowId);
        return rowId;
    }

    /** @inheritdoc */
    @Override
    public Long getKey(Usuario entity) {
        if(entity != null) {
            return entity.getIdusuario();
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
