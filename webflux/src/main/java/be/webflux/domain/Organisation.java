package be.webflux.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Scope(scopeName="request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Document
public class Organisation {
	@Id
	long id;
	String name;
	String codeFase;
	@Override
    public String toString() {
        return "Organisation [id=" + id + ", name=" + name + ", codeFase=" + codeFase + "]";
    }
}
