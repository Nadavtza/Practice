package practice;

public class TrieNode {
		static final int ALPHABET_SIZE = 256;
		private boolean isEndOfWord ;
		private TrieNode[] children ;
		private int length ; 
		private int counter ;
		
		public TrieNode(int length){
			isEndOfWord = false;
			this.length = length;
			counter = 1 ;
			children = new TrieNode[ALPHABET_SIZE];
			for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
		}
		
	
		
		public TrieNode[] getChildren() {
			return children;
		}

		public void setChildren(TrieNode[] children) {
			this.children = children;
		}

		public boolean isEndOfWord() {
			return isEndOfWord;
		}

		public void setEndOfWord(boolean isEndOfWord) {
			this.isEndOfWord = isEndOfWord;
		}

		public int getLength() {
			return length;
		}


		public int getCounter() {
			return counter;
		}

		public void setCounter() {
			counter++;
		}

		public static int getAlphabetSize() {
			return ALPHABET_SIZE;
		}

		
		
	
}
