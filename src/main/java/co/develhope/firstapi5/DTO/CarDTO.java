package co.develhope.firstapi5.DTO;

public class CarDTO {
	private String id;
	private String modelName;
	private Double price;
	
	
	public CarDTO(String id, String modelName, Double price) {
		this.id = id;
		this.modelName = modelName;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "CarDTO{" +
				"id='" + id + '\'' +
				", modelName='" + modelName + '\'' +
				", price=" + price +
				'}';
	}
}
