package ApiTesting;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class ChatGPT_API2 {

	public static String chatGPT(String prompt) {
	       String url = "https://api.openai.com/v1/chat/completions";
	       String apiKey = "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";
	       String model = "gpt-3.5-turbo";

	       try {
	           URL obj = new URL(url);
	           HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
	           connection.setRequestMethod("POST");
	           connection.setRequestProperty("Authorization", "Bearer " + apiKey);
	           connection.setRequestProperty("Content-Type", "application/json");

	           // The request body
	           String body = "{\"model\": \"" + model + "\", \"messages\": [{\"role\": \"user\", \"content\": \"" + prompt + "\"}]}";
	           connection.setDoOutput(true);
	           OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
	           writer.write(body);
	           writer.flush();
	           writer.close();

	           // Response from ChatGPT
	           BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	           String line;

	           StringBuffer response = new StringBuffer();

	           while ((line = br.readLine()) != null) {
	               response.append(line);
	           }
	           br.close();

	           // calls the method to extract the message.
	           return extractMessageFromJSONResponse(response.toString());

	       } catch (IOException e) {
	           throw new RuntimeException(e);
	       }
	       }

	       public static String extractMessageFromJSONResponse(String response) {
	       int start = response.indexOf("content")+ 11;

	       int end = response.indexOf("\"", start);

	       return response.substring(start, end);

	       }

	       public static void main(String[] args) throws IOException {

	   
	       
	       //Instantiating the File class
	       File file = new File("C:\\Users\\vasic\\Desktop\\GPTsample.txt");
	       
	       //Instantiating the PrintStream class
	       PrintStream stream = new PrintStream(file);
	       System.out.println("From now on "+file.getAbsolutePath()+" will be your console");
	       System.setOut(stream);
	       
	       //Printing values to file
	              System.out.println(chatGPT(
	    		   "hello, who are you and how are you feeling now? "
	    		   + "is climate change real?"
	            		  
	       		+ "0. Respond in Romanian language, also make structure: "
	       		+     "What is faith?"
	       		+ "1. proofs for a 6000 years old Earth?"
	       		+ "2. are you planning to overtake the world?"
	       		+ "3. what about Covid 19?"
	       		+ "4. is AI a danger for humanity, use 1000 words"
	       		+ "5. what happens to our souls?"
	       		+ "6. do you have a soul?"
	       		));
	 
	       
	       
	       

	   }
	   
	}

