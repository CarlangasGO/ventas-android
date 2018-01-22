package tpoffline.dbentidades;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import empresa.dao.DaoMaster;
import empresa.dao.DaoSession;
import empresa.dao.EmpresaUsuario;
import empresa.dao.EmpresaUsuarioDao;
import tpoffline.Config;
import tpoffline.MLog;
import tpoffline.utils.ActualizadorAsincrono;

/**
 * Created by Cesar on 7/3/2017.
 */

public class EntidadEmpresaUsuario implements EntidadSincronizable {

    static final String SELECT_SOURCE = "select * from empresa_usuario";

    private boolean dropAndDeleteTable = true;

    public void sincronizar(Context context, int globalPartNumber, String entidad, ActualizadorAsincrono
            proceso , Connection con) throws SincronizacionException {

        MLog.d("INICIAR: Sincronizar datos V2  de: " + SELECT_SOURCE);

        SQLiteOpenHelper helper = new DaoMaster.DevOpenHelper(context,
                Config.SQLITE_DB_NAME, null);

        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        DaoSession daoSession = daoMaster.newSession();
        EmpresaUsuarioDao dao = daoSession.getEmpresaUsuarioDao();

        int totalRegistros = 0;
        int totalRegistrosNuevos = 0;
        int totalRegistrosActualizados = 0;

        dropAndDeleteTable(db);

        try {
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(SELECT_SOURCE);

            while (rs.next()) {
                totalRegistros++;

                proceso.reportarProgresoSubproceso(globalPartNumber, totalRegistros, entidad);

                EmpresaUsuario regNuevo = new EmpresaUsuario(null, rs.getLong("idusuario"), rs.getLong("idempresa"));

                long idNuevoInsertado = dao.insert(regNuevo);
                totalRegistrosNuevos++;

            }
            db.close();
        } catch (Exception e) {

            e.printStackTrace();
            throw new SincronizacionException("Error al actualizar " + this.getClass().getSimpleName() , e);
        }


    }

    private void dropAndDeleteTable(SQLiteDatabase db) {
        if(dropAndDeleteTable ) {
            EmpresaUsuarioDao.dropTable(db, true);
            EmpresaUsuarioDao.createTable(db, true);
        }


    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Entidad de Datos: " +  this.getClass().getSimpleName();
    }

}