package dto;

public class Transactiondto 
{
  Integer transactioid;
  String date;
  Double amount;
  String typeoftransaction;
  Integer ano;
  Double netamount;
  public Transactiondto() {
		super();
	}
  public Transactiondto(String date, Double amount, String typeoftransaction, Integer ano) {
	super();
	this.date = date;
	this.amount = amount;
	this.typeoftransaction = typeoftransaction;
	this.ano = ano;
}
  
  public Transactiondto(String date, Double amount, String typeoftransaction, Double netamount, Integer ano) {
	super();
	this.date = date;
	this.amount = amount;
	this.typeoftransaction = typeoftransaction;
	this.netamount = netamount;
	this.ano = ano;
    }

  public Transactiondto(Integer transactioid, String date, Double amount, String typeoftransaction, Double netamount)
  {
	super();
	this.transactioid = transactioid;
	this.date = date;
	this.amount = amount;
	this.typeoftransaction = typeoftransaction;
	this.netamount = netamount;
}
  

public Integer getTransactioid() {
	return transactioid;
}
public void setTransactioid(Integer transactioid) {
	this.transactioid = transactioid;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}
public String getTypeoftransaction() {
	return typeoftransaction;
}
public void setTypeoftransaction(String typeoftransaction) {
	this.typeoftransaction = typeoftransaction;
}
public Integer getAno() {
	return ano;
}
public void setAno(Integer ano) {
	this.ano = ano;
}
public Double getNetamount() {
	return netamount;
}
public void setNetamount(Double netamount) {
	this.netamount = netamount;
}
@Override
public String toString() {
	return "Transactiondto [transactioid=" + transactioid + ", date=" + date + ", amount=" + amount
			+ ", typeoftransaction=" + typeoftransaction + ", netamount=" + netamount + ", ano=" + ano + "]";
}
}
