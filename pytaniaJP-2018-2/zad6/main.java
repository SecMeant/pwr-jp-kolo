class main{
	public static void main(String[] args){
		int i=1;
		byte j=127;
		i =+ j++;
		System.out.println(i + " " + j);
	}
}

/*
a) Jego kompilacja nie powiedzie się 
b) Po jego kompilacji i wykonaniu na ekranie pojawi się: 128 - 128
c) Po jego k ompilacji i wykonaniu na ekranie pojawi się : 127 - 128
d) Po jego kompilacji i wykonaniu na ekranie pojawi się: 2 2
*/
