package com.gtm.guessTheMovie.dao;



import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;


public class MovieDao {
    public String getMovieByTconst(String tconst){
        URL url = null;
        try {
            url = new URL("https://www.omdbapi.com/?i="+tconst+"&apikey=");
            HttpsURLConnection conect = (HttpsURLConnection)url.openConnection();
            conect.setRequestMethod("GET");
            conect.connect();
            int cod = conect.getResponseCode();
            if (cod != 200) {
                throw new RuntimeException("Error en la conexion: " + "https://www.omdbapi.com/?i="+tconst+"&apikey=" );

            } else {
                StringBuilder dataString = new StringBuilder();
                Scanner sc = new Scanner(url.openStream());

                while(sc.hasNext()) {
                    dataString.append(sc.nextLine());
                }
                return dataString.toString();
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
