package br.com.munieri.ponto.web.boot;

import br.com.munieri.ponto.web.boot.server.ApplicationServer;
import br.com.munieri.ponto.web.boot.server.WebServer;

public class Main {

    public static void main(String[] args) throws Exception {
        WebServer server = new ApplicationServer();
        server.start();
    }
}
