import java.util.*;

public class TextJustification{
	public static void main(String[] args){
		String[] words = {"An", "example", "of", "some", "text", "justification"};
		int L = 16;
		TextJustification tj = new TextJustification();

		System.out.println(tj.justify(words, L));
	}

	public List<String> justify(String[] words, int maxWidth){
		List<String> lines = new ArrayList<String>();
		int index = 0;

		while(index < words.length){
			int count = words[index].length();
			int last = index + 1;
			while(last < words.length){
				if(words[last].length() + count + 1 > maxWidth){
					break;
				}
				count += 1 + words[last].length();
				last++;
			}

			StringBuilder sb = new StringBuilder();
			sb.append(words[index]);
			int numSpaces = last - index - 1;

			if(last == words.length || numSpaces == 0){
				for(int i = index+1; i < last; i++){
					sb.append(" ");
					sb.append(words[i]);
				}
				for(int i = sb.length(); i < maxWidth; i++){
					sb.append(" ");
				}
			}
			else{
				int spaces = (maxWidth - count) / numSpaces;
				int r = (maxWidth - count) % numSpaces;
				for(int i = index + 1; i < last; i++){
					for(int k = spaces; k > 0; k--){
						sb.append(" ");
					}
					if(r > 0){
						sb.append(" ");
						r--;
					}
					sb.append(" ");
					sb.append(words[i]);
				}
			}

			lines.add(sb.toString());
			index = last;
		}

		return lines;
	}
}