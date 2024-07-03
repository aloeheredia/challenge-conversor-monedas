package com.alura.convertidorMonedas.conexion;

import com.alura.convertidorMonedas.modelos.Moneda;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionJson {


    public ConexionJson() {

    }

    public double obtenerValorFinal(String codigo_base, String codigo_target, double valorInicial) throws IOException, InterruptedException {
           HttpClient client = HttpClient.newHttpClient();
           HttpRequest request = HttpRequest.newBuilder()
                   .uri(URI.create("https://v6.exchangerate-api.com/v6/edd3d389281acbe966894401/pair/"+codigo_base+"/"+codigo_target+"/"+valorInicial))
                   .build();

           HttpResponse<String> response = client
                   .send(request, HttpResponse.BodyHandlers.ofString());

           String json = response.body();
           Gson gson = new Gson();
           Moneda mimoneda = gson.fromJson(json, Moneda.class);
           double valorFinal = mimoneda.getValorFinal();
        return valorFinal;

       }
   }


