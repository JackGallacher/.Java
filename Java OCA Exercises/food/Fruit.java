package food;
public abstract class Fruit{
	String fruitType;
	
	public Fruit(String type){
		this.fruitType = type;
	}	
	String getFruitType(){
		return this.fruitType;
	}		
	void setFruitType(String type){
		this.fruitType = type;
	}
}
