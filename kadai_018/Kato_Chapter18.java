package kadai_018;

abstract public class Kato_Chapter18 {

	public String familiyName = "加藤" ; // 姓を表す
	public String givenName =""; // 名を表す
	public String address = "住所は東京都中野区〇×です"; // 住所を表す
	
	public void commonIntroduce() {
		System.out.println("名前は" + familiyName + givenName + "です");
		System.out.println(address);
	}
	
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
