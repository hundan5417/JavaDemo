//package Reflect;  
//   
///** 
// * 通过一个对象获得完整的包名和类名 
// * */  
//class Demo{  
//    //other codes...  
//}  
//   
//class hello{  
//    public static void main(String[] args) {  
//        Demo demo=new Demo();  
//        System.out.println(demo.getClass().getName());  
//    }  
//}  
//package Reflect;  
//class Demo{  
//    //other codes...  
//}  
//   
//class hello{  
//    public static void main(String[] args) {  
//        Class<?> demo1=null;  
//        Class<?> demo2=null;  
//        Class<?> demo3=null;  
//        try{  
//            //一般尽量采用这种形式  
//            demo1=Class.forName("Reflect.Demo");  
//        }catch(Exception e){  
//            e.printStackTrace();  
//        }  
//        demo2=new Demo().getClass();  
//        demo3=Demo.class;  
//           
//        System.out.println("类名称   "+demo1.getName());  
//        System.out.println("类名称   "+demo2.getName());  
//        System.out.println("类名称   "+demo3.getName());  
//           
//    }  
//}  
//package Reflect;
//
//import java.lang.reflect.Constructor;
//
//class Person{  
//	
//	
//       
//    public Person() {  
//           
//    }  
//    public Person(String name){  
//        this.name=name;  
//    }  
//    public Person(int age){  
//        this.age=age;  
//    }  
//    public Person(String name, int age) {  
//        this.age=age;  
//        this.name=name;  
//    }  
//   
//    public String getName() {  
//        return name;  
//    }  
//    public int getAge() {  
//        return age;  
//    }  
//    @Override  
//    public String toString(){  
//        return "["+this.name+"  "+this.age+"]";  
//    }  
//    private String name;  
//    private int age;  
//}  
//   
//class hello{  
//    public static void main(String[] args) {  
//        Class<?> demo=null;  
//        try{  
//            demo=Class.forName("Reflect.Person");  
//        }catch (Exception e) {  
//            e.printStackTrace();  
//        }  
//        Person per1=null;  
//        Person per2=null;  
//        Person per3=null;  
//        Person per4=null;  
//        //取得全部的构造函数  
//        Constructor<?> cons[]=demo.getConstructors();  
//        try{  
//            per1=(Person)cons[0].newInstance("Rollen",20);  
//            per2=(Person)cons[1].newInstance(20);  
//            per3=(Person)cons[2].newInstance("Rollen");  
//            per4=(Person)cons[3].newInstance();  
//        }catch(Exception e){  
//            e.printStackTrace();  
//        }  
//        System.out.println(per1);  
//        System.out.println(per2);  
//        System.out.println(per3);  
//        System.out.println(per4);  
//    }  
//}  
