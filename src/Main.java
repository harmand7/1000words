import java.util.*;

// http://berb.github.io/diploma-thesis/original/054_actors.html
// Given a list of m words, I’d like to query for the nth most frequent word(s). (e.g. Given 1000 words, tell me
// the 5th most frequent word(s), or the 10th most frequent word(s) etc). Would like to query multiple times for
// different n’s. Solution should be optimized for querying.
public class Main {

	static int max = 1;
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String a = "The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors The concurrency models we have considered so far have the notion of shared state in common. Shared state can be accessed by multiple threads at the same time and must thus be protected, either by locking or by using transactions. Both, mutability and sharing of state are not just inherent for these models, they are also inherent for the complexities. We now have a look at an entirely different approach that bans the notion of shared state altogether. State is still mutable, however it is exclusively coupled to single entities that are allowed to alter it, so-called actors ";
        freqByArrayList(1, sentenceToArray(a));
        sentenceToArray(a);
    }

    private static void freqByArrayList(int freq, String[] sen) {
    	if (freq <= 0){
		    System.out.println("Requested frequent number not in bounds");
		    return;
	    }
	    Map<String, Integer> count = allWordFreq(sen);
	    ArrayList<ArrayList<String>> transposed = transpose(count);
	    if (freq > transposed.size()) {
		    System.out.println("Requested frequent number not in bounds");
	    }else {
	    	ArrayList<String> print = transposed.get(freq - 1);
		    System.out.printf("Words %s is/are the %dth word in terms of frequency.\n", print, freq);
	    }
    }

	private static ArrayList<ArrayList<String>> transpose(Map<String, Integer> count) {
		ArrayList<ArrayList<String>> t = new ArrayList<ArrayList<String>>(max);
		for (int i = 0; i < max; i++) {
			t.add(i, null);
		}
		for (Map.Entry<String, Integer> a : count.entrySet()) {
			int index = a.getValue();
			String value = a.getKey();
			if (t.get(index) == null) {
				ArrayList<String> newArray = new ArrayList<>();
				newArray.add(value);
				t.add(index, newArray);
			} else {
				ArrayList<String> current = t.get(index);
				current.add(value);
				t.set(a.getValue(), current);
			}
		}
		return reverse(t);
	}

	private static ArrayList<ArrayList<String>> reverse(ArrayList<ArrayList<String>> t) {
		int reverse = t.size() -1;
		int i = 0;
		ArrayList<ArrayList<String>> temp= new ArrayList<>();
		while (reverse >=0 ){
			if (t.get(reverse) != null) {
				temp.add(i++, t.get(reverse));
			}
			reverse--;
		}
		return temp;
	}

	private static Map<String, Integer> allWordFreq(String[] sen) {
        Map<String, Integer> count = new HashMap<>();
        for (int i = 0; i < sen.length; i++) {
            if (count.containsKey(sen[i])){
                count.replace(sen[i], count.get(sen[i]) + 1);
                if (count.get(sen[i]) > max){
                	max = count.get(sen[i]);
                }
            }else{
                count.put(sen[i], 1);
            }
        }
        return count;
    }

    public static String[] sentenceToArray(String a){
        String[] ret = a.split(" ");
        return ret;
    }


}