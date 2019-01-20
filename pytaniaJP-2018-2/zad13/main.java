public class main{
	public static void main(String[] args){
		Integer i;
		int j;
		i = j = 0; // 1
		do{
			while(i<3){
				i++;
				j += i;
			}
		}while( j>6 ? false : true); // 2
	}
}


/*
a) Jego kompilacja zakończy się błędem w lin ii 1
b) Jego kompilacja zakończy się błędem w linii 2
c) Jego kompilacja i uruchomienie przebiegnie poprawnie, jednak wykonywanie pętli nigdy się nie zakończy
d) Jego kompilacja i uruchomienie przebiegnie poprawnie, pętla zakończy się
 * /
