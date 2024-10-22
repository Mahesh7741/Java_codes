import java.util.*;
public class AntonandPolyhedrons{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Map<String,Integer> mp=new HashMap<>();
		mp.put("Tetrahedron",4);
		mp.put("Cube",6);
		mp.put("Octahedron",8);
		mp.put("Dodecahedron",12);
		mp.put("Icosahedron",20);
		long n=sc.nextLong();
		long sum=0;
		sc.nextLine();
		for(long i=0;i<n;i++){
			String s=sc.nextLine();
			sum +=mp.get(s);
		}
		System.out.println(sum);
		sc.close();
	}
}