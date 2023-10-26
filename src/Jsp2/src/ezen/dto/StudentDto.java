package ezen.dto;

public class StudentDto {
	
	private int no;
	private String name;
	private String className;
	private String dtoClass;
	
	public StudentDto() {
		super();
	}

	public StudentDto(int no, String name, String className, String dtoClass) {
		super();
		this.no = no;
		this.name = name;
		this.className = className;
		this.dtoClass = dtoClass;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getDtoClass() {
		return dtoClass;
	}

	public void setDtoClass(String dtoClass) {
		this.dtoClass = dtoClass;
	}

	@Override
	public String toString() {
		return "StudentDto [no=" + no + ", name=" + name + ", className=" + className + ", dtoClass=" + dtoClass + "]";
	}

}
