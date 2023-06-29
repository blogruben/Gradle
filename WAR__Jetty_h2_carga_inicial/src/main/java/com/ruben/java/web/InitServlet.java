package com.ruben.java.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="InitializeResources", urlPatterns="/cargaInicial", loadOnStartup=1)
public class InitServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.init();
    }

    @Override
    public void init()
    {
        crearEsquemas();
        cargarDatosIniciales();
    }

    private void crearEsquemas() {
        this.log("Inicio - crear esquemas");
        final String crearTabla = "CREATE TABLE IF NOT EXISTS user(id MEDIUMINT NOT NULL AUTO_INCREMENT ,nombre varchar(255))";
        try(Connection conn = PoolJDBC.getConnection();
        PreparedStatement pstmtCreate = conn.prepareStatement(crearTabla);) {
            pstmtCreate.execute();
        } catch (SQLException e) {
            this.log("Error "+e);
        }
        this.log("Fin - crear esquemas");
    }

    private void cargarDatosIniciales() {
        this.log("Inicio - carga de datos inicial");
        crearUsuario("Raul");
        crearUsuario("Roberto");
        crearUsuario("Maria");
        crearUsuario("Julio");
        this.log("Fin - carga de datos inicial");
    }

        private void crearUsuario(String user) {
        final String insertarUser = "INSERT INTO user(nombre) VALUES(?)";
        try(Connection conn = PoolJDBC.getConnection();
        PreparedStatement pstmtInsert = conn.prepareStatement(insertarUser);){
            pstmtInsert.setString(1, user);
            pstmtInsert.executeUpdate();
        } catch (SQLException e) {
            this.log("Error "+e);
        }
    }

}

