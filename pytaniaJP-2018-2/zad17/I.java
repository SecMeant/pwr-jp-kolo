import java.io.Serializable;

public interface I extends Serializable{
}

/*
a) Jego kompilacja zakończy się błędem w linii 1
b) Jego kompilacja zakończy się błędem w linii 2
c) Jego kompilacja powiedzie się, jednak uruchomienia metody main zakończy się wyrzuceniem wyjątku java.io.N otSerializableException
d) Jego kompil acja i uruchomienie metody main powiedzie się
*/
