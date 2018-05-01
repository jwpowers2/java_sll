public class Sll {

  private Node head;
  private Node tail;
  private int length;


  public Sll(Node node){
    this.head = null;
    this.tail = null;
    this.length = 0;
  }

  public void add(int val){
  
    Node newNode = new Node(val);

    if(this.head == null){
    	this.head = newNode;
    } else {
    	Node runner = this.head;
    	while(runner.isNext()){
    		runner = runner.getNext();

    	}
    	runner.setNext(newNode);
    	
    	this.tail = runner.getNext();
    }
    this.length++;

  }

  public void removeLast(){

  	if(this.head == null){
    	System.out.println("empty SLL");
    } else {
    	Node runner = this.head;
    	System.out.println(runner.getVal());
    	while(runner.isNext()) {
    		this.tail = runner;
    		runner = runner.getNext();
            
    	}
    	this.tail.setNext();
    }
    

  }

  public void printValues(){

  	if(this.head == null){
    	System.out.println("empty SLL");
    } else {
    	Node runner = this.head;
    	System.out.println(runner.getVal());
    	while(runner.isNext()){
    		
    		runner = runner.getNext();
            System.out.println(runner.getVal());
    	}
    	
    }
  }


  public void remove(){



  }

}