package RestAPI;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.Certificate;

public class consumeRestAPI {

    public static void main(String[] args) {
        try {
           // SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            URL url = new URL("https://jsonmock.hackerrank.com/api/football_matches?year=2011&team1=Barcelona&page=1");//your url i.e fetch data from .

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
           // conn.setSSLSocketFactory(sslsocketfactory);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
           // print_https_cert(conn);
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : "
                        + conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String output;
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            conn.disconnect();

        } catch (Exception e) {
            System.out.println("Exception in NetClientGet:- " + e);
        }
    }

    private static void print_https_cert(HttpsURLConnection con){

        if(con!=null){

            try {

                System.out.println("Response Code : " + con.getResponseCode());
                System.out.println("Cipher Suite : " + con.getCipherSuite());
                System.out.println("\n");

                Certificate[] certs = con.getServerCertificates();
                for(Certificate cert : certs){
                    System.out.println("Cert Type : " + cert.getType());
                    System.out.println("Cert Hash Code : " + cert.hashCode());
                    System.out.println("Cert Public Key Algorithm : "
                            + cert.getPublicKey().getAlgorithm());
                    System.out.println("Cert Public Key Format : "
                            + cert.getPublicKey().getFormat());
                    System.out.println("\n");
                }

            } catch (SSLPeerUnverifiedException e) {
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            }

        }

    }

    private static void print_content(HttpsURLConnection con){
        if(con!=null){

            try {

                System.out.println("****** Content of the URL ********");
                BufferedReader br =
                        new BufferedReader(
                                new InputStreamReader(con.getInputStream()));

                String input;

                while ((input = br.readLine()) != null){
                    System.out.println(input);
                }
                br.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
