package com.gtm.guessTheMovie.dao;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

@Component
public class MovieDao {
    @Value("${OMDB.apiKey}")
    private String key;

    public String getMovieByTconst(String tconst){
        URL url = null;
        try {
            url = new URL("https://www.omdbapi.com/?i="+tconst+"&apikey=" + key);
            HttpsURLConnection conect = (HttpsURLConnection)url.openConnection();
            conect.setRequestMethod("GET");
            conect.connect();
            int cod = conect.getResponseCode();
            if (cod != 200) {
                throw new RuntimeException("Error en la conexion");

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
