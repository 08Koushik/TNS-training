public class ConstructorOverloading {
        String msg;
        int num;
        ConstructorOverloading(String msg){
            this.msg=msg;
        }
        ConstructorOverloading(int num){
            this.num=num;
        }

        public static void main(String[] args){
            ConstructorOverloading ob=new ConstructorOverloading("Hello");
            System.out.println(ob.msg);
            ConstructorOverloading o=new ConstructorOverloading(10);
            System.out.println(o.num);

        }
    }


