/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.net.Socket;

/**
 *
 * @author willi
 */
public class Cliente {
    private static String nomeCliente;
    private static String hortServidor;
    private static int portaServidor;
    private static Socket socket;

    public static String getNomeCliente() {
        return nomeCliente;
    }

    public static void setNomeCliente(String nomeCliente) {
        Cliente.nomeCliente = nomeCliente;
    }

    public static String getHortServidor() {
        return hortServidor;
    }

    public static void setHortServidor(String hortServidor) {
        Cliente.hortServidor = hortServidor;
    }

    public static int getPortaServidor() {
        return portaServidor;
    }

    public static void setPortaServidor(int portaServidor) {
        Cliente.portaServidor = portaServidor;
    }

    public static Socket getSocket() {
        return socket;
    }

    public static void setSocket(Socket socket) {
        Cliente.socket = socket;
    }
}
