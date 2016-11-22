//package Reflect;  
//   
//class Person{  
//       
//    public String getName() {  
//        return name;  
//    }  
//    public void setName(String name) {  
//        this.name = name;  
//    }  
//    public int getAge() {  
//        return age;  
//    }  
//    public void setAge(int age) {  
//        this.age = age;  
//    }  
//    @Override  
//    public String toString(){  
//        return "["+this.name+"  "+this.age+"]";  
//    }  
//    private String name;  
//    private int age;  
//}  
//   
//class hellodemo{  
//    public static void main(String[] args) {  
//        Class<?> demo=null;  
//        try{  
//            demo=Class.forName("Reflect.Person");  
//        }catch (Exception e) {  
//            e.printStackTrace();  
//        }  
//        Person per=null;  
//        try {  
//            per=(Person)demo.newInstance();  
//        } catch (InstantiationException e) {  
//             
//            e.printStackTrace();  
//        } catch (IllegalAccessException e) {  
//            
//            e.printStackTrace();  
//        }  
//        per.setName("Rollen");  
//        per.setAge(20);  
//        System.out.println(per);  
//    }  
//} 