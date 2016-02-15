package lt.egrezuva.spring.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloController {

	public String showHello() {
		return "hello from managed bean";
	}
}