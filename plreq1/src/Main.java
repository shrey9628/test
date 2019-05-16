import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
	public static void main(String []args) throws IOException, NumberFormatException, ParseException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter song 1 detail:");
		String split = reader.readLine();
		String[] str1 = split.split(",");
		
	SimpleDateFormat sdf  = new SimpleDateFormat("dd-MM-yyyy");
	Date d1 = sdf.parse(str1[5]);
	
		
		
		System.out.println("Enter song 2 detail:");
		split = reader.readLine();
		String[] str2 = split.split(",");
		Date d2 = sdf.parse(str2[5]);
		Song song1 = new Song(str1[0],str1[1],str1[2],Double.parseDouble(str1[3]),Integer.parseInt(str1[4]),d1);
		Song song2 = new Song(str2[0],str2[1],str2[2],Double.parseDouble(str2[3]),Integer.parseInt(str2[4]),d2);
		
		System.out.println();
		System.out.println("Song 1:");
		System.out.println(song1);
		System.out.println();
		System.out.println("Song 2:");
		System.out.println(song2);
		
		if(song1.equals(song2))
		{
			System.out.println();
			System.out.println("Song 1 is same as Song 2");
		}else
			System.out.println("\nSong 1 and Song 2 are different");
		
		
		
	}
}
