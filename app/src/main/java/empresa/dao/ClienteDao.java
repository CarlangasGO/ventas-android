package empresa.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import empresa.dao.Cliente;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CLIENTE".
*/
public class ClienteDao extends AbstractDao<Cliente, Long> {

    public static final String TABLENAME = "CLIENTE";

    /**
     * Properties of entity Cliente.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Idcliente = new Property(0, Long.class, "idcliente", true, "IDCLIENTE");
        public final static Property Idpersona = new Property(1, long.class, "idpersona", false, "IDPERSONA");
        public final static Property Nombres = new Property(2, String.class, "nombres", false, "NOMBRES");
        public final static Property Apellidos = new Property(3, String.class, "apellidos", false, "APELLIDOS");
        public final static Property Direccion = new Property(4, String.class, "direccion", false, "DIRECCION");
        public final static Property Telefono = new Property(5, String.class, "telefono", false, "TELEFONO");
        public final static Property Nrodocumento = new Property(6, String.class, "nrodocumento", false, "NRODOCUMENTO");
        public final static Property Localidad = new Property(7, String.class, "localidad", false, "LOCALIDAD");
        public final static Property Codtipodocumento = new Property(8, String.class, "codtipodocumento", false, "CODTIPODOCUMENTO");
        public final static Property Movil = new Property(9, String.class, "movil", false, "MOVIL");
        public final static Property Tipocliente = new Property(10, String.class, "tipocliente", false, "TIPOCLIENTE");
        public final static Property Nombrefantasia = new Property(11, String.class, "nombrefantasia", false, "NOMBREFANTASIA");
        public final static Property Contacto = new Property(12, String.class, "contacto", false, "CONTACTO");
        public final static Property Zona = new Property(13, String.class, "zona", false, "ZONA");
        public final static Property Lineacredito = new Property(14, Double.class, "lineacredito", false, "LINEACREDITO");
        public final static Property Email = new Property(15, String.class, "email", false, "EMAIL");
        public final static Property Barrio = new Property(16, String.class, "barrio", false, "BARRIO");
        public final static Property Rubro = new Property(17, String.class, "rubro", false, "RUBRO");
        public final static Property Departamento = new Property(18, String.class, "departamento", false, "DEPARTAMENTO");
        public final static Property Observacion = new Property(19, String.class, "observacion", false, "OBSERVACION");
        public final static Property Idtipocliente = new Property(20, long.class, "idtipocliente", false, "IDTIPOCLIENTE");
        public final static Property Estado = new Property(21, Boolean.class, "estado", false, "ESTADO");
    };


    public ClienteDao(DaoConfig config) {
        super(config);
    }

    public ClienteDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'CLIENTE' (" + //
                "'IDCLIENTE' INTEGER PRIMARY KEY ," + // 0: idcliente
                "'IDPERSONA' INTEGER NOT NULL ," + // 1: idpersona
                "'NOMBRES' TEXT NOT NULL ," + // 2: nombres
                "'APELLIDOS' TEXT NOT NULL ," + // 3: apellidos
                "'DIRECCION' TEXT," + // 4: direccion
                "'TELEFONO' TEXT," + // 5: telefono
                "'NRODOCUMENTO' TEXT," + // 6: nrodocumento
                "'LOCALIDAD' TEXT," + // 7: localidad
                "'CODTIPODOCUMENTO' TEXT," + // 8: codtipodocumento
                "'MOVIL' TEXT," + // 9: movil
                "'TIPOCLIENTE' TEXT," + // 10: tipocliente
                "'NOMBREFANTASIA' TEXT," + // 11: nombrefantasia
                "'CONTACTO' TEXT," + // 12: contacto
                "'ZONA' TEXT," + // 13: zona
                "'LINEACREDITO' REAL," + // 14: lineacredito
                "'EMAIL' TEXT," + // 15: email
                "'BARRIO' TEXT," + // 16: barrio
                "'RUBRO' TEXT," + // 17: rubro
                "'DEPARTAMENTO' TEXT," + // 18: departamento
                "'OBSERVACION' TEXT," + // 19: observacion
                "'IDTIPOCLIENTE' INTEGER NOT NULL ," + // 20: idtipocliente
                "'ESTADO' INTEGER);"); // 21: estado
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'CLIENTE'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Cliente entity) {
        stmt.clearBindings();

        Long idcliente = entity.getIdcliente();
        if (idcliente != null) {
            stmt.bindLong(1, idcliente);
        }
        stmt.bindLong(2, entity.getIdpersona());
        stmt.bindString(3, entity.getNombres());
        stmt.bindString(4, entity.getApellidos());

        String direccion = entity.getDireccion();
        if (direccion != null) {
            stmt.bindString(5, direccion);
        }

        String telefono = entity.getTelefono();
        if (telefono != null) {
            stmt.bindString(6, telefono);
        }

        String nrodocumento = entity.getNrodocumento();
        if (nrodocumento != null) {
            stmt.bindString(7, nrodocumento);
        }

        String localidad = entity.getLocalidad();
        if (localidad != null) {
            stmt.bindString(8, localidad);
        }

        String codtipodocumento = entity.getCodtipodocumento();
        if (codtipodocumento != null) {
            stmt.bindString(9, codtipodocumento);
        }

        String movil = entity.getMovil();
        if (movil != null) {
            stmt.bindString(10, movil);
        }

        String tipocliente = entity.getTipocliente();
        if (tipocliente != null) {
            stmt.bindString(11, tipocliente);
        }

        String nombrefantasia = entity.getNombrefantasia();
        if (nombrefantasia != null) {
            stmt.bindString(12, nombrefantasia);
        }

        String contacto = entity.getContacto();
        if (contacto != null) {
            stmt.bindString(13, contacto);
        }

        String zona = entity.getZona();
        if (zona != null) {
            stmt.bindString(14, zona);
        }

        Double lineacredito = entity.getLineacredito();
        if (lineacredito != null) {
            stmt.bindDouble(15, lineacredito);
        }

        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(16, email);
        }

        String barrio = entity.getBarrio();
        if (barrio != null) {
            stmt.bindString(17, barrio);
        }

        String rubro = entity.getRubro();
        if (rubro != null) {
            stmt.bindString(18, rubro);
        }

        String departamento = entity.getDepartamento();
        if (departamento != null) {
            stmt.bindString(19, departamento);
        }

        String observacion = entity.getObservacion();
        if (observacion != null) {
            stmt.bindString(20, observacion);
        }
        stmt.bindLong(21, entity.getIdtipocliente());

        Boolean estado = entity.getEstado();
        if (estado != null) {
            stmt.bindLong(22, estado ? 1l: 0l);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    /** @inheritdoc */
    @Override
    public Cliente readEntity(Cursor cursor, int offset) {
        Cliente entity = new Cliente( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // idcliente
                cursor.getLong(offset + 1), // idpersona
                cursor.getString(offset + 2), // nombres
                cursor.getString(offset + 3), // apellidos
                cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // direccion
                cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // telefono
                cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // nrodocumento
                cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // localidad
                cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // codtipodocumento
                cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // movil
                cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // tipocliente
                cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // nombrefantasia
                cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // contacto
                cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // zona
                cursor.isNull(offset + 14) ? null : cursor.getDouble(offset + 14), // lineacredito
                cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // email
                cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // barrio
                cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // rubro
                cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // departamento
                cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // observacion
                cursor.getLong(offset + 20), // idtipocliente
                cursor.isNull(offset + 21) ? null : cursor.getShort(offset + 21) != 0 // estado
        );
        return entity;
    }

    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Cliente entity, int offset) {
        entity.setIdcliente(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setIdpersona(cursor.getLong(offset + 1));
        entity.setNombres(cursor.getString(offset + 2));
        entity.setApellidos(cursor.getString(offset + 3));
        entity.setDireccion(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTelefono(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setNrodocumento(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setLocalidad(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setCodtipodocumento(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setMovil(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setTipocliente(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setNombrefantasia(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setContacto(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setZona(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setLineacredito(cursor.isNull(offset + 14) ? null : cursor.getDouble(offset + 14));
        entity.setEmail(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setBarrio(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setRubro(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setDepartamento(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setObservacion(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setIdtipocliente(cursor.getLong(offset + 20));
        entity.setEstado(cursor.isNull(offset + 21) ? null : cursor.getShort(offset + 21) != 0);
    }

    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Cliente entity, long rowId) {
        entity.setIdcliente(rowId);
        return rowId;
    }

    /** @inheritdoc */
    @Override
    public Long getKey(Cliente entity) {
        if(entity != null) {
            return entity.getIdcliente();
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
