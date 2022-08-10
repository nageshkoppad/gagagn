class Choclate{
		String name;
        String flavour;
        String brand;
        int price;
		Choclate(){
			System.out.println("implicite chaining with default  constructer");
		}
		Choclate(String name){
			this();
			System.out.println("chaining with no pararmeter explicite default constructer");
			this.name=name;
		}
		Choclate(String name,String flavour){
			this(name);
			System.out.println("chaining with 1 parameter explicite default constructer ");
			this.flavour=flavour;
		}
		Choclate(String name,String flavour,String brand){
			this(name,flavour);
			System.out.println("chaining with 2 parameter explicite default constructer");
			this.brand=brand;
			

		}
		Choclate(String name,String flavour,String brand,int price){
			this(name,flavour,brand);
			System.out.println("chaining with 3 parameter explicite default constructer");
			this.price=price;
		}





}