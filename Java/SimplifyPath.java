import java.util.*;

public class SimplifyPath{
	public static void main(String[] args){
		SimplifyPath sp = new SimplifyPath();
		String path = "/a/./b/../../c/";

		System.out.println(path);
		System.out.println(sp.simplify(path));
	}

	public String simplify(String path){
		Deque<String> stack = new LinkedList<>();
		StringBuilder sb = new StringBuilder("/");

		for(String s : path.split("/")){
			if(s.equals("..")){
				if(!stack.isEmpty()){
					stack.pop();
				}
			}
			else if(!s.equals("") && !s.equals(".")){
				stack.push(s);
			}
		}

		for(String s: stack){
			sb.append(s + "/");
		}

		if(!stack.isEmpty()){
			sb.setLength(sb.length() - 1);
		}

		return sb.toString();
	}
}