import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JSoupEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String html = "<html>"
				+"<head><title>First parse</title></head>"
				 + "<body>"
				 + "<a href='https://www.daum.net'><img class='c1' src='./daum.jpg'><div id='i1'>다음바로가기</div></a>"
				 + "<a href='https://www.naver.com'><img class='c1' src='./naver.jpg'><div id='i2'>네이버바로가기</div></a>"
				 + "<a href='https://www.google.com'><img class='c1' src='./google.jpg'><div id='i3'>구글바로가기</div></a>"
				 + "</body>"
				 + "</html>";
				
		Document doc = Jsoup.parse(html);
		
		Elements divTags = doc.select("#i1");
		System.out.println(divTags.text() );  // 다음바로가기
		
		Elements imgTags = doc.select("img.c1");
		System.out.println( imgTags );    // <img class="c1" src="./daum.jpg">
		for( Element e : imgTags ) {
			System.out.println( e.attr("src") );   //  ./daum.jpg
		}
		
		Elements imgTags2 = doc.select( "img[src$=jpg]");
		System.out.println( imgTags );
	}

}



