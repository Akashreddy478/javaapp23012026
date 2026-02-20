package oops230126;
	class Mainprogram {
        public static void main(String[] args) {
            encapsulation obj = new encapsulation();

            // setting values
            obj.setAge(30);
            obj.setName("akash");

            //getting values
             System.out.println(obj.getAge());
            System.out.println(obj.getName());
        }
    }


