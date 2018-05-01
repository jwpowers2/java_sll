public class Node {

  private Integer val;
  private Node next;

  public Node(Integer val){
    this.val = val;
    this.next = null;
  }

  public Integer getVal(){
    return this.val;
  }

  public void setVal(Integer val){
    this.val = val;
  }

  public Node getNext(){
    return this.next;
  }

  public boolean isNext(){

  	if(this.next != null){
  		return true;
  	} else {
  		return false;
  	}
  }

  public void setNext(Node next){
    this.next = next; 
  }

  public void setNext(){
    this.next = null; 
  }

}