abstract class Persistance{
	abstract void persist();
}
class FilePersistance extends Persistance{
	public void persist(){
		System.out.println("Data persisted into file");
	}
}
class DatabasePersistance extends Persistance{
	public void persist(){
		System.out.println("Data persisted into database");
	}
}
class PersistanceFactory{
	public static Persistance getPersistance(){
		return new FilePersistance();
	}
	public static void main(String [] args){
		Persistance p=PersistanceFactory.getPersistance();
		p.persist();
	}
}

