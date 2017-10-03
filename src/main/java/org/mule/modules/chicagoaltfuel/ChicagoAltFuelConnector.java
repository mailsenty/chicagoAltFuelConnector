package org.mule.modules.chicagoaltfuel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import org.mule.modules.chicagoaltfuel.config.ConnectorConfig;

@Connector(name="chicago-alt-fuel", friendlyName="ChicagoAltFuel")
public class ChicagoAltFuelConnector {

	@Config
    ConnectorConfig config;

    private final String BASEURI = "https://data.cityofchicago.org/resource/jaif-n74j.json?";

	
	private  URL url;


	HttpURLConnection con ;
	 

    @Processor
    public String findOnLong(String longitude) {
        String response;
    	try {
    		url  = new URL(BASEURI+"longitude="+longitude);
			response=processConnection(url);
		} catch (MalformedURLException e) {
			response="Error connecting to endpoint Please retry";
			e.printStackTrace();
		}
    	catch (Exception e) {
    		response="Error connecting to endpoint Please retry" ;  				
			e.printStackTrace();
		}
    	return response;
  
    }
   
    @Processor
    public String findOnLattitude(String latitude) {
        String response;
    	try {
    		url  = new URL(BASEURI+"latitude="+latitude);
			response=processConnection(url);
		} catch (MalformedURLException e) {
			response="Error connecting to endpoint Please retry";
			e.printStackTrace();
		}
    	catch (Exception e) {
    		response="Error connecting to endpoint Please retry" ;  				
			e.printStackTrace();
		}
    	return response;
  
    }
    
    
    @Processor
    public String findOnZip(String zip) {
        String response;
    	try {
    		url  = new URL(BASEURI+"zip="+zip);
			response=processConnection(url);
		} catch (MalformedURLException e) {
			response="Error connecting to endpoint Please retry";
			e.printStackTrace();
		}
    	catch (Exception e) {
    		response="Error connecting to endpoint Please retry" ;  				
			e.printStackTrace();
		}
    	return response;
  
    }
    
    @Processor
    public String findOnFuelType(String fuel_type_code) {
        String response;
    	try {
    		url  = new URL(BASEURI+"fuel_type_code="+fuel_type_code);
			response=processConnection(url);
		} catch (MalformedURLException e) {
			response="Error connecting to endpoint Please retry";
			e.printStackTrace();
		}
    	catch (Exception e) {
    		response="Error connecting to endpoint Please retry" ;  				
			e.printStackTrace();
		}
    	return response;
  
    }
   

    
    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }
    
    private String processConnection(URL url){
    	
    	StringBuffer response = new StringBuffer();
    	
    	try {
			con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");

			// add request header
			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
		}  catch (Exception e) {
			response=new StringBuffer("Error getting Yoda Speak");
			e.printStackTrace();
		}

		// print result
		return response.toString();
    }

}