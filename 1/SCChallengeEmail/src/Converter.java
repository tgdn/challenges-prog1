import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


public class Converter {

	private String base_uri = "http://www.ecs.soton.ac.uk/people/";
	private String username;
	private URL url;
	private Object content;
	
	public Converter (String u) throws IOException {
		
		username = u;
		url = new URL(base_uri.concat(username));
		content = url.getContent();
		
	}
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		Scanner user_input = new Scanner(System.in);
		String username;
		
		System.out.print("Enter a Southampton ECS username: ");
		username = user_input.next();
		
		Converter converter = new Converter(username);
	}

}
