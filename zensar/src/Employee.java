public class Employee {
	private int id=0;
	private String name;
	private double basic_salary;
	private double hra;
	private double medical;
	private double pf;
	private double pt;
	private double net_salary;
	private double gross_salary;
	
	public int getid() {
		return id;
	}
	public double get_basic_salary() {
		return basic_salary;
	}
	public double get_hra() {
		hra=basic_salary*0.5;
		return hra;
	}
	public double get_medical() {
		return medical;
	}
	public double get_pf() {
		pf=basic_salary*0.12;
		return pf;
	}
	public double get_pt() {
		pt=200;
		return pt;
	}
	public double net_salary() {
		return net_salary;
	}
	
	public String get_name() {
		return name;
	}
	
	public void calculate_gross_salary() {
		gross_salary=basic_salary+hra+medical;
	}
	public void calculate_net_salary() {
		net_salary=gross_salary-(pt+pf);
	}
	
}
