package Number_04;

public class Person implements Comparable {
	
	String name;
	int height;
	
	public Person() {
		// TODO Auto-generated constructor stub
		System.out.println("°´Ã¼»ı¼ºµÊ");
	}
	
	@Override
	public int compareTo(Object other) {
		// TODO Auto-generated method stub
		
		Person per = (Person)other;
		
		if(this.height > per.height){
			return 1;
		}
		else if(this.height < per.height){
			return -1;		
		}
		else
			return 0;
	}

	@Override
	public Object getMaximum(Person[] array) {
		// TODO Auto-generated method stub
		Person tall = array[0];
		StringBuffer a = new StringBuffer();
		for (int i = 1; i < array.length; i++) {
			if(tall.compareTo(array[i]) == -1){
				tall = array[i];
			}
			else if(tall.compareTo(array[i]) == 0){
				tall = array[i];	
			}
			if(i+1 == array.length){
				for (int j = 0; j < array.length; j++) {
					if(tall.height == array[j].height){
						a.append(array[j].name);
						a.append(" ");
					}
				}
			}
			
		}
		return "°¡ÀåÅ« Å° : "+ a;
	}
}
