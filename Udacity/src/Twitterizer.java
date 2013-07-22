// return twitter message without vowel and reverse the message 6/26/13

public class Twitterizer {
	
	private String newPost;
	
	public String shorten(String longPost) {
		//String newPost = "";
		//int count = 0;
		for (int i = 0; i < longPost.length(); i++) {
			String letter = longPost.substring(i, i + 1);
			newPost = newPost + letter;
			if ("aeiouAEIOU".contains(letter)) {
				//System.out.println(letter);
				newPost = newPost.replace(letter, "");				
			}
		}		
		return newPost;
	}
	
	public String reverse(String post) {
		String rev = "";
		for (int i = post.length(); i > 0; i--) {
			rev = rev + post.substring(i -1, i);
		}
		return rev;
	}
	
	public static void main(String[] args) {
		
		String longPost = "How did I ever program without loops?!";
		Twitterizer twit = new Twitterizer();
		System.out.println(twit.shorten(longPost));
		System.out.println(twit.reverse(longPost));
	}

}
