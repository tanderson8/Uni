
class Triangle {
	
	double base = 1.00;
	double height = 1.00;
	double area = 1.00;
	
	Triangle(){};
	
	Triangle(double newBase, double newHeight){
		this.base = newBase;
		this.height = newHeight;
	}
	
	double getBase() {
		return base;
	}
	
	double getHeight() {
		return height;
	}
		
	double getArea() {
		return (base * height)/ 2.00;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	}
