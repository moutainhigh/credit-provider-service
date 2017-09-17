package cn.entity.cm;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import cn.entity.base.Mobile;

public class CM135 extends Mobile implements Serializable {

	private static final long serialVersionUID = 1072295382546661537L;
	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public CM135(String id){
		this.id = id;
	}
}