package seedu.addressbook.data.person;

public class Block {
	private String blockNumber;
	
	public Block(String blockNumber){
		this.blockNumber = blockNumber;
	}
	
	public String getBlockNumber(){
		return this.blockNumber;
	}
	
	public void setBlockNumber(String blockNumber){
		this.blockNumber = blockNumber;
	}
	
	public String toString(){
		return this.blockNumber;
	}
}
