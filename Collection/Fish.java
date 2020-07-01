package Collection;

import java.util.HashSet;

public class Fish {
    private String name;
    private double weight;
    private double price;
    
    public Fish(String name, double weigth, double price) {
	this.name = name;
	this.weight = weigth;
	this.price = price;
    }
    
    @Override
    public String toString() {
	return this.name;
    }
    
    @Override
    public int hashCode() {
	int code = 17;
	code = 31 * code + this.name.hashCode();
	code = 31 * code + (int)this.weight;
	code = 31 * code + (int)this.price;
	return code;
    }
    @Override
    public boolean equals(Object o) {
	if (o == this)
	    return true;
	if (!(o instanceof Fish)) {
	    return false;
	}
	Fish tmp = (Fish)o;
			    
	return (tmp.name.equals(this.name) && tmp.weight == this.weight && tmp.price == (this.price)); 
    }
    
    

}
