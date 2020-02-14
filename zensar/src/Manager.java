
public class Manager extends Employee {
	double petrol_allowance=0;
	double food_allowance=0;
	double other_allowance=0;
	Manager(){
		this.petrol_allowance=super.get_basic_salary()*0.08;
		this.food_allowance=super.get_basic_salary()*0.13;
		this.other_allowance=super.get_basic_salary()*0.03;
	}
	public void ShowDetails() {
		
	}
};

