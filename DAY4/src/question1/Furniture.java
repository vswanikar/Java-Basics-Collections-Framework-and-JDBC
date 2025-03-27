package question1;
import java.util.Scanner;

class Furniture {
	protected int modelNo;
	protected String modelName;
	protected String modelDescription;
	protected Material material;
	protected FurnitureType type;
	
	public Furniture() {
		
	}
	public Furniture(int modelNo,String modelName,String modelDescription,Material material,FurnitureType type) {
		this.modelNo=modelNo;
		this.modelName=modelName;
		this.modelDescription=modelDescription;
		this.material=material;
		this.type=type;
		
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getModelDescription() {
		return modelDescription;
	}
	public void setModelDescription(String modelDescription) {
		this.modelDescription = modelDescription;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public FurnitureType getType() {
		return type;
	}
	public void setType(FurnitureType type) {
		this.type = type;
	}
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter modelNo: ");
		modelNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter modelName: ");
		modelName=sc.nextLine();
		
		System.out.println("Enter modelDescription: ");
		modelDescription=sc.nextLine();
		System.out.println("Enter Material: ");
		material=Material.acceptData();
		System.out.println("Enter Type: ");
		type=FurnitureType.acceptData();
		
	}
	public void showData() {
		System.out.println("Model no: "+modelNo);
		System.out.println("Model Name: "+modelName);
		System.out.println("Model Description: "+modelDescription);
		System.out.println("Material: "+material);
		System.out.println("Type: "+type);	
	}
	public static void main(String args[]) {
		Furniture f1= new Furniture();
		f1.acceptData();
		f1.showData();
	}

}
