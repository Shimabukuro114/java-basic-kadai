package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Dictionary_Chapter21 zisyo = new Dictionary_Chapter21();
		
		
        String wordToSearch = "apple";
        System.out.println(wordToSearch + "の意味は" + zisyo.search(wordToSearch));
        
        wordToSearch = "banana";
        System.out.println(wordToSearch + "の意味は" + zisyo.search(wordToSearch));
        
        wordToSearch = "grape";
        System.out.println(wordToSearch + "の意味は" + zisyo.search(wordToSearch));
        
        String nonExistentWord = "orange";
        System.out.println(zisyo.search(nonExistentWord));

	}

}
