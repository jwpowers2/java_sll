public class SllTest {

	public static void main(String[] args){
      Node startNode = new Node(1);

      Sll newSll = new Sll(startNode);
      newSll.add(1);
      newSll.add(7);
      newSll.add(8);
      newSll.add(78);
      newSll.printValues();
      newSll.removeLast();
      newSll.printValues();
	}

}