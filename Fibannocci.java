
public class Fibannocci {
	public static void main(String[] args) {
		int i=0;int j=1;int k;
		System.err.println(j);
		for(int q=0;q<10;q++) {
			k=i+j;
			System.err.println(k);
			i=j;
			j=k;
		}
	}

}
