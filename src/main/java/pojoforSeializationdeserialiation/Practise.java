package pojoforSeializationdeserialiation;

public class Practise {
	
	String name;
	String id;
	String[] mail;
	Object spouse;
	public Practise(String name, String id, String[] mail, Object spouse) {
		super();
		this.name = name;
		this.id = id;
		this.mail = mail;
		this.spouse = spouse;
	}
	
	public Practise() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String[] getMail() {
		return mail;
	}

	public void setMail(String[] mail) {
		this.mail = mail;
	}

	public Object getSpouse() {
		return spouse;
	}

	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}
	

}
