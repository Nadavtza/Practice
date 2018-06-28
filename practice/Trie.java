package practice;

public class Trie {
	static final int ALPHABET_SIZE = 256;
	private TrieNode root;
	
	public Trie(){
		root = new TrieNode(0);
	}
	
	public void insert(String str) {
		TrieNode node = root ; 
		int insChar;
		for(int i = 0 ; i< str.length() ; i++) {
			insChar = (int)str.charAt(i) ; 
			if(node.getChildren()[insChar] == null) {
				node.getChildren()[insChar] = new TrieNode(node.getLength()+1);
				node = node.getChildren()[insChar] ;
			}
			else {
				node = node.getChildren()[insChar] ; 
				node.setCounter();
			}
		}
		node.setEndOfWord(true);
		
		
	}
	public int findPrefix(String str) {
		TrieNode node = root ; 
		int insChar;
		for(int i = 0 ; i< str.length() ; i++) {
			insChar = (int)str.charAt(i) ; 
			if(node.getChildren()[insChar] == null) {
				System.out.println("Word not found!");
				return 0;
			}
			else {
				node = node.getChildren()[insChar] ; 
			}
		}
		System.out.println("Prefix "+ str+ "  in " + node.getCounter() + " words");
		System.out.println("Prefix length " + node.getLength() );
		return node.getCounter();
		
		
	}
	
	public static void main(String[] args) {
		String str = "aa";
		Trie dictionary = new Trie();
		dictionary.insert("aaaa1");
		dictionary.insert("ab");
		dictionary.insert("aa");
		dictionary.insert("ba");
		dictionary.findPrefix(str);
		//System.out.println((int)str.charAt(0));
	}

}
