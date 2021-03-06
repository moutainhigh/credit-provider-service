package cn.entity.cm;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import cn.entity.base.Mobile;

@Document(collection="CM151")
public class CM151 extends Mobile implements Serializable {

	private static final long serialVersionUID = 5583576027918345161L;
	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public CM151(String id){
		this.id = id;
	}
}