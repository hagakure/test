package be.webflux.domain;

import java.math.BigInteger;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Scope(scopeName="request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Document
public class Organisation {
	@Id
	BigInteger id;
	String name;
	String codeFase;
	
	
	
	
	
	public BigInteger getId() {
		return id;
	}
	
	public void setId(BigInteger id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getCodeFase() {
		return codeFase;
	}

	public void setCodeFase(String codeFase) {
		this.codeFase = codeFase;
	}


	@Override
    public String toString() {
        return "Organisation [id=" + id + ", name=" + name + ", codeFase=" + codeFase + "]";
    }
	
	
}
