package dto;

public class Bankdto 
{
	Integer ano;
	String cname;
	String gender;
	String branch;
	Double balance;
	public Bankdto() {
		super();
	}
	public Bankdto(String cname, String gender, String branch, Double balance) {
		super();
		this.cname = cname;
		this.gender = gender;
		this.branch = branch;
		this.balance = balance;
	}
	public Bankdto(Integer ano, String cname, String gender, String branch, Double balance) {
		super();
		this.ano = ano;
		this.cname = cname;
		this.gender = gender;
		this.branch = branch;
		this.balance = balance;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Bankdto [ano=" + ano + ", cname=" + cname + ", gender=" + gender + ", branch=" + branch + ", balance="
				+ balance + "]";
	}
	
}
