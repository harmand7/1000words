import java.util.HashMap;
import java.util.Map;

// http://berb.github.io/diploma-thesis/original/054_actors.html
// Given a list of m words, I’d like to query for the nth most frequent word(s). (e.g. Given 1000 words, tell me
// the 5th most frequent word(s), or the 10th most frequent word(s) etc). Would like to query multiple times for
// different n’s. Solution should be optimized for querying.
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String a = " The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors ";
        freq(1, sentenceToArray(a));
    }

    private static void freq(int freq, String[] sen) {
        System.out.println(allWordFreq(sen));
    }

    private static Map<String, Integer> allWordFreq(String[] sen) {
        Map<String, Integer> count = new HashMap<>();
        for (int i = 0; i < sen.length; i++) {
            if (count.containsKey(sen[i])){
                count.replace(sen[i], count.get(sen[i] + 1));
            }else{
                count.put(sen[i], 1);
            }
        }
        return count;
    }


    public static String[] sentenceToArray(String a){

        String[] ret = a.split(" ");
        System.out.println(ret);
        return ret;
    }


}
