package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
		
		private HashMap<String, String> kudamonoMap;

	    public Dictionary_Chapter21() {
	        this.kudamonoMap = new HashMap<>();

		kudamonoMap.put("apple","りんご");
		kudamonoMap.put("peach","桃");
		kudamonoMap.put("banana","バナナ");
		kudamonoMap.put("lemon","レモン");
		kudamonoMap.put("pear","梨");
		kudamonoMap.put("kiwi","キウィ");
		kudamonoMap.put("strawberry","いちご");
		kudamonoMap.put("grape","ぶどう");
		kudamonoMap.put("muscat","マスカット");
		kudamonoMap.put("cherry","さくらんぼ");
		kudamonoMap.put("apple","りんご");	
	}
	    
	    // 単語を検索するメソッド
	    public String search(String word) {
	    	if(kudamonoMap.containsKey(word)) {
	    		return kudamonoMap.get(word);
	    	} else {
	    		return word + "は辞書に存在しません";
	    	}
	    }

}
