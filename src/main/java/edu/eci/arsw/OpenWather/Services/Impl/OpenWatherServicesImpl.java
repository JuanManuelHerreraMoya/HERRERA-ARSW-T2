package edu.eci.arsw.OpenWather.Services.Impl;
import edu.eci.arsw.OpenWather.Services.OpenWatherServices;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.springframework.stereotype.Service;


@Service("OpenWatherServicesImpl")
public class OpenWatherServicesImpl implements OpenWatherServices {


    @Override
    public String getByCityName(String City) throws IOException {
        String USER_AGENT = "Mozilla/5.0";
        String GET_URL = "http://api.openweathermap.org/data/2.5/weather?q="+City+"&appid=e4ff1d6ab1134644fe0959aa022a222f";
        URL obj = new URL(GET_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);

        //The following invocation perform the connection implicitly before getting the code
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {

                response.append(inputLine);
            }
            in.close();

            return response.toString();
        } else {

            return "GET request not worked";
        }

    }
}



